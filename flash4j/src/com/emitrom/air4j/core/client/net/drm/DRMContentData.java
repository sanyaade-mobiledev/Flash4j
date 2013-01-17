/************************************************************************
  DRMContentData.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class DRMContentData extends ProxyObject {

    protected DRMContentData(JavaScriptObject obj) {
        jsObj = obj;
    }

    public DRMContentData() {
        jsObj = newInstance();
    }

    public DRMContentData(ByteArray rawData) {
        jsObj = newInstance(rawData);
    }

    public AuthenticationMethod getAuthenticationMethod() {
        return AuthenticationMethod.fromValue(_getAuthenticationMethod());
    }

    private native String _getAuthenticationMethod()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.authenticationMethod;
    }-*/;

    public void setAuthenticationMethod(AuthenticationMethod method) {
        _setAuthentocationMethod(method.value);
    }

    private native void _setAuthentocationMethod(String value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.authenticationMethod = value;
    }-*/;

    public native String getDomain()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.domain;
    }-*/;

    public native String getLicenseID()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.licenseID;
    }-*/;

    public native String getServerURL()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.serverURL;
    }-*/;

    private static native JavaScriptObject newInstance()/*-{
		return new $wnd.runtime.flash.net.drm.DRMContentData();
    }-*/;

    private static native JavaScriptObject newInstance(ByteArray data)/*-{
		return new $wnd.runtime.flash.net.drm.DRMContentData(
				data.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
