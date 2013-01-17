/************************************************************************
  DividerEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class DividerEvent.
 */
public class DividerEvent extends Event {

    /** The Constant DIVIDER_DRAG. */
    public final static String DIVIDER_DRAG = "dividerDrag";

    /** The Constant DIVIDER_PRESS. */
    public final static String DIVIDER_PRESS = "dividerPress";

    /** The Constant DIVIDER_RELEASE. */
    public final static String DIVIDER_RELEASE = "dividerRelease";

    /**
     * Instantiates a new divider event.
     */
    protected DividerEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the delta.
     * 
     * @return the delta
     */
    public final native int getDelta()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getDelta();
    }-*/;

    public static DividerEvent cast(Event event) {
        return new DividerEvent(event.getJsObj());
    }

    /**
     * Gets the divider index.
     * 
     * @return the divider index
     */
    public final native int getDividerIndex()/*-{
		return this.getdividerIndex();
    }-*/;

}
