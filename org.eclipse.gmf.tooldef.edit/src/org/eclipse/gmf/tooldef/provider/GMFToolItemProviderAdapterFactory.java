/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.gmf.tooldef.util.GMFToolAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFToolItemProviderAdapterFactory extends GMFToolAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFToolItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.ToolRegistry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolRegistryItemProvider toolRegistryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.ToolRegistry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolRegistryAdapter() {
		if (toolRegistryItemProvider == null) {
			toolRegistryItemProvider = new ToolRegistryItemProvider(this);
		}

		return toolRegistryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.PaletteSeparator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaletteSeparatorItemProvider paletteSeparatorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.PaletteSeparator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaletteSeparatorAdapter() {
		if (paletteSeparatorItemProvider == null) {
			paletteSeparatorItemProvider = new PaletteSeparatorItemProvider(this);
		}

		return paletteSeparatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.ToolGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolGroupItemProvider toolGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.ToolGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolGroupAdapter() {
		if (toolGroupItemProvider == null) {
			toolGroupItemProvider = new ToolGroupItemProvider(this);
		}

		return toolGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.Palette} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaletteItemProvider paletteItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.Palette}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaletteAdapter() {
		if (paletteItemProvider == null) {
			paletteItemProvider = new PaletteItemProvider(this);
		}

		return paletteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.StandardTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardToolItemProvider standardToolItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.StandardTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStandardToolAdapter() {
		if (standardToolItemProvider == null) {
			standardToolItemProvider = new StandardToolItemProvider(this);
		}

		return standardToolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.CreationTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreationToolItemProvider creationToolItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.CreationTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreationToolAdapter() {
		if (creationToolItemProvider == null) {
			creationToolItemProvider = new CreationToolItemProvider(this);
		}

		return creationToolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.GenericTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericToolItemProvider genericToolItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.GenericTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericToolAdapter() {
		if (genericToolItemProvider == null) {
			genericToolItemProvider = new GenericToolItemProvider(this);
		}

		return genericToolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.Separator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeparatorItemProvider separatorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.Separator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeparatorAdapter() {
		if (separatorItemProvider == null) {
			separatorItemProvider = new SeparatorItemProvider(this);
		}

		return separatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.PredefinedItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredefinedItemItemProvider predefinedItemItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.PredefinedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredefinedItemAdapter() {
		if (predefinedItemItemProvider == null) {
			predefinedItemItemProvider = new PredefinedItemItemProvider(this);
		}

		return predefinedItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.PredefinedMenu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredefinedMenuItemProvider predefinedMenuItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.PredefinedMenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredefinedMenuAdapter() {
		if (predefinedMenuItemProvider == null) {
			predefinedMenuItemProvider = new PredefinedMenuItemProvider(this);
		}

		return predefinedMenuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.MenuAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuActionItemProvider menuActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.MenuAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMenuActionAdapter() {
		if (menuActionItemProvider == null) {
			menuActionItemProvider = new MenuActionItemProvider(this);
		}

		return menuActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.ItemRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemRefItemProvider itemRefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.ItemRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemRefAdapter() {
		if (itemRefItemProvider == null) {
			itemRefItemProvider = new ItemRefItemProvider(this);
		}

		return itemRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.ContextMenu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextMenuItemProvider contextMenuItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.ContextMenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextMenuAdapter() {
		if (contextMenuItemProvider == null) {
			contextMenuItemProvider = new ContextMenuItemProvider(this);
		}

		return contextMenuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.PopupMenu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopupMenuItemProvider popupMenuItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.PopupMenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPopupMenuAdapter() {
		if (popupMenuItemProvider == null) {
			popupMenuItemProvider = new PopupMenuItemProvider(this);
		}

		return popupMenuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.MainMenu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainMenuItemProvider mainMenuItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.MainMenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMainMenuAdapter() {
		if (mainMenuItemProvider == null) {
			mainMenuItemProvider = new MainMenuItemProvider(this);
		}

		return mainMenuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.Toolbar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolbarItemProvider toolbarItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.Toolbar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolbarAdapter() {
		if (toolbarItemProvider == null) {
			toolbarItemProvider = new ToolbarItemProvider(this);
		}

		return toolbarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.DefaultImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultImageItemProvider defaultImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.DefaultImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultImageAdapter() {
		if (defaultImageItemProvider == null) {
			defaultImageItemProvider = new DefaultImageItemProvider(this);
		}

		return defaultImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.BundleImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImageItemProvider bundleImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.BundleImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBundleImageAdapter() {
		if (bundleImageItemProvider == null) {
			bundleImageItemProvider = new BundleImageItemProvider(this);
		}

		return bundleImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gmf.tooldef.GenericStyleSelector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericStyleSelectorItemProvider genericStyleSelectorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gmf.tooldef.GenericStyleSelector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericStyleSelectorAdapter() {
		if (genericStyleSelectorItemProvider == null) {
			genericStyleSelectorItemProvider = new GenericStyleSelectorItemProvider(this);
		}

		return genericStyleSelectorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (toolRegistryItemProvider != null)
			toolRegistryItemProvider.dispose();
		if (paletteSeparatorItemProvider != null)
			paletteSeparatorItemProvider.dispose();
		if (toolGroupItemProvider != null)
			toolGroupItemProvider.dispose();
		if (paletteItemProvider != null)
			paletteItemProvider.dispose();
		if (standardToolItemProvider != null)
			standardToolItemProvider.dispose();
		if (creationToolItemProvider != null)
			creationToolItemProvider.dispose();
		if (genericToolItemProvider != null)
			genericToolItemProvider.dispose();
		if (separatorItemProvider != null)
			separatorItemProvider.dispose();
		if (predefinedItemItemProvider != null)
			predefinedItemItemProvider.dispose();
		if (predefinedMenuItemProvider != null)
			predefinedMenuItemProvider.dispose();
		if (menuActionItemProvider != null)
			menuActionItemProvider.dispose();
		if (itemRefItemProvider != null)
			itemRefItemProvider.dispose();
		if (contextMenuItemProvider != null)
			contextMenuItemProvider.dispose();
		if (popupMenuItemProvider != null)
			popupMenuItemProvider.dispose();
		if (mainMenuItemProvider != null)
			mainMenuItemProvider.dispose();
		if (toolbarItemProvider != null)
			toolbarItemProvider.dispose();
		if (defaultImageItemProvider != null)
			defaultImageItemProvider.dispose();
		if (bundleImageItemProvider != null)
			bundleImageItemProvider.dispose();
		if (genericStyleSelectorItemProvider != null)
			genericStyleSelectorItemProvider.dispose();
	}

}