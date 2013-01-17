/************************************************************************
  JPEGEncoderOptions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.display;

import com.google.gwt.core.client.JavaScriptObject;

public class JPEGEncoderOptions extends BitmapEncoderOptions {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.JPEGEncoderOptions;
    }-*/;

    public JPEGEncoderOptions() {
        jsObj = newInstance();
    }

    public JPEGEncoderOptions(int quality) {
        jsObj = newInstance(quality);
    }

    protected JPEGEncoderOptions(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getQuality() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.quality;
    }-*/;

    public native void setQuality(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.quality = value;
    }-*/;

    private static native JavaScriptObject newInstance()/*-{
		return new $wnd.runtime.flash.display.JPEGEncoderOptions();
    }-*/;

    private static native JavaScriptObject newInstance(int quality)/*-{
		return new $wnd.runtime.flash.display.JPEGEncoderOptions(quality);
    }-*/;

}
