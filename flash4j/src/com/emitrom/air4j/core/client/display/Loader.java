/************************************************************************
  Loader.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.net.URLRequest;
import com.emitrom.air4j.core.client.system.LoaderContext;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class Loader extends DisplayObjectContainer {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.Loader;
    }-*/;

    public Loader() {
        jsObj = newInstance();
    }

    protected Loader(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native LoaderInfo getContentLoaderInfo() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.contentLoaderInfo;
		return @com.emitrom.air4j.core.client.display.LoaderInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);

    }-*/;

    public native DisplayObject getContent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.content;
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.close();
    }-*/;

    public native void load(URLRequest request) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.load(request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void load(URLRequest request, LoaderContext context) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.load(
						request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						context.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void loadBytes(ByteArray bytes) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.loadBytes(bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void loadBytes(ByteArray bytes, LoaderContext loaderContext) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.loadBytes(
						bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						loaderContext.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void unload() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.unload();
    }-*/;

    public native void unloadAndStop() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.unloadAndStop();
    }-*/;

    public native void unloadAndStop(boolean gc) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.unloadAndStop(gc);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.display.Loader();
    }-*/;

}
