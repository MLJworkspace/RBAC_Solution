package org.mde.views.wizard;

import org.eclipse.swt.widgets.Label;
import java.io.File;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.impl.EEnumLiteralImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.mde.views.data.EcoreElem;
import org.mde.views.hots.GenerateTransformations;
import org.mde.views.hots.hotsInPlace;
import org.mde.views.transformations.QVToCreateProject;
import org.mde.views.transformations.QVToTransformation;
import org.xtext.example.mapping.MappingStandaloneSetup;
import org.xtext.example.mapping.mapping.HelperStatement;
import org.xtext.example.mapping.mapping.MappingFactory;
import org.xtext.example.mapping.mapping.MappingModel;
import org.xtext.example.mapping.mapping.MappingRule;
import org.xtext.example.mapping.mapping.SourceMetamodel;
import org.xtext.example.mapping.mapping.TargetMetamodel;
import org.mde.views.roleuser.wizard.RolePage;
import org.mde.views.roleuser.wizard.RolePage.Role;

import com.google.inject.Injector;
import org.eclipse.core.resources.IProjectDescription;
import accessControlMetamodel.AccessControlMetamodelFactory;
import accessControlMetamodel.AccessControlMetamodelPackage;
import accessControlMetamodel.AccessControlModel;
import accessControlMetamodel.EAttributePermissions;
import accessControlMetamodel.EClassPermissions;
import accessControlMetamodel.EReferencePermissions;
import accessControlMetamodel.Permissions;

/**
 * Class defining the wizard for the creation of the view
 * 
 * @author Federico Ciccozzi
 * @contributor Malvina Latifaj //generation of mapping model // hots // qvto //
 *              sub-models
 */
public class ViewWizard extends Wizard implements INewWizard {
	// wizard pages
	ViewMainPage viewPage;
	CheckPage checkPage;
	SelectionPage selPage;
	SummaryPage summaryPage;
	FinalPage finalPage;
	RolePage rolePage;

	// view model for storing view data
	ViewModel model;

	IPath path;
	IFile file;

	// workbench selection when the wizard was started
	protected IStructuredSelection selection;

	// the workbench instance
	protected IWorkbench workbench;

	private static Resource resource;
	List<EcoreElem> lista;
	URI ecoreURISource;
	URI ecoreURITarget;
	URI fileURI;
	URI QVToFileURI;
	URI QVToFileURI2Base;
	static PrintStream myWriter;
	EPackage ePackageSource;
	EPackage ePackageTarget;
	String projectName;
	private URI accessControlFileURI;

	/**
	 * Constructor for ViewWizard.
	 * @throws CoreException 
	 */
	public ViewWizard(IPath path, IFile file)  {
		super();
		model = new ViewModel();
		this.path = path;
		this.file = file;

	}
	public ViewModel getModel() {
	    return model;
	}

	public void setModel(ViewModel model) {
	    this.model = model;
	}

