package org.mde.views.wizard;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/** Class defining presentation and business layer of
* the wizard page for checking the view's selected elements
* @author Federico Ciccozzi
*/
public class CheckPage extends WizardPage implements Listener 
{
	
	// widgets on this page
	Text checkText;
		
	protected CheckPage(String arg0) {
		super(arg0);
		setTitle("View Checking");
		setDescription("Results from selected elements checking");
	}

	/**
	 * Business layer for the page
	 */
	public void createControl(Composite parent) {

	    // create the composite to hold the widgets
		GridData gd;
		Composite composite = new Composite(parent, SWT.NONE);

	    // create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		int ncol = 1;
		gl.numColumns = ncol;
		composite.setLayout(gl);
		
	    // create the widgets. If the appearance of the widget is different from the default, 
	    // create a GridData for it to set the alignment and define how much space it will occupy
	    
		//new Label (composite, SWT.NONE).setText("Inconsistencies:");
	    checkText = new Text(composite, SWT.BORDER|SWT.MULTI);
	    checkText.setLayoutData(new GridData(GridData.FILL_BOTH));
	    checkText.setEditable(false);
		
	    // set the composite as the control for this page
		setControl(composite);		
		setPageComplete(true);
	}
	
	/**
	 * Checks if the control can be flipped to the next page
	 * @return true/false
	 */
	public boolean canFlipToNextPage()
	{
		// no next page for this path through the wizard
		return false;
	}
	
    /**
     * Process the events: 
     * when the user has entered all information
     * the wizard can be finished
     */
	public void handleEvent(Event e)
	{

		setPageComplete(isPageComplete());
		getWizard().getContainer().updateButtons();
	}
	
	/**
	 * Sets the completed field on the wizard class when all the information 
	 * is entered and the wizard can be completed
	 */	 
	public boolean isPageComplete()
	{
		ViewWizard wizard = (ViewWizard)getWizard();
		saveDataToModel();
		return true;
	}
	
	/**
	 * Saves the uses choices from this page to the model.
	 * Called on exit of the page
	 */
	private void saveDataToModel()
	{
		ViewWizard wizard = (ViewWizard)getWizard();

	}	

	/**
	 * Page initialization operations to be performed when entering the page
	 */
	void onEnterPage()
	{
	    // Gets the model
		ViewWizard wizard = (ViewWizard)getWizard();
		
	}
}
