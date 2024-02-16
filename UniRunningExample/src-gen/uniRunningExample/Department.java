/**
 */
package uniRunningExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.Department#getProject <em>Project</em>}</li>
 *   <li>{@link uniRunningExample.Department#getDepName <em>Dep Name</em>}</li>
 *   <li>{@link uniRunningExample.Department#getEmployee <em>Employee</em>}</li>
 *   <li>{@link uniRunningExample.Department#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see uniRunningExample.UniRunningExamplePackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getDepartment_Project()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProject();

	/**
	 * Returns the value of the '<em><b>Dep Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dep Name</em>' attribute.
	 * @see #setDepName(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getDepartment_DepName()
	 * @model
	 * @generated
	 */
	String getDepName();

	/**
	 * Sets the value of the '{@link uniRunningExample.Department#getDepName <em>Dep Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dep Name</em>' attribute.
	 * @see #getDepName()
	 * @generated
	 */
	void setDepName(String value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getDepartment_Employee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Employee> getEmployee();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getDepartment_Program()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Program> getProgram();

} // Department