	/**
	 * Pages added to the wizard
	 */
	public void addPages() {
		rolePage = new RolePage(workbench, selection);
		viewPage = new ViewMainPage(workbench, selection, rolePage.getRoleList());
		addPage(viewPage);
		selPage = new SelectionPage("");
		addPage(selPage);
		checkPage = new CheckPage("");
		addPage(checkPage);
		summaryPage = new SummaryPage("");
		addPage(summaryPage);
		//finalPage = new FinalPage("");
		//addPage(finalPage);

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

			}
		}
	}

	/**
	 * Checker for view completion
	 */
	public boolean canFinish() {
		if (getContainer().getCurrentPage() == summaryPage && model.isComplete)
			return true;
		else
			return false;
	}

	// Method to find the corresponding feature in the source metamodel
	private EStructuralFeature findCorrespondingSourceFeature(EStructuralFeature targetFeature, EClass sourceClass) {
		for (EStructuralFeature sourceFeature : sourceClass.getEStructuralFeatures()) {
			if (sourceFeature.getName().equals(targetFeature.getName())
					&& sourceFeature.eClass() == targetFeature.eClass()) {
				return sourceFeature;
			}
		}
		return null;
	}

	// Method to find the corresponding classifier in the source metamodel
	private EClassifier findCorrespondingSourceClassifier(EClassifier targetClassifier, EPackage sourcePackage) {
		for (EClassifier sourceClassifier : sourcePackage.getEClassifiers()) {
			if (sourceClassifier.getName().equals(targetClassifier.getName())
					&& sourceClassifier.eClass() == targetClassifier.eClass()) {
				return sourceClassifier;
			}
		}
		return null;
	}
   // Method to generate the mapping model
	
	public void generateMappingModelBase2View(List<EcoreElem> subMetamodel, IPath ecoreProjectPath) {

		// Get XtextResourceSet from injector
		Injector injector = new MappingStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet xtextResourceSet = injector.getInstance(XtextResourceSet.class);

		// Create Mapping Model
		MappingFactory factory = MappingFactory.eINSTANCE;
		MappingModel mappingModel = factory.createMappingModel();

		// Load the EPackage from the source metamodel(main metamodel)
		ecoreURISource = URI.createFileURI(path.toString());
		Resource ecoreResourceSource = xtextResourceSet.getResource(ecoreURISource, true);
		ePackageSource = (EPackage) ecoreResourceSource.getContents().get(0); // Assuming the EPackage is the first root object
		SourceMetamodel sourceMetamodel = factory.createSourceMetamodel();

		// Load the EPackage from the target metamodel(sub metamodel)
		ecoreURITarget = URI.createFileURI(ecoreProjectPath+ "/model/" + model.viewName + ".ecore");
		Resource ecoreResourceTarget = xtextResourceSet.getResource(ecoreURITarget, true);
		ePackageTarget = (EPackage) ecoreResourceTarget.getContents().get(0); // Assuming the EPackage is the first root object
		TargetMetamodel targetMetamodel = factory.createTargetMetamodel();

		// Set name of mapping model
		mappingModel.setName(ePackageSource.getName() + "2" + model.viewName);

		// Set source and target metamodels
		sourceMetamodel.setName(ePackageSource.getName());
		sourceMetamodel.setModel(ePackageSource);
		mappingModel.getSourceMetamodels().add(sourceMetamodel);

		targetMetamodel.setName(model.viewName);
		targetMetamodel.setModel(ePackageTarget);
		mappingModel.getTargetMetamodels().add(targetMetamodel);

		// Create Mapping Rules
		MappingRule parentMappingRule = null;
		/**
		 * We iterate throught the EClassifiers of the target metamode (which is smaller because is the sub-view)
		 * And we find the corresponding Classifier in the source metamodel
		 * Then we create the EClasses and the mapping rule mapping two EClasses
		 */
		for (EClassifier targetClassifier : targetMetamodel.getModel().getEClassifiers()) {
			EClassifier sourceClassifier = findCorrespondingSourceClassifier(targetClassifier,sourceMetamodel.getModel());

			if (sourceClassifier != null && sourceClassifier instanceof EClass && targetClassifier instanceof EClass) {
				EClass sourceEClass = (EClass) sourceClassifier;
				EClass targetEClass = (EClass) targetClassifier;

				// Create parent mapping rule
				parentMappingRule = factory.createMappingRule();
				parentMappingRule.setSource(sourceEClass);
				parentMappingRule.setTarget(targetEClass);
				String identifier = summaryPage.getSelectedEAttributeName(targetEClass);
				System.out.println("Identifier: " + identifier);
				if (identifier != null) {
				    parentMappingRule.setIdentifier(identifier);
				}
				mappingModel.getRules().add(parentMappingRule);
				/**
				 * We iterate through the features of the target EClass
				 * Find the corresponding feature in the source EClass
				 * Create chld mapping rules and add them to the main mapping rule
				 */

				for (EStructuralFeature targetFeature : targetEClass.getEStructuralFeatures()) {
					EStructuralFeature sourceFeature = findCorrespondingSourceFeature(targetFeature, sourceEClass);

					if (sourceFeature != null) {
						
						if (sourceFeature instanceof EAttribute) {
							if (((EAttribute)sourceFeature).getEType() instanceof EEnum) {
								EEnum eEnum = (EEnum) ((EAttribute) sourceFeature).getEType();
					              System.out.println("Kush eshte Enum: " + eEnum);
					            for (EEnumLiteral eEnumLiteral : eEnum.getELiterals()) {
					            	HelperStatement helper = factory.createHelperStatement();
					            	helper.setStatement("if(self." + targetFeature.getName() + " = " +sourceMetamodel.getName() +" :: "+eEnum.getName()+ " :: " + eEnumLiteral +")");
					            	parentMappingRule.getChildHelpers().add(helper);
					                MappingRule enumLiteralMappingRule = factory.createMappingRule();
					                System.out.println("Kush eshte EnumLiteral: " + eEnumLiteral);
					              
					                enumLiteralMappingRule.setSource(eEnum); 	
					                enumLiteralMappingRule.setEEnumLiteral(eEnumLiteral);
					                enumLiteralMappingRule.setTarget(targetFeature); 
					                helper.getChildRules().add(enumLiteralMappingRule);
					                //parentMappingRule.getChildRules().add(enumLiteralMappingRule);
							}
							}
							else {
								MappingRule childMappingRule = factory.createMappingRule();
								childMappingRule.setSource(sourceFeature);
								childMappingRule.setTarget(targetFeature);
								parentMappingRule.getChildRules().add(childMappingRule);
							}
						}
						else {
							MappingRule childMappingRule = factory.createMappingRule();
							childMappingRule.setSource(sourceFeature);
							childMappingRule.setTarget(targetFeature);
							parentMappingRule.getChildRules().add(childMappingRule);
						}
					}
			
				}
			}
		}
        // Create the URI of the file containing the mapping model 
		fileURI = URI.createFileURI(path.removeLastSegments(1).toString() + "/MappingModel/" + ePackageSource.getName() + "2" + model.viewName + ".mapping");

		// Create a resource for this file.
		resource = xtextResourceSet.createResource(fileURI);

		// Add the first model object to the contents.
		resource.getContents().add(mappingModel);

		// Now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	

	

	public void generateAccessControlModel(SummaryPage summaryPage) {
		//GetResourceSet from the injector
		
		Injector injector = new MappingStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet ResourceSet = injector.getInstance(ResourceSet.class);
		
        for (Role role: model.selectedRoles) {
		// Create AccessControlModel
		AccessControlMetamodelFactory accessControlMetamodelFactory = AccessControlMetamodelFactory.eINSTANCE;
		AccessControlModel accessControlModel = accessControlMetamodelFactory.createAccessControlModel();

		// Set the name attribute of the AccessControlModel
		accessControlModel.setName(model.viewName + "_" + role.getRoleName());
		accessControlModel.setRole(role.getRoleName());
        
		//Retrieve the treeItems shown in the wizard
		TreeItem[] treeItems = summaryPage.getTree().getItems();

		/**
		 * Iterate through the treeItems
		 * Based on their type create either an EClassPermission, EAttributePermission, or EReferencePermission (these are all EClasses)
		 * Set the values for all the features of the created EClasses
		 */
		for (TreeItem item : treeItems) {
			EObject itemData = (EObject) item.getData();

			if (itemData instanceof EClass) {
				EClass eClass = (EClass) itemData;
				EClassPermissions eClassPermissions = accessControlMetamodelFactory.createEClassPermissions();
				eClassPermissions.setName(eClass.getName());
				eClassPermissions.setEClass(eClass);
				eClassPermissions.getPermissions().clear();

				// Get checkboxes and labels for this tree item
				Button[][] itemCheckBoxes = summaryPage.getCheckBoxesForTreeItem(item);
				Label[][] itemLabels = summaryPage.getLabelsForTreeItem(item);

				// Check all four checkboxes and labels for each role
				for (int i = 0; i < model.selectedRoles.size(); i++) {
					for (int j = 0; j < 4; j++) {
						if (itemCheckBoxes[i][j].getSelection()) {
							String label = itemLabels[i][j].getText();
							if (label.equals("R")) {
								eClassPermissions.getPermissions().add(Permissions.READ);
							}
							if (label.equals("C")) {
								eClassPermissions.getPermissions().add(Permissions.CREATE);
							}
							if (label.equals("U")) {
								eClassPermissions.getPermissions().add(Permissions.UPDATE);
							}
							if (label.equals("D")) {
								eClassPermissions.getPermissions().add(Permissions.DELETE);
							}
						}
					}
				}

				// Check if the child TreeItems are EAttributes or EReferences
				for (TreeItem childItem : item.getItems()) {
					EObject childItemData = (EObject) childItem.getData();
					if (childItemData instanceof EAttribute) {
						EAttribute eAttribute = (EAttribute) childItemData;
						EAttributePermissions eAttributePermissions = accessControlMetamodelFactory
								.createEAttributePermissions();
						eAttributePermissions.setName(eAttribute.getName());
						eAttributePermissions.setEAttribute(eAttribute);
						eAttributePermissions.getPermissions().clear();
						// Get checkboxes and labels for this tree item
						Button[][] itemCheckBoxesAtt = summaryPage.getCheckBoxesForTreeItem(childItem);
						Label[][] itemLabelsAtt = summaryPage.getLabelsForTreeItem(childItem);

						// Check all four checkboxes and labels for each role
						for (int i = 0; i < model.selectedRoles.size(); i++) {
							for (int j = 0; j < 4; j++) {
								if (itemCheckBoxesAtt[i][j].getSelection()) {
									String label = itemLabelsAtt[i][j].getText();
									if (label.equals("R")) {
										eAttributePermissions.getPermissions().add(Permissions.READ);
									}
									if (label.equals("C")) {
										eAttributePermissions.getPermissions().add(Permissions.CREATE);
									}
									if (label.equals("U")) {
										eAttributePermissions.getPermissions().add(Permissions.UPDATE);
									}
									if (label.equals("D")) {
										eAttributePermissions.getPermissions().add(Permissions.DELETE);
									}
								}
							}
						}
						eClassPermissions.getEattributepermissions().add(eAttributePermissions);

					} else if (childItemData instanceof EReference) {
						EReference eReference = (EReference) childItemData;
						EReferencePermissions eReferencePermissions = accessControlMetamodelFactory
								.createEReferencePermissions();
						eReferencePermissions.setName(eReference.getName());
						eReferencePermissions.setEReference(eReference);
						eReferencePermissions.getPermissions().clear();
						// Get checkboxes and labels for this tree item
						Button[][] itemCheckBoxesRef = summaryPage.getCheckBoxesForTreeItem(childItem);
						Label[][] itemLabelsRef = summaryPage.getLabelsForTreeItem(childItem);

						// Check all four checkboxes and labels for each role
						for (int i = 0; i < model.selectedRoles.size(); i++) {
							for (int j = 0; j < 4; j++) {
								if (itemCheckBoxesRef[i][j].getSelection()) {
									String label = itemLabelsRef[i][j].getText();
									if (label.equals("R")) {
										eReferencePermissions.getPermissions().add(Permissions.READ);
									}
									if (label.equals("C")) {
										eReferencePermissions.getPermissions().add(Permissions.CREATE);
									}
									if (label.equals("U")) {
										eReferencePermissions.getPermissions().add(Permissions.UPDATE);
									}
									if (label.equals("D")) {
										eReferencePermissions.getPermissions().add(Permissions.DELETE);
									}
								}
							}
						}
						eClassPermissions.getEreferencepermissions().add(eReferencePermissions);
					}
					
					
					
					
					
				}
				accessControlModel.getEclasspermissions().add(eClassPermissions);
			}
			
			
			
			
			
		}

		//Create the fileURI for the file containing the access control model
		accessControlFileURI = URI.createFileURI(path.removeLastSegments(1).toString() + "/AccessControlModel/"+ model.viewName + "_" + role.getRoleName() + ".accesscontrolmetamodel");

		// Create a resource for this file.
		Resource accessControlResource = ResourceSet.createResource(accessControlFileURI);

		// Add the first model object to the contents.
		accessControlResource.getContents().add(accessControlModel);

		// Now save the content.
		try {
			accessControlResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	}
	/**
	 * Finalize the wizard and the newly created view
	 */

	// First we create the view by removing the elements that are not checked.
	// Then we generate the mapping model
	// Then we programmatically create a QVTo project.
	// add another page that allows you to select the model for which you want to
	// generate submodels
	public boolean performFinish() {
		try {
			List<EcoreElem> remainingElements = new ArrayList<>();

			for (int i = 0; i < model.tree.getItemCount(); i++) {
				TreeItem rootItem = model.tree.getItem(i);
				if (rootItem.getChecked()) {
					EObject rootData = (EObject) rootItem.getData();
					EcoreElem rootElem = createEcoreElem(rootData);
					remainingElements.add(rootElem);
				} else {
					EcoreUtil.delete((EObject) rootItem.getData());
				}

				for (int j = 0; j < rootItem.getItemCount(); j++) {
					TreeItem childItem = rootItem.getItem(j);
					if (childItem.getChecked()) {
						EObject childData = (EObject) childItem.getData();
						EcoreElem childElem = createEcoreElem(childData);
						remainingElements.add(childElem);
					} else {
						EcoreUtil.delete((EObject) childItem.getData());
					}
				}
			}	
			CreateEcoreModelingProject ecoreProject = new CreateEcoreModelingProject();
			ecoreProject.createProjectWithNaturesAndStructure(model.viewName);
			IProject ecoreproject = ecoreProject.getProject(model.viewName);
			IPath ecoreProjectPath = ecoreproject.getLocation();
			final URI fileURI_new = URI.createFileURI(ecoreProjectPath+"/model/" + model.viewName + ".ecore");
			model.resource.setURI(fileURI_new);
			model.resource.save(Collections.EMPTY_MAP);
			final URI genModelURI = URI.createFileURI(ecoreProjectPath+"/model/" + model.viewName + ".genmodel");
			GenModelGenerator genModelGen = new GenModelGenerator();
			URI accessControlFileURIGM = URI.createFileURI(path.removeLastSegments(1).toString() + "/AccessControlModel/"+ model.viewName + "_" + ((Role)model.selectedRoles.get(0)).getRoleName() +".accesscontrolmetamodel");
			System.out.println(accessControlFileURIGM);
			genModelGen.generateGenModel(fileURI_new.toString(),genModelURI.toString(),model.viewName, accessControlFileURIGM.toFileString());

			
			// generate mapping model
			generateMappingModelBase2View(remainingElements,ecoreProjectPath);
			remainingElements.clear();
			
			// Resolve and register the source and target metamodels
			Registry packageRegistry = EPackage.Registry.INSTANCE;
			packageRegistry.put(ePackageSource.getNsURI(), ePackageSource);
			packageRegistry.put(ePackageTarget.getNsURI(), ePackageTarget);
            
			
			// Create QVTo project
			QVToCreateProject QVToProject = new QVToCreateProject();
			QVToProject.createProject(ePackageSource.getName() + "2" + model.viewName);
			URI projectPath = getProjectURI(ePackageSource.getName() + "2" + model.viewName);

			// Create QVToFile and refresh the workspace to recognize the file
			String QVToFileName = (projectPath.toFileString() + "/transforms/" + ePackageSource.getName() + "2" + model.viewName + ".qvto");
			QVToFileURI = URI.createFileURI(new File(QVToFileName).getAbsolutePath());
			IFile QVToFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(QVToFileName));
			QVToFile.refreshLocal(IResource.DEPTH_ZERO, null);
			refreshWorkspace();
			
			
			
			// Create QVToFile and refresh the workspace to recognize the file
			String QVToFileName2Base = (projectPath.toFileString() + "/transforms/" + model.viewName + "2" + ePackageSource.getName()+ ".qvto");
			QVToFileURI2Base = URI.createFileURI(new File(QVToFileName2Base).getAbsolutePath());
			IFile QVToFile2Base = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(QVToFileName2Base));
			QVToFile2Base.refreshLocal(IResource.DEPTH_ZERO, null);
			refreshWorkspace();
			// Resolve and register the source and target metamodels

			packageRegistry.put(ePackageSource.getNsURI(), ePackageSource);
			packageRegistry.put(ePackageTarget.getNsURI(), ePackageTarget);
            
			myWriter = new PrintStream(QVToFileURI.toFileString());
			System.setOut(myWriter);
			
			// Run higher-order transformation for generating base2view transformation
			GenerateTransformations hots = new GenerateTransformations();
			hots.doEMFSetup(fileURI.toFileString(), ecoreURISource.toFileString(), ecoreURITarget.toFileString());
            String targetModel = (ecoreProjectPath + "/model/" + model.viewName + ".xmi");
			QVToTransformation trans = new QVToTransformation();
			//System.out.println("Selectedfilepath : " + model.selectedPath);
			trans.runTransformation(QVToFileName, model.selectedPath, targetModel);
			refreshWorkspace();
	
			myWriter = new PrintStream(QVToFileURI2Base.toFileString());
			System.setOut(myWriter);
			
			hotsInPlace hotsInPlace = new hotsInPlace();
			hotsInPlace.doEMFSetup(fileURI.toFileString(), ecoreURISource.toFileString(), ecoreURITarget.toFileString());
			
			
			refreshWorkspace();
	      //  trans.runTransformation(QVToFileName, sourceModelPath, targetModelPath);
	        refreshWorkspace();
	        
	        
	        
	        
	        MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(), "View Generation",
	                model.viewName + " has been correctly created");


			// get the name of the project where the mapping model is because that is where
			// we have
			// the issues and need to clean the project to resolve the source/target
			// metamodels
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IPath location = Path.fromOSString(resource.getURI().toFileString()); // Absolute path to your file
			IFile file = workspace.getRoot().getFileForLocation(location);

			if (file != null) {
				IProject project = file.getProject();
				projectName = project.getName();
			}

			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			try {
				project.build(IncrementalProjectBuilder.CLEAN_BUILD, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
			generateAccessControlModel(summaryPage);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return true;
	}

	public URI getProjectURI(String projectName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProject project = workspace.getRoot().getProject(projectName);
		if (project.exists()) {
			return URI.createURI(project.getLocationURI().toString());
		} else {
			return null;
		}
	}

	private EcoreElem createEcoreElem(EObject data) {
		// Extract the relevant information from the data object and create an instance
		// of EcoreElem
		if (data instanceof EClassImpl) {
			EClassImpl eClassImpl = (EClassImpl) data;
			String type = "EClassImpl";
			String name = eClassImpl.getName();
			return new EcoreElem(type, name, data);
		} else if (data instanceof EReferenceImpl) {
			EReferenceImpl eReferenceImpl = (EReferenceImpl) data;
			String type = "EReferenceImpl";
			String name = eReferenceImpl.getName();
			return new EcoreElem(type, name, data);
		} else if (data instanceof EAttributeImpl) {
			EAttributeImpl eAttributeImpl = (EAttributeImpl) data;
			String type = "EAttributeImpl";
			String name = eAttributeImpl.getName();
			return new EcoreElem(type, name, data);
		} else if (data instanceof EEnumImpl) {
			EEnumImpl eEnumImpl = (EEnumImpl) data;
			String type = "EEnumImpl";
			String name = eEnumImpl.getName();
			return new EcoreElem(type, name, data);
		} else if (data instanceof EEnumLiteralImpl) {
			EEnumLiteralImpl eEnumLiteralImpl = (EEnumLiteralImpl) data;
			String type = "EEnumLiteralImpl";
			String name = eEnumLiteralImpl.getName();
			return new EcoreElem(type, name, data);
		}

		return null; // Return appropriate default value or handle error case
	}

	private void refreshWorkspace() {
		try {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			workspace.getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
