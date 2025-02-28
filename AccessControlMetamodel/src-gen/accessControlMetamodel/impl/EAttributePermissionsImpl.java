/**
 */
package accessControlMetamodel.impl;

import accessControlMetamodel.AccessControlMetamodelPackage;
import accessControlMetamodel.EAttributePermissions;
import accessControlMetamodel.Permissions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAttribute Permissions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accessControlMetamodel.impl.EAttributePermissionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.EAttributePermissionsImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.EAttributePermissionsImpl#getEAttribute <em>EAttribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAttributePermissionsImpl extends MinimalEObjectImpl.Container implements EAttributePermissions {
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
	 * The cached value of the '{@link #getEAttribute() <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EObject eAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAttributePermissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessControlMetamodelPackage.Literals.EATTRIBUTE_PERMISSIONS;
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
					AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permissions> getPermissions() {
		if (permissions == null) {
			permissions = new EDataTypeUniqueEList<Permissions>(Permissions.class, this,
					AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEAttribute() {
		if (eAttribute != null && eAttribute.eIsProxy()) {
			InternalEObject oldEAttribute = (InternalEObject) eAttribute;
			eAttribute = eResolveProxy(oldEAttribute);
			if (eAttribute != oldEAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__EATTRIBUTE, oldEAttribute,
							eAttribute));
			}
		}
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEAttribute() {
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute(EObject newEAttribute) {
		EObject oldEAttribute = eAttribute;
		eAttribute = newEAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__EATTRIBUTE, oldEAttribute, eAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__NAME:
			return getName();
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__PERMISSIONS:
			return getPermissions();
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__EATTRIBUTE:
			if (resolve)
				return getEAttribute();
			return basicGetEAttribute();
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
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__NAME:
			setName((String) newValue);
			return;
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__PERMISSIONS:
			getPermissions().clear();
			getPermissions().addAll((Collection<? extends Permissions>) newValue);
			return;
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__EATTRIBUTE:
			setEAttribute((EObject) newValue);
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
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__PERMISSIONS:
			getPermissions().clear();
			return;
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__EATTRIBUTE:
			setEAttribute((EObject) null);
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
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__PERMISSIONS:
			return permissions != null && !permissions.isEmpty();
		case AccessControlMetamodelPackage.EATTRIBUTE_PERMISSIONS__EATTRIBUTE:
			return eAttribute != null;
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
	public void setEClass(EAttribute eAttribute) {
		// TODO Auto-generated method stub

	}

} //EAttributePermissionsImpl
