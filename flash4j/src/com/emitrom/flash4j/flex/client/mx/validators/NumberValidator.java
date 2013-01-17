/************************************************************************
  NumberValidator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class NumberValidator.
 */
public class NumberValidator extends Validator {

    private static NumberValidator INSTANCE = new NumberValidator(Bridge.createObject("mx.validators.NumberValidator"));

    /**
     * Instantiates a new number validator.
     */
    protected NumberValidator(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static NumberValidator get() {
        return INSTANCE;
    }

    /**
     * New instance.
     * 
     * @return the number validator
     */
    public NumberValidator() {
        jsObj = Bridge.createObject("mx.validators.NumberValidator");
    }

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
    public void setAllowNegative(boolean value) {
        _setAllowNegative(Boolean.toString(value));
    }

    /**
     * _set allow negative.
     * 
     * @param value the value
     */
    private native void _setAllowNegative(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowNegative(value);
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
     * Gets the domain.
     * 
     * @return the domain
     */
    public NumberValidatorDomainType getDomain() {
        return NumberValidatorDomainType.fromValue(_getDomain());
    }

    /**
     * _get domain.
     * 
     * @return the string
     */
    private native String _getDomain()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdomain();
    }-*/;

    /**
     * Sets the domain.
     * 
     * @param domain the new domain
     */
    public void setDomain(NumberValidatorDomainType domain) {
        _setDomain(domain.value);
    }

    /**
     * _set domain.
     * 
     * @param value the value
     */
    private native void _setDomain(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdomain(value);
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
     * Gets the integer error.
     * 
     * @return the integer error
     */
    public native String getIntegerError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getintegerError();
    }-*/;

    /**
     * Sets the integer error.
     * 
     * @param value the new integer error
     */
    public native void setIntegerError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setintegerError(value);
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
     * @return the max value
     */
    public double getMaxValue() {
        return Double.parseDouble(_getMaxValue());
    }

    /**
     * _get max value.
     * 
     * @return the string
     */
    private native String _getMaxValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxValue();
    }-*/;

    /**
     * Sets the max value.
     * 
     * @param value the new max value
     */
    public void setMaxValue(double value) {
        _setMaxValue(Double.toString(value));
    }

    /**
     * _set max value.
     * 
     * @param value the value
     */
    private native void _setMaxValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxValue(value);
    }-*/;

    /**
     * Gets the min value.
     * 
     * @return the min value
     */
    public double getMinValue() {
        return Double.parseDouble(_getMinValue());
    }

    /**
     * _get min value.
     * 
     * @return the string
     */
    private native String _getMinValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminValue();
    }-*/;

    /**
     * Sets the min value.
     * 
     * @param value the new min value
     */
    public void setMinValue(double value) {
        _setMinValue(Double.toString(value));
    }

    /**
     * _set min value.
     * 
     * @param value the value
     */
    private native void _setMinValue(Object value)/*-{
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
     * Gets the precision.
     * 
     * @param <T> the generic type
     * @return the precision
     */
    public native <T> T getPrecision()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getprecision();
    }-*/;

    /**
     * Sets the precison.
     * 
     * @param value the new precison
     */
    public native void setPrecison(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sepPrecison(value);
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
     * Validate number.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    public static List<ValidationResult> validateNumder(NumberValidator validator, Object value, String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateNumder(validator, value, baseField);
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
    private native JavaScriptObject _validateNumder(NumberValidator validator, Object value, String baseField)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.validateNumder(
						validator.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						value, baseField);
    }-*/;
}
