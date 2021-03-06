/************************************************************************
  NetworkInfo.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.air4j.core.client.toplevel.As3Vector;
import com.google.gwt.core.client.JavaScriptObject;

public class NetworkInfo extends EventDispatcher {

	private static final NetworkInfo INSTANCE = new NetworkInfo(getInstance());

	public static NetworkInfo get() {
		return INSTANCE;
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flah.net.NetworkInfo;
	}-*/;

	protected NetworkInfo(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.net.NetworkInfo.isSupported;
	}-*/;

	private static native JavaScriptObject getInstance() /*-{
		return $wnd.runtime.flash.net.NetworkInfo.networkInfo;
	}-*/;

	public native As3Vector findInterfaces()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.findInterfaces();
	}-*/;

}
