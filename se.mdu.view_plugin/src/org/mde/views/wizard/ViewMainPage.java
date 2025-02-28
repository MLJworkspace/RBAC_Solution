
package org.mde.views.wizard;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IWorkbench;
import org.mde.views.data.EcoreList;
import org.mde.views.roleuser.wizard.RolePage;
import org.mde.views.roleuser.wizard.RolePage.Role;


/** Class defining presentation and business layer of
* the wizard page for typing the general information about
* the view
* @author Federico Ciccozzi
*/
public class ViewMainPage extends WizardPage implements Listener
{

	IWorkbench workbench;
	IStructuredSelection selection;
	
	// widgets on this page 	
	Text name, ns, nsURI;
	Button autoButton;
	// Class members
	org.eclipse.swt.widgets.List multiSelectList;
	List<RolePage.Role> roleList;
	private static Resource resource;
	private List<Button> roleCheckboxes = new ArrayList<>();
    // New button for opening file selection wizard
    private Button openFileSelectionButton;
    private String selectedFilePath;
	public ViewMainPage(IWorkbench workbench, IStructuredSelection selection, List<RolePage.Role> roleList) {
		super("Page1");
		setTitle("Create your View");
		setDescription("Select the details of your View");
		this.workbench = workbench;
		this.selection = selection;
		this.roleList = roleList;
	}

