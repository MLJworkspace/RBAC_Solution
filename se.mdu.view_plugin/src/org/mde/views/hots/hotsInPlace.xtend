package org.mde.views.hots

import com.google.inject.Injector

import java.io.File
import java.io.PrintStream
import java.util.ArrayList
import java.util.Arrays
import java.util.HashSet
import java.util.Iterator
import java.util.Set
import java.util.Stack
import org.xtext.example.mapping.MappingStandaloneSetup
import org.xtext.example.mapping.mapping.HelperStatement
import org.xtext.example.mapping.mapping.MappingPackage
import org.xtext.example.mapping.mapping.MappingModel
import org.xtext.example.mapping.mapping.MappingRule
import org.xtext.example.mapping.mapping.Metamodel
import org.xtext.example.mapping.mapping.VariableDeclaration
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.util.Scanner
import org.eclipse.xtext.ecore.EcoreSupportStandaloneSetup
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.regex.Pattern
import java.util.HashMap
import javax.lang.model.element.VariableElement

class hotsInPlace {
	
	
ResourceSet resourceSet 
Resource resource;
EObject root  
EReference rootTargetReference
EClass mainElement
Injector inject
URI fileURI
MappingModel mappingModel
Set <EPackage> modelType = new HashSet<EPackage>()
Set <Metamodel> inOutModels = new HashSet<Metamodel>()
Set <EClass> sourceSuperType = new HashSet<EClass>()
Set <EClass> targetSuperType = new HashSet<EClass>()
//EList <Model> inOutModels = new BasicEList<Model>()
EList <Metamodel> sourceMetamodels = new BasicEList<Metamodel>()
EList <Metamodel> targetMetamodels = new BasicEList<Metamodel>()
Set <MappingRule> mainElementsRules = new HashSet<MappingRule>()
int i int j int k int g
String updatedStatement
static String inputMappingModel
static String nexti
static Scanner sc = new Scanner(System.in);
static PrintStream myWriter
static File myObj

int pos;
String partBefore2 ;
String partAfter2;
	
// load the resources
def doEMFSetup(String pathname, String main, String view){ 
    new EcoreSupportStandaloneSetup()

 inject = new MappingStandaloneSetup().createInjectorAndDoEMFRegistration()
	resourceSet = inject.getInstance(ResourceSet);
	resourceSet = new ResourceSetImpl();
    // ecoreResourceSource = resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Organization/model/organization.ecore").absolutePath), true)
	//ecoreResourceTarget =resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Calendar/model/calendar.ecore").absolutePath), true)
	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/runtime-Transf_Generator_HOTs/TextualSM/UML.ecore").absolutePath), true)
	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/runtime-Transf_Generator_HOTs/TextualSM/AllRT.ecore").absolutePath), true)

	
	//umlMetamodelResource  = resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Papyrus/org.eclipse.papyrus-rt/plugins/xtumlrt/metamodel/org.eclipse.uml2.uml_3.2.100.v20180713_1000/model/UML.ecore").absolutePath), true)
 //resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Papyrus/org.eclipse.papyrus-rt/plugins/xtumlrt/metamodel/org.eclipse.uml2.uml_3.2.100.v20180713_1000/model/UML.ecore").absolutePath), true).load(null);
  //umlMetamodelResource.load(null)
 
// Register the UML package with the package registry
     resourceSet.getResource(URI.createFileURI(new File (main).absolutePath), true)
      resourceSet.getResource(URI.createFileURI(new File (view).absolutePath), true)

    //resourceSet.getPackageRegistry().put(umlPackage.getNsURI(), umlPackage);kspac
    //resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/university/university.ecore").absolutePath), true)
   //resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/university/Customized_Views/university_facultyView.ecore").absolutePath), true)
    
	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Papyrus/org.eclipse.papyrus-rt/plugins/xtumlrt/metamodel/org.eclipse.papyrusrt.xtumlrt.statemach.model/model/statemach.ecore").absolutePath), true)
	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/org.xtext.example.hclsope/model/generated/HclScope.ecore").absolutePath), true)
	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Organization/organization.ecore").absolutePath), true)
	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Organization/organization_newView.ecore").absolutePath), true)

	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Papyrus/org.eclipse.papyrus-rt/plugins/xtumlrt/metamodel/org.eclipse.uml2.uml_3.2.100.v20180713_1000/model/UML.ecore").absolutePath), true)
	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/org.xtext.example.aiirt/model/generated/AIIRT.ecore").absolutePath), true)
   	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/org.xtext.example.aiirt/model/generated/aIIRT_newView.ecore").absolutePath), true)
   // resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/org.xtext.example.aiirt/model/generated/AIIRT.ecore").absolutePath), true).load(null)

	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/org.xtext.example.aiirt/model/generated/aIIRT_newView.ecore").absolutePath), true).load(null)
	
	//resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Papyrus/org.eclipse.papyrus-rt/plugins/xtumlrt/metamodel/com.ibm.xtools.uml.rt.core_1.50.0.v20220601_0846/profiles/UMLRealTime.ecore").absolutePath), true)
	resource = resourceSet.getResource( URI.createFileURI(new File(pathname).getAbsolutePath()), true);
	
	resource.load(null);	
	
	EcoreUtil.resolveAll(resourceSet);	
	
    generateMappingDeclaration

}

//////////////////////////////////////////////////////////////////////////////////////////////
//getMappingModel

def getMappingModel() {
	root = resource.contents.get(0);
	mappingModel = root as MappingModel;	
}

//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Generate the modeltype declarations that serve as reference to the metamodels that will be used in the transformation.
 * modelType is a HashSet, because in the case of an in-place transformation, the user is supposed to define the metamodel both as a leftModel and a rightModel.
 * However, there is no need for this metamodel to be declared twice. In a HashSet you cannot include ane element that is already present.  
 */
def generateModelType(){
	getMappingModel

	for (leftModel : mappingModel.sourceMetamodels){
		if (!modelType.add(leftModel.model)){
			modelType.add(leftModel.model)
		}
	} 
	for (rightModel : mappingModel.targetMetamodels){
		if (!modelType.add(rightModel.model)){
			modelType.add(rightModel.model)
		}
	} 
	for (package : modelType){
		if(package.name !== null){
		println("modeltype " + package.name + " uses " + "'" + package.nsURI + "';")
		
		}
	}

}

//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Generate the trasformation declaration. If a metamodel is loaded both as source and target, it is considered inout, and is removed from source and from target. 
 * Source - in , Target - out SourceAndTarget - inout
 */
def swapName (String name){
	pos = name.indexOf('2');
    partBefore2 = name.substring(0, pos);
    partAfter2 = name.substring(pos + 1);

    return partAfter2 + "2" + partBefore2;
} 
 
def generateTransformationDeclaration(){
	generateModelType
	println
	
	println("transformation " + swapName(mappingModel.name) + "( in " +mappingModel.targetMetamodels.get(0).name + "Model:" + mappingModel.targetMetamodels.get(0).name + " , inout " + mappingModel.sourceMetamodels.get(0).name + "Model:" + mappingModel.sourceMetamodels.get(0).name+");") 
	
	for (leftmodel : mappingModel.sourceMetamodels){	
		for (rightmodel : mappingModel.targetMetamodels){			   
			if (leftmodel.model === rightmodel.model){
				inOutModels.add(leftmodel)
			}
		}			 
	}

	for (leftmodel:mappingModel.sourceMetamodels){
		sourceMetamodels.add(leftmodel)
	}

	
	for (rightmodel:mappingModel.targetMetamodels){
		targetMetamodels.add(rightmodel)	
	}
	

	for (i = 0; i<inOutModels.size;i++){
		for (j = 0; j<sourceMetamodels.size;j++){
			if (inOutModels.get(i).model === sourceMetamodels.get(j).model){
				sourceMetamodels.remove(j)
			}
		}
		for (k = 0; k<targetMetamodels.size;k++){
			if (inOutModels.get(i).model === targetMetamodels.get(k).model){
				targetMetamodels.remove(k)
			}	
		}	
	}
	
//	for ( j = 0; j < sourceMetamodels.size; j++){
//		if(sourceMetamodels.get(j).model.name !==null){
//		val leftmodelname = sourceMetamodels.get(j).model.name + "Model"	
//		print(" in " + leftmodelname + ":" + sourceMetamodels.get(j).model.name)
//			if (j !== sourceMetamodels.size-1 || !targetMetamodels.empty || !inOutModels.empty){
//				print(",")
//			}	
//			
//			}
//	}
//
//	for (k = 0; k < targetMetamodels.size; k++){
//		val rightmodelname = targetMetamodels.get(k).model.name + "Model"
//		print(" out " + rightmodelname + ":" + targetMetamodels.get(k).model.name)
//			if (k !== targetMetamodels.size-1  || !inOutModels.empty){
//				print(",")
//			}	
//	}
//	
//	for (i = 0; i < inOutModels.size; i++){
//		val modelname = inOutModels.get(i).model.name + "Model"
//		print(" inout " + modelname + ":" + inOutModels.get(i).model.name)
//			if (i !== inOutModels.size-1 ){
//				print(",")
//			}
//	}
//	println (");")
}

