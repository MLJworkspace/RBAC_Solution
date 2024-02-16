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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uniRunningExample.Employee;
import uniRunningExample.Partner;
import uniRunningExample.Project;
import uniRunningExample.UniRunningExamplePackage;
import uniRunningExample.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.impl.ProjectImpl#getWorkpackage <em>Workpackage</em>}</li>
 *   <li>{@link uniRunningExample.impl.ProjectImpl#getPartner <em>Partner</em>}</li>
 *   <li>{@link uniRunningExample.impl.ProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link uniRunningExample.impl.ProjectImpl#getFundingAgency <em>Funding Agency</em>}</li>
 *   <li>{@link uniRunningExample.impl.ProjectImpl#getProjectDuration <em>Project Duration</em>}</li>
 *   <li>{@link uniRunningExample.impl.ProjectImpl#getFundingValue <em>Funding Value</em>}</li>
 *   <li>{@link uniRunningExample.impl.ProjectImpl#getProjectEmployee <em>Project Employee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The cached value of the '{@link #getWorkpackage() <em>Workpackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkpackage()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPackage> workpackage;

	/**
	 * The cached value of the '{@link #getPartner() <em>Partner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected EList<Partner> partner;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFundingAgency() <em>Funding Agency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundingAgency()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNDING_AGENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFundingAgency() <em>Funding Agency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundingAgency()
	 * @generated
	 * @ordered
	 */
	protected String fundingAgency = FUNDING_AGENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectDuration() <em>Project Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int PROJECT_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProjectDuration() <em>Project Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectDuration()
	 * @generated
	 * @ordered
	 */
	protected int projectDuration = PROJECT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFundingValue() <em>Funding Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundingValue()
	 * @generated
	 * @ordered
	 */
	protected static final int FUNDING_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFundingValue() <em>Funding Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundingValue()
	 * @generated
	 * @ordered
	 */
	protected int fundingValue = FUNDING_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjectEmployee() <em>Project Employee</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectEmployee()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> projectEmployee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniRunningExamplePackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPackage> getWorkpackage() {
		if (workpackage == null) {
			workpackage = new EObjectContainmentEList<WorkPackage>(WorkPackage.class, this,
					UniRunningExamplePackage.PROJECT__WORKPACKAGE);
		}
		return workpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partner> getPartner() {
		if (partner == null) {
			partner = new EObjectContainmentEList<Partner>(Partner.class, this,
					UniRunningExamplePackage.PROJECT__PARTNER);
		}
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.PROJECT__PROJECT_NAME,
					oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFundingAgency() {
		return fundingAgency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundingAgency(String newFundingAgency) {
		String oldFundingAgency = fundingAgency;
		fundingAgency = newFundingAgency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.PROJECT__FUNDING_AGENCY,
					oldFundingAgency, fundingAgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProjectDuration() {
		return projectDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectDuration(int newProjectDuration) {
		int oldProjectDuration = projectDuration;
		projectDuration = newProjectDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.PROJECT__PROJECT_DURATION,
					oldProjectDuration, projectDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFundingValue() {
		return fundingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundingValue(int newFundingValue) {
		int oldFundingValue = fundingValue;
		fundingValue = newFundingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.PROJECT__FUNDING_VALUE,
					oldFundingValue, fundingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getProjectEmployee() {
		if (projectEmployee == null) {
			projectEmployee = new EObjectResolvingEList<Employee>(Employee.class, this,
					UniRunningExamplePackage.PROJECT__PROJECT_EMPLOYEE);
		}
		return projectEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UniRunningExamplePackage.PROJECT__WORKPACKAGE:
			return ((InternalEList<?>) getWorkpackage()).basicRemove(otherEnd, msgs);
		case UniRunningExamplePackage.PROJECT__PARTNER:
			return ((InternalEList<?>) getPartner()).basicRemove(otherEnd, msgs);
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
		case UniRunningExamplePackage.PROJECT__WORKPACKAGE:
			return getWorkpackage();
		case UniRunningExamplePackage.PROJECT__PARTNER:
			return getPartner();
		case UniRunningExamplePackage.PROJECT__PROJECT_NAME:
			return getProjectName();
		case UniRunningExamplePackage.PROJECT__FUNDING_AGENCY:
			return getFundingAgency();
		case UniRunningExamplePackage.PROJECT__PROJECT_DURATION:
			return getProjectDuration();
		case UniRunningExamplePackage.PROJECT__FUNDING_VALUE:
			return getFundingValue();
		case UniRunningExamplePackage.PROJECT__PROJECT_EMPLOYEE:
			return getProjectEmployee();
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
		case UniRunningExamplePackage.PROJECT__WORKPACKAGE:
			getWorkpackage().clear();
			getWorkpackage().addAll((Collection<? extends WorkPackage>) newValue);
			return;
		case UniRunningExamplePackage.PROJECT__PARTNER:
			getPartner().clear();
			getPartner().addAll((Collection<? extends Partner>) newValue);
			return;
		case UniRunningExamplePackage.PROJECT__PROJECT_NAME:
			setProjectName((String) newValue);
			return;
		case UniRunningExamplePackage.PROJECT__FUNDING_AGENCY:
			setFundingAgency((String) newValue);
			return;
		case UniRunningExamplePackage.PROJECT__PROJECT_DURATION:
			setProjectDuration((Integer) newValue);
			return;
		case UniRunningExamplePackage.PROJECT__FUNDING_VALUE:
			setFundingValue((Integer) newValue);
			return;
		case UniRunningExamplePackage.PROJECT__PROJECT_EMPLOYEE:
			getProjectEmployee().clear();
			getProjectEmployee().addAll((Collection<? extends Employee>) newValue);
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
		case UniRunningExamplePackage.PROJECT__WORKPACKAGE:
			getWorkpackage().clear();
			return;
		case UniRunningExamplePackage.PROJECT__PARTNER:
			getPartner().clear();
			return;
		case UniRunningExamplePackage.PROJECT__PROJECT_NAME:
			setProjectName(PROJECT_NAME_EDEFAULT);
			return;
		case UniRunningExamplePackage.PROJECT__FUNDING_AGENCY:
			setFundingAgency(FUNDING_AGENCY_EDEFAULT);
			return;
		case UniRunningExamplePackage.PROJECT__PROJECT_DURATION:
			setProjectDuration(PROJECT_DURATION_EDEFAULT);
			return;
		case UniRunningExamplePackage.PROJECT__FUNDING_VALUE:
			setFundingValue(FUNDING_VALUE_EDEFAULT);
			return;
		case UniRunningExamplePackage.PROJECT__PROJECT_EMPLOYEE:
			getProjectEmployee().clear();
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
		case UniRunningExamplePackage.PROJECT__WORKPACKAGE:
			return workpackage != null && !workpackage.isEmpty();
		case UniRunningExamplePackage.PROJECT__PARTNER:
			return partner != null && !partner.isEmpty();
		case UniRunningExamplePackage.PROJECT__PROJECT_NAME:
			return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
		case UniRunningExamplePackage.PROJECT__FUNDING_AGENCY:
			return FUNDING_AGENCY_EDEFAULT == null ? fundingAgency != null
					: !FUNDING_AGENCY_EDEFAULT.equals(fundingAgency);
		case UniRunningExamplePackage.PROJECT__PROJECT_DURATION:
			return projectDuration != PROJECT_DURATION_EDEFAULT;
		case UniRunningExamplePackage.PROJECT__FUNDING_VALUE:
			return fundingValue != FUNDING_VALUE_EDEFAULT;
		case UniRunningExamplePackage.PROJECT__PROJECT_EMPLOYEE:
			return projectEmployee != null && !projectEmployee.isEmpty();
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
		result.append(" (projectName: ");
		result.append(projectName);
		result.append(", fundingAgency: ");
		result.append(fundingAgency);
		result.append(", projectDuration: ");
		result.append(projectDuration);
		result.append(", fundingValue: ");
		result.append(fundingValue);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
