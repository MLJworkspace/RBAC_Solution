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
import uniRunningExample_view.Employee;
import uniRunningExample_view.Project;
import uniRunningExample_view.UniRunningExample_viewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample_view.impl.DepartmentImpl#getProject <em>Project</em>}</li>
 *   <li>{@link uniRunningExample_view.impl.DepartmentImpl#getDepName <em>Dep Name</em>}</li>
 *   <li>{@link uniRunningExample_view.impl.DepartmentImpl#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends EObjectImpl implements Department {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected EList project;

	/**
	 * The default value of the '{@link #getDepName() <em>Dep Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepName() <em>Dep Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepName()
	 * @generated
	 * @ordered
	 */
	protected String depName = DEP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected EList employee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UniRunningExample_viewPackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProject() {
		if (project == null) {
			project = new EObjectContainmentEList(Project.class, this, UniRunningExample_viewPackage.DEPARTMENT__PROJECT);
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepName() {
		return depName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepName(String newDepName) {
		String oldDepName = depName;
		depName = newDepName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExample_viewPackage.DEPARTMENT__DEP_NAME, oldDepName, depName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmployee() {
		if (employee == null) {
			employee = new EObjectContainmentEList(Employee.class, this, UniRunningExample_viewPackage.DEPARTMENT__EMPLOYEE);
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniRunningExample_viewPackage.DEPARTMENT__PROJECT:
				return ((InternalEList)getProject()).basicRemove(otherEnd, msgs);
			case UniRunningExample_viewPackage.DEPARTMENT__EMPLOYEE:
				return ((InternalEList)getEmployee()).basicRemove(otherEnd, msgs);
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
			case UniRunningExample_viewPackage.DEPARTMENT__PROJECT:
				return getProject();
			case UniRunningExample_viewPackage.DEPARTMENT__DEP_NAME:
				return getDepName();
			case UniRunningExample_viewPackage.DEPARTMENT__EMPLOYEE:
				return getEmployee();
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
			case UniRunningExample_viewPackage.DEPARTMENT__PROJECT:
				getProject().clear();
				getProject().addAll((Collection)newValue);
				return;
			case UniRunningExample_viewPackage.DEPARTMENT__DEP_NAME:
				setDepName((String)newValue);
				return;
			case UniRunningExample_viewPackage.DEPARTMENT__EMPLOYEE:
				getEmployee().clear();
				getEmployee().addAll((Collection)newValue);
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
			case UniRunningExample_viewPackage.DEPARTMENT__PROJECT:
				getProject().clear();
				return;
			case UniRunningExample_viewPackage.DEPARTMENT__DEP_NAME:
				setDepName(DEP_NAME_EDEFAULT);
				return;
			case UniRunningExample_viewPackage.DEPARTMENT__EMPLOYEE:
				getEmployee().clear();
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
			case UniRunningExample_viewPackage.DEPARTMENT__PROJECT:
				return project != null && !project.isEmpty();
			case UniRunningExample_viewPackage.DEPARTMENT__DEP_NAME:
				return DEP_NAME_EDEFAULT == null ? depName != null : !DEP_NAME_EDEFAULT.equals(depName);
			case UniRunningExample_viewPackage.DEPARTMENT__EMPLOYEE:
				return employee != null && !employee.isEmpty();
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
		result.append(" (depName: ");
		result.append(depName);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
