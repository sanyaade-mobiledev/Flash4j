/************************************************************************
  EmailValidator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class EmailValidator.
 */
public class EmailValidator extends Validator {

    private static EmailValidator INSTANCE = new EmailValidator(Bridge.createObject("mx.validators.EmailValidator"));

    /**
     * Instantiates a new email validator.
     */
    protected EmailValidator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the email validator
     */
    public EmailValidator() {
        jsObj = Bridge.createObject("mx.validators.EmailValidator");
    }

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
     * Gets the invalid ip domain error.
     * 
     * @return the invalid ip domain error
     */
    public native String getInvalidIPDomainError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinvalidIPDomainError();
    }-*/;

    /**
     * Sets the invalid ip domain error.
     * 
     * @param value the new invalid ip domain error
     */
    public native void setInvalidIPDomainError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinvalidIPDomainError(value);
    }-*/;

    /**
     * Gets the invalid periods in domain error.
     * 
     * @return the invalid periods in domain error
     */
    public native String getInvalidPeriodsInDomainError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinvalidPeriodsInDomainError();
    }-*/;

    /**
     * Sets the invalid periods in domain error.
     * 
     * @param value the new invalid periods in domain error
     */
    public native void setInvalidPeriodsInDomainError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinvalidPeriodsInDomainError(value);
    }-*/;

    /**
     * Gets the missing at sign error.
     * 
     * @return the missing at sign error
     */
    public native String getMissingAtSignError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmissingAtSignError();
    }-*/;

    /**
     * Sets the missing at sign error.
     * 
     * @param value the new missing at sign error
     */
    public native void setMissingAtSignError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmissingAtSignError(value);
    }-*/;

    /**
     * Gets the missing period in domain error.
     * 
     * @return the missing period in domain error
     */
    public native String getMissingPeriodInDomainError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmissingPeriodInDomainError();
    }-*/;

    /**
     * Sets the missing period in domain error.
     * 
     * @param value the new missing period in domain error
     */
    public native void setMissingPeriodInDomainError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmissingPeriodInDomainError(value);
    }-*/;

    /**
     * Gets the missing username error.
     * 
     * @return the missing username error
     */
    public native String getMissingUsernameError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmissingUsernameError();
    }-*/;

    /**
     * Sets the missing username error.
     * 
     * @param value the new missing username error
     */
    public native void setMissingUsernameError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmissingUsernameError(value);
    }-*/;

    /**
     * Gets the too many at signs error.
     * 
     * @return the too many at signs error
     */
    public native String getTooManyAtSignsError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettooManyAtSignsError();
    }-*/;

    /**
     * Sets the too many at sign error.
     * 
     * @param value the new too many at sign error
     */
    public native void setTooManyAtSignError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settooManyAtSignError(value);
    }-*/;

    /**
     * Validate currency.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    public static List<ValidationResult> validateEmail(EmailValidator validator, ProxyObject value, String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateEmail(validator, value.getJsObj(), baseField);
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
    public static List<ValidationResult> validateEmail(EmailValidator validator, Object value, String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateEmail(validator, value, baseField);
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ValidationResult(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private static EmailValidator get() {
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
    private native JavaScriptObject _validateEmail(EmailValidator validator, Object value, String baseField)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.validateEmail(
						validator.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						value, baseField);
    }-*/;

}
