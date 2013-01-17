/************************************************************************
  Validator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.events.handlers.EventHandler;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.events.ValidationResultEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Validator.
 */
public class Validator extends EventDispatcher {

    /**
     * Instantiates a new validator.
     */
    protected Validator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the validator
     */
    public Validator() {
        jsObj = Bridge.createObject("mx.validators.Validator");
    }

    /**
     * Checks if is enabled.
     * 
     * @return true, if is enabled
     */
    public native boolean isEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getenabled();
    }-*/;

    /**
     * Sets the enabled.
     * 
     * @param value the new enabled
     */
    public native void setEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setenabled(value);
    }-*/;

    /**
     * Sets the listener.
     * 
     * @param value the new listener
     */
    public native void setListener(EventHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setlistener(function(e) {
					var eventObject = @com.emitrom.flash4j.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
					handler.@com.emitrom.flash4j.core.client.events.handlers.EventHandler::onEvent(Lcom/emitrom/flash4j/core/client/events/Event;)(eventObject);
				});
    }-*/;

    /**
     * Gets the property.
     * 
     * @return the property
     */
    public native String getProperty()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getproperty();
    }-*/;

    /**
     * Sets the property.
     * 
     * @param value the new property
     */
    public native void setProperty(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setproperty(value);
    }-*/;

    /**
     * Checks if is required.
     * 
     * @return true, if is required
     */
    public native boolean isRequired()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrequired();
    }-*/;

    /**
     * Sets the required.
     * 
     * @param value the new required
     */
    public native void setRequired(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrequired(value);
    }-*/;

    /**
     * Sets the trigger.
     * 
     * @param value the new trigger
     */
    public native void setTrigger(EventDispatcher value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settrigger(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the required field error.
     * 
     * @return the required field error
     */
    public native String getRequiredFieldError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrequiredFieldError();
    }-*/;

    /**
     * Sets the required field error.
     * 
     * @param value the new required field error
     */
    public native void setRequiredFieldError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrequiredFieldError(value);
    }-*/;

    public void setSource(ProxyObject source) {
        setSource(source.getJsObj());
    }

    /**
     * Sets the source.
     * 
     * @param value the new source
     */
    public native void setSource(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsource(value);
    }-*/;

    /**
     * Gets the trigger event.
     * 
     * @return the trigger event
     */
    public native String getTriggerEvent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettriggerEvent();
    }-*/;

    /**
     * Sets the trigger event.
     * 
     * @param value the new trigger event
     */
    public native void setTriggerEvent(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settriggerEvent(value);
    }-*/;

    /**
     * Validate.
     * 
     * @return the validation result event
     */
    public native ValidationResultEvent validate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.validate();
		return @com.emitrom.flash4j.flex.client.mx.events.ValidationResultEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public ValidationResultEvent validate(ProxyObject target) {
        return validate(target.getJsObj());
    }

    /**
     * Validate.
     * 
     * @param value the value
     * @return the validation result event
     */
    public native ValidationResultEvent validate(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.validate(value);
		return @com.emitrom.flash4j.flex.client.mx.events.ValidationResultEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public ValidationResultEvent validate(ProxyObject target, boolean supressEvent) {
        return validate(target.getJsObj(), supressEvent);
    }

    /**
     * Validate.
     * 
     * @param value the value
     * @param suppressEvent the suppress event
     * @return the validation result event
     */
    public native ValidationResultEvent validate(Object value, boolean suppressEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.validate(value, suppressEvent);
		return @com.emitrom.flash4j.flex.client.mx.events.ValidationResultEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * _validate all.
     * 
     * @param validators the validators
     * @return the js array
     */

    public List<ValidationResultEvent> validateAll(List<? extends Validator> validators) {
        List<ValidationResultEvent> toReturn = new ArrayList<ValidationResultEvent>();
        JavaScriptObject peers = _validateAll(validators);
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            JavaScriptObject obj = JsoHelper.getValueFromJavaScriptObjectArray(peers, i);
            toReturn.add(ValidationResultEvent.from(obj));
        }
        return toReturn;
    }

    private JavaScriptObject _validateAll(List<? extends Validator> validators) {
        return _validateAll(DataConverter.fromList(validators));
    }

    /**
     * _validate all.
     * 
     * @param colletion the colletion
     * @return the js array
     */
    private JavaScriptObject _validateAll(ArrayCollection colletion) {
        return _validateAll(colletion.toArray().getJsObj());
    }

    /**
     * _validate all.
     * 
     * @param values the values
     * @return the js array
     */
    private native JavaScriptObject _validateAll(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.validateAll(values);
    }-*/;

}
