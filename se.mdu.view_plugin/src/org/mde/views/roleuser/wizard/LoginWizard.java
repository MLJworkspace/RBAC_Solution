package org.mde.views.roleuser.wizard;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public class LoginWizard extends Wizard implements INewWizard {

    IPath path;
    IFile file;

    // wizard pages
    LoginPage loginPage;      

    // workbench selection when the wizard was started
    protected IStructuredSelection selection;

    // the workbench instance
    protected IWorkbench workbench;

    // Constructor for LoginWizard.
    public LoginWizard(IPath path, IFile file) {
        super();
        this.path = path;
        this.file = file;
        setNeedsProgressMonitor(false); // Ensure that no progress monitor is required for this wizard.
    }       
    // Pages added to the wizard
    public void addPages()
    {     
        loginPage = new LoginPage(workbench, selection);
        addPage(loginPage);  
    }
    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
    	this.workbench = workbench;
		this.selection = selection;

    }
	@Override
	public boolean performFinish() {
		return false;
	}

}