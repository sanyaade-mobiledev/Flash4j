/************************************************************************
  DateValidator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class DateValidator.
 */
public class DateValidator extends Validator {

    private static DateValidator INSTANCE = new DateValidator(Bridge.createObject("mx.validators.DateValidator"));

    /**
     * Instantiates a new date validator.
     */
    protected DateValidator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the date validator
     */
    public DateValidator() {
        jsObj = Bridge.createObject("mx.validators.DateValidator");
    }

    public static DateValidator get() {
        return INSTANCE;
    }

    /**
     * Gets the allowed formatchars.
     * 
     * @return the allowed formatchars
     */
    public native String getAllowedFormatchars()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowedFormatchars();
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
     * Sets the day listener.
     * 
     * @param listener the new day listener
     */
    public void setDayListener(IValidatorListener listener) {
        _setDayListerner(listener.asIValidatorListener());
    }

    /**
     * _set day listerner.
     * 
     * @param listener the listener
     */
    private native void _setDayListerner(JavaScriptObject listener)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdayListerner(listener);
    }-*/;

    /**
     * Gets the day property.
     * 
     * @return the day property
     */
    public native String getDayProperty()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdayProperty();
    }-*/;

    /**
     * Sets the day property.
     * 
     * @param value the new day property
     */
    public native void setDayProperty(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdayProperty(value);
    }-*/;

    /**
     * Gets the day source.
     * 
     * @param <T> the generic type
     * @return the day source
     */
    public native <T> T getDaySource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdaySource();
    }-*/;

    /**
     * Sets the day source.
     * 
     * @param value the new day source
     */
    public native void setDaySource(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdaySource(value);
    }-*/;

    /**
     * Gets the format error.
     * 
     * @return the format error
     */
    public native String getFormatError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getformatError();
    }-*/;

    /**
     * Sets the format error.
     * 
     * @param value the new format error
     */
    public native void setFormatError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setformatError(value);
    }-*/;

    /**
     * Gets the input format.
     * 
     * @return the input format
     */
    public native String getInputFormat()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinputFormat();
    }-*/;

    /**
     * Sets the input format.
     * 
     * @param value the new input format
     */
    public native void setInputFormat(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinputFormat(value);
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
     * Sets the month listener.
     * 
     * @param listener the new month listener
     */
    public void setMonthListener(IValidatorListener listener) {
        _setMonthListener(listener.asIValidatorListener());
    }

    /**
     * _set month listener.
     * 
     * @param listener the listener
     */
    private native void _setMonthListener(JavaScriptObject listener)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmonthListener(listener);
    }-*/;

    /**
     * Gets the month property.
     * 
     * @return the month property
     */
    public native String getMonthProperty()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmonthProperty();
    }-*/;

    /**
     * Sets the month property.
     * 
     * @param value the new month property
     */
    public native void setMonthProperty(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmonthProperty(value);
    }-*/;

    /**
     * Gets the month source.
     * 
     * @param <T> the generic type
     * @return the month source
     */
    public native <T> T getMonthSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmonthSource();
    }-*/;

    /**
     * Sets the month source.
     * 
     * @param value the new month source
     */
    public native void setMonthSource(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmonthSource(value);
    }-*/;

    /**
     * Validate as string.
     * 
     * @return true, if successful
     */
    public boolean validateAsString() {
        return Boolean.valueOf(_validateAsString());
    }

    /**
     * _validate as string.
     * 
     * @return the string
     */
    private native String _validateAsString()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalidateAsString();
    }-*/;

    /**
     * Sets the validate as string.
     * 
     * @param value the new validate as string
     */
    public void setValidateAsString(boolean value) {
        _setValidateAsString(Boolean.toString(value));
    }

    /**
     * _set validate as string.
     * 
     * @param value the value
     */
    private native void _setValidateAsString(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalidateAsString(value);
    }-*/;

    /**
     * Gets the wrong day error.
     * 
     * @return the wrong day error
     */
    public native String getWrongDayError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwrongDayError();
    }-*/;

    /**
     * Sets the wrong day error.
     * 
     * @param value the new wrong day error
     */
    public native void setWrongDayError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwrongDayError(value);
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
     * Gets the wrong month error.
     * 
     * @return the wrong month error
     */
    public native String getWrongMonthError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwrongMonthError();
    }-*/;

    /**
     * Sets the wrong month error.
     * 
     * @param value the new wrong month error
     */
    public native void setWrongMonthError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwrongMonthError(value);
    }-*/;

    /**
     * Gets the wrong year error.
     * 
     * @return the wrong year error
     */
    public native String getWrongYearError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwrongYearError();
    }-*/;

    /**
     * Sets the wrong year error.
     * 
     * @param value the new wrong year error
     */
    public native void setWrongYearError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwrongYearError(value);
    }-*/;

    /**
     * Sets the year listener.
     * 
     * @param listener the new year listener
     */
    public void setYearListener(IValidatorListener listener) {
        _setYearListener(listener.asIValidatorListener());
    }

    /**
     * _set year listener.
     * 
     * @param listener the listener
     */
    private native void _setYearListener(JavaScriptObject listener)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setYearListener(listener);
    }-*/;

    /**
     * Gets the year property.
     * 
     * @return the year property
     */
    public native String getYearProperty()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyearProperty();
    }-*/;

    /**
     * Sets the year property.
     * 
     * @param value the new year property
     */
    public native void setYearProperty(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyearProperty(value);
    }-*/;

    /**
     * Gets the year source.
     * 
     * @param <T> the generic type
     * @return the year source
     */
    public native <T> T getYearSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyearSource();
    }-*/;

    /**
     * Sets the year source.
     * 
     * @param value the new year source
     */
    public native void setYearSource(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyearSource(value);
    }-*/;

    /**
     * Validate currency.
     * 
     * @param validator the validator
     * @param value the value
     * @param baseField the base field
     * @return the js array
     */
    public static List<ValidationResult> validateDate(DateValidator validator, ProxyObject value, String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateDate(validator, value.getJsObj(), baseField);
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
    public static List<ValidationResult> validateDate(DateValidator validator, Object value, String baseField) {
        List<ValidationResult> toReturn = new ArrayList<ValidationResult>();
        JavaScriptObject peers = get()._validateDate(validator, value, baseField);
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
    private native JavaScriptObject _validateDate(DateValidator validator, Object value, String baseField)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.validateDate(
						validator.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						value, baseField);
    }-*/;

}
