/**
 */
package accessControlMetamodel.impl;

import accessControlMetamodel.AccessControlMetamodelPackage;
import accessControlMetamodel.EReferencePermissions;
import accessControlMetamodel.Permissions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReference Permissions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accessControlMetamodel.impl.EReferencePermissionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.EReferencePermissionsImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.EReferencePermissionsImpl#getEReference <em>EReference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EReferencePermissionsImpl extends MinimalEObjectImpl.Container implements EReferencePermissions {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permissions> permissions;

	/**
	 * The cached value of the '{@link #getEReference() <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference()
	 * @generated
	 * @ordered
	 */
	protected EObject eReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReferencePermissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessControlMetamodelPackage.Literals.EREFERENCE_PERMISSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permissions> getPermissions() {
		if (permissions == null) {
			permissions = new EDataTypeUniqueEList<Permissions>(Permissions.class, this,
					AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEReference() {
		if (eReference != null && eReference.eIsProxy()) {
			InternalEObject oldEReference = (InternalEObject) eReference;
			eReference = eResolveProxy(oldEReference);
			if (eReference != oldEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__EREFERENCE, oldEReference,
							eReference));
			}
		}
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEReference() {
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference(EObject newEReference) {
		EObject oldEReference = eReference;
		eReference = newEReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__EREFERENCE, oldEReference, eReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__NAME:
			return getName();
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__PERMISSIONS:
			return getPermissions();
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__EREFERENCE:
			if (resolve)
				return getEReference();
			return basicGetEReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__NAME:
			setName((String) newValue);
			return;
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__PERMISSIONS:
			getPermissions().clear();
			getPermissions().addAll((Collection<? extends Permissions>) newValue);
			return;
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__EREFERENCE:
			setEReference((EObject) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__PERMISSIONS:
			getPermissions().clear();
			return;
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__EREFERENCE:
			setEReference((EObject) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__PERMISSIONS:
			return permissions != null && !permissions.isEmpty();
		case AccessControlMetamodelPackage.EREFERENCE_PERMISSIONS__EREFERENCE:
			return eReference != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", permissions: ");
		result.append(permissions);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setPermissions(Permissions permission) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEClass(EReference eReference) {
		// TODO Auto-generated method stub

	}

} //EReferencePermissionsImpl
