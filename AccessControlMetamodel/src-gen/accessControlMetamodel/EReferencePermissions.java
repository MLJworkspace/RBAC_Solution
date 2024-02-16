/**
 */
package accessControlMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference Permissions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accessControlMetamodel.EReferencePermissions#getName <em>Name</em>}</li>
 *   <li>{@link accessControlMetamodel.EReferencePermissions#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link accessControlMetamodel.EReferencePermissions#getEReference <em>EReference</em>}</li>
 * </ul>
 *
 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEReferencePermissions()
 * @model
 * @generated
 */
public interface EReferencePermissions extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEReferencePermissions_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link accessControlMetamodel.EReferencePermissions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute list.
	 * The list contents are of type {@link accessControlMetamodel.Permissions}.
	 * The literals are from the enumeration {@link accessControlMetamodel.Permissions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute list.
	 * @see accessControlMetamodel.Permissions
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEReferencePermissions_Permissions()
	 * @model
	 * @generated
	 */
	EList<Permissions> getPermissions();

	/**
	 * Returns the value of the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference</em>' reference.
	 * @see #setEReference(EObject)
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#getEReferencePermissions_EReference()
	 * @model
	 * @generated
	 */
	EObject getEReference();

	/**
	 * Sets the value of the '{@link accessControlMetamodel.EReferencePermissions#getEReference <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 * @generated
	 */
	void setEReference(EObject value);

	void setPermissions(Permissions permission);

	void setEClass(EReference eReference);

} // EReferencePermissions
