/************************************************************************
  BrowserInvokeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.events;

import com.emitrom.air4j.core.client.system.SandboxType;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class BrowserInvokeEvent extends Event {

    public static String BROWSER_INVOKE = getConstant("BROWSER_INVOKE");

    protected BrowserInvokeEvent() {
    }

    protected BrowserInvokeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native JsArrayString getArguments() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.arguments;
    }-*/;

    public native boolean isHTTPS() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isHTTPS;
    }-*/;

    public native boolean isUserEvent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isUserEvent;
    }-*/;

    public SandboxType getSandboxType() {
        return SandboxType.fromValue(_getSandboxType());
    }

    public native String getSecurityDomain() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.securityDomain;
    }-*/;

    private native String _getSandboxType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sandboxType;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.BrowserInvokeEvent[name];
    }-*/;

    public static BrowserInvokeEvent cast(Event e) {
        return new BrowserInvokeEvent(e.getJsObj());
    }

}
