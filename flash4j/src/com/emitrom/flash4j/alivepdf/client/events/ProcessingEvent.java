/************************************************************************
  ProcessingEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ProcessingEvent.
 */
public class ProcessingEvent extends Event {

    /** The Constant COMPLETE. */
    public static final String COMPLETE = "complete";

    /** The Constant PAGE_TREE. */
    public static final String PAGE_TREE = "pageTree";

    /** The Constant RESOURCES. */
    public static final String RESOURCES = "resources";

    /** The Constant STARTED. */
    public static final String STARTED = "started";

    /**
     * Instantiates a new processing event.
     */
    ProcessingEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the duration.
     * 
     * @return the duration
     */
    public final native double getDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getduration();
    }-*/;

    public static ProcessingEvent cast(Event event) {
        return new ProcessingEvent(event.getJsObj());
    }

}
