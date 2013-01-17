/************************************************************************
  JPEGEncoder.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.utils;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.display.BitmapData;
import com.google.gwt.core.client.JavaScriptObject;

public class JPEGEncoder extends ProxyObject {

    private static final JPEGEncoder INSTANCE = new JPEGEncoder();

    public JPEGEncoder() {
        jsObj = newInstance();
    }

    public static JPEGEncoder getDefault() {
        return INSTANCE;
    }

    public JPEGEncoder(double quality) {
        jsObj = newInstance(quality);
    }

    protected JPEGEncoder(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native ByteArray encode(BitmapData data) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.encode(data.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.com.adobe.images.JPGEncoder();
    }-*/;

    private static native JavaScriptObject newInstance(double quality) /*-{
		return new $wnd.runtime.com.adobe.images.JPGEncoder(quality);
    }-*/;

}
