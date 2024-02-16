/**
 */
package accessControlMetamodel.util;

import accessControlMetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see accessControlMetamodel.AccessControlMetamodelPackage
 * @generated
 */
public class AccessControlMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AccessControlMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AccessControlMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlMetamodelSwitch<Adapter> modelSwitch = new AccessControlMetamodelSwitch<Adapter>() {
		@Override
		public Adapter caseAccessControlModel(AccessControlModel object) {
			return createAccessControlModelAdapter();
		}

		@Override
		public Adapter caseEClassPermissions(EClassPermissions object) {
			return createEClassPermissionsAdapter();
		}

		@Override
		public Adapter caseEAttributePermissions(EAttributePermissions object) {
			return createEAttributePermissionsAdapter();
		}

		@Override
		public Adapter caseEReferencePermissions(EReferencePermissions object) {
			return createEReferencePermissionsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link accessControlMetamodel.AccessControlModel <em>Access Control Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accessControlMetamodel.AccessControlModel
	 * @generated
	 */
	public Adapter createAccessControlModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accessControlMetamodel.EClassPermissions <em>EClass Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accessControlMetamodel.EClassPermissions
	 * @generated
	 */
	public Adapter createEClassPermissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accessControlMetamodel.EAttributePermissions <em>EAttribute Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accessControlMetamodel.EAttributePermissions
	 * @generated
	 */
	public Adapter createEAttributePermissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accessControlMetamodel.EReferencePermissions <em>EReference Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accessControlMetamodel.EReferencePermissions
	 * @generated
	 */
	public Adapter createEReferencePermissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AccessControlMetamodelAdapterFactory
