/**
 */
package uniRunningExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample.Program#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link uniRunningExample.Program#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link uniRunningExample.Program#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see uniRunningExample.UniRunningExamplePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Name</em>' attribute.
	 * @see #setProgramName(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getProgram_ProgramName()
	 * @model
	 * @generated
	 */
	String getProgramName();

	/**
	 * Sets the value of the '{@link uniRunningExample.Program#getProgramName <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Name</em>' attribute.
	 * @see #getProgramName()
	 * @generated
	 */
	void setProgramName(String value);

	/**
	 * Returns the value of the '<em><b>Program Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Code</em>' attribute.
	 * @see #setProgramCode(String)
	 * @see uniRunningExample.UniRunningExamplePackage#getProgram_ProgramCode()
	 * @model
	 * @generated
	 */
	String getProgramCode();

	/**
	 * Sets the value of the '{@link uniRunningExample.Program#getProgramCode <em>Program Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Code</em>' attribute.
	 * @see #getProgramCode()
	 * @generated
	 */
	void setProgramCode(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link uniRunningExample.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see uniRunningExample.UniRunningExamplePackage#getProgram_Course()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourse();

} // Program
