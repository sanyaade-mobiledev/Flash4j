/************************************************************************
  MouseEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.display.InteractiveObject;
import com.google.gwt.core.client.JavaScriptObject;

public class MouseEvent extends Event {

    public static final String CLICK = getConstant("CLICK");
    public static final String CONTEXT_MENU = getConstant("CONTEXT_MENU");
    public static final String DOUBLE_CLICK = getConstant("DOUBLE_CLICK");
    public static final String MIDDLE_CLICK = getConstant("MIDDLE_CLICK");
    public static final String MIDDLE_MOUSE_DOWN = getConstant("MIDDLE_MOUSE_DOWN");
    public static final String MIDDLE_MOUSE_UP = getConstant("MIDDLE_MOUSE_UP");
    public static final String MOUSE_DOWN = getConstant("MOUSE_DOWN");
    public static final String MOUSE_MOVE = getConstant("MOUSE_MOVE");
    public static final String MOUSE_OUT = getConstant("MOUSE_OUT");
    public static final String MOUSE_OVER = getConstant("MOUSE_OVER");
    public static final String MOUSE_UP = getConstant("MOUSE_UP");
    public static final String MOUSE_WHEEL = getConstant("MOUSE_WHEEL");
    public static final String RIGHT_CLICK = getConstant("RIGHT_CLICK");
    public static final String RIGHT_MOUSE_DOWN = getConstant("RIGHT_MOUSE_DOWN");
    public static final String RIGHT_MOUSE_UP = getConstant("RIGHT_MOUSE_UP");
    public static final String ROLL_OUT = getConstant("ROLL_OUT");
    public static final String ROLL_OVER = getConstant("ROLL_OVER");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.MouseEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.MouseEvent[name];
    }-*/;

    protected MouseEvent(JavaScriptObject obj) {
        super(obj);
    }

    public final native boolean isAltKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.altKey;
    }-*/;

    public final native boolean isButton() /*-{
		return peer.buttonDown;
    }-*/;

    public final native int getClickCount() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.clickCount;
    }-*/;

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

    public final native int getDelta() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.delta;
    }-*/;

    public final native double getLocalX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localX;
    }-*/;

    public final native double getLocalY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localY;
    }-*/;

    public final native InteractiveObject getRelatedObject() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.relatedObject;
		return @com.emitrom.air4j.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native boolean isShiftKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.shiftKey;
    }-*/;

    public final native double getStageX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageX;
    }-*/;

    public final native double getStageY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageY;
    }-*/;

    public final native void updateAfterEvent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.updateAfterEvent();
    }-*/;

    public static MouseEvent cast(Event e) {
        return new MouseEvent(e.getJsObj());
    }
}
