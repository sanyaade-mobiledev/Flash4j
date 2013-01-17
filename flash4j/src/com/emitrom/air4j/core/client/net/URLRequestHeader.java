/************************************************************************
  URLRequestHeader.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class URLRequestHeader extends ProxyObject {

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.URLRequestHeader;
	}-*/;

	public URLRequestHeader(JavaScriptObject obj) {
		jsObj = obj;
	}

	public URLRequestHeader() {
		jsObj = newInstance();
	}

	public URLRequestHeader(String name, String value) {
		jsObj = newInstance(name, value);
	}

	public native String getName() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.name;
	}-*/;

	public native void setName(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.name = name;
	}-*/;

	public native String getValue() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.value;
	}-*/;

	public native void setValue(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.value = value;
	}-*/;

	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.URLRequestHeader();
	}-*/;

	private static native JavaScriptObject newInstance(String name, String value) /*-{
		return new $wnd.runtime.flash.net.URLRequestHeader(name, value);
	}-*/;
}
