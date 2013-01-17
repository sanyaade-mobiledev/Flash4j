/************************************************************************
  PolarChart.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PolarChart.
 */
public class PolarChart extends ChartBase {

    /**
     * Instantiates a new polar chart.
     */
    protected PolarChart(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the polar chart
     */
    public PolarChart() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.PolarChart");
    }

    /**
     * Gets the angular axis.
     * 
     * @return the angular axis
     */
    public native AxisBase getAngularAxis()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getangularAxis();
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the angular axis.
     * 
     * @param axis the new angular axis
     */
    private native void setAngularAxis(IAxis axis)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setangularAxis(axis.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

    /**
     * Gets the radial axis.
     * 
     * @return the radial axis
     */
    native AxisBase getRadialAxis()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getradialAxis();
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the radial axis.
     * 
     * @param axis the new radial axis
     */
    private native void setRadialAxis(IAxis axis)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setradialAxis(axis.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

}
