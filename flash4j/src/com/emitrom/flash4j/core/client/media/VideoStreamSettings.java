/************************************************************************
  VideoStreamSettings.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class VideoStreamSettings extends ProxyObject {

    public VideoStreamSettings() {
        jsObj = createNativePeer();
    }

    protected VideoStreamSettings(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Retrieve the maximum amount of bandwidth that the current outgoing video
     * feed can use, in bytes per second.
     */
    public native int getBandWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbandWidth();
    }-*/;

    /**
     * Video codec used for compression.
     */
    public native String getCodec()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcodec();
    }-*/;

    /**
     * The maximum frame rate at which the video frames are encoded, in frames
     * per second.
     */
    public native double getFps()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfps();
    }-*/;

    /**
     * The current encoded height, in pixels.
     */
    public native int getHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * The number of video frames transmitted in full (called keyframes or IDR
     * frames) instead of being interpolated by the video compression algorithm.
     */
    public native int getKeyFrameInterval()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getkeyFrameInterval();
    }-*/;

    /**
     * The required level of picture quality, as determined by the amount of
     * compression being applied to each video frame.
     */
    public native int getQuality()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getquality();
    }-*/;

    /**
     * The current encoded width, in pixels.
     */
    public native int getWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * The number of video frames transmitted in full (called keyframes or
     * Instantaneous Decoding Refresh (IDR) frames) instead of being
     * interpolated by the video compression algorithm.
     */
    public native void setKeyFrameInterval(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setKeyFrameInterval(value);
    }-*/;

    /**
     * Sets the resolution and frame rate used for video encoding.
     */
    public native void setMode(int width, int height, double fps)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setMode(width, height, fps);
    }-*/;

    /**
     * Sets maximum amount of bandwidth per second or the required picture
     * quality that the current outgoing video feed can use.
     */
    public native void setQuality(int bandWidth, int quality)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setQuality(bandWidth, quality);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.media.VideoStreamSettings");
    }
}
