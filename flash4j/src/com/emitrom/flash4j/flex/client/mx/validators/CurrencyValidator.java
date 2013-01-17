/************************************************************************
  CurrencyValidator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.validators;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CurrencyValidator.
 */
public class CurrencyValidator extends Validator {

    private static final CurrencyValidator INSTANCE = new CurrencyValidator(
                    Bridge.createObject("mx.validators.CurrencyValidator"));

    /**
     * Instantiates a new currency validator.
     */
    protected CurrencyValidator(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static CurrencyValidator get() {
        return INSTANCE;
    }

    /**
     * New instance.
     * 
     * @return the currency validator
     */
    public CurrencyValidator() {
        jsObj = Bridge.createObject("mx.validators.CurrencyValidator");
    }

    /**
     * Gets the align symbol.
     * 
     * @return the align symbol
     */
    public CurrencyValidatorAlignSymbol getAlignSymbol() {
        return CurrencyValidatorAlignSymbol.fromValue(_getAlignSymbol());
    }

    /**
     * _get align symbol.
     * 
     * @return the string
     */
    private native String _getAlignSymbol()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalignSymbol();
    }-*/;

    /**
     * Sets the align symbol.
     * 
     * @param symbol the new align symbol
     */
    public void setAlignSymbol(CurrencyValidatorAlignSymbol symbol) {
        _setAlignSymbol(symbol.value);
    }

    /**
     * _set align symbol.
     * 
     * @param value the value
     */
    private native void _setAlignSymbol(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalignSymbol(value);
    }-*/;

    /**
     * Allow negative.
     * 
     * @return true, if successful
     */
    public native boolean allowNegative()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowNegative();
    }-*/;

    /**
     * Sets the allow negative.
     * 
     * @param value the new allow negative
     */
    public native void setAllowNegative(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowNegative(value);
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
     * Gets the currency symbol error.
     * 
     * @return the currency symbol error
     */
    public native String getCurrencySymbolError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrencySymbolError();
    }-*/;

    /**
     * Sets the currency symbol error.
     * 
     * @param value the new currency symbol error
     */
    public native void setCurrencySymbolError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcurrencySymbolError(value);
    }-*/;

    /**
     * Gets the decimal point count error.
     * 
     * @return the decimal point count error
     */
    public native String getDecimalPointCountError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdecimalPointCountError();
    }-*/;

    /**
     * Sets the decimal point count error.
     * 
     * @param value the new decimal point count error
     */
    public native void setDecimalPointCountError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdecimalPointCountError(value);
    }-*/;

    /**
     * Gets the decimal separator.
     * 
     * @return the decimal separator
     */
    public native String getDecimalSeparator()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdecimalSeparator();
    }-*/;

    /**
     * Sets the decimal separator.
     * 
     * @param value the new decimal separator
     */
    public native void setDecimalSeparator(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdecimalSeparator(value);
    }-*/;

    /**
     * Gets the exceeds max error.
     * 
     * @return the exceeds max error
     */
    public native String getExceedsMaxError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexceedsMaxError();
    }-*/;

    /**
     * Sets the exceeds max error.
     * 
     * @param value the new exceeds max error
     */
    public native void setExceedsMaxError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexceedsMaxError(value);
    }-*/;

    /**
     * Gets the invalid char error.
     * 
     * @return the invalid char error
     */
    public native String getInvalidCharError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinvalidCharError();
    }-*/;

    /**
     * Sets the invalid char error.
     * 
     * @param value the new invalid char error
     */
    public native void setInvalidCharError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinvalidCharError(value);
    }-*/;

    /**
     * Gets the invalid format chars error.
     * 
     * @return the invalid format chars error
     */
    public native String getInvalidFormatCharsError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinvalidFormatCharsError();
    }-*/;

    /**
     * Sets the invalid format chars error.
     * 
     * @param value the new invalid format chars error
     */
    public native void setInvalidFormatCharsError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinvalidFormatCharsError(value);
    }-*/;

    /**
     * Gets the lower than min error.
     * 
     * @return the lower than min error
     */
    public native String getLowerThanMinError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlowerThanMinError();
    }-*/;

    /**
     * Sets the lower than min error.
     * 
     * @param value the new lower than min error
     */
    public native void setLowerThanMinError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlowerThanMinError(value);
    }-*/;

    /**
     * Gets the max value.
     * 
     * @param <T> the generic type
     * @return the max value
     */
    public native <T> T getMaxValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxValue();
    }-*/;

    /**
     * Sets the max value.
     * 
     * @param value the new max value
     */
    public native void setMaxValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxValue(value);
    }-*/;

    /**
     * Gets the min value.
     * 
     * @param <T> the generic type
     * @return the min value
     */
    public native <T> T getMinValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminValue();
    }-*/;

    /**
     * Sets the min value.
     * 
     * @param value the new min value
     */
    public native void setMinValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminValue(value);
    }-*/;

    /**
     * Gets the negativ error.
     * 
     * @return the negativ error
     */
    public native String getNegativError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnegativError();
    }-*/;

    /**
     * Sets the negativ error.
     * 
     * @param value the new negativ error
     */
    public native void setNegativError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnegativError(value);
    }-*/;

    /**
     * Sets the precison.
     * 
     * @param value the new precison
     */
    public native void setPrecison(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprecison(value);
    }-*/;

    /**
     * Gets the separation error.
     * 
     * @return the separation error
     */
    public native String getSeparationError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getseparationError();
    }-*/;

    /**
     * Sets the separation error.
     * 
     * @param value the new separation error
     */
    public native void setSeparationError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setseparationError(value);
    }-*/;

    /**
     * Gets the thousands separator.
     * 
     * @return the thousands separator
     */
    public native String getThousandsSeparator()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getthousandsSeparator();
    }-*/;

    /**
     * Sets the thousands separator.
     * 
     * @param value the new thousands separator
     */
    public native void setThousandsSeparator(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setthousandsSeparator(value);
    }-*/;

    /**
     * Validate currency.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    public static List<ValidationResult> validateCurrency(CurrencyValidator validator, ProxyObject value,
                    String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateCurrency(validator, value.getJsObj(), baseField);
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ValidationResult(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    /**
     * Validate currency.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    public static List<ValidationResult> validateCurrency(CurrencyValidator validator, Object value, String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateCurrency(validator, value, baseField);
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ValidationResult(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    /**
     * _validate currency.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    private native JavaScriptObject _validateCurrency(CurrencyValidator validator, Object value, String baseField)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.validateCurrency(
						validator.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						value, baseField);
    }-*/;

}
