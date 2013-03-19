/************************************************************************
 * MenuItem.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
import com.emitrom.flash4j.flex.client.core.data.HierarchicalCollectionItem;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class MenuItem.
 */
public class MenuItem extends HierarchicalCollectionItem {

    /**
     * Instantiates a new menu item.
     */
    MenuItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the menu item
     */
    public MenuItem() {
        jsObj = Bridge.createObject("com.ekambi.data.MenuItem");
    }

    /**
     * New instance.
     * 
     * @param label
     *            the label
     * @return the menu item
     */
    public MenuItem(String label) {
        this();
        setLabel(label);
    }

    /**
     * Sets the type.
     * 
     * @param value
     *            the new type
     */
    public native void setType(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settype(value);
    }-*/;

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public native String getType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettype();
    }-*/;

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public native String getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value
     *            the new data
     */
    public native void setData(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    /**
     * Creates the separator.
     * 
     * @return the menu item
     */
    public static MenuItem createSeparator() {
        MenuItem item = new MenuItem("Text");
        item.setType("separator");
        return item;
    }

}
