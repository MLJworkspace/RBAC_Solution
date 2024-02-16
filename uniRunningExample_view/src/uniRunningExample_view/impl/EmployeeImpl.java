/**
 */
package uniRunningExample_view.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uniRunningExample_view.Employee;
import uniRunningExample_view.UniRunningExample_viewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample_view.impl.EmployeeImpl#getEmpName <em>Emp Name</em>}</li>
 *   <li>{@link uniRunningExample_view.impl.EmployeeImpl#getEmpSurname <em>Emp Surname</em>}</li>
 *   <li>{@link uniRunningExample_view.impl.EmployeeImpl#getEmpExpertise <em>Emp Expertise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
	/**
	 * The default value of the '{@link #getEmpName() <em>Emp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpName()
	 * @generated
	 * @ordered
	 */
	protected static final String EMP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmpName() <em>Emp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpName()
	 * @generated
	 * @ordered
	 */
	protected String empName = EMP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmpSurname() <em>Emp Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String EMP_SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmpSurname() <em>Emp Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpSurname()
	 * @generated
	 * @ordered
	 */
	protected String empSurname = EMP_SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmpExpertise() <em>Emp Expertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpExpertise()
	 * @generated
	 * @ordered
	 */
	protected static final String EMP_EXPERTISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmpExpertise() <em>Emp Expertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpExpertise()
	 * @generated
	 * @ordered
	 */
	protected String empExpertise = EMP_EXPERTISE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UniRunningExample_viewPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpName(String newEmpName) {
		String oldEmpName = empName;
		empName = newEmpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExample_viewPackage.EMPLOYEE__EMP_NAME, oldEmpName, empName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmpSurname() {
		return empSurname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpSurname(String newEmpSurname) {
		String oldEmpSurname = empSurname;
		empSurname = newEmpSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExample_viewPackage.EMPLOYEE__EMP_SURNAME, oldEmpSurname, empSurname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmpExpertise() {
		return empExpertise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpExpertise(String newEmpExpertise) {
		String oldEmpExpertise = empExpertise;
		empExpertise = newEmpExpertise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExample_viewPackage.EMPLOYEE__EMP_EXPERTISE, oldEmpExpertise, empExpertise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_NAME:
				return getEmpName();
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_SURNAME:
				return getEmpSurname();
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_EXPERTISE:
				return getEmpExpertise();
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
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_NAME:
				setEmpName((String)newValue);
				return;
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_SURNAME:
				setEmpSurname((String)newValue);
				return;
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_EXPERTISE:
				setEmpExpertise((String)newValue);
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
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_NAME:
				setEmpName(EMP_NAME_EDEFAULT);
				return;
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_SURNAME:
				setEmpSurname(EMP_SURNAME_EDEFAULT);
				return;
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_EXPERTISE:
				setEmpExpertise(EMP_EXPERTISE_EDEFAULT);
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
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_NAME:
				return EMP_NAME_EDEFAULT == null ? empName != null : !EMP_NAME_EDEFAULT.equals(empName);
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_SURNAME:
				return EMP_SURNAME_EDEFAULT == null ? empSurname != null : !EMP_SURNAME_EDEFAULT.equals(empSurname);
			case UniRunningExample_viewPackage.EMPLOYEE__EMP_EXPERTISE:
				return EMP_EXPERTISE_EDEFAULT == null ? empExpertise != null : !EMP_EXPERTISE_EDEFAULT.equals(empExpertise);
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
		result.append(" (empName: ");
		result.append(empName);
		result.append(", empSurname: ");
		result.append(empSurname);
		result.append(", empExpertise: ");
		result.append(empExpertise);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
