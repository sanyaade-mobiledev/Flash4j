/************************************************************************
  DropDownEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DropDownEvent.
 */
public class DropDownEvent extends Event {

    /** The Constant CLOSE. */
    public final static String CLOSE = "close";

    /** The Constant OPEN. */
    public final static String OPEN = "open";

    /**
     * Instantiates a new drop down event.
     */
    protected DropDownEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

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

    public static DropDownEvent cast(Event event) {
        return new DropDownEvent(event.getJsObj());
    }

}
