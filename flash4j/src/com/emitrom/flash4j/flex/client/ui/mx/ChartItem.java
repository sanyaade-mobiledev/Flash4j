/************************************************************************
 * ChartItem.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ChartItem.
 */
public class ChartItem extends ProxyObject {

    /** The Constant DISABLED. */
    public static String DISABLED = "disabled";

    /** The Constant FOCUSED. */
    public static String FOCUSED = "focused";

    /** The Constant FOCUSEDSELECTED. */
    public static String FOCUSEDSELECTED = "focusedSelected";

    /** The Constant NONE. */
    public static String NONE = "none";

    /** The Constant ROLLOVER. */
    public static String ROLLOVER = "rollover";

    /** The Constant SELECTED. */
    public static String SELECTED = "selected";

    /**
     * Instantiates a new chart item.
     */
    protected ChartItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected ChartItem() {

    }

    /**
     * Gets the current state.
     * 
     * @return the current state
     */
    public native String getCurrentState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentState();
    }-*/;

    /**
     * Sets the current state.
     * 
     * @param value
     *            the new current state
     */
    public native void setCurrentState(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcurrentState(value);
    }-*/;

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public native int getIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getindex();
    }-*/;

    /**
     * Sets the index.
     * 
     * @param value
     *            the new index
     */
    public native void setIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setindex(value);
    }-*/;

    /**
     * Sets the element.
     * 
     * @param value
     *            the new element
     */

    public void setElement(ProxyObject value) {
        setElement(value.getJsObj());
    }

    private native void setElement(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setelement(value);
    }-*/;

    /**
     * Gets the element.
     * 
     * @param <T>
     *            the generic type
     * @return the element
     */
    public native <T extends JavaScriptObject> T getElement()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getelement();
    }-*/;

    /**
     * Gets the item.
     * 
     * @param <T>
     *            the generic type
     * @return the item
     */
    public native <T> T getItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getItem();
    }-*/;

    /**
     * Sets the item.
     * 
     * @param value
     *            the new item
     */
    public native void setItem(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setItem(value);
    }-*/;

    public native ChartItem cloneItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.flash4j.flex.client.ui.mx.ChartItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static ChartItem from(JavaScriptObject peer) {
        return new ChartItem(peer);
    }

}
