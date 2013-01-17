/************************************************************************
  CalendarLayoutChangeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.toplevel.Date;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CalendarLayoutChangeEvent.
 */
public class CalendarLayoutChangeEvent extends Event {

    /** The Constant CHANGE. */
    public static final String CHANGE = "change";

    /**
     * Instantiates a new calendar layout change event.
     */
    protected CalendarLayoutChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the new date.
     * 
     * @return the new date
     */
    public final native Date getNewDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getNewDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the trigger event.
     * 
     * @return the trigger event
     */
    public final native Event getTriggerEvent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettriggerEvent();
		return @com.emitrom.flash4j.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static CalendarLayoutChangeEvent cast(Event event) {
        return new CalendarLayoutChangeEvent(event.getJsObj());
    }

}
