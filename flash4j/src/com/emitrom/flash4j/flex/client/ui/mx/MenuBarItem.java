/************************************************************************
 * MenuBarItem.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class MenuBarItem.
 */
public class MenuBarItem extends UIComponent {

    /**
     * Instantiates a new menu bar item.
     */
    public MenuBarItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the menu bar item
     */
    public MenuBarItem() {
        jsObj = Bridge.createObject("mx.controls.menuClasses.MenuBarItem");
    }

    /**
     * Gets the data.
     * 
     * @param <T>
     *            the generic type
     * @return the data
     */
    public native <T> T getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value
     *            the new data
     */
    public native void setData(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    /**
     * Gets the data provider.
     * 
     * @param <T>
     *            the generic type
     * @return the data provider
     */
    public native <T> T getDataProvider()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataProvider();
    }-*/;

    /**
     * Sets the data provider.
     * 
     * @param value
     *            the new data provider
     */
    public native void setDataProvider(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Gets the menu bar.
     * 
     * @return the menu bar
     */
    public native MenuBar getMenuBar()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getmenuBar();
		return @com.emitrom.flash4j.flex.client.ui.mx.MenuBar::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the menu bar.
     * 
     * @param value
     *            the new menu bar
     */
    public native void setMenuBar(MenuBar value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setmenuBar(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the menu bar item index.
     * 
     * @return the menu bar item index
     */
    public native int getMenuBarItemIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmenuBarItemIndex();
    }-*/;

    /**
     * Sets the menu bar item index.
     * 
     * @param value
     *            the new menu bar item index
     */
    public native void setMenuBarItemIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmenuBarItemIndex(value);
    }-*/;

    /**
     * Gets the menu bar item state.
     * 
     * @return the menu bar item state
     */
    public native String getMenuBarItemState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmenuBarItemState();
    }-*/;

    /**
     * Sets the menu bar item state.
     * 
     * @param value
     *            the new menu bar item state
     */
    public native void setMenuBarItemState(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmenuBarItemState(value);
    }-*/;

}
