package org.mde.views.transformations;

import java.io.ByteArrayInputStream;

import java.io.InputStream;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class QVToCreateProject {
	
	public void createProject(String projectName) {
	    try {
	        IWorkspace workspace = ResourcesPlugin.getWorkspace();
	        IProject project = workspace.getRoot().getProject(projectName);
	        if (!project.exists()) {
	            // Create the project if it doesn't exist
	            IProjectDescription description = workspace.newProjectDescription(project.getName());
	            description.setNatureIds(new String[] { "org.eclipse.m2m.qvt.oml.project.QVTONature" });
	            project.create(description, null);
	            project.open(null);

	            // Create the transforms folder
	            IFolder transformsFolder = project.getFolder("transforms");
	            if (!transformsFolder.exists()) {
	                transformsFolder.create(true, true, null);
	            }

	            // Create the build.properties file
	            IFile buildFile = project.getFile("build.properties");
	            String buildFileContent = "bin.includes = META-INF/,\\\ntransforms/,\\\nplugin.xml\n";
	            InputStream buildFileContentStream = new ByteArrayInputStream(buildFileContent.getBytes());
	            buildFile.create(buildFileContentStream, true, null);

	            // Create the plugin.xml file
	            IFile pluginFile = project.getFile("plugin.xml");
	            String pluginFileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<plugin>\n<extension point=\"org.eclipse.m2m.qvt.oml.runtime.qvtTransformationContainer\">\n<sourceContainer path=\"transforms\">\n</sourceContainer>\n</extension>\n</plugin>\n";
	            InputStream pluginFileContentStream = new ByteArrayInputStream(pluginFileContent.getBytes());
	            pluginFile.create(pluginFileContentStream, true, null);

	            // Create the META-INF folder and MANIFEST.MF file
	            IFolder metaInfFolder = project.getFolder("META-INF");
	            if (!metaInfFolder.exists()) {
	                metaInfFolder.create(true, true, null);
	            }
	            IFile manifestFile = metaInfFolder.getFile("MANIFEST.MF");
	            String manifestFileContent = "Manifest-Version: 1.0\nBundle-ManifestVersion: 2\nBundle-Name: " + projectName + " Plug-in\nBundle-SymbolicName: " + projectName.toLowerCase() + ";singleton:=true\nBundle-Version: 0.1.0.qualifier\nRequire-Bundle: org.eclipse.core.runtime;bundle-version=\"0.0.0\"\nBundle-ActivationPolicy: lazy\n";
	            InputStream manifestFileContentStream = new ByteArrayInputStream(manifestFileContent.getBytes());
	            manifestFile.create(manifestFileContentStream, true, null);
	        } else {
	            // If it exists, just open it
	            project.open(null);
	        }
	    } catch (CoreException e) {
	        // Log or rethrow the exception, as appropriate for your application
	        e.printStackTrace();
	    }
	}
}