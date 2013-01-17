/************************************************************************
  TransformGestureEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class TransformGestureEvent extends GestureEvent {

    public static final String GESTURE_PAN = getConstant("GESTURE_PAN");
    public static final String GESTURE_ROTATE = getConstant("GESTURE_ROTATE");
    public static final String GESTURE_SWIPE = getConstant("GESTURE_SWIPE");
    public static final String GESTURE_ZOOM = getConstant("GESTURE_ZOOM");

    protected TransformGestureEvent(JavaScriptObject obj) {
        super(obj);
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.TransformGestureEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.TransformGestureEvent[name];
    }-*/;

    public final native double getOffestX() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.offsetX;
    }-*/;

    public final native double getOffestY() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.offsetY;
    }-*/;

    public final native double getScaleX() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scaleX;
    }-*/;

    public final native double getScaleY() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scaleY;
    }-*/;

    public final native double getRotation() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rotation;
    }-*/;

    public static TransformGestureEvent cast(Event e) {
        return new TransformGestureEvent(e.getJsObj());
    }

}
