/************************************************************************
  ZipCodeValidator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class ZipCodeValidator.
 */
public class ZipCodeValidator extends Validator {

    private static ZipCodeValidator INSTANCE = new ZipCodeValidator(
                    Bridge.createObject("mx.validators.ZipCodeValidator"));

    /**
     * Instantiates a new zip code validator.
     */
    protected ZipCodeValidator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the zip code validator
     */
    public ZipCodeValidator() {
        jsObj = Bridge.createObject("mx.validators.ZipCodeValidator");
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
     * Gets the domain.
     * 
     * @return the domain
     */
    public ZipCodeValidatorDomainType getDomain() {
        return ZipCodeValidatorDomainType.fromValue(_getDomain());
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
    public void setDomain(ZipCodeValidatorDomainType domain) {
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
     * Gets the invalid domain error.
     * 
     * @return the invalid domain error
     */
    public native String getInvalidDomainError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinvalidDomainError();
    }-*/;

    /**
     * Sets the invalid domain error.
     * 
     * @param value the new invalid domain error
     */
    public native void setInvalidDomainError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinvalidDomainError(value);
    }-*/;

    /**
     * Gets the wrong ca format error.
     * 
     * @return the wrong ca format error
     */
    public native String getWrongCAFormatError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwrongCAFormatError();
    }-*/;

    /**
     * Sets the wrong ca format error.
     * 
     * @param value the new wrong ca format error
     */
    public native void setWrongCAFormatError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwrongCAFormatError(value);
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
     * Gets the wrong us format error.
     * 
     * @return the wrong us format error
     */
    public native String getWrongUSFormatError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwrongUSFormatError();
    }-*/;

    /**
     * Sets the wrong us format error.
     * 
     * @param value the new wrong us format error
     */
    public native void setWrongUSFormatError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwrongUSFormatError(value);
    }-*/;

    /**
     * Validate number.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    public static List<ValidationResult> validateZipCode(PhoneNumberValidator validator, Object value, String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateZipCode(validator, value, baseField);
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ValidationResult(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private static ZipCodeValidator get() {
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
    private native JavaScriptObject _validateZipCode(PhoneNumberValidator validator, Object value, String baseField)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.validateZipCode(
						validator.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						value, baseField);
    }-*/;
}
