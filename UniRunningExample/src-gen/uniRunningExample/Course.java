/**
 */
package uniRunningExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.Course#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link uniRunningExample.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link uniRunningExample.Course#getTeacher <em>Teacher</em>}</li>
 * </ul>
 *
 * @see uniRunningExample.UniRunningExamplePackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Name</em>' attribute.
	 * @see #setCourseName(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getCourse_CourseName()
	 * @model
	 * @generated
	 */
	String getCourseName();

	/**
	 * Sets the value of the '{@link uniRunningExample.Course#getCourseName <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Name</em>' attribute.
	 * @see #getCourseName()
	 * @generated
	 */
	void setCourseName(String value);

	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getCourse_CourseCode()
	 * @model
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link uniRunningExample.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' reference list.
	 * The list contents are of type {@link uniRunningExample.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getCourse_Teacher()
	 * @model required="true"
	 * @generated
	 */
	EList<Employee> getTeacher();

} // Course
