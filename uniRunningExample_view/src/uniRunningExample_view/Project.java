/**
 */
package uniRunningExample_view;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample_view.Project#getPartner <em>Partner</em>}</li>
 *   <li>{@link uniRunningExample_view.Project#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link uniRunningExample_view.Project#getFundingAgency <em>Funding Agency</em>}</li>
 *   <li>{@link uniRunningExample_view.Project#getProjectDuration <em>Project Duration</em>}</li>
 *   <li>{@link uniRunningExample_view.Project#getProjectEmployee <em>Project Employee</em>}</li>
 * </ul>
 *
 * @see uniRunningExample_view.UniRunningExample_viewPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Partner</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample_view.Partner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner</em>' containment reference list.
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getProject_Partner()
	 * @model type="uniRunningExample_view.Partner" containment="true"
	 * @generated
	 */
	EList getPartner();

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getProject_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link uniRunningExample_view.Project#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Funding Agency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funding Agency</em>' attribute.
	 * @see #setFundingAgency(String)
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getProject_FundingAgency()
	 * @model
	 * @generated
	 */
	String getFundingAgency();

	/**
	 * Sets the value of the '{@link uniRunningExample_view.Project#getFundingAgency <em>Funding Agency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funding Agency</em>' attribute.
	 * @see #getFundingAgency()
	 * @generated
	 */
	void setFundingAgency(String value);

	/**
	 * Returns the value of the '<em><b>Project Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Duration</em>' attribute.
	 * @see #setProjectDuration(int)
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getProject_ProjectDuration()
	 * @model
	 * @generated
	 */
	int getProjectDuration();

	/**
	 * Sets the value of the '{@link uniRunningExample_view.Project#getProjectDuration <em>Project Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Duration</em>' attribute.
	 * @see #getProjectDuration()
	 * @generated
	 */
	void setProjectDuration(int value);

	/**
	 * Returns the value of the '<em><b>Project Employee</b></em>' reference list.
	 * The list contents are of type {@link uniRunningExample_view.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Employee</em>' reference list.
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getProject_ProjectEmployee()
	 * @model type="uniRunningExample_view.Employee"
	 * @generated
	 */
	EList getProjectEmployee();

} // Project
