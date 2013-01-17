/************************************************************************
  LocalConnection.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

public class LocalConnection extends EventDispatcher {

	protected LocalConnection(JavaScriptObject obj) {
		jsObj = obj;
	}

	public LocalConnection() {
		jsObj = newInstance();
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.LocalConnection;
	}-*/;

	public native void allDomain(String... domain) /*-{
		peer.allowDomain.apply(domain);
	}-*/;

	public native void allowInSecureDomain(String... inSecureDomain) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.allowInsecureDomain.apply(inSecureDomain);
	}-*/;

	public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
	}-*/;

	public native void connect(String connectionName) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.connect(connectionName);
	}-*/;

	public native void send(String connectionName, String methodName,
			String... arguments) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.send.apply(connectionName, methodName, arguments);
	}-*/;

	public native <T> T getClient() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.client;
	}-*/;

	public native void setClient(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.client = value;
	}-*/;

	public native String getDomain() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.domain;
	}-*/;

	public native boolean isPerUser() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isPerUser;
	}-*/;

	public native void setIsPeerUser(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.isPeerUser = value;
	}-*/;

	public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.net.LocalConnection.isSupported;
	}-*/;

	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.LocalConnection();
	}-*/;
}
