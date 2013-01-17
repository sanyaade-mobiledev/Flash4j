/************************************************************************
  StageVideoEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class StageVideoEvent extends Event {

    public static final String RENDER_STATE = getConstant("RENDER_STATE");
    public static final String RENDER_STATUS_ACCELERATED = getConstant("RENDER_STATUS_ACCELERATED");
    public static final String RENDER_STATUS_SOFTWARE = getConstant("RENDER_STATUS_SOFTWARE");
    public static final String RENDER_STATUS_UNAVAILABLE = getConstant("RENDER_STATUS_UNAVAILABLE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.StageVideoEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.StageVideoEvent[name];
    }-*/;

    protected StageVideoEvent(JavaScriptObject obj) {
        super(obj);
    }

    public final native String getStatus()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.status;
    }-*/;

    public final native String getColorSpace()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.colorSpace;
    }-*/;

    public static StageVideoEvent cast(Event e) {
        return new StageVideoEvent(e.getJsObj());
    }

}
