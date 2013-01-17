/************************************************************************
  BubbleSeries.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.series;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis;
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.Series;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class BubbleSeries.
 */
public class BubbleSeries extends Series {

    /**
     * Instantiates a new bubble series.
     */
    protected BubbleSeries(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the bubble series
     */
    public BubbleSeries() {
        jsObj = Bridge.createObject("mx.charts.series.BubbleSeries");
    }

    /**
     * Gets the max radius.
     * 
     * @return the max radius
     */
    public native double getMaxRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxRadius();
    }-*/;

    /**
     * Sets the max radius.
     * 
     * @param value the new max radius
     */
    public native void setMaxRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxRadius(value);
    }-*/;

    /**
     * Gets the min radius.
     * 
     * @return the min radius
     */
    public native double getMinRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminRadius();
    }-*/;

    /**
     * Sets the min radius.
     * 
     * @param value the new min radius
     */
    public native void setMinRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminRadius(value);
    }-*/;

    /**
     * Sets the radis axis.
     * 
     * @param value the new radis axis
     */
    public native void setRadisAxis(IAxis value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setradisAxis(value.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

    /**
     * Gets the radius field.
     * 
     * @return the radius field
     */
    public native String getRadiusField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getradiusField();
    }-*/;

    /**
     * Sets the radius field.
     * 
     * @param value the new radius field
     */
    public native void setRadiusField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setradiusField(value);
    }-*/;

    /**
     * Sets the horizontal axis.
     * 
     * @param value the new horizontal axis
     */
    public native void setHorizontalAxis(IAxis value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.sethorizontalAxis(value.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

    /**
     * Sets the vertical axis.
     * 
     * @param value the new vertical axis
     */
    public native void setVerticalAxis(IAxis value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setverticalAxis(value.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

    /**
     * Sets the x field.
     * 
     * @param value the new x field
     */
    public native void setXField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxField(value);
    }-*/;

    /**
     * Gets the x field.
     * 
     * @return the x field
     */
    public native String getXField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxField();
    }-*/;

    /**
     * Sets the y field.
     * 
     * @param value the new y field
     */
    public native void setYField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyField(value);
    }-*/;

    /**
     * Gets the y field.
     * 
     * @return the y field
     */
    public native String getYField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyField();
    }-*/;
}
