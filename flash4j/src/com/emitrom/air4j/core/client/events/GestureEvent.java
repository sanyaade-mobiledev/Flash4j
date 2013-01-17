/************************************************************************
  GestureEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class GestureEvent extends Event {

    public static final String GESTURE_TWO_FINGER_TAP = getConstant("GESTURE_TWO_FINGER_TAP");

    protected GestureEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.GestureEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.GestureEvent[name];
    }-*/;

    public final native void updateAfterEvent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.updateAfterEvent();
    }-*/;

    public final native boolean isAltKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.altKey;
    }-*/;

    /**
     * only for mac
     * 
     * @return
     */
    public final native boolean isCommandKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.commandKey;
    }-*/;

    public final native boolean isControlKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.controlKey;
    }-*/;

    public final native boolean isCtrlKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.ctrlKey;
    }-*/;

    public final native boolean isShiftKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.shiftKey;
    }-*/;

    public GesturePhase getPhase() {
        return GesturePhase.fromValue(_getPhase());
    }

    private final native String _getPhase() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.phase;
    }-*/;

    public final native double getLocalX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localX;
    }-*/;

    public final native double getLocalY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localY;
    }-*/;

    public final native double getStageX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageX;
    }-*/;

    public final native double getStageY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageY;
    }-*/;

    public static GestureEvent cast(Event e) {
        return new GestureEvent(e.getJsObj());
    }
}
