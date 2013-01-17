/************************************************************************
  Bitmap.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class Bitmap extends DisplayObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.Bipmap;
    }-*/;

    public Bitmap() {
        jsObj = newIstance();
    }

    public Bitmap(BitmapData data) {
        jsObj = newIstance(data);
    }

    public Bitmap(BitmapData data, String pixelSnapping) {
        jsObj = newIstance(data, pixelSnapping);
    }

    public Bitmap(BitmapData data, String pixelSnapping, boolean smoothing) {
        jsObj = newIstance(data, pixelSnapping, smoothing);
    }

    protected Bitmap(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native BitmapData getBitmapData() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.bitmapData;
		return @com.emitrom.air4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setBitmapData(BitmapData value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bitmapData = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		;
    }-*/;

    public native String getPixelSnapping() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pixelSnapping;
    }-*/;

    public native void setPixelSnapping(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.pixelSnapping = value;
    }-*/;

    public native String isSmoothing() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.smoothing;
    }-*/;

    public native String smoothing(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.smoothing = value;
    }-*/;

    private static native JavaScriptObject newIstance() /*-{
		return new $wnd.runtime.flash.display.Bitmap();
    }-*/;

    private static native JavaScriptObject newIstance(BitmapData data) /*-{
		return new $wnd.runtime.flash.display.Bitmap(data);
    }-*/;

    private static native JavaScriptObject newIstance(BitmapData data, String pixelSnapping) /*-{
		return new $wnd.runtime.flash.display.Bitmap(data, pixelSnapping);
    }-*/;

    private static native JavaScriptObject newIstance(BitmapData data, String pixelSnapping, boolean smoothing) /*-{
		return new $wnd.runtime.flash.display.Bitmap(data, pixelSnapping,
				smoothing);
    }-*/;

    public static Bitmap from(JavaScriptObject obj) {
        return new Bitmap(obj);
    }
}
