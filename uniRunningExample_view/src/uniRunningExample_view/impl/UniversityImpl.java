/**
 */
package uniRunningExample_view.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uniRunningExample_view.Department;
import uniRunningExample_view.UniRunningExample_viewPackage;
import uniRunningExample_view.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample_view.impl.UniversityImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link uniRunningExample_view.impl.UniversityImpl#getUniName <em>Uni Name</em>}</li>
 *   <li>{@link uniRunningExample_view.impl.UniversityImpl#getUniAddress <em>Uni Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends EObjectImpl implements University {
	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected EList department;

	/**
	 * The default value of the '{@link #getUniName() <em>Uni Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniName() <em>Uni Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniName()
	 * @generated
	 * @ordered
	 */
	protected String uniName = UNI_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniAddress() <em>Uni Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String UNI_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniAddress() <em>Uni Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniAddress()
	 * @generated
	 * @ordered
	 */
	protected String uniAddress = UNI_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UniRunningExample_viewPackage.Literals.UNIVERSITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDepartment() {
		if (department == null) {
			department = new EObjectContainmentEList(Department.class, this, UniRunningExample_viewPackage.UNIVERSITY__DEPARTMENT);
		}
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniName() {
		return uniName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniName(String newUniName) {
		String oldUniName = uniName;
		uniName = newUniName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExample_viewPackage.UNIVERSITY__UNI_NAME, oldUniName, uniName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniAddress() {
		return uniAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniAddress(String newUniAddress) {
		String oldUniAddress = uniAddress;
		uniAddress = newUniAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExample_viewPackage.UNIVERSITY__UNI_ADDRESS, oldUniAddress, uniAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniRunningExample_viewPackage.UNIVERSITY__DEPARTMENT:
				return ((InternalEList)getDepartment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniRunningExample_viewPackage.UNIVERSITY__DEPARTMENT:
				return getDepartment();
			case UniRunningExample_viewPackage.UNIVERSITY__UNI_NAME:
				return getUniName();
			case UniRunningExample_viewPackage.UNIVERSITY__UNI_ADDRESS:
				return getUniAddress();
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
			case UniRunningExample_viewPackage.UNIVERSITY__DEPARTMENT:
				getDepartment().clear();
				getDepartment().addAll((Collection)newValue);
				return;
			case UniRunningExample_viewPackage.UNIVERSITY__UNI_NAME:
				setUniName((String)newValue);
				return;
			case UniRunningExample_viewPackage.UNIVERSITY__UNI_ADDRESS:
				setUniAddress((String)newValue);
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
			case UniRunningExample_viewPackage.UNIVERSITY__DEPARTMENT:
				getDepartment().clear();
				return;
			case UniRunningExample_viewPackage.UNIVERSITY__UNI_NAME:
				setUniName(UNI_NAME_EDEFAULT);
				return;
			case UniRunningExample_viewPackage.UNIVERSITY__UNI_ADDRESS:
				setUniAddress(UNI_ADDRESS_EDEFAULT);
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
			case UniRunningExample_viewPackage.UNIVERSITY__DEPARTMENT:
				return department != null && !department.isEmpty();
			case UniRunningExample_viewPackage.UNIVERSITY__UNI_NAME:
				return UNI_NAME_EDEFAULT == null ? uniName != null : !UNI_NAME_EDEFAULT.equals(uniName);
			case UniRunningExample_viewPackage.UNIVERSITY__UNI_ADDRESS:
				return UNI_ADDRESS_EDEFAULT == null ? uniAddress != null : !UNI_ADDRESS_EDEFAULT.equals(uniAddress);
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
		result.append(" (uniName: ");
		result.append(uniName);
		result.append(", uniAddress: ");
		result.append(uniAddress);
		result.append(')');
		return result.toString();
	}

} //UniversityImpl
