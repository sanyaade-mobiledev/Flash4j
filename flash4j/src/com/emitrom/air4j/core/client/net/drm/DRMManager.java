/************************************************************************
  DRMManager.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.net.drm;

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class DRMManager extends EventDispatcher {

    private static final DRMManager INSTANCE = new DRMManager(_get());

    public static DRMManager get() {
        return INSTANCE;
    }

    protected DRMManager(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void authenticate(String serverURL, String domain, String userName, String password)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.authenticate(serverURL, domain, userName, password);
    }-*/;

    public native void loadVoucher(DRMContentData drmContentData, String setting)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.loadVoucher(
						drmContentData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						setting);
    }-*/;

    public native void resetDRMVouchers()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.resetDRMVouchers();
    }-*/;

    public native void setAuthenticationToken(String serverURL, String domain, ByteArray token)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setAuthenticationToken(serverURL, domain,
				token.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject _get()/*-{
		return $wnd.runtime.flash.net.drm.DRMManager.getDRMManager();
    }-*/;

}
