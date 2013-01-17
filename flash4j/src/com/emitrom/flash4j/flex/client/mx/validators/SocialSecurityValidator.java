/************************************************************************
  SocialSecurityValidator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class SocialSecurityValidator.
 */
public class SocialSecurityValidator extends Validator {

    private static SocialSecurityValidator INSTANCE = new SocialSecurityValidator(
                    Bridge.createObject("mx.validators.SocialSecurityValidator"));

    /**
     * Instantiates a new social security validator.
     */
    protected SocialSecurityValidator(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static SocialSecurityValidator get() {
        return INSTANCE;
    }

    /**
     * New instance.
     * 
     * @return the social security validator
     */
    public SocialSecurityValidator() {
        jsObj = Bridge.createObject("mx.validators.SocialSecurityValidator");
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
     * Gets the wrong format error.
     * 
     * @return the wrong format error
     */
    public native String getWrongFormatError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwrongFormatError();
    }-*/;

    /**
     * Sets the wrong format error.
     * 
     * @param value the new wrong format error
     */
    public native void setWrongFormatError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwrongFormatError(value);
    }-*/;

    /**
     * Gets the zero start error.
     * 
     * @return the zero start error
     */
    public native String getZeroStartError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getzeroStartError();
    }-*/;

    /**
     * Sets the zerro start error.
     * 
     * @param value the new zerro start error
     */
    public native void setZerroStartError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setzerroStartError(value);
    }-*/;

    /**
     * Validate number.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    public static List<ValidationResult> validateSocialSecurity(PhoneNumberValidator validator, Object value,
                    String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateSocialSecurity(validator, value, baseField);
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
    private native JavaScriptObject _validateSocialSecurity(PhoneNumberValidator validator, Object value,
                    String baseField)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.validateSocialSecurity(
						validator.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						value, baseField);
    }-*/;

}
