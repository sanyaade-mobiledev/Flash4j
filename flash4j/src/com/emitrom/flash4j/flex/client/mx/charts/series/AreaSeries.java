/************************************************************************
  AreaSeries.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.StackedSeries;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AreaSeries.
 */
public class AreaSeries extends Series {

    /**
     * Instantiates a new area series.
     */
    protected AreaSeries(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the area series
     */
    public AreaSeries() {
        jsObj = Bridge.createObject("mx.charts.series.AreaSeries");
    }

    /**
     * Sets the horizontal axis.
     * 
     * @param value
     *            the new horizontal axis
     */
    public native void setHorizontalAxis(IAxis value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.sethorizontalAxis(value.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

    /**
     * Gets the min field.
     * 
     * @return the min field
     */
    public native String getMinField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminField();
    }-*/;

    /**
     * Sets the min field.
     * 
     * @param value
     *            the new min field
     */
    public native void setMinField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminField(value);
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
     * @param value
     *            the new sort on x field
     */
    public native void setSortOnXField(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsortOnXField(value);
    }-*/;

    /**
     * Gets the stacker.
     * 
     * @return the stacker
     */
    public native StackedSeries getStacker()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getstacker();
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.StackedSeries::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the stacker.
     * 
     * @param value
     *            the new stacker
     */
    public native void setStacker(StackedSeries value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setstacker(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the vertical axis.
     * 
     * @param value
     *            the new vertical axis
     */
    public native void setVerticalAxis(IAxis value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setverticalAxis(value.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

    /**
     * Sets the x field.
     * 
     * @param value
     *            the new x field
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
     * @param value
     *            the new y field
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
