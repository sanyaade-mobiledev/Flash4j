/************************************************************************
  System.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.system;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public final class System extends ProxyObject {

    private final static System INSTANCE = new System(getInstance());

    public static System get() {
        return INSTANCE;
    }

    protected System(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getTotalMemory() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.totalMemory;
    }-*/;

    public native boolean getUseCodePage() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.useCodePage;
    }-*/;

    public native void setUseCodePage(boolean useCodePage) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.useCodePage = useCodePage;
    }-*/;

    public native void gc() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.gc();
    }-*/;

    public native IME getIME() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.ime;
		return @com.emitrom.air4j.core.client.system.IME::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void exit(int exitCode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.exit(exitCode);
    }-*/;

    public native void pause() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.pause();
    }-*/;

    public native void resume()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.resume();
    }-*/;

    public native void setClipboard(String data)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setClipboard(data);
    }-*/;

    private static native JavaScriptObject getInstance() /*-{
		return $wnd.runtime.flash.system.System;
    }-*/;

}
