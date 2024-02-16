package org.mde.views.wizard;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class ModelSelectionDialog extends Dialog {

    private String selectedProjectName;
    private String selectedModelName;

    public ModelSelectionDialog(Shell parentShell) {
        super(parentShell);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        GridLayout layout = new GridLayout(2, false);
        container.setLayout(layout);

        Label projectLabel = new Label(container, SWT.NONE);
        projectLabel.setText("Select a Project:");

        ComboViewer projectViewer = new ComboViewer(container, SWT.READ_ONLY);
        projectViewer.setContentProvider(ArrayContentProvider.getInstance());
        projectViewer.setInput(getProjectNames()); // Implement getProjectNames() to return an array of project names

        Label modelLabel = new Label(container, SWT.NONE);
        modelLabel.setText("Select a Model:");

        ComboViewer modelViewer = new ComboViewer(container, SWT.READ_ONLY);
        modelViewer.setContentProvider(ArrayContentProvider.getInstance());
        modelViewer.setInput(getModelNames(selectedProjectName)); // Implement getModelNames() to return an array of model names based on the selected project

        projectViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                if (!selection.isEmpty()) {
                    selectedProjectName = (String) selection.getFirstElement();
                    modelViewer.setInput(getModelNames(selectedProjectName));
                    modelViewer.refresh();
                }
            }
        });

        modelViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                if (!selection.isEmpty()) {
                    selectedModelName = (String) selection.getFirstElement();
                }
            }
        });

        
        
        
        return container;
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, "OK", true);
        createButton(parent, IDialogConstants.CANCEL_ID, "Cancel", false);
    }

    @Override
    protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
            // Use the selectedProjectName and selectedModelName as needed
        }
        super.buttonPressed(buttonId);
    }

    private String[] getProjectNames() {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
        IProject[] projects = root.getProjects();

        // Extract project names
        String[] projectNames = new String[projects.length];
        for (int i = 0; i < projects.length; i++) {
            projectNames[i] = projects[i].getName();
        }

        return projectNames;
    }
    private String[] getModelNames(String projectName) {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
        IProject project = root.getProject(projectName);

        if (project.exists() && project.isAccessible()) {
            try {
                // Fetch files within the project
                IResource[] members = project.members();
                java.util.List<String> modelNames = new ArrayList<>();

                // Filter files to select models (you can customize this filter)
                for (IResource member : members) {
                    if (member instanceof IFile) {
                        modelNames.add(member.getName());
                    }
                }

                return modelNames.toArray(new String[0]);
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }

        return new String[0]; // No models found or project doesn't exist/accessible
    }
    public String getSelectedProjectName() {
        return selectedProjectName;
    }

    public String getSelectedModelName() {
        return selectedModelName;
    }

}
