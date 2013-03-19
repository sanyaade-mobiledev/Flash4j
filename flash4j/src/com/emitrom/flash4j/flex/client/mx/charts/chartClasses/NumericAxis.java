/************************************************************************
  NumericAxis.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.chartClasses;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.ui.mx.AxisLabel;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * The Class NumericAxis.
 */
public class NumericAxis extends AxisBase {

    /**
     * Instantiates a new numeric axis.
     */
    protected NumericAxis(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the numeric axis
     */
    public NumericAxis() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.NumericAxis");
    }

    /**
     * Sets the auto adjust.
     * 
     * @param value the new auto adjust
     */
    public native void setAutoAdjust(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoAdjust(value);
    }-*/;

    /**
     * Auto adjust.
     * 
     * @return true, if successful
     */
    public native boolean autoAdjust()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoAdjust();
    }-*/;

    /**
     * Gets the base at zero.
     * 
     * @return the base at zero
     */
    public native boolean getBaseAtZero()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbaseAtZero();
    }-*/;

    /**
     * Sets the base at zero.
     * 
     * @param value the new base at zero
     */
    public native void setBaseAtZero(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbaseAtZero(value);
    }-*/;

    /**
     * Gets the base line.
     * 
     * @return the base line
     */
    public native double getBaseLine()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbaseLine();
    }-*/;

    /**
     * Gets the computed maximum.
     * 
     * @return the computed maximum
     */
    public native double getComputedMaximum()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcomputedMaximum();
    }-*/;

    /**
     * Sets the computed maximum.
     * 
     * @param value the new computed maximum
     */
    public native void setComputedMaximum(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcomputedMaximum(value);
    }-*/;

    /**
     * Sets the direction.
     * 
     * @param value the new direction
     */
    public native void setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public native String getDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdirection();
    }-*/;

    /**
     * Gets the minor ticks.
     * 
     * @return the minor ticks
     */
    public native JsArrayNumber getMinorTicks()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminorTicks();
    }-*/;

    /**
     * Sets the minor ticks.
     * 
     * @param values the new minor ticks
     */
    public native void setMinorTicks(JsArrayNumber values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminorTicks(values);
    }-*/;

    /**
     * Gets the padding.
     * 
     * @return the padding
     */
    public native double getPadding()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpadding();
    }-*/;

    /**
     * Sets the padding.
     * 
     * @param value the new padding
     */
    public native void setPadding(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpadding(value);
    }-*/;

    /**
     * Format for screen.
     * 
     * @param value the value
     * @return the string
     */
    public native String formatForScreen(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatForScreen(value);
    }-*/;

    /**
     * Gets the label estimate.
     * 
     * @return the label estimate
     */
    public native AxisLabelSet getLabelEstimate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getLabelEstimate();
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisLabelSet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the labels.
     * 
     * @param minimalAxisLength the minimal axis length
     * @return the labels
     */
    public native AxisLabelSet getLabels(double minimalAxisLength)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getLabels(minimalAxisLength);
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisLabelSet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Invert transform.
     * 
     * @param <T> the generic type
     * @param value the value
     * @return the t
     */
    public native <T> T invertTransform(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.invertTransform(value);
    }-*/;

    /**
     * Prefer drop labels.
     * 
     * @return true, if successful
     */
    public native boolean preferDropLabels()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.preferDropLabels();
    }-*/;

    /**
     * Reduce labels.
     * 
     * @param intervalStart the interval start
     * @param intervalEnd the interval end
     * @return the axis label set
     */
    public native AxisLabelSet reduceLabels(AxisLabel intervalStart, AxisLabel intervalEnd)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.reduceLabels(
						intervalStart.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						intervalEnd.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisLabelSet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Update.
     */
    public native void update()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.update();
    }-*/;

}
