/************************************************************************
  StageVideoAvailabilityEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class StageVideoAvailabilityEvent.
 */
public class StageVideoAvailabilityEvent extends Event {

    /** The Constant STAGE_VIDEO_AVAILABILITY. */
    public static String STAGE_VIDEO_AVAILABILITY = "stageVideoAvailability";

    /**
     * Instantiates a new stage video availability event.
     */
    protected StageVideoAvailabilityEvent() {
    }

    StageVideoAvailabilityEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the availability.
     * 
     * @return the availability
     */
    public native String getAvailability()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getAvailability();
    }-*/;

    public static StageVideoAvailabilityEvent cast(Event event) {
        return new StageVideoAvailabilityEvent(event.getJsObj());
    }

}
