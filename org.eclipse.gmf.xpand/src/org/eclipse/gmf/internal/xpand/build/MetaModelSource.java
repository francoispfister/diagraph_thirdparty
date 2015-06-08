package org.eclipse.gmf.internal.xpand.build;

import org.eclipse.emf.ecore.EPackage;

public interface MetaModelSource {
    //xyz
	public EPackage find(String nsURI);
	public EPackage[] all();
}
