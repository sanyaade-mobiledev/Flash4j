/************************************************************************
  PhoneNumberValidator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class PhoneNumberValidator.
 */
public class PhoneNumberValidator extends Validator {

    private static PhoneNumberValidator INSTANCE = new PhoneNumberValidator(
                    Bridge.createObject("mx.validators.PhoneNumberValidator"));

    /**
     * Instantiates a new phone number validator.
     */
    protected PhoneNumberValidator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the phone number validator
     */
    public PhoneNumberValidator() {
        jsObj = Bridge.createObject("mx.validators.PhoneNumberValidator");
    }

    /**
     * Gets the allowed format chars.
     * 
     * @return the allowed format chars
     */
    public native String getAllowedFormatChars()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowedFormatChars();
    }-*/;

    /**
     * Sets the allowed format chars.
     * 
     * @param value the new allowed format chars
     */
    public native void setAllowedFormatChars(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowedFormatChars(value);
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
     * Gets the min digits.
     * 
     * @return the min digits
     */
    public double getMinDigits() {
        return Double.parseDouble(_getMinDigits());
    }

    /**
     * _get min digits.
     * 
     * @return the string
     */
    private native String _getMinDigits()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminDigits();
    }-*/;

    /**
     * Sets the min digits.
     * 
     * @param value the new min digits
     */
    public void setMinDigits(double value) {
        _setMinDigits(Double.toString(value));
    }

    /**
     * _set min digits.
     * 
     * @param value the value
     */
    private native void _setMinDigits(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminDigits(value);
    }-*/;

    /**
     * Gets the wrong length error.
     * 
     * @return the wrong length error
     */
    public native String getWrongLengthError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwrongLengthError();
    }-*/;

    /**
     * Sets the wrong length error.
     * 
     * @param value the new wrong length error
     */
    public native void setWrongLengthError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwrongLengthError(value);
    }-*/;

    /**
     * Validate number.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    public static List<ValidationResult> validatePhoneNumber(PhoneNumberValidator validator, Object value,
                    String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validatePhoneNumber(validator, value, baseField);
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ValidationResult(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private static PhoneNumberValidator get() {
        return INSTANCE;
    }

    /**
     * _validate currency.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    private native JavaScriptObject _validatePhoneNumber(PhoneNumberValidator validator, Object value, String baseField)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.validatePhoneNumber(
						validator.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						value, baseField);
    }-*/;

}
