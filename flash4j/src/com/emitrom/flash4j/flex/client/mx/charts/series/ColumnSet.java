/************************************************************************
  ColumnSet.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class ColumnSet.
 */
public class ColumnSet extends StackedSeries {

    /**
     * Instantiates a new column set.
     */
    protected ColumnSet(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the column set
     */
    public ColumnSet() {
        jsObj = Bridge.createObject("mx.charts.series.ColumnSet");
    }

    /**
     * Gets the column width ratio.
     * 
     * @return the column width ratio
     */
    public native double getColumnWidthRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolumnWidthRatio();
    }-*/;

    /**
     * Sets the column width ratio.
     * 
     * @param value the new column width ratio
     */
    public native void setColumnWidthRatio(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolumnWidthRatio(value);
    }-*/;

    /**
     * Gets the max column width.
     * 
     * @return the max column width
     */
    public native double getMaxColumnWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxColumnWidth();
    }-*/;

    /**
     * Sets the max column width.
     * 
     * @param value the new max column width
     */
    public native void setMaxColumnWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxColumnWidth(value);
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

}