	def generateMappingDeclaration(){
      generateMainFunction
      for (rule : mappingModel.rules){
				printRegularOrAbstractMapping (rule)
      		
	}	
    }
    
	def generateMainFunction(){
    generateTransformationDeclaration
      println("main() {")	
	if (sourceMetamodels.size === 1) {
		mainElement = findRootElement(mappingModel.sourceMetamodels.get(0).model);
		print(mappingModel.sourceMetamodels.get(0).model.name + "Model.rootObjects()[" + mappingModel.sourceMetamodels.get(0).model.name + "::" + mainElement.name + "] -> map " )
	}
	else {
		mainElement = (mappingModel.sourceMetamodels.get(0).model.eContents.get(0)) as EClass;
		print(mappingModel.sourceMetamodels.get(0).model.name + "Model.rootObjects()[" + mappingModel.sourceMetamodels.get(0).model.name + "::" + mainElement.name + "] -> map " )
	}		
	invokeRegularOrDisjunctTwinMain();
}

def invokeRegularOrDisjunctTwinMain(){
	for (rule : mappingModel.rules){		
		if (rule.source == mainElement){
		    mainElementsRules.add(rule)			
		}
	}
	if (mainElementsRules.size() === 1) {

		println ((mainElementsRules.get(0).source as EClass).name + "2" + (mainElementsRules.get(0).target as EClass).name + "();")
		println("}")
	}
	else if (mainElementsRules.size() !== 1) {
	   // println("Size" + mainElementsRules.size())
		println ((mainElementsRules.get(0).source as EClass).name + "2" + (mainElementsRules.get(0).target as EClass).name + "Disjunct();")
		println("}")
	}
}


def EClass findRootElement(EPackage ePackage) {
    val potentialRoots = ePackage.EClassifiers.filter(EClass)

    for (EClass eClass : potentialRoots) {
        val isRoot = potentialRoots.forall[ otherClass |
            otherClass.EReferences.filter[ eReference |
                eReference.isContainment && eReference.EReferenceType == eClass
            ].empty
        ]

        if (isRoot) {
            return eClass
        }
    }

    return null
}
def qualifiedName(EObject source){
	if (source instanceof EClass){
		return (source as EClass).EPackage.name + " :: " + source.name
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * A rule will be abstract if the target of the mapping rule is abstract
 * Otherwise the rule will be non-abstract
 */
def printRegularOrAbstractMapping (MappingRule rule){
	if (((rule.target) as EClass).abstract){
		rule.name = "Abstract" + ((rule.source) as EClass).name + "2" + ((rule.source) as EClass).name
		println("abstract mapping " + qualifiedName(rule.source) + " :: " + rule.name + "() : " + qualifiedName(rule.source) + "{")     	 	
	}
	else {
		rule.name = ((rule.source) as EClass).name + "2" + ((rule.source) as EClass).name
		println
		println
		println("mapping " + qualifiedName(rule.source) + " :: " + rule.name + "() : " + qualifiedName(rule.source)+"{") 
	}

		println ("init{")
		println("    result := self;")		  
		println("}")
		checkWhetherElementsMatch(rule)
				//generateChildRules(rule)
		println("}")
}

def checkWhetherElementsMatch(MappingRule rule){
	println ("if ("+ targetMetamodels.get(0).model.name +"Model.objectsOfType("+qualifiedName(rule.target)+")->exists(" + (rule.target as EClass).name + "ViewOb | " + (rule.target as EClass).name + "ViewOb."+rule.identifier+" = self."+rule.identifier+")) then {")
	
	println("var " + (rule.target as EClass).name + "ViewOb1 := " +targetMetamodels.get(0).model.name +"Model.objectsOfType("+qualifiedName(rule.target)+")->selectOne(" + (rule.target as EClass).name + "ViewOb | " + (rule.target as EClass).name + "ViewOb."+rule.identifier+" = self."+rule.identifier+");")
	for (childRule : rule.childRules)  	{
		if ((childRule.source instanceof EAttribute) && childRule.target instanceof EAttribute){
	transformAttributes(rule, childRule)
	   
	}
	
	 else if ((childRule.source instanceof EReference) && childRule.target instanceof EReference){
	 	if (!(childRule.source as EReference).isContainment){

	transformNonContainmentReferences(rule,childRule)
	
	}
	}
	}	

  	if (rule.childHelpers.size != 0)	{

		mappingRuleHasChildHelper(rule)
	
}
   if (doesItHaveContainmentReferences(rule) == true){
   printContainmentReference(rule)
   }
   else {
    println("}")
   	println("endif;")
   
   }
   }








def mappingRuleHasChildHelper (MappingRule rule){
    for (helper : rule.childHelpers){
    	updatedStatement = helper.statement.toString().replace("self", (rule.target as EClass).name + "ViewOb1");
		updatedStatement = updatedStatement.replace(sourceMetamodels.get(0).getName(), targetMetamodels.get(0).name);
		print("    " + updatedStatement)
		println ("{")
		if (helper.childRules.size != 0){
			for (childRule : helper.childRules){	
				print("    ")
				
				if (childRule.source instanceof EEnum && childRule.EEnumLiteral instanceof EEnumLiteral && childRule.target instanceof EAttribute){			
				transformEnum(childRule)
			}	
						
			}
		}
	
		println("    }; ")		
	}
	
}


def transformEnum(MappingRule childRule){
	print ("    result." + (childRule.target as EAttribute).name)
	generateAssignment(childRule)
	print ( sourceMetamodels.get(0).getName()+" :: "+ (childRule.source as EEnum).name + " :: " + childRule.EEnumLiteral.name + ";")
    println
	if (childRule.condition !== null){
			print(" -> " + childRule.condition)
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////
def transformNonContainmentReferences (MappingRule rule, MappingRule childRule){
	addNonContainmentReferences(rule, childRule)
	removeNonContaimentReferences(rule, childRule)
}

def addNonContainmentReferences(MappingRule rule, MappingRule childRule){
	println("    //addition")
	println("    "+(rule.target as EClass).name + "ViewOb1."+ (childRule.source as EReference).name + " -> forEach(view" + (childRule.source as EReference).EReferenceType.name+"){")	
	println("       if("+sourceMetamodels.get(0).name+"Model.objectsOfType("+qualifiedName((childRule.source as EReference).EReferenceType)+")->exists(base"+(childRule.source as EReference).EReferenceType.name+" | base"+(childRule.source as EReference).EReferenceType.name+ "."+findRuleFromEReference(childRule.source as EReference).identifier + " = view" + (childRule.source as EReference).EReferenceType.name + "." +findRuleFromEReference(childRule.source as EReference).identifier+")){")	
	println("           var var"+ (childRule.source as EReference).EReferenceType.name+ " := " +sourceMetamodels.get(0).name+"Model.objectsOfType("+qualifiedName((childRule.source as EReference).EReferenceType)+")->selectOne(base"+(childRule.source as EReference).EReferenceType.name+" | base"+(childRule.source as EReference).EReferenceType.name+ "."+findRuleFromEReference(childRule.source as EReference).identifier + " = view" + (childRule.source as EReference).EReferenceType.name + "." +findRuleFromEReference(childRule.source as EReference).identifier+");")
	println("           result."+ (childRule.source as EReference).name+ " += var"+(childRule.source as EReference).EReferenceType.name +";")
	println("        }")
	println("        endif;")
	println("    };")
}

def removeNonContaimentReferences(MappingRule rule,MappingRule childRule){
	println("    //removal")
	println("    self."+ (childRule.source as EReference).name + " -> forEach(base" + (childRule.source as EReference).EReferenceType.name+"){")	
	println("       if(("+(rule.target as EClass).name + "ViewOb1."+ (childRule.source as EReference).name+"->exists(view"+(childRule.source as EReference).EReferenceType.name+" | view"+(childRule.source as EReference).EReferenceType.name+ "."+findRuleFromEReference(childRule.source as EReference).identifier + " = base" + (childRule.source as EReference).EReferenceType.name + "." +findRuleFromEReference(childRule.source as EReference).identifier+")) = false) {")	 
    
    println("           result."+ (childRule.source as EReference).name+ " := self."+ (childRule.source as EReference).name +" -> excluding(base"+(childRule.source as EReference).EReferenceType.name+");")
    
    println("       }")
    println("        endif;")
	println("    };")
} 
def doesItHaveContainmentReferences(MappingRule rule){
	for (MappingRule childRule : rule.childRules){
		if (childRule.source instanceof EReference){
			if((childRule.source as EReference).isContainment){
				return true;
			}
		}
	}
	return false;
}
def printContainmentReference(MappingRule rule){
	println("   " + targetMetamodels.get(0).model.name +"Model.objectsOfType("+qualifiedName(rule.target)+")->forOne(" + (rule.target as EClass).name + "ViewOb | " + (rule.target as EClass).name + "ViewOb."+rule.identifier+" = self."+rule.identifier+"){");	
    for (childRule : rule.childRules)  	{
		if ((childRule.source instanceof EReference) && childRule.target instanceof EReference){
			if ((childRule.source as EReference).isContainment && (childRule.target as EReference).isContainment){
			 println("       " + (rule.target as EClass).name + "ViewOb."+(childRule.source as EReference).name+"->forEach("+(childRule.source as EReference).name +"ViewOb){")
			 addElement(rule, childRule);
			 updateElement(rule,childRule)
			// println("       endif")
			 println("       };")
			 deleteElement(rule, childRule)
			}	
		}	
	}
	println("   }")
	//println("}")
	println("}")
	println("endif;")
}

def deleteElement(MappingRule rule, MappingRule childRule){
  println("       //delete")
  println("       self."+(childRule.source as EReference).name+" -> forEach(" + (childRule.source as EReference).EReferenceType.name + "BaseOb){")
  println("            if((" + (rule.target as EClass).name + "ViewOb."+ (childRule.source as EReference).name + "-> exists("+(childRule.source as EReference).name +"ViewOb | " +(childRule.source as EReference).name +"ViewOb."+(findRuleFromEReference(childRule.source as EReference)).identifier+ " = "+ (childRule.source as EReference).EReferenceType.name + "BaseOb." +(findRuleFromEReference(childRule.source as EReference)).identifier +")) = false){")
  println("                 result."+(childRule.source as EReference).name + ":= self." +(childRule.source as EReference).name + "-> excluding("+(childRule.source as EReference).EReferenceType.name + "BaseOb);")
  println("            }")
  println("       };")
}

def updateElement(MappingRule rule, MappingRule childRule){
	println("           //update")
	print("           else if((self." + (childRule.source as EReference).name + "-> exists (") 
	print((childRule.source as EReference).name + "BaseOb |" + (childRule.source as EReference).name + "BaseOb.")
		//println("Kush esht rule" )
	print(findRuleFromEReference(childRule.source as EReference).identifier) 

	println(" = " +(childRule.source as EReference).name + "ViewOb." + (findRuleFromEReference(childRule.source as EReference)).identifier + ")) = true){" )
	transformReferences(childRule)
    println("           }")
}


def findRuleFromEReference(EReference ref){
	//println("kush ehste klasa target:" + ref.EReferenceType)
	for (rule: mappingModel.rules){
		//println("rregulli: " +rule.source as EClass)
		if (rule.source as EClass === ref.EReferenceType){
			//println("vjen per: " +ref.EReferenceType)
			return rule;
		}	
	}
	return null;
}
def addElement(MappingRule rule, MappingRule childRule){
	//println("Kush eshte childRule" + childRule.source);
	//println("Kush eshte rule" + rule.identifier);
		println("           //addition")
	print("           if((self." + (childRule.source as EReference).name + "-> exists (") 
	print((childRule.source as EReference).name + "BaseOb |" + (childRule.source as EReference).name + "BaseOb.")
		//println("Kush esht rule" )
	print(findRuleFromEReference(childRule.source as EReference).identifier) 

	println(" = " +(childRule.source as EReference).name + "ViewOb." + (findRuleFromEReference(childRule.source as EReference)).identifier + ")) = false){" )
    
    println("              var " + (childRule.source as EReference).name + "Ob := object " + qualifiedName(findRuleFromEReference(childRule.source as EReference).source)+"{")
     transformAttributesOfAddedClasses(childRule);
    println("              };")
    println("              result."+ (childRule.source as EReference).name + "+=" + (childRule.source as EReference).name + "Ob;")
   
    println("           }")
}
//////////////////////////////////////////////////////////////////////////////////////////////
def generateAssignment (MappingRule childRule){
	if (childRule.operator.toString == "assign") {
		print(" := ")
	} 
	else if (childRule.operator.toString == "add")
	{
		print(" += ")
	}
}

def transformAttributes(MappingRule rule, MappingRule childRule){
    print("    result." + ((childRule.target) as EAttribute).name)
	generateAssignment(childRule) 
	print((rule.target as EClass).name + "ViewOb1." + ((childRule.target) as EAttribute).name)
	println(";")
}

def transformAttributesOfAddedClasses( MappingRule childRule) {
		for (MappingRule childRuleForAtt : findRuleFromEReference(childRule.source as EReference).childRules) {		
			if (childRuleForAtt.source instanceof EAttribute) {
				print("              " + ((childRuleForAtt.target) as EAttribute).name)
				generateAssignment(childRuleForAtt)
				print((childRule.source as EReference).name + "ViewOb.")
				print((childRuleForAtt.source as EAttribute).name)
				println(";")

			}
		}
}

def transformReferences(MappingRule childRule){  	
   	print("              result." + ((childRule.target) as EReference).name)   	
	generateAssignment(childRule)
    print("self."+ ((childRule.target) as EReference).name)

	for (invokedRule : mappingModel.rules){
		invokedRule.name = ((invokedRule.source) as EClass).name + "2" + ((invokedRule.target) as EClass).name;
        	if ((invokedRule.target as EClass).name === (childRule.target as EReference).EType.name){						
				println(" -> map " + invokedRule.name + "();")			
			}	
	}
	
}

     



/*
 * The comments might be helpful for the user
 */
def generateComment(MappingRule rule){
	if (rule.comment !== null) {
		println("//"+rule.comment)
	}	
}


	
	
//	def static void main(String[] args) {
//		//System.out.println("Please, specify the path of the mapping model:");  
//       // inputMappingModel= sc.next
//       inputMappingModel= "/Users/mlj01/runtime-Transf_Generator_HOTs/HOTInPlace/uniRunningExample2uniRunningExample_view.mapping";
//        //System.out.println("Please,specify the path where you want to generate the model transformation file:")
//      // nexti = sc.next
//      nexti = "/Users/mlj01/runtime-Transf_Generator_HOTs/uniRunningExample2uniRunningExample_view/transforms/text.qvto";
//        myObj = new File(nexti)
//        myWriter = new PrintStream(nexti)
//        System.setOut(myWriter)
//		new hotsInPlace().doEMFSetup(inputMappingModel);
//	}
}