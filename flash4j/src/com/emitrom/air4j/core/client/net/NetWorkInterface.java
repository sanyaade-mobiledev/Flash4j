/************************************************************************
  NetWorkInterface.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class NetWorkInterface extends ProxyObject {

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flah.net.NetWorkInterface;
	}-*/;

	protected NetWorkInterface(JavaScriptObject obj) {
		jsObj = obj;
	}

	public native String isActive() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.active;
	}-*/;

	public native JavaScriptObject getAddresses() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.addresses;
	}-*/;

	public native String getDisplayName() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.displayName;
	}-*/;

	public native String getHardwareAdress() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.hardwareAddress;
	}-*/;

	public native int getMTU() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.mtu;
	}-*/;

	public native NetWorkInterface getParent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.parent;
		return @com.emitrom.air4j.core.client.net.NetWorkInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native JavaScriptObject getSubInterfaces() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.subInterfaces;
	}-*/;

}
