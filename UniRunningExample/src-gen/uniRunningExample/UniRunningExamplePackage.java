/**
 */
package uniRunningExample;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uniRunningExample.UniRunningExampleFactory
 * @model kind="package"
 * @generated
 */
public interface UniRunningExamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uniRunningExample";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uniRunningExample";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uniRunningExample";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniRunningExamplePackage eINSTANCE = uniRunningExample.impl.UniRunningExamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link uniRunningExample.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample.impl.CourseImpl
	 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TEACHER = 2;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uniRunningExample.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample.impl.ProjectImpl
	 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Workpackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WORKPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Partner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARTNER = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Funding Agency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FUNDING_AGENCY = 3;

	/**
	 * The feature id for the '<em><b>Project Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_DURATION = 4;

	/**
	 * The feature id for the '<em><b>Funding Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FUNDING_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Project Employee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_EMPLOYEE = 6;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uniRunningExample.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample.impl.DepartmentImpl
	 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 2;

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
	 * The feature id for the '<em><b>Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAM = 3;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uniRunningExample.impl.WorkPackageImpl <em>Work Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample.impl.WorkPackageImpl
	 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getWorkPackage()
	 * @generated
	 */
	int WORK_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Wp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__WP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Wp Employee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__WP_EMPLOYEE = 1;

	/**
	 * The feature id for the '<em><b>Wp Partner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__WP_PARTNER = 2;

	/**
	 * The feature id for the '<em><b>Wp Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__WP_DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uniRunningExample.impl.PartnerImpl <em>Partner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample.impl.PartnerImpl
	 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getPartner()
	 * @generated
	 */
	int PARTNER = 4;

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
	 * The number of operations of the '<em>Partner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uniRunningExample.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample.impl.ProgramImpl
	 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 5;

	/**
	 * The feature id for the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Program Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAM_CODE = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__COURSE = 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uniRunningExample.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample.impl.EmployeeImpl
	 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 6;

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
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uniRunningExample.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample.impl.UniversityImpl
	 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 7;

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
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uniRunningExample.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uniRunningExample.Type
	 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 8;

	/**
	 * Returns the meta object for class '{@link uniRunningExample.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see uniRunningExample.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Course#getCourseName <em>Course Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Name</em>'.
	 * @see uniRunningExample.Course#getCourseName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see uniRunningExample.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the reference list '{@link uniRunningExample.Course#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teacher</em>'.
	 * @see uniRunningExample.Course#getTeacher()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Teacher();

	/**
	 * Returns the meta object for class '{@link uniRunningExample.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see uniRunningExample.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample.Project#getWorkpackage <em>Workpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workpackage</em>'.
	 * @see uniRunningExample.Project#getWorkpackage()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Workpackage();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample.Project#getPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partner</em>'.
	 * @see uniRunningExample.Project#getPartner()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Partner();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Project#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see uniRunningExample.Project#getProjectName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Project#getFundingAgency <em>Funding Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funding Agency</em>'.
	 * @see uniRunningExample.Project#getFundingAgency()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_FundingAgency();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Project#getProjectDuration <em>Project Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Duration</em>'.
	 * @see uniRunningExample.Project#getProjectDuration()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectDuration();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Project#getFundingValue <em>Funding Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funding Value</em>'.
	 * @see uniRunningExample.Project#getFundingValue()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_FundingValue();

	/**
	 * Returns the meta object for the reference list '{@link uniRunningExample.Project#getProjectEmployee <em>Project Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Project Employee</em>'.
	 * @see uniRunningExample.Project#getProjectEmployee()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectEmployee();

	/**
	 * Returns the meta object for class '{@link uniRunningExample.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see uniRunningExample.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample.Department#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project</em>'.
	 * @see uniRunningExample.Department#getProject()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Project();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Department#getDepName <em>Dep Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dep Name</em>'.
	 * @see uniRunningExample.Department#getDepName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_DepName();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample.Department#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employee</em>'.
	 * @see uniRunningExample.Department#getEmployee()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Employee();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample.Department#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program</em>'.
	 * @see uniRunningExample.Department#getProgram()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Program();

	/**
	 * Returns the meta object for class '{@link uniRunningExample.WorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Package</em>'.
	 * @see uniRunningExample.WorkPackage
	 * @generated
	 */
	EClass getWorkPackage();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.WorkPackage#getWpName <em>Wp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Name</em>'.
	 * @see uniRunningExample.WorkPackage#getWpName()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_WpName();

	/**
	 * Returns the meta object for the reference list '{@link uniRunningExample.WorkPackage#getWpEmployee <em>Wp Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wp Employee</em>'.
	 * @see uniRunningExample.WorkPackage#getWpEmployee()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_WpEmployee();

	/**
	 * Returns the meta object for the reference list '{@link uniRunningExample.WorkPackage#getWpPartner <em>Wp Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wp Partner</em>'.
	 * @see uniRunningExample.WorkPackage#getWpPartner()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_WpPartner();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.WorkPackage#getWpDescription <em>Wp Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Description</em>'.
	 * @see uniRunningExample.WorkPackage#getWpDescription()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_WpDescription();

	/**
	 * Returns the meta object for class '{@link uniRunningExample.Partner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner</em>'.
	 * @see uniRunningExample.Partner
	 * @generated
	 */
	EClass getPartner();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Partner#getPartnerName <em>Partner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Name</em>'.
	 * @see uniRunningExample.Partner#getPartnerName()
	 * @see #getPartner()
	 * @generated
	 */
	EAttribute getPartner_PartnerName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Partner#getPartnerType <em>Partner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Type</em>'.
	 * @see uniRunningExample.Partner#getPartnerType()
	 * @see #getPartner()
	 * @generated
	 */
	EAttribute getPartner_PartnerType();

	/**
	 * Returns the meta object for class '{@link uniRunningExample.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see uniRunningExample.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Program#getProgramName <em>Program Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Name</em>'.
	 * @see uniRunningExample.Program#getProgramName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_ProgramName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Program#getProgramCode <em>Program Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Code</em>'.
	 * @see uniRunningExample.Program#getProgramCode()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_ProgramCode();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample.Program#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see uniRunningExample.Program#getCourse()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Course();

	/**
	 * Returns the meta object for class '{@link uniRunningExample.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see uniRunningExample.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Employee#getEmpName <em>Emp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emp Name</em>'.
	 * @see uniRunningExample.Employee#getEmpName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmpName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Employee#getEmpSurname <em>Emp Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emp Surname</em>'.
	 * @see uniRunningExample.Employee#getEmpSurname()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmpSurname();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.Employee#getEmpExpertise <em>Emp Expertise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emp Expertise</em>'.
	 * @see uniRunningExample.Employee#getEmpExpertise()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmpExpertise();

	/**
	 * Returns the meta object for class '{@link uniRunningExample.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see uniRunningExample.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the containment reference list '{@link uniRunningExample.University#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department</em>'.
	 * @see uniRunningExample.University#getDepartment()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Department();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.University#getUniName <em>Uni Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uni Name</em>'.
	 * @see uniRunningExample.University#getUniName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_UniName();

	/**
	 * Returns the meta object for the attribute '{@link uniRunningExample.University#getUniAddress <em>Uni Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uni Address</em>'.
	 * @see uniRunningExample.University#getUniAddress()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_UniAddress();

	/**
	 * Returns the meta object for enum '{@link uniRunningExample.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see uniRunningExample.Type
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
	UniRunningExampleFactory getUniRunningExampleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uniRunningExample.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample.impl.CourseImpl
		 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NAME = eINSTANCE.getCourse_CourseName();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__TEACHER = eINSTANCE.getCourse_Teacher();

		/**
		 * The meta object literal for the '{@link uniRunningExample.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample.impl.ProjectImpl
		 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Workpackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__WORKPACKAGE = eINSTANCE.getProject_Workpackage();

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
		 * The meta object literal for the '<em><b>Funding Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__FUNDING_VALUE = eINSTANCE.getProject_FundingValue();

		/**
		 * The meta object literal for the '<em><b>Project Employee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_EMPLOYEE = eINSTANCE.getProject_ProjectEmployee();

		/**
		 * The meta object literal for the '{@link uniRunningExample.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample.impl.DepartmentImpl
		 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getDepartment()
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
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAM = eINSTANCE.getDepartment_Program();

		/**
		 * The meta object literal for the '{@link uniRunningExample.impl.WorkPackageImpl <em>Work Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample.impl.WorkPackageImpl
		 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getWorkPackage()
		 * @generated
		 */
		EClass WORK_PACKAGE = eINSTANCE.getWorkPackage();

		/**
		 * The meta object literal for the '<em><b>Wp Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PACKAGE__WP_NAME = eINSTANCE.getWorkPackage_WpName();

		/**
		 * The meta object literal for the '<em><b>Wp Employee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PACKAGE__WP_EMPLOYEE = eINSTANCE.getWorkPackage_WpEmployee();

		/**
		 * The meta object literal for the '<em><b>Wp Partner</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PACKAGE__WP_PARTNER = eINSTANCE.getWorkPackage_WpPartner();

		/**
		 * The meta object literal for the '<em><b>Wp Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PACKAGE__WP_DESCRIPTION = eINSTANCE.getWorkPackage_WpDescription();

		/**
		 * The meta object literal for the '{@link uniRunningExample.impl.PartnerImpl <em>Partner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample.impl.PartnerImpl
		 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getPartner()
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
		 * The meta object literal for the '{@link uniRunningExample.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample.impl.ProgramImpl
		 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Program Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__PROGRAM_NAME = eINSTANCE.getProgram_ProgramName();

		/**
		 * The meta object literal for the '<em><b>Program Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__PROGRAM_CODE = eINSTANCE.getProgram_ProgramCode();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__COURSE = eINSTANCE.getProgram_Course();

		/**
		 * The meta object literal for the '{@link uniRunningExample.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample.impl.EmployeeImpl
		 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getEmployee()
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
		 * The meta object literal for the '{@link uniRunningExample.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample.impl.UniversityImpl
		 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getUniversity()
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
		 * The meta object literal for the '{@link uniRunningExample.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uniRunningExample.Type
		 * @see uniRunningExample.impl.UniRunningExamplePackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //UniRunningExamplePackage
