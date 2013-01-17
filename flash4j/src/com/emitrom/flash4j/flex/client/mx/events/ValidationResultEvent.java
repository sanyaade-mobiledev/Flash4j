/************************************************************************
  ValidationResultEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.events;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.flex.client.mx.validators.ValidationResult;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ValidationResultEvent.
 */
public class ValidationResultEvent extends Event {

    /** The Constant INVALID. */
    public final static String INVALID = "invalid";

    /** The Constant VALID. */
    public final static String VALID = "valid";

    /**
     * Instantiates a new validation result event.
     */
    protected ValidationResultEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the field.
     * 
     * @return the field
     */
    public final native String getField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfield();
    }-*/;

    /**
     * Gets the message.
     * 
     * @return the message
     */
    public final native String getMessage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmessage();
    }-*/;

    /**
     * Gets the results.
     * 
     * @return the results
     */

    public final List<ValidationResult> getResult() {
        List<ValidationResult> result = new ArrayList<ValidationResult>();
        JavaScriptObject peers = _getResults();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            result.add(new ValidationResult(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return result;
    }

    private final native JavaScriptObject _getResults()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getresults();
    }-*/;

    public static ValidationResultEvent cast(Event event) {
        return new ValidationResultEvent(event.getJsObj());
    }

    public static ValidationResultEvent from(JavaScriptObject obj) {
        return new ValidationResultEvent(obj);
    }

}
