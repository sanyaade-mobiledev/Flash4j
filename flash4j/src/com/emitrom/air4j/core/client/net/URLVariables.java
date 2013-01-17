/************************************************************************
  URLVariables.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JsArrayString;

public class URLVariables extends ProxyObject {

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.URLVariables;
	}-*/;

	protected URLVariables(JavaScriptObject obj) {
		jsObj = obj;
	}

	public URLVariables() {
		jsObj = newInstance();
	}

	public URLVariables(String source) {
		jsObj = newInstance(source);
	}

	public final native boolean containsKey(String key) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.hasOwnProperty(key);
	}-*/;

	public final native Object getValue(String key) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer[key];
	}-*/;

	public final native String getFirst(String key) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var v = peer[key];
		if (v != null && v instanceof Array) {
			v = v[0];
		}
		if (v == null) {
			return null;
		}
		return String(v);
	}-*/;

	public final native JsArrayString getList(String key) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var v = peer[key];
		if (v == null) {
			return null;
		}
		if (v instanceof Array) {
			return v;
		}
		return [ String(v) ];
	}-*/;

	public final native void put(String key, String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer[key] = value;
	}-*/;

	public final native void put(String key, JsArrayString values) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer[key] = values;
	}-*/;

	public final void add(String key, String value) {
		JsArrayString values = getList(key);
		values.set(values.length(), value);
		put(key, values);
	}

	public final native void remove(String key) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		delete peer[key];
	}-*/;

	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.URLVariables();
	}-*/;

	private static native JavaScriptObject newInstance(String source) /*-{
		return new $wnd.runtime.flash.net.URLVariables(source);
	}-*/;

}
