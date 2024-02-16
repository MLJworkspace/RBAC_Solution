package org.mde.views.wizard;

import java.util.Collections;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EAnnotationImpl;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.impl.EEnumLiteralImpl;
import org.eclipse.emf.ecore.impl.EOperationImpl;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.mde.views.data.EcoreElem;
import org.mde.views.data.EcoreList;
import org.mde.views.treeMenu.TreeView;

/** Class defining presentation and business layer of
* the wizard page for the selection of meta-model items to be part
* of the customized view
* @author Federico Ciccozzi
*/
public class SelectionPage extends WizardPage implements Listener
{

	public static final int EPACKAGE=1;
	public static final int ECLASS=2;
	public static final int EOPERATION=3;
	public static final int EREFERENCE=4;
	public static final int EATTRIBUTE=5;
	public static final int EANNOTATION=6;
	public static final int EENUMERATION=7;
	public static final int EENUMLIT=8;
	public static final int EDATATYPE=9;
	
	private static Resource resource;
	private static Tree tree;
	EcoreList lista = new EcoreList();
		
	
	public SelectionPage(String arg0) {
		super(arg0);
		
		setTitle("Select view elements");
		setDescription("Select which elements of the meta-model you want to have in the view");
		
	}

	/**
	 * Business layer for the page
	 */
	public void createControl(Composite parent) 
	{   
		
	    // create the composite to hold the widgets
	    Composite composite = new Composite(parent, SWT.NONE);
	    
	    // create the desired layout for this wizard page
	    GridLayout gl = new GridLayout();
	    int ncol = 1;
	    gl.numColumns = ncol;
	    composite.setLayout(gl);
	    
	    //add selection tree
	    try{
		    tree = new Tree(composite, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
			tree.setLayoutData(new GridData(GridData.FILL_BOTH));
			
			tree.setHeaderVisible(true);
		    
		    TreeColumn column2 = new TreeColumn(tree, SWT.CENTER);
		    column2.setText("Meta-Model Element");
		    column2.setWidth(200);
		    TreeColumn column3 = new TreeColumn(tree, SWT.CENTER);
		    column3.setText("Reference Destination Element");
		    column3.setWidth(200);
			
			ResourceSet resourceSet = new ResourceSetImpl(); 
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",new 
			org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl()); 
			URI fileURI=URI.createFileURI(((ViewWizard)getWizard()).path.toString());
			resource=resourceSet.getResource(fileURI,true);
			
			TreeIterator iterTree = resource.getAllContents();
			TreeItem root = null;
			//EcoreList lista = new EcoreList();
			while(iterTree.hasNext()){
				String label = "void";
				Object temp = iterTree.next();
				boolean isRoot = false, isRef = false;
				int tipo = caster(temp.getClass().getSimpleName());
				//create items from meta-model elements to be added to the view tree
				switch(tipo) {
					case EPACKAGE:
						ViewWizard wizard = (ViewWizard)getWizard();
						  EPackageImpl ePackageImpl = (EPackageImpl) temp;			            
				            // Set the name, nsPrefix, and nsURI for the EPackageImpl
				            ePackageImpl.setName(wizard.model.viewName);
				            ePackageImpl.setNsPrefix(wizard.model.ns);
				            ePackageImpl.setNsURI(wizard.model.nsURI);
						break;
					case ECLASS:
							label = "EClass: "+((EClassImpl)temp).getName();
							isRoot = true;
							lista.addEcoreElem(new EcoreElem("EClassImpl",((EClassImpl)temp).getName(), (EObject)temp));
							break;
					case EOPERATION:
							label = "EOperation: "+((EOperationImpl)temp).getName();
							lista.addEcoreElem(new EcoreElem("EOperationImpl",((EOperationImpl)temp).getName(), (EObject)temp));
							break;
					case EREFERENCE:
							label = "EReference: "+((EReferenceImpl)temp).getName();
							isRef = true;
							lista.addEcoreElem(new EcoreElem("EReferenceImpl",((EReferenceImpl)temp).getName(),(EObject)temp));
							break;
					case EATTRIBUTE:
							label = "EAttribute: "+((EAttributeImpl)temp).getName();
							lista.addEcoreElem(new EcoreElem("EAttributeImpl",((EAttributeImpl)temp).getName(),(EObject)temp));
							break;
					case EANNOTATION:
							label = "EAnnotation: "+((EAnnotationImpl)temp).getSource();
							isRoot = true;
							lista.addEcoreElem(new EcoreElem("EAnnotationImpl",((EAnnotationImpl)temp).getSource(),(EObject)temp));
							break;
					case EDATATYPE:
							label = "EDataType: "+((EDataTypeImpl)temp).getName();
							isRoot = true;
							lista.addEcoreElem(new EcoreElem("EDataTypeImpl",((EDataTypeImpl)temp).getName(),(EObject)temp));
							break;
					case EENUMERATION:
							label = "EEnumeration: "+((EEnumImpl)temp).getName();
							isRoot = true;
							lista.addEcoreElem(new EcoreElem("EEnumImpl",((EEnumImpl)temp).getName(),(EObject)temp));
							break;
					case EENUMLIT:
							label = "EEnumLiteral: "+((EEnumLiteralImpl)temp).getName();
							lista.addEcoreElem(new EcoreElem("EEnumLiteralImpl",((EEnumLiteralImpl)temp).getName(),(EObject)temp));
							break;
					default:
					}
				
				//add items to the view tree
				if (!label.equals("void")){
					TreeItem item;
					if(!isRoot){
						item = new TreeItem(root, SWT.NONE);
					}
					else{ 
						item = new TreeItem(tree, SWT.NONE);
						root = item;
					}
					item.setData((EObject)temp);
					if(isRef)
						item.setText(new String[]{label, ((EReferenceImpl)temp).getEType().getName()});
					else item.setText(new String[]{label, ""});
				}
		}
		tree.setSize(400, 380);
		
		//control routine for the items selection
		   tree.addListener(SWT.Selection, new Listener() {
		     public void handleEvent(Event event) {
		    	 ViewWizard wizard = (ViewWizard)getWizard();
		 		ViewModel model = wizard.model;
		 		model.isComplete = false;
	      if(event.detail == SWT.CHECK){
	       TreeItem item = (TreeItem)(event.item);
	        
	        //Check Parent Item
	        if(item.getChecked()&&item.getParentItem()!=null){
	        	item.getParentItem().setChecked(true);
	        }
	        //Check Children
	        if(!item.getChecked()&&item.getItemCount()>0){
	        	for(int i=0; i<item.getItemCount(); i++)
	        	 item.getItem(i).setChecked(false);
	        	item.setExpanded(false);
	        }
	        }
		    }
	    });
	    }catch(Exception ex){
	    	ex.printStackTrace();
	    }
	    
	    setControl(composite);
	}
	
	

