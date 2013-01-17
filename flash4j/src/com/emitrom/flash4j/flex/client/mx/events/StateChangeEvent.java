/************************************************************************
  StateChangeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class StateChangeEvent.
 */
public class StateChangeEvent extends Event {

    /** The Constant CURRENT_STATE_CHANGE. */
    public static final String CURRENT_STATE_CHANGE = "currentStateChange";

    /** The Constant CURRENT_STATE_CHANGING. */
    public static final String CURRENT_STATE_CHANGING = "currentStateChanging";

    /**
     * Instantiates a new state change event.
     */
    protected StateChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the new state.
     * 
     * @return the new state
     */
    public final native String getNewState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnewState();
    }-*/;

    /**
     * Gets the old state.
     * 
     * @return the old state
     */
    public final native String getOldState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoldState();
    }-*/;

    public static StateChangeEvent cast(Event event) {
        return new StateChangeEvent(event.getJsObj());
    }

}
