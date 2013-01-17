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
package com.emitrom.flash4j.flex.client.mx.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.media.Camera;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class VideoDisplay.
 */
public class VideoDisplay extends UIComponent {

    /**
     * Instantiates a new video display.
     */
    protected VideoDisplay(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the video display
     */
    public VideoDisplay() {
        jsObj = Bridge.createObject("mx.controls.VideoDisplay");
    }

    /**
     * Auto band with direction.
     * 
     * @return true, if successful
     */
    public native boolean autoBandWithDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoBandWithDirection();
    }-*/;

    /**
     * Sets the auto band with direction.
     * 
     * @param value the new auto band with direction
     */
    public native void setAutoBandWithDirection(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoBandWithDirection(value);
    }-*/;

    /**
     * Auto play.
     * 
     * @return true, if successful
     */
    public native boolean autoPlay()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoPlay();
    }-*/;

    /**
     * Sets the auto play.
     * 
     * @param value the new auto play
     */
    public native void setAutoPlay(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoPlay(value);
    }-*/;

    /**
     * Auto rewind.
     * 
     * @return true, if successful
     */
    public native boolean autoRewind()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoRewind();
    }-*/;

    /**
     * Sets the auto rewind.
     * 
     * @param value the new auto rewind
     */
    public native void setAutoRewind(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoRewind(value);
    }-*/;

    /**
     * Gets the buffer time.
     * 
     * @return the buffer time
     */
    public native double getBufferTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbufferTime();
    }-*/;

    /**
     * Sets the buffer time.
     * 
     * @param value the new buffer time
     */
    public native void setBufferTime(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbufferTime(value);
    }-*/;

    /**
     * Gets the bytes loaded.
     * 
     * @return the bytes loaded
     */
    public native int getBytesLoaded()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbytesLoaded();
    }-*/;

    /**
     * Gets the bytes total.
     * 
     * @return the bytes total
     */
    public native int getBytesTotal()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbytesTotal();
    }-*/;

    /**
     * Gets the idle time out.
     * 
     * @return the idle time out
     */
    public native int getIdleTimeOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getidleTimeOut();
    }-*/;

    /**
     * Sets the idle time out.
     * 
     * @param value the new idle time out
     */
    public native void setIdleTimeOut(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setidleTimeOut(value);
    }-*/;

    /**
     * Checks if is live.
     * 
     * @return true, if is live
     */
    public native boolean isLive()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlive();
    }-*/;

    /**
     * Sets the live.
     * 
     * @param value the new live
     */
    public native void setLive(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlive(value);
    }-*/;

    /**
     * Maintain aspect ratio.
     * 
     * @return true, if successful
     */
    public native boolean maintainAspectRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaintainAspectRatio();
    }-*/;

    /**
     * Sets the maintain aspect ratio.
     * 
     * @param value the new maintain aspect ratio
     */
    public native void setMaintainAspectRatio(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaintainAspectRatio(value);
    }-*/;

    /**
     * Gets the metadata.
     * 
     * @param <T> the generic type
     * @return the metadata
     */
    public native <T extends JavaScriptObject> T getMetadata()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmetadata();
    }-*/;

    /**
     * Gets the play head time.
     * 
     * @return the play head time
     */
    public native double getPlayHeadTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getplayHeadTime();
    }-*/;

    /**
     * Sets the play head time.
     * 
     * @param value the new play head time
     */
    public native void setPlayHeadTime(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setplayHeadTime(value);
    }-*/;

    /**
     * Gets the playhead update interval.
     * 
     * @return the playhead update interval
     */
    public native double getPlayheadUpdateInterval()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getplayheadUpdateInterval();
    }-*/;

    /**
     * Checks if is playing.
     * 
     * @return true, if is playing
     */
    public native boolean isPlaying()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getplaying();
    }-*/;

    /**
     * Gets the progress interval.
     * 
     * @return the progress interval
     */
    public native int getProgressInterval()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getprogressInterval();
    }-*/;

    /**
     * Sets the progress interval.
     * 
     * @param value the new progress interval
     */
    public native void setProgressInterval(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprogressInterval(value);
    }-*/;

    /**
     * Gets the source.
     * 
     * @return the source
     */
    public native String getSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsource();
    }-*/;

    /**
     * Sets the source.
     * 
     * @param value the new source
     */
    public native void setSource(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsource(value);
    }-*/;

    /**
     * Gets the state.
     * 
     * @return the state
     */
    public native String getState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstate();
    }-*/;

    /**
     * State responsive.
     * 
     * @return true, if successful
     */
    public native boolean stateResponsive()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstateResponsive();
    }-*/;

    /**
     * Gets the total time.
     * 
     * @return the total time
     */
    public native double getTotalTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettotalTime();
    }-*/;

    /**
     * Sets the total time.
     * 
     * @param value the new total time
     */
    public native void setTotalTime(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settotalTime(value);
    }-*/;

    /**
     * Gets the video height.
     * 
     * @return the video height
     */
    public native int getVideoHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvideoHeight();
    }-*/;

    /**
     * Gets the video width.
     * 
     * @return the video width
     */
    public native int getVideoWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvideoWidth();
    }-*/;

    /**
     * Gets the volume.
     * 
     * @return the volume
     */
    public native double getVolume()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvolume();
    }-*/;

    /**
     * Sets the volume.
     * 
     * @param value the new volume
     */
    public native void setVolume(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvolume(value);
    }-*/;

    /**
     * Attach camera.
     * 
     * @param camera the camera
     */
    public native void attachCamera(Camera camera)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.attachCamera(camera.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Close.
     */
    public native void close()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Load.
     */
    public native void load()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.load();
    }-*/;

    /**
     * Pause.
     */
    public native void pause()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.pause();
    }-*/;

    /**
     * Play.
     */
    public native void play()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.play();
    }-*/;

    /**
     * Stop.
     */
    public native void stop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;
}
