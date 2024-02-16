/**
 */
package uniRunningExample;

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
 *   <li>{@link uniRunningExample.Project#getWorkpackage <em>Workpackage</em>}</li>
 *   <li>{@link uniRunningExample.Project#getPartner <em>Partner</em>}</li>
 *   <li>{@link uniRunningExample.Project#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link uniRunningExample.Project#getFundingAgency <em>Funding Agency</em>}</li>
 *   <li>{@link uniRunningExample.Project#getProjectDuration <em>Project Duration</em>}</li>
 *   <li>{@link uniRunningExample.Project#getFundingValue <em>Funding Value</em>}</li>
 *   <li>{@link uniRunningExample.Project#getProjectEmployee <em>Project Employee</em>}</li>
 * </ul>
 *
 * @see uniRunningExample.UniRunningExamplePackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Workpackage</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample.WorkPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workpackage</em>' containment reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getProject_Workpackage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkPackage> getWorkpackage();

	/**
	 * Returns the value of the '<em><b>Partner</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample.Partner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner</em>' containment reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getProject_Partner()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partner> getPartner();

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getProject_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link uniRunningExample.Project#getProjectName <em>Project Name</em>}' attribute.
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
	 * @see uniRunningExample.UniRunningExamplePackage#getProject_FundingAgency()
	 * @model
	 * @generated
	 */
	String getFundingAgency();

	/**
	 * Sets the value of the '{@link uniRunningExample.Project#getFundingAgency <em>Funding Agency</em>}' attribute.
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
	 * @see uniRunningExample.UniRunningExamplePackage#getProject_ProjectDuration()
	 * @model
	 * @generated
	 */
	int getProjectDuration();

	/**
	 * Sets the value of the '{@link uniRunningExample.Project#getProjectDuration <em>Project Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Duration</em>' attribute.
	 * @see #getProjectDuration()
	 * @generated
	 */
	void setProjectDuration(int value);

	/**
	 * Returns the value of the '<em><b>Funding Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funding Value</em>' attribute.
	 * @see #setFundingValue(int)
	 * @see uniRunningExample.UniRunningExamplePackage#getProject_FundingValue()
	 * @model
	 * @generated
	 */
	int getFundingValue();

	/**
	 * Sets the value of the '{@link uniRunningExample.Project#getFundingValue <em>Funding Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funding Value</em>' attribute.
	 * @see #getFundingValue()
	 * @generated
	 */
	void setFundingValue(int value);

	/**
	 * Returns the value of the '<em><b>Project Employee</b></em>' reference list.
	 * The list contents are of type {@link uniRunningExample.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Employee</em>' reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getProject_ProjectEmployee()
	 * @model required="true"
	 * @generated
	 */
	EList<Employee> getProjectEmployee();

} // Project
