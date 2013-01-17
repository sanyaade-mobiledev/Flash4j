/************************************************************************
  PressAndTapGestureEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class PressAndTapGestureEvent extends GestureEvent {

    public static final String GESTURE_PRESS_AND_TAP = getConstant("GESTURE_TWO_FINGER_TAP");

    protected PressAndTapGestureEvent(JavaScriptObject obj) {
        super(obj);
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.PressAndTapGestureEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.PressAndTapGestureEvent[name];
    }-*/;

    public final native double getTapLocalX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tapLocalX;
    }-*/;

    public final native double getTapLocalY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tapLocalY;
    }-*/;

    public final native double getTapStageX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tapStageX;
    }-*/;

    public final native double getTapStageY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tapStageY;
    }-*/;

    public static PressAndTapGestureEvent cast(Event e) {
        return new PressAndTapGestureEvent(e.getJsObj());
    }

}