    /**
     * Process the events: when the user has entered all information
     * the wizard can be finished
     */
	public void handleEvent(Event e)
	{
		getWizard().getContainer().updateButtons();
	}
	
	/**
	 * Flips to the next wizard page
	 */
	public IWizardPage getNextPage()
	{    		
		saveDataToModel();
		String result = checkSelection(tree);
		ViewWizard wizard = (ViewWizard)getWizard();
		wizard.lista = lista;
		IWizardPage page = null;
		if(!wizard.model.isComplete){
			page = ((ViewWizard)getWizard()).checkPage;
			((CheckPage)page).checkText.setText(result);
		}else{
			page = ((ViewWizard)getWizard()).summaryPage;
			((SummaryPage)page).onEnterPage();			
		}
		return page;
	}
	
	/**
	 * Checks if the control can be flipped to the next page
	 * @return true/false
	 */
	public boolean canFlipToNextPage()
	{
		return true;
	}

	/**
	 * Sets the completed field on the wizard class when all the information 
	 * is entered and the wizard can continue
	 */	 
	public boolean isPageComplete()
	{
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
		wizard.model.tree = tree;
	    wizard.model.resource = resource;
	}
	
	/**
	 * Page initialization operations to be performed when entering the page
	 */
	void onEnterPage()
	{
	    // Gets the model
		ViewWizard wizard = (ViewWizard)getWizard();
		wizard.model.isComplete = false;
	
	}
	
