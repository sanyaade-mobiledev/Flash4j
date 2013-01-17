/************************************************************************
  URLMonitor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.servicemonitor.client;

import com.emitrom.air4j.core.client.net.URLRequest;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;

public class URLMonitor extends ServiceMonitor {

    public URLMonitor(URLRequest urlRequest) {
        jsObj = newInstance(urlRequest);
    }

    public URLMonitor(URLRequest urlRequest, JsArrayInteger acceptableStatusCodes) {
        jsObj = newInstance(urlRequest, acceptableStatusCodes);
    }

    public URLMonitor(URLRequest urlRequest, int... acceptableStatusCodes) {
        JsArrayInteger peers = JsArrayInteger.createArray().cast();
        for (int i : acceptableStatusCodes) {
            peers.push(i);
        }
        jsObj = newInstance(urlRequest, peers);
    }

    public URLMonitor(String urlRequest, JsArrayInteger acceptableStatusCodes) {
        this(new URLRequest(urlRequest), acceptableStatusCodes);
    }

    public URLMonitor(String urlRequest, int... acceptableStatusCodes) {
        this(new URLRequest(urlRequest), acceptableStatusCodes);
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.air.net.URLMonitor;
    }-*/;

    private static native JavaScriptObject newInstance(URLRequest urlRequest) /*-{
		return new $wnd.runtime.air.net.URLMonitor(
				urlRequest.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newInstance(URLRequest urlRequest, JsArrayInteger acceptableStatusCodes) /*-{
		return new $wnd.runtime.air.net.URLMonitor(
				urlRequest.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				acceptableStatusCodes);
    }-*/;

    protected URLMonitor(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native URLRequest getURLRequest() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.urlRequest;
    }-*/;

    public final native JsArrayInteger getAcceptableStatusCodes() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.acceptableStatusCodes;
    }-*/;

}
