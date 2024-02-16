/**
 */
package uniRunningExample_view;

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
 *   <li>{@link uniRunningExample_view.Department#getProject <em>Project</em>}</li>
 *   <li>{@link uniRunningExample_view.Department#getDepName <em>Dep Name</em>}</li>
 *   <li>{@link uniRunningExample_view.Department#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see uniRunningExample_view.UniRunningExample_viewPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample_view.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference list.
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getDepartment_Project()
	 * @model type="uniRunningExample_view.Project" containment="true"
	 * @generated
	 */
	EList getProject();

	/**
	 * Returns the value of the '<em><b>Dep Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dep Name</em>' attribute.
	 * @see #setDepName(String)
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getDepartment_DepName()
	 * @model
	 * @generated
	 */
	String getDepName();

	/**
	 * Sets the value of the '{@link uniRunningExample_view.Department#getDepName <em>Dep Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dep Name</em>' attribute.
	 * @see #getDepName()
	 * @generated
	 */
	void setDepName(String value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample_view.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference list.
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getDepartment_Employee()
	 * @model type="uniRunningExample_view.Employee" containment="true"
	 * @generated
	 */
	EList getEmployee();

} // Department
