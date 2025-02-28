/**
 */
package accessControlMetamodel.impl;

import accessControlMetamodel.AccessControlMetamodelFactory;
import accessControlMetamodel.AccessControlMetamodelPackage;
import accessControlMetamodel.AccessControlModel;
import accessControlMetamodel.EAttributePermissions;
import accessControlMetamodel.EClassPermissions;
import accessControlMetamodel.EReferencePermissions;
import accessControlMetamodel.Permissions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessControlMetamodelPackageImpl extends EPackageImpl implements AccessControlMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassPermissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributePermissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferencePermissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see accessControlMetamodel.AccessControlMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccessControlMetamodelPackageImpl() {
		super(eNS_URI, AccessControlMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AccessControlMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccessControlMetamodelPackage init() {
		if (isInited)
			return (AccessControlMetamodelPackage) EPackage.Registry.INSTANCE
					.getEPackage(AccessControlMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccessControlMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccessControlMetamodelPackageImpl theAccessControlMetamodelPackage = registeredAccessControlMetamodelPackage instanceof AccessControlMetamodelPackageImpl
				? (AccessControlMetamodelPackageImpl) registeredAccessControlMetamodelPackage
				: new AccessControlMetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAccessControlMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theAccessControlMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccessControlMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccessControlMetamodelPackage.eNS_URI, theAccessControlMetamodelPackage);
		return theAccessControlMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessControlModel() {
		return accessControlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessControlModel_Name() {
		return (EAttribute) accessControlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControlModel_Eclasspermissions() {
		return (EReference) accessControlModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessControlModel_Role() {
		return (EAttribute) accessControlModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassPermissions() {
		return eClassPermissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassPermissions_Name() {
		return (EAttribute) eClassPermissionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassPermissions_Eattributepermissions() {
		return (EReference) eClassPermissionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassPermissions_Ereferencepermissions() {
		return (EReference) eClassPermissionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassPermissions_Permissions() {
		return (EAttribute) eClassPermissionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassPermissions_EClass() {
		return (EReference) eClassPermissionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAttributePermissions() {
		return eAttributePermissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttributePermissions_Name() {
		return (EAttribute) eAttributePermissionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttributePermissions_Permissions() {
		return (EAttribute) eAttributePermissionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttributePermissions_EAttribute() {
		return (EReference) eAttributePermissionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReferencePermissions() {
		return eReferencePermissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReferencePermissions_Name() {
		return (EAttribute) eReferencePermissionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReferencePermissions_Permissions() {
		return (EAttribute) eReferencePermissionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReferencePermissions_EReference() {
		return (EReference) eReferencePermissionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPermissions() {
		return permissionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlMetamodelFactory getAccessControlMetamodelFactory() {
		return (AccessControlMetamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		accessControlModelEClass = createEClass(ACCESS_CONTROL_MODEL);
		createEAttribute(accessControlModelEClass, ACCESS_CONTROL_MODEL__NAME);
		createEReference(accessControlModelEClass, ACCESS_CONTROL_MODEL__ECLASSPERMISSIONS);
		createEAttribute(accessControlModelEClass, ACCESS_CONTROL_MODEL__ROLE);

		eClassPermissionsEClass = createEClass(ECLASS_PERMISSIONS);
		createEAttribute(eClassPermissionsEClass, ECLASS_PERMISSIONS__NAME);
		createEReference(eClassPermissionsEClass, ECLASS_PERMISSIONS__ECLASS);
		createEAttribute(eClassPermissionsEClass, ECLASS_PERMISSIONS__PERMISSIONS);
		createEReference(eClassPermissionsEClass, ECLASS_PERMISSIONS__EATTRIBUTEPERMISSIONS);
		createEReference(eClassPermissionsEClass, ECLASS_PERMISSIONS__EREFERENCEPERMISSIONS);

		eAttributePermissionsEClass = createEClass(EATTRIBUTE_PERMISSIONS);
		createEAttribute(eAttributePermissionsEClass, EATTRIBUTE_PERMISSIONS__NAME);
		createEAttribute(eAttributePermissionsEClass, EATTRIBUTE_PERMISSIONS__PERMISSIONS);
		createEReference(eAttributePermissionsEClass, EATTRIBUTE_PERMISSIONS__EATTRIBUTE);

		eReferencePermissionsEClass = createEClass(EREFERENCE_PERMISSIONS);
		createEAttribute(eReferencePermissionsEClass, EREFERENCE_PERMISSIONS__NAME);
		createEAttribute(eReferencePermissionsEClass, EREFERENCE_PERMISSIONS__PERMISSIONS);
		createEReference(eReferencePermissionsEClass, EREFERENCE_PERMISSIONS__EREFERENCE);

		// Create enums
		permissionsEEnum = createEEnum(PERMISSIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(accessControlModelEClass, AccessControlModel.class, "AccessControlModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessControlModel_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				AccessControlModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlModel_Eclasspermissions(), this.getEClassPermissions(), null,
				"eclasspermissions", null, 0, -1, AccessControlModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControlModel_Role(), ecorePackage.getEString(), "role", null, 0, 1,
				AccessControlModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eClassPermissionsEClass, EClassPermissions.class, "EClassPermissions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClassPermissions_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				EClassPermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEClassPermissions_EClass(), ecorePackage.getEObject(), null, "eClass", null, 0, 1,
				EClassPermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassPermissions_Permissions(), this.getPermissions(), "permissions", null, 0, -1,
				EClassPermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEClassPermissions_Eattributepermissions(), this.getEAttributePermissions(), null,
				"eattributepermissions", null, 0, -1, EClassPermissions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassPermissions_Ereferencepermissions(), this.getEReferencePermissions(), null,
				"ereferencepermissions", null, 0, -1, EClassPermissions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAttributePermissionsEClass, EAttributePermissions.class, "EAttributePermissions", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAttributePermissions_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				EAttributePermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAttributePermissions_Permissions(), this.getPermissions(), "permissions", null, 0, -1,
				EAttributePermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttributePermissions_EAttribute(), ecorePackage.getEObject(), null, "eAttribute", null, 0, 1,
				EAttributePermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferencePermissionsEClass, EReferencePermissions.class, "EReferencePermissions", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEReferencePermissions_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				EReferencePermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReferencePermissions_Permissions(), this.getPermissions(), "permissions", null, 0, -1,
				EReferencePermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEReferencePermissions_EReference(), ecorePackage.getEObject(), null, "eReference", null, 0, 1,
				EReferencePermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(permissionsEEnum, Permissions.class, "Permissions");
		addEEnumLiteral(permissionsEEnum, Permissions.CREATE);
		addEEnumLiteral(permissionsEEnum, Permissions.READ);
		addEEnumLiteral(permissionsEEnum, Permissions.UPDATE);
		addEEnumLiteral(permissionsEEnum, Permissions.DELETE);

		// Create resource
		createResource(eNS_URI);
	}

} //AccessControlMetamodelPackageImpl
