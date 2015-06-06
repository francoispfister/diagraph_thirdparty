/*
 * Copyright (c) 2007, 2010 Borland Software Corporation and others
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Borland - initial API and implementation
 */
package org.eclipse.gmf.internal.map.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.internal.common.migrate.MigrationDelegateImpl;
import org.eclipse.gmf.mappings.FeatureLabelMapping;
import org.eclipse.gmf.mappings.FeatureValueSpec;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.Language;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.ValueExpression;

class MigrationDelegate extends MigrationDelegateImpl {
	private final Map<LabelMapping, FeatureLabelMapping> myLabelMappingMigrations;
	private EAttribute myLabelMapping_ViewPattern;
	private EAttribute myLabelMapping_EditPattern;
	private EReference myLabelMapping_Features;
	private EAttribute myFeatureValueSpec_Body;
	private EAttribute myFeatureValueSpec_Language;
	
	MigrationDelegate() {
		myLabelMappingMigrations = new HashMap<LabelMapping, FeatureLabelMapping>();
	}

	void init() {
		//registerNarrowReferenceType(GMFMapPackage.eINSTANCE.getFeatureSeqInitializer_Initializers(), GMFMapPackage.eINSTANCE.getFeatureValueSpec());
		// -->
		registerNarrowedAbstractType("FeatureInitializer", GMFMapPackage.eINSTANCE.getFeatureValueSpec());
		
		//registerNarrowReferenceType(GMFMapPackage.eINSTANCE.getMappingEntry_LabelMappings(), GMFMapPackage.eINSTANCE.getFeatureLabelMapping());
		// -->
		myLabelMapping_Features = EcoreUtil.copy(GMFMapPackage.eINSTANCE.getFeatureLabelMapping_Features());
		myLabelMapping_ViewPattern = EcoreUtil.copy(GMFMapPackage.eINSTANCE.getFeatureLabelMapping_ViewPattern());
		myLabelMapping_EditPattern = EcoreUtil.copy(GMFMapPackage.eINSTANCE.getFeatureLabelMapping_EditPattern());
		{
			Map<String, EStructuralFeature> renamings = new HashMap<String, EStructuralFeature>();
			renamings.put(myLabelMapping_ViewPattern.getName(), myLabelMapping_ViewPattern);
			renamings.put(myLabelMapping_EditPattern.getName(), myLabelMapping_EditPattern);
			renamings.put(myLabelMapping_Features.getName(), myLabelMapping_Features);
			registerRenamedAttributes(GMFMapPackage.eINSTANCE.getLabelMapping(), renamings);
		}
		
		myFeatureValueSpec_Body = EcoreUtil.copy(GMFMapPackage.eINSTANCE.getValueExpression_Body());
		myFeatureValueSpec_Language = EcoreUtil.copy(GMFMapPackage.eINSTANCE.getValueExpression_Language());
		{
			Map<String, EStructuralFeature> renamings = new HashMap<String, EStructuralFeature>();
			renamings.put(myFeatureValueSpec_Body.getName(), myFeatureValueSpec_Body);
			renamings.put(myFeatureValueSpec_Language.getName(), myFeatureValueSpec_Language);
			registerRenamedAttributes(GMFMapPackage.eINSTANCE.getFeatureValueSpec(), renamings);
		}
	}

	@Override
	public boolean setValue(EObject object, EStructuralFeature feature, Object value, int position) {
		if (myLabelMapping_ViewPattern.equals(feature)) {
			LabelMapping mapping = (LabelMapping) object;
			String viewPattern = (String) value;
			FeatureLabelMapping migratedMapping = saveFeatureLabelMappingFor(mapping);
			migratedMapping.setViewPattern(viewPattern);
			fireMigrationApplied(true);
		} else if (myLabelMapping_EditPattern.equals(feature)) {
			LabelMapping mapping = (LabelMapping) object;
			String editPattern = (String) value;
			FeatureLabelMapping migratedMapping = saveFeatureLabelMappingFor(mapping);
			migratedMapping.setViewPattern(editPattern);
			fireMigrationApplied(true);
		} else if (myLabelMapping_Features.equals(feature)) {
			LabelMapping mapping = (LabelMapping) object;
			EAttribute attribute = (EAttribute) value;
			FeatureLabelMapping migratedMapping = saveFeatureLabelMappingFor(mapping);
			migratedMapping.getFeatures().add(attribute);
			fireMigrationApplied(true);
		} else if (myFeatureValueSpec_Body.equals(feature)) {
			FeatureValueSpec featureRef = (FeatureValueSpec) object;
			String body = (String) value;
			ValueExpression constraint = getOrCreateValueExpression(featureRef);
			constraint.setBody(body);
			fireMigrationApplied(true);
		} else if (myFeatureValueSpec_Language.equals(feature)) {
			FeatureValueSpec featureRef = (FeatureValueSpec) object;
			ValueExpression constraint = getOrCreateValueExpression(featureRef);
			Language lang = Language.get((String) value);
			constraint.setLanguage(lang);
			fireMigrationApplied(true);
		} else {
			// other cases are would be processed as defaults
			return super.setValue(object, feature, value, position);
		}
		return true;
	}

	private ValueExpression getOrCreateValueExpression(FeatureValueSpec featureRef) {
		ValueExpression constraint = featureRef.getValue();
		if (constraint == null) {
			constraint = GMFMapFactory.eINSTANCE.createValueExpression();
			featureRef.setValue(constraint);
		}
		return constraint;
	}

	private FeatureLabelMapping saveFeatureLabelMappingFor(LabelMapping labelMapping) {
		FeatureLabelMapping migrated = myLabelMappingMigrations.get(labelMapping);
		if (migrated == null) {
			migrated = GMFMapFactory.eINSTANCE.createFeatureLabelMapping();
			myLabelMappingMigrations.put(labelMapping, migrated);
		}
		return migrated;
	}
	
	@Override
	public void preResolve() {
		for (LabelMapping mapping : myLabelMappingMigrations.keySet()) {
			FeatureLabelMapping migrated = myLabelMappingMigrations.get(mapping);
			if (!migrated.getFeatures().isEmpty()) {
				MappingEntry entry = mapping.getMapEntry();
				EList<LabelMapping> labelMappings = entry.getLabelMappings();
				int originalIndex = labelMappings.indexOf(mapping);
				if (originalIndex != -1) {
					migrated.setDiagramLabel(mapping.getDiagramLabel());
					if (mapping.isReadOnly()) {
						migrated.setReadOnly(true);
					}
					labelMappings.set(originalIndex, migrated);
				}
			}
		}
	}
}
