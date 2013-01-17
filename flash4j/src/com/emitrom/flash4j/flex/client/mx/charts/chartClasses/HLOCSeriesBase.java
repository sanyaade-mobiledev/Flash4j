/************************************************************************
  HLOCSeriesBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class HLOCSeriesBase.
 */
public class HLOCSeriesBase extends Series {

    /**
     * Instantiates a new hLOC series base.
     */
    protected HLOCSeriesBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the hLOC series base
     */
    public HLOCSeriesBase() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.HLOCSeriesBase");
    }

    /**
     * Sets the close field.
     * 
     * @param value the new close field
     */
    public native void setCloseField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcloseField(value);
    }-*/;

    /**
     * Gets the close field.
     * 
     * @return the close field
     */
    public native String getCloseField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcloseField();
    }-*/;

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
     * Sets the high field.
     * 
     * @param value the new high field
     */
    public native void setHighField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethighField(value);
    }-*/;

    /**
     * Gets the high field.
     * 
     * @return the high field
     */
    public native String getHighField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethighField();
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
     * Gets the low field.
     * 
     * @return the low field
     */
    public native String getLowField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlowField();
    }-*/;

    /**
     * Sets the low field.
     * 
     * @param value the new low field
     */
    public native void setLowField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlowField(value);
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

    /**
     * Gets the open field.
     * 
     * @return the open field
     */
    public native String getOpenField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getopenField();
    }-*/;

    /**
     * Sets the open field.
     * 
     * @param value the new open field
     */
    public native void setOpenField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setopenField(value);
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
     * Sets the x field.
     * 
     * @param value the new x field
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

}
