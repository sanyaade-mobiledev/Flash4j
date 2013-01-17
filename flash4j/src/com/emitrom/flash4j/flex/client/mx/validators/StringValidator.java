/************************************************************************
  StringValidator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class StringValidator.
 */
public class StringValidator extends Validator {

    private static StringValidator INSTANCE = new StringValidator(Bridge.createObject("mx.validators.StringValidator"));

    /**
     * Instantiates a new string validator.
     */
    protected StringValidator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the string validator
     */
    public StringValidator() {
        jsObj = Bridge.createObject("mx.validators.StringValidator");
    }

    /**
     * Gets the max length.
     * 
     * @return the max length
     */
    public double getMaxLength() {
        return Double.parseDouble(_getMaxLength());
    }

    /**
     * _get max length.
     * 
     * @return the string
     */
    private native String _getMaxLength()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxLength();
    }-*/;

    /**
     * Sets the max length.
     * 
     * @param value the new max length
     */
    public void setMaxLength(double value) {
        _setMaxLength(Double.toString(value));
    }

    /**
     * _set max length.
     * 
     * @param value the value
     */
    private native void _setMaxLength(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxLength(value);
    }-*/;

    /**
     * Gets the min length.
     * 
     * @return the min length
     */
    public double getMinLength() {
        return Double.parseDouble(_getMinLength());
    }

    /**
     * _get min length.
     * 
     * @return the string
     */
    private native String _getMinLength()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminLength();
    }-*/;

    /**
     * Sets the min length.
     * 
     * @param value the new min length
     */
    public void setMinLength(double value) {
        _setMinLength(Double.toString(value));
    }

    /**
     * _set min length.
     * 
     * @param value the value
     */
    private native void _setMinLength(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminLength(value);
    }-*/;

    /**
     * Gets the too long error.
     * 
     * @return the too long error
     */
    public native String getTooLongError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettooLongError();
    }-*/;

    /**
     * Sets the too long error.
     * 
     * @param value the new too long error
     */
    public native void setTooLongError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settooLongError(value);
    }-*/;

    /**
     * Gets the too short error.
     * 
     * @return the too short error
     */
    public native String getTooShortError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettooShortError();
    }-*/;

    /**
     * Sets the too short error.
     * 
     * @param value the new too short error
     */
    public native void setTooShortError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settooShortError(value);
    }-*/;

    /**
     * Validate number.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    public static List<ValidationResult> validateString(PhoneNumberValidator validator, Object value, String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateString(validator, value, baseField);
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ValidationResult(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private static StringValidator get() {
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
    private native JavaScriptObject _validateString(PhoneNumberValidator validator, Object value, String baseField)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.validateString(
						validator.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						value, baseField);
    }-*/;

}
