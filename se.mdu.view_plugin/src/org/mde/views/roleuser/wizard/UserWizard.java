package org.mde.views.roleuser.wizard;

import java.util.ArrayList;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

/** Class defining the wizard for the creation of the view
* @author Malvina Latifaj
*/
public class UserWizard extends Wizard implements INewWizard {
    // wizard pages
    UserPage userPage;
    RolePage rolePage;
    // view model for storing view data


    IPath path;
    IFile file;

    // workbench selection when the wizard was started
    protected IStructuredSelection selection;

    // the workbench instance
    protected IWorkbench workbench;


    /**
     * Constructor for UserWizard.
     */
    public UserWizard(IPath path, IFile file) {
        super();
   
        this.path = path;
        this.file = file;
    }

    /**
     * Pages added to the wizard
     */
    public void addPages() {
        rolePage = new RolePage(workbench, selection);      
        userPage = new UserPage(workbench, selection, rolePage.getRoleList());       
        addPage(userPage);

    }

    /**
     * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
     */
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench;
        this.selection = selection;
        if (selection != null && !selection.isEmpty()) {
            Object obj = selection.getFirstElement();
            if (obj instanceof IFolder) {
                IFolder folder = (IFolder) obj;
                // ...
            }
        }
    }

    /**
     * Finalize the wizard and the newly created view
     */
    public boolean performFinish() {
    	 
        return true;
    }
}