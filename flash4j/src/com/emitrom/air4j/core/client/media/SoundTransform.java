/************************************************************************
  SoundTransform.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public final class SoundTransform extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.media.SoundTransform;
    }-*/;

    protected SoundTransform(JavaScriptObject obj) {
        jsObj = obj;
    }

    public SoundTransform() {
        jsObj = newInstance();
    }

    public SoundTransform(double volume) {
        jsObj = newInstance(volume);
    }

    public SoundTransform(double volume, double panning) {
        jsObj = newInstance(volume, panning);
    }

    public native double getLeftToLeft() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.leftToLeft;
    }-*/;

    public native void setLeftToLeft(double leftToLeft) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.leftToLeft = leftToLeft;
    }-*/;

    public native double getLeftToRight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.leftToRight;
    }-*/;

    public native void setLeftToRight(double leftToRight) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.leftToRight = leftToRight;
    }-*/;

    public native double getPan() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pan;
    }-*/;

    public native void setPan(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.pan = value;
    }-*/;

    public native double getRightToLeft() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rightToLeft;
    }-*/;

    public native void setRightToLeft(double rightToLeft) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rightToLeft = rightToLeft;
    }-*/;

    public native double getRightToRight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rightToRight;
    }-*/;

    public native void setRightToRight(double rightToRight) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rightToRight = rightToRight;
    }-*/;

    public native double getVolume() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.volume;
    }-*/;

    public native void setVolume(double volume) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.volume = volume;
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.media.SoundTransform();
    }-*/;

    private static native JavaScriptObject newInstance(double vol) /*-{
		return new $wnd.runtime.flash.media.SoundTransform(vol);
    }-*/;

    private static native JavaScriptObject newInstance(double vol, double panning) /*-{
		return new $wnd.runtime.flash.media.SoundTransform(vol, panning);
    }-*/;
}
