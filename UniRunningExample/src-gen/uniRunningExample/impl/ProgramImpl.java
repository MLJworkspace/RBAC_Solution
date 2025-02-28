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

import uniRunningExample.Course;
import uniRunningExample.Program;
import uniRunningExample.UniRunningExamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.impl.ProgramImpl#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link uniRunningExample.impl.ProgramImpl#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link uniRunningExample.impl.ProgramImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The default value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected String programName = PROGRAM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramCode() <em>Program Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramCode() <em>Program Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCode()
	 * @generated
	 * @ordered
	 */
	protected String programCode = PROGRAM_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniRunningExamplePackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramName() {
		return programName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramName(String newProgramName) {
		String oldProgramName = programName;
		programName = newProgramName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.PROGRAM__PROGRAM_NAME,
					oldProgramName, programName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramCode() {
		return programCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramCode(String newProgramCode) {
		String oldProgramCode = programCode;
		programCode = newProgramCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.PROGRAM__PROGRAM_CODE,
					oldProgramCode, programCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course>(Course.class, this, UniRunningExamplePackage.PROGRAM__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UniRunningExamplePackage.PROGRAM__COURSE:
			return ((InternalEList<?>) getCourse()).basicRemove(otherEnd, msgs);
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
		case UniRunningExamplePackage.PROGRAM__PROGRAM_NAME:
			return getProgramName();
		case UniRunningExamplePackage.PROGRAM__PROGRAM_CODE:
			return getProgramCode();
		case UniRunningExamplePackage.PROGRAM__COURSE:
			return getCourse();
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
		case UniRunningExamplePackage.PROGRAM__PROGRAM_NAME:
			setProgramName((String) newValue);
			return;
		case UniRunningExamplePackage.PROGRAM__PROGRAM_CODE:
			setProgramCode((String) newValue);
			return;
		case UniRunningExamplePackage.PROGRAM__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection<? extends Course>) newValue);
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
		case UniRunningExamplePackage.PROGRAM__PROGRAM_NAME:
			setProgramName(PROGRAM_NAME_EDEFAULT);
			return;
		case UniRunningExamplePackage.PROGRAM__PROGRAM_CODE:
			setProgramCode(PROGRAM_CODE_EDEFAULT);
			return;
		case UniRunningExamplePackage.PROGRAM__COURSE:
			getCourse().clear();
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
		case UniRunningExamplePackage.PROGRAM__PROGRAM_NAME:
			return PROGRAM_NAME_EDEFAULT == null ? programName != null : !PROGRAM_NAME_EDEFAULT.equals(programName);
		case UniRunningExamplePackage.PROGRAM__PROGRAM_CODE:
			return PROGRAM_CODE_EDEFAULT == null ? programCode != null : !PROGRAM_CODE_EDEFAULT.equals(programCode);
		case UniRunningExamplePackage.PROGRAM__COURSE:
			return course != null && !course.isEmpty();
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
		result.append(" (programName: ");
		result.append(programName);
		result.append(", programCode: ");
		result.append(programCode);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
