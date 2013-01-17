/************************************************************************
  BarSet.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.StackedSeries;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class BarSet.
 */
public class BarSet extends StackedSeries {

    /**
     * Instantiates a new bar set.
     */
    protected BarSet(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the bar set
     */
    public BarSet() {
        jsObj = Bridge.createObject("mx.charts.series.BarSet");
    }

    /**
     * Gets the max bar width.
     * 
     * @return the max bar width
     */
    public native double getMaxBarWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxBarWidth();
    }-*/;

    /**
     * Sets the max bar width.
     * 
     * @param value the new max bar width
     */
    public native void setMaxBarWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxBarWidth(value);
    }-*/;

    /**
     * Gets the offset.
     * 
     * @return the offset
     */
    public native double getOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoffset();
    }-*/;

    /**
     * Sets the offset.
     * 
     * @param value the new offset
     */
    public native void setOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setoffset(value);
    }-*/;

    /**
     * Gets the bar width ratio.
     * 
     * @return the bar width ratio
     */
    public native double getBarWidthRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbarWidthRatio();
    }-*/;

    /**
     * Sets the bar width ratio.
     * 
     * @param value the new bar width ratio
     */
    public native void setBarWidthRatio(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbarWidthRatio(value);
    }-*/;

}
