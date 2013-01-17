/************************************************************************
  ActivityEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class ActivityEvent extends Event {

    public static final String ACTIVITY = getConstant("ACTIVITY");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.ActivityEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.ActivityEvent[name];
    }-*/;

    protected ActivityEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native boolean isActivating() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.activating;
    }-*/;

    public final native void setActivating(boolean activating) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.activating = activating;
    }-*/;

    public static ActivityEvent cast(Event e) {
        return new ActivityEvent(e.getJsObj());
    }

}
