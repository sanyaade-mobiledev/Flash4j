/************************************************************************
  PieSeriesItem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.flex.client.mx.charts.ChartItem;
import com.emitrom.flash4j.flex.client.mx.graphics.IFill;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PieSeriesItem.
 */
public class PieSeriesItem extends ChartItem {

    /**
     * Instantiates a new pie series item.
     */
    protected PieSeriesItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the pie series item
     */
    public PieSeriesItem() {
        jsObj = Bridge.createObject("mx.charts.items.PieSeriesItem");
        setElement(null);
        setIndex(0);
        setItem(null);
    }

    /**
     * Gets the angle.
     * 
     * @return the angle
     */
    public native double getAngle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getangle();
    }-*/;

    /**
     * Sets the angle.
     * 
     * @param value the new angle
     */
    public native void setAngle(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setangle(value);
    }-*/;

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
     * Gets the inner radius.
     * 
     * @return the inner radius
     */
    public native double getInnerRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinnerRadius();
    }-*/;

    /**
     * Sets the inner radius.
     * 
     * @param value the new inner radius
     */
    public native void setInnerRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinnerRadius(value);
    }-*/;

    /**
     * Gets the label angle.
     * 
     * @return the label angle
     */
    public native double getLabelAngle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelAngle();
    }-*/;

    /**
     * Sets the label angle.
     * 
     * @param value the new label angle
     */
    public native void setLabelAngle(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelAngle(value);
    }-*/;

    /**
     * Gets the number.
     * 
     * @return the number
     */
    public native double getNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumber();
    }-*/;

    /**
     * Sets the number.
     * 
     * @param value the new number
     */
    public native void setNumber(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnumber(value);
    }-*/;

    /**
     * Sets the origin.
     * 
     * @param value the new origin
     */
    public native void setOrigin(Point value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setorigin(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the origin.
     * 
     * @return the origin
     */
    public native Point getOrigin()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getorigin();
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the outer radius.
     * 
     * @return the outer radius
     */
    public native double getOuterRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getouterRadius();
    }-*/;

    /**
     * Sets the outer radius.
     * 
     * @param value the new outer radius
     */
    public native void setOuterRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setouterRadius(value);
    }-*/;

    /**
     * Gets the percent value.
     * 
     * @return the percent value
     */
    public native double getPercentValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpercentValue();
    }-*/;

    /**
     * Sets the percent value.
     * 
     * @param value the new percent value
     */
    public native void setPercentValue(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpercentValue(value);
    }-*/;

    /**
     * Gets the start angle.
     * 
     * @return the start angle
     */
    public native double getStartAngle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartAngle();
    }-*/;

    /**
     * Sets the start angle.
     * 
     * @param value the new start angle
     */
    public native void setStartAngle(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartAngle(value);
    }-*/;

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public native void setValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalue(value);
    }-*/;

    /**
     * Gets the value.
     * 
     * @param <T> the generic type
     * @return the value
     */
    public native <T> T getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

}
