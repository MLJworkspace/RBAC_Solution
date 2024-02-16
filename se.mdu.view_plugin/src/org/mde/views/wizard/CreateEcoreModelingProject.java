package org.mde.views.wizard;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.internal.ide.filesystem.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ProjectConfigurator;

@SuppressWarnings("restriction")
public class CreateEcoreModelingProject {

	  public static void createProjectWithNaturesAndStructure(String projectName) throws CoreException {
	        // Create a new Eclipse project
	        IProject project = createEclipseProject(projectName);

	        // Add natures to the project
	        addNaturesToProject(project);

	        // Create project folders
	        createProjectFolders(project,projectName);

	        // Create .project file
	        createDotProjectFile(project, projectName);

	        // Create .classpath file
	        createDotClasspathFile(project);
	    }

	    private static IProject createEclipseProject(String projectName) throws CoreException {
	        // Get the workspace root
	        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

	        // Create the project description
	        IProject project = root.getProject(projectName);
	        IProjectDescription description = project.getWorkspace().newProjectDescription(projectName);
	        description.setLocation(null);

	        // Create the project
	        if (!project.exists()) {
	            project.create(description, null);
	        }
	        if (!project.isOpen()) {
	            project.open(null);
	        }

	        return project;
	    }

	    private static void addNaturesToProject(IProject project) throws CoreException {
	        // Get the project description
	        IProjectDescription description = project.getDescription();

	        // Add Java Nature
	        String[] natures = description.getNatureIds();
	        String[] newNatures;

	        if (natures == null) {
	            // If natures array is null, initialize it with zero elements
	            newNatures = new String[2];
	        } else {
	            // Copy existing natures
	            newNatures = new String[natures.length + 3];
	            System.arraycopy(natures, 0, newNatures, 0, natures.length);
	        }

	        // Add Sirius Modeling Project Nature
	        newNatures[newNatures.length - 3] = "org.eclipse.sirius.nature.modelingproject";

	        // Add Java Nature
	        newNatures[newNatures.length - 2] = JavaCore.NATURE_ID;

	        // Add PDE Nature
	        newNatures[newNatures.length - 1] = "org.eclipse.pde.PluginNature";

	        // Set the updated natures
	        description.setNatureIds(newNatures);
	        project.setDescription(description, null);
	    }

	    private static void createProjectFolders(IProject project, String projectName) throws CoreException {
	        IFolder metaInfFolder = project.getFolder("META-INF");
	        IFolder srcFolder = project.getFolder("src");
	        IFolder modelFolder = project.getFolder("model");

	        // Create folders if they don't exist
	        if (!metaInfFolder.exists()) {
	            metaInfFolder.create(false, true, null);
	            createMetaInfManifestFile(project, projectName);
	        }
	        if (!srcFolder.exists()) {
	            srcFolder.create(false, true, null);
	        }
	        if (!modelFolder.exists()) {
	            modelFolder.create(false, true, null);
	        }
	    }

	    private static void createDotProjectFile(IProject project, String projectName) throws CoreException {
	        String dotProjectContents = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
	                "<projectDescription>\n" +
	                "	<name>" + projectName + "</name>\n" +
	                "	<comment></comment>\n" +
	                "	<projects>\n" +
	                "	</projects>\n" +
	                "	<buildSpec>\n" +
	                "		<buildCommand>\n" +
	                "			<name>org.eclipse.jdt.core.javabuilder</name>\n" +
	                "			<arguments>\n" +
	                "			</arguments>\n" +
	                "		</buildCommand>\n" +
	                "		<buildCommand>\n" +
	                "			<name>org.eclipse.pde.ManifestBuilder</name>\n" +
	                "			<arguments>\n" +
	                "			</arguments>\n" +
	                "		</buildCommand>\n" +
	                "		<buildCommand>\n" +
	                "			<name>org.eclipse.pde.SchemaBuilder</name>\n" +
	                "			<arguments>\n" +
	                "			</arguments>\n" +
	                "		</buildCommand>\n" +
	                "	</buildSpec>\n" +
	                "	<natures>\n" +
	                "		<nature>org.eclipse.sirius.nature.modelingproject</nature>\n" +
	                "		<nature>org.eclipse.jdt.core.javanature</nature>\n" +
	                "		<nature>org.eclipse.pde.PluginNature</nature>\n" +
	                "	</natures>\n" +
	                "</projectDescription>";

	        IFile dotProjectFile = project.getFile(".project");
	        if (!dotProjectFile.exists()) {
	            dotProjectFile.create(new ByteArrayInputStream(dotProjectContents.getBytes(StandardCharsets.UTF_8)), true, null);
	        } else {
	            // Update the existing .project file to ensure the desired order of natures
	            dotProjectFile.setContents(new ByteArrayInputStream(dotProjectContents.getBytes(StandardCharsets.UTF_8)), IFile.FORCE, null);
	        }
	    }

	    private static void createDotClasspathFile(IProject project) throws CoreException {
	        String dotClasspathContents = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
	                "<classpath>\n" +
	                "	<classpathentry kind=\"src\" path=\"src\"/>\n" +
	                "	<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-11\"/>\n" +
	                "	<classpathentry kind=\"con\" path=\"org.eclipse.pde.core.requiredPlugins\"/>\n" +
	                "	<classpathentry kind=\"output\" path=\"bin\"/>\n" +
	                "</classpath>";

	        IFile dotClasspathFile = project.getFile(".classpath");
	        if (!dotClasspathFile.exists()) {
	            dotClasspathFile.create(new ByteArrayInputStream(dotClasspathContents.getBytes(StandardCharsets.UTF_8)), true, null);
	        }
	    }
	    private static void createMetaInfManifestFile(IProject project, String projectName) throws CoreException {
	        IFolder metaInfFolder = project.getFolder("META-INF");
	        IFile manifestFile = metaInfFolder.getFile("MANIFEST.MF");

	        String manifestContents = "Manifest-Version: 1.0\n" +
	                "Bundle-ManifestVersion: 2\n" +
	                "Bundle-Name: " + projectName + "\n" +
	                "Bundle-SymbolicName: " + projectName + "; singleton:=true\n" +
	                "Bundle-Version: 0.1.0.qualifier\n" +
	                "Require-Bundle: org.eclipse.emf.ecore;visibility:=reexport,\n" +
	                " org.eclipse.core.runtime\n";

	        if (!manifestFile.exists()) {
	            try (InputStream manifestStream = new ByteArrayInputStream(manifestContents.getBytes(StandardCharsets.UTF_8))) {
	                manifestFile.create(manifestStream, true, null);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    public static IProject getProject(String projectName) {
	        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	        IProject project = root.getProject(projectName);
	        return project;
	    }
	}