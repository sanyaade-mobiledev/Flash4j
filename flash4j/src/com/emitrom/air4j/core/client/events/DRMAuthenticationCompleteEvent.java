/************************************************************************
  DRMAuthenticationCompleteEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.google.gwt.core.client.JavaScriptObject;

public class DRMAuthenticationCompleteEvent extends Event {

    public static final String AUTHENTICATION_COMPLETE = getConstant("AUTHENTICATION_COMPLETE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.DRMAuthenticationCompleteEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.DRMAuthenticationCompleteEvent[name];
    }-*/;

    protected DRMAuthenticationCompleteEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native String getDomain() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.domain;
    }-*/;

    public final native void setDomain(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.domain = value;
    }-*/;

    public final native String getServerURL() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.serverURL;
    }-*/;

    public final native void setServerURL(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.serverURL = value;
    }-*/;

    public final native String getToken() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.token;
    }-*/;

    public final native void setToken(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.token = value;
    }-*/;

    public static DRMAuthenticationCompleteEvent cast(Event e) {
        return new DRMAuthenticationCompleteEvent(e.getJsObj());
    }

}
