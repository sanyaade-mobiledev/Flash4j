/************************************************************************
  AxisBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AxisBase.
 */
public class AxisBase extends EventDispatcher implements IAxis {

    /**
     * Instantiates a new axis base.
     */
    protected AxisBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instace.
     * 
     * @return the axis base
     */
    public AxisBase() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.AxisBase");
    }

    public void setChartDataProvider(ArrayCollection provider) {
        setChartDataProvider(provider.toArray().getJsObj());
    }

    public void setChartDataProvider(As3Array provider) {
        setChartDataProvider(provider.getJsObj());
    }

    /**
     * Sets the chart data provider.
     * 
     * @param value
     *            the new chart data provider
     */
    public native void setChartDataProvider(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setchartDataProvider(value);
    }-*/;

    /**
     * Sets the display name.
     * 
     * @param value
     *            the new display name
     */
    public native void setDisplayName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisplayName(value);
    }-*/;

    /**
     * Gets the display name.
     * 
     * @return the display name
     */
    public native String getDisplayName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisplayName();
    }-*/;

    /**
     * Sets the title.
     * 
     * @param value
     *            the new title
     */
    public native void setTitle(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settitle(value);
    }-*/;

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public native String getTitle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettitle();
    }-*/;

    /**
     * Gets the unit size.
     * 
     * @return the unit size
     */
    public native double getUnitSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getunitSize();
    }-*/;

    /**
     * Datachanged.
     */
    public native void datachanged()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.datachanged();
    }-*/;

    /**
     * Register data transform.
     * 
     * @param transform
     *            the transform
     * @param dimensionName
     *            the dimension name
     */
    public native void registerDataTransform(DataTransform transform, String dimensionName)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.registerDataTransform(
						transform.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						dimensionName);
    }-*/;

    /**
     * Unregister data transform.
     * 
     * @param transform
     *            the transform
     * @param dimensionName
     *            the dimension name
     */
    public native void unregisterDataTransform(DataTransform transform, String dimensionName)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.unregisterDataTransform(
						transform.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						dimensionName);
    }-*/;

    /**
     * Update.
     */
    public native void update()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.update();
    }-*/;

    /**
     * Gets the baseline.
     * 
     * @return the baseline
     */
    public native double getBaseline()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbaseline();
    }-*/;

    /**
     * Data changed.
     */
    public native void dataChanged()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.dataChanged();
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
     * @param minimumAxisLength
     *            the minimum axis length
     * @return the labels
     */
    public native AxisLabelSet getLabels(double minimumAxisLength)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getLabels(minimumAxisLength);
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisLabelSet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Invert transform.
     * 
     * @param <T>
     *            the generic type
     * @param value
     *            the value
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
     * @param intervalStart
     *            the interval start
     * @param intervalEnd
     *            the interval end
     * @return the axis label set
     */
    public native AxisLabelSet reduceLabels(AxisLabelSet intervalStart, AxisLabelSet intervalEnd)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.reduceLabels(
						intervalStart.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						intervalEnd.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisLabelSet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    @Override
    public JavaScriptObject asIAxis() {
        return jsObj.cast();
    }

}
