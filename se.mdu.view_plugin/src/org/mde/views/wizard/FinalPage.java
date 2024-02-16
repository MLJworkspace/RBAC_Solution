package org.mde.views.wizard;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.impl.EAnnotationImpl;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.impl.EEnumLiteralImpl;
import org.eclipse.emf.ecore.impl.EOperationImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TreeEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.mde.views.data.EcoreElem;
import org.mde.views.data.EcoreList;

/** Class defining presentation and business layer of
* the wizard page summarizing the selected view details
* @author Federico Ciccozzi
*/
public class FinalPage extends WizardPage implements Listener 
{
	
	// widgets on this page
	Text summaryText;
	Tree tree;
	
	
	protected FinalPage(String arg0) {
		super(arg0);
		setTitle("View Summary");
		setDescription("Review the selected elements before the creation of the view");
	}

	/**
	 * Business layer for the page
	 */
	public void createControl(Composite parent) {

		// create the composite to hold the widgets
	    Composite composite = new Composite(parent, SWT.NONE);
	    
	    // create the desired layout for this wizard page
	    GridLayout gl = new GridLayout();
	    int ncol = 1;
	    gl.numColumns = ncol;
	    composite.setLayout(gl);
	    
	    //add selection tree
	    try{
	    	tree = new Tree(composite, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
	    	tree.setLayoutData(new GridData(GridData.FILL_BOTH));
	    	tree.setHeaderVisible(true);
		    
		    TreeColumn column2 = new TreeColumn(tree, SWT.CENTER);
		    column2.setText("Meta-Model Element");
		    column2.setWidth(200);
		    
		    TreeColumn column3 = new TreeColumn(tree, SWT.CENTER);
		    column3.setText("Editing Right");
		    column3.setWidth(200);

	    }catch(Exception ex){
	    	ex.printStackTrace();
	    }
	    
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
		try{
		    // Gets the model
			ViewWizard wizard = (ViewWizard)getWizard();
			ViewModel model = wizard.model;
			tree.removeAll();
			
			//check the view tree for displaying a summary of selected elements together with
			//assigned read/write rights
			for(int i=0; i<model.tree.getItemCount(); i++){
				if(model.tree.getItem(i).getChecked()){
					TreeItem item = new TreeItem(tree, SWT.NONE);
					final Object temp = model.tree.getItem(i).getData();
					boolean isEdit = false;
					//a meta-class is editable
					if(((EObject)temp).getClass().getSimpleName().equals("EClassImpl"))
						if(((EClassImpl)temp).getEAnnotation("isEditable")!=null)
								//getEStructuralFeature("isEditable")!=null)
							isEdit = true;
					if(isEdit) item.setText(new String[]{model.tree.getItem(i).getText(),"Read/Write"});
					//a meta-class is not editable
					else item.setText(new String[]{model.tree.getItem(i).getText(),"Read only"});
					item.setExpanded(true);
					item.setChecked(true);
					for(int k=0; k<model.tree.getItem(i).getItemCount(); k++){
						if(model.tree.getItem(i).getItem(k).getChecked()){
							isEdit = false;
							Object temp2 = model.tree.getItem(i).getItem(k).getData();
							TreeItem child = new TreeItem(item, SWT.NONE);
							if(((EObject)temp2).getClass().getSimpleName().equals("EAttributeImpl")||
									((EObject)temp2).getClass().getSimpleName().equals("EReferenceImpl"))
								//EAttribure or EReference editable
								if(((EStructuralFeature)temp2).isChangeable())
									isEdit = true;
							if(isEdit) child.setText(new String[]{model.tree.getItem(i).getItem(k).getText(),"Read/Write"});
							//EAttribure or EReference not editable
							else child.setText(new String[]{model.tree.getItem(i).getItem(k).getText(),"Read only"});
						}
					}
					item.setExpanded(true);
				}
			}
		    tree.setSize(400, 380);
		}catch(Exception ex){ex.printStackTrace();}
	}
}
