/************************************************************************
  Menu.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
**************************************************************************/
package com.emitrom.flash4j.flex.client.ui.mx;

import java.util.Arrays;

import com.emitrom.flash4j.core.client.display.DisplayObjectContainer;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.data.HierarchicalCollectionItem;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Menu.
 */
public class Menu extends List {

    private static final Menu INSTANCE = new Menu();

    /**
     * Instantiates a new menu.
     */
    Menu(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the menu
     */
    public Menu() {
        jsObj = Bridge.createObject("mx.controls.Menu");
    }

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
     * Gets the parent menu.
     * 
     * @return the parent menu
     */
    public native Menu getParentMenu()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getparentMenu();
		return @com.emitrom.flash4j.flex.client.ui.mx.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the parent menu.
     * 
     * @param value
     *            the new parent menu
     */
    public native void setParentMenu(Menu value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setparentMenu(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
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
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param dataProvider
     *            the data provider
     * @return the menu
     */

    public static Menu createMenu(DisplayObjectContainer parent, HierarchicalCollectionItem... items) {
        return createMenu(parent, Arrays.asList(items));
    }

    public static Menu createMenu(DisplayObjectContainer parent, java.util.List<HierarchicalCollectionItem> dataProvider) {
        return createMenu(parent, DataConverter.fromList(dataProvider));
    }

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param collection
     *            the collection
     * @return the menu
     */
    private static Menu createMenu(DisplayObjectContainer parent, ArrayCollection collection) {
        return INSTANCE._createMenu(parent, collection.toArray().getJsObj());
    }

    /**
     * _create menu.
     * 
     * @param parent
     *            the parent
     * @param mdp
     *            the mdp
     * @return the menu
     */
    private native Menu _createMenu(DisplayObjectContainer parent, JavaScriptObject mdp)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.createMenu(
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						mdp);
		return @com.emitrom.flash4j.flex.client.ui.mx.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param dataProvider
     *            the data provider
     * @param showRoot
     *            the show root
     * @return the menu
     */
    public static Menu createMenu(DisplayObjectContainer parent,
                    java.util.List<HierarchicalCollectionItem> dataProvider, boolean showRoot) {
        return createMenu(parent, DataConverter.fromList(dataProvider), showRoot);
    }

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param collection
     *            the collection
     * @param showRoot
     *            the show root
     * @return the menu
     */
    private static Menu createMenu(DisplayObjectContainer parent, ArrayCollection collection, boolean showRoot) {
        return INSTANCE._createMenu(parent, collection.toArray().getJsObj(), showRoot);
    }

    /**
     * _create menu.
     * 
     * @param parent
     *            the parent
     * @param mdp
     *            the mdp
     * @param showRoot
     *            the show root
     * @return the menu
     */
    private native Menu _createMenu(DisplayObjectContainer parent, JavaScriptObject mdp, boolean showRoot)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.createMenu(
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						mdp.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						showRoot);
		return @com.emitrom.flash4j.flex.client.ui.mx.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Hide.
     */
    public native void hide()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.hide();
    }-*/;

    /**
     * Pop up menu.
     * 
     * @param menu
     *            the menu
     * @param parent
     *            the parent
     * @param mdp
     *            the mdp
     * @return the menu
     */
    public static Menu popUpMenu(Menu menu, DisplayObjectContainer parent, Object mdp) {
        return INSTANCE._popUpMenu(menu, parent, mdp);
    }

    /**
     * _pop up menu.
     * 
     * @param menu
     *            the menu
     * @param parent
     *            the parent
     * @param mdp
     *            the mdp
     * @return the menu
     */
    private native Menu _popUpMenu(Menu menu, DisplayObjectContainer parent, Object mdp)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.popUpMenu(
						menu.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						mdp);
		return @com.emitrom.flash4j.flex.client.ui.mx.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Show.
     */
    public native void show()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.show();
    }-*/;

    /**
     * Show.
     * 
     * @param x
     *            the x
     */
    public void show(double x) {
        _show(Double.toString(x));
    }

    /**
     * _show.
     * 
     * @param xShow
     *            the x show
     */
    private native void _show(Object xShow)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.show(xShow);
    }-*/;

    /**
     * Show.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public void show(double x, double y) {
        _show(Double.toString(x), Double.toString(y));
    }

    /**
     * _show.
     * 
     * @param xShow
     *            the x show
     * @param mdp
     *            the mdp
     */
    private native void _show(Object xShow, Object mdp)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.show(xShow, mdp);
    }-*/;

}
