/************************************************************************
  NativeWindowInitOptions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.display;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public final class NativeWindowInitOptions extends ProxyObject {

    public NativeWindowInitOptions() {
        jsObj = newInstance();
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.NativeWindowInitOptions;
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.display.NativeWindowInitOptions();
    }-*/;

    protected NativeWindowInitOptions(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native boolean isMaximizable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.maximizable;
    }-*/;

    public final native void setMaximizable(boolean maximizable) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.maximizable = maximizable;
    }-*/;

    public final native boolean isMinimizable() /*-{
		return peer.minimizable;
    }-*/;

    public final native void setMinimizable(boolean minimizable) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.minimizable = minimizable;
    }-*/;

    public final native boolean isResizable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.resizable;
    }-*/;

    public final native void setResizable(boolean resizable) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.resizable = resizable;
    }-*/;

    public final NativeWindowSystemChrome getSystemChrome() {
        return NativeWindowSystemChrome.fromValue(_getSystemChrome());
    }

    private native String _getSystemChrome() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.systemChrome;
    }-*/;

    public final void setSystemChrome(NativeWindowSystemChrome chrome) {
        _setSystemChrome(chrome.value);
    }

    private native void _setSystemChrome(String chrome) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.systemChrome = chrome;
    }-*/;

    public final native boolean isTransparent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.transparent;
    }-*/;

    public final native void setTransparent(boolean transparent) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.transparent = transparent;
    }-*/;

    public final NativeWindowType getType() {
        return NativeWindowType.fromValue(_getType());
    }

    private native String _getType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.type;
    }-*/;

    public final void setType(NativeWindowType type) {
        _setType(type.value);
    }

    private native void _setType(String type) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.type = type;
    }-*/;
}
