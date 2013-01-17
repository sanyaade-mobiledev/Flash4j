/************************************************************************
  Video.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.display.DisplayObject;
import com.emitrom.air4j.core.client.net.NetStream;
import com.google.gwt.core.client.JavaScriptObject;

public class Video extends DisplayObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.media.Video;
    }-*/;

    public Video() {
        jsObj = newInstance();
    }

    public Video(int width, int height) {
        jsObj = newInstance(width, height);
    }

    protected Video(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getDeblocking()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.deblocking;
    }-*/;

    public native void setDeblocking(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.deblocking = value;
    }-*/;

    public native boolean isSmoothing()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.smoothing;
    }-*/;

    public native void setSmoothing(double value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.smoothing = value;
    }-*/;

    public native int getVideoHeight()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.videoHeight;
    }-*/;

    public native int getVideoWidth()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.videoWidth;
    }-*/;

    public native void attachCamera(Camera camera)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.attachCamera(camera.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void attachNetStream(NetStream netStream)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.attachNetStream(netStream.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void clear()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clear();
    }-*/;

    private static native JavaScriptObject newInstance()/*-{
		return new $wnd.runtime.flash.media.Video();
    }-*/;

    private static native JavaScriptObject newInstance(int width, int height)/*-{
		return new $wnd.runtime.flash.media.Video(width, height);
    }-*/;
}
