/**
 */
package uniRunningExample_view.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uniRunningExample_view.Partner;
import uniRunningExample_view.UniRunningExample_viewFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Partner</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartnerTest extends TestCase {

	/**
	 * The fixture for this Partner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Partner fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PartnerTest.class);
	}

	/**
	 * Constructs a new Partner test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Partner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Partner fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Partner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Partner getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UniRunningExample_viewFactory.eINSTANCE.createPartner());
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

} //PartnerTest
