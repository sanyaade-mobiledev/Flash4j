/************************************************************************
  KeyboardEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.ui.KeyLocation;
import com.google.gwt.core.client.JavaScriptObject;

public class KeyboardEvent extends Event {

    public static String KEY_DOWN = getConstant("KEY_DOWN");
    public static String KEY_UP = getConstant("KEY_UP");

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.KeyboardEvent[name];
    }-*/;

    protected KeyboardEvent() {
    }

    protected KeyboardEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native boolean isAltKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.altKey;
    }-*/;

    public native int getCharCode() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.charCode;
    }-*/;

    public native boolean isCommandKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.commandKey;
    }-*/;

    public native boolean isControlKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.controlKey;
    }-*/;

    public native boolean isCtrlKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.ctrlKey;
    }-*/;

    public native int getKeyCode() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.keyCode;
    }-*/;

    public KeyLocation getKeyLocation() {
        return KeyLocation.fromValue(_getKeyLocation());
    }

    private native int _getKeyLocation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.keyLocation;
    }-*/;

    public native boolean isShiftKeyDown() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.shiftKey;
    }-*/;

    public native void updateAfterEvent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.updateAfterEvent();
    }-*/;

    public static KeyboardEvent cast(Event e) {
        return new KeyboardEvent(e.getJsObj());
    }

}
