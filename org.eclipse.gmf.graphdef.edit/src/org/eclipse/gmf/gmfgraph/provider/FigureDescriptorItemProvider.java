/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.FigureDescriptor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FigureDescriptorItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureDescriptorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Identity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Identity_name_feature", "_UI_Identity_type"),
				 GMFGraphPackage.eINSTANCE.getIdentity_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigureDescriptor_Accessors());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FigureDescriptor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FigureDescriptor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FigureDescriptor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FigureDescriptor_type") :
			getString("_UI_FigureDescriptor_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FigureDescriptor.class)) {
			case GMFGraphPackage.FIGURE_DESCRIPTOR__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE:
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACCESSORS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createFigureRef()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createLabeledContainer()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createVerticalLabel()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createRectangle()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createInvisibleRectangle()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createRoundedRectangle()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createEllipse()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createPolyline()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createPolygon()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createScalablePolygon()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createPolylineConnection()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createPolylineDecoration()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createPolygonDecoration()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createCustomFigure()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createCustomDecoration()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createCustomConnection()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_ActualFigure(),
				 GMFGraphFactory.eINSTANCE.createSVGFigure()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureDescriptor_Accessors(),
				 GMFGraphFactory.eINSTANCE.createChildAccess()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
