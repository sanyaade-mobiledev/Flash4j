/************************************************************************
  ScrollableMenu.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls;

import java.util.List;

import com.emitrom.flash4j.core.client.display.DisplayObjectContainer;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.data.HierarchicalCollectionItem;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.ui.mx.Menu;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ScrollableMenu.
 */
public class ScrollableMenu extends Menu {

    private static ScrollableMenu INSTANCE = new ScrollableMenu();

    /**
     * Instantiates a new scrollable menu.
     */
    protected ScrollableMenu(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the scrollable menu
     */
    public ScrollableMenu() {
        jsObj = Bridge.createObject("flexlib.controls.ScrollableMenu");
    }

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param dataProvider
     *            the data provider
     * @return the scrollable menu
     */
    public static ScrollableMenu createMenu(DisplayObjectContainer parent, List<HierarchicalCollectionItem> dataProvider) {
        return INSTANCE._createMenu(parent, DataConverter.fromList(dataProvider).toArray().getJsObj());
    }

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param collection
     *            the collection
     * @return the scrollable menu
     */
    private static ScrollableMenu createMenu(DisplayObjectContainer parent, ArrayCollection collection) {
        return INSTANCE._createMenu(parent, collection.toArray().getJsObj());
    }

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param dataProvider
     *            the data provider
     * @param showRoot
     *            the show root
     * @return the scrollable menu
     */
    public static ScrollableMenu createMenu(DisplayObjectContainer parent,
                    List<HierarchicalCollectionItem> dataProvider, boolean showRoot) {
        return INSTANCE._createMenu(parent, DataConverter.fromList(dataProvider).toArray().getJsObj(), showRoot);
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
     * @return the scrollable menu
     */
    private static ScrollableMenu createMenu(DisplayObjectContainer parent, ArrayCollection collection, boolean showRoot) {
        return INSTANCE._createMenu(parent, collection.toArray(), showRoot);
    }

    /**
     * Hide on activity.
     * 
     * @return true, if successful
     */
    public native boolean hideOnActivity()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return this.gethideOnActivity();
    }-*/;

    /**
     * Sets the hide on activity.
     * 
     * @param value
     *            the new hide on activity
     */
    public native void setHideOnActivity(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		this.sethideOnActivity(value);
    }-*/;

    private native ScrollableMenu _createMenu(DisplayObjectContainer parent, Object mdp)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.createMenu(
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						mdp);
		return this;
    }-*/;

    private native ScrollableMenu _createMenu(DisplayObjectContainer parent, Object mdp, boolean showRoot)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.createMenu(
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						mdp, showRoot);
		return this;
    }-*/;

}
