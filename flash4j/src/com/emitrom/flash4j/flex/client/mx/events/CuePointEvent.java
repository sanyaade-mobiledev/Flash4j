/************************************************************************
  CuePointEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class CuePointEvent.
 */
public class CuePointEvent extends Event {

    /** The Constant CUE_POINT. */
    public final static String CUE_POINT = "cuePoint";

    /**
     * Instantiates a new cue point event.
     */
    protected CuePointEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the cue point name.
     * 
     * @return the cue point name
     */
    public final native String getCuePointName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getCuePointName();
    }-*/;

    /**
     * Gets the cue point time.
     * 
     * @return the cue point time
     */
    public final native double getCuePointTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcuePointTime();
    }-*/;

    /**
     * Gets the cue point type.
     * 
     * @return the cue point type
     */
    public final native String getCuePointType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcuePointType();
    }-*/;

    public static CuePointEvent cast(Event event) {
        return new CuePointEvent(event.getJsObj());
    }

}
