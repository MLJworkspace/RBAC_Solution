/**
 */
package uniRunningExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.University#getDepartment <em>Department</em>}</li>
 *   <li>{@link uniRunningExample.University#getUniName <em>Uni Name</em>}</li>
 *   <li>{@link uniRunningExample.University#getUniAddress <em>Uni Address</em>}</li>
 * </ul>
 *
 * @see uniRunningExample.UniRunningExamplePackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Department</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' containment reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getUniversity_Department()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Department> getDepartment();

	/**
	 * Returns the value of the '<em><b>Uni Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uni Name</em>' attribute.
	 * @see #setUniName(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getUniversity_UniName()
	 * @model
	 * @generated
	 */
	String getUniName();

	/**
	 * Sets the value of the '{@link uniRunningExample.University#getUniName <em>Uni Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uni Name</em>' attribute.
	 * @see #getUniName()
	 * @generated
	 */
	void setUniName(String value);

	/**
	 * Returns the value of the '<em><b>Uni Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uni Address</em>' attribute.
	 * @see #setUniAddress(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getUniversity_UniAddress()
	 * @model
	 * @generated
	 */
	String getUniAddress();

	/**
	 * Sets the value of the '{@link uniRunningExample.University#getUniAddress <em>Uni Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uni Address</em>' attribute.
	 * @see #getUniAddress()
	 * @generated
	 */
	void setUniAddress(String value);

} // University