	/**
	 * Creates layout for the page and populates general view information (as hint)
	 */
	public void createControl(Composite parent) {
		try{
		    // create the composite to hold the widgets
			GridData gd;
			Composite composite =  new Composite(parent, SWT.NULL);
	
		    // create the desired layout for this wizard page
			GridLayout gl = new GridLayout();
			int ncol = 4;
			gl.numColumns = ncol;
			composite.setLayout(gl);
	
			// retrieving root package info for setting new view info
			ResourceSet resourceSet = new ResourceSetImpl(); 
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",new 
			org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl()); 
			URI fileURI=URI.createFileURI(((ViewWizard)getWizard()).path.toString());
			resource=resourceSet.getResource(fileURI,true);
			
			TreeIterator iterTree = resource.getAllContents();
			TreeItem root = null;
			EcoreList lista = new EcoreList();
			Object temp = iterTree.next();
			
			// view name				
			new Label (composite, SWT.NONE).setText("View Name:");				
			name = new Text(composite, SWT.BORDER);
			if(temp.getClass().getSimpleName().equals("EPackageImpl"))
				name.setText(((EPackageImpl)temp).getName()+"_view");
			gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = ncol - 1;
			name.setLayoutData(gd);


			
			// ns
			new Label (composite, SWT.NONE).setText("NameSpace Prefix:");				
			ns = new Text(composite, SWT.BORDER);
			if(temp.getClass().getSimpleName().equals("EPackageImpl"))
				ns.setText(((EPackageImpl)temp).getNsPrefix()+"_view");
			gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = ncol - 1;
			ns.setLayoutData(gd);

			// ns URI
			new Label (composite, SWT.NONE).setText("NameSpace URI:");				
			nsURI = new Text(composite, SWT.BORDER);
			if(temp.getClass().getSimpleName().equals("EPackageImpl"))
				nsURI.setText(((EPackageImpl)temp).getNsURI()+"_view");
			gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = ncol - 1;
			nsURI.setLayoutData(gd);
			

			 // Create a composite to hold the path Text and the button
	        Composite pathComposite = new Composite(composite, SWT.NONE);
	        pathComposite.setLayout(new GridLayout(2, false));
	        gd = new GridData(GridData.FILL_HORIZONTAL);
	        gd.horizontalSpan = ncol;
	        pathComposite.setLayoutData(gd);

	        // Create a Text widget to display the selected file path
	        final Text pathText = new Text(pathComposite, SWT.BORDER);
	        pathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	        pathText.setEditable(false); // Make it read-only
	        pathText.setText(""); // Initialize with an empty string

	        // Create a button for opening the file selection wizard
	        openFileSelectionButton = new Button(pathComposite, SWT.PUSH);
	        openFileSelectionButton.setText("Select Base Model");
	        openFileSelectionButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

	        openFileSelectionButton.addSelectionListener(new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                // Open the file selection wizard here
	                FileDialog fileDialog = new FileDialog(getShell(), SWT.OPEN);
	                fileDialog.setText("Select a File");
	                selectedFilePath = fileDialog.open();
	                if (selectedFilePath != null) {
	                    // Set the selected file path in the Text widget
	                    pathText.setText(selectedFilePath);
	                }
	            }
	        });

			
			 // Multi selection list
		    createCheckboxes(composite, ncol);
	
			// Choice of transport		
			autoButton = new Button(composite, SWT.CHECK);
			autoButton.setText("Enable auto-selection of elements for inconsistency avoidance");
			gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = ncol;
			autoButton.setLayoutData(gd);
			autoButton.setSelection(true);
			
			
			
			saveDataToModel();
		    // set the composite as the control for this page
			setControl(composite);		
			addListeners();
		}catch(Exception ex){ex.printStackTrace();}
	}
	
	private void addListeners()
	{
		autoButton.addListener(SWT.Selection, this);
		name.addListener(SWT.KeyUp, this);
		
	}

	private void createCheckboxes(Composite parent, int ncol) {
	    if (roleList != null && !roleList.isEmpty()) {
	        // Label for roles
	        Label label = new Label(parent, SWT.NONE);
	        label.setText("Roles with access to the view:");
	        GridData labelGridData = new GridData();
	        labelGridData.horizontalSpan = ncol;
	        label.setLayoutData(labelGridData);

	        // Scrolled Composite for containing roles checkboxes
	        ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.V_SCROLL);
	        GridData scrolledCompositeGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
	        scrolledCompositeGridData.horizontalSpan = ncol;
	        scrolledComposite.setLayoutData(scrolledCompositeGridData);

	        // Composite within the ScrolledComposite
	        Composite checkboxComposite = new Composite(scrolledComposite, SWT.NONE);
	        GridLayout gridLayout = new GridLayout();
	        checkboxComposite.setLayout(gridLayout);
            
	        // Set the background color of checkboxComposite to white
	        checkboxComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
	        for (RolePage.Role role : roleList) {
	            Button checkbox = new Button(checkboxComposite, SWT.CHECK);
	            checkbox.setText(role.getRoleName());
	            roleCheckboxes.add(checkbox); 
	        }

	        // Configuring the ScrolledComposite
	        scrolledComposite.setContent(checkboxComposite);
	        scrolledComposite.setExpandHorizontal(true);
	        scrolledComposite.setExpandVertical(true);
	        scrolledComposite.setMinSize(checkboxComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	    }
	}
	
	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
	    getWizard().getContainer().updateButtons();
	}

	/**
	 * Flips to the next wizard page
	 */
	public IWizardPage getNextPage()
	{    		
		saveDataToModel();		
		SelectionPage page = ((ViewWizard)getWizard()).selPage;
		page.onEnterPage();
		return page;
	}

	/**
	 * Checks if the control can be flipped to the next page
	 * @return true/false
	 */
	public boolean canFlipToNextPage()
	{
		if (isTextNonEmpty(name)&&isTextNonEmpty(ns)&&isTextNonEmpty(nsURI))
			return true;
		return false;
	}
	
	/**
	 * Saves the uses choices from this page to the model.
	 * Called on exit of the page
	 */
	private void saveDataToModel()
	{
	   System.out.println("vlera ur ruhet: " + selectedFilePath);
	    // Gets the model
		ViewWizard wizard = (ViewWizard)getWizard();

	    wizard.model.auto = autoButton.getSelection();
	    wizard.model.viewName = name.getText();
	    wizard.model.ns = ns.getText();
	    wizard.model.nsURI = nsURI.getText();
	    wizard.model.selectedPath = selectedFilePath;
	    
	    // Save the selected roles
	    List<RolePage.Role> selectedRoles = new ArrayList<>();
	    for (int i = 0; i < roleList.size(); i++) {
	        if (roleCheckboxes.get(i).getSelection()) {
	            selectedRoles.add(roleList.get(i));
	        }
	    }
	    wizard.model.selectedRoles = selectedRoles; 

	}
//	public List<RolePage.Role> getSelectedRoles() {
//	    List<RolePage.Role> selectedRoles = new ArrayList<>();
//	    for (int i = 0; i < roleList.size(); i++) {
//	        if (roleCheckboxes.get(i).getSelection()) {
//	            selectedRoles.add(roleList.get(i));
//	        }
//	    }
//	    return selectedRoles;
//	}

	/**
	 * Applies the status to the status line of a dialog page.
	 */
	private void applyToStatusLine(IStatus status) {
		String message= status.getMessage();
		if (message.length() == 0) message= null;
		switch (status.getSeverity()) {
			case IStatus.OK:
				setErrorMessage(null);
				setMessage(message);
				break;
			case IStatus.WARNING:
				setErrorMessage(null);
				setMessage(message, WizardPage.WARNING);
				break;				
			case IStatus.INFO:
				setErrorMessage(null);
				setMessage(message, WizardPage.INFORMATION);
				break;			
			default:
				setErrorMessage(message);
				setMessage(null);
				break;		
		}
	}	
		
	private static boolean isTextNonEmpty(Text t)
	{
		String s = t.getText();
		if ((s!=null) && (s.trim().length() >0)) return true;
		return false;
	}	

	private void createLine(Composite parent, int ncol) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}


}

