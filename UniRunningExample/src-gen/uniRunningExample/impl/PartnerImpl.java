/**
 */
package uniRunningExample.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uniRunningExample.Partner;
import uniRunningExample.Type;
import uniRunningExample.UniRunningExamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.impl.PartnerImpl#getPartnerName <em>Partner Name</em>}</li>
 *   <li>{@link uniRunningExample.impl.PartnerImpl#getPartnerType <em>Partner Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartnerImpl extends MinimalEObjectImpl.Container implements Partner {
	/**
	 * The default value of the '{@link #getPartnerName() <em>Partner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerName() <em>Partner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerName()
	 * @generated
	 * @ordered
	 */
	protected String partnerName = PARTNER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartnerType() <em>Partner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerType()
	 * @generated
	 * @ordered
	 */
	protected static final Type PARTNER_TYPE_EDEFAULT = Type.INDUSTRIAL;

	/**
	 * The cached value of the '{@link #getPartnerType() <em>Partner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerType()
	 * @generated
	 * @ordered
	 */
	protected Type partnerType = PARTNER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniRunningExamplePackage.Literals.PARTNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartnerName() {
		return partnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerName(String newPartnerName) {
		String oldPartnerName = partnerName;
		partnerName = newPartnerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.PARTNER__PARTNER_NAME,
					oldPartnerName, partnerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getPartnerType() {
		return partnerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerType(Type newPartnerType) {
		Type oldPartnerType = partnerType;
		partnerType = newPartnerType == null ? PARTNER_TYPE_EDEFAULT : newPartnerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.PARTNER__PARTNER_TYPE,
					oldPartnerType, partnerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniRunningExamplePackage.PARTNER__PARTNER_NAME:
			return getPartnerName();
		case UniRunningExamplePackage.PARTNER__PARTNER_TYPE:
			return getPartnerType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UniRunningExamplePackage.PARTNER__PARTNER_NAME:
			setPartnerName((String) newValue);
			return;
		case UniRunningExamplePackage.PARTNER__PARTNER_TYPE:
			setPartnerType((Type) newValue);
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
		case UniRunningExamplePackage.PARTNER__PARTNER_NAME:
			setPartnerName(PARTNER_NAME_EDEFAULT);
			return;
		case UniRunningExamplePackage.PARTNER__PARTNER_TYPE:
			setPartnerType(PARTNER_TYPE_EDEFAULT);
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
		case UniRunningExamplePackage.PARTNER__PARTNER_NAME:
			return PARTNER_NAME_EDEFAULT == null ? partnerName != null : !PARTNER_NAME_EDEFAULT.equals(partnerName);
		case UniRunningExamplePackage.PARTNER__PARTNER_TYPE:
			return partnerType != PARTNER_TYPE_EDEFAULT;
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
		result.append(" (partnerName: ");
		result.append(partnerName);
		result.append(", partnerType: ");
		result.append(partnerType);
		result.append(')');
		return result.toString();
	}

} //PartnerImpl
