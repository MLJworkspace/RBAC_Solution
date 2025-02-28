package org.mde.views.popup.actions;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.EditorSelectionDialog;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.ide.DialogUtil;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.mde.views.roleuser.wizard.LoginWizard;
import org.mde.views.roleuser.wizard.UserWizard;
import org.mde.views.treeMenu.*;
import org.mde.views.wizard.ViewWizard;

/** Class defining the action for initializing the view creation process
* by clicking on the "Views->Create View" option on the desired meta-model .ecore
* in the Package Explorer 
* @author Federico Ciccozzi
*/
public class Login implements IObjectActionDelegate {
	
	private IFile file;
	private Shell shell;
	private IWorkbenchPart part;
	private ISelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public Login() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.part = targetPart;
		shell = targetPart.getSite().getShell();
		ISelectionService service = targetPart.getSite().getWorkbenchWindow().getSelectionService();
		file = (IFile)((IStructuredSelection)service.getSelection()).getFirstElement();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
			IPath path = file.getLocation();
			
			// Instantiates and initializes the wizard
		   LoginWizard login = new LoginWizard(path, file);
		    login.init(part.getSite().getWorkbenchWindow().getWorkbench(),(IStructuredSelection)selection);
		    //Instantiates the wizard container with the wizard and opens it
		  WizardDialog dialog = new WizardDialog(shell, login) {
			   @Override
		        protected void createButtonsForButtonBar(Composite parent) {
		            super.createButtonsForButtonBar(parent);
		            Button cancelButton = getButton(IDialogConstants.CANCEL_ID);
		            if(cancelButton != null) {
		                cancelButton.setVisible(false);
		            }
		            Button finishButton = getButton(IDialogConstants.FINISH_ID);
		            if(finishButton != null) {
		                finishButton.setVisible(false);
		            }
		        }
			  
		  };
		  // set the size of the wizard
		    dialog.setMinimumPageSize(200, 130); // Sets the minimum size for the wizard pages to 500x500 pixels

		    dialog.create();
		    dialog.open();
		    
	}

	private IFile getFileResource()
	  {
	    if (this.file instanceof IFile) {
	      return (IFile)this.file;
	    }
	    IResource resource = (IResource)this.file
	      .getAdapter(IResource.class);
	    if (resource instanceof IFile) {
	      return (IFile)resource;
	    }

	    return null;
	  }
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
