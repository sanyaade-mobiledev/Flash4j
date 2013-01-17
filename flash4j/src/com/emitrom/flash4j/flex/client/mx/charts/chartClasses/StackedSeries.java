/************************************************************************
  StackedSeries.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class StackedSeries.
 */
public class StackedSeries extends ProxyObject {

    /**
     * Instantiates a new stacked series.
     */
    protected StackedSeries(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the stacked series
     */
    public StackedSeries() {
        jsObj = Bridge.createObject("mx.chart.chartClasses.StackedSeries");
    }

    /**
     * Allow negative for stacked.
     * 
     * @return true, if successful
     */
    public native boolean allowNegativeForStacked()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowNegativeForStacked();
    }-*/;

    /**
     * Sets the allow negative for stacked.
     * 
     * @param value the new allow negative for stacked
     */
    public native void setAllowNegativeForStacked(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowNegativeForStacked(value);
    }-*/;

    /**
     * Gets the horizontal axis.
     * 
     * @return the horizontal axis
     */
    public native AxisBase getHorizontalAxis()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalAxis();
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
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
     * Gets the series.
     * 
     * @return the series
     */
    private native JavaScriptObject getSeries()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getseries();
    }-*/;

    /**
     * Sets the series.
     * 
     * @param values the new series
     */
    public void setSeries(List<Series> values) {
        setSeries(DataConverter.fromList(values));
    }

    /**
     * Sets the series.
     * 
     * @param values the new series
     */
    public void setSeries(ArrayCollection values) {
        _setSeries(values.toArray().getJsObj());
    }

    /**
     * Sets the series.
     * 
     * @param value the new series
     */
    public native void _setSeries(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setseries(values);
    }-*/;

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public native String getType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettype();
    }-*/;

    /**
     * Sets the type.
     * 
     * @param value the new type
     */
    public native void setType(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settype(value);
    }-*/;

    /**
     * Gets the vertical axis.
     * 
     * @return the vertical axis
     */
    public native AxisBase getVerticalAxis()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getverticalAxis();
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
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
     * Invalidate stacking.
     */
    public native void invalidateStacking()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidateStacking();
    }-*/;

    /**
     * Stack.
     */
    public native void stack()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stack();
    }-*/;

}
