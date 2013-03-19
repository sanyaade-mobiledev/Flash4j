/************************************************************************
 * HitData.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
 * The Class HitData.
 */
public class HitData extends ProxyObject {

    /**
     * Instantiates a new hit data.
     */
    protected HitData(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the chart item.
     * 
     * @return the chart item
     */
    public native ChartItem getChartItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getchartItem();
		return @com.emitrom.flash4j.flex.client.ui.mx.ChartItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the chart item.
     * 
     * @param item
     *            the new chart item
     */
    public native void setChartItem(ChartItem item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setchartItem(item);
    }-*/;

    /**
     * Gets the context color.
     * 
     * @return the context color
     */
    public native int getContextColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontextColor();
    }-*/;

    /**
     * Sets the context color.
     * 
     * @param value
     *            the new context color
     */
    public native void setContextColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcontextColor(value);
    }-*/;

    /**
     * Gets the display text.
     * 
     * @return the display text
     */
    public native String getDisplayText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisplayText();
    }-*/;

    /**
     * Gets the distance.
     * 
     * @return the distance
     */
    public native double getDistance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdistance();
    }-*/;

    /**
     * Sets the distance.
     * 
     * @param value
     *            the new distance
     */
    public native void setDistance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdistance(value);
    }-*/;

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public native double getId()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getid();
    }-*/;

    /**
     * Sets the id.
     * 
     * @param value
     *            the new id
     */
    public native void setId(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setid(value);
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
		return peer.getitem();
    }-*/;

    /**
     * Sets the item.
     * 
     * @param value
     *            the new item
     */
    public native void setItem(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setitem(value);
    }-*/;

    /**
     * Gets the x.
     * 
     * @return the x
     */
    public native double getX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getx();
    }-*/;

    /**
     * Sets the x.
     * 
     * @param value
     *            the new x
     */
    public native void setX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setx(value);
    }-*/;

    /**
     * Gets the y.
     * 
     * @return the y
     */
    public native double getY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gety();
    }-*/;

    /**
     * Sets the y.
     * 
     * @param value
     *            the new y
     */
    public native void setY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sety(value);
    }-*/;

}
