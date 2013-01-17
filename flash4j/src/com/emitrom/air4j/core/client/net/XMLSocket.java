/************************************************************************
  XMLSocket.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class XMLSocket extends EventDispatcher {

	protected XMLSocket(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.XMLSocket;
	}-*/;

	public XMLSocket() {
		jsObj = newInstance();
	}

	public XMLSocket(String host, int port) {
		jsObj = newInstance(host, port);
	}

	public native boolean isConnected() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.connected;
	}-*/;

	public native int getTimeout() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.timeout;
	}-*/;

	public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
	}-*/;

	public native void connect(String host, int port) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.connect(host, port);
	}-*/;

	public native void send(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.send(value);
	}-*/;

	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.XMLSocket();
	}-*/;

	private static native JavaScriptObject newInstance(String host, int port) /*-{
		return new $wnd.runtime.flash.net.XMLSocket(host, port);
	}-*/;

}
