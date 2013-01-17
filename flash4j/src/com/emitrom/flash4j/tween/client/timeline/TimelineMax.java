/************************************************************************
  TimelineMax.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.tween.client.timeline;

import com.emitrom.flash4j.core.client.events.handlers.EventHandler;
import com.emitrom.flash4j.tween.client.TweenLite;
import com.emitrom.flash4j.tween.client.core.TweenLiteBridge;
import com.emitrom.flash4j.tween.client.handler.TweenActivityHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * 
 TimelineMax extends TimelineLite, offering exactly the same functionality
 * plus useful (but non-essential) features like AS3 event dispatching, repeat,
 * repeatDelay, yoyo, currentLabel, addCallback(), removeCallback(), tweenTo(),
 * tweenFromTo(), getLabelAfter(), getLabelBefore(), and getActive() (and
 * probably more in the future). It is the ultimate sequencing tool. Think of a
 * TimelineMax instance like a virtual MovieClip timeline or a container where
 * you place tweens (or other timelines) over the course of time. <br/>
 * <ul>
 * <li>
 * build sequences easily by adding tweens with the append(), prepend(),
 * insert(), appendMultiple(), prependMultiple(), and insertMultiple() methods.
 * Tweens can overlap as much as you want and you have complete control over
 * where they get placed on the timeline.</li>
 * <li>
 * add labels, play(), stop(), gotoAndPlay(), gotoAndStop(), restart(), and even
 * reverse() smoothly anytime.</li>
 * <li>
 * nest timelines within timelines as deeply as you want.</li>
 * <li>
 * set the progress of the timeline using its currentProgress property. For
 * example, to skip to the halfway point, set myTimeline.currentProgress = 0.5.</li>
 * <li>
 * tween the currentTime or currentProgress property to fastforward/rewind the
 * timeline. You could even attach a slider to one of these properties to give
 * the user the ability to drag forwards/backwards through the timeline.
 * <li>
 * <li>speed up or slow down the entire timeline with its timeScale property.
 * You can even tween this property to gradually speed up or slow down.</li>
 * <li>
 * add onComplete, onStart, onUpdate, and/or onReverseComplete callbacks using
 * the constructor's vars object.
 * <li>
 * <li>
 * use the insertMultiple() or appendMultiple() methods to create complex
 * sequences including various alignment modes and staggering capabilities.</li>
 * <li>
 * <li>base the timing on frames instead of seconds if you prefer. Please note,
 * however, that the timeline's timing mode dictates its childrens' timing mode
 * as well.</li>
 * <li>
 * kill the tweens of a particular object with killTweensOf() or get the tweens
 * of an object with getTweensOf() or get all the tweens/timelines in the
 * timeline with getChildren()</li>
 * <li>
 * If you need even more features like AS3 event listeners, repeat, repeatDelay,
 * yoyo, currentLabel, getLabelAfter(), getLabelBefore(), addCallback(),
 * removeCallback(), getActive() and more, check out TimelineMax which extends
 * TimelineLite.
 * <li>
 * </ul>
 */
public class TimelineMax extends TimelineLite {

    protected TimelineMax(JavaScriptObject jso) {
        jsObj = jso;
    }

    public TimelineMax() {
        jsObj = TweenLiteBridge.get().createTimeline();
    }

    /**
     * The closest label that is at or before the current time.
     */
    public native String getCurrentLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentLabel();
    }-*/;

    public native void setcurrentProgress(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setcurrentProgress(value);
    }-*/;

    /**
     * Number of times that the timeline should repeat; -1 repeats indefinitely.
     */
    public native int getRepeat()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrepeat();
    }-*/;

    /**
     * Number of times that the timeline should repeat; -1 repeats indefinitely.
     */
    public native void setRepeat(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrepeat(value);
    }-*/;

    public void setTotalDuration() {
        // does nothing
    }

    /**
     * Number of times that the timeline should repeat; -1 repeats indefinitely.
     */
    public native boolean isYoyo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyoyo();
    }-*/;

    /**
     * Works in conjunction with the repeat property, determining the behavior
     * of each cycle; when yoyo is true, the timeline will go back and forth,
     * appearing to reverse every other cycle (this has no affect on the
     * reversed property though).
     */
    public native void setYoyo(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyoyo(value);
    }-*/;

    /**
     * If you want a function to be called at a particular time or label, use
     * addCallback.
     */
    public native TweenLite addCallback(TweenActivityHandler handler, String label)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.addCallback(
						function() {
							handler.@com.emitrom.flash4j.tween.client.handler.TweenActivityHandler::onActivityComplete()();
						}, label);
		return @com.emitrom.flash4j.tween.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * If you want a function to be called at a particular time or label, use
     * addCallback.
     */
    public native TweenLite addCallback(TweenActivityHandler handler, double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.addCallback(
						function() {
							handler.@com.emitrom.flash4j.tween.client.handler.TweenActivityHandler::onActivityComplete()();
						}, time);
		return @com.emitrom.flash4j.tween.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Forces the timeline to completion.
     */
    public native void complete()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.complete();
    }-*/;

    /**
     * Forces the timeline to completion.
     */
    public native void complete(boolean skipRender)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.complete(skipRender);
    }-*/;

    /**
     * Forces the timeline to completion.
     */
    public native void complete(boolean skipRender, boolean suppressEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.complete(skipRender, suppressEvent);
    }-*/;

    /**
     * Returns the next label (if any) that occurs AFTER the time parameter.
     */
    public native String getLabelAfter(double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getLabelAfter(time);
    }-*/;

    /**
     * Returns the next label (if any) that occurs BEFORE the time parameter.
     */
    public native String getLabelBefore(double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getLabelBefore(time);
    }-*/;

    /**
     * Creates a linear tween that essentially scrubs the playhead from a
     * particular time or label to another time or label and then stops.
     */
    public native TweenLite tweenFromTo(double from, double to)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.tweenFromTo(from, to);
		return @com.emitrom.flash4j.tween.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates a linear tween that essentially scrubs the playhead from a
     * particular time or label to another time or label and then stops.
     */
    public native TweenLite tweenFromTo(String from, String to)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.tweenFromTo(from, to);
		return @com.emitrom.flash4j.tween.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates a linear tween that essentially scrubs the playhead from a
     * particular time or label to another time or label and then stops.
     */
    public native TweenLite tweenTo(double to)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.tweenTo(to);
		return @com.emitrom.flash4j.tween.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates a linear tween that essentially scrubs the playhead from a
     * particular time or label to another time or label and then stops.
     */
    public native TweenLite tweenTo(String to)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.tweenTo(to);
		return @com.emitrom.flash4j.tween.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native TimelineMax addEventHandler(String event, EventHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(
						event,
						$entry(function(e) {
							var eventObject = @com.emitrom.flash4j.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.flash4j.core.client.events.handlers.EventHandler::onEvent(Lcom/emitrom/flash4j/core/client/events/Event;)(eventObject);
						}));
		return this
    }-*/;

}
