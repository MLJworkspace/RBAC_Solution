/**
 */
package accessControlMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Permissions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accessControlMetamodel.EClassPermissions#getName <em>Name</em>}</li>
 *   <li>{@link accessControlMetamodel.EClassPermissions#getEClass <em>EClass</em>}</li>
 *   <li>{@link accessControlMetamodel.EClassPermissions#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link accessControlMetamodel.EClassPermissions#getEattributepermissions <em>Eattributepermissions</em>}</li>
 *   <li>{@link accessControlMetamodel.EClassPermissions#getEreferencepermissions <em>Ereferencepermissions</em>}</li>
 * </ul>
 *
 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEClassPermissions()
 * @model
 * @generated
 */
public interface EClassPermissions extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEClassPermissions_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link accessControlMetamodel.EClassPermissions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eattributepermissions</b></em>' containment reference list.
	 * The list contents are of type {@link accessControlMetamodel.EAttributePermissions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eattributepermissions</em>' containment reference list.
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEClassPermissions_Eattributepermissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAttributePermissions> getEattributepermissions();

	/**
	 * Returns the value of the '<em><b>Ereferencepermissions</b></em>' containment reference list.
	 * The list contents are of type {@link accessControlMetamodel.EReferencePermissions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ereferencepermissions</em>' containment reference list.
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEClassPermissions_Ereferencepermissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EReferencePermissions> getEreferencepermissions();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute list.
	 * The list contents are of type {@link accessControlMetamodel.Permissions}.
	 * The literals are from the enumeration {@link accessControlMetamodel.Permissions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute list.
	 * @see accessControlMetamodel.Permissions
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEClassPermissions_Permissions()
	 * @model
	 * @generated
	 */
	EList<Permissions> getPermissions();

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EObject)
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEClassPermissions_EClass()
	 * @model
	 * @generated
	 */
	EObject getEClass();

	/**
	 * Sets the value of the '{@link accessControlMetamodel.EClassPermissions#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EObject value);

} // EClassPermissions
