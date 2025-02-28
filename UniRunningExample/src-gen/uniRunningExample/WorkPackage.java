/**
 */
package uniRunningExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.WorkPackage#getWpName <em>Wp Name</em>}</li>
 *   <li>{@link uniRunningExample.WorkPackage#getWpEmployee <em>Wp Employee</em>}</li>
 *   <li>{@link uniRunningExample.WorkPackage#getWpPartner <em>Wp Partner</em>}</li>
 *   <li>{@link uniRunningExample.WorkPackage#getWpDescription <em>Wp Description</em>}</li>
 * </ul>
 *
 * @see uniRunningExample.UniRunningExamplePackage#getWorkPackage()
 * @model
 * @generated
 */
public interface WorkPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Wp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Name</em>' attribute.
	 * @see #setWpName(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getWorkPackage_WpName()
	 * @model
	 * @generated
	 */
	String getWpName();

	/**
	 * Sets the value of the '{@link uniRunningExample.WorkPackage#getWpName <em>Wp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Name</em>' attribute.
	 * @see #getWpName()
	 * @generated
	 */
	void setWpName(String value);

	/**
	 * Returns the value of the '<em><b>Wp Employee</b></em>' reference list.
	 * The list contents are of type {@link uniRunningExample.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Employee</em>' reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getWorkPackage_WpEmployee()
	 * @model required="true"
	 * @generated
	 */
	EList<Employee> getWpEmployee();

	/**
	 * Returns the value of the '<em><b>Wp Partner</b></em>' reference list.
	 * The list contents are of type {@link uniRunningExample.Partner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Partner</em>' reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getWorkPackage_WpPartner()
	 * @model
	 * @generated
	 */
	EList<Partner> getWpPartner();

	/**
	 * Returns the value of the '<em><b>Wp Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Description</em>' attribute.
	 * @see #setWpDescription(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getWorkPackage_WpDescription()
	 * @model
	 * @generated
	 */
	String getWpDescription();

	/**
	 * Sets the value of the '{@link uniRunningExample.WorkPackage#getWpDescription <em>Wp Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Description</em>' attribute.
	 * @see #getWpDescription()
	 * @generated
	 */
	void setWpDescription(String value);

} // WorkPackage
