/************************************************************************
  ServiceMonitor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class ServiceMonitor extends EventDispatcher {

    public ServiceMonitor() {
        jsObj = newInstance();
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.air.net.ServiceMonitor;
    }-*/;

    protected ServiceMonitor(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.air.net.ServiceMonitor();
    }-*/;

    public native boolean isAvailable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.available;
    }-*/;

    public native void setAvailable(boolean available) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.available = available;
    }-*/;

    public native double getLastStatusUpdate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.lastStatusUpdate();
    }-*/;

    public native int getPollInterval() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pollInterval;
    }-*/;

    public native void setPollInterval(int pollInterval) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.pollInterval = pollInterval;
    }-*/;

    public native boolean isRunning() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.running;
    }-*/;

    public native void start() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.start();
    }-*/;

    public native void stop() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;

    protected native void checkStatus()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.checkStatus();
    }-*/;

}
