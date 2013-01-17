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
package com.emitrom.air4j.core.client.events;

import com.google.gwt.core.client.JavaScriptObject;

public class TimerEvent extends Event {

    public static final String TIMER = getConstant("TIMER");
    public static final String TIMER_COMPLETE = getConstant("TIMER_COMPLETE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.TimerEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.TimerEvent[name];
    }-*/;

    protected TimerEvent(JavaScriptObject obj) {
        super(obj);
    }

    public final native void updateAfterEvent() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.updateAfterEvent();
    }-*/;

    public static TimerEvent cast(Event e) {
        return new TimerEvent(e.getJsObj());
    }

}
