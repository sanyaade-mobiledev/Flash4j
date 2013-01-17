/************************************************************************
  JPEGXREncoderOptions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class JPEGXREncoderOptions extends BitmapEncoderOptions {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.JPEGEncoderOptions;
    }-*/;

    public JPEGXREncoderOptions() {
        jsObj = newInstance();
    }

    public JPEGXREncoderOptions(int quantization) {
        jsObj = newInstance(quantization);
    }

    public JPEGXREncoderOptions(int quantization, String colorSpace) {
        jsObj = newInstance(quantization, colorSpace);
    }

    public JPEGXREncoderOptions(int quantization, String colorSpace, int trimFlexBits) {
        jsObj = newInstance(quantization, colorSpace, trimFlexBits);
    }

    protected JPEGXREncoderOptions(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getQuantization() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.quantization;
    }-*/;

    public native void setQuantization(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.quantization = value;
    }-*/;

    public native String getColorSpace() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.colorSpace;
    }-*/;

    public native void setTrimFlexBits(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.trimFlexBits = value;
    }-*/;

    public native String getTrimFlexBits() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.trimFlexBits;
    }-*/;

    public native void setColorSpace(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.colorSpace = value;
    }-*/;

    private static native JavaScriptObject newInstance()/*-{
		return new $wnd.runtime.flash.display.JPEGXREncoderOptions();
    }-*/;

    private static native JavaScriptObject newInstance(int quantization)/*-{
		return new $wnd.runtime.flash.display.JPEGXREncoderOptions(quantization);
    }-*/;

    private static native JavaScriptObject newInstance(int quantization, String colorSpace)/*-{
		return new $wnd.runtime.flash.display.JPEGXREncoderOptions(
				quantization, colorSpace);
    }-*/;

    private static native JavaScriptObject newInstance(int quantization, String colorSpace, int trimFlexBits)/*-{
		return new $wnd.runtime.flash.display.JPEGXREncoderOptions(
				quantization, colorSpace, trimFlexBits);
    }-*/;

}
