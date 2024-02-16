package org.mde.views.wizard;

import java.util.ArrayList;


import java.util.HashMap;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EAnnotationImpl;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EClassifierImpl;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.impl.EEnumLiteralImpl;
import org.eclipse.emf.ecore.impl.EOperationImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.TreeEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
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
import org.mde.views.roleuser.wizard.RolePage;
import org.mde.views.roleuser.wizard.RolePage.Role;
import org.mde.views.wizard.SelectionPage;

/** Class defining presentation and business layer of
 * the wizard page for assigning read/write rights to each
 * single item in the view
 * @author Federico Ciccozzi
 */
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

public class SummaryPage extends WizardPage implements Listener {
	// widgets on this page
	Text summaryText;
	Tree tree;
	boolean columnsCreated = false;
	// Keep track of check box for each tree item
	Map<TreeItem, Button[][]> checkBoxes = new HashMap<>();
	// Keep track of label for each tree item
	Map<TreeItem, Label[][]> labels = new HashMap<>(); // Added this line
	Map<String, Button> attributeCheckboxMap = new HashMap<>();

	protected SummaryPage(String arg0) {
		super(arg0);
		setTitle("Access Control Permissions");
		setDescription("Select the permissions for the selected elements of the view.");
	}

	/**
	 * Page initialization operations to be performed when entering the page
	 */
	void onEnterPage() {
		try {
			ViewWizard wizard = (ViewWizard) getWizard();
			ViewModel model = wizard.model;
			java.util.List<Role> selectedRoleList = model.selectedRoles;

			tree.removeAll();

			for (int i = 0; i < model.tree.getItemCount(); i++) {
				if (model.tree.getItem(i).getChecked()) {
					TreeItem item = new TreeItem(tree, SWT.NONE);
					Object temp = model.tree.getItem(i).getData();
					item.setText(model.tree.getItem(i).getText());
					item.setExpanded(true);
					item.setData(temp);
					for (int k = 0; k < model.tree.getItem(i).getItemCount(); k++) {
						if (model.tree.getItem(i).getItem(k).getChecked()) {
							Object temp2 = model.tree.getItem(i).getItem(k).getData();
							TreeItem child = new TreeItem(item, SWT.NONE);
							child.setText(model.tree.getItem(i).getItem(k).getText());
							child.setData(temp2);
						}
					}
					item.setExpanded(true);
				}
			}
			tree.setSize(400, 380);
			createColumns(selectedRoleList);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

	/**
	 * Business layer for the page
	 */
	public void createControl(Composite parent) {
		// create the composite to hold the widgets
		Composite composite = new Composite(parent, SWT.NONE);

		// create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		gl.numColumns = 1;
		composite.setLayout(gl);

		// add a ScrolledComposite with horizontal scroll bar
		ScrolledComposite scrolledComposite = new ScrolledComposite(composite,
				SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// add selection tree
		try {
			tree = new Tree(scrolledComposite, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
			tree.setHeaderVisible(true);

			scrolledComposite.setContent(tree);
			scrolledComposite.setExpandHorizontal(true);
			scrolledComposite.setExpandVertical(true);
			scrolledComposite.setMinSize(tree.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		setControl(composite);
		setPageComplete(true);
	}

	// Method to create the columns for the Tree widget
	private void createColumns(java.util.List<Role> selectedRoleList) {
		if (!columnsCreated) {

			TreeColumn column2 = new TreeColumn(tree, SWT.CENTER);
			column2.setText("Meta-Model Element");
            
		
	        
			for (Role role : selectedRoleList) {
				TreeColumn column3 = new TreeColumn(tree, SWT.CENTER);
				column3.setText(role.getRoleName());
				// column3.setWidth(150);
			}
			// New column for "Key"
	        TreeColumn keyColumn = new TreeColumn(tree, SWT.CENTER);
	        keyColumn.setText("Key");
		
			for (TreeColumn column : tree.getColumns()) {
				column.pack();
			}
			columnsCreated = true;
		}
		for (TreeItem item : tree.getItems()) {
			setEditorForItem(item, selectedRoleList.size());
		}
	}

	public String getSelectedEAttributeName(EClass eClass) {
		System.out.println("Kush eshte eeclass + " + eClass);
	    for (EAttribute eAttribute : eClass.getEAttributes()) {
	    	System.out.println("Kush eshte attribute + " + eAttribute);
	        Button checkBox = attributeCheckboxMap.get(eAttribute.getName());
	        System.out.println("Kush eshte checkbox + " + checkBox);
	        if (checkBox != null && checkBox.getSelection()) {
	            return eAttribute.getName();
	        }
	    }
	    return null; // No selected EAttribute found
	}
	// Method to get the Tree widget
    public Tree getTree() {
        return tree;
    }

	public void setEditorForItem(TreeItem item, int numRoles) {
		Image image = new Image(Display.getCurrent(), 1, 20);
		item.setImage(image);
        

		 // Assuming the "Key" column is the last one
	    int keyColumnIndex = tree.getColumnCount() - 1;
	    EObject objectData = ((EObject) item.getData());

	  
	    
	    if (objectData instanceof EAttribute) {
	        TreeEditor editor = new TreeEditor(tree);
	        Button checkBox = new Button(tree, SWT.CHECK);
	        attributeCheckboxMap.put(((EAttribute)objectData).getName(), checkBox);
	        editor.grabHorizontal = true;
	        editor.setEditor(checkBox, item, keyColumnIndex);
	    }

		
		TreeEditor[] editors = new TreeEditor[numRoles];
		Button[][] itemCheckBoxes = new Button[numRoles][4];
		Label[][] itemLabels = new Label[numRoles][4];
		
		
		
		for (int i = 0; i < numRoles; i++) {
			editors[i] = new TreeEditor(tree);
			Composite composite = new Composite(tree, SWT.NONE);
			GridLayout gridLayout = new GridLayout(8, false);
			gridLayout.marginWidth = 0;
			gridLayout.marginHeight = 0;
			composite.setLayout(gridLayout);

			String[] labelsString = { "C", "R", "U", "D" };

			for (int j = 0; j < 4; j++) {
				final int finalJ = j;
				final int finalI = i;
				Label label = new Label(composite, SWT.NONE);
				label.setText(labelsString[finalJ]);
				label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
				GridData labelData = new GridData();
				labelData.horizontalAlignment = SWT.CENTER;
				label.setLayoutData(labelData);

				Button checkBox = new Button(composite, SWT.CHECK);
				// Disable the checkbox for U if the objectData is an EClass or an EReference
				if (j == 2 && (objectData instanceof EClass)) {
					checkBox.setEnabled(false);
				}
				// Disable the checkbox for for C, U and D if the objectData is an EEnum or EEnumLiteral
				if ((j == 0 || j == 2 || j == 3) && (objectData instanceof EEnum || objectData instanceof EEnumLiteral)) {
					checkBox.setEnabled(false);
				}
				// Disable the checkbox for for C and D if the objectData is an EAttribute
				if ((j == 0 || j == 3) && objectData instanceof EAttribute) {
					checkBox.setEnabled(false);
				}
			
				// Disable the checkbox  for C and D if the objectData is a non containment EReference
				if (objectData instanceof EReference) {
					if ((j == 0 || j == 3) && !((EReference) objectData).isContainment())
					checkBox.setEnabled(false);
					if (j==2 && ((EReference) objectData).isContainment())
					checkBox.setEnabled(false);
				}
				itemCheckBoxes[i][j] = checkBox;
				itemLabels[i][j] = label;

				checkBox.addListener(SWT.Selection, new Listener() {
					@Override
					public void handleEvent(Event event) {

						if (objectData instanceof EReference) {
							EReference eReference = (EReference) objectData;
							EClass eClass = (EClass) eReference.getEType();
							EClass containingEClass = (EClass) ((EReference) objectData).eContainer();
							TreeItem eClassItem = findTreeItemByEClass(eClass);
							if (eReference.isContainment()) {
								if (checkBox.getSelection()) {
									eReferenceCheckboxIsSelected(itemCheckBoxes, containingEClass, eClass, finalI,
											finalJ, checkBox, label, itemLabels, item, eClassItem);
								} else {
									eReferenceCheckboxIsDeselected(itemCheckBoxes, containingEClass, eClass, finalI,
											finalJ, checkBox, label, itemLabels, item, eClassItem);
								}
							} else {

								nonContainmentReferenceCheckboxIsSelected(itemCheckBoxes, containingEClass, eClass,
										finalI, finalJ, checkBox, label, itemLabels, item, eClassItem);

							}
						}
						// Check if the current item represents an EClass
						if (objectData instanceof EClass) {
							EClass eClass = (EClass) objectData;
							java.util.List<TreeItem> eReferenceItems = findTreeItemsByEReferences(eClass);
							if (checkBox.getSelection()) {

							eClassCheckboxIsSelected(eClass, finalI, finalJ, checkBox, label, itemLabels, item,
									itemCheckBoxes);}
							
							else {

							eClassCheckboxIsDeselected(eClass, finalI, finalJ, checkBox, label, itemLabels, item,
									itemCheckBoxes);
							keepReadSelected(itemCheckBoxes, finalI, finalJ, item, itemLabels);
							}
						}
						if (objectData instanceof EAttribute) {								
							EClass containingEClass = (EClass) ((EAttribute) objectData).eContainer();
							TreeItem containingEClassItem = findTreeItemByEClass(containingEClass);
							eAttributeCheckboxIsSelected(containingEClass, containingEClassItem, finalI, finalJ, checkBox, label, item, itemCheckBoxes,itemLabels);
							//keepReadSelected(itemCheckBoxes, finalI, finalJ, item, itemLabels);

						}
						
						if (objectData instanceof EEnum)  {	
							eEnumIsSelected(finalI, finalJ, checkBox, label, item, itemCheckBoxes, itemLabels);

						}
						if (objectData instanceof EEnumLiteral)  {	
							if (checkBox.getSelection()) {
								label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
							}
							else {
								checkBox.setSelection(false);
								label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
								
								 TreeItem parentItem = item.getParentItem();
									Button[][] parentItemCheckboxes = checkBoxes.get(parentItem);
									Label[][] parentItemLabels = labels.get(parentItem);
								 if (anyChildChecked(finalI,parentItem) == false) {
									 parentItemCheckboxes[finalI][1].setSelection(false);
									 parentItemLabels[finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
									// parentItemCheckboxes[finalI][2].setSelection(false);
									// parentItemLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
									 //need to first check whether any of the attributes EType matches this Enum before deselecting
									 //we deselect it only if all attributes whose EType matches it, are deselected
									
									     eEnumIsSelected(finalI, finalJ, checkBox, label, parentItem, parentItemCheckboxes, parentItemLabels);
									 
								 }
							
							}

						}

					}
				});

				GridData buttonData = new GridData();
				buttonData.horizontalAlignment = SWT.CENTER;
				checkBox.setLayoutData(buttonData);
			}
			editors[i].horizontalAlignment = SWT.CENTER;
			editors[i].grabHorizontal = true;
			editors[i].setEditor(composite, item, i + 1);
		}
		checkBoxes.put(item, itemCheckBoxes);
		labels.put(item, itemLabels);
		for (TreeItem child : item.getItems()) {
			setEditorForItem(child, numRoles);
		}
	}

	public void eEnumIsSelected(int finalI, int finalJ, Button checkBox, Label label, TreeItem item,
			Button[][] itemCheckBoxes, Label[][] itemLabels) {
		if (checkBox.getSelection()) {
			label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));

			for (TreeItem eNumLiteral : item.getItems()) {
				Button[][] eNumLiteralCheckBoxes = checkBoxes.get(eNumLiteral);
				Label[][] eNumLiteralLabels = labels.get(eNumLiteral);
				eNumLiteralCheckBoxes[finalI][1].setSelection(true);
				eNumLiteralLabels[finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
			}
		} else {
			checkBox.setSelection(false);
			label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
			// for children (EEnumLiteral)
			for (TreeItem eNumLiteral : item.getItems()) {
				Button[][] eNumLiteralCheckBoxes = checkBoxes.get(eNumLiteral);
				Label[][] eNumLiteralLabels = labels.get(eNumLiteral);
				eNumLiteralCheckBoxes[finalI][1].setSelection(false);
				eNumLiteralLabels[finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
			}
			// for referencing EAttributes
			for (TreeItem itemi : tree.getItems()) {
				if (itemi.getData() instanceof EClass) {
					for (TreeItem childItem : itemi.getItems()) {
						if (childItem.getData() instanceof EAttribute) {

							if (((EAttribute) childItem.getData()).getEType().getName() == ((EEnum) item.getData())
									.getName()) {
								Button[][] attributeCheckBoxes = checkBoxes.get(childItem);
								Label[][] attributeLabels = labels.get(childItem);
								attributeCheckBoxes[finalI][1].setSelection(false);

								attributeLabels[finalI][1]
										.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
								attributeCheckBoxes[finalI][2].setSelection(false);

								attributeLabels[finalI][2]
										.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
							}
						}
					}
				}
			}
		}
	}
	/// EReference actions

	public void eReferenceCheckboxIsSelected(Button[][] itemCheckBoxes, EClass containingEClass, EClass eClass, int finalI, int finalJ, Button checkBox, Label label, Label[][] itemLabels, TreeItem item, TreeItem eClassItem) {
		Button[][] eClassCheckBoxes = null;
		Label[][] eClassLabels = null;
		TreeItem containingEClassItem = findTreeItemByEClass(containingEClass);
		Button[][] containingeClassCheckBoxes = checkBoxes.get(containingEClassItem);
		Label[][] eContainingClassLabels= labels.get(containingEClassItem);
		if (eClassItem != null) {
			eClassCheckBoxes = checkBoxes.get(eClassItem);
			eClassLabels = labels.get(eClassItem); // assuming labels is a map containing the labels
		}
		
        // if the checkbox is being selected
		if (checkBox.getSelection()) {
			label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
			autoSelectRead(finalI, item);
			selectReadHierarchy(finalI, checkBox, item, label);
			
			if (finalJ !=1) {
				containingeClassCheckBoxes[finalI][2].setSelection(true);
				eContainingClassLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
			}
			if (eClassCheckBoxes != null && eClassLabels != null) {
				eClassCheckBoxes[finalI][finalJ].setSelection(true);
				eClassLabels[finalI][finalJ].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
				eClassCheckboxIsSelected(eClass, finalI, finalJ, eClassCheckBoxes[finalI][finalJ],eClassLabels[finalI][finalJ], eClassLabels, eClassItem, eClassCheckBoxes);
			}
		}
	}
		//if the checkbox is being deselected
	public void eReferenceCheckboxIsDeselected(Button[][] itemCheckBoxes, EClass containingEClass, EClass eClass, int finalI, int finalJ, Button checkBox, Label label, Label[][] itemLabels, TreeItem item, TreeItem eClassItem) {
		Button[][] eClassCheckBoxes = null;
		Label[][] eClassLabels = null;
		TreeItem containingEClassItem = findTreeItemByEClass(containingEClass);
		Button[][] containingeClassCheckBoxes = checkBoxes.get(containingEClassItem);
		Label[][] eContainingClassLabels= labels.get(containingEClassItem);
		if (eClassItem != null) {
			eClassCheckBoxes = checkBoxes.get(eClassItem);
			eClassLabels = labels.get(eClassItem); // assuming labels is a map containing the labels
		}
			
			//the U operation of the containing EClass is deselected if the condition evaluates to true
			if(!areAnySiblingsOrSelfSelected(itemCheckBoxes, finalI, item)) {
				containingeClassCheckBoxes[finalI][2].setSelection(false);		
				eContainingClassLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
			}
			//the exact same checkbox of the target EClass is being deselected
			if (eClassCheckBoxes != null && eClassLabels != null && (finalJ!=3 || (finalJ==3 && !containingeClassCheckBoxes[finalI][3].getSelection()))) {

				eClassCheckBoxes[finalI][finalJ].setSelection(false);
				eClassLabels[finalI][finalJ].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
				eClassCheckboxIsDeselected(eClass, finalI, finalJ, eClassCheckBoxes[finalI][finalJ], eClassLabels[finalI][finalJ], eClassLabels, eClassItem, eClassCheckBoxes);
				
			}
			
			//if you are deselecting C, U, or D of containment ref
			if (finalJ != 1) {
				label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
			}

			
			if (finalJ == 3) {			
				//eContainingClassCheckBoxes = checkBoxes.get(containingEClassItem);
				eContainingClassLabels = labels.get(containingEClassItem);
				if (containingeClassCheckBoxes != null && containingeClassCheckBoxes[finalI][finalJ].getSelection()) {
					// If D of containingClass is selected, D of eReference shall be kept selected
					checkBox.setSelection(true); // Force the checkbox to remain selected
					label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK)); 
					return; 
				}
			}
		
		
		}

	public void deselectAllForElement(TreeItem item,  int role) {
		   Button[][] checkboxes = checkBoxes.get(item);
		    if (checkboxes != null ) {
		        for (int j = 0; j < 4; j++) { // Assuming 4 operations C, R, U, D
		            checkboxes[role][j].setSelection(false);
		            labels.get(item)[role][j].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
		        }
		    }
	}
	public void deselectAllCheckboxesForClass(TreeItem eClassItem, int roleIndex) {
	    Button[][] checkBoxesForClass = checkBoxes.get(eClassItem);
	    if (checkBoxesForClass != null) {
	        for (int j = 0; j < 4; j++) { // Assuming 4 operations C, R, U, D
	            checkBoxesForClass[roleIndex][j].setSelection(false);
	            labels.get(eClassItem)[roleIndex][j].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
	        }
	    }
	    // Recursively deselect for all child items
	    for (TreeItem childItem : eClassItem.getItems()) {
	    	  if (childItem.getData() instanceof EReference) {
	              EReference eRef = (EReference) childItem.getData();
	              if (eRef.isContainment()) {
	            	  EClass targetEClass = (EClass)((EReference)childItem.getData()).getEType();
	          		  EClass containingEClass = (EClass) ((EReference) eRef).eContainer();
                      TreeItem targetEClassItem = findTreeItemByEClass(targetEClass);	
	            	  Button[][] checkBoxesForRef = checkBoxes.get(childItem);
	                  eReferenceCheckboxIsDeselected(checkBoxesForRef, containingEClass, targetEClass, roleIndex, 1, null, null, null, childItem, targetEClassItem);
	              } 
	          } 
	        deselectAllCheckboxesForClass(childItem, roleIndex);
	    }
	}
	


	public void nonContainmentReferenceCheckboxIsSelected(Button[][] itemCheckBoxes ,EClass containingEClass, EClass eClass, int finalI, int finalJ, Button checkBox, Label label, Label[][] itemLabels, TreeItem item, TreeItem eClassItem) {
		TreeItem containingEClassItem = findTreeItemByEClass(containingEClass);
		Button[][] containingeClassCheckBoxes = checkBoxes.get(containingEClassItem);
		Label[][] containingeClassLabels = labels.get(containingEClassItem);
		//if any checkbox beside R is selected, the U checkbox of containing class is selected automatically
		if (finalJ != 1) {
			containingeClassCheckBoxes[finalI][2].setSelection(true);
			containingeClassLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
		}
		Button[][] eClassCheckBoxes = null;
		Label[][] eClassLabels = null;
		if (eClassItem != null) {
			eClassCheckBoxes = checkBoxes.get(eClassItem);
			eClassLabels = labels.get(eClassItem); // assuming labels is a map containing the labels
		}

		if (checkBox.getSelection()) {
			label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
			autoSelectRead(finalI, item);
			selectReadHierarchy(finalI, checkBox, item,label);
			if (eClassCheckBoxes != null && eClassLabels != null) {
				eClassCheckBoxes[finalI][1].setSelection(true);
				eClassLabels[finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
				for (TreeItem refItem : findTreeItemsByEReferences(eClass)) {
					EReference eRef =(EReference)refItem.getData();
					if (eRef.isContainment()) {
						Button[][] containmentRefItemCheckBoxes = checkBoxes.get(refItem);
						Label[][] containmentRefItemLabels = labels.get(refItem);
						containmentRefItemCheckBoxes[finalI][1].setSelection(true);
						containmentRefItemLabels[finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
					}
				}

				eClassCheckboxIsSelected(containingEClass, finalI, finalJ, checkBox, label, itemLabels, containingEClassItem, itemCheckBoxes);

			}

			// if the checkbox is being deselected
		} else {
			if (finalJ==1) {
				deselectAllForElement(item,  finalI);
				}
			if(!areAnySiblingsOrSelfSelected(itemCheckBoxes, finalI, item)) { //when we deselect a checkbox we check whether any other checkbox of the element or sibling is selected			
				containingeClassCheckBoxes[finalI][2].setSelection(false);	//if not, we deselect the U of the containing class
				containingeClassLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
			}
			if (finalJ != 1) {
				label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
			}
			if (finalJ == 3) {

				eClassCheckBoxes = checkBoxes.get(containingEClassItem);
				eClassLabels = labels.get(containingEClassItem);
				if (eClassCheckBoxes != null && eClassCheckBoxes[finalI][finalJ].getSelection()) {
					checkBox.setSelection(true); 
					label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK)); 
					return; 
				}
			}

		}

	}


	/// EClass actions
     
	public void eClassCheckboxIsSelected(EClass eClass, int finalI, int finalJ, Button checkBox, Label label,
			Label[][] itemLabels, TreeItem item, Button[][] itemCheckBoxes) {

			label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
			// select the subclasses (if there are any)
			for (TreeItem itemi : tree.getItems()) {
				if (itemi.getData() instanceof EClass) {
					if (eClass.isSuperTypeOf((EClass)itemi.getData())) {
						Button[][]subClassCheckBoxes = checkBoxes.get(itemi);
						Label[][] subClassLabels = labels.get(itemi);

						subClassCheckBoxes[finalI][finalJ].setSelection(true);
						subClassLabels[finalI][finalJ].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
					}
				}
			}
			java.util.List<TreeItem> eReferenceItems = findTreeItemsByEReferences(eClass);
			// horisontal selection of R - rule 1
			if (finalJ == 0 || finalJ == 3) {
				autoSelectRead(finalI, item);
			}
			
			// If D checkbox is selected (index 3), select the D checkboxes of all contained elements. - rule 3
			if (finalJ == 3) {
				autoSelectDeleteCheckboxForContainedElements(item, finalI, finalJ);
			}
			//iterates through the references of the EClass
			for (TreeItem eReferenceItem : eReferenceItems) {
				if (((EReference)eReferenceItem.getData()).isContainment()) {

				Button[][] eReferenceCheckBoxes = checkBoxes.get(eReferenceItem);
				Label[][] eReferenceLabels = labels.get(eReferenceItem);
				if (eReferenceCheckBoxes != null && eReferenceLabels != null) {
					//kjo eshte ajo q prish pune per eattribute dhe per non containment references 
					if (finalJ != 2) {

					eReferenceCheckBoxes[finalI][finalJ].setSelection(true);
					eReferenceLabels[finalI][finalJ].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
					}
					autoSelectRead(finalI, eReferenceItem);
					selectReadHierarchy(finalI, checkBox, eReferenceItem, label);
					Button[][] parentItemCheckboxes = checkBoxes.get(eReferenceItem.getParentItem());
					Label[][] parentItemLabels = labels.get(eReferenceItem.getParentItem());

					if (areAnySiblingsOrSelfSelected(eReferenceCheckBoxes, finalI, eReferenceItem)) {
						
						parentItemCheckboxes[finalI][2].setSelection(true);
						parentItemLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
					}
				}
			}
			}

	
	}
    public void autoSelectDeleteCheckboxForContainedElements(TreeItem item, int finalI, int finalJ) {
    	Button[][] eClassCheckBoxes = null;
		Label[][] eClassLabels = null;
		// this is to select the children of the EClass
    	for (TreeItem child : item.getItems()) {
			Button[][] childCheckBoxes = checkBoxes.get(child);
			Label[][] childLabels = labels.get(child);
			if (childCheckBoxes != null && childLabels != null) {
				childCheckBoxes[finalI][finalJ].setSelection(true);
				childLabels[finalI][finalJ].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
				autoSelectRead(finalI, child);
			}
			//this is to select the EClasses referenced by the children of the EClass. 
			if (child.getData() instanceof EReference) {
				if (((EReference)child.getData()).isContainment()) {
					EClass neweClass = (EClass) ((EReference)child.getData()).getEType();

					TreeItem eClassItem = findTreeItemByEClass(neweClass);
					eClassCheckBoxes = checkBoxes.get(eClassItem);
					eClassLabels = labels.get(eClassItem);
					if (eClassCheckBoxes != null && eClassLabels != null) {
						eClassCheckBoxes[finalI][finalJ].setSelection(true);
						eClassLabels[finalI][finalJ].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
						eClassCheckboxIsSelected(neweClass, finalI, finalJ, eClassCheckBoxes[finalI][finalJ],eClassLabels[finalI][finalJ], eClassLabels, eClassItem, eClassCheckBoxes);
						
						TreeItem secondClassItem = findTreeItemByEClass(neweClass);
						for (TreeItem children : secondClassItem.getItems()) {
							Button[][] childrenCheckBoxes = checkBoxes.get(children);
			
							if (areAnySiblingsOrSelfSelected(childrenCheckBoxes, finalI, children)) {
							
								eClassCheckBoxes[finalI][2].setSelection(true);
								eClassLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
							} 
						
						}
					}
					
				}
			}
		}
    }
	public void eClassCheckboxIsDeselected(EClass eClass, int finalI, int finalJ, Button checkBox, Label label, Label[][] itemLabels,
			TreeItem item, Button[][] itemCheckBoxes) {
		//nese R e klases eshte deselektuar (pra kur vjen nga nje gje tjeter)
		if (!itemCheckBoxes[finalI][1].getSelection()) {
			//keepReadSelected(itemCheckBoxes, finalI, finalJ, item, itemLabels);
			deselectNonContainmentReferencesForEClass(item, finalI,finalJ, itemCheckBoxes, itemLabels,checkBox);
			
		}
		// deselect the subclasses (if there are any) -abstract
			for (TreeItem itemi : tree.getItems()) {
				if (itemi.getData() instanceof EClass) {
					if (eClass.isSuperTypeOf((EClass)itemi.getData())) {
						Button[][]subClassCheckBoxes = checkBoxes.get(itemi);
						Label[][] subClassLabels = labels.get(itemi);

						subClassCheckBoxes[finalI][finalJ].setSelection(false);
						subClassLabels[finalI][finalJ].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
					}
				}
			}
        //vetem per C, U dhe D. kur checkbox eshte bere deselect 
		for (int i = 0; i < 4; i++) {
			if (i != 1 && !itemCheckBoxes[finalI][i].getSelection()) {
				itemLabels[finalI][i].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
				//if the user has deselected D it should also deselect D for all child attributes.
				if (i == 3 && !itemCheckBoxes[finalI][i].getSelection()) {
					for (TreeItem child : item.getItems()) {
						Button[][] childCheckBoxes = checkBoxes.get(child);
						Label[][] childLabels = labels.get(child);
						if (child.getData() instanceof EAttribute) {			
							if (childCheckBoxes != null && childLabels != null) {
								childCheckBoxes[finalI][3].setSelection(false);
								childLabels[finalI][3].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
							}
						}
						if (child.getData() instanceof EReference) {	
							if (!((EReference)child.getData()).isContainment())
							if (childCheckBoxes != null && childLabels != null) {
								childCheckBoxes[finalI][3].setSelection(false);
								childLabels[finalI][3].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
							}
						}
					}
				}
				for (TreeItem children : item.getItems()) {
					Button[][] childrenCheckBoxes = checkBoxes.get(children);

				if (!areAnySiblingsOrSelfSelected(childrenCheckBoxes, finalI, children)) {
					
					itemCheckBoxes[finalI][2].setSelection(false);
					itemLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
				} }
			}
			else if (i == 1 && !itemCheckBoxes[finalI][i].getSelection()) {
				deselectAllCheckboxesForClass(item, finalI);
			}
			
			
		}

		// For the selected EClass checkbox, update the corresponding EReference
		// checkbox.
		java.util.List<TreeItem> eReferenceItems = findTreeItemsByEReferences(eClass);
		for (TreeItem eReferenceItem : eReferenceItems) {
			if (((EReference)eReferenceItem.getData()).isContainment()) {
			Button[][] eReferenceCheckBoxes = checkBoxes.get(eReferenceItem);
			Label[][] eReferenceLabels = labels.get(eReferenceItem);
			//System.out.println("referenceItem: " + eReferenceItem);
			if (eReferenceCheckBoxes != null && eReferenceLabels != null && !checkBox.getSelection()) {
			//System.out.println("how about here");
				eReferenceCheckBoxes[finalI][finalJ].setSelection(false);
				eReferenceLabels[finalI][finalJ].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
				//autoSelectRead(finalI, eReferenceItem);
				if (finalJ==1) {
				deselectAllForElement(eReferenceItem,  finalI);
				}
				selectReadHierarchy(finalI, checkBox, eReferenceItem, label);
				Button[][] parentItemCheckboxes = checkBoxes.get(eReferenceItem.getParentItem());
				Label[][] parentItemLabels = labels.get(eReferenceItem.getParentItem());

				if (!areAnySiblingsOrSelfSelected2(itemCheckBoxes, finalI, eReferenceItem)) {
				
					parentItemCheckboxes[finalI][2].setSelection(false);
					parentItemLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
				}			
			}
		}
		}
	}
	
	public void deselectNonContainmentReferencesForEClass(TreeItem item, int finalI, int finalJ, Button[][] eClassCheckBoxes, Label[][] eClassLabels, Button checkbox) {
		if (!checkbox.getSelection()) {
		EClass eClass = (EClass) item.getData();
	    java.util.List<TreeItem> eReferenceItems = findTreeItemsByEReferences(eClass);
	    for (TreeItem eReferenceItem : eReferenceItems) {

	        EReference eReference = (EReference) eReferenceItem.getData();
	        if (!eReference.isContainment()) {
	            Button[][] eReferenceCheckboxes = checkBoxes.get(eReferenceItem);
	            Label[][] eReferenceLabels = labels.get(eReferenceItem);
	            
	            eReferenceCheckboxes[finalI][1].setSelection(false); // Deselect R checkbox
	            eReferenceLabels[finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));

	            // Deselect other checkboxes associated with the non-containment EReference
	            for (int j = 0; j < 4; j++) {
	                if (j != 1) { // Skip R checkbox
	                    eReferenceCheckboxes[finalI][j].setSelection(false);
	                    eReferenceLabels[finalI][j].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
	                }
	            }
	        }
	    }}
	}

	/// EAttribute actions

	public void eAttributeCheckboxIsSelected(EClass containingEClass, TreeItem containingEClassItem, int finalI, int finalJ, Button checkBox, Label label, TreeItem item, Button[][] itemCheckBoxes, Label[][] itemLabels) {
		if (checkBox.getSelection()) {	
			label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
			Button[][] containingeClassCheckBoxes = checkBoxes.get(containingEClassItem);
			Label[][] containingeClassLabels = labels.get(containingEClassItem);	
	
			for (TreeItem itemi : tree.getItems()) {
				if (itemi.getData() instanceof EEnum) {
					if (((EAttribute)item.getData()).getEType().getName()==((EEnum)itemi.getData()).getName()) {

						Button[][] itemiClassCheckBoxes = checkBoxes.get(itemi);
						Label[][] itemiClassLabels = labels.get(itemi);	
						itemiClassCheckBoxes[finalI][1].setSelection(true);
						itemiClassLabels[finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
						for(TreeItem enumLiteral : itemi.getItems()) {
							Button[][] enumLiteralCheckBoxes = checkBoxes.get(enumLiteral);
							Label[][] enumLiteralLabels  = labels.get(enumLiteral);	
							enumLiteralCheckBoxes [finalI][1].setSelection(true);
							enumLiteralLabels [finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
							
						}					}
				}
			}
			if (finalJ !=1) {
				containingeClassCheckBoxes[finalI][2].setSelection(true);
				containingeClassLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
				autoSelectRead(finalI, item);
			}			
			selectReadHierarchy(finalI, checkBox, item, label);
			eClassCheckboxIsSelected(containingEClass, finalI, finalJ, checkBox, label, itemLabels, containingEClassItem, itemCheckBoxes);
//			(EClass eClass, int finalI, int finalJ, Button checkBox, Label label,
//					Label[][] itemLabels, TreeItem item, Button[][] itemCheckBoxes)

		}
		else {
			if (finalJ==1) {
				deselectAllForElement(item,  finalI);
				}
			if(!areAnySiblingsOrSelfSelected(itemCheckBoxes, finalI, item)) {
				
				Button[][] containingeClassCheckBoxes = checkBoxes.get(containingEClassItem);
				Label[][] containingeClassLabels = labels.get(containingEClassItem);
				containingeClassCheckBoxes[finalI][2].setSelection(false);		
				containingeClassLabels[finalI][2].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
			}
			//if the user tries to deselect R for eAttribute, it checks whether R should remain selected, and keeps it selected if necessary 
//			if (!itemCheckBoxes[finalI][1].getSelection()) {
//				keepReadSelected(itemCheckBoxes, finalI, finalJ, item, itemLabels);
//			}
			//we iterate through the checkboxes of a particular role (finalI) for a particular tree item (the EAttribute)
			for (int i = 0; i < 4; i++) {
				//if it is not checkbox R and if the checkbox itself is not being deselected
				if (i != 1 && !itemCheckBoxes[finalI][i].getSelection()) {
					itemLabels[finalI][i].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
				}
				
			}
		}
	}




	public void keepReadSelected(Button[][] itemCheckBoxes, int finalI, int finalJ, TreeItem item, Label[][] itemLabels) {
		if (itemCheckBoxes[finalI][0].getSelection() || (itemCheckBoxes[finalI][2].getSelection() && item.getData() instanceof EAttribute) || itemCheckBoxes[finalI][3].getSelection() || anyChildChecked(finalI, item)) {
			itemCheckBoxes[finalI][1].setSelection(true);
			itemLabels[finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
		} else {
			if (!itemCheckBoxes[finalI][1].getSelection()) {
				itemLabels[finalI][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
			}
		}
	}

	private TreeItem findTreeItemByEClass(EClass eClass) {
		// Start at the root of the tree and use recursion to find the item
		for (TreeItem item : tree.getItems()) {
			TreeItem foundItem = findTreeItemByEClassInSubtree(item, eClass);
			if (foundItem != null) {
				return foundItem;
			}
		}
		return null; // Not found
	}

	private TreeItem findTreeItemByEClassInSubtree(TreeItem subtreeRoot, EClass eClass) {
		EObject subtreeRootData = (EObject) subtreeRoot.getData();
		if (subtreeRootData instanceof EClassImpl) {
			if (subtreeRootData.equals(eClass)) {
				return subtreeRoot;
			}
		}

		// Recur on children
		for (TreeItem child : subtreeRoot.getItems()) {
			TreeItem foundItem = findTreeItemByEClassInSubtree(child, eClass);
			if (foundItem != null) {
				return foundItem;
			}
		}

		return null; // Not found in this subtree
	}
	
	private TreeItem findTreeItemByEnum(EEnum enumi) {
		// Start at the root of the tree and use recursion to find the item
		for (TreeItem item : tree.getItems()) {
			TreeItem foundItem = findTreeItemByEnumInSubtree(item, enumi);
			if (foundItem != null) {
				return foundItem;
			}
		}
		return null; // Not found
	}

	private TreeItem findTreeItemByEnumInSubtree(TreeItem subtreeRoot, EEnum enumi) {
		EObject subtreeRootData = (EObject) subtreeRoot.getData();
		if (subtreeRootData instanceof EEnumImpl) {
			if (subtreeRootData.equals(enumi)) {
				return subtreeRoot;
			}
		}

		// Recur on children
		for (TreeItem child : subtreeRoot.getItems()) {
			TreeItem foundItem = findTreeItemByEnumInSubtree(child, enumi);
			if (foundItem != null) {
				return foundItem;
			}
		}

		return null; // Not found in this subtree
	}

	// Helper method to find all TreeItems representing EReferences that reference a
	// given EClass
	private java.util.List<TreeItem> findTreeItemsByEReferences(EClass eClass) {
		java.util.List<TreeItem> eReferenceItems = new java.util.ArrayList<>();

		for (TreeItem item : tree.getItems()) {
			findTreeItemsByEReferencesInSubtree(item, eClass, eReferenceItems);
		}

		return eReferenceItems;
	}

	private void findTreeItemsByEReferencesInSubtree(TreeItem subtreeRoot, EClass eClass,
			java.util.List<TreeItem> eReferenceItems) {
		EObject subtreeRootData = (EObject) subtreeRoot.getData();

		if (subtreeRootData instanceof EReference) {
			EReference eReference = (EReference) subtreeRootData;
			if (eReference.getEReferenceType() == eClass) {
				eReferenceItems.add(subtreeRoot);
			}
		}

		for (TreeItem child : subtreeRoot.getItems()) {
			findTreeItemsByEReferencesInSubtree(child, eClass, eReferenceItems);
		}
	}

	private boolean anyChildChecked(int columnIndex, TreeItem item) {
		for (TreeItem child : item.getItems()) {
			Button[][] childCheckBoxes = checkBoxes.get(child);
			if (childCheckBoxes != null && childCheckBoxes[columnIndex][1].getSelection()) {
				return true;
			}
		}
		return false;
	}

	// if R or U checkbox is selected for an EAttribute or EReference, the R
	// checkbox of parent EClass is automatically selected
	private void selectReadHierarchy(int columnIndex, Button checkBox, TreeItem item, Label label) {
		if (checkBox.getSelection()) {
			TreeItem parentItem = item.getParentItem();
			while (parentItem != null) { // Go through all ancestors
				Button[][] parentCheckBoxes = checkBoxes.get(parentItem);
				Label[][] parentLabels = labels.get(parentItem);
				if (parentCheckBoxes != null && !parentCheckBoxes[columnIndex][1].getSelection()) {
					parentCheckBoxes[columnIndex][1].setSelection(true);
					parentLabels[columnIndex][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
					eClassCheckboxIsSelected((EClass)parentItem.getData(), columnIndex, 1, checkBox, label, parentLabels, parentItem, parentCheckBoxes);
				}
                
				parentItem = parentItem.getParentItem();
			}
		}
	}

	private void autoSelectRead(int columnIndex, TreeItem item) { // New method for auto selection of the "Read"
		// checkbox
		Button[][] itemCheckBoxes = checkBoxes.get(item);
		Label[][] itemLabels = labels.get(item);
		if (itemCheckBoxes != null && !itemCheckBoxes[columnIndex][1].getSelection()
				&& (itemCheckBoxes[columnIndex][0].getSelection() || itemCheckBoxes[columnIndex][2].getSelection()
						|| itemCheckBoxes[columnIndex][3].getSelection())) {
			itemCheckBoxes[columnIndex][1].setSelection(true);
			itemLabels[columnIndex][1].setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
		}
	}
	
	// Updated method to check for C, U, or D checkboxes for siblings and itself
	// Updated method to check for C, U, or D checkboxes for siblings and itself
	public boolean areAnySiblingsOrSelfSelected(Button[][] checkBoxesi, int finalI, TreeItem item) {
	    TreeItem parentItem = item.getParentItem();

	    if (parentItem != null) {
	        for (TreeItem sibling : parentItem.getItems()) {

	        	if (sibling != item) {
	        		Button[][] siblingCheckBoxes = checkBoxes.get(sibling);
	    			Label[][] containingeClassLabels = labels.get(sibling);
	                if (siblingCheckBoxes[finalI][0].getSelection() ||
	                		siblingCheckBoxes[finalI][2].getSelection() ||
	                		siblingCheckBoxes[finalI][3].getSelection()) {

	                    return true;
	                }
	            }
	        }
	    }
	 
	    // Check C, U, or D checkboxes for the EReference or EAttribute itself
	   if(item.getData() instanceof EReference || item.getData() instanceof EAttribute) {
	    if (checkBoxesi[finalI][0].getSelection() ||
	        checkBoxesi[finalI][2].getSelection() ||
	        checkBoxesi[finalI][3].getSelection()) {

	  

	        return true;
	    }
	   }
	    

	    return false;
	}

	public boolean areAnySiblingsOrSelfSelected2(Button[][] checkBoxesi, int finalI, TreeItem item) {
	    TreeItem parentItem = item.getParentItem();

	    if (parentItem != null) {
	        for (TreeItem sibling : parentItem.getItems()) {

	        	if (sibling != item) {
	        		Button[][] siblingCheckBoxes = checkBoxes.get(sibling);
	    			Label[][] containingeClassLabels = labels.get(sibling);
	                if (siblingCheckBoxes[finalI][0].getSelection() ||
	                		siblingCheckBoxes[finalI][2].getSelection() ||
	                		siblingCheckBoxes[finalI][3].getSelection()) {

	                    return true;
	                }
	            }
	        }
	    }
	 
	  Button [][] itemCheck = checkBoxes.get(item);
	    // Check C, U, or D checkboxes for the EReference or EAttribute itself
	   if(item.getData() instanceof EReference || item.getData() instanceof EAttribute) {
	    if (itemCheck[finalI][0].getSelection() ||
	    		itemCheck[finalI][2].getSelection() ||
	    		itemCheck[finalI][3].getSelection()) {


	        return true;
	    }
	   }
	    

	    return false;
	}




	// Don't forget to dispose of the image when it's no longer needed
	@Override
	public void dispose() {
		for (TreeItem item : tree.getItems()) {
			item.getImage().dispose();
		}
		super.dispose();
	}

	/**
	 * Checks if the control can be flipped to the next page
	 *
	 * @return true/false
	 */
	public boolean canFlipToNextPage() {
		return false;
	}

	/**
	 * Process the events: when the user has entered all information the wizard can
	 * be finished
	 */
	public void handleEvent(Event e) {
		setPageComplete(isPageComplete());
		getWizard().getContainer().updateButtons();
	}

	/**
	 * Sets the completed field on the wizard class when all the information is
	 * entered and the wizard can be completed
	 */
	public boolean isPageComplete() {
		ViewWizard wizard = (ViewWizard) getWizard();
		saveDataToModel();
		return true;
	}

	/**
	 * Saves the uses choices from this page to the model. Called on exit of the
	 * page
	 */
	private void saveDataToModel() {
		ViewWizard wizard = (ViewWizard) getWizard();
	}

	/**
	 * Flips to the next wizard page
	
	public IWizardPage getNextPage() {
		IWizardPage page = null;
		page = ((ViewWizard) getWizard()).finalPage;
		((FinalPage) page).onEnterPage();
		return page;
	}
	 */


	public Button[][] getCheckBoxesForTreeItem(TreeItem treeItem) {
	    return checkBoxes.get(treeItem);
	}

	public Label[][] getLabelsForTreeItem(TreeItem treeItem) {
	    return labels.get(treeItem);
	}

}

