/**
 */
package uniRunningExample_view;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample_view.Employee#getEmpName <em>Emp Name</em>}</li>
 *   <li>{@link uniRunningExample_view.Employee#getEmpSurname <em>Emp Surname</em>}</li>
 *   <li>{@link uniRunningExample_view.Employee#getEmpExpertise <em>Emp Expertise</em>}</li>
 * </ul>
 *
 * @see uniRunningExample_view.UniRunningExample_viewPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Emp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Name</em>' attribute.
	 * @see #setEmpName(String)
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getEmployee_EmpName()
	 * @model
	 * @generated
	 */
	String getEmpName();

	/**
	 * Sets the value of the '{@link uniRunningExample_view.Employee#getEmpName <em>Emp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Name</em>' attribute.
	 * @see #getEmpName()
	 * @generated
	 */
	void setEmpName(String value);

	/**
	 * Returns the value of the '<em><b>Emp Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Surname</em>' attribute.
	 * @see #setEmpSurname(String)
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getEmployee_EmpSurname()
	 * @model
	 * @generated
	 */
	String getEmpSurname();

	/**
	 * Sets the value of the '{@link uniRunningExample_view.Employee#getEmpSurname <em>Emp Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Surname</em>' attribute.
	 * @see #getEmpSurname()
	 * @generated
	 */
	void setEmpSurname(String value);

	/**
	 * Returns the value of the '<em><b>Emp Expertise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Expertise</em>' attribute.
	 * @see #setEmpExpertise(String)
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getEmployee_EmpExpertise()
	 * @model
	 * @generated
	 */
	String getEmpExpertise();

	/**
	 * Sets the value of the '{@link uniRunningExample_view.Employee#getEmpExpertise <em>Emp Expertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Expertise</em>' attribute.
	 * @see #getEmpExpertise()
	 * @generated
	 */
	void setEmpExpertise(String value);

} // Employee
