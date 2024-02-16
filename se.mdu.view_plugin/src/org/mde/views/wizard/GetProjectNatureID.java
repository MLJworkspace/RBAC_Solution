package org.mde.views.wizard;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;

public class GetProjectNatureID {

    public static void main(String[] args) {
        // Replace "YourProjectName" with the name of your project
        String projectName = "org.eclipse.sirius.sample.basicfamily";

        // Get the IProject object for the specified project name
        IProject project = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

        // Check if the project exists
        if (project.exists()) {
            try {
                // Get the project description
                IProjectDescription projectDescription = project.getDescription();

                // Get the array of nature IDs
                String[] natureIds = projectDescription.getNatureIds();

                // Print the nature IDs
                for (String natureId : natureIds) {
                    System.out.println("Nature ID: " + natureId);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Project does not exist: " + projectName);
        }
    }
}
