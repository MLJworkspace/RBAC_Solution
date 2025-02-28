package org.mde.views.transformations;

import java.io.FileOutputStream;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;

public class QVToTransformation {

	public void runTransformation(String QVToFilePathString, String sourceFilePath, String targetFilePath) {
        // The URI of QVTo script
        URI transformationURI = URI.createFileURI(QVToFilePathString);

        // The URI of the input XMI file
        //System.out.println("Kush eshte sourceFilePath: " + sourceFilePath);
        URI inputURI = URI.createFileURI(sourceFilePath);

        // Register XMI as a valid extension
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        // Load the resource from the input XMI file
        Resource inputResource = new ResourceSetImpl().getResource(inputURI, true);

        // Create executor for the transformation
        TransformationExecutor executor = new TransformationExecutor(transformationURI);

        // Create the input extent with its initial contents
        ModelExtent input = new BasicModelExtent(inputResource.getContents());

        // Create an empty extent to catch the output
        ModelExtent output = new BasicModelExtent();

        // Setup execution context
        ExecutionContextImpl context = new ExecutionContextImpl();

     // Set the logger to print to console
        context.setLog(new Log() {
            public void log(int level, String message) {
                System.out.println("Log (Level " + level + "): " + message);
            }

            public void log(int level, String message, Object param) {
                System.out.println("Log (Level " + level + "): " + message + " " + param);
            }

            public void log(String message) {
                System.out.println("Log: " + message);
            }

            public void log(String message, Object param) {
                System.out.println("Log: " + message + " " + param);
            }

            public void log(int level, String message, Throwable throwable) {
                System.out.println("Log (Level " + level + "): " + message + " " + throwable.getMessage());
            }
        });

        // Execute the transformation assigning the operation arguments to the input and output extents
        ExecutionDiagnostic result = executor.execute(context, input, output);

        // Check the result for success
        if(result.getSeverity() == ExecutionDiagnostic.OK) {
            // The transformation was successful. Get the output
            List<EObject> outObjects = output.getContents();

            // Save the output
            Resource outResource = new XMIResourceImpl();
            outResource.getContents().addAll(outObjects);
            try {
                outResource.save(new FileOutputStream(targetFilePath), Collections.emptyMap());
            } catch (Exception e) {
                System.err.println("Failed to save output resource: " + e.getMessage());
            }
        } else {
            // Handle the errors
            System.err.println("Transformation failed: " + result.getMessage());
        }
    }
}