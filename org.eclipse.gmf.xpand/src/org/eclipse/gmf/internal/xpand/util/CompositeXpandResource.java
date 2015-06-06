/*
 * Copyright (c) 2007, 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     bblajer - initial API and implementation
 *     Artem Tikhomirov (Borland) - Migration to OCL expressions
 */
package org.eclipse.gmf.internal.xpand.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.ast.Advice;
import org.eclipse.gmf.internal.xpand.model.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.model.ExecutionContextImpl;
import org.eclipse.gmf.internal.xpand.model.Scope;
import org.eclipse.gmf.internal.xpand.model.StatefulResource;
import org.eclipse.gmf.internal.xpand.model.XpandAdvice;
import org.eclipse.gmf.internal.xpand.model.XpandDefinition;
import org.eclipse.gmf.internal.xpand.model.ExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandResource;

/**
 * Composes several Xpand ast trees into a single resource. Definitions are merged: 
 * if definitions with duplicate signatures are found, the one that comes first (i.e., from a more recent source) wins. 
 * Advice declarations are aggregated: if several advice declarations have the same signature, all are returned in the order
 * in which they are declared.
 */
class CompositeXpandResource implements XpandResource, StatefulResource {
	private final XpandResource[] myDefinitions;
	private final XpandResource[] myAdvices;
	private XpandAdvice[] myCachedAdvices;
	private XpandDefinition[] myCachedDefinitions;
	private String[] myImportedNamespaces;
	private String[] myImportedExtensions;

	/**
	 * Creates a composite resource from a non-empty array of definition resources and optional advice resources.
	 * @param manager Resource manager used to create this resource. It will not be remembered by the resource.
	 * @param definitions an array of definition resources. Must not be empty.
	 * @param advices an array of advice resources or <code>null</code> if no advice resources are available.
	 */
	public CompositeXpandResource(ResourceManager manager, XpandResource[] definitions, XpandResource[] advices) {
		myDefinitions = definitions;
		myAdvices = advices == null ? NO_RESOURCES : advices;
	}
	
	public void initialize(Scope scope) {
		ArrayList<XpandDefinition> allDefinitions = new ArrayList<XpandDefinition>();
		HashSet<DefinitionSignature> signatures = new HashSet<DefinitionSignature>();
		ExecutionContext context = new ExecutionContextImpl(scope);
		// Definitions are merged in the following order: first, all advice
		// resources from newest to oldest, then all
		// non-advice resources, from newest to oldest.
		mergeDefinitions(context, myAdvices, allDefinitions, signatures);
		mergeDefinitions(context, myDefinitions, allDefinitions, signatures);
		myCachedDefinitions = allDefinitions.toArray(new XpandDefinition[allDefinitions.size()]);
		// Advice declarations are collected (without merging) in the order from
		// oldest to newest.
		// Only advice resources are taken into consideration.
		if (myAdvices.length > 0) {
			ArrayList<XpandAdvice> allAdvices = new ArrayList<XpandAdvice>();
			collectAdvices(myAdvices, allAdvices);
			myCachedAdvices = allAdvices.toArray(new XpandAdvice[allAdvices.size()]);
		} else {
			myCachedAdvices = NO_ADVICE;
		}
	}
	
	public boolean isInitialized() {
		return myCachedDefinitions != null && myCachedAdvices != null;
	}

	private void mergeDefinitions(ExecutionContext context, XpandResource[] resources, List<XpandDefinition> collector, Set<DefinitionSignature> usedSignatures) {
		for (int i = 0; i < resources.length; i++) {
			XpandResource nextResource = resources[i];
			context = context.cloneWithResource(nextResource);
			XpandDefinition[] definitions = nextResource.getDefinitions();
			for (XpandDefinition nextDefinition : definitions) {
				DefinitionSignature signature = DefinitionSignature.create(context, nextDefinition);
				if (signature == null || usedSignatures.contains(signature)) {
					continue;
				}
				usedSignatures.add(signature);
				collector.add(nextDefinition);
			}
		}
	}

	private void collectAdvices(XpandResource[] resources, List<XpandAdvice> collector) {
		for (int i = resources.length - 1; i >= 0; i--) {
			XpandResource nextResource = resources[i];
			XpandAdvice[] advices = nextResource.getAdvices();
			for (XpandAdvice nextAdvice : advices) {
				collector.add(nextAdvice);
			}
		}
	}

	public XpandAdvice[] getAdvices() {
		if (!isInitialized()) {
			throw new IllegalStateException("Stateful resource " + getFullyQualifiedName() + " was not initialized");
		}
		return myCachedAdvices;
	}

	public XpandDefinition[] getDefinitions() {
		if (!isInitialized()) {
			throw new IllegalStateException("Stateful resource " + getFullyQualifiedName() + " was not initialized");
		}
		return myCachedDefinitions;
	}

	public String getFullyQualifiedName() {
		return myDefinitions[0].getFullyQualifiedName();
	}

	public String[] getImportedExtensions() {
		if (myImportedExtensions == null) {
			LinkedHashSet<String> result = new LinkedHashSet<String>();
			for (XpandResource nextResource : myDefinitions) {
				for (String nextImport : nextResource.getImportedExtensions()) {
					result.add(nextImport);
				}
			}
			for (XpandResource nextResource : myAdvices) {
				for (String nextImport : nextResource.getImportedExtensions()) {
					result.add(nextImport);
				}
			}
			myImportedExtensions = result.toArray(new String[result.size()]);
		}
		return myImportedExtensions;
	}

	public String[] getImportedNamespaces() {
		if (myImportedNamespaces == null) {
			LinkedHashSet<String> result = new LinkedHashSet<String>();
			for (XpandResource nextResource : myDefinitions) {
				for (String nextImport : nextResource.getImportedNamespaces()) {
					result.add(nextImport);
				}
			}
			for (XpandResource nextResource : myAdvices) {
				for (String nextImport : nextResource.getImportedNamespaces()) {
					result.add(nextImport);
				}
			}
			myImportedNamespaces = result.toArray(new String[result.size()]);
		}
		return myImportedNamespaces;
	}

	public void analyze(ExecutionContext ctx, Set<AnalysationIssue> issues) {
		for (XpandResource next : myDefinitions) {
			next.analyze(ctx, issues);
		}
		for (XpandResource next : myAdvices) {
			next.analyze(ctx, issues);
		}
	}

	private static final XpandResource[] NO_RESOURCES = new XpandResource[0];
	private static final Advice[] NO_ADVICE = new Advice[0];
}
