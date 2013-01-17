/************************************************************************
  DateField.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.Date;
import com.emitrom.flash4j.flex.client.mx.controls.listClasses.BaseListData;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class DateField.
 */
public class DateField extends UIComponent {

    /**
     * Instantiates a new date field.
     */
    DateField(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the date field
     */
    public DateField() {
        jsObj = Bridge.createObject("mx.controls.DateField");
    }

    /**
     * Gets the data.
     * 
     * @param <T> the generic type
     * @return the data
     */
    public native <T> T getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value the new data
     */
    public native void setData(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    /**
     * Gets the day names.
     * 
     * @return the day names
     */

    public native JsArrayString getDayNames()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdayNames();
    }-*/;

    /**
     * Sets the day names.
     * 
     * @param names the new day names
     */
    public native void setDayNames(JsArrayString names)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdayNames(names);
    }-*/;

    /**
     * Sets the disabled days.
     * 
     * @param days the new disabled days
     */
    public native void setDisabledDays(JavaScriptObject days)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisabledDays(days);
    }-*/;

    /**
     * Sets the disabled ranges.
     * 
     * @param ranges the new disabled ranges
     */
    public native void setDisabledRanges(JavaScriptObject ranges)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisabledRanges(ranges);
    }-*/;

    /**
     * Gets the displayed month.
     * 
     * @return the displayed month
     */
    public native int getDisplayedMonth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisplayedMonth();
    }-*/;

    /**
     * Sets the displyed month.
     * 
     * @param value the new displyed month
     */
    public native void setDisplyedMonth(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisplyedMonth(value);
    }-*/;

    /**
     * Gets the displayed year.
     * 
     * @return the displayed year
     */
    public native int getDisplayedYear()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisplayedYear();
    }-*/;

    /**
     * Sets the displayed year.
     * 
     * @param value the new displayed year
     */
    public native void setDisplayedYear(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.getdisplayedYear(value);
    }-*/;

    /**
     * Gets the drop down.
     * 
     * @return the drop down
     */
    public native DateChooser getDropDown()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdropDown();
		return @com.emitrom.flash4j.flex.client.mx.controls.DateChooser::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the first day of week.
     * 
     * @return the first day of week
     */
    public native int getFirstDayOfWeek()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfirstDayOfWeek();
    }-*/;

    /**
     * Sets the first day of week.
     * 
     * @param value the new first day of week
     */
    public native void setFirstDayOfWeek(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfirstDayOfWeek(value);
    }-*/;

    /**
     * Gets the format string.
     * 
     * @return the format string
     */
    public native String getFormatString()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getformatString();
    }-*/;

    /**
     * Sets the format string.
     * 
     * @param value the new format string
     */
    public native void setFormatString(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setformatString(value);
    }-*/;

    /**
     * Sets the list data.
     * 
     * @param value the new list data
     */
    public native void setListData(BaseListData value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setlistData(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the max year.
     * 
     * @return the max year
     */
    public native int getMaxYear()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxYear();
    }-*/;

    /**
     * Sets the max year.
     * 
     * @param value the new max year
     */
    public native void setMaxYear(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxYear(value);
    }-*/;

    /**
     * Gets the min year.
     * 
     * @return the min year
     */
    public native int getMinYear()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminYear();
    }-*/;

    /**
     * Sets the min year.
     * 
     * @param value the new min year
     */
    public native void setMinYear(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminYear(value);
    }-*/;

    /**
     * Gets the selected date.
     * 
     * @return the selected date
     */
    public native Date getSelectedDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the selected date.
     * 
     * @param value the new selected date
     */
    public native void setSelectedDate(Date value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setselectedDate(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the month names.
     * 
     * @return the month names
     */
    public native JsArrayString getMonthNames()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmonthNames();
    }-*/;

    /**
     * Sets the month names.
     * 
     * @param names the new month names
     */
    public native void setMonthNames(JsArrayString names)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmonthNames(names);
    }-*/;

    /**
     * Gets the month symbol.
     * 
     * @return the month symbol
     */
    public native String getMonthSymbol()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmonthSymbol();
    }-*/;

    /**
     * Sets the month symbol.
     * 
     * @param value the new month symbol
     */
    public native void setMonthSymbol(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmonthSymbol(value);
    }-*/;

    /**
     * Sets the selectable range.
     * 
     * @param value the new selectable range
     */
    public native void setSelectableRange(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectableRange(value);
    }-*/;

    /**
     * Show to day.
     * 
     * @return true, if successful
     */
    public native boolean showToDay()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowToDay();
    }-*/;

    /**
     * Sets the show to day.
     * 
     * @param value the new show to day
     */
    public native void setShowToDay(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowToDay(value);
    }-*/;

    /**
     * Gets the year symbol.
     * 
     * @return the year symbol
     */
    public native String getYearSymbol()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyearSymbol();
    }-*/;

    /**
     * Sets the year symbol.
     * 
     * @param value the new year symbol
     */
    public native void setYearSymbol(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyearSymbol(value);
    }-*/;

    /**
     * Checks if is year navigation enabled.
     * 
     * @return true, if is year navigation enabled
     */
    public native boolean isYearNavigationEnabled()/*-{
		return peer.getyearNavigationEnabled();
    }-*/;

    /**
     * Sets the year navigation enabled.
     * 
     * @param value the new year navigation enabled
     */
    public native void setYearNavigationEnabled(boolean value)/*-{
		peer.setyearNavigationEnabled(value);
    }-*/;

}
