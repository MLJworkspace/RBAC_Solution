/**
 */
package accessControlMetamodel;

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
 * @see accessControlMetamodel.AccessControlMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface AccessControlMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accessControlMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/accessControlMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accessControlMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessControlMetamodelPackage eINSTANCE = accessControlMetamodel.impl.AccessControlMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link accessControlMetamodel.impl.AccessControlModelImpl <em>Access Control Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accessControlMetamodel.impl.AccessControlModelImpl
	 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getAccessControlModel()
	 * @generated
	 */
	int ACCESS_CONTROL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Eclasspermissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_MODEL__ECLASSPERMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_MODEL__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Access Control Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Access Control Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accessControlMetamodel.impl.EClassPermissionsImpl <em>EClass Permissions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accessControlMetamodel.impl.EClassPermissionsImpl
	 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getEClassPermissions()
	 * @generated
	 */
	int ECLASS_PERMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_PERMISSIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_PERMISSIONS__ECLASS = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_PERMISSIONS__PERMISSIONS = 2;

	/**
	 * The feature id for the '<em><b>Eattributepermissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_PERMISSIONS__EATTRIBUTEPERMISSIONS = 3;

	/**
	 * The feature id for the '<em><b>Ereferencepermissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_PERMISSIONS__EREFERENCEPERMISSIONS = 4;

	/**
	 * The number of structural features of the '<em>EClass Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_PERMISSIONS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EClass Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_PERMISSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accessControlMetamodel.impl.EAttributePermissionsImpl <em>EAttribute Permissions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accessControlMetamodel.impl.EAttributePermissionsImpl
	 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getEAttributePermissions()
	 * @generated
	 */
	int EATTRIBUTE_PERMISSIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_PERMISSIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_PERMISSIONS__PERMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_PERMISSIONS__EATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>EAttribute Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_PERMISSIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EAttribute Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_PERMISSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accessControlMetamodel.impl.EReferencePermissionsImpl <em>EReference Permissions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accessControlMetamodel.impl.EReferencePermissionsImpl
	 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getEReferencePermissions()
	 * @generated
	 */
	int EREFERENCE_PERMISSIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PERMISSIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PERMISSIONS__PERMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PERMISSIONS__EREFERENCE = 2;

	/**
	 * The number of structural features of the '<em>EReference Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PERMISSIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EReference Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PERMISSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accessControlMetamodel.Permissions <em>Permissions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accessControlMetamodel.Permissions
	 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getPermissions()
	 * @generated
	 */
	int PERMISSIONS = 4;

	/**
	 * Returns the meta object for class '{@link accessControlMetamodel.AccessControlModel <em>Access Control Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control Model</em>'.
	 * @see accessControlMetamodel.AccessControlModel
	 * @generated
	 */
	EClass getAccessControlModel();

	/**
	 * Returns the meta object for the attribute '{@link accessControlMetamodel.AccessControlModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see accessControlMetamodel.AccessControlModel#getName()
	 * @see #getAccessControlModel()
	 * @generated
	 */
	EAttribute getAccessControlModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link accessControlMetamodel.AccessControlModel#getEclasspermissions <em>Eclasspermissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eclasspermissions</em>'.
	 * @see accessControlMetamodel.AccessControlModel#getEclasspermissions()
	 * @see #getAccessControlModel()
	 * @generated
	 */
	EReference getAccessControlModel_Eclasspermissions();

	/**
	 * Returns the meta object for the attribute '{@link accessControlMetamodel.AccessControlModel#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see accessControlMetamodel.AccessControlModel#getRole()
	 * @see #getAccessControlModel()
	 * @generated
	 */
	EAttribute getAccessControlModel_Role();

	/**
	 * Returns the meta object for class '{@link accessControlMetamodel.EClassPermissions <em>EClass Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Permissions</em>'.
	 * @see accessControlMetamodel.EClassPermissions
	 * @generated
	 */
	EClass getEClassPermissions();

	/**
	 * Returns the meta object for the attribute '{@link accessControlMetamodel.EClassPermissions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see accessControlMetamodel.EClassPermissions#getName()
	 * @see #getEClassPermissions()
	 * @generated
	 */
	EAttribute getEClassPermissions_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link accessControlMetamodel.EClassPermissions#getEattributepermissions <em>Eattributepermissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eattributepermissions</em>'.
	 * @see accessControlMetamodel.EClassPermissions#getEattributepermissions()
	 * @see #getEClassPermissions()
	 * @generated
	 */
	EReference getEClassPermissions_Eattributepermissions();

	/**
	 * Returns the meta object for the containment reference list '{@link accessControlMetamodel.EClassPermissions#getEreferencepermissions <em>Ereferencepermissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ereferencepermissions</em>'.
	 * @see accessControlMetamodel.EClassPermissions#getEreferencepermissions()
	 * @see #getEClassPermissions()
	 * @generated
	 */
	EReference getEClassPermissions_Ereferencepermissions();

	/**
	 * Returns the meta object for the attribute list '{@link accessControlMetamodel.EClassPermissions#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permissions</em>'.
	 * @see accessControlMetamodel.EClassPermissions#getPermissions()
	 * @see #getEClassPermissions()
	 * @generated
	 */
	EAttribute getEClassPermissions_Permissions();

	/**
	 * Returns the meta object for the reference '{@link accessControlMetamodel.EClassPermissions#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see accessControlMetamodel.EClassPermissions#getEClass()
	 * @see #getEClassPermissions()
	 * @generated
	 */
	EReference getEClassPermissions_EClass();

	/**
	 * Returns the meta object for class '{@link accessControlMetamodel.EAttributePermissions <em>EAttribute Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute Permissions</em>'.
	 * @see accessControlMetamodel.EAttributePermissions
	 * @generated
	 */
	EClass getEAttributePermissions();

	/**
	 * Returns the meta object for the attribute '{@link accessControlMetamodel.EAttributePermissions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see accessControlMetamodel.EAttributePermissions#getName()
	 * @see #getEAttributePermissions()
	 * @generated
	 */
	EAttribute getEAttributePermissions_Name();

	/**
	 * Returns the meta object for the attribute list '{@link accessControlMetamodel.EAttributePermissions#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permissions</em>'.
	 * @see accessControlMetamodel.EAttributePermissions#getPermissions()
	 * @see #getEAttributePermissions()
	 * @generated
	 */
	EAttribute getEAttributePermissions_Permissions();

	/**
	 * Returns the meta object for the reference '{@link accessControlMetamodel.EAttributePermissions#getEAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute</em>'.
	 * @see accessControlMetamodel.EAttributePermissions#getEAttribute()
	 * @see #getEAttributePermissions()
	 * @generated
	 */
	EReference getEAttributePermissions_EAttribute();

	/**
	 * Returns the meta object for class '{@link accessControlMetamodel.EReferencePermissions <em>EReference Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference Permissions</em>'.
	 * @see accessControlMetamodel.EReferencePermissions
	 * @generated
	 */
	EClass getEReferencePermissions();

	/**
	 * Returns the meta object for the attribute '{@link accessControlMetamodel.EReferencePermissions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see accessControlMetamodel.EReferencePermissions#getName()
	 * @see #getEReferencePermissions()
	 * @generated
	 */
	EAttribute getEReferencePermissions_Name();

	/**
	 * Returns the meta object for the attribute list '{@link accessControlMetamodel.EReferencePermissions#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permissions</em>'.
	 * @see accessControlMetamodel.EReferencePermissions#getPermissions()
	 * @see #getEReferencePermissions()
	 * @generated
	 */
	EAttribute getEReferencePermissions_Permissions();

	/**
	 * Returns the meta object for the reference '{@link accessControlMetamodel.EReferencePermissions#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see accessControlMetamodel.EReferencePermissions#getEReference()
	 * @see #getEReferencePermissions()
	 * @generated
	 */
	EReference getEReferencePermissions_EReference();

	/**
	 * Returns the meta object for enum '{@link accessControlMetamodel.Permissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permissions</em>'.
	 * @see accessControlMetamodel.Permissions
	 * @generated
	 */
	EEnum getPermissions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccessControlMetamodelFactory getAccessControlMetamodelFactory();

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
		 * The meta object literal for the '{@link accessControlMetamodel.impl.AccessControlModelImpl <em>Access Control Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accessControlMetamodel.impl.AccessControlModelImpl
		 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getAccessControlModel()
		 * @generated
		 */
		EClass ACCESS_CONTROL_MODEL = eINSTANCE.getAccessControlModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_MODEL__NAME = eINSTANCE.getAccessControlModel_Name();

		/**
		 * The meta object literal for the '<em><b>Eclasspermissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_MODEL__ECLASSPERMISSIONS = eINSTANCE.getAccessControlModel_Eclasspermissions();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_MODEL__ROLE = eINSTANCE.getAccessControlModel_Role();

		/**
		 * The meta object literal for the '{@link accessControlMetamodel.impl.EClassPermissionsImpl <em>EClass Permissions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accessControlMetamodel.impl.EClassPermissionsImpl
		 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getEClassPermissions()
		 * @generated
		 */
		EClass ECLASS_PERMISSIONS = eINSTANCE.getEClassPermissions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_PERMISSIONS__NAME = eINSTANCE.getEClassPermissions_Name();

		/**
		 * The meta object literal for the '<em><b>Eattributepermissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_PERMISSIONS__EATTRIBUTEPERMISSIONS = eINSTANCE.getEClassPermissions_Eattributepermissions();

		/**
		 * The meta object literal for the '<em><b>Ereferencepermissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_PERMISSIONS__EREFERENCEPERMISSIONS = eINSTANCE.getEClassPermissions_Ereferencepermissions();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_PERMISSIONS__PERMISSIONS = eINSTANCE.getEClassPermissions_Permissions();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_PERMISSIONS__ECLASS = eINSTANCE.getEClassPermissions_EClass();

		/**
		 * The meta object literal for the '{@link accessControlMetamodel.impl.EAttributePermissionsImpl <em>EAttribute Permissions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accessControlMetamodel.impl.EAttributePermissionsImpl
		 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getEAttributePermissions()
		 * @generated
		 */
		EClass EATTRIBUTE_PERMISSIONS = eINSTANCE.getEAttributePermissions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE_PERMISSIONS__NAME = eINSTANCE.getEAttributePermissions_Name();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE_PERMISSIONS__PERMISSIONS = eINSTANCE.getEAttributePermissions_Permissions();

		/**
		 * The meta object literal for the '<em><b>EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE_PERMISSIONS__EATTRIBUTE = eINSTANCE.getEAttributePermissions_EAttribute();

		/**
		 * The meta object literal for the '{@link accessControlMetamodel.impl.EReferencePermissionsImpl <em>EReference Permissions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accessControlMetamodel.impl.EReferencePermissionsImpl
		 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getEReferencePermissions()
		 * @generated
		 */
		EClass EREFERENCE_PERMISSIONS = eINSTANCE.getEReferencePermissions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE_PERMISSIONS__NAME = eINSTANCE.getEReferencePermissions_Name();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE_PERMISSIONS__PERMISSIONS = eINSTANCE.getEReferencePermissions_Permissions();

		/**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE_PERMISSIONS__EREFERENCE = eINSTANCE.getEReferencePermissions_EReference();

		/**
		 * The meta object literal for the '{@link accessControlMetamodel.Permissions <em>Permissions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accessControlMetamodel.Permissions
		 * @see accessControlMetamodel.impl.AccessControlMetamodelPackageImpl#getPermissions()
		 * @generated
		 */
		EEnum PERMISSIONS = eINSTANCE.getPermissions();

	}

} //AccessControlMetamodelPackage
