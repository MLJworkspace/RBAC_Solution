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
import org.xtext.example.mapping.mapping.HelperStatement
import org.xtext.example.mapping.mapping.MappingPackage
import org.xtext.example.mapping.mapping.MappingModel
import org.xtext.example.mapping.mapping.MappingRule
import org.xtext.example.mapping.mapping.Metamodel
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
import org.xtext.example.mapping.MappingStandaloneSetup
import org.eclipse.xtext.ecore.EcoreSupportStandaloneSetup
import org.eclipse.emf.ecore.util.EcoreUtil
import org.xtext.example.mapping.mapping.VariableDeclaration
import java.util.regex.Pattern
import java.util.HashMap
import javax.lang.model.element.VariableElement
import org.eclipse.emf.ecore.EClassifier

class GenerateTransformations {
	
ResourceSet resourceSet 
Resource resource;
MappingModel mappingModel
EObject root  
EReference rootTargetReference
EClass mainElement
boolean rootTargetReferenceBoolean = false
Set <String> reservedKeywords = new HashSet<String>(Arrays.asList("from", "map","end","datatype"));
Set <MappingRule> setOfDisjunctedRules = new HashSet<MappingRule>()
Set <MappingRule> setOfDisjunctRules = new HashSet<MappingRule>()
EList <MappingRule> ruleNoCondition = new BasicEList<MappingRule>()
val conditionMap = new HashMap<String, Integer>()
Stack <EReference> stackAttributePath = new Stack <EReference>()
Stack <String> stackCondition = new Stack <String>()
Stack <EReference> clone = new Stack <EReference>()
Stack <EReference> stackReference = new Stack <EReference>()
Stack <EReference> stackReferenceCopy = new Stack <EReference>()
EList <EClass> isVisited = new BasicEList<EClass>()
EList <HelperStatement> helpersInArray = new BasicEList<HelperStatement>()
Set <String> listaduplikate = new HashSet<String>()

Set <String> disjunctitotal = new HashSet<String>()
EList <String> emritwinit = new BasicEList<String>()
EList <MappingRule> twinRule = new BasicEList<MappingRule>()
EList <MappingRule> disjunctedTwinRules = new BasicEList<MappingRule>()
EList <MappingRule> disjunctedRules = new BasicEList<MappingRule>()
Set <String>  alreadyPrintedDisjunctedRule = new HashSet<String>()
ArrayList <MappingRule> rregullatenjejta = new ArrayList<MappingRule>()
Set <MappingRule> dis = new HashSet<MappingRule>()
Set <MappingRule> isPrinted = new HashSet<MappingRule>()

Set <MappingRule> mainElementsRules = new HashSet<MappingRule>()

Set <MappingRule> disjunctRules = new HashSet<MappingRule>()
Set <MappingRule> disjunctRulesInvokation = new HashSet<MappingRule>()

Set <Metamodel> inOutModels = new HashSet<Metamodel>()
Set <EClass> sourceSuperType = new HashSet<EClass>()
Set <EClass> targetSuperType = new HashSet<EClass>()
//EList <Model> inOutModels = new BasicEList<Model>()
EList <Metamodel> sourceMetamodels = new BasicEList<Metamodel>()
EList <Metamodel> targetMetamodels = new BasicEList<Metamodel>()
Set <EPackage> modelType = new HashSet<EPackage>()
Set <MappingRule> inheritedRules = new HashSet<MappingRule>()
Set <String> duplicates = new HashSet<String>()
Set <String> unique = new HashSet<String>()
EList <String> space = new BasicEList<String>()
Iterator <MappingRule>  disjunctIterator
Iterator <MappingRule>  disjunctTwinIterator
Iterator <String>  disjunctTotalIterator
boolean mainRuleDone = false
boolean stackAttributePrinted = false
boolean selfPrinted = false
EReference lastElementOfStackReference
static Scanner sc = new Scanner(System.in);
int i
int j
int k
int d=0
int g
int iterateConditionMap = 0
int katjeter = 0
boolean printed=false
boolean insideClass=false
MappingRule nextMR
MappingRule lastMR
String tjetri
static String inputMappingModel
String fundit
String attributeToPrint
static String nexti
MappingRule nextTwinMR
MappingRule lastTwinMR
static File myObj
Resource ecoreResourceSource
Resource ecoreResourceTarget
Resource xtextResource
static PrintStream myWriter
Injector inject
val String checkIfThereisADiscjunt = null
var String mesme = null
MappingStandaloneSetup mss
Injector injector
Resource umlMetamodelResource 
 EPackage umlPackage
 EClass eClass

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

def qualifiedName(EObject source){
	if (source instanceof EClass){
		return (source as EClass).EPackage.name + " :: " + source.name
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
//getRootOfMappingModel
def getRoot() {
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
	getRoot	

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
def generateTransformationDeclaration(){
	generateModelType
	println
	print("transformation " + mappingModel.name + "(") 
	
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
	
	for ( j = 0; j < sourceMetamodels.size; j++){
		if(sourceMetamodels.get(j).model.name !==null){
		val leftmodelname = sourceMetamodels.get(j).model.name + "Model"	
		print(" in " + leftmodelname + ":" + sourceMetamodels.get(j).model.name)
			if (j !== sourceMetamodels.size-1 || !targetMetamodels.empty || !inOutModels.empty){
				print(",")
			}	
			
			}
	}

	for (k = 0; k < targetMetamodels.size; k++){
		val rightmodelname = targetMetamodels.get(k).model.name + "Model"
		print(" out " + rightmodelname + ":" + targetMetamodels.get(k).model.name)
			if (k !== targetMetamodels.size-1  || !inOutModels.empty){
				print(",")
			}	
	}
	
	for (i = 0; i < inOutModels.size; i++){
		val modelname = inOutModels.get(i).model.name + "Model"
		print(" inout " + modelname + ":" + inOutModels.get(i).model.name)
			if (i !== inOutModels.size-1 ){
				print(",")
			}
	}
	println (");")
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * When we invoke the main rule, here we check if there are other rules defined with the same source and target.
 * If that is the case then, a rule is generated that disjuncts these rules, with the name of the source and target, and the extension Disjunct
 * If that is the case we should print the disjuncting rule (as invoked rule) with the extension Disjuncts 
 */
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


//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Generate the main function. 
 * If there is only one source metamodel, that will be immediately considered as mainsourcemetamodel, and the user does not have to define the latter.
 * Alternatively, the user has to choose the sourcemainmetamodel, and its value will be used. 
 */
def generateMainFunction(){
generateTransformationDeclaration
println("main() {")	
	if (sourceMetamodels.size === 1) {
		mainElement = findRootElement(mappingModel.sourceMetamodels.get(0).model);
		print(mappingModel.sourceMetamodels.get(0).model.name + "Model.rootObjects()[" + mappingModel.sourceMetamodels.get(0).model.name + "::" + mainElement.name + "] -> map " )
	}
	else {
		mainElement = (mappingModel.mainSourceMetamodel.model.eContents.get(0)) as EClass;
		print(mappingModel.mainSourceMetamodel.model.name + "Model.rootObjects()[" + mappingModel.mainSourceMetamodel.model.name + "::" + mainElement.name + "] -> map " )
	}		
	invokeRegularOrDisjunctTwinMain();
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * The comments might be helpful for the user
 */
def generateComment(MappingRule rule){
	if (rule.comment !== null) {
		println("//"+rule.comment)
	}	
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*/
 * For each rule we check if any of the rules in the mapping model, could be its disjuncted rule. 
 * The rules that have to fulfilled for the condition to evaluate to true are the following: 
 * 1- The target of the main rule should be a superType of the target of the disjunctedRule or it should be the same
 * 2- The source of the main rule should be a superType of the source of the disjunctedRule or it should be the same
 * 3- The target of the disjuncted rule should not be abstract 
 * 4- Not both source and target of the main rule can be the same to the source and target of the discjunted rule (this would be the case for twin rules)
 */
def populateListWithDisjunctRules (MappingRule rule, MappingRule disjunctrule){

	if (((rule.target as EClass).isSuperTypeOf((disjunctrule.target) as EClass) || (disjunctrule.target === rule.target))
	&& ((disjunctrule.source === rule.source) || (rule.source as EClass).isSuperTypeOf((disjunctrule.source) as EClass))
	&& !((disjunctrule.target) as EClass).abstract 
	&& (rule.source !== disjunctrule.source || rule. target !==disjunctrule.target)){
		disjunctRules.add(rule)	
		disjunctedRules.add(disjunctrule) 			    			
	}
	
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * We include the names of the disjuncted rules and in the cases where we have duplicate rules, we print source2targetDisjunct
 */
def populateListWithNamesOfDisjunctedRules(){
	while (disjunctIterator.hasNext()){
	nextMR = disjunctIterator.next			
	//println("Emri:" + nextMR.name)	
		if (listaduplikate.contains(nextMR.name) && !alreadyPrintedDisjunctedRule.contains(nextMR.name)){		
			disjunctitotal.add(qualifiedName(nextMR.source) + " :: " + ((nextMR.source) as EClass).name + "2" + ((nextMR.target) as EClass).name + "Disjunct")
			alreadyPrintedDisjunctedRule.add(nextMR.name)
		}
		else if (!listaduplikate.contains(nextMR.name)){  
			disjunctitotal.add(qualifiedName(nextMR.source) + " :: " + ((nextMR.source) as EClass).name + "2" + ((nextMR.target) as EClass).name) 						
	    } 	
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * print the signature of the disjunct rule and the disjuncted rules. The disjuncted rules are printed by iterating the list returned by populateListWithNamesOfDisjunctedRules
 */
def printDisjunct(MappingRule rule){
	println("mapping " + qualifiedName(rule.source) + " :: " + ((rule.source) as EClass).name + "2" + ((rule.target) as EClass).name + "Disjunct" + "() : " + qualifiedName(rule.target)) 
	print("disjuncts ")
	
	listaduplikate = findDuplicatesInDisjunctedRules(disjunctedRules)
	disjunctIterator = disjunctedRules.iterator(); 
	lastMR = disjunctedRules.get(disjunctedRules.size-1) 
	populateListWithNamesOfDisjunctedRules()
	
	disjunctTotalIterator = disjunctitotal.iterator();
	fundit = disjunctitotal.get(disjunctitotal.size-1)
	while (disjunctTotalIterator.hasNext){
		tjetri = disjunctTotalIterator.next
		print (tjetri)
		if (tjetri != fundit)
		{
			print (", ")
		}
	}
	println("{}")  
	println  
	listaduplikate.clear
	disjunctitotal.clear
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * There might be cases (not present in our use case), where we might have a tree of disjunctions. 
 * A mapping rule can have a disjuncted rule MappingRuleDisjuncted which might disjunct two other rules.
 * We need to make sure that we print MappingRuleDisjuncted as part of the disjuncted rules and not the two rules. 
 * In the following we find these possible duplicates.
 */
def findDuplicatesInDisjunctedRules(EList<MappingRule> listwithdublicates){
	for (iterator : listwithdublicates){
		if (unique.contains(iterator.name)){
			duplicates.add(iterator.name)
		}
	    else {
	    	unique.add(iterator.name)
	    }	
	}	
	return duplicates
} 
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Same as for populateListWithDisjunctedRules, but now the last condition changes.
 */
def populateListWithTwinRules (MappingRule rule, MappingRule disjunctedrule){
	if (((rule.target as EClass).isSuperTypeOf((disjunctedrule.target) as EClass) || (disjunctedrule.target === rule.target))
	&& !((disjunctedrule.target) as EClass).abstract && !((disjunctedrule.source) as EClass).abstract
	&& ((disjunctedrule.source === rule.source) || (rule.source as EClass).isSuperTypeOf((disjunctedrule.source) as EClass))){
	if (rule.source === disjunctedrule.source || rule.target === disjunctedrule.target){
		twinRule.add(disjunctedrule)
	}	
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Print the signature and the disjuncted mapping rules in the case of twin mapping rules. The twin mapping rules will be the disjuncted rules,
 * and the disjunct rule will be created source2targetDisjunct. We include the rule in a list and check that it is not part of the list before
 * proceeding any further. 
 */ 

def printDisjunctTwin (MappingRule rule){
	rule.name = ((rule.source) as EClass).name + "2" + ((rule.target) as EClass).name + "Disjunct"
	if (!emritwinit.contains(rule.name)){
	println("mapping " + qualifiedName(rule.source) + " :: " + rule.name + "() : " + qualifiedName(rule.target)) 
	print("disjuncts ")
	disjunctTwinIterator = twinRule.iterator(); 
	lastTwinMR = twinRule.get(twinRule.size-1)  
			
	while (disjunctTwinIterator.hasNext()){
		nextTwinMR = disjunctTwinIterator.next
		print(qualifiedName(nextTwinMR.source) + " :: " + ((nextTwinMR.source) as EClass).name + "2" + ((nextTwinMR.target) as EClass).name + katjeter) 
			if (nextTwinMR != lastTwinMR){
				print (", ")
			}   
			katjeter++    						
	} 
	println("{}") 
	println
	emritwinit.add(((rule.source) as EClass).name + "2" + ((rule.target) as EClass).name + "Disjunct")	
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * A rule will be abstract if the target of the mapping rule is abstract
 * Otherwise the rule will be non-abstract
 */
def printRegularOrAbstractMapping (MappingRule rule){
	if (((rule.target) as EClass).abstract){
		rule.name = "Abstract" + ((rule.source) as EClass).name + "2" + ((rule.target) as EClass).name
		println("abstract mapping " + qualifiedName(rule.source) + " :: " + rule.name + "() : " + qualifiedName(rule.target))     	 	
	}
	else {
		rule.name = ((rule.source) as EClass).name + "2" + ((rule.target) as EClass).name
		println("mapping " + qualifiedName(rule.source) + " :: " + rule.name + "() : " + qualifiedName(rule.target)) 
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * For the source and target of the mapping rule, we store their superTypes in two corresponding lists.
 * Then, we iterate through all the mapping rules available in the mapping model and we inherit the rules that fulfill the following conditions.
 * 1- The source of the mapping rule we are iterating, must be a superType of the source of the mappingrule we are working with or the same
 * 1- The target of the mapping rule we are iterating, must be a superType of the target of the mappingrule we are working with or the same
 * 3- The source and target of the mapping rule we are iterating, should not both be the same to the source and target of the mappingrule we are working with.
 */
 def selectInheritedRules(MappingRule rule){
 	for (superType : ((rule.source) as EClass).ESuperTypes){
		sourceSuperType.add(superType)
	}

	for (superType : ((rule.target) as EClass).ESuperTypes){
		targetSuperType.add(superType)
	}

	for (inheritedRule : mappingModel.rules){
		if ((sourceSuperType.contains(inheritedRule.source) || rule.source == inheritedRule.source) && (targetSuperType.contains(inheritedRule.target) || rule.target == inheritedRule.target)){
			if (!(inheritedRule.source == rule.source && inheritedRule.target == rule.target)){
				inheritedRules.add(inheritedRule)
			}
		}
	}
 }
 //////////////////////////////////////////////////////////////////////////////////////////////
/*
 * We print the inheritedRules.
 * The inherited rules can be abstract or non-abstract, thus we have conditions for both cases.
 * We print a , to separate between the inherited rules. 
 */
def generateInheritance(MappingRule rule){	
	selectInheritedRules(rule)	
	if (!inheritedRules.empty){
	print ("inherits ") 
		for (iterator : inheritedRules){
			if (((iterator.target) as EClass).abstract){
			print( qualifiedName(iterator.source) + " :: " + "Abstract" + ((iterator.source) as EClass).name + "2" + ((iterator.target) as EClass).name)
			}
			else {
			print( qualifiedName(iterator.source) + " :: " + ((iterator.source) as EClass).name + "2" + ((iterator.target) as EClass).name)
			}
			if (iterator !== inheritedRules.get(inheritedRules.size-1)){
				print(", ")
			}
		}
	  println
	}
	sourceSuperType.clear
	targetSuperType.clear
} 
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Generate conditions for mapping rules that map EClasses
 */
def generateconditionEClass(MappingRule rule){
	if (rule.condition !== null){
		println("when {" + rule.condition +"}")
	}
}


//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * There might be cases when we want to map attributes of a class different to the source class of the main mapping,
 * This will not be applicable for the result. because in the result you only add stuff to the target class of the main mapping.
 * Therefore, we have to change the part after generateAssignment.
 */
def transformAttributes(MappingRule childRule){
    print("    result." + ((childRule.target) as EAttribute).name)  	
	generateAssignment(childRule) 
	print("self.")
	if (stackAttributePath.size != 0){
		for (attributepath : stackAttributePath){
			if (reservedKeywords.contains(attributepath.name)){
				print("_" + attributepath.name + ".")
			}
		   	else {
		   		print(attributepath.name + ".")
		   	}
		}
		
	}
	if(childRule.source instanceof EAttribute){
		print ((childRule.source as EAttribute).name)
	}
	if(childRule.source instanceof VariableDeclaration){
		print ((childRule.source as VariableDeclaration).value)
	}
	if (childRule.condition !== null){
			print("." + childRule.condition)
	}

	println(";")
}
def EList<HelperStatement> storeHelpersInArray(EObject ruleOrHelper){
	if(ruleOrHelper.eContainer !== null){
		if (ruleOrHelper.eContainer instanceof HelperStatement){
			helpersInArray.add(ruleOrHelper.eContainer as HelperStatement)
			storeHelpersInArray(ruleOrHelper.eContainer)			
		}
		else if (ruleOrHelper.eContainer instanceof MappingRule){
			storeHelpersInArray(ruleOrHelper.eContainer)
		}	
	}
	return helpersInArray
}

//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Transform attributes of added classes
 */
def transformAttributesOfAddedClasses(MappingRule childRule){
    print("        "+((childRule.target) as EAttribute).name)  	    
	generateAssignment(childRule) 	
	storeHelpersInArray(childRule)
	
	if (helpersInArray.size !== 0){
		for (helper : helpersInArray){
			if (helper.statement.contains("forEach")){
				g++
			}
		}
	}
	if (g==0 && !(childRule.source instanceof VariableDeclaration)){
		print("self.")
	}
	helpersInArray.clear
	g=0
	if (stackAttributePath.size != 0){
		for (attributepath : stackAttributePath){
			iterateConditionMap++;
			if (reservedKeywords.contains(attributepath.name)){
				print("_" + attributepath.name + ".")
			}
		   	else {
		   		print(attributepath.name + ".")
		   	}
		   	if(conditionMap.containsValue(iterateConditionMap)){
		   		print(conditionMap.entrySet().findFirst[it.value == iterateConditionMap].key + ".")
		   	}
		}
		
	}
	if (childRule.source instanceof EAttribute){
	print ((childRule.source as EAttribute).name)
	}
	else if (childRule.source instanceof VariableDeclaration){
	print ((childRule.source as VariableDeclaration).value)
	}
	if (childRule.condition !== null){
			print("." + childRule.condition)
	}
	println(";")	
	iterateConditionMap=0;
	selfPrinted=false 
}

//////////////////////////////////////////////////////////////////////////////////////////////

def HelperStatement findHelperMainRule (HelperStatement helper){
	if (helper.eContainer instanceof HelperStatement){
		findHelperMainRule(helper.eContainer as HelperStatement) 
	}
	else {
		return helper	
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////

def MappingRule findMainRule(MappingRule rule) {	
	if (rule.eContainer !== null){
		if (rule.eContainer instanceof MappingRule){
			return rule.eContainer as MappingRule
		}
		else if (!(rule.eContainer instanceof MappingRule) && (rule.eContainer instanceof HelperStatement)){
			findHelperMainRule(rule.eContainer as HelperStatement).eContainer as MappingRule
		}
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////
def transformVarToRefAddedClasses(MappingRule childRule, MappingRule rule){

	 if (reservedKeywords.contains(((childRule.target) as EReference).name)){
	   		print("        _" + ((childRule.target) as EReference).name)
	  }
	  else {
	   		print("        " + ((childRule.target) as EReference).name)
	  } 	
	generateAssignment(childRule)	
	print((childRule.source as VariableDeclaration).name)
		 if(childRule.condition !== null && containsOclAsType(childRule.condition)){
		print("." + childRule.condition)
		for (invokedRule : mappingModel.rules){
			
		invokedRule.name = extractParameter(childRule.condition) + "2" + ((invokedRule.target) as EClass).name;
		//println(invokedRule.name)
		
		storeDisjunctInvokedRules(invokedRule)	
		storeInvokedRegularOrDisjunctTwinRules(invokedRule)	
		printInvokedRuleOcl(invokedRule, childRule)
		  disjunctedTwinRules.clear
	}
	
	}
	
	
		
//	for (invokedRule : mappingModel.rules){
//		invokedRule.name = ((invokedRule.source) as EClass).name + "2" + ((invokedRule.target) as EClass).name
//		storeDisjunctInvokedRules(invokedRule)
//		storeInvokedRegularOrDisjunctTwinRules(invokedRule)
//		printInvokedRule(invokedRule, childRule)
//		disjunctedTwinRules.clear
//	}
}
def transformReferencesOfAddedClasses(MappingRule childRule, MappingRule rule){

     if (reservedKeywords.contains(((childRule.target) as EReference).name)){
	   		print("        _" + ((childRule.target) as EReference).name)
	  }
	  else {
	   		print("        " + ((childRule.target) as EReference).name)
	  } 	
	generateAssignment(childRule)	
	print("self")
	selfPrinted = true
    if (rule.eContainer !== null){
	    if (rule.eContainer instanceof MappingRule){    	
		    if ((rule.eContainer as MappingRule).source !== null){
		    	if ((rule.eContainer as MappingRule).source instanceof EClass){
		    		//fix
				if((childRule.source as EReference).name == "type"){
					print(".type")
				}	
				else if ((childRule.source as EReference).name != "type"){
			 	findPath((rule.eContainer as MappingRule).source, ((childRule.source) as EReference), childRule)	 	
			};
		    						
				}
				else if ((rule.eContainer as MappingRule).source instanceof EReference){
					findPath(((rule.eContainer as MappingRule).source as EReference).EReferenceType as EObject, ((childRule.source) as EReference), childRule)	
				}
				rootTargetReferenceBoolean = false
				mainRuleDone=false				
				stackReferenceCopy.clear
				stackAttributePath.clear
			}
			else if ((rule.eContainer as MappingRule).source === null){		            
				findPath(findMainRule((rule.eContainer as MappingRule)).source,((childRule.source) as EReference), childRule)
				rootTargetReferenceBoolean = false
				mainRuleDone=false
				stackReferenceCopy.clear
				stackAttributePath.clear
			
			}
		} 
		else if (!(rule.eContainer instanceof MappingRule) && (rule.eContainer instanceof HelperStatement)){
			if((((rule.eContainer as HelperStatement).eContainer) !==null)  &&  ((rule.eContainer as HelperStatement).eContainer) instanceof MappingRule){			
				//fix
				if((childRule.source as EReference).name == "type"){
					print(".type")
				}	
				else if ((childRule.source as EReference).name != "type"){
			 	findPath(((rule.eContainer as HelperStatement).eContainer as MappingRule).source, ((childRule.source) as EReference), childRule)		 	
			};
			   
			}
			else if ((rule.eContainer as HelperStatement).eContainer as HelperStatement !== null){					
			 	var help = findHelperMainRule((rule.eContainer as HelperStatement).eContainer as HelperStatement)
			 	findPath((help.eContainer as MappingRule).source,((childRule.source) as EReference), childRule)
			 
			 }
			 	rootTargetReferenceBoolean = false
				mainRuleDone=false				
				stackReferenceCopy.clear
				stackAttributePath.clear
			 	
		}	
	}

		if(childRule.condition !== null && (containsResolve(childRule.condition)||containsResolveOne(childRule.condition))){
		println("->" + childRule.condition + ";")
	}
    else if(childRule.condition !== null && containsOclAsType(childRule.condition)){
		print("." + childRule.condition)
		for (invokedRule : mappingModel.rules){
			
		invokedRule.name = extractParameter(childRule.condition) + "2" + ((invokedRule.target) as EClass).name;
		//println(invokedRule.name)
		
		storeDisjunctInvokedRules(invokedRule)	
		storeInvokedRegularOrDisjunctTwinRules(invokedRule)	
		printInvokedRuleOcl(invokedRule, childRule)
		  disjunctedTwinRules.clear
	}
	
	}
	else{
	for (invokedRule : mappingModel.rules){
		invokedRule.name = ((invokedRule.source) as EClass).name + "2" + ((invokedRule.target) as EClass).name
		storeDisjunctInvokedRules(invokedRule)
		storeInvokedRegularOrDisjunctTwinRules(invokedRule)
		printInvokedRule(invokedRule, childRule)
		disjunctedTwinRules.clear
	}}
    disjunctRulesInvokation.clear
    disjunctedTwinRules.clear
    //printed = false
    selfPrinted = false
}



//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Check if there exist dublicates in storeDisjunct and store in an EList
 */
def storeInvokedRegularOrDisjunctTwinRules(MappingRule invokedRule){
	for (rule : mappingModel.rules){
		if (rule.source == invokedRule.source && rule.target == invokedRule.target){
		    disjunctedTwinRules.add(rule)		
		}
	}	
}


//////////////////////////////////////////////
    def boolean containsOclAsType(String value) {
        val oclAsTypePattern = Pattern.compile("oclAsType\\(.*?\\)")
        val matcher = oclAsTypePattern.matcher(value)
        return matcher.find()
    }

    def String extractParameter(String value) {
        if (!containsOclAsType(value)) {
            return null
        }
        val parameterPattern = Pattern.compile("oclAsType\\((.*?)\\)")
        val matcher = parameterPattern.matcher(value)
        if (matcher.find()) {
            val oclAsTypeExpression = matcher.group(1)
            val parameter = oclAsTypeExpression.split("::").get(1)
            return parameter
        }
        return null
    }
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Used to transform variables.
 */
def transformVariables(MappingRule childRule, MappingRule parenti){  	
   if (reservedKeywords.contains(((childRule.target) as EReference).name)){
   		print("    result._" + ((childRule.target) as EReference).name)
   }
   else {
   		print("    result." + ((childRule.target) as EReference).name)
   } 	
	generateAssignment(childRule)
    print("self." + ((childRule.source) as VariableDeclaration).value)
    selfPrinted = true
//    if (containsOclAsType(((childRule.source) as VariableDeclaration).value)){
// 	
//    println('The "value" attribute contains "oclAsType()".')
//    println('The extracted parameter is: ' + extractParameter(((childRule.source) as VariableDeclaration).value))
//} else {
//    println('The "value" attribute does not contain "oclAsType()".')
//}
//	if (parenti.source instanceof EClass){
//		findPath(parenti.source, ((childRule.source) as EReference), childRule)
//		rootTargetReferenceBoolean = false
//	    mainRuleDone = false
//	    stackAttributePath.clear
//    }
//    else if (parenti.source instanceof EReference){
//		findPath((parenti.source as EReference).EReferenceType as EObject, ((childRule.source) as EReference), childRule)
//		rootTargetReferenceBoolean = false
//	    mainRuleDone = false
//	    stackAttributePath.clear
//    }
	if (childRule.condition !== null){
		print(" -> " + childRule.condition)
	}
	for (invokedRule : mappingModel.rules){
		invokedRule.name = ((invokedRule.source) as EClass).name + "2" + ((invokedRule.target) as EClass).name
		storeDisjunctInvokedRules(invokedRule)	
		storeInvokedRegularOrDisjunctTwinRules(invokedRule)	
		printInvokedRuleForVarSource(invokedRule, childRule)
		  disjunctedTwinRules.clear
	}
    disjunctRulesInvokation.clear
    disjunctedTwinRules.clear
 //   printed=false
    selfPrinted=false
    println
    
     
} 




////////////////
  def boolean containsResolve(String value) {
        val oclAsTypePattern = Pattern.compile("resolve\\(.*?\\)")
        val matcher = oclAsTypePattern.matcher(value)
        return matcher.find()
    }
 def boolean containsResolveOne(String value) {
        val oclAsTypePattern = Pattern.compile("resolveone\\(.*?\\)")
        val matcher = oclAsTypePattern.matcher(value)
        return matcher.find()
    }
    def String extractParameterInResolve(String value) {
        if (!containsResolve(value)) {
            return null
        }
        val parameterPattern = Pattern.compile("resolve\\((.*?)\\)")
        val matcher = parameterPattern.matcher(value)
        if (matcher.find()) {
            val resolveExpression = matcher.group(1)
            val parameter = resolveExpression.split("::").get(1)
            return parameter
        }
        return null
    }
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Used to transform references.
 */
def transformReferences(MappingRule childRule, MappingRule parenti){  	
   if (reservedKeywords.contains(((childRule.target) as EReference).name)){
   		print("    result._" + ((childRule.target) as EReference).name)
   }
   else {
   		print("    result." + ((childRule.target) as EReference).name)
   } 	
	generateAssignment(childRule)
    print("self")
    selfPrinted = true
	if (parenti.source instanceof EClass){
		findPath(parenti.source, ((childRule.source) as EReference), childRule)
		rootTargetReferenceBoolean = false
	    mainRuleDone = false
	    stackAttributePath.clear
    }
    else if (parenti.source instanceof EReference){
		findPath((parenti.source as EReference).EReferenceType as EObject, ((childRule.source) as EReference), childRule)
		rootTargetReferenceBoolean = false
	    mainRuleDone = false
	    stackAttributePath.clear
    }
	
	if(childRule.condition !== null && (containsResolve(childRule.condition)||containsResolveOne(childRule.condition))){
		println("->" + childRule.condition + ";")
	}
	
	else if(childRule.condition !== null && containsOclAsType(childRule.condition)){
		print("." + childRule.condition)
		for (invokedRule : mappingModel.rules){
			
		invokedRule.name = extractParameter(childRule.condition) + "2" + ((invokedRule.target) as EClass).name;
		//println(invokedRule.name)
		
		storeDisjunctInvokedRules(invokedRule)	
		storeInvokedRegularOrDisjunctTwinRules(invokedRule)	
		printInvokedRuleOcl(invokedRule, childRule)
		  disjunctedTwinRules.clear
	}
	
	}


	else{	
		if (childRule.condition !== null){
		print(" -> " + childRule.condition)
	}
	
	for (invokedRule : mappingModel.rules){
		invokedRule.name = ((invokedRule.source) as EClass).name + "2" + ((invokedRule.target) as EClass).name
		//println(invokedRule.name)
		storeDisjunctInvokedRules(invokedRule)	
		storeInvokedRegularOrDisjunctTwinRules(invokedRule)	
		printInvokedRule(invokedRule, childRule)
		  disjunctedTwinRules.clear
	}
	
	}
    disjunctRulesInvokation.clear
    disjunctedTwinRules.clear
 //   printed=false
    selfPrinted=false
    
     
} 
//////////////////////////////////////////////////////////////////////////////////////////////

def void checkIfMappingRuleInsideAddedClass(MappingRule childRule){
	if (childRule.eContainer !== null){
	    if ((childRule.eContainer instanceof MappingRule) && ((childRule.eContainer as MappingRule).source === null)){
	    	insideClass =true
	    }
	    else if ((childRule.eContainer instanceof MappingRule) && ((childRule.eContainer as MappingRule).source !== null)){
	    	checkIfMappingRuleInsideAddedClass(childRule.eContainer as MappingRule)
	    }
	    else if ((childRule.eContainer instanceof HelperStatement)) {
	    	checkIfMappingRuleInsideAddedClass((findHelperMainRule(childRule.eContainer as HelperStatement)).eContainer as MappingRule)
	    }
	    else {
	    	insideClass = false
	    }	    
	 }
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * There are three main scenarios 
 * Source and target !== null (transform)
 * Source === null and target !== null (create target object)
 * * Source !== null and target === null (to find path)
 */
def void generateChildRulesRecursively(MappingRule childRule, MappingRule rule){
	if (childRule.source !== null && childRule.target !== null){				    
	   
		if ((childRule.source instanceof EAttribute || childRule.source instanceof VariableDeclaration) && childRule.target instanceof EAttribute){
			if (rule.source === null)
				transformAttributesOfAddedClasses(childRule)
			else if (rule.source !== null &&  rule.target !== null){
				transformAttributes(childRule)
			}   
			else if (rule.source !== null && rule.target === null) {
				transformAttributesOfAddedClasses(childRule)
			}       		 
		}		
		else if (childRule.source instanceof EReference && childRule.target instanceof EAttribute){
			
		   if (reservedKeywords.contains(((childRule.target) as EAttribute).name)){
		   		print("    result._" + ((childRule.target) as EAttribute).name)
		   }
		   else {
		   		print("    result." + ((childRule.target) as EAttribute).name)
		   } 	
			generateAssignment(childRule)
		    print("self." + (childRule.source as EReference).name)
			if (childRule.condition !== null){
				print(" -> " + childRule.condition + ";")
			}
		}		
		else if (childRule.source instanceof VariableDeclaration && childRule.target instanceof EReference){
			checkIfMappingRuleInsideAddedClass(childRule)
				if (insideClass === true){				
				transformVarToRefAddedClasses(childRule, rule)
			}
			else if (insideClass === false){			
				//need to be completed in the future
			}
		
		}	
			
		else {
    		checkIfMappingRuleInsideAddedClass(childRule)
			if (insideClass === true){				
				transformReferencesOfAddedClasses(childRule, rule)
			}
			else if (insideClass === false){			
				transformReferences(childRule, rule)
			}			
		}	
	}	
    else if (childRule.source !== null && childRule.target === null){
		stackAttributePath.add(childRule.source as EReference)
		
		if (childRule.condition !== null){
			conditionMap.put(childRule.condition,stackAttributePath.size)
		}

		printed=false
		for (childRuli : childRule.childRules){
			generateChildRulesRecursively(childRuli, childRule)			
		}
	}	
	else if(childRule.source === null && childRule.target !== null){
		addClasstarget(childRule)		
	}	

}
//////////////////////////////////////////////////////////////////////////////////////////////

def MappingRule findRootMappingRule (MappingRule rule){
	if ( rule.eContainer instanceof MappingModel){
		return rule
	}
	else if (rule.eContainer instanceof MappingRule) {
		findRootMappingRule(rule.eContainer as MappingRule)
	}
	else if (rule.eContainer instanceof HelperStatement){
		findRootMappingRule(findHelperMainRule(rule.eContainer as HelperStatement).eContainer as MappingRule)
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////

def transformEnum(MappingRule childRule){
	print ("    result." + (childRule.target as EAttribute).name)
	generateAssignment(childRule)
	print ( targetMetamodels.get(0).getName()+" :: "+ (childRule.source as EEnum).name + " :: " + childRule.EEnumLiteral.name + ";")
    println
	if (childRule.condition !== null){
			print(" -> " + childRule.condition)
	}
}

def transformEnumAddedClass(MappingRule childRule){
	print ("    " + (childRule.target as EAttribute).name)
	generateAssignment(childRule)
	print ((childRule.source as EEnum).name + " :: " + childRule.EEnumLiteral.name + ";")
    println
	if (childRule.condition !== null){
			print(" -> " + childRule.condition)
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////

def hasChildRule(MappingRule rule){
	for (childRule : rule.childRules){	
		//println(childRule.source.eClass)
		//transform references
		//println(childRule.source instanceof EEnumLiteral)
		//println(childRule.target.eClass)
			if (childRule.source !== null && childRule.target !== null && childRule.source instanceof EReference && childRule.target instanceof EReference){				
						transformReferences(childRule, rule)        		 			
			}	
			else if (childRule.source instanceof EEnum && childRule.EEnumLiteral instanceof EEnumLiteral && childRule.target instanceof EAttribute){			
				transformEnum(childRule)
			}	
			//Kjo eshte per rastin kur source eshte ne fakt nje variabel e percaktuar nga ne
			else if (childRule.source instanceof VariableDeclaration && childRule.target instanceof EReference)	{
				//println("Futet ketu")
				transformVariables(childRule, rule)
			}
		//ketu m merr dhe add dhe ate tjetren kontrolloje		
			else {
				
				//println("Akseson generateChildRulesRecursively qe mbase dhe nuk duhet")
				generateChildRulesRecursively(childRule, rule) 				
			}	
		}
		stackAttributePath.clear
}
//////////////////////////////////////////////////////////////////////////////////////////////

def void helperHasChildHelper(MappingRule rule, HelperStatement helper){
	for (help : helper.childHelpers){
		for (s : space){
			print(s)
		}
		print("    " + help.statement)
		println ("{")
		if (help.childRules.size != 0){
			for (childRule : help.childRules){	
				if (childRule.source !== null && childRule.target !== null && childRule.source instanceof EReference && childRule.target instanceof EReference){						
				   print("    ")
				   for (s : space){
						print(s)
					}     		 			
				}	
				else {
					print("      ")
					for (s : space){
						print(s)
					}
					generateChildRulesRecursively(childRule, rule) 				
			    }		
			}
		}
		if (help.childHelpers.size != 0){
			space.add("    ")
			helperHasChildHelper(rule,help)
			space.remove(space.size-1)
		}		
		for (s : space){
			print(s)
		}
	    println("    }; ")
	}
	stackAttributePath.clear
}

//////////////////////////////////////////////////////////////////////////////////////////////

def mappingRuleHasChildHelper (MappingRule rule){
    for (helper : rule.childHelpers){
		print("    " + helper.statement.toString)
		println ("{")
		if (helper.childRules.size != 0){
			for (childRule : helper.childRules){	
				print("    ")
				if (childRule.source !== null && childRule.target !== null && childRule.source instanceof EReference && childRule.target instanceof EReference){						
					transformReferences(childRule, rule)        		 			
				}	
				else if (childRule.source instanceof EEnum && childRule.EEnumLiteral instanceof EEnumLiteral && childRule.target instanceof EAttribute){			
				transformEnum(childRule)
			}	
				else {		
					generateChildRulesRecursively(childRule, rule) 				
				}		
			}
		}
		if (helper.childHelpers.size != 0){
			space.add("    ")
			helperHasChildHelper(rule, helper)
		}
		println("    }; ")		
	}
	stackAttributePath.clear
}
//////////////////////////////////////////////////////////////////////////////////////////////

def generateChildRules(MappingRule rule) {
	if (rule.childHelpers !== null){
		mappingRuleHasChildHelper(rule)
	}
	if (rule.childRules !== null){ 		 
		hasChildRule(rule)
   }
   stackAttributePath.clear 
   space.clear
}
//////////////////////////////////////////////////////////////////////////////////////////////

def checkIfSourceReferencesContainStackAttributeElement(Stack<EReference> stackAttributepath, EObject source){
	for (sa : stackAttributePath) {
	   	if ((source as EClass).EReferences.contains(sa)){
	   		attributeToPrint = sa.name
	   		return true
	   	}	
   	}
}
//////////////////////////////////////////////////////////////////////////////////////////////

def targetReferenceOfSuperClass (EObject source, EReference targetReference){
	if (!(source as EClass).ESuperTypes.empty){
		for (superi : (source as EClass).ESuperTypes){
			if (superi.EReferences.size !== 0 && superi.EReferences.contains(targetReference)){
				return true
			}
			else {
				return false
			}
		}	
	}
	return false
}
//////////////////////////////////////////////////////////////////////////////////////////////

def isReferenceOfSuperClass (EObject source){
	for (superi : (source as EClass).ESuperTypes){
		if (superi.EReferences.size !== 0 && superi.EReferences.contains(stackAttributePath.get(0))){
			return true
		}
		else {
			return false
		}
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////

def elementOfStackAttributePathContainstargetReference(Stack <EReference> stackAttributePath, EReference targetReference){
	if (stackAttributePath.size !== 0){
		if (!(((stackAttributePath.get(stackAttributePath.size-1) as EReference).EReferenceType as EClass).EReferences.empty)){
			if (((stackAttributePath.get(stackAttributePath.size-1) as EReference).EReferenceType as EClass).EReferences.contains(targetReference)){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false
		}								
	}
	else {
		return false;
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Helps find the path from the source or target of the main mapping rule to the reference you are mapping 
 * Logic similar to DFS (Depth First Search)
 * Used stacks because they are based on the LIFO principle
 */
def void findPath  (EObject source, EReference targetReference, MappingRule childRule){

	if (rootTargetReferenceBoolean === false){

		rootTargetReference = targetReference
		rootTargetReferenceBoolean = true

	}	
   if ((source as EClass).EReferences.contains(targetReference) || targetReferenceOfSuperClass(source, targetReference) || elementOfStackAttributePathContainstargetReference(stackAttributePath, targetReference) === true){        
         if (stackAttributePrinted ===false && stackAttributePath.size !== 0 && (rootTargetReference === targetReference ||  elementOfStackAttributePathContainstargetReference(stackAttributePath, targetReference) === true)){
      	
      	for (element: stackAttributePath){   		
	      	if (element === stackAttributePath.get(0) && selfPrinted === false){
	     
	      		print(element.name)
	      	}
	      	else {
	      	
	      		print("." +element.name )
	      	}      	
      	}     
      	stackAttributePrinted = true
      }
      
      if (reservedKeywords.contains(targetReference.name)){
       		if (selfPrinted === false && stackAttributePath.size === 0 && stackReference.size ===0){
       			
	   			print("_" + targetReference.name)
	   		} 
		   	else {
		   		
		   		print("._" + targetReference.name)
		   	}
	   		if (rootTargetReference !== targetReference &&  elementOfStackAttributePathContainstargetReference(stackAttributePath, targetReference) === false){
	   			stackAttributePath.clear
	   			println("1")
	   			findPath(targetReference.EReferenceType, rootTargetReference,childRule)
	   		}
	   }
	   else {	
	
	  // 	println((source as EClass).EReferences.contains(targetReference))
	   	//println(	targetReferenceOfSuperClass(source, targetReference) )
	   //	println(elementOfStackAttributePathContainstargetReference(stackAttributePath, targetReference))   	
		   	if (selfPrinted === false && stackAttributePath.size === 0 && stackReference.size ===0){
		   		
		   		print(targetReference.name)
		   	} 
		   	else {
		   		
		   		print("." + targetReference.name)
		   		
		   		 	
		   	}	
	   		if (rootTargetReference !== targetReference &&  elementOfStackAttributePathContainstargetReference(stackAttributePath, targetReference) === false){
	   		
	   			stackAttributePath.clear
	   	
	   			findPath(targetReference.EReferenceType, rootTargetReference,childRule)
	   		}   	
	   			
	   } 

	   printed=true
	   stackAttributePrinted = false
   	   stackReference.removeAllElements
	   isVisited.clear  

	  
    }  
   
   
   else if (printed === false){
  

	   	if (stackAttributePath.size !== 0 && ((source as EClass).EReferences.contains(stackAttributePath.get(0)) || isReferenceOfSuperClass(source) === true) && mainRuleDone === false){	   		
	   		for (iterator : stackAttributePath){
	   			if(iterator === stackAttributePath.get(0)){
	   				if (selfPrinted === true){
	   			
	   					print("." + iterator.name )
	   				}
	   				else {
	   		
	   					print(iterator.name )
	   				}	   				
	   			}
	   			else {
	   		
					print(iterator.name )
	   			}
	   		}
	   		
	   		stackAttributePrinted = true
	   		mainRuleDone = true
	   		rootTargetReference = targetReference
	   	
	   		findPath(stackAttributePath.get(stackAttributePath.size-1).EReferenceType, targetReference, childRule)
	   	}
	   	else if (stackAttributePath.size !== 0 && !(source as EClass).EReferences.contains(stackAttributePath.get(0)) && mainRuleDone === false){
	   		
	   			mainRuleDone = true	  
	   	
		   		findPath(findRootMappingRule(childRule).source, stackAttributePath.get(0), childRule)		   		 		
	   	}
	   	
	   	else {
	
	   		if ((source as EClass).EReferences.size() !== 0){
	   			for (iterator: (source as EClass).EReferences){
	   				if (printed === false){
	   					 if (!isVisited.contains(iterator.EReferenceType)){ 
				   	    	if (!iterator.EReferenceType.abstract){
				   	    		stackReference.add(iterator)    	    	
				   	    	}
				   	    	isVisited.add(iterator.EReferenceType as EClass)
				   	    	if (!(iterator.EReferenceType as EClass).EReferences.empty){
				   	    		if (!(iterator.EReferenceType as EClass).EReferences.contains(targetReference)){
				   	    					   	    		 	  	   	    	
					   	    		findPath(iterator.EReferenceType, targetReference, childRule)
					   	    	}
					   	    	else{
					   	    		stackReference.forEach[ reference | 
					   	    		 if (reference===stackReference.get(0)){
					   	    		 
					   	    			print("." + reference.name)					   	    			
					   	    		}				   	    		
					   	    		else if (reference!==stackReference.get(stackReference.size-1)){
					   	    			
					   	    			print("." + reference.name)					   	    			
					   	    		}				   	    		
					   	    		else {
					   	    			
					   	    			print("." + reference.name)
					   	    		}
					   	    		]
					   	    		lastElementOfStackReference = stackReference.get(stackReference.size-1)
					   	    		stackReference.clear
					   	    	
					   	    		findPath(lastElementOfStackReference.EReferenceType, targetReference, childRule)
					   	    	}			   	    		
				   	    	}				   	    
	   					}
   					   else if ((iterator.EReferenceType).ESuperTypes.size !== 0){ 
					   	   for (superi : (source as EClass).ESuperTypes){
						   	   if (!isVisited.contains(superi)){
						   	   		isVisited.add(superi)
						   	   		
						   	   		findPath(superi,targetReference, childRule)
						   	   }				   	
					   	   }
	   	   				}	
	   	   				else if((iterator.EReferenceType).ESuperTypes.size === 0 && stackReference.size !== 0){
	   	   					stackReference.pop
	   	   					if (stackReference.size !== 0){
	   	   			
			     				findPath(stackReference.get(stackReference.size-1).EReferenceType, targetReference, childRule)
			    		 	} 
	   	   				}
				   	    else {				   
				   	 		stackReference.clear
				   	 		isVisited.clear
				   	    } 	   				  				
	   				}	    	   				
	   			}
	   		}
	   		else if ((source as EClass).ESuperTypes.size !== 0){ 
	   			
		     	for (supertype : (source as EClass).ESuperTypes){
		     		if (!isVisited.contains(supertype)){
		     	
			     		isVisited.add(supertype)
			     		
			     		findPath(supertype, targetReference,  childRule)			     		
	         		}
		     	} 
		    }
		    else if ((source as EClass).ESuperTypes.size === 0 && stackReference.size !== 0 ){ 
		    	if (stackReference.get(stackReference.size-1).EReferenceType !== source && !isVisited.containsAll(stackReference.get(stackReference.size-1).EReferenceType.ESuperTypes)){
		    	}	
		        else{
				    stackReference.pop	
				     if (stackReference.size !== 0){
				
				     	findPath(stackReference.get(stackReference.size-1).EReferenceType, targetReference, childRule)
				     } 			     
			    }  
		    }  
  		} 
	}  

}

//////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Check if the rule that is to be invoked disjuncts other rules or not 
 * If it does, store it in an array, so that later in printInvokedRule we know how to print it
 */
def storeDisjunctInvokedRules(MappingRule invokedRule){

	for (disjunctrule: mappingModel.rules){

		if (((invokedRule.target as EClass).isSuperTypeOf((disjunctrule.target) as EClass) || (disjunctrule.target === invokedRule.target))
		&& ((disjunctrule.source === invokedRule.source) || (invokedRule.source as EClass).isSuperTypeOf((disjunctrule.source) as EClass))){
				if (invokedRule.source !== disjunctrule.source || invokedRule. target !==disjunctrule.target)	{
					dis.add(disjunctrule)
					disjunctRulesInvokation.add(invokedRule)	
						
				}
		}
		
		
	}	
}
//////////////////////////////////////////////////////////////////////////////////////////////
def findRuleWithDisjunct(){
	for (ruleWithDisjunct : mappingModel.rules){
		for (ruleThatWillBeDisjuncted : mappingModel.rules){
			if (((ruleWithDisjunct.target as EClass).isSuperTypeOf((ruleThatWillBeDisjuncted.target) as EClass) || (ruleThatWillBeDisjuncted.target === ruleWithDisjunct.target))
			&& !((ruleThatWillBeDisjuncted.target) as EClass).abstract 
			&& ((ruleThatWillBeDisjuncted.source === ruleWithDisjunct.source) || (ruleWithDisjunct.source as EClass).isSuperTypeOf((ruleThatWillBeDisjuncted.source) as EClass))){
				setOfDisjunctedRules.add(ruleThatWillBeDisjuncted)
			}
		}
		if (setOfDisjunctedRules.size() > 1){
			setOfDisjunctRules.add(ruleWithDisjunct)
		}
		setOfDisjunctedRules.clear
	}
  return setOfDisjunctRules
}
//////////////////////////////////////////////////////////////////////////////////////////////
def printInvokedRuleForVarSource (MappingRule invokedRule, MappingRule childRule){
//	println("source")
//	println((invokedRule.source as EClass).name)
	    //println(extractParameter((childRule.source as VariableDeclaration).value))
//	println("target")
//	println((invokedRule.target as EClass).name)
//	println((childRule.target as EReference).EType.name)
		if ((invokedRule.source as EClass).name == extractParameter((childRule.source as VariableDeclaration).value) && (invokedRule.target as EClass).name == (childRule.target as EReference).EType.name){
			println("A futet")			
//			if (disjunctRulesInvokation.contains(invokedRule) && findRuleWithDisjunct.contains(invokedRule)){
//				if (((childRule.source) as EReference).upperBound === -1){
//						println(" -> map " + invokedRule.name + "Disjunct();")
//				}
//				else if (((childRule.source) as EReference).upperBound === 1){
//						println(".map " + invokedRule.name + "Disjunct();")
//				}
//			}	
			 
//			else if (disjunctedTwinRules.size() !== 1 && findRuleWithDisjunct.contains(invokedRule)){
//			if (!isPrinted.contains(disjunctedTwinRules.get(0))){			
//				if (((childRule.source) as EReference).upperBound === -1){
//					
//						println(" -> map " + (disjunctedTwinRules.get(0).source as EClass).name + "2" + (disjunctedTwinRules.get(0).target as EClass).name + "Disjunct();")
//				}
//				else if (((childRule.source) as EReference).upperBound === 1){
//						println(".map " + (disjunctedTwinRules.get(0).source as EClass).name + "2" + (disjunctedTwinRules.get(0).target as EClass).name + "Disjunct();")
//				}
//				isPrinted.add(disjunctedTwinRules.get(0))				
//				}
//			}
			if (!(invokedRule.target as EClass).abstract){
				println("Duhet te vije ketu")
				
					
						println("-> map " + invokedRule.name + "();")					
			
			}
			else {
				for (subrule : mappingModel.rules){
					if ((invokedRule.target as EClass).isSuperTypeOf(subrule.target as EClass) && (invokedRule.source as EClass) == (subrule.source as EClass) && !(subrule.target as EClass).abstract){
						if (((childRule.source) as EReference).upperBound === -1){
							if (!childRule.condition.nullOrEmpty){
								println(".map " + (subrule.source as EClass).name + "2" + (subrule.target as EClass).name + "();")					
							}
							else {
								println(" -> map " + (subrule.source as EClass).name + "2" + (subrule.target as EClass).name + "();")	
							}
						}
						else if (((childRule.source) as EReference).upperBound === 1){
								println(".map " + (subrule.source as EClass).name + "2" + (subrule.target as EClass).name + "();")
						}
					}
				}
			}			
			printed=false
							
		} 
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*/
 * Prints the invoked rule and the . or -> before the invoked rule based on the upper bound of the source of the childRule.
 * Even though when the source element has an upper bound of -1 we use an ->, if there is a condition, we use a .
 * The invoked rules can have the extension Disjunct or not based on certain conditions
 */
def printInvokedRule (MappingRule invokedRule, MappingRule childRule){
	
		if ((invokedRule.source as EClass).name == (childRule.source as EReference).EType.name && (invokedRule.target as EClass).name == (childRule.target as EReference).EType.name){	
				
			if (disjunctRulesInvokation.contains(invokedRule) && findRuleWithDisjunct.contains(invokedRule)){
		
				if (((childRule.source) as EReference).upperBound === -1){
			
						println(" -> map " + invokedRule.name + "Disjunct();")
				}
				else if (((childRule.source) as EReference).upperBound === 1){
					println(".map " + invokedRule.name + "Disjunct();")
				}
			}	
		
			else if (disjunctedTwinRules.size() !== 1 && disjunctedTwinRules.size() !== 0 && findRuleWithDisjunct.contains(invokedRule)){
					//println("size i disjuncted twin rules" + disjunctedTwinRules.size());
			if (!isPrinted.contains(disjunctedTwinRules.get(0))){			
				if (((childRule.source) as EReference).upperBound === -1){
					
						println(" -> map " + (disjunctedTwinRules.get(0).source as EClass).name + "2" + (disjunctedTwinRules.get(0).target as EClass).name + "Disjunct();")
				}
				else if (((childRule.source) as EReference).upperBound === 1){
						println(".map " + (disjunctedTwinRules.get(0).source as EClass).name + "2" + (disjunctedTwinRules.get(0).target as EClass).name + "Disjunct();")
				}
				isPrinted.add(disjunctedTwinRules.get(0))				
				}
			}
			else if (!(invokedRule.target as EClass).abstract){
				if (((childRule.source) as EReference).upperBound === -1){
					if (!childRule.condition.nullOrEmpty){
						println(".map " + invokedRule.name + "();")					
					}
					else {
						println(" -> map " + invokedRule.name + "();")	
					}
				}
				else if (((childRule.source) as EReference).upperBound === 1){
						println(".map " + invokedRule.name + "();")
				}
			}
			else {
				for (subrule : mappingModel.rules){
					if ((invokedRule.target as EClass).isSuperTypeOf(subrule.target as EClass) && (invokedRule.source as EClass) == (subrule.source as EClass) && !(subrule.target as EClass).abstract){
						if (((childRule.source) as EReference).upperBound === -1){
							if (!childRule.condition.nullOrEmpty){
								println(".map " + (subrule.source as EClass).name + "2" + (subrule.target as EClass).name + "();")					
							}
							else {
								println(" -> map " + (subrule.source as EClass).name + "2" + (subrule.target as EClass).name + "();")	
							}
						}
						else if (((childRule.source) as EReference).upperBound === 1){
								println(".map " + (subrule.source as EClass).name + "2" + (subrule.target as EClass).name + "();")
						}
					}
				}
			}			
			printed=false
							
		} 
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*/
 * Prints the invoked rule and the . or -> before the invoked rule based on the upper bound of the source of the childRule.
 * Even though when the source element has an upper bound of -1 we use an ->, if there is a condition, we use a .
 * The invoked rules can have the extension Disjunct or not based on certain conditions
 */
def printInvokedRuleOcl (MappingRule invokedRule, MappingRule childRule){
	
		if ((invokedRule.source as EClass).name == extractParameter(childRule.condition) && (invokedRule.target as EClass).name == (childRule.target as EReference).EType.name){			
			if (disjunctRulesInvokation.contains(invokedRule) && findRuleWithDisjunct.contains(invokedRule)){
				if (((childRule.source) as EReference).upperBound === -1){
						println(" -> map " + invokedRule.name + "Disjunct();")
				}
				else if (((childRule.source) as EReference).upperBound === 1){
				}
			}	
		
			else if (disjunctedTwinRules.size() !== 1 && disjunctedTwinRules.size() !== 0 && findRuleWithDisjunct.contains(invokedRule)){
					//println("size i disjuncted twin rules" + disjunctedTwinRules.size());
			if (!isPrinted.contains(disjunctedTwinRules.get(0))){			
				if (((childRule.source) as EReference).upperBound === -1){
					
						println(" -> map " + (disjunctedTwinRules.get(0).source as EClass).name + "2" + (disjunctedTwinRules.get(0).target as EClass).name + "Disjunct();")
				}
				else if (((childRule.source) as EReference).upperBound === 1){
						println(".map " + (disjunctedTwinRules.get(0).source as EClass).name + "2" + (disjunctedTwinRules.get(0).target as EClass).name + "Disjunct();")
				}
				isPrinted.add(disjunctedTwinRules.get(0))				
				}
			}
			else if (!(invokedRule.target as EClass).abstract){
			if ((childRule.source) instanceof EReference){
				if (((childRule.source) as EReference).upperBound === -1){
					if (!childRule.condition.nullOrEmpty){
						println(".map " + invokedRule.name + "();")					
					}
					else {
						println(" -> map " + invokedRule.name + "();")	
					}
				}
				else if (((childRule.source) as EReference).upperBound === 1){
						println(".map " + invokedRule.name + "();")
				}
				
				}
				else {
					println(" -> map " + invokedRule.name + "();")	
				}
			}
			else {
				for (subrule : mappingModel.rules){
					if ((invokedRule.target as EClass).isSuperTypeOf(subrule.target as EClass) && (invokedRule.source as EClass) == (subrule.source as EClass) && !(subrule.target as EClass).abstract){
						if (((childRule.source) as EReference).upperBound === -1){
							if (!childRule.condition.nullOrEmpty){
								println(".map " + (subrule.source as EClass).name + "2" + (subrule.target as EClass).name + "();")					
							}
							else {
								println(" -> map " + (subrule.source as EClass).name + "2" + (subrule.target as EClass).name + "();")	
							}
						}
						else if (((childRule.source) as EReference).upperBound === 1){
								println(".map " + (subrule.source as EClass).name + "2" + (subrule.target as EClass).name + "();")
						}
					}
				}
			}			
			printed=false
							
		} 
}


//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * We cannot generate automatically the assignment operator or the addition operator, therefore we let the user decide. 
 * The reason why we cannot generate it is because even though we know that if the source element is not a collection we should use := 
 * (because adding is not possible), in the case where the source is a collection of elements both := (initialize the collection and dropping all previous elements),
 * and += (add to the collection) can be used and we cannot predict that. To make it easier for the user we define := as default (it is used in the majority of cases,
 * therefore the user doesn't have to change it often). 
 */
def generateAssignment (MappingRule childRule){
	if (childRule.operator.toString == "assign") {
		print(" := ")
	} 
	else if (childRule.operator.toString == "add")
	{
		print(" += ")
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Populate the added class with attributes and references. The mappings should happen between references only or attributes only. 
 * Otherwise, there will be thrown an exception stating that the source and target should be of the same type (either both EAttribute or both EReferences)
 * 
 */
def populateAddedClass(MappingRule childRule){
print("{")
println
	for (grandchRules : childRule.childRules){	
	generateChildRulesRecursively(grandchRules, childRule)
	stackAttributePath.clear
    }
    if (childRule.childHelpers.empty){
	println("    };")
  }

}
//////////////////////////////////////////////////////////////////////////////////////////////
/*/
 * The target metaamodel might contain classes that have no corresponding class in the source metamodel (thus cannot be transformed). In this situation,
 * the user should create such class. The class might be left empty, or the user might want to populate it. 
 */
def addClasstarget(MappingRule childRule){
	print("    var " + (childRule.target as EReference).EType.name + "Object := ")
	print("object " + qualifiedName((childRule.target as EReference).EType))
	if (childRule.childRules.empty && childRule.childHelpers.empty){ 
		println("{};")
	}
	else 
	{
	if (!childRule.childRules.empty){  
       //    println("Te rule")
   		populateAddedClass(childRule)			 
	}
	if (!childRule.childHelpers.empty){
       //println("Te helpper")
		populateAddedClassWithHelper(childRule)
	}
}
	print("    "+(childRule.target as EReference).name)
	generateAssignment(childRule)
	println((childRule.target as EReference).EType.name + "Object;")			
}
 
//////////////////////////////////////////////////////////////////////////////////////////////
 /*/
  * Added in the second revision beecause helper statements inside added classes were not being printed.
  * Could not use mappingclasshaschildhelper because of bad printing of brackets
  */
  
 def populateAddedClassWithHelper (MappingRule rule){
   if (rule.childRules.empty){
 	println ("{")
 	}
 	
    for (helper : rule.childHelpers){
 
		print("        " + helper.statement.toString)
		  	println ("{")
		if (helper.childRules.size != 0){
			for (childRule : helper.childRules){	
				print("    ")
				if (childRule.source !== null && childRule.target !== null && childRule.source instanceof EReference && childRule.target instanceof EReference){						
					transformReferencesOfAddedClasses(childRule, rule)        		 			
				}	
				else if (childRule.source instanceof EEnum && childRule.EEnumLiteral instanceof EEnumLiteral && childRule.target instanceof EAttribute){			
				transformEnumAddedClass(childRule)
			}	
				else {		
					generateChildRulesRecursively(childRule, rule) 				
				}		
			}
		}
		if (helper.childHelpers.size != 0){
			space.add("    ")
			helperHasChildHelper(rule, helper)
		}
		println("        }; ")		
	}
	println("    }; ")	
	stackAttributePath.clear
}
 
//////////////////////////////////////////////////////////////////////////////////////////////
def generateMappingDeclaration(){
generateMainFunction
	for (rule : mappingModel.rules){
		for (secondrule : mappingModel.rules){
			if (rule.source === secondrule.source && rule.target === secondrule.target){
				d++
				rregullatenjejta.add(rule)
				rregullatenjejta.add(secondrule)
			}
		}
		generateComment(rule)	
		if (rule.source instanceof EClass && rule.target instanceof EClass){
			rule.name = ((rule.source) as EClass).name + "2" + ((rule.target) as EClass).name
			for (disjunctrule : mappingModel.rules){
				populateListWithDisjunctRules(rule,disjunctrule)
				//populateListWithTwinRules(rule,disjunctrule)
			}
			if (disjunctedRules.size > 1 ){
				println       				
				printDisjunct(rule)       				     					
			}			  

			else if (twinRule.size > 1) {
				
			    println(twinRule)
				println       					
				printDisjunctTwin(rule)  
			}     	
			katjeter=0
		    disjunctedRules.clear
		    twinRule.clear
		    duplicates.clear
		    unique.clear
		    alreadyPrintedDisjunctedRule.clear
		    listaduplikate.clear
	    
		    if (d==1){
				printRegularOrAbstractMapping (rule)
            }
            else if (d>1){
            	printRegularOrAbstractMappingTwinSignature (rule,rregullatenjejta)
            }
			if (((rule.source) as EClass).ESuperTypes !== null || ((rule.target) as EClass).ESuperTypes !== null){
				generateInheritance(rule)
			}
			inheritedRules.clear
			generateconditionEClass(rule)
			println("{")
			generateChildRules(rule)
			println("}")
		}
		d=0	
		rregullatenjejta.clear
		
	}	
}
/* 
 * When the user defines multiple mapping rules with the same source and target, the user is supposed to define them in the same order he would
 * want them to show in the disjunction (disjunction checks in a chronological order and invokes the first mapping operation whose guard evaluate to true).
 * Nevertheless, the user might make a mistake and we would like to check that. The user should not define a mapping rule (part of these multiple mapping rules),
 * that has no condition, before the mapping rules that have a condition. Otherwise, this would be the mapping rule that would always be invoked. 
 * Therefore, we iterate through the similar rules (i.e., mapping rules that have same source and target), and store the ones that have no condition in 
 * ruleNoCondition, and remove them from the array that contains all the similar rules. The rules in the array will be shifted to the left.
 * Afterwards we add all the mapping rules in the ruleNoCOndition to the array (they will be placed in the end). 
 */
 
def verifyChronologicalOrderOfSimilarRules(MappingRule rule, ArrayList<MappingRule> rregullat){

	for (var i=0 ; i<rregullat.size; i++){
		if (rregullat.get(i).condition.nullOrEmpty){
			ruleNoCondition.add(rregullat.get(i))
			rregullat.remove(rregullat.get(i))
		}
	}
   return rregullat.addAll(ruleNoCondition)
}


//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * When there are multiple similar rules, and we will include them as disjuncted rules, when we print them, them cannot have the same name
 * as in QVTo names have to be unique. Therefore, in such cases, we add the index at the end of the mapping operation name (e.g., StateMachine2StateMachine0)
 * We do the same both for abstract and non abstract mapping rules. 
 */

def printRegularOrAbstractMappingTwinSignature (MappingRule rule, ArrayList<MappingRule> rregullat){
 	
    verifyChronologicalOrderOfSimilarRules(rule,rregullat)
	
	if (((rule.target) as EClass).abstract){
		rule.name = "Abstract" + ((rule.source) as EClass).name + "2" + ((rule.target) as EClass).name + rregullat.indexOf(rule)
		println("abstract mapping " + qualifiedName(rule.source) + " :: " + rule.name + "() : " + qualifiedName(rule.target))     	 		
	}
	else {
		rule.name = ((rule.source) as EClass).name + "2" + ((rule.target) as EClass).name + rregullat.indexOf(rule)
		println("mapping " + qualifiedName(rule.source) + " :: " + rule.name + "() : " + qualifiedName(rule.target)) 
	}	
}

	}


