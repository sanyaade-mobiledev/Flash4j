/************************************************************************
  DateTimeAxis.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.toplevel.Date;
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.NumericAxis;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class DateTimeAxis.
 */
public class DateTimeAxis extends NumericAxis {

    /**
     * Instantiates a new date time axis.
     */
    protected DateTimeAxis(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the date time axis
     */
    public DateTimeAxis() {
        jsObj = Bridge.createObject("mx.charts.DateTimeAxis");
    }

    /**
     * Align labels to unit.
     * 
     * @return true, if successful
     */
    public native boolean alignLabelsToUnit()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalignLabelsToUnit();
    }-*/;

    /**
     * Sets the align labels to unit.
     * 
     * @param value the new align labels to unit
     */
    public native void setAlignLabelsToUnit(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalignLabelsToUnit(value);
    }-*/;

    /**
     * Sets the data interval.
     * 
     * @param value the new data interval
     */
    public native void setDataInterval(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataInterval(value);
    }-*/;

    /**
     * Gets the data units.
     * 
     * @return the data units
     */
    public native String getDataUnits()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataUnits();
    }-*/;

    /**
     * Sets the data units.
     * 
     * @param value the new data units
     */
    public native void setDataUnits(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataUnits(value);
    }-*/;

    /**
     * Sets the disabled days.
     * 
     * @param values the new disabled days
     */
    public native void setDisabledDays(JsArrayString values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisabledDays(values);
    }-*/;

    /**
     * Gets the disabled days.
     * 
     * @return the disabled days
     */
    public native JsArrayString getDisabledDays()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisabledDays();
    }-*/;

    /**
     * Gets the disabled ranges.
     * 
     * @return the disabled ranges
     */
    public native JsArrayString getDisabledRanges()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisabledRanges();
    }-*/;

    /**
     * Sets the disabled ranges.
     * 
     * @param values the new disabled ranges
     */
    public native void setDisabledRanges(JsArrayString values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisabledRanges(values);
    }-*/;

    /**
     * Display local time.
     * 
     * @return true, if successful
     */
    public native boolean displayLocalTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisplayLocalTime();
    }-*/;

    /**
     * Sets the display local time.
     * 
     * @param value the new display local time
     */
    public native void setDisplayLocalTime(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisplayLocalTime(value);
    }-*/;

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
     * Gets the label units.
     * 
     * @return the label units
     */
    public native String getLabelUnits()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelUnits();
    }-*/;

    /**
     * Sets the label units.
     * 
     * @param value the new label units
     */
    public native void setLabelUnits(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelUnits(value);
    }-*/;

    /**
     * Gets the maximum.
     * 
     * @return the maximum
     */
    public native Date getMaximum()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getmaximum();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the maximum.
     * 
     * @param date the new maximum
     */
    public native void setMaximum(Date date)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setmaximum(date.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the minor tick interval.
     * 
     * @return the minor tick interval
     */
    public native double getMinorTickInterval()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminorTickInterval();
    }-*/;

    /**
     * Sets the minor tick interval.
     * 
     * @param value the new minor tick interval
     */
    public native void setMinorTickInterval(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminorTickInterval(value);
    }-*/;

    /**
     * Gets the minor tick units.
     * 
     * @return the minor tick units
     */
    public native String getMinorTickUnits()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminorTickUnits();
    }-*/;

    /**
     * Sets the minor tick units.
     * 
     * @param value the new minor tick units
     */
    public native void setMinorTickUnits(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminorTickUnits(value);
    }-*/;

}
