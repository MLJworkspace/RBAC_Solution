/**
 */
package accessControlMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accessControlMetamodel.AccessControlModel#getName <em>Name</em>}</li>
 *   <li>{@link accessControlMetamodel.AccessControlModel#getEclasspermissions <em>Eclasspermissions</em>}</li>
 *   <li>{@link accessControlMetamodel.AccessControlModel#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see accessControlMetamodel.AccessControlMetamodelPackage#getAccessControlModel()
 * @model
 * @generated
 */
public interface AccessControlModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getAccessControlModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link accessControlMetamodel.AccessControlModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eclasspermissions</b></em>' containment reference list.
	 * The list contents are of type {@link accessControlMetamodel.EClassPermissions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclasspermissions</em>' containment reference list.
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getAccessControlModel_Eclasspermissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EClassPermissions> getEclasspermissions();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getAccessControlModel_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link accessControlMetamodel.AccessControlModel#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // AccessControlModel
