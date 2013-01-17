/************************************************************************
  LineSeries.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class LineSeries.
 */
public class LineSeries extends Series {

    /**
     * Instantiates a new line series.
     */
    protected LineSeries(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the line series
     */
    public LineSeries() {
        jsObj = Bridge.createObject("mx.charts.series.LineSeries");
    }

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
     * Interpolate values.
     * 
     * @return true, if successful
     */
    public native boolean interpolateValues()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinterpolateValues();
    }-*/;

    /**
     * Sets the interpolate values.
     * 
     * @param value the new interpolate values
     */
    public native void setInterpolateValues(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinterpolateValues(value);
    }-*/;

    /**
     * Gets the radius.
     * 
     * @return the radius
     */
    public native double getRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getradius();
    }-*/;

    /**
     * Sets the radius.
     * 
     * @param value the new radius
     */
    public native void setRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setradius(value);
    }-*/;

    /**
     * Sort on x field.
     * 
     * @return true, if successful
     */
    public native boolean sortOnXField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsortOnXField();
    }-*/;

    /**
     * Sets the sort on x field.
     * 
     * @param value the new sort on x field
     */
    public native void setSortOnXField(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsortOnXField(value);
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
