/**
 */
package accessControlMetamodel.impl;

import accessControlMetamodel.AccessControlMetamodelPackage;
import accessControlMetamodel.EAttributePermissions;
import accessControlMetamodel.EClassPermissions;
import accessControlMetamodel.EReferencePermissions;
import accessControlMetamodel.Permissions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Permissions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accessControlMetamodel.impl.EClassPermissionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.EClassPermissionsImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.EClassPermissionsImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.EClassPermissionsImpl#getEattributepermissions <em>Eattributepermissions</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.EClassPermissionsImpl#getEreferencepermissions <em>Ereferencepermissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EClassPermissionsImpl extends MinimalEObjectImpl.Container implements EClassPermissions {
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
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EObject eClass;

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
	 * The cached value of the '{@link #getEattributepermissions() <em>Eattributepermissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEattributepermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttributePermissions> eattributepermissions;

	/**
	 * The cached value of the '{@link #getEreferencepermissions() <em>Ereferencepermissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEreferencepermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<EReferencePermissions> ereferencepermissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassPermissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessControlMetamodelPackage.Literals.ECLASS_PERMISSIONS;
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
					AccessControlMetamodelPackage.ECLASS_PERMISSIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttributePermissions> getEattributepermissions() {
		if (eattributepermissions == null) {
			eattributepermissions = new EObjectContainmentEList<EAttributePermissions>(EAttributePermissions.class,
					this, AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EATTRIBUTEPERMISSIONS);
		}
		return eattributepermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReferencePermissions> getEreferencepermissions() {
		if (ereferencepermissions == null) {
			ereferencepermissions = new EObjectContainmentEList<EReferencePermissions>(EReferencePermissions.class,
					this, AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EREFERENCEPERMISSIONS);
		}
		return ereferencepermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permissions> getPermissions() {
		if (permissions == null) {
			permissions = new EDataTypeUniqueEList<Permissions>(Permissions.class, this,
					AccessControlMetamodelPackage.ECLASS_PERMISSIONS__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject) eClass;
			eClass = eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AccessControlMetamodelPackage.ECLASS_PERMISSIONS__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EObject newEClass) {
		EObject oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessControlMetamodelPackage.ECLASS_PERMISSIONS__ECLASS, oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EATTRIBUTEPERMISSIONS:
			return ((InternalEList<?>) getEattributepermissions()).basicRemove(otherEnd, msgs);
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EREFERENCEPERMISSIONS:
			return ((InternalEList<?>) getEreferencepermissions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__NAME:
			return getName();
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__ECLASS:
			if (resolve)
				return getEClass();
			return basicGetEClass();
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__PERMISSIONS:
			return getPermissions();
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EATTRIBUTEPERMISSIONS:
			return getEattributepermissions();
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EREFERENCEPERMISSIONS:
			return getEreferencepermissions();
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
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__NAME:
			setName((String) newValue);
			return;
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__ECLASS:
			setEClass((EObject) newValue);
			return;
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__PERMISSIONS:
			getPermissions().clear();
			getPermissions().addAll((Collection<? extends Permissions>) newValue);
			return;
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EATTRIBUTEPERMISSIONS:
			getEattributepermissions().clear();
			getEattributepermissions().addAll((Collection<? extends EAttributePermissions>) newValue);
			return;
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EREFERENCEPERMISSIONS:
			getEreferencepermissions().clear();
			getEreferencepermissions().addAll((Collection<? extends EReferencePermissions>) newValue);
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
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__ECLASS:
			setEClass((EObject) null);
			return;
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__PERMISSIONS:
			getPermissions().clear();
			return;
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EATTRIBUTEPERMISSIONS:
			getEattributepermissions().clear();
			return;
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EREFERENCEPERMISSIONS:
			getEreferencepermissions().clear();
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
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__ECLASS:
			return eClass != null;
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__PERMISSIONS:
			return permissions != null && !permissions.isEmpty();
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EATTRIBUTEPERMISSIONS:
			return eattributepermissions != null && !eattributepermissions.isEmpty();
		case AccessControlMetamodelPackage.ECLASS_PERMISSIONS__EREFERENCEPERMISSIONS:
			return ereferencepermissions != null && !ereferencepermissions.isEmpty();
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

} //EClassPermissionsImpl
