/**
 */
package accessControlMetamodel.impl;

import accessControlMetamodel.AccessControlMetamodelPackage;
import accessControlMetamodel.AccessControlModel;
import accessControlMetamodel.EClassPermissions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Control Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accessControlMetamodel.impl.AccessControlModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.AccessControlModelImpl#getEclasspermissions <em>Eclasspermissions</em>}</li>
 *   <li>{@link accessControlMetamodel.impl.AccessControlModelImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessControlModelImpl extends MinimalEObjectImpl.Container implements AccessControlModel {
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
	 * The cached value of the '{@link #getEclasspermissions() <em>Eclasspermissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclasspermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassPermissions> eclasspermissions;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessControlMetamodelPackage.Literals.ACCESS_CONTROL_MODEL;
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
					AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClassPermissions> getEclasspermissions() {
		if (eclasspermissions == null) {
			eclasspermissions = new EObjectContainmentEList<EClassPermissions>(EClassPermissions.class, this,
					AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ECLASSPERMISSIONS);
		}
		return eclasspermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ECLASSPERMISSIONS:
			return ((InternalEList<?>) getEclasspermissions()).basicRemove(otherEnd, msgs);
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
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__NAME:
			return getName();
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ECLASSPERMISSIONS:
			return getEclasspermissions();
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ROLE:
			return getRole();
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
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__NAME:
			setName((String) newValue);
			return;
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ECLASSPERMISSIONS:
			getEclasspermissions().clear();
			getEclasspermissions().addAll((Collection<? extends EClassPermissions>) newValue);
			return;
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ROLE:
			setRole((String) newValue);
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
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ECLASSPERMISSIONS:
			getEclasspermissions().clear();
			return;
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ROLE:
			setRole(ROLE_EDEFAULT);
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
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ECLASSPERMISSIONS:
			return eclasspermissions != null && !eclasspermissions.isEmpty();
		case AccessControlMetamodelPackage.ACCESS_CONTROL_MODEL__ROLE:
			return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
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
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //AccessControlModelImpl
