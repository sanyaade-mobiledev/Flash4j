/************************************************************************
  LoaderContext.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class LoaderContext extends ProxyObject {

    protected LoaderContext(JavaScriptObject obj) {
        jsObj = obj;
    }

    public LoaderContext() {
        jsObj = newInstance();
    }

    public LoaderContext(boolean checkPolicyFile) {
        jsObj = newInstance(checkPolicyFile);
    }

    public LoaderContext(boolean checkPolicyFile, ApplicationDomain applicationDomain) {
        jsObj = newInstance(checkPolicyFile, applicationDomain);
    }

    public LoaderContext(boolean checkPolicyFile, ApplicationDomain applicationDomain, SecurityDomain securityDomain) {
        jsObj = newInstance(checkPolicyFile, applicationDomain, securityDomain);
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.system.LoaderContext;
    }-*/;

    public native boolean hasAllowCodeImport()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.allowCodeImport;
    }-*/;

    public native void allowCodeImport(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.allowCodeImport = value;
    }-*/;

    public native boolean hasAllowLoadBytesCodeExecution()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.allowLoadBytesCodeExecution;
    }-*/;

    public native void allowLoadBytesCodeExecution(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.allowLoadBytesCodeExecution = value;
    }-*/;

    public native ApplicationDomain getApplicationDomain()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.applicationDomain;
		return @com.emitrom.air4j.core.client.system.ApplicationDomain::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setApplicationDomain(ApplicationDomain value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.applicationDomain = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean doesCheckPolicyFile()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.checkPolicyFile;
    }-*/;

    public native void checkPolicyFile(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.checkPolicyFile = value;
    }-*/;

    public native SecurityDomain getSecurityDomain()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.securityDomain;
		return @com.emitrom.air4j.core.client.system.SecurityDomain::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setSecurityDomain(SecurityDomain value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.securityDomain = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.system.LoaderContext();
    }-*/;

    private static native JavaScriptObject newInstance(boolean checkPolicyFile) /*-{
		return new $wnd.runtime.flash.system.LoaderContext(checkPolicyFile);
    }-*/;

    private static native JavaScriptObject newInstance(boolean checkPolicyFile, ApplicationDomain applicationDomain) /*-{
		return new $wnd.runtime.flash.system.LoaderContext(checkPolicyFile,
				applicationDomain);
    }-*/;

    private static native JavaScriptObject newInstance(boolean checkPolicyFile, ApplicationDomain applicationDomain,
                    SecurityDomain securityDomain) /*-{
		return new $wnd.runtime.flash.system.LoaderContext(checkPolicyFile,
				applicationDomain, securityDomain);
    }-*/;

}
