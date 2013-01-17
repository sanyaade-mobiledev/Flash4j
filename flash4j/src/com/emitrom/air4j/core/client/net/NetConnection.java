/************************************************************************
  NetConnection.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class NetConnection extends EventDispatcher {

	protected NetConnection(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.NetConnection;
	}-*/;

	public NetConnection() {
		jsObj = newInstance();
	}

	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.NetConnection();
	}-*/;

	public native <T> T getClient() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.client;
	}-*/;

	public native void setClient(Object client) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.client = client;
	}-*/;

	public native boolean isConnected() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.connected;
	}-*/;

	public native String getConnectedProxyType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.connectedProxyType;
	}-*/;

	public static ObjectEncoding getDefaultObjectEncoding() {
		return ObjectEncoding.fromValue(_getDefaultObjectEncoding());
	}

	private static native int _getDefaultObjectEncoding() /*-{
		return $wnd.runtime.flash.net.NetConnection.defaultObjectEncoding;
	}-*/;

	public static void setDefaultObjectEncoding(ObjectEncoding encoding) {
		setDefaultObjectEncoding(encoding.value);
	}

	private static native void setDefaultObjectEncoding(int value) /*-{
		$wnd.runtime.flash.net.NetConnection.defaultObjectEncoding = value;
	}-*/;

	public native String getFarID() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.farID;
	}-*/;

	public native String getFarNonce() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.farNonce;
	}-*/;

	public native int getMaxPeerConnections() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.maxPeerConnections;
	}-*/;

	public native void setMaxPeerConnections(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.maxPeerConnections = value;
	}-*/;

	public native String getNearID() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.nearID;
	}-*/;

	public native String getNearNonce() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.nearNonce;
	}-*/;

	public ObjectEncoding getObjectEncoding() {
		return ObjectEncoding.fromValue(_getObjectEncoding());
	}

	private native int _getObjectEncoding() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.objectEncoding;
	}-*/;

	public void setObjectEncoding(ObjectEncoding encoding) {
		setObjectEncoding(encoding.value);
	}

	private native void setObjectEncoding(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.objectEncoding = value;
	}-*/;

	public native String getProtocol() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.protocol;
	}-*/;

	public native String getProxyType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.proxyType;
	}-*/;

	public native void setProxyType(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.proxyType = value;
	}-*/;

	public native JavaScriptObject getUnconnectedStream() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.unconnectedPeerStream;
	}-*/;

	public native String getURI() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.uri;
	}-*/;

	public native boolean isUsingTLS() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.usingTLS;
	}-*/;

	public native void addHeader(String operation) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addHeader(operation);
	}-*/;

	public native void addHeader(String operation, boolean mustUnderstand) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addHeader(operation, mustUnderstand);
	}-*/;

	public native void addHeader(String operation, boolean mustUnderstand,
			Object param) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addHeader(operation, mustUnderstand, param);
	}-*/;

	public native void call(String command, Responder responder,
			String... arguments) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.call.apply(command, responder, arguments);
	}-*/;

	public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.close();
	}-*/;

	public native void connect(String comment, String... arguments) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.connect.apply(comment, arguments);
	}-*/;

}
