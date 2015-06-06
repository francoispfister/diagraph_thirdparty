/*******************************************************************************
 * Copyright (c) 2007, 2009 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.runtime.launch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.common.MDAConstants;
import org.eclipse.m2m.internal.qvt.oml.common.launch.IQvtLaunchConstants;
import org.eclipse.m2m.internal.qvt.oml.common.launch.TargetUriData;
import org.eclipse.m2m.internal.qvt.oml.common.launch.TargetUriData.TargetType;
import org.eclipse.m2m.internal.qvt.oml.library.Context;
import org.eclipse.m2m.internal.qvt.oml.runtime.QvtRuntimePlugin;
import org.eclipse.m2m.internal.qvt.oml.runtime.util.MiscUtil;


public class QvtLaunchUtil {
	private QvtLaunchUtil() {}

	public static ILaunchConfigurationType getInMemoryLaunchConfigurationType() {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
        ILaunchConfigurationType type = manager.getLaunchConfigurationType(InMemoryQvtLaunchConfigurationDelegate.LAUNCH_CONFIGURATION_TYPE_ID);
        if (type == null) {
            throw new RuntimeException("No launch configuration for id " + InMemoryQvtLaunchConfigurationDelegate.LAUNCH_CONFIGURATION_TYPE_ID); //$NON-NLS-1$
        }
		return type;
	}
	
	public static List<TargetUriData> getTargetUris(ILaunchConfiguration configuration) throws CoreException {
    	int elemCount = configuration.getAttribute(IQvtLaunchConstants.ELEM_COUNT, 0);
		List<TargetUriData> targetUris = new ArrayList<TargetUriData>(elemCount);
    	for (int i = 0; i < elemCount; ++i) {
    		TargetUriData targetData = QvtLaunchUtil.getTargetUriData(configuration, i+1);
    		targetUris.add(targetData);
    	}
    	return targetUris;
	}
		
	public static String getTransformationURI(ILaunchConfiguration configuration) throws CoreException {
		String uriStr = configuration.getAttribute(IQvtLaunchConstants.MODULE, (String) null);
		if(uriStr == null) {
			// FIXME - why 2 ways of URI reference? legacy reasons?			
			uriStr = configuration.getAttribute(IQvtLaunchConstants.TRANSFORMATION, (String) null);
		}
		return uriStr;
	}
	
	public static String getTraceFileURI(ILaunchConfiguration configuration) throws CoreException {
		return configuration.getAttribute(IQvtLaunchConstants.TRACE_FILE, (String) null);
	}	
	
	public static boolean shouldGenerateTraceFile(ILaunchConfiguration configuration) throws CoreException {
		return configuration.getAttribute(IQvtLaunchConstants.USE_TRACE_FILE, false);
	}
	
    public static TargetUriData getTargetUriData(ILaunchConfiguration configuration, int index) throws CoreException {
    	TargetUriData.TargetType targetType = TargetUriData.TargetType.NEW_MODEL;
    	try {
   	        targetType = TargetType.valueOf(configuration.getAttribute(getIndexedName(IQvtLaunchConstants.TARGET_TYPE, index), "NEW_MODEL")); //$NON-NLS-1$
    	}
    	catch (Exception e) {
    		targetType = TargetUriData.TargetType.NEW_MODEL;
    	}
    	
        String uri = configuration.getAttribute(getIndexedName(IQvtLaunchConstants.TARGET_MODEL, index), ""); //$NON-NLS-1$
    	String feature = configuration.getAttribute(getIndexedName(IQvtLaunchConstants.FEATURE_NAME, index), ""); //$NON-NLS-1$
    	boolean clearContents = configuration.getAttribute(getIndexedName(IQvtLaunchConstants.CLEAR_CONTENTS, index), true); 
    	
    	return new TargetUriData(targetType, uri, feature, clearContents);
    }
    
    public static void saveTargetUriData(ILaunchConfigurationWorkingCopy configuration, List<TargetUriData> targetData) {
        int index = 1;
        for (TargetUriData targetUri : targetData) {
    		QvtLaunchUtil.saveTargetUriData(configuration, targetUri, index);
    		++index;
        }
    }
    
    public static void saveTargetUriData(ILaunchConfigurationWorkingCopy configuration, TargetUriData targetData, int index) {
    	configuration.setAttribute(getIndexedName(IQvtLaunchConstants.TARGET_TYPE, index), targetData.getTargetType().toString()); 
		configuration.setAttribute(getIndexedName(IQvtLaunchConstants.TARGET_MODEL, index), targetData.getUriString()); 
    	configuration.setAttribute(getIndexedName(IQvtLaunchConstants.FEATURE_NAME, index), targetData.getFeature()); 
    	configuration.setAttribute(getIndexedName(IQvtLaunchConstants.CLEAR_CONTENTS, index), targetData.isClearContents()); 
    }
    
    public static String getTraceFileName(URI uri) {
        IFile file = org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils.getFile(uri);
        if(file == null) {
            return null;
        }
        
        IPath traceFilePath = new Path(file.getParent().getFullPath() + "/" + file.getName() + MDAConstants.QVTO_TRACEFILE_EXTENSION_WITH_DOT);  //$NON-NLS-1$
        return URI.createPlatformResourceURI(traceFilePath.toOSString().toString(), false).toString();
    }
    
    public static Map<String, Object> getConfigurationProperty(ILaunchConfiguration configuration) {
        return loadConfigurationProperties(configuration);
    }
    
    public static Context createContext(ILaunchConfiguration configuration) {
    	Map<String, Object> configProps = getConfigurationProperty(configuration);
    	return createContext(configProps);
    }

	public static Context createContext(Map<String, Object> configProps) {
		Context context = new Context();
		if (configProps != null) {
	    	for (String name : configProps.keySet()) {
				context.setConfigProperty(name, configProps.get(name));
			}
		}
        return context;
	}
    

    @SuppressWarnings("unchecked")
    public static Map<String, Object> loadConfigurationProperties(ILaunchConfiguration configuration) {
        Map map;
        try {
            map = configuration.getAttribute(IQvtLaunchConstants.CONFIGURATION_PROPERTIES, Collections.<String, String>emptyMap());            
        } catch (CoreException e) {
            map = Collections.<String, String>emptyMap();
            QvtRuntimePlugin.getDefault().getLog().log(MiscUtil.makeErrorStatus(e)); 
        }
        return map;
    }


    
    private static String getIndexedName(String name, int index){
    	if (index == 0) {
    		return name;
    	}
    	return name + index;
    }
    
}

