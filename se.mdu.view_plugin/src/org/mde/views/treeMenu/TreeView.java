package org.mde.views.treeMenu;


import java.util.Collections;

//import javax.annotation.Resources;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.mde.views.data.EcoreElem;
import org.mde.views.data.EcoreList;

/** Class defining the tree view for view elements selection 
*
* @author Federico Ciccozzi
*/
public class TreeView {
	
	public static final int EPACKAGE=1;
	public static final int ECLASS=2;
	public static final int EOPERATION=3;
	public static final int EREFERENCE=4;
	public static final int EATTRIBUTE=5;
	public static final int EANNOTATION=6;
	public static final int EENUMERATION=7;
	public static final int EENUMLIT=8;
	public static final int EDATATYPE=9;
	
	  public TreeView(final IPath path) {
		  try{
			final Display display = Display.getDefault();
			final Shell shell = new Shell(display);
			shell.setText("Select your view elements");
			shell.setLayout(new FillLayout(SWT.VERTICAL));
			final Tree tree = new Tree(shell, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
			tree.setLayoutData(new GridData(GridData.FILL_BOTH));
			
			final Button b = new Button(shell, SWT.PUSH | SWT.BORDER);
		    b.setText("Create View");
		    b.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		    b.setSize(30, 30);
			////////////////////////////////	  
			ResourceSet resourceSet = new ResourceSetImpl(); 
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",new 
			org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl()); 
			URI fileURI=URI.createFileURI(path.toString());
			///////////////////////////////
			final Resource resource=resourceSet.getResource(fileURI,true);
			
			final URI fileURI_new=URI.createFileURI((path.removeFileExtension()).toString()+"_NEW.ecore");
/*
			ResourceSet resourceSet_new = new ResourceSetImpl(); 
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",new 
			org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl()); 
			URI fileURI_new=URI.createFileURI((path.removeFileExtension()).toString()+"_NEW.ecore");
			resource.setURI(uri)
			final Resource resource_new = resourceSet_new.createResource(fileURI_new);
*/
			TreeIterator iterTree = resource.getAllContents();
			TreeItem root = null;
			EcoreList lista = new EcoreList();
			while(iterTree.hasNext()){
				//Object temp = iterTree.next();
				//for(int k=0;k<temp.getClass().getFields().length;k++){
					//item.setText((temp.getClass().getFields()[k]).getClass().toString());
					String label = "void";
					Object temp = iterTree.next();
					boolean isRoot = false;
					int tipo = caster(temp.getClass().getSimpleName());
					//System.out.println(temp.getClass().getSimpleName()+" "+tipo);
					switch(tipo) {
						/*case EPACKAGE:
							label = ((EPackageImpl)temp).getName();
							break;*/
						case ECLASS:
							label = "EClass: "+((EClassImpl)temp).getName();
							isRoot = true;
							lista.addEcoreElem(new EcoreElem("EClassImpl",((EClassImpl)temp).getName(), (EObject)temp));
							//EcoreUtil.delete((EObject)temp);
							//System.out.println(temp.hashCode());
							break;
						case EOPERATION:
							label = "EOperation: "+((EOperationImpl)temp).getName();
							lista.addEcoreElem(new EcoreElem("EOperationImpl",((EOperationImpl)temp).getName(), (EObject)temp));
							break;
						case EREFERENCE:
							label = "EReference: "+((EReferenceImpl)temp).getName();
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
						item.setText(label);
					}
			}
			tree.setSize(390, 380);
		    tree.addListener(SWT.Selection, new Listener() {
		      public void handleEvent(Event event) {
	        String string = event.detail == SWT.CHECK ? "Checked"
	            : "Selected";
	        
	        /*Check Parent Item*/
	        if((((TreeItem)(event.item)).getChecked())&&(((TreeItem)(event.item)).getParentItem())!=null){
	        	((TreeItem)(event.item)).getParentItem().setChecked(true);
	        	//((TreeItem)(event.item)).getParentItem()
	        } 
	      }
	    });
		    
		    b.addSelectionListener(new SelectionAdapter() {
		        public void widgetSelected(SelectionEvent e) {
		        	try{
		        		for(int i = 0; i < tree.getItemCount(); i++){
		        			TreeItem rootItem = tree.getItem(i);
		        			if(!rootItem.getChecked())
		        				EcoreUtil.delete((EObject)(rootItem.getData()));
		        			for(int j = 0; j < rootItem.getItemCount(); j++){
			        			TreeItem childItem = rootItem.getItem(j);
			        			if(!childItem.getChecked())
			        				EcoreUtil.delete((EObject)(childItem.getData()));
			        		}
		        			//EcoreUtil.delete((EObject)temp);
		        		}
		        		//System.out.println("NEW VIEW\n");
		        		resource.setURI(fileURI_new);
		        		resource.save(Collections.EMPTY_MAP);
		        		
		        		IFolder f  = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
		        		
		        		//System.out.println("REFRESH: " + f.toString());
		        		f.refreshLocal(IResource.DEPTH_INFINITE, null);
		        		writeError(shell,checkSelection(tree));
		        		//resource.save(System.out,Collections.EMPTY_MAP);
		        	}catch(Exception ex){}
		          }
		        });
		shell.setLayout(new GridLayout(1, true));
	    shell.setSize(400, 400);
	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    display.dispose();
	    }catch(Exception ex){ex.printStackTrace();}
	  }
	  
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
		  else{
			  	return 0;}
	  }

	  private void writeError(Shell shell, String text){
			MessageDialog.openWarning(shell, "Inconsistencies in the selected View", text);
	  }
	  
	  private String checkSelection(Tree tree){
		  String result = "";
		  int index = 1;
		  try{
      		for(int i = 0; i < tree.getItemCount(); i++){
      			TreeItem rootItem = tree.getItem(i);
      			EObject rootData = ((EObject)rootItem.getData());
      			if(rootItem.getChecked())
      				for(int j = 0; j < rootItem.getItemCount(); j++){
	        			TreeItem childItem = rootItem.getItem(j);
	        			EObject childData = ((EObject)childItem.getData());
	        			if(!childItem.getChecked()&&((ETypedElement)childData).getLowerBound()>0){
	        				result = result + index + ". '" + childItem.getText() + "' is needed by '" + rootItem.getText() + "'\n";
	        				index++;
	        			}
	        		}
      		}
      	}catch(Exception ex){
      		return "Error: " + ex.getMessage();
      	}
		  return result;
	  }
}

	