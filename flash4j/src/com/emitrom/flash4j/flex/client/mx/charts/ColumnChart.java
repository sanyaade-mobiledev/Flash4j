/************************************************************************
  ColumnChart.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.CartesianChart;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ColumnChart.
 */
public class ColumnChart extends CartesianChart {

    /**
     * Instantiates a new column chart.
     */
    protected ColumnChart(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the column chart
     */
    public ColumnChart() {
        jsObj = Bridge.createObject("mx.charts.ColumnChart");
    }

    /**
     * Extend label to end.
     * 
     * @return true, if successful
     */
    public native boolean extendLabelToEnd()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getextendLabelToEnd();
    }-*/;

    /**
     * Sets the extend label to end.
     * 
     * @param value the new extend label to end
     */
    public native void setExtendLabelToEnd(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setextendLabelToEnd(value);
    }-*/;

    /**
     * Gets the max label width.
     * 
     * @return the max label width
     */
    public native int getMaxLabelWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxLabelWidth();
    }-*/;

    /**
     * Sets the max label width.
     * 
     * @param value the new max label width
     */
    public native void setMaxLabelWidth(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxLabelWidth(value);
    }-*/;

    /**
     * Show label vertically.
     * 
     * @return true, if successful
     */
    public native boolean showLabelVertically()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowLabelVertically();
    }-*/;

    /**
     * Sets the show label vertically.
     * 
     * @param value the new show label vertically
     */
    public native void setShowLabelVertically(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowLabelVertically(value);
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

}
