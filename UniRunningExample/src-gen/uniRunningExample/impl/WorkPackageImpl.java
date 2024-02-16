/**
 */
package uniRunningExample.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uniRunningExample.Employee;
import uniRunningExample.Partner;
import uniRunningExample.UniRunningExamplePackage;
import uniRunningExample.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.impl.WorkPackageImpl#getWpName <em>Wp Name</em>}</li>
 *   <li>{@link uniRunningExample.impl.WorkPackageImpl#getWpEmployee <em>Wp Employee</em>}</li>
 *   <li>{@link uniRunningExample.impl.WorkPackageImpl#getWpPartner <em>Wp Partner</em>}</li>
 *   <li>{@link uniRunningExample.impl.WorkPackageImpl#getWpDescription <em>Wp Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkPackageImpl extends MinimalEObjectImpl.Container implements WorkPackage {
	/**
	 * The default value of the '{@link #getWpName() <em>Wp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpName()
	 * @generated
	 * @ordered
	 */
	protected static final String WP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpName() <em>Wp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpName()
	 * @generated
	 * @ordered
	 */
	protected String wpName = WP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWpEmployee() <em>Wp Employee</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpEmployee()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> wpEmployee;

	/**
	 * The cached value of the '{@link #getWpPartner() <em>Wp Partner</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpPartner()
	 * @generated
	 * @ordered
	 */
	protected EList<Partner> wpPartner;

	/**
	 * The default value of the '{@link #getWpDescription() <em>Wp Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String WP_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpDescription() <em>Wp Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpDescription()
	 * @generated
	 * @ordered
	 */
	protected String wpDescription = WP_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniRunningExamplePackage.Literals.WORK_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWpName() {
		return wpName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWpName(String newWpName) {
		String oldWpName = wpName;
		wpName = newWpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.WORK_PACKAGE__WP_NAME,
					oldWpName, wpName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getWpEmployee() {
		if (wpEmployee == null) {
			wpEmployee = new EObjectResolvingEList<Employee>(Employee.class, this,
					UniRunningExamplePackage.WORK_PACKAGE__WP_EMPLOYEE);
		}
		return wpEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partner> getWpPartner() {
		if (wpPartner == null) {
			wpPartner = new EObjectResolvingEList<Partner>(Partner.class, this,
					UniRunningExamplePackage.WORK_PACKAGE__WP_PARTNER);
		}
		return wpPartner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWpDescription() {
		return wpDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWpDescription(String newWpDescription) {
		String oldWpDescription = wpDescription;
		wpDescription = newWpDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.WORK_PACKAGE__WP_DESCRIPTION,
					oldWpDescription, wpDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniRunningExamplePackage.WORK_PACKAGE__WP_NAME:
			return getWpName();
		case UniRunningExamplePackage.WORK_PACKAGE__WP_EMPLOYEE:
			return getWpEmployee();
		case UniRunningExamplePackage.WORK_PACKAGE__WP_PARTNER:
			return getWpPartner();
		case UniRunningExamplePackage.WORK_PACKAGE__WP_DESCRIPTION:
			return getWpDescription();
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
		case UniRunningExamplePackage.WORK_PACKAGE__WP_NAME:
			setWpName((String) newValue);
			return;
		case UniRunningExamplePackage.WORK_PACKAGE__WP_EMPLOYEE:
			getWpEmployee().clear();
			getWpEmployee().addAll((Collection<? extends Employee>) newValue);
			return;
		case UniRunningExamplePackage.WORK_PACKAGE__WP_PARTNER:
			getWpPartner().clear();
			getWpPartner().addAll((Collection<? extends Partner>) newValue);
			return;
		case UniRunningExamplePackage.WORK_PACKAGE__WP_DESCRIPTION:
			setWpDescription((String) newValue);
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
		case UniRunningExamplePackage.WORK_PACKAGE__WP_NAME:
			setWpName(WP_NAME_EDEFAULT);
			return;
		case UniRunningExamplePackage.WORK_PACKAGE__WP_EMPLOYEE:
			getWpEmployee().clear();
			return;
		case UniRunningExamplePackage.WORK_PACKAGE__WP_PARTNER:
			getWpPartner().clear();
			return;
		case UniRunningExamplePackage.WORK_PACKAGE__WP_DESCRIPTION:
			setWpDescription(WP_DESCRIPTION_EDEFAULT);
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
		case UniRunningExamplePackage.WORK_PACKAGE__WP_NAME:
			return WP_NAME_EDEFAULT == null ? wpName != null : !WP_NAME_EDEFAULT.equals(wpName);
		case UniRunningExamplePackage.WORK_PACKAGE__WP_EMPLOYEE:
			return wpEmployee != null && !wpEmployee.isEmpty();
		case UniRunningExamplePackage.WORK_PACKAGE__WP_PARTNER:
			return wpPartner != null && !wpPartner.isEmpty();
		case UniRunningExamplePackage.WORK_PACKAGE__WP_DESCRIPTION:
			return WP_DESCRIPTION_EDEFAULT == null ? wpDescription != null
					: !WP_DESCRIPTION_EDEFAULT.equals(wpDescription);
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
		result.append(" (wpName: ");
		result.append(wpName);
		result.append(", wpDescription: ");
		result.append(wpDescription);
		result.append(')');
		return result.toString();
	}

} //WorkPackageImpl
