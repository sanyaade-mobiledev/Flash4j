/************************************************************************
  Camera.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class Camera extends EventDispatcher {

    private static final Camera INSTANCE = new Camera(getInstance());

    public static Camera get() {
        return INSTANCE;
    }

    public static Camera get(String name) {
        return new Camera(getInstance(name));
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.media.Camera;
    }-*/;

    protected Camera(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native double getActivityLevel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.activityLevel;
    }-*/;

    public native int getBandWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bandwidth;
    }-*/;

    public native double getCurrentFPS() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.currentFPS;
    }-*/;

    public native double getFPS() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.fps;
    }-*/;

    public native int getHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.height;
    }-*/;

    public native int getIndex() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.index;
    }-*/;

    public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.media.Camera.isSuported;
    }-*/;

    public native int getKeyFrameInterval() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.keyFrameInterval;
    }-*/;

    public native boolean isLoopBack() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.loopback;
    }-*/;

    public native int getMotionLevel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.motionLevel;
    }-*/;

    public native int getMotionTimeout() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.motionTimeout;
    }-*/;

    public native boolean isMute() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.mute;
    }-*/;

    public native String getName() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.name;
    }-*/;

    public static native JsArrayString getNames() /*-{
		return $wnd.runtime.flash.media.Camera.names;
    }-*/;

    public native int getQuality() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.quality;
    }-*/;

    public native int getWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.width;
    }-*/;

    public native void setKeyFrameInterval(int keyFrameInterval) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setKeyFrameInterval(keyFrameInterval);
    }-*/;

    public native void setLoopback() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setLoopback();
    }-*/;

    public native void setLoopback(boolean compress) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setLoopback(compress);
    }-*/;

    public native void setMode(int width, int height, double fps) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setMode(width, height, fps);
    }-*/;

    public native void setMode(int width, int height, double fps, boolean favorArea) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setMode(width, height, fps, favorArea);
    }-*/;

    public native void setMotionLevel(int motionLevel) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setMotionLevel(motionLevel);
    }-*/;

    private static native JavaScriptObject getInstance() /*-{
		return $wnd.runtime.flash.media.Camera.getCamera();
    }-*/;

    private static native JavaScriptObject getInstance(String name) /*-{
		return $wnd.runtime.flash.media.Camera.getCamera(name);
    }-*/;

    public native void setMotionLevel(int motionLevel, int timeout) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setMotionLevel(motionLevel, timeout);
    }-*/;

    public native void setQuality(int bandwith, int quality) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setQuality(bandwith, quality);
    }-*/;
}
