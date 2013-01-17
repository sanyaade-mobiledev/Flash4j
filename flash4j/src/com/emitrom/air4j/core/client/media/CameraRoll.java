/************************************************************************
  CameraRoll.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.media;

import com.emitrom.air4j.core.client.display.BitmapData;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class CameraRoll extends EventDispatcher {

    public CameraRoll() {
        jsObj = newInstance();
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.media.CameraRoll;
    }-*/;

    protected CameraRoll(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean supportsAddBitmapData()/*-{
		return $wnd.runtime.flash.media.CameraRoll.supportsAddBitmapData;
    }-*/;

    public final native void addBitmapData(BitmapData bitmapData) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addBitmapData(bitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newInstance()/*-{
		return new $wnd.runtime.flash.media.CameraRoll();
    }-*/;

}
