/************************************************************************
  FocusEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class FocusEvent extends Event {

    public static final String FOCUS_IN = getConstant("FOCUS_IN");
    public static final String FOCUS_OUT = getConstant("FOCUS_OUT");
    public static final String KEY_FOCUS_CHANGE = getConstant("KEY_FOCUS_CHANGE");
    public static final String MOUSE_FOCUS_CHANGE = getConstant("MOUSE_FOCUS_CHANGE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.FocusEvent;
    }-*/;

    protected FocusEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.FocusEvent[name];
    }-*/;

    public final native String getDirection() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.direction;
    }-*/;

    public final native boolean isRelatedObjectInaccessible() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isRelatedObjectInaccessible;
    }-*/;

    public final native int getKeyCode() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.keyCode;
    }-*/;

    public final native InteractiveObject getRelatedObject() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.relatedObject;
		return @com.emitrom.air4j.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native boolean isShitKey() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.shiftKey;
    }-*/;

    public final native void shiftKey(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.shiftKey = value;
    }-*/;

    public static FocusEvent cast(Event e) {
        return new FocusEvent(e.getJsObj());
    }

}
