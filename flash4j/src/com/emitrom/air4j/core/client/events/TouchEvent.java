/************************************************************************
  TouchEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class TouchEvent extends Event {

    public static final String TOUCH_BEGIN = getConstant("TOUCH_BEGIN");
    public static final String TOUCH_END = getConstant("TOUCH_END");
    public static final String TOUCH_MOVE = getConstant("TOUCH_MOVE");
    public static final String TOUCH_OUT = getConstant("TOUCH_OUT");
    public static final String TOUCH_OVER = getConstant("TOUCH_OVER");
    public static final String TOUCH_ROLL_OUT = getConstant("TOUCH_ROLL_OUT");
    public static final String TOUCH_ROLL_OVER = getConstant("TOUCH_ROLL_OVER");
    public static final String TOUCH_TAP = getConstant("TOUCH_TAP");

    protected TouchEvent(JavaScriptObject obj) {
        super(obj);
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.TouchEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.TouchEvent[name];
    }-*/;

    public final native String getText() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.text
    }-*/;

    public final native void setText(String value) /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.text = value
    }-*/;

    public final native boolean isAltKey() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.altKey;
    }-*/;

    public final native boolean isCommandKeyD() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.commandKey;
    }-*/;

    public final native boolean isControlKey() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.controlKey;
    }-*/;

    public final native boolean isCtrlKeyDown() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.ctrlKey;
    }-*/;

    public final native boolean isShiftKeyDown() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.shiftKey;
    }-*/;

    public final native double getStageX() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageX;
    }-*/;

    public final native double getStageY() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageY;
    }-*/;

    public final native boolean isRelatedObjectInaccessible() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isRelatedObjectInaccessible;
    }-*/;

    public final native double getLocalX() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localX;
    }-*/;

    public final native double getLocalY() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localY;
    }-*/;

    public final native InteractiveObject getRelatedObject() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.relatedObject;
		return @com.emitrom.air4j.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native double getTouchPointID() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.touchPointID;
    }-*/;

    public final native boolean isPrimaryTouchPoint() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isPrimaryTouchPoint;
    }-*/;

    public final native double getPressure() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pressure;
    }-*/;

    public final native double getSizeX() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sizeX;
    }-*/;

    public final native double getSizeY() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sizeY;
    }-*/;

    public static TouchEvent cast(Event e) {
        return new TouchEvent(e.getJsObj());
    }

}
