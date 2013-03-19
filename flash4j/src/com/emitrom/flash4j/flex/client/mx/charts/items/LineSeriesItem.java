/************************************************************************
  LineSeriesItem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.items;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.graphics.IFill;
import com.emitrom.flash4j.flex.client.ui.mx.ChartItem;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class LineSeriesItem.
 */
public class LineSeriesItem extends ChartItem {

    /**
     * Instantiates a new line series item.
     */
    protected LineSeriesItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the line series item
     */
    public LineSeriesItem() {
        jsObj = Bridge.createObject("mx.charts.items.LineSeriesItem");
        setElement(null);
        setItem(null);
        setIndex(0);
    }

    /**
     * Sets the fill.
     * 
     * @param value the new fill
     */
    public native void setFill(IFill value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setfill(value.@com.emitrom.flash4j.flex.client.mx.graphics.IFill::asIFill()());
    }-*/;

    /**
     * Gets the min.
     * 
     * @return the min
     */
    public native double getMin()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmin();
    }-*/;

    /**
     * Sets the min.
     * 
     * @param value the new min
     */
    public native void setMin(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmin(value);
    }-*/;

    /**
     * Gets the min filter.
     * 
     * @return the min filter
     */
    public native double getMinFilter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminFilter();
    }-*/;

    /**
     * Sets the min filter.
     * 
     * @param value the new min filter
     */
    public native void setMinFilter(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminFilter(value);
    }-*/;

    /**
     * Gets the min number.
     * 
     * @return the min number
     */
    public native double getMinNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminNumber();
    }-*/;

    /**
     * Sets the min number.
     * 
     * @param value the new min number
     */
    public native void setMinNumber(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminNumber(value);
    }-*/;

    /**
     * Sets the min value.
     * 
     * @param value the new min value
     */
    public native void setMinValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminValue(value);
    }-*/;

    /**
     * Gets the min value.
     * 
     * @param <T> the generic type
     * @return the min value
     */
    public native <T> T getMinValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminValue();
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
     * @param value the new x
     */
    public native void setX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setx(value);
    }-*/;

    /**
     * Gets the x filter.
     * 
     * @return the x filter
     */
    public native double getXFilter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxFilter();
    }-*/;

    /**
     * Sets the x filter.
     * 
     * @param value the new x filter
     */
    public native void setXFilter(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxFilter(value);
    }-*/;

    /**
     * Gets the x number.
     * 
     * @return the x number
     */
    public native double getXNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxNumber();
    }-*/;

    /**
     * Sets the x number.
     * 
     * @param value the new x number
     */
    public native void setXNumber(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxNumber(value);
    }-*/;

    /**
     * Sets the x value.
     * 
     * @param value the new x value
     */
    public native void setXValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxValue(value);
    }-*/;

    /**
     * Gets the x value.
     * 
     * @param <T> the generic type
     * @return the x value
     */
    public native <T> T getXValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxValue();
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
     * @param value the new y
     */
    public native void setY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sety(value);
    }-*/;

    /**
     * Gets the y filter.
     * 
     * @return the y filter
     */
    public native double getYFilter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyFilter();
    }-*/;

    /**
     * Sets the y filter.
     * 
     * @param value the new y filter
     */
    public native void setYFilter(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyFilter(value);
    }-*/;

    /**
     * Gets the y number.
     * 
     * @return the y number
     */
    public native double getYNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyNumber();
    }-*/;

    /**
     * Sets the y number.
     * 
     * @param value the new y number
     */
    public native void setYNumber(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyNumber(value);
    }-*/;

    /**
     * Sets the y value.
     * 
     * @param value the new y value
     */
    public native void setYValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyValue(value);
    }-*/;

    /**
     * Gets the y value.
     * 
     * @param <T> the generic type
     * @return the y value
     */
    public native <T> T getYValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyValue();
    }-*/;
}
