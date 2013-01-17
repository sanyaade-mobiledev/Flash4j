/************************************************************************
  URLStream.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
/*
 *   
 */
package com.emitrom.air4j.core.client.net;

import com.emitrom.air4j.core.client.utils.IoClass;
import com.google.gwt.core.client.JavaScriptObject;

public class URLStream extends IoClass {

	protected URLStream(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.URLStream;
	}-*/;

	/**
	 * /** [read-only] Indicates whether peer URLStream object is currently
	 * connected.
	 */
	public native boolean isConnected() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.connected;
	}-*/;

	/** Immediately closes the stream and cancels the download operation. */
	public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
	}-*/;

	/** Begins downloading the URL specified in the request parameter */
	public native void load(URLRequest request) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.load(request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
	}-*/;

}
