/************************************************************************
  NativeWindowDisplayStateEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.display.NativeWindowDisplayState;
import com.google.gwt.core.client.JavaScriptObject;

public class NativeWindowDisplayStateEvent extends Event {

    public static final String DISPLAY_STATE_CHANGING = getConstant("DISPLAY_STATE_CHANGING");
    public static final String DISPLAY_STATE_CHANGE = getConstant("DISPLAY_STATE_CHANGE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.NativeWindowDisplayStateEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.NativeWindowDisplayStateEvent[name];
    }-*/;

    protected NativeWindowDisplayStateEvent(JavaScriptObject obj) {
        super(obj);
    }

    public final NativeWindowDisplayState getAfterDisplayState() {
        return NativeWindowDisplayState.fromValue(_getAfterDisplayState());
    }

    private native String _getAfterDisplayState() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.afterDisplayState;
    }-*/;

    public final NativeWindowDisplayState getBeforeDisplayState() {
        return NativeWindowDisplayState.fromValue(_getBeforeDisplayState());
    }

    private native String _getBeforeDisplayState() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.beforeDisplayState;
    }-*/;

    public static NativeWindowDisplayStateEvent cast(Event e) {
        return new NativeWindowDisplayStateEvent(e.getJsObj());
    }
}
