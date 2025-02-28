/**
 */
package uniRunningExample_view.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uniRunningExample_view.Partner;
import uniRunningExample_view.Type;
import uniRunningExample_view.UniRunningExample_viewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample_view.impl.PartnerImpl#getPartnerName <em>Partner Name</em>}</li>
 *   <li>{@link uniRunningExample_view.impl.PartnerImpl#getPartnerType <em>Partner Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartnerImpl extends EObjectImpl implements Partner {
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
	protected static final Type PARTNER_TYPE_EDEFAULT = Type.INDUSTRIAL_LITERAL;

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
	protected EClass eStaticClass() {
		return UniRunningExample_viewPackage.Literals.PARTNER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExample_viewPackage.PARTNER__PARTNER_NAME, oldPartnerName, partnerName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExample_viewPackage.PARTNER__PARTNER_TYPE, oldPartnerType, partnerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniRunningExample_viewPackage.PARTNER__PARTNER_NAME:
				return getPartnerName();
			case UniRunningExample_viewPackage.PARTNER__PARTNER_TYPE:
				return getPartnerType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniRunningExample_viewPackage.PARTNER__PARTNER_NAME:
				setPartnerName((String)newValue);
				return;
			case UniRunningExample_viewPackage.PARTNER__PARTNER_TYPE:
				setPartnerType((Type)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniRunningExample_viewPackage.PARTNER__PARTNER_NAME:
				setPartnerName(PARTNER_NAME_EDEFAULT);
				return;
			case UniRunningExample_viewPackage.PARTNER__PARTNER_TYPE:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniRunningExample_viewPackage.PARTNER__PARTNER_NAME:
				return PARTNER_NAME_EDEFAULT == null ? partnerName != null : !PARTNER_NAME_EDEFAULT.equals(partnerName);
			case UniRunningExample_viewPackage.PARTNER__PARTNER_TYPE:
				return partnerType != PARTNER_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (partnerName: ");
		result.append(partnerName);
		result.append(", partnerType: ");
		result.append(partnerType);
		result.append(')');
		return result.toString();
	}

} //PartnerImpl
