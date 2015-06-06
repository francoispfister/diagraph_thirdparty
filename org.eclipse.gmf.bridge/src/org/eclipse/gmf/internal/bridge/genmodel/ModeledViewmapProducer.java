 /**
 * Copyright (c) 2014 Laboratoire de Genie Informatique et Ingenierie de Production - Ecole des Mines d'Ales
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Francois Pfister (ISOE-LGI2P) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.genmodel;

import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.ModeledViewmap;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramElement;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Node;

public class ModeledViewmapProducer extends DefaultViewmapProducer {

	@Override
	public Viewmap create(Canvas canvasElement) {
		ModeledViewmap result = GMFGenFactory.eINSTANCE.createModeledViewmap();
		result.setFigureModel(canvasElement);
		return result;
	}

	@Override
	public Viewmap create(Node node) {
		Viewmap viewmap = createModeledViewmap(node);
		setupResizeConstraints(viewmap, node);
		setupLayoutType(viewmap, node);
		setupDefaultSize(viewmap, node);
		return viewmap;
	}

	@Override
	public Viewmap create(Connection link) {
		return createModeledViewmap(link);
	}

	@Override
	public Viewmap create(Compartment compartment) {
		return createModeledViewmap(compartment);
	}

	@Override
	public Viewmap create(DiagramLabel label) {
		return createModeledViewmap(label);
	}

	@Override
	public String[] dependencies() {
		return new String[0];
	}

	private ModeledViewmap createModeledViewmap(DiagramElement diagramElement) {
		ModeledViewmap result = GMFGenFactory.eINSTANCE.createModeledViewmap();
		result.setFigureModel(diagramElement);
		if (diagramElement.getFigure() != null && diagramElement.getFigure().getActualFigure() != null) {
			setupStyleAttributes(result, diagramElement.getFigure().getActualFigure());
		}
		return result;
	}

}
