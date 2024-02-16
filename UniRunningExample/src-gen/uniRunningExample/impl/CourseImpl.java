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

import uniRunningExample.Course;
import uniRunningExample.Employee;
import uniRunningExample.UniRunningExamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.impl.CourseImpl#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link uniRunningExample.impl.CourseImpl#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link uniRunningExample.impl.CourseImpl#getTeacher <em>Teacher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected String courseName = COURSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected String courseCode = COURSE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> teacher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniRunningExamplePackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseName(String newCourseName) {
		String oldCourseName = courseName;
		courseName = newCourseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.COURSE__COURSE_NAME,
					oldCourseName, courseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseCode(String newCourseCode) {
		String oldCourseCode = courseCode;
		courseCode = newCourseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniRunningExamplePackage.COURSE__COURSE_CODE,
					oldCourseCode, courseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getTeacher() {
		if (teacher == null) {
			teacher = new EObjectResolvingEList<Employee>(Employee.class, this,
					UniRunningExamplePackage.COURSE__TEACHER);
		}
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniRunningExamplePackage.COURSE__COURSE_NAME:
			return getCourseName();
		case UniRunningExamplePackage.COURSE__COURSE_CODE:
			return getCourseCode();
		case UniRunningExamplePackage.COURSE__TEACHER:
			return getTeacher();
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
		case UniRunningExamplePackage.COURSE__COURSE_NAME:
			setCourseName((String) newValue);
			return;
		case UniRunningExamplePackage.COURSE__COURSE_CODE:
			setCourseCode((String) newValue);
			return;
		case UniRunningExamplePackage.COURSE__TEACHER:
			getTeacher().clear();
			getTeacher().addAll((Collection<? extends Employee>) newValue);
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
		case UniRunningExamplePackage.COURSE__COURSE_NAME:
			setCourseName(COURSE_NAME_EDEFAULT);
			return;
		case UniRunningExamplePackage.COURSE__COURSE_CODE:
			setCourseCode(COURSE_CODE_EDEFAULT);
			return;
		case UniRunningExamplePackage.COURSE__TEACHER:
			getTeacher().clear();
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
		case UniRunningExamplePackage.COURSE__COURSE_NAME:
			return COURSE_NAME_EDEFAULT == null ? courseName != null : !COURSE_NAME_EDEFAULT.equals(courseName);
		case UniRunningExamplePackage.COURSE__COURSE_CODE:
			return COURSE_CODE_EDEFAULT == null ? courseCode != null : !COURSE_CODE_EDEFAULT.equals(courseCode);
		case UniRunningExamplePackage.COURSE__TEACHER:
			return teacher != null && !teacher.isEmpty();
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
		result.append(" (courseName: ");
		result.append(courseName);
		result.append(", courseCode: ");
		result.append(courseCode);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
