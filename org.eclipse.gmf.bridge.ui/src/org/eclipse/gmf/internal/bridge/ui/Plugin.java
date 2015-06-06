/*
 * Copyright (c) 2005, 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.ui;

import java.text.MessageFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.internal.bridge.resolver.ContainmentClosure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Plugin extends AbstractUIPlugin {

	public static final String CHECKED_ICON = "/icons/cview16/checked.gif"; //$NON-NLS-1$

	public static final String UNCHECKED_ICON = "/icons/cview16/unchecked.gif"; //$NON-NLS-1$

	public static final String GRAYED_ICON = "/icons/cview16/grayed.gif"; //$NON-NLS-1$

	public static final String NODE_ICON = "/icons/cview16/node.gif"; //$NON-NLS-1$

	public static final String LINK_ICON = "/icons/cview16/link.gif"; //$NON-NLS-1$

	public static final String LABEL_ICON = "/icons/cview16/label.gif"; //$NON-NLS-1$

	private static Plugin plugin;
	private ContainmentClosure myContainmentClosure;

	public Plugin() {
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		if (myContainmentClosure != null) {
			myContainmentClosure = null;
		}
		super.stop(context);
		plugin = null;
	}

	public ContainmentClosure getContaintmentClosure() {
		if (myContainmentClosure == null) {
			myContainmentClosure = new ContainmentClosure();
		}
		return myContainmentClosure;
	}

	public static IStatus createStatus(int statusCode, String message, Throwable ex) {
		return new Status(statusCode, getPluginID(), 0, message, ex);
	}

	public static IStatus createError(String message, Throwable ex) {
		return createStatus(IStatus.ERROR, message, ex);
	}

	public static IStatus createWarning(String message) {
		return createStatus(IStatus.WARNING, message, null);
	}

	public static IStatus createInfo(String message) {
		return createStatus(IStatus.INFO, message, null);
	}

	public static IStatus createCancel(String message) {
		return createStatus(IStatus.CANCEL, message, null);
	}

	public static Plugin getDefault() {
		return plugin;
	}
	
	public static String getBundleString(String key) {
		return Platform.getResourceBundle(getDefault().getBundle()).getString(key);
	}

	public static String getBundleString(String key, Object[] args) {
		String val = getBundleString(key);
		if (val == null) {
			return key;
		}
		return MessageFormat.format(val, args);
	}

	protected void initializeImageRegistry(ImageRegistry reg) {
		loadImage(reg, CHECKED_ICON);
		loadImage(reg, UNCHECKED_ICON);
		loadImage(reg, GRAYED_ICON);
		loadImage(reg, NODE_ICON);
		loadImage(reg, LINK_ICON);
		loadImage(reg, LABEL_ICON);
	}

	protected void loadImage(ImageRegistry registry, String id) {
		loadImage(registry, id, getBundle().getSymbolicName());
	}

	protected void loadImage(ImageRegistry registry, String id, String bundleId) {
		ImageDescriptor descriptor = imageDescriptorFromPlugin(bundleId, id);
		if (descriptor != null) {
			registry.put(id, descriptor);
		}
	}

	public static void log(CoreException ex) {
		log(ex.getStatus());
	}

	public static void log(Exception ex) {
		if (ex instanceof CoreException) {
			log((CoreException) ex);
		} else {
			log(createError(ex.getMessage(), ex));
		}
	}

	public static String getPluginID() {
		return getDefault().getBundle().getSymbolicName();
	}

	public static void log(IStatus s) {
		getDefault().getLog().log(s);
	}

	public static boolean needsReconcile() {
		// no need to check for null, default value is true 
		return !Boolean.FALSE.toString().equals(Platform.getDebugOption(getPluginID() + "/reconcile")); //$NON-NLS-1$
	}

	public static boolean ignoreDanglingHrefOnSave() {
		String v = Platform.getDebugOption(getPluginID() + "/transform/ignore-dangling-on-save"); //$NON-NLS-1$
		return v != null && !Boolean.FALSE.toString().equals(v);
	}
	public static boolean printTransformationConsole() {
		String v = Platform.getDebugOption(getPluginID() + "/transform/print-qvto-console"); //$NON-NLS-1$
		return v != null && !Boolean.FALSE.toString().equals(v);
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path.
	 * 
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(getPluginID(), path);
	}
}
