/************************************************************************
  DRMAuthenticateEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.net.NetStream;
import com.google.gwt.core.client.JavaScriptObject;

public class DRMAuthenticateEvent extends Event {

    public static final String AUTHENTICATION_TYPE_DRM = getConstant("AUTHENTICATION_TYPE_DRM");
    public static final String AUTHENTICATION_TYPE_PROXY = getConstant("AUTHENTICATION_TYPE_PROXY");
    public static final String DRM_AUTHENTICATE = getConstant("DRM_AUTHENTICATE");

    protected DRMAuthenticateEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.DRMAuthenticateEvent[name];
    }-*/;

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.DRMAuthenticateEvent;
    }-*/;

    public final native String getAuthenticationType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.authenticationType;
    }-*/;

    public final native String getHeader() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.header;
    }-*/;

    public final native NetStream getNetStream() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.netstream;
		return @com.emitrom.air4j.core.client.net.NetStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native String getPasswordPrompt() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.passwordPrompt;
    }-*/;

    public final native String getUrlPrompt() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.urlPrompt;
    }-*/;

    public final native String getUserNamePrompt() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.usernamePrompt;
    }-*/;

    public static DRMAuthenticateEvent cast(Event e) {
        return new DRMAuthenticateEvent(e.getJsObj());
    }

}
