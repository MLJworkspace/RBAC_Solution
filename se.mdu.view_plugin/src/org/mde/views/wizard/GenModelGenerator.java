package org.mde.views.wizard;

import java.util.Collections;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class GenModelGenerator {

    public void generateGenModel(String ecoreFilePath, String genModelFilePath, String genModelName, String acmURI) {
        // Initialize the EMF resource set
        ResourceSet resourceSet = new ResourceSetImpl();

        // Load the Ecore model from the file
        URI ecoreURI = URI.createURI(ecoreFilePath);
        Resource ecoreResource = resourceSet.getResource(ecoreURI, true);
        EPackage ePackage = (EPackage) ecoreResource.getContents().get(0);

        // Create a new GenModel instance
        GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
        genModel.setModelName(genModelName);
        genModel.setDynamicTemplates(true);
        genModel.setTemplateDirectory("/Templates/templates");
       // genModel.setTemplatePluginVariables();

        // Configure the GenModel as needed
        genModel.setModelDirectory("/" +genModelName+ "/src");
        genModel.setModelPluginID(genModelName);
 

        // Enable code generation options for edit code, editor code, and test code
        genModel.setEditDirectory("/" +genModelName+ ".edit/src");
        genModel.setEditPluginID(genModelName+ ".edit");
        genModel.setEditorDirectory("/" +genModelName+ ".editor/src");
        genModel.setEditorPluginID(genModelName+".editor");
        genModel.setTestsDirectory("/" +genModelName+ ".tests/src");
        genModel.setTestsPluginID(genModelName+".tests");
        genModel.getGenPackages().add(createGenPackage(ePackage));
        genModel.getTemplatePluginVariables().add("AccessControlMetamodel");
        genModel.getTemplatePluginVariables().add("org.eclipse.emf.ecore.xmi");
        genModel.getTemplatePluginVariables().add("org.eclipse.emf.edit");
        GenAnnotation genAnnotation = GenModelFactory.eINSTANCE.createGenAnnotation();
        genAnnotation.setSource("accessControl");
        genAnnotation.getDetails().put("ACMURI", acmURI);
        


        // Add the GenAnnotation to the GenModel
        genModel.getGenAnnotations().add(genAnnotation);


      
      

        // Save the GenModel to a file
        URI genModelURI = URI.createURI(genModelFilePath);
        Resource genModelResource = resourceSet.createResource(genModelURI);
        genModelResource.getContents().add(genModel);

        try {
            genModelResource.save(null);
            System.out.println("GenModel generated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private GenPackage createGenPackage(EPackage ePackage) {
        GenPackage genPackage = GenModelFactory.eINSTANCE.createGenPackage();
        genPackage.setEcorePackage(ePackage);
       // genPackage.set
        // Configure other GenPackage settings as needed
        return genPackage;
    }
    public static void generate(GenModel genModel) {
    	genModel.reconcile();
    	genModel.setCanGenerate(true);
    	genModel.setValidateModel(true);
       
    	Generator generator = new Generator();
    	generator.run(genModel);
    }
}