/************************************************************************
 * TileTweenEffect.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.efflex.mx.viewstackeffects;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TileTweenEffect.
 */
public class TileTweenEffect extends ViewStackEffect {

    /**
     * Instantiates a new tile tween effect.
     */
    protected TileTweenEffect(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected TileTweenEffect() {

    }

    /**
     * Gets the num rows.
     * 
     * @return the num rows
     */
    public native int getNumRows()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumRows();
    }-*/;

    /**
     * Sets the num rows.
     * 
     * @param value
     *            the new num rows
     */
    public native void setNumRows(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnumRows(value);
    }-*/;

    /**
     * Gets the num columns.
     * 
     * @return the num columns
     */
    public native int getNumColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumColumns();
    }-*/;

    /**
     * Sets the num columns.
     * 
     * @param value
     *            the new num columns
     */
    public native void setNumColumns(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnumColumns(value);
    }-*/;

    /**
     * Gets the tile duration percent.
     * 
     * @return the tile duration percent
     */
    public native double getTileDurationPercent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettileDurationPercent();
    }-*/;

    /**
     * Sets the tile duration percent.
     * 
     * @param value
     *            the new tile duration percent
     */
    public native void setTileDurationPercent(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settileDurationPercent(value);
    }-*/;

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public native String getOrder()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getorder();
    }-*/;

    /**
     * Sets the order.
     * 
     * @param value
     *            the new order
     */
    public native void setOrder(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setorder(value);
    }-*/;

}
