/************************************************************************
  LoaderInfo.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.system.ApplicationDomain;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class LoaderInfo extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.LoaderInfo;
    }-*/;

    protected LoaderInfo() {

    }

    protected LoaderInfo(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getActionScriptVersion() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.actionScriptVersion;
    }-*/;

    public native ApplicationDomain getApplicationDomain() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.applicationDomain;
		return @com.emitrom.air4j.core.client.system.ApplicationDomain::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native DisplayObject getContent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.content;
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Loader getLoader() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.loader;
		return @com.emitrom.air4j.core.client.display.Loader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.width;
    }-*/;

    public native int getHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.height;
    }-*/;

    public native double getSwfVersion() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.swfVersion;
    }-*/;

    public native String getLoaderURL() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.loaderURL;
    }-*/;

    public native int getFrameRate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.frameRate;
    }-*/;

    public native String getContentType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.contentType;
    }-*/;

    public native double getBytesTotal() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesTotal;
    }-*/;

    public native double getBytesLoaded() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesLoaded;
    }-*/;

    public native ByteArray getBytes() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.bytes;
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);

    }-*/;

    public native <T extends JavaScriptObject> T getChildSandboxBridge() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.childSandboxBridge;
    }-*/;

    public native boolean isURLInaccessible() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isURLInaccessible;
    }-*/;

    public native JavaScriptObject getParameters() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.parameters;
    }-*/;

    public native boolean parentAllowsChild() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.parentAllowsChild;
    }-*/;

    public native String getURL() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.url;
    }-*/;

    public native boolean sameDomain() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sameDomain;
    }-*/;

    public static LoaderInfo from(JavaScriptObject obj) {
        return new LoaderInfo(obj);
    }

}
