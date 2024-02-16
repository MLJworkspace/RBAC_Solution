/**
 */
package uniRunningExample_view.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uniRunningExample_view.Department;
import uniRunningExample_view.UniRunningExample_viewFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepartmentTest extends TestCase {

	/**
	 * The fixture for this Department test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Department fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DepartmentTest.class);
	}

	/**
	 * Constructs a new Department test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepartmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Department test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Department fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Department test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Department getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UniRunningExample_viewFactory.eINSTANCE.createDepartment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DepartmentTest
