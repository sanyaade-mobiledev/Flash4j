/************************************************************************
  TweenCore.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.tween.client.core;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * TweenCore is the base class for all TweenLite, TweenMax, TimelineLite, and
 * TimelineMax classes and provides core functionality and properties. There is
 * no reason to use this class directly.
 * 
 */
public class TweenCore extends ProxyObject {

    protected TweenCore(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected TweenCore() {

    }

    /**
     * Most recently rendered time (or frame for frames-based tweens/timelines)
     * according to its duration.
     * 
     */
    public native double getCurrentTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentTime();
    }-*/;

    /**
     * Most recently rendered time (or frame for frames-based tweens/timelines)
     * according to its duration.
     * 
     */
    public native void setCurrentTime(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcurrentTime(value);
    }-*/;

    /**
     * Length of time in seconds (or frames for frames-based tweens/timelines)
     * before the tween should begin.
     */
    public native double getDelay()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdelay();
    }-*/;

    /**
     * Length of time in seconds (or frames for frames-based tweens/timelines)
     * before the tween should begin.
     */
    public native void setDelay(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdelay(value);
    }-*/;

    /**
     * Duration of the tween in seconds (or frames for frames-based
     * tweens/timelines) not including any repeats or repeatDelays.
     */
    public native double getDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getduration();
    }-*/;

    /**
     * Duration of the tween in seconds (or frames for frames-based
     * tweens/timelines) not including any repeats or repeatDelays.
     */
    public native void setDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setduration(value);
    }-*/;

    /**
     * Indicates the paused state of the tween/timeline.
     */
    public native boolean isPaused()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpaused();
    }-*/;

    /**
     * Indicates the paused state of the tween/timeline.
     */
    public native void setPaused(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpaused(value);
    }-*/;

    /**
     * Indicates the reversed state of the tween/timeline.
     */
    public native boolean isReversed()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getreversed();
    }-*/;

    /**
     * Indicates the reversed state of the tween/timeline.
     */
    public native void setReversed(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setreversed(value);
    }-*/;

    /**
     * The parent timeline on which the tween/timeline is placed.
     */
    public native SimpleTimeLine getTimeLine()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettimeline();
		return @com.emitrom.flash4j.tween.client.core.SimpleTimeLine::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The parent timeline on which the tween/timeline is placed.
     */
    public native void setTimeLine(SimpleTimeLine value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settimeline(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Duration of the tween in seconds (or frames for frames-based
     * tweens/timelines) including any repeats or repeatDelays (which are only
     * available on TweenMax and TimelineMax).
     */
    public native double getTotalDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettotalDuration();
    }-*/;

    /**
     * Duration of the tween in seconds (or frames for frames-based
     * tweens/timelines) including any repeats or repeatDelays (which are only
     * available on TweenMax and TimelineMax).
     */
    public native void setTotalDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settotalDuration(value);
    }-*/;

    /**
     * Most recently rendered time (or frame for frames-based tweens/timelines)
     * according to its totalDuration.
     */
    public native double getTotalTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettotalTime();
    }-*/;

    /**
     * Most recently rendered time (or frame for frames-based tweens/timelines)
     * according to its totalDuration.
     */
    public native void setTotalTime(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settotalTime(value);
    }-*/;

    /**
     * Forces the tween/timeline to completion.
     */
    public native void complete()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.complete();
    }-*/;

    /**
     * Forces the tween/timeline to completion.
     */
    public native void complete(boolean skipRender)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.complete(skipRender);
    }-*/;

    /**
     * Forces the tween/timeline to completion.
     */
    public native void complete(boolean skipRender, boolean supressEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.complete(skipRender, supressEvent);
    }-*/;

    /**
     * Clears any initialization data (like starting values in tweens) which can
     * be useful if, for example, you want to restart it without reverting to
     * any previously recorded starting values.
     */
    public native void invalidate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidate();
    }-*/;

    /**
     * Kills the tween/timeline, stopping it immediately.
     */
    public native void kill()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.kill();
    }-*/;

    /**
     * Pauses the tween/timeline
     */
    public native void pause()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.pause();
    }-*/;

    /**
     * Starts playing forward from the current position.
     */
    public native void play()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.play();
    }-*/;

    /**
     * Restarts and begins playing forward.
     */
    public native void restart()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.restart();
    }-*/;

    /**
     * Restarts and begins playing forward.
     */
    public native void restart(boolean includeDelay)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.restart(includeDelay);
    }-*/;

    /**
     * Restarts and begins playing forward.
     */
    public native void restart(boolean includeDelay, boolean supressEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.restart(includeDelay, supressEvent);
    }-*/;

    /**
     * Starts playing from the current position without altering direction
     * (forward or reversed).
     */
    public native void resume()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.resume();
    }-*/;

    /**
     * Reverses smoothly, adjusting the startTime to avoid any skipping.
     */
    public native void reverse()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.reverse();
    }-*/;

    /**
     * Reverses smoothly, adjusting the startTime to avoid any skipping.
     */
    public native void reverse(boolean forceResume)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.reverse(forceResume);
    }-*/;

}
