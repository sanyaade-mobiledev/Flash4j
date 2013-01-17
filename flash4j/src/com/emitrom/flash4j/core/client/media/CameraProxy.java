/************************************************************************
  CameraProxy.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.media;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

class CameraProxy extends ProxyObject {
    public static final CameraProxy INSTANCE = new CameraProxy();

    private CameraProxy() {
        jsObj = createNativePeer();
    }

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.emitrom.flash4j.libs.factories.CameraProxy");
    }

    native JavaScriptObject createCamera()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createCamera();
    }-*/;

    native JavaScriptObject createCamera(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createCamera(name);
    }-*/;

    native boolean isCameraSupported()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isCameraSupported();
    }-*/;

    native JsArrayString getCameraNames()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getCameraNames();
    }-*/;

}
