/*
 * Copyright (c) 2005, 2010 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 */
package org.eclipse.gmf.internal.xpand.expression.codeassist;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.internal.xpand.xtend.ast.GenericExtension;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public interface ProposalFactory {
    public ICompletionProposal createPropertyProposal(EStructuralFeature p, String prefix, boolean onCollection);

    public ICompletionProposal createOperationProposal(EOperation p, String prefix, boolean onCollection);

    public ICompletionProposal createCollectionSpecificOperationProposal(String insertString, String displayString, String prefix, int cursor, int marked);

    public ICompletionProposal createExtensionProposal(GenericExtension p, String prefix);

    public ICompletionProposal createExtensionOnMemberPositionProposal(GenericExtension p, String prefix, boolean onCollection);

    public ICompletionProposal createVariableProposal(String varName, String typeName, String prefix);

    public ICompletionProposal createTypeProposal(String insertString, String displayString, String prefix);

    public ICompletionProposal createStatementProposal(String insertString, String displayString, String prefix, int cursor, int marked);

    public ICompletionProposal createStatementProposal(String insertString, String displayString, String prefix);

    public ICompletionProposal createKeywordProposal(String insertString, String displayString, String prefix);

}
