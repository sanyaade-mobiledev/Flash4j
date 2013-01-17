/************************************************************************
  ApplicationDomain.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class ApplicationDomain extends ProxyObject {

    public static int MIN_DOMAIN_MEMORY_LENGTH = getConstant();
    private static final ApplicationDomain CURRENT = new ApplicationDomain(_getCurrentDomain());
    private static final ApplicationDomain PARENT = new ApplicationDomain(_getParentDomain());

    protected ApplicationDomain(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static ApplicationDomain getCurrentDomain() {
        return CURRENT;
    }

    public static ApplicationDomain getParent() {
        return PARENT;
    }

    public ApplicationDomain() {
        jsObj = newInstance();
    }

    public ApplicationDomain(ApplicationDomain parent) {
        jsObj = newInstance(parent);
    }

    private static native int getConstant()/*-{
		return $wnd.runtime.flash.system.ApplicationDomain.MIN_DOMAIN_MEMORY_LENGTH;
    }-*/;

    public native ByteArray getDomainMemory() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.domainMemory;
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setDomainMemory(ByteArray memory) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.domainMemory = memory.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native Object getDefinition(String name)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getDefinition(name);
    }-*/;

    public native boolean hasDefinition(String name)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.hasDefinition(name);
    }-*/;

    private static native JavaScriptObject _getParentDomain() /*-{
		return $wnd.runtime.flash.system.ApplicationDomain.parentDomain;
    }-*/;

    private static native JavaScriptObject newInstance()/*-{
		return $wnd.runtime.flash.system.ApplicationDomain();
    }-*/;

    private static native JavaScriptObject newInstance(ApplicationDomain parentDomain)/*-{
		return$wnd.runtime.flash.system
				.ApplicationDomain(parentDomain.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject _getCurrentDomain() /*-{
		return $wnd.runtime.flash.system.ApplicationDomain.currentDomain;
    }-*/;

}
