/************************************************************************
  NumberBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class NumberBase.
 */
public class NumberBase extends ProxyObject {

    /**
     * Instantiates a new number base.
     */
    protected NumberBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the number base
     */
    public NumberBase() {
        jsObj = Bridge.createObject("mx.formatters.NumberBase");
        setDecimalSeparatorFrom(".");
        setDecimalSeparatorTo(".");
        setThousandsSeparatorFrom(",");
        setThousandsSeparatorTo(",");

    }

    /**
     * Gets the decimal separator from.
     * 
     * @return the decimal separator from
     */
    public native String getDecimalSeparatorFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdecimalSeparatorFrom();
    }-*/;

    /**
     * Sets the decimal separator from.
     * 
     * @param value the new decimal separator from
     */
    public native void setDecimalSeparatorFrom(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdecimalSeparatorFrom(value);
    }-*/;

    /**
     * Gets the decimal separator to.
     * 
     * @return the decimal separator to
     */
    public native String getDecimalSeparatorTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdecimalSeparatorTo();
    }-*/;

    /**
     * Sets the decimal separator to.
     * 
     * @param value the new decimal separator to
     */
    public native void setDecimalSeparatorTo(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdecimalSeparatorTo(value);
    }-*/;

    /**
     * Checks if is valid.
     * 
     * @return true, if is valid
     */
    public native boolean isValid()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisValid();
    }-*/;

    /**
     * Sets the checks if is valid.
     * 
     * @param value the new checks if is valid
     */
    public native void setIsValid(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setisValid(value);
    }-*/;

    /**
     * Gets the thousands separator from.
     * 
     * @return the thousands separator from
     */

    public native String getThousandsSeparatorFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getthousandsSeparatorFrom();
    }-*/;

    /**
     * Sets the thousands separator from.
     * 
     * @param value the new thousands separator from
     */
    public native void setThousandsSeparatorFrom(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setthousandsSeparatorFrom(value);
    }-*/;

    /**
     * Gets the thousands separator to.
     * 
     * @return the thousands separator to
     */
    public native String getThousandsSeparatorTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getthousandsSeparatorTo();
    }-*/;

    /**
     * Sets the thousands separator to.
     * 
     * @param value the new thousands separator to
     */
    public native void setThousandsSeparatorTo(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setthousandsSeparatorTo(value);
    }-*/;

    /**
     * Expand exponents.
     * 
     * @param value the value
     * @return the string
     */
    public native String expandExponents(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.expandExponents(value);
    }-*/;

    /**
     * Format decimal.
     * 
     * @param value the value
     * @return the string
     */
    public native String formatDecimal(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatDecimal(value);
    }-*/;

    /**
     * Format negative.
     * 
     * @param value the value
     * @return the string
     */
    public native String formatNegative(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatNegative(value);
    }-*/;

    /**
     * Format negative.
     * 
     * @param value the value
     * @param useSign the use sign
     * @return the string
     */
    public native String formatNegative(String value, boolean useSign)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatNegative(value, useSign);
    }-*/;

    /**
     * Format precision.
     * 
     * @param value the value
     * @param precision the precision
     * @return the string
     */
    public native String formatPrecision(String value, int precision)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatPrecision(value, precision);
    }-*/;

    /**
     * Format rounding.
     * 
     * @param value the value
     * @param type the type
     * @return the string
     */
    public String formatRounding(String value, NumberBaseRoundType type) {
        return _formatRounding(value, type.value);
    }

    /**
     * _format rounding.
     * 
     * @param value the value
     * @param roundingType the rounding type
     * @return the string
     */
    private native String _formatRounding(String value, String roundingType)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatRounding(value, roundingType);
    }-*/;

    /**
     * Format rounding with precision.
     * 
     * @param value the value
     * @param type the type
     * @param precision the precision
     * @return the string
     */
    public String formatRoundingWithPrecision(String value, NumberBaseRoundType type, int precision) {
        return _formatRoundingWithPrecision(value, type.value, precision);
    }

    /**
     * _format rounding with precision.
     * 
     * @param value the value
     * @param roundingType the rounding type
     * @param precision the precision
     * @return the string
     */
    private native String _formatRoundingWithPrecision(String value, String roundingType, int precision)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatRoundingWithPrecision(value, roundingType, precision);
    }-*/;

    /**
     * Format thousands.
     * 
     * @param value the value
     * @return the string
     */
    public native String formatThousands(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatThousands(value);
    }-*/;

    /**
     * Parses the number string.
     * 
     * @param str the str
     * @return the string
     */
    public native String parseNumberString(String str)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.parseNumberString(str);
    }-*/;

}
