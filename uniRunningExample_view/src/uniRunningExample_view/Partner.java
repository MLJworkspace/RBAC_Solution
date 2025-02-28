/**
 */
package uniRunningExample_view;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniRunningExample_view.Partner#getPartnerName <em>Partner Name</em>}</li>
 *   <li>{@link uniRunningExample_view.Partner#getPartnerType <em>Partner Type</em>}</li>
 * </ul>
 *
 * @see uniRunningExample_view.UniRunningExample_viewPackage#getPartner()
 * @model
 * @generated
 */
public interface Partner extends EObject {
	/**
	 * Returns the value of the '<em><b>Partner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Name</em>' attribute.
	 * @see #setPartnerName(String)
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getPartner_PartnerName()
	 * @model
	 * @generated
	 */
	String getPartnerName();

	/**
	 * Sets the value of the '{@link uniRunningExample_view.Partner#getPartnerName <em>Partner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Name</em>' attribute.
	 * @see #getPartnerName()
	 * @generated
	 */
	void setPartnerName(String value);

	/**
	 * Returns the value of the '<em><b>Partner Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uniRunningExample_view.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Type</em>' attribute.
	 * @see uniRunningExample_view.Type
	 * @see #setPartnerType(Type)
	 * @see uniRunningExample_view.UniRunningExample_viewPackage#getPartner_PartnerType()
	 * @model
	 * @generated
	 */
	Type getPartnerType();

	/**
	 * Sets the value of the '{@link uniRunningExample_view.Partner#getPartnerType <em>Partner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Type</em>' attribute.
	 * @see uniRunningExample_view.Type
	 * @see #getPartnerType()
	 * @generated
	 */
	void setPartnerType(Type value);

} // Partner
