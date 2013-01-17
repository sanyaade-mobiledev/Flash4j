/************************************************************************
  DataGramSocket.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class DataGramSocket extends EventDispatcher {

    protected DataGramSocket(JavaScriptObject obj) {
        jsObj = obj;
    }

    public DataGramSocket() {
        jsObj = newIstance();
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.DataGramSocket;
    }-*/;

    public native boolean isBound() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bound;
    }-*/;

    public native boolean isConnected() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.connected;
    }-*/;

    public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.net.DataGramSocket.isSupported;
    }-*/;

    public native String getLocalAddress() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localAddress
    }-*/;

    public native int getLocalPort() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localPort
    }-*/;

    public native String getRemoteAddress() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.remoteAddress
    }-*/;

    public native int getRemotePort() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.remotePort
    }-*/;

    public native void bind() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bind();
    }-*/;

    public native void bind(int localPort, String localAddress) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bind(localPort, localAddress);
    }-*/;

    public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
    }-*/;

    public native void connect(String remoteAddress, int remotePort) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.connect(remoteAddress, remotePort);
    }-*/;

    public native void receive() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.receive();
    }-*/;

    public native void send(ByteArray bytes) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.send(bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void send(ByteArray bytes, int offset) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.send(
				bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				offset);
    }-*/;

    public native void send(ByteArray bytes, int offset, int length) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.send(
				bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				offset, length);
    }-*/;

    public native void send(ByteArray bytes, int offset, int length, String address) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.send(
				bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				offset, length, address);
    }-*/;

    public native void send(ByteArray bytes, int offset, int length, String address, int port) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.send(
				bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				offset, length, address, port);
    }-*/;

    private static native JavaScriptObject newIstance() /*-{
		return new $wnd.runtime.flash.net.DataGramSocket();
    }-*/;

}
