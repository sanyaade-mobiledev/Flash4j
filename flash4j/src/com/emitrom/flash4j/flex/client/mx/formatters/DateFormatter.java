/************************************************************************
  DateFormatter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.formatters;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.Date;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DateFormatter.
 */
public class DateFormatter extends Formatter {

    private static final DateFormatter INSTANCE = new DateFormatter();

    /**
     * Instantiates a new date formatter.
     */
    protected DateFormatter(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the date formatter
     */
    public DateFormatter() {
        jsObj = Bridge.createObject("mx.formatters.DateFormatter");
    }

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
     * Parses the date string.
     * 
     * @param str the str
     * @return the date
     */
    public static Date parseDateString(String str) {
        return INSTANCE._parseDateString(str);
    }

    /**
     * _parse date string.
     * 
     * @param str the str
     * @return the date
     */
    private native Date _parseDateString(String str)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.parseDateString(str);
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
