/************************************************************************
  Security.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.system;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public final class Security extends ProxyObject {

    private static final Security INSTANCE = new Security(getInstance());

    public Security get() {
        return INSTANCE;
    }

    protected Security(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native boolean exactSettings() /*-{
		return peer.exactSettings;
    }-*/;

    public native void setExactSettings(boolean exactSettings) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.exactSettings = exactSettings;
    }-*/;

    public SandboxType getSandboxType() {
        return SandboxType.fromValue(getSandboxType0());
    }

    private native String getSandboxType0() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sandboxType;
    }-*/;

    public native void loadPolicyFile(String url) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.loadPolicyFile(url);
    }-*/;

    public native void allowDomain(Object... args) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.allowDomain.apply(args);
    }-*/;

    public native void allowInsecureDomain(Object... args) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.allowInsecureDomain.apply(args);
    }-*/;

    public native void showSettings() /*-{
		peer.showSettings();
    }-*/;

    public native void showSettings(String panel) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.showSettings(panel);
    }-*/;

    private static native JavaScriptObject getInstance() /*-{
		return $wnd.runtime.flash.system.Security;
    }-*/;

}