	/**
	 * Support class for recognizing meta-class type
	 * @param typ Meta-class name
	 * @return Meta-class type
	 */
	private int caster(String typ){
		  if (typ.equals("EPackageImpl"))
			  return 1;
		  else
			  if (typ.equals("EClassImpl"))
				  return 2;
		  else
			  if (typ.equals("EOperationImpl"))
				  return 3;  
		  else
			  if (typ.equals("EReferenceImpl"))
				  return 4;
		  else
			  if (typ.equals("EAttributeImpl"))
				  return 5;
		  else
			  if (typ.equals("EAnnotationImpl"))
				  return 6;
		  else
			  if (typ.equals("EEnumImpl"))
				  return 7;
		  else
			  if (typ.equals("EEnumLiteralImpl"))
				  return 8;
		  else
			  if (typ.equals("EDataTypeImpl"))
				  return 9;
		  else return 0;
	  }
	
	/**
	 * Elements selection checking performed before continuing with 
	 * further steps in the wizard
	 * @param View elements tree
	 * @return Result of the view checking
	 */
	private String checkSelection(Tree tree){
		  String result = "";
		  int index = 1;
		  ViewWizard wizard = (ViewWizard)getWizard();
		  ViewModel model = wizard.model;
		  Boolean recheck = false;
		  try{
    		for(int i = 0; i < tree.getItemCount(); i++){
    			TreeItem rootItem = tree.getItem(i);
    			EObject rootData = ((EObject)rootItem.getData());
    			if(rootItem.getChecked()){
    				model.isComplete = true;
    				if(!rootData.getClass().getSimpleName().equals("EEnumImpl"))
    				for(int j = 0; j < rootItem.getItemCount(); j++){
	        			TreeItem childItem = rootItem.getItem(j);
	        			EObject childData = ((EObject)childItem.getData());
	        			// checks for the non-selected ETyped items (e.g. EAttributes) which are needed by the selected 
	        			//items (if auto-selection is disabled)
	        			// rule 1
	        			if(!childItem.getChecked()&&((ETypedElement)childData).getLowerBound()>0){	        		
	        				if(model.auto){
	        					rootItem.setExpanded(true);
	        					childItem.setChecked(true);
	        					recheck = true;
	        				}
	        				else{
	        					//generated the checking result to display to the user
	        					result = result + index + ". '" + childItem.getText() + "' is needed by '" + rootItem.getText() + "'\n";
	        					index++;
	        				}
	        			}
	        			// rule 2
	        			// checks for the non-selected EReference items which are needed by the selected items (if auto-selection is disabled)
	        			if(childData.getClass().getSimpleName().equals("EReferenceImpl")&&((ETypedElement)childData).getLowerBound()>0){
	        				for(int k = 0; k < tree.getItemCount(); k++){
	        	    			TreeItem rootItem2 = tree.getItem(k);
	        	    			EObject rootData2 = ((EObject)rootItem2.getData());
	        	    			if(rootData2.getClass().getSimpleName().equals("EClassImpl")&&
	        	    					((EClassImpl)rootData2).getName().equals(((EReferenceImpl)childData).getEType().getName())&&!rootItem2.getChecked()){
	        	    				if(model.auto){	        
	    	        					rootItem2.setChecked(true);
	    	        					recheck = true;
	        	    				}
	    	        				else{
	    	        					//generated the checking result to display to the user
	    	        					result = result + index + ". '" + rootItem2.getText() + "' is needed by '" + childItem.getText() + "'\n";
	        	    					index++;
	        	    				}
	        	    			}
	        	    		}
	        			}
	        			// rule 3 - added Malvina
	        			// checks for the non-selected EReference items that link two selected EClass items (if auto-selection is disabled)
	        			if(childData.getClass().getSimpleName().equals("EReferenceImpl")&&!childItem.getChecked()){
	        			    EReference ref = (EReference) childData;
	        			    EObject eType = ref.getEType();
	        			    if(eType instanceof EClassImpl && ref.isContainment()) {
	        			        for(int m = 0; m < tree.getItemCount(); m++){
	        			            TreeItem linkedItem = tree.getItem(m);
	        			            EObject linkedData = ((EObject)linkedItem.getData());
	        			            if(linkedData.getClass().getSimpleName().equals("EClassImpl")&&
	        			                ((EClassImpl)linkedData).getName().equals(((EClassImpl)eType).getName())&&linkedItem.getChecked()){
	        			                if(model.auto){
	        			                    childItem.setChecked(true);
	        			                    recheck = true;
	        			                }
	        			                else{
	        			                    result = result + index + ". '" + childItem.getText() + "' links '" + rootItem.getText() + "' and '" + linkedItem.getText() + "'\n";
	        			                    index++;
	        			                }
	        			            }
	        			        }
	        			    }
	        			}

	        		}
    				//rule 4
    				// checks for the non-selected EClass items which are needed by the selected items (if auto-selection is disabled)
    				if(rootData.getClass().getSimpleName().equals("EClassImpl")&&!((EClassImpl)rootData).getESuperTypes().isEmpty()){
        				EList list = ((EClassImpl)rootData).getESuperTypes();
        				for(int h = 0; h < list.size(); h++)
        					for(int l = 0; l < tree.getItemCount(); l++){
        						TreeItem rootItem3 = tree.getItem(l);
            	    			EObject rootData3 = ((EObject)rootItem3.getData());
            	    			if(rootData3.getClass().getSimpleName().equals("EClassImpl")&&
            	    					((EClassImpl)(list.get(h))).getName().equals(((EClassImpl)rootData3).getName())&&!rootItem3.getChecked()){
            	    				if(model.auto){
        	        					rootItem3.setChecked(true);
            	    					recheck = true;
    	        					}
        	        				else{
        	        					//generated the checking result to display to the user
	            	    				result = result + index + ". '" + rootItem3.getText() + "' is needed by '" + rootItem.getText() + "'\n";
	            	    				index++;
	            	    			}
        						}
        					}
        			}
    				//rule 5 - added Malvina
    				// checks for the EClasses which have a containment EReference to another EClass
    				if(rootData.getClass().getSimpleName().equals("EClassImpl")){
    					  for(int h = 0; h < tree.getItemCount(); h++){
    					    TreeItem possibleContainerItem = tree.getItem(h);
    					    EObject possibleContainerData = ((EObject)possibleContainerItem.getData());
    					    if(possibleContainerData.getClass().getSimpleName().equals("EClassImpl")){
    					      EClassImpl possibleContainerClass = (EClassImpl)possibleContainerData;
    					      for(EReference eReference : possibleContainerClass.getEReferences()){
    					        if(eReference.isContainment() && eReference.getEType().getName().equals(((EClassImpl)rootData).getName())){
    					          // Found a containing EClass and its EReference. Now check and possibly select them.
    					          if(!possibleContainerItem.getChecked()){
    					            if(model.auto){
    					              possibleContainerItem.setChecked(true);
    					              recheck = true;
    					            } else{
    					              //generated the checking result to display to the user
    					              result = result + index + ". '" + possibleContainerItem.getText() + "' is needed by '" + rootItem.getText() + "' due to containment.\n";
    					              index++;
    					            }
    					          }
    					          // Now find and select the corresponding EReference in the tree.
    					          for(int j = 0; j < possibleContainerItem.getItemCount(); j++){
    					            TreeItem childItem = possibleContainerItem.getItem(j);
    					            EObject childData = ((EObject)childItem.getData());
    					            if(childData.getClass().getSimpleName().equals("EReferenceImpl") &&
    					              ((EReferenceImpl)childData).getName().equals(eReference.getName()) &&
    					              !childItem.getChecked()){
    					              if(model.auto){
    					                childItem.setChecked(true);
    					                recheck = true;
    					              } else{
    					                //generated the checking result to display to the user
    					                result = result + index + ". Containment EReference '" + childItem.getText() + "' in '" + possibleContainerItem.getText() + "' is needed due to containment.\n";
    					                index++;
    					              }
    					            }
    					          }
    					        }
    					      }
    					    }
    					  }
    					}


    			
    				
    				
    			}
    		}
    		if(result.equals("")){
    			if(model.isComplete)
    				result = "The selected view is ready to be created";
				else{ 
					result = "No valid view has been selected";
					model.isComplete = false;
				}
			}else model.isComplete = false;
    	}catch(Exception ex){
    		return "Error: " + ex.getMessage();
    	}
    	//auto-selection enabled, thus the tree has to be rechecked until all
    	//the needed elements (according to the defined rules in the portions "if(model.auto)..") 
    	//are automatically selected
    	if(recheck) {
    		checkSelection(tree);
    	}
		  return result;
    	
	  }
}
