/************************************************************************
  URLLoader.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.net;

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class URLLoader extends EventDispatcher {

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.URLLoader;
	}-*/;

	protected URLLoader(JavaScriptObject obj) {
		jsObj = obj;
	}

	public URLLoader() {
		jsObj = newInstance();
	}

	public URLLoader(URLRequest urlRequest) {
		jsObj = newInstance(urlRequest);
	}

	public native int getBytesLoaded() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesLoaded;
	}-*/;

	public native int getBytesTotal() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesLoaded;
	}-*/;

	public native String getDataAsString() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.data;
	}-*/;

	public native ByteArray getDataAsByteArray() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.data;
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native URLVariables getDataAsURLVariables() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.data;
		return @com.emitrom.air4j.core.client.net.URLVariables::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public URLLoaderDataFormat getDataFormat() {
		return URLLoaderDataFormat.fromValue(getDataFormat0());
	}

	private native String getDataFormat0() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.dataFormat;
	}-*/;

	public void setDataFormat(URLLoaderDataFormat dataFormat) {
		setDataFormat0(dataFormat.value);
	}

	private native void setDataFormat0(String dataFormat) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.dataFormat = dataFormat;
	}-*/;

	public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
	}-*/;

	public native void load(URLRequest request) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.load(request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
	}-*/;

	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.URLLoader();
	}-*/;

	private static native JavaScriptObject newInstance(URLRequest request) /*-{
		return new $wnd.runtime.flash.net.URLLoader(
				request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
	}-*/;

}
