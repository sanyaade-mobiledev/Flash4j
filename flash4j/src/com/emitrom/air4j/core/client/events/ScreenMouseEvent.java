/************************************************************************
  ScreenMouseEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class ScreenMouseEvent extends MouseEvent {

    public static final String CLICK = getConstant("CLICK");
    public static final String MOUSE_DOWN = getConstant("MOUSE_DOWN");
    public static final String MOUSE_UP = getConstant("MOUSE_UP");
    public static final String RIGHT_CLICK = getConstant("RIGHT_CLICK");
    public static final String RIGHT_MOUSE_DOWN = getConstant("RIGHT_MOUSE_DOWN");
    public static final String RIGHT_MOUSE_UP = getConstant("RIGHT_MOUSE_UP");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.SampleDataEvent;
    }-*/;

    protected ScreenMouseEvent(JavaScriptObject obj) {
        super(obj);
    }

    public final native double getScreenX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.screenX;
    }-*/;

    public final native double getScreenY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.screenY;
    }-*/;

    public static ScreenMouseEvent cast(Event e) {
        return new ScreenMouseEvent(e.getJsObj());
    }

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.ScreenMouseEvent[name];
    }-*/;

}
