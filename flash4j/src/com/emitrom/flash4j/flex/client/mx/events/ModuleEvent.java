/************************************************************************
  ModuleEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.events.ProgressEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ModuleEvent.
 */
public class ModuleEvent extends ProgressEvent {

    /** The Constant ERROR. */
    public static final String ERROR = "error";

    /** The Constant PROGRESS. */
    public static final String PROGRESS = "progress";

    /** The Constant READY. */
    public static final String READY = "ready";

    /** The Constant SETUP. */
    public static final String SETUP = "setup";

    /** The Constant UNLOAD. */
    public static final String UNLOAD = "unload";

    /**
     * Instantiates a new module event.
     */
    protected ModuleEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the error text.
     * 
     * @return the error text
     */
    public final native String getErrorText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geterrorText();
    }-*/;

    public static ModuleEvent cast(Event event) {
        return new ModuleEvent(event.getJsObj());
    }

}
