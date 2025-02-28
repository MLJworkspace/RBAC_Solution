/**
 */
package uniRunningExample_view;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uniRunningExample_view.UniRunningExample_viewFactory
 * @model kind="package"
 * @generated
 */
public interface UniRunningExample_viewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uniRunningExample_view";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uniRunningExample_view";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uniRunningExample_view";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniRunningExample_viewPackage eINSTANCE = uniRunningExample_view.impl.UniRunningExample_viewPackageImpl.init();

	/**
	 * The meta object id for the '{@link uniRunningExample_view.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample_view.impl.ProjectImpl
	 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Partner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARTNER = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Funding Agency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FUNDING_AGENCY = 2;

	/**
	 * The feature id for the '<em><b>Project Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_DURATION = 3;

	/**
	 * The feature id for the '<em><b>Project Employee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_EMPLOYEE = 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link uniRunningExample_view.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample_view.impl.DepartmentImpl
	 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Dep Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__DEP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__EMPLOYEE = 2;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uniRunningExample_view.impl.PartnerImpl <em>Partner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample_view.impl.PartnerImpl
	 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getPartner()
	 * @generated
	 */
	int PARTNER = 2;

	/**
	 * The feature id for the '<em><b>Partner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER__PARTNER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Partner Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER__PARTNER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Partner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uniRunningExample_view.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample_view.impl.EmployeeImpl
	 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 3;

	/**
	 * The feature id for the '<em><b>Emp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Emp Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMP_SURNAME = 1;

	/**
	 * The feature id for the '<em><b>Emp Expertise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMP_EXPERTISE = 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uniRunningExample_view.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample_view.impl.UniversityImpl
	 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 4;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Uni Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__UNI_NAME = 1;

	/**
	 * The feature id for the '<em><b>Uni Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__UNI_ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uniRunningExample_view.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample_view.Type
	 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;


	/**
	 * Returns the meta object for class '{@link uniRunningExample_view.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see uniRunningExample_view.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample_view.Project#getPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partner</em>'.
	 * @see uniRunningExample_view.Project#getPartner()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Partner();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.Project#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see uniRunningExample_view.Project#getProjectName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.Project#getFundingAgency <em>Funding Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funding Agency</em>'.
	 * @see uniRunningExample_view.Project#getFundingAgency()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_FundingAgency();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.Project#getProjectDuration <em>Project Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Duration</em>'.
	 * @see uniRunningExample_view.Project#getProjectDuration()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectDuration();

	/**
	 * Returns the meta object for the reference list '{@link uniRunningExample_view.Project#getProjectEmployee <em>Project Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Project Employee</em>'.
	 * @see uniRunningExample_view.Project#getProjectEmployee()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectEmployee();

	/**
	 * Returns the meta object for class '{@link uniRunningExample_view.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see uniRunningExample_view.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample_view.Department#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project</em>'.
	 * @see uniRunningExample_view.Department#getProject()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Project();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.Department#getDepName <em>Dep Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dep Name</em>'.
	 * @see uniRunningExample_view.Department#getDepName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_DepName();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample_view.Department#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employee</em>'.
	 * @see uniRunningExample_view.Department#getEmployee()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Employee();

	/**
	 * Returns the meta object for class '{@link uniRunningExample_view.Partner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner</em>'.
	 * @see uniRunningExample_view.Partner
	 * @generated
	 */
	EClass getPartner();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.Partner#getPartnerName <em>Partner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Name</em>'.
	 * @see uniRunningExample_view.Partner#getPartnerName()
	 * @see #getPartner()
	 * @generated
	 */
	EAttribute getPartner_PartnerName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.Partner#getPartnerType <em>Partner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Type</em>'.
	 * @see uniRunningExample_view.Partner#getPartnerType()
	 * @see #getPartner()
	 * @generated
	 */
	EAttribute getPartner_PartnerType();

	/**
	 * Returns the meta object for class '{@link uniRunningExample_view.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see uniRunningExample_view.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.Employee#getEmpName <em>Emp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emp Name</em>'.
	 * @see uniRunningExample_view.Employee#getEmpName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmpName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.Employee#getEmpSurname <em>Emp Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emp Surname</em>'.
	 * @see uniRunningExample_view.Employee#getEmpSurname()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmpSurname();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.Employee#getEmpExpertise <em>Emp Expertise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emp Expertise</em>'.
	 * @see uniRunningExample_view.Employee#getEmpExpertise()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmpExpertise();

	/**
	 * Returns the meta object for class '{@link uniRunningExample_view.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see uniRunningExample_view.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample_view.University#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department</em>'.
	 * @see uniRunningExample_view.University#getDepartment()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Department();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.University#getUniName <em>Uni Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uni Name</em>'.
	 * @see uniRunningExample_view.University#getUniName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_UniName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample_view.University#getUniAddress <em>Uni Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uni Address</em>'.
	 * @see uniRunningExample_view.University#getUniAddress()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_UniAddress();

	/**
	 * Returns the meta object for enum '{@link uniRunningExample_view.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see uniRunningExample_view.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniRunningExample_viewFactory getUniRunningExample_viewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uniRunningExample_view.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample_view.impl.ProjectImpl
		 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Partner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PARTNER = eINSTANCE.getProject_Partner();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_NAME = eINSTANCE.getProject_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Funding Agency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__FUNDING_AGENCY = eINSTANCE.getProject_FundingAgency();

		/**
		 * The meta object literal for the '<em><b>Project Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_DURATION = eINSTANCE.getProject_ProjectDuration();

		/**
		 * The meta object literal for the '<em><b>Project Employee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_EMPLOYEE = eINSTANCE.getProject_ProjectEmployee();

		/**
		 * The meta object literal for the '{@link uniRunningExample_view.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample_view.impl.DepartmentImpl
		 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROJECT = eINSTANCE.getDepartment_Project();

		/**
		 * The meta object literal for the '<em><b>Dep Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__DEP_NAME = eINSTANCE.getDepartment_DepName();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__EMPLOYEE = eINSTANCE.getDepartment_Employee();

		/**
		 * The meta object literal for the '{@link uniRunningExample_view.impl.PartnerImpl <em>Partner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample_view.impl.PartnerImpl
		 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getPartner()
		 * @generated
		 */
		EClass PARTNER = eINSTANCE.getPartner();

		/**
		 * The meta object literal for the '<em><b>Partner Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER__PARTNER_NAME = eINSTANCE.getPartner_PartnerName();

		/**
		 * The meta object literal for the '<em><b>Partner Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER__PARTNER_TYPE = eINSTANCE.getPartner_PartnerType();

		/**
		 * The meta object literal for the '{@link uniRunningExample_view.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample_view.impl.EmployeeImpl
		 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Emp Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMP_NAME = eINSTANCE.getEmployee_EmpName();

		/**
		 * The meta object literal for the '<em><b>Emp Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMP_SURNAME = eINSTANCE.getEmployee_EmpSurname();

		/**
		 * The meta object literal for the '<em><b>Emp Expertise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMP_EXPERTISE = eINSTANCE.getEmployee_EmpExpertise();

		/**
		 * The meta object literal for the '{@link uniRunningExample_view.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample_view.impl.UniversityImpl
		 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__DEPARTMENT = eINSTANCE.getUniversity_Department();

		/**
		 * The meta object literal for the '<em><b>Uni Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__UNI_NAME = eINSTANCE.getUniversity_UniName();

		/**
		 * The meta object literal for the '<em><b>Uni Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__UNI_ADDRESS = eINSTANCE.getUniversity_UniAddress();

		/**
		 * The meta object literal for the '{@link uniRunningExample_view.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample_view.Type
		 * @see uniRunningExample_view.impl.UniRunningExample_viewPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //UniRunningExample_viewPackage
