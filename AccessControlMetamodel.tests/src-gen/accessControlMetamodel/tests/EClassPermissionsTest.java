/**
 */
package accessControlMetamodel.tests;

import accessControlMetamodel.AccessControlMetamodelFactory;
import accessControlMetamodel.EClassPermissions;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EClass Permissions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EClassPermissionsTest extends TestCase {

	/**
	 * The fixture for this EClass Permissions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassPermissions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EClassPermissionsTest.class);
	}

	/**
	 * Constructs a new EClass Permissions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassPermissionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this EClass Permissions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EClassPermissions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EClass Permissions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassPermissions getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AccessControlMetamodelFactory.eINSTANCE.createEClassPermissions());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EClassPermissionsTest
