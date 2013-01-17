/************************************************************************
  CurrencyFormatter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class CurrencyFormatter.
 */
public class CurrencyFormatter extends Formatter {

    /**
     * Instantiates a new currency formatter.
     */
    protected CurrencyFormatter(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the currency formatter
     */
    public CurrencyFormatter() {
        jsObj = Bridge.createObject("mx.formatters.CurrencyFormatter");
    }

    /**
     * Gets the align symbol.
     * 
     * @return the align symbol
     */
    public native String getAlignSymbol()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalignSymbol();
    }-*/;

    /**
     * Sets the align symbol.
     * 
     * @param value the new align symbol
     */
    public native void setAlignSymbol(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalignSymbol(value);
    }-*/;

    /**
     * Gets the currency symbol.
     * 
     * @return the currency symbol
     */
    public native String getCurrencySymbol()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrencySymbol();
    }-*/;

    /**
     * Sets the currency symbol.
     * 
     * @param value the new currency symbol
     */
    public native void setCurrencySymbol(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcurrencySymbol(value);
    }-*/;

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
     * Gets the precision.
     * 
     * @return the precision
     */
    public int getPrecision() {
        return Integer.parseInt(_getPrecision());
    }

    /**
     * _get precision.
     * 
     * @return the string
     */
    private native String _getPrecision()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getprecision();
    }-*/;

    /**
     * Sets the precision.
     * 
     * @param value the new precision
     */
    public void setPrecision(int value) {
        _setPrecision(Integer.toString(value));
    }

    /**
     * _set precision.
     * 
     * @param value the value
     */
    private native void _setPrecision(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprecision(value);
    }-*/;

    /**
     * Gets the rounding.
     * 
     * @return the rounding
     */
    public NumberBaseRoundType getRounding() {
        return NumberBaseRoundType.fromValue(_getRounding());
    }

    /**
     * _get rounding.
     * 
     * @return the string
     */
    private native String _getRounding()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrounding();
    }-*/;

    /**
     * Sets the rounding.
     * 
     * @param rounding the new rounding
     */
    public void setRounding(NumberBaseRoundType rounding) {
        _setRounding(rounding.value);
    }

    /**
     * _set rounding.
     * 
     * @param value the value
     */
    private native void _setRounding(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrounding(value);
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
     * Use negative sign.
     * 
     * @param <T> the generic type
     * @return the t
     */
    public boolean useNegativeSign() {
        return Boolean.valueOf(_useNegativeSign());
    }

    private native String _useNegativeSign()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getuseNegativeSign();
    }-*/;

    /**
     * Sets the use negative sign.
     * 
     * @param value the new use negative sign
     */
    public void setUseNegativeSign(boolean value) {
        _setUseNegativeSign(Boolean.toString(value));
    }

    /**
     * _set use negative sign.
     * 
     * @param value the value
     */
    private native void _setUseNegativeSign(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setuseNegativeSign(value);
    }-*/;

    /**
     * Use thousands separator.
     * 
     * @param <T> the generic type
     * @return the t
     */
    public boolean useThousandsSeparator() {
        return Boolean.valueOf(_useThousandsSeparator());
    }

    private native String _useThousandsSeparator()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getuseThousandsSeparator();
    }-*/;

    /**
     * Sets the use thousands separator.
     * 
     * @param value the new use thousands separator
     */
    public void setUseThousandsSeparator(boolean value) {
        _setUseThousandsSeparator(Boolean.toString(value));
    }

    /**
     * _set use thousands separator.
     * 
     * @param value the value
     */
    private native void _setUseThousandsSeparator(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setuseThousandsSeparator(value);
    }-*/;

}
