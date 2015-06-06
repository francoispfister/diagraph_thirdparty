/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.model;

import org.eclipse.gmf.internal.xpand.StreamsHolder;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;

/**
 * @author Sven Efftinge
 */
public interface Output {
    public void write(String text);

    public void enterStatement(SyntaxElement stmt);

    public void exitStatement(SyntaxElement stmt);

    public void openFile(String path, String outletName);

    public void closeFile();

    public StreamsHolder getNamedStreams();
}
