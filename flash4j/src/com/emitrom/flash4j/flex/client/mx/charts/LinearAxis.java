/************************************************************************
  LinearAxis.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.NumericAxis;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class LinearAxis.
 */
public class LinearAxis extends NumericAxis {

    /**
     * Instantiates a new linear axis.
     */
    protected LinearAxis(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the linear axis
     */
    public LinearAxis() {
        jsObj = Bridge.createObject("mx.charts.LinearAxis");
    }

    /**
     * Gets the interval.
     * 
     * @return the interval
     */
    public native double getInterval()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinterval();
    }-*/;

    /**
     * Sets the interval.
     * 
     * @param value the new interval
     */
    public native void setInterval(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinterval(value);
    }-*/;

    /**
     * Gets the maximum.
     * 
     * @return the maximum
     */
    public native double getMaximum()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaximum();
    }-*/;

    /**
     * Sets the maximum.
     * 
     * @param value the new maximum
     */
    public native void setMaximum(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaximum(value);
    }-*/;

    /**
     * Gets the maximum label precision.
     * 
     * @return the maximum label precision
     */
    public native double getMaximumLabelPrecision()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaximumLabelPrecision();
    }-*/;

    /**
     * Sets the maximum label precision.
     * 
     * @param value the new maximum label precision
     */
    public native void setMaximumLabelPrecision(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaximumLabelPrecision(value);
    }-*/;

    /**
     * Gets the minimum.
     * 
     * @return the minimum
     */
    public native double getMinimum()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminimum();
    }-*/;

    /**
     * Sets the minimun.
     * 
     * @param value the new minimun
     */
    public native void setMinimun(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminimun(value);
    }-*/;

    /**
     * Gets the minor interval.
     * 
     * @return the minor interval
     */
    public native double getMinorInterval()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminorInterval();
    }-*/;

    /**
     * Sets the minor interval.
     * 
     * @param value the new minor interval
     */
    public native void setMinorInterval(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminorInterval(value);
    }-*/;

}
