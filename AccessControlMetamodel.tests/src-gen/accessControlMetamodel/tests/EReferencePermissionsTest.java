/**
 */
package accessControlMetamodel.tests;

import accessControlMetamodel.AccessControlMetamodelFactory;
import accessControlMetamodel.EReferencePermissions;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EReference Permissions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EReferencePermissionsTest extends TestCase {

	/**
	 * The fixture for this EReference Permissions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReferencePermissions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EReferencePermissionsTest.class);
	}

	/**
	 * Constructs a new EReference Permissions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReferencePermissionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this EReference Permissions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EReferencePermissions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EReference Permissions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReferencePermissions getFixture() {
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
		setFixture(AccessControlMetamodelFactory.eINSTANCE.createEReferencePermissions());
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

} //EReferencePermissionsTest
