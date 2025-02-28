/**
 */
package accessControlMetamodel.impl;

import accessControlMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessControlMetamodelFactoryImpl extends EFactoryImpl implements AccessControlMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessControlMetamodelFactory init() {
		try {
			AccessControlMetamodelFactory theAccessControlMetamodelFactory = (AccessControlMetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(AccessControlMetamodelPackage.eNS_URI);
			if (theAccessControlMetamodelFactory != null) {
				return theAccessControlMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccessControlMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL:
			return createAccessControlModel();
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS:
			return createEClassPermissions();
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS:
			return createEAttributePermissions();
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS:
			return createEReferencePermissions();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AccessControlMetamodelPackage.PERMISSIONS:
			return createPermissionsFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AccessControlMetamodelPackage.PERMISSIONS:
			return convertPermissionsToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlModel createAccessControlModel() {
		AccessControlModelImpl accessControlModel = new AccessControlModelImpl();
		return accessControlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassPermissions createEClassPermissions() {
		EClassPermissionsImpl eClassPermissions = new EClassPermissionsImpl();
		return eClassPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttributePermissions createEAttributePermissions() {
		EAttributePermissionsImpl eAttributePermissions = new EAttributePermissionsImpl();
		return eAttributePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReferencePermissions createEReferencePermissions() {
		EReferencePermissionsImpl eReferencePermissions = new EReferencePermissionsImpl();
		return eReferencePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permissions createPermissionsFromString(EDataType eDataType, String initialValue) {
		Permissions result = Permissions.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlMetamodelPackage getAccessControlMetamodelPackage() {
		return (AccessControlMetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccessControlMetamodelPackage getPackage() {
		return AccessControlMetamodelPackage.eINSTANCE;
	}

} //AccessControlMetamodelFactoryImpl
