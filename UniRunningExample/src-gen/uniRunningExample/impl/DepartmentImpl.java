/**
 */
package uniRunningExample.impl;

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

import uniRunningExample.Department;
import uniRunningExample.Employee;
import uniRunningExample.Program;
import uniRunningExample.Project;
import uniRunningExample.UniRunningExamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.impl.DepartmentImpl#getProject <em>Project</em>}</li>
 *   <li>{@link uniRunningExample.impl.DepartmentImpl#getDepName <em>Dep Name</em>}</li>
 *   <li>{@link uniRunningExample.impl.DepartmentImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link uniRunningExample.impl.DepartmentImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> project;

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
	protected EList<Employee> employee;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> program;

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
	@Override
	protected EClass eStaticClass() {
		return UniRunningExamplePackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProject() {
		if (project == null) {
			project = new EObjectContainmentEList<Project>(Project.class, this,
					UniRunningExamplePackage.DEPARTMENT__PROJECT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.DEPARTMENT__DEP_NAME,
					oldDepName, depName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployee() {
		if (employee == null) {
			employee = new EObjectContainmentEList<Employee>(Employee.class, this,
					UniRunningExamplePackage.DEPARTMENT__EMPLOYEE);
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getProgram() {
		if (program == null) {
			program = new EObjectContainmentEList<Program>(Program.class, this,
					UniRunningExamplePackage.DEPARTMENT__PROGRAM);
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UniRunningExamplePackage.DEPARTMENT__PROJECT:
			return ((InternalEList<?>) getProject()).basicRemove(otherEnd, msgs);
		case UniRunningExamplePackage.DEPARTMENT__EMPLOYEE:
			return ((InternalEList<?>) getEmployee()).basicRemove(otherEnd, msgs);
		case UniRunningExamplePackage.DEPARTMENT__PROGRAM:
			return ((InternalEList<?>) getProgram()).basicRemove(otherEnd, msgs);
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
		case UniRunningExamplePackage.DEPARTMENT__PROJECT:
			return getProject();
		case UniRunningExamplePackage.DEPARTMENT__DEP_NAME:
			return getDepName();
		case UniRunningExamplePackage.DEPARTMENT__EMPLOYEE:
			return getEmployee();
		case UniRunningExamplePackage.DEPARTMENT__PROGRAM:
			return getProgram();
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
		case UniRunningExamplePackage.DEPARTMENT__PROJECT:
			getProject().clear();
			getProject().addAll((Collection<? extends Project>) newValue);
			return;
		case UniRunningExamplePackage.DEPARTMENT__DEP_NAME:
			setDepName((String) newValue);
			return;
		case UniRunningExamplePackage.DEPARTMENT__EMPLOYEE:
			getEmployee().clear();
			getEmployee().addAll((Collection<? extends Employee>) newValue);
			return;
		case UniRunningExamplePackage.DEPARTMENT__PROGRAM:
			getProgram().clear();
			getProgram().addAll((Collection<? extends Program>) newValue);
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
		case UniRunningExamplePackage.DEPARTMENT__PROJECT:
			getProject().clear();
			return;
		case UniRunningExamplePackage.DEPARTMENT__DEP_NAME:
			setDepName(DEP_NAME_EDEFAULT);
			return;
		case UniRunningExamplePackage.DEPARTMENT__EMPLOYEE:
			getEmployee().clear();
			return;
		case UniRunningExamplePackage.DEPARTMENT__PROGRAM:
			getProgram().clear();
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
		case UniRunningExamplePackage.DEPARTMENT__PROJECT:
			return project != null && !project.isEmpty();
		case UniRunningExamplePackage.DEPARTMENT__DEP_NAME:
			return DEP_NAME_EDEFAULT == null ? depName != null : !DEP_NAME_EDEFAULT.equals(depName);
		case UniRunningExamplePackage.DEPARTMENT__EMPLOYEE:
			return employee != null && !employee.isEmpty();
		case UniRunningExamplePackage.DEPARTMENT__PROGRAM:
			return program != null && !program.isEmpty();
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
		result.append(" (depName: ");
		result.append(depName);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
