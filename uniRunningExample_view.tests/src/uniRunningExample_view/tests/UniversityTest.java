/**
 */
package uniRunningExample_view.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uniRunningExample_view.UniRunningExample_viewFactory;
import uniRunningExample_view.University;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversityTest extends TestCase {

	/**
	 * The fixture for this University test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected University fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniversityTest.class);
	}

	/**
	 * Constructs a new University test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this University test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(University fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this University test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private University getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UniRunningExample_viewFactory.eINSTANCE.createUniversity());
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

} //UniversityTest
