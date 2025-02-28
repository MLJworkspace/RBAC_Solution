/**
 */
package uniRunningExample_view.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uniRunningExample_view.Employee;
import uniRunningExample_view.UniRunningExample_viewFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmployeeTest extends TestCase {

	/**
	 * The fixture for this Employee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Employee fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmployeeTest.class);
	}

	/**
	 * Constructs a new Employee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Employee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Employee fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Employee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Employee getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UniRunningExample_viewFactory.eINSTANCE.createEmployee());
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

} //EmployeeTest
