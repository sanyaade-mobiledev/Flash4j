/************************************************************************
  PhoneFormatter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PhoneFormatter.
 */
public class PhoneFormatter extends Formatter {

    /**
     * Instantiates a new phone formatter.
     */
    protected PhoneFormatter(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the phone formatter
     */
    public PhoneFormatter() {
        jsObj = Bridge.createObject("mx.formatters.PhoneFormatter");
    }

    /**
     * Gets the area code.
     * 
     * @return the area code
     */
    public double getAreaCode() {
        return Double.parseDouble(_getAreaCode());
    }

    /**
     * _get area code.
     * 
     * @return the string
     */
    private native String _getAreaCode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getareaCode();
    }-*/;

    /**
     * Sets the area code.
     * 
     * @param value the new area code
     */
    public void setAreaCode(double value) {
        _setAreaCode(Double.toString(value));
    }

    /**
     * _set area code.
     * 
     * @param value the value
     */
    private native void _setAreaCode(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setareaCode(value);
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
     * Gets the area code format.
     * 
     * @return the area code format
     */
    public native String getAreaCodeFormat()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getareaCodeFormat();
    }-*/;

    /**
     * Sets the area code format.
     * 
     * @param value the new area code format
     */
    public native void setAreaCodeFormat(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setareaCodeFormat(value);
    }-*/;

    /**
     * Gets the valid pattern chars.
     * 
     * @return the valid pattern chars
     */
    public native String getValidPatternChars()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalidPatternChars();
    }-*/;

    /**
     * Sets the valid pattern chars.
     * 
     * @param value the new valid pattern chars
     */
    public native void setValidPatternChars(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalidPatternChars(value);
    }-*/;

}
