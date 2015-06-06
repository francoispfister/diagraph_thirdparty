/*
 * Copyright (c) 2005, 2008 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 */
package org.eclipse.gmf.internal.xpand.codeassist;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.gmf.internal.xpand.expression.codeassist.ProposalComputer;
import org.eclipse.gmf.internal.xpand.expression.codeassist.ProposalFactory;
import org.eclipse.gmf.internal.xpand.model.ExecutionContext;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class KeywordProposalComputer implements ProposalComputer {

	private final String textPastInsertionPoint;
	private final ProposalFactory proposalFactory;

	public KeywordProposalComputer(String textPastInsertionPoint, ProposalFactory factory) {
		this.textPastInsertionPoint = textPastInsertionPoint;
		assert factory != null;
		proposalFactory = factory;
	}

    public List<ICompletionProposal> computeProposals(final String txt, final ExecutionContext ctx) {
        final String prefix = getPrefix(txt);
        final List<ICompletionProposal> result = new ArrayList<ICompletionProposal>();
        if (prefix.length() > 0 || txt.endsWith(XpandTokens.LT)) {
        	final boolean needsRT = !textPastInsertionPoint.trim().startsWith(XpandTokens.RT);
	        final String[] kw = XpandTokens.allKeywords();
	        for (final String string : kw) {
	            if (string.toLowerCase().startsWith(prefix.toLowerCase())) {
	            	String insertString = string;
	            	if (!string.startsWith("END")) {
	            		insertString += " ";
	            	} else if (needsRT) {
	            		insertString += XpandTokens.RT;
	            	}
	                result.add(proposalFactory.createKeywordProposal(insertString, string, prefix));
	            }
	        }
        }
        return result;
    }

    private final static Pattern PREFIX = Pattern.compile("([A-Z]+)\\z");

    private String getPrefix(final String txt) {
        final Matcher m = PREFIX.matcher(txt);
        if (m.find()) {
			return m.group(1);
		}
        return "";
    }

}
