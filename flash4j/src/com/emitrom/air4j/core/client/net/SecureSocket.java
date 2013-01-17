/************************************************************************
  SecureSocket.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.google.gwt.core.client.JavaScriptObject;

public class SecureSocket extends Socket {

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flah.net.SecureSocket;
	}-*/;

	protected SecureSocket(JavaScriptObject obj) {
		jsObj = obj;
	}

	public SecureSocket() {
		jsObj = newInstance();
	}

	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.SecureSocket();
	}-*/;

	public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.net.SecureSocket.isSupported;
	}-*/;

	public native String getServerCertificateStatus() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.serverCertificateStatus;
	}-*/;

}
