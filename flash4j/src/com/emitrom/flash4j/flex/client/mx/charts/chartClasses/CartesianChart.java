/************************************************************************
  CartesianChart.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.ui.mx.AxisRenderer;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CartesianChart.
 */
public class CartesianChart extends ChartBase {

    /**
     * Instantiates a new cartesian chart.
     */
    protected CartesianChart(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the cartesian chart
     */
    public CartesianChart() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.CartesianChart");
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
     * Gets the horizontal axis.
     * 
     * @return the horizontal axis
     */
    public native AxisBase getHorizontalAxis()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gethorizontalAxis();
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the horizontal axis ratio.
     * 
     * @param value
     *            the new horizontal axis ratio
     */
    public native void setHorizontalAxisRatio(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalAxisRatio(value);
    }-*/;

    /**
     * Gets the horizontal axis ratio.
     * 
     * @return the horizontal axis ratio
     */
    public native double getHorizontalAxisRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalAxisRatio();
    }-*/;

    /**
     * Sets the horizontal axis renderers.
     * 
     * @param renderers
     *            the new horizontal axis renderers
     */
    public void setHorizontalAxisRenderers(List<AxisRenderer> renderers) {
        setHorizontalAxisRenderes(DataConverter.fromList(renderers));
    }

    /**
     * Sets the horizontal axis renderes.
     * 
     * @param collectionOfRenderers
     *            the new horizontal axis renderes
     */
    private void setHorizontalAxisRenderes(ArrayCollection collectionOfRenderers) {
        _setHorizontalAxisRenderes(collectionOfRenderers.toArray().getJsObj());
    }

    /**
     * Sets the horizontal axis renderes.
     * 
     * @param values
     *            the new horizontal axis renderes
     */
    private native void _setHorizontalAxisRenderes(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalAxisRenderes(values);
    }-*/;

    public native AxisBase getVerticalAxis()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getverticalAxis();
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * _set vertical axis.
     * 
     * @param value
     *            the value
     */
    public native void setVerticalAxis(IAxis value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setverticalAxis(value.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

    /**
     * Sets the vertical axis ratio.
     * 
     * @param value
     *            the new vertical axis ratio
     */
    public native void setVerticalAxisRatio(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalAxisRatio(value);
    }-*/;

    /**
     * Gets the vertical axis ratio.
     * 
     * @return the vertical axis ratio
     */
    public native double getVerticalAxisRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalAxisRatio();
    }-*/;

    /**
     * Sets the vertical axis renderers.
     * 
     * @param renderers
     *            the new vertical axis renderers
     */
    public void setVerticalAxisRenderers(List<AxisRenderer> renderers) {
        setVerticalAxisRenderers(DataConverter.fromList(renderers));
    }

    /**
     * Sets the vertical axis renderes.
     * 
     * @param collectionOfRenderers
     *            the new vertical axis renderes
     */
    private void setVerticalAxisRenderers(ArrayCollection collectionOfRenderers) {
        _setVerticalAxisRenderers(collectionOfRenderers.toArray().getJsObj());
    }

    /**
     * Sets the vertical axis renderes.
     * 
     * @param values
     *            the new vertical axis renderes
     */
    private native void _setVerticalAxisRenderers(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalAxisRenderes(values);
    }-*/;

}
