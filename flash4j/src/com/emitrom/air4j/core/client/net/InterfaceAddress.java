/************************************************************************
  InterfaceAddress.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class InterfaceAddress extends ProxyObject {

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flah.net.InterfaceAdress;
	}-*/;

	protected InterfaceAddress(JavaScriptObject obj) {
		jsObj = obj;
	}

	public native String getAddress() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.address;
	}-*/;

	public native String getBroadcast() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.broadcast;
	}-*/;

	public native String getIpVersion() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.ipVersion;
	}-*/;

	public native int getPrefixLength() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.prefixLength;
	}-*/;

}
