/************************************************************************
 * MenuBar.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.flex.client.ui.mx;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.data.HierarchicalCollectionItem;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class MenuBar.
 */
public class MenuBar extends UIComponent {

    /**
     * Instantiates a new menu bar.
     */
    protected MenuBar(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the menu bar
     */
    public MenuBar() {
        jsObj = Bridge.createObject("mx.controls.MenuBar");
    }

    /**
     * Sets the data provider.
     * 
     * @param dataProvider
     *            the new data provider
     */
    public void setDataProvider(ArrayCollection dataProvider) {
        _setDataProvider(dataProvider.toArray().getJsObj());
    }

    /**
     * _set data provider.
     * 
     * @param value
     *            the value
     */
    private native void _setDataProvider(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Checks for root.
     * 
     * @return true, if successful
     */
    public native boolean hasRoot()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasRoot();
    }-*/;

    /**
     * Gets the icon field.
     * 
     * @return the icon field
     */
    public native String getIconField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geticonField();
    }-*/;

    /**
     * Sets the icon field.
     * 
     * @param value
     *            the new icon field
     */
    public native void setIconField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seticonField(value);
    }-*/;

    /**
     * Gets the label field.
     * 
     * @return the label field
     */
    public native String getLabelField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelField();
    }-*/;

    /**
     * Sets the label field.
     * 
     * @param value
     *            the new label field
     */
    public native void setLabelField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelField(value);
    }-*/;

    /**
     * Gets the menu bar items.
     * 
     * @return the menu bar items
     */

    public List<MenuBarItem> getMenuBarItems() {
        List<MenuBarItem> menuBarItems = new ArrayList<MenuBarItem>();
        JavaScriptObject peers = _getMenus();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            menuBarItems.add(new MenuBarItem(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return menuBarItems;
    }

    public native JavaScriptObject _getMenuBarItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmenuBarItems();
    }-*/;

    /**
     * Sets the menu bar items.
     * 
     * @param items
     *            the new menu bar items
     */
    public void setMenuBarItems(List<MenuBarItem> items) {
        ArrayCollection collection = DataConverter.fromList(items);
        setMenuBarItems(collection);
    }

    /**
     * Sets the menu bar items.
     * 
     * @param collection
     *            the new menu bar items
     */
    private void setMenuBarItems(ArrayCollection collection) {
        _setMenuBarItems(collection.toArray().getJsObj());
    }

    /**
     * Sets the menu bar items.
     * 
     * @param value
     *            the new menu bar items
     */
    private native void _setMenuBarItems(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmenuBarItems(value);
    }-*/;

    /**
     * Gets the menus.
     * 
     * @return the menus
     */
    public List<Menu> getMenus() {
        List<Menu> menus = new ArrayList<Menu>();
        JavaScriptObject peers = _getMenus();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            menus.add(new Menu(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return menus;
    }

    private native JavaScriptObject _getMenus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmenus();
    }-*/;

    /**
     * Sets the menus.
     * 
     * @param items
     *            the new menus
     */
    public void setMenus(List<Menu> items) {
        ArrayCollection collection = DataConverter.fromList(items);
        setMenus(collection);
    }

    /**
     * Sets the menus.
     * 
     * @param collection
     *            the new menus
     */
    private void setMenus(ArrayCollection collection) {
        _setMenus(collection.toArray().getJsObj());
    }

    /**
     * Sets the menus.
     * 
     * @param value
     *            the new menus
     */
    private native void _setMenus(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmenus(value);
    }-*/;

    /**
     * Gets the selected index.
     * 
     * @return the selected index
     */
    public native int getSelectedIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedIndex();
    }-*/;

    /**
     * Sets the selected index.
     * 
     * @param value
     *            the new selected index
     */
    public native void setSelectedIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedIndex(value);
    }-*/;

    /**
     * Show root.
     * 
     * @return true, if successful
     */
    public native boolean showRoot()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowRoot();
    }-*/;

    /**
     * Sets the show root.
     * 
     * @param value
     *            the new show root
     */
    public native void setShowRoot(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowRoot(value);
    }-*/;

    /**
     * Gets the menu at.
     * 
     * @param index
     *            the index
     * @return the menu at
     */
    public native Menu getMenuAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getMenuAt(index);
		return @com.emitrom.flash4j.flex.client.ui.mx.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Item to icon.
     * 
     * @param <T>
     *            the generic type
     * @param data
     *            the data
     * @return the t
     */
    public native <T> T itemToIcon(Object data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.itemToIcon(data);
    }-*/;

    /**
     * Item to label.
     * 
     * @param data
     *            the data
     * @return the string
     */
    public native String itemToLabel(Object data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.itemToLabel(data);
    }-*/;

    /**
     * Add menu items to this menubar
     * 
     * @param items
     */
    public void addMenuItems(HierarchicalCollectionItem... items) {
        ArrayCollection dataProvider = new ArrayCollection();
        for (HierarchicalCollectionItem item : items) {
            dataProvider.addItem(item);
        }
        setDataProvider(dataProvider);
    }

}
