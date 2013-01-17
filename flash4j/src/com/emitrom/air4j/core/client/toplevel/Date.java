/************************************************************************
  Date.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.toplevel;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Date extends ProxyObject {

    protected Date(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Date() {
        jsObj = newInstance();
    }

    public final native int getDate()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getdate();
    }-*/;

    public final native void setDate(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setdate(value);
    }-*/;

    public final native int getDateUTC()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getDateUTC();
    }-*/;

    public final native void setDateUTC(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setdateUTC(value);
    }-*/;

    public final native int getDay()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getday();
    }-*/;

    public final native void getDayUTC()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.getdayUTC();
    }-*/;

    public final native int getFullYear()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getfullYear();
    }-*/;

    public final native void setFullYear(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setfullYear(value);
    }-*/;

    public final native int getFullYearUTC()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getfullYearUTC();
    }-*/;

    public final native void setFullYearUTC(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setfullYearUTC(value);
    }-*/;

    public final native int getHours()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.gethours();
    }-*/;

    public final native void setHours(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.sethours(value);
    }-*/;

    public final native int getHoursUTC()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.gethoursUTC();
    }-*/;

    public final native void setHoursUTC(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.sethoursUTC(value);
    }-*/;

    public final native int getMilliseconds()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getmilliseconds();
    }-*/;

    public final native void setMilliseconds(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setmilliseconds(value);
    }-*/;

    public final native int getMillisecondsUTC()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getmillisecondsUTC();
    }-*/;

    public final native void setMillisecondsUTC(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setmillisecondsUTC(value);
    }-*/;

    public final native int getMinutes()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getminutes();
    }-*/;

    public final native void setMinutes(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setminutes(value);
    }-*/;

    public final native int getMinutesUTC()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getminutesUTC();
    }-*/;

    public final native void setMinutesUTC(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setminutesUTC(value);
    }-*/;

    public final native int getMonth()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getmonth();
    }-*/;

    public final native void setMonth(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setmonth(value);
    }-*/;

    public final native int getMonthUTC()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getmonthUTC();
    }-*/;

    public final native void setMonthUTC(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setmonthUTC(value);
    }-*/;

    public final native int getSeconds()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getseconds();
    }-*/;

    public final native void setSeconds(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setseconds(value);
    }-*/;

    public final native int getSecondsUTC()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getsecondsUTC();
    }-*/;

    public final native void setSecondsUTC(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setsecondsUTC(value);
    }-*/;

    public final native int getTime()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.gettime();
    }-*/;

    public final native void setTime(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.settime(value);
    }-*/;

    public final native int getTimeZoneOffset()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.gettimeZoneOffset();
    }-*/;

    public final native void setTimeZoneOffset(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.settimeZoneOffset(value);
    }-*/;

    public final native int parse(String date)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.parse(date);
    }-*/;

    private static native JavaScriptObject newInstance()/*-{
		return new $wnd.runtime.Date();
    }-*/;

}
