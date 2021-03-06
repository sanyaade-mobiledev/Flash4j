/************************************************************************
  VideoDisplay.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.spark;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The VideoDisplay class is chromeless video player that supports progressive
 * download, multi-bitrate, and streaming video. VideoDisplay is the chromeless
 * version that does not support skinning. It is useful when you do not want the
 * user to interact with the control.
 * 
 */

public class VideoDisplay extends UIComponent {

    VideoDisplay(JavaScriptObject obj) {
        jsObj = obj;
    }

    public VideoDisplay() {
        jsObj = Bridge.createObject("spark.components.VideoDisplay");
    }

    public VideoDisplay(String source) {
        this();
        setSource(source);
    }

    public VideoDisplay(String source, boolean autoPlay) {
        this(source);
        setAutoPlay(autoPlay);
    }

    public native boolean autoDisplayFirstFrame()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoDisplayFirstFrame();
    }-*/;

    public native void setAutoDisplayFirstFrame(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoDisplayFirstFrame(value);
    }-*/;

    public native boolean isAutoPlay()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoPlay();
    }-*/;

    public native void setAutoPlay(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setautoPlay(value);
    }-*/;

    public native boolean isAutoRewind()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoRewind();
    }-*/;

    public native void setAutoRewind(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoRewind(value);
    }-*/;

    /**
     * [read-only] The number of bytes of data that have been downloaded into
     * the application.
     * 
     * @return
     */
    public native int getBytesLoaded()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbytesLoaded();
    }-*/;

    public native int getBytesTotal()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbytesTotal();
    }-*/;

    /**
     * Current time of the playhead, measured in seconds, since the video
     * starting playing.
     * 
     * @return
     */
    public native int getCurrentTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentTime();
    }-*/;

    public native void setSource(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsource(value);
    }-*/;

    // TODO Finish me

}
