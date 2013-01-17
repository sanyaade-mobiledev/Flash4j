/************************************************************************
  Event.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Event extends ProxyObject {

    public Event(String type, boolean bubbles, boolean cancelable) {
        jsObj = newInstance(type, bubbles, cancelable);
    }

    protected Event() {

    }

    protected Event(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static final String ACTIVATE = getConstant("ACTIVATE");
    public static final String ADDED = getConstant("ADDED");
    public static final String ADDED_TO_STAGE = getConstant("ADDED_TO_STAGE");
    public static final String CANCEL = getConstant("CANCEL");
    public static final String CHANGE = getConstant("CHANGE");
    public static final String CLEAD = getConstant("CLEAR");
    public static final String CLOSE = getConstant("CLOSE");
    public static final String CLOSING = getConstant("CLOSING");
    public static final String COMPLETE = getConstant("COMPLETE");
    public static final String CONNECT = getConstant("CONNECT");
    public static final String COPY = getConstant("COPY");
    public static final String CUT = getConstant("CUT");
    public static final String DEACTIVATE = getConstant("DEACTIVATE");
    public static final String DISPLAYING = getConstant("DISPLAYING");
    public static final String ENTER_FRAME = getConstant("ENTER_FRAME");
    public static final String EXITING = getConstant("EXITING");
    public static final String FRAME_CONSTRUCTED = getConstant("FRAME_CONSTRUCTED");
    public static final String FULLSCREEN = getConstant("FULLSCREEN");
    public static final String HTML_BOUNDS_CHANGE = getConstant("HTML_BOUNDS_CHANGE");
    public static final String HTML_DOM_INITIALIZE = getConstant("HTML_DOM_INITIALIZE");
    public static final String HTML_RENDER = getConstant("HTML_RENDER");
    public static final String ID3 = getConstant("ID3");
    public static final String INIT = getConstant("INIT");
    public static final String LOCATION_CHANGE = getConstant("LOCATION_CHANGE");
    public static final String MOUSE_LEAVE = getConstant("MOUSE_LEAVE");
    public static final String NETWORK_CHANGE = getConstant("NETWORK_CHANGE");
    public static final String OPEN = getConstant("OPEN");
    public static final String PASTE = getConstant("PASTE");
    public static final String REMOVED = getConstant("REMOVED");
    public static final String REMOVED_FROM_STAGE = getConstant("REMOVED_FROM_STAGE");
    public static final String RENDER = getConstant("RENDER");
    public static final String RESIZE = getConstant("RESIZE");
    public static final String SCROLL = getConstant("SCROLL");
    public static final String SELECT = getConstant("SELECT");
    public static final String SELECT_ALL = getConstant("SELECT_ALL");
    public static final String SOUND_COMPLETE = getConstant("SOUND_COMPLETE");
    public static final String STANDARD_ERROR_CLOSE = getConstant("STANDARD_ERROR_CLOSE ");
    public static final String STANDARD_INPUT_CLOSE = getConstant("STANDARD_INPUT_CLOSE ");
    public static final String STANDARD_OUTPUT_CLOSE = getConstant("STANDARD_OUTPUT_CLOSE ");
    public static final String TAB_CHILDREN_CHANGE = getConstant("TAB_CHILDREN_CHANGE");
    public static final String TAB_ENABLED_CHANGE = getConstant("TAB_ENABLED_CHANGE");
    public static final String TAB_INDEX_CHANGE = getConstant("TAB_INDEX_CHANGE");
    public static final String UNLOAD = getConstant("UNLOAD");
    public static final String USER_IDLE = getConstant("USER_IDLE");
    public static final String USER_PRESENT = getConstant("USER_PRESENT");
    public static final String CONTEXT_3D_CREATE = getConstant("CONTEXT_3D_CREATE");

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.Event[name];
    }-*/;

    private static native JavaScriptObject newInstance(String type) /*-{
		return new $wnd.runtime.flash.events.Event(type);
    }-*/;

    private static native JavaScriptObject newInstance(String type, boolean bubbles) /*-{
		return new $wnd.runtime.flash.events.Event(type, bubbles);
    }-*/;

    private static native JavaScriptObject newInstance(String type, boolean bubbles, boolean cancelable) /*-{
		return new $wnd.runtime.flash.events.Event(type, bubbles, cancelable);
    }-*/;

    public final native boolean getBubbles() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bubbles;
    }-*/;

    public final native boolean isCancelable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.cancelable;
    }-*/;

    public final native <T extends JavaScriptObject> T getCurrentTarget() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.currentTarget;
    }-*/;

    public final native int getEventPhase() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.eventPhase;
    }-*/;

    public final native <T extends JavaScriptObject> T getTarget() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.target;
    }-*/;

    public final native String getType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.type;
    }-*/;

    public final native Event clone() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.clone();
    }-*/;

    public final native boolean isDefaultPrevented() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isDefaultPrevented();
    }-*/;

    public final native void preventDefault() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.preventDefault();
    }-*/;

    public final native void stopImmediatePropagation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stopImmediatePropagation();
    }-*/;

    public final native void stopPropagation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stopPropagation();
    }-*/;

    private native JavaScriptObject createNativePeer()/*-{
		return new $wnd.runtime.flash.events.Event();
    }-*/;

}
