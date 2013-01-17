/************************************************************************
  StyleEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class StyleEvent.
 */
public class StyleEvent extends ProgressEvent {

    /** The Constant COMPLETE. */
    public static final String COMPLETE = "complete";

    /** The Constant ERROR. */
    public static final String ERROR = "error";

    /** The Constant PROGRESS. */
    public static final String PROGRESS = "progress";

    /**
     * Instantiates a new style event.
     */
    protected StyleEvent(JavaScriptObject obj) {
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

    public static StyleEvent cast(Event event) {
        return new StyleEvent(event.getJsObj());
    }
}
