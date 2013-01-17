/************************************************************************
  TimerEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class TimerEvent.
 */
public class TimerEvent extends Event {

    /** The Constant TIMER. */
    public static final String TIMER = "timer";

    /** The Constant TIMER_COMPLETE. */
    public static final String TIMER_COMPLETE = "timerComplete";

    /**
     * Instantiates a new timer event.
     */
    protected TimerEvent() {
    }

    TimerEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Update after event.
     */
    public final native void updateAfterEvent() /*-{
		this.updateAfterEvent();
    }-*/;

    public static TimerEvent cast(Event event) {
        return new TimerEvent(event.getJsObj());
    }
}
