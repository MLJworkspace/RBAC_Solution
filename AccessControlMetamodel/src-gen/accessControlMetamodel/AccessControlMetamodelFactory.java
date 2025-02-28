/**
 */
package accessControlMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see accessControlMetamodel.AccessControlMetamodelPackage
 * @generated
 */
public interface AccessControlMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessControlMetamodelFactory eINSTANCE = accessControlMetamodel.impl.AccessControlMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Access Control Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control Model</em>'.
	 * @generated
	 */
	AccessControlModel createAccessControlModel();

	/**
	 * Returns a new object of class '<em>EClass Permissions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass Permissions</em>'.
	 * @generated
	 */
	EClassPermissions createEClassPermissions();

	/**
	 * Returns a new object of class '<em>EAttribute Permissions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAttribute Permissions</em>'.
	 * @generated
	 */
	EAttributePermissions createEAttributePermissions();

	/**
	 * Returns a new object of class '<em>EReference Permissions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReference Permissions</em>'.
	 * @generated
	 */
	EReferencePermissions createEReferencePermissions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AccessControlMetamodelPackage getAccessControlMetamodelPackage();

} //AccessControlMetamodelFactory
