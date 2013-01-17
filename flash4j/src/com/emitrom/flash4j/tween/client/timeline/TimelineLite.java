/************************************************************************
  TimelineLite.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.List;

import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.tween.client.config.TimelineConfig;
import com.emitrom.flash4j.tween.client.config.TweenAlign;
import com.emitrom.flash4j.tween.client.core.SimpleTimeLine;
import com.emitrom.flash4j.tween.client.core.TweenCore;
import com.emitrom.flash4j.tween.client.core.TweenLiteBridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * 
 TimelineLite is a lightweight, intuitive timeline class for building and
 * managing sequences of TweenLite, TweenMax, TimelineLite, and/or TimelineMax
 * instances. You can think of a TimelineLite instance like a virtual MovieClip
 * timeline or a container where you place tweens (or other timelines) over the
 * course of time. You can: <br/>
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
public class TimelineLite extends SimpleTimeLine {

    protected TimelineLite(JavaScriptObject jso) {
        jsObj = jso;
    }

    public TimelineLite() {
        jsObj = TweenLiteBridge.get().createTimeline();
    }

    public TimelineLite(TimelineConfig config) {
        jsObj = TweenLiteBridge.get().createTimeline(config);
    }

    /**
     * Inserts a TweenLite, TweenMax, TimelineLite, or TimelineMax instance at
     * the end of the timeline, optionally offsetting its insertion point by a
     * certain amount (to make it overlap with the end of the timeline or leave
     * a gap before its insertion point).
     * 
     */
    public native void append(TweenCore tween)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.append(tween.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Inserts a TweenLite, TweenMax, TimelineLite, or TimelineMax instance at
     * the end of the timeline, optionally offsetting its insertion point by a
     * certain amount (to make it overlap with the end of the timeline or leave
     * a gap before its insertion point).
     */
    public native void append(TweenCore tween, double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.append(
						tween.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						time);
    }-*/;

    /**
     * Value between 0 and 1 indicating the progress of the timeline according
     * to its duration where 0 is at the beginning, 0.5 is halfway finished, and
     * 1 is finished.
     */
    public native double getCurrentProgress()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentProgress();
    }-*/;

    /**
     * Value between 0 and 1 indicating the progress of the timeline according
     * to its duration where 0 is at the beginning, 0.5 is halfway finished, and
     * 1 is finished.
     */
    public native void setCurrentProgress(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcurrentProgress(value);
    }-*/;

    /**
     * Duration of the timeline in seconds (or frames for frames-based
     * timelines) not including any repeats or repeatDelays.
     */
    public native double getDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getduration();
    }-*/;

    /**
     * Duration of the timeline in seconds (or frames for frames-based
     * timelines) not including any repeats or repeatDelays.
     */
    public native void setDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setduration(value);
    }-*/;

    /**
     * Multiplier describing the speed of the timeline where 1 is normal speed,
     * 0.5 is half-speed, 2 is double speed, etc.
     */
    public native double getTimeScale()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettimeScale();
    }-*/;

    /**
     * Multiplier describing the speed of the timeline where 1 is normal speed,
     * 0.5 is half-speed, 2 is double speed, etc.
     */
    public native void setTimeScale(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gettimeScale(value);
    }-*/;

    /**
     * Duration of the timeline in seconds (or frames for frames-based
     * timelines) including any repeats or repeatDelays.
     */
    public native double getTotalDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettotalDuration();
    }-*/;

    /**
     * Duration of the timeline in seconds (or frames for frames-based
     * timelines) including any repeats or repeatDelays.
     */
    public native void setTotalDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gettotalDuration(value);
    }-*/;

    /**
     * Indicates whether or not the timeline's timing mode is frames-based as
     * opposed to time-based.
     */
    public native boolean useFrames()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getuseFrames();
    }-*/;

    /**
     * Adds a label to the timeline, making it easy to mark important
     * positions/times.
     */
    public native void addLabel(String label)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.addLabel(label);
    }-*/;

    /**
     * Adds a label to the timeline, making it easy to mark important
     * positions/times.
     */
    public native void addLabel(String label, double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.addLabel(label, time);
    }-*/;

    /**
     * Appends multiple tweens/timelines at the end of the timeline at once,
     * optionally offsetting the insertion point by a certain amount, aligning
     * them (as a sequence for example), and/or staggering their relative
     * timing.
     * 
     * @param tweens
     */
    public void appendMultime(List<TweenCore> tweens) {
        As3Array array = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            array.push(tween.getJsObj());
        }
        _appendMultiple(array.getJsObj());
    }

    private native void _appendMultiple(JavaScriptObject tweens)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.appendMultiple(tweens);
    }-*/;

    /**
     * Appends multiple tweens/timelines at the end of the timeline at once,
     * optionally offsetting the insertion point by a certain amount, aligning
     * them (as a sequence for example), and/or staggering their relative
     * timing.
     * 
     * @param tweens
     */
    public void appendMultime(List<TweenCore> tweens, double offset) {
        As3Array array = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            array.push(tween.getJsObj());
        }
        _appendMultiple(array.getJsObj(), offset);
    }

    private native void _appendMultiple(JavaScriptObject tweens, double offset)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.appendMultiple(tweens, offset);
    }-*/;

    /**
     * Appends multiple tweens/timelines at the end of the timeline at once,
     * optionally offsetting the insertion point by a certain amount, aligning
     * them (as a sequence for example), and/or staggering their relative
     * timing.
     * 
     * @param tweens
     */
    public void appendMultime(List<TweenCore> tweens, double offset, TweenAlign align) {
        As3Array array = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            array.push(tween.getJsObj());
        }
        _appendMultiple(array.getJsObj(), offset, align.getValue());
    }

    private native void _appendMultiple(JavaScriptObject tweens, double offset, String align)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.appendMultiple(tweens, offset, align);
    }-*/;

    /**
     * Appends multiple tweens/timelines at the end of the timeline at once,
     * optionally offsetting the insertion point by a certain amount, aligning
     * them (as a sequence for example), and/or staggering their relative
     * timing.
     * 
     * @param tweens
     */
    public void appendMultime(List<TweenCore> tweens, double offset, TweenAlign align, double stagger) {
        As3Array array = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            array.push(tween.getJsObj());
        }
        _appendMultiple(array.getJsObj(), offset, align.getValue(), stagger);
    }

    /**
     * Empties the timeline of all child tweens/timelines, or you can optionally
     * pass an Array containing specific tweens/timelines to remove.
     */
    public native void clear()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * Empties the timeline of all child tweens/timelines, or you can optionally
     * pass an Array containing specific tweens/timelines to remove.
     */
    public void clear(List<TweenCore> tweens) {
        As3Array array = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            array.push(tween.getJsObj());
        }
        _clear(array.getJsObj());
    }

    /**
     * Provides an easy way to get all of the tweens and/or timelines nested in
     * this timeline (as an Array).
     * 
     * @return
     */
    public native As3Array getChildren()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildren();
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides an easy way to get all of the tweens and/or timelines nested in
     * this timeline (as an Array).
     * 
     * @return
     */
    public native As3Array getChildren(boolean nested)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildren(nested);
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides an easy way to get all of the tweens and/or timelines nested in
     * this timeline (as an Array).
     * 
     * @return
     */
    public native As3Array getChildren(boolean nested, boolean tweens)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildren(nested, tweens);
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides an easy way to get all of the tweens and/or timelines nested in
     * this timeline (as an Array).
     * 
     * @return
     */
    public native As3Array getChildren(boolean nested, boolean tweens, boolean timelines)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildren(nested, tweens, timelines);
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides an easy way to get all of the tweens and/or timelines nested in
     * this timeline (as an Array).
     * 
     * @return
     */
    public native As3Array getChildren(boolean nested, boolean tweens, boolean timelines, double ignoreBeforeTime)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildren(nested, tweens, timelines, ignoreBeforeTime);
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides an easy way to get all of the tweens and/or timelines nested in
     * this timeline (as an Array).
     * 
     * @return
     */
    public native double getLabelTime(String label)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getLabelTime(label);
    }-*/;

    /**
     * Skips to a particular time, frame, or label and plays the timeline
     * forwards from there (unpausing it)
     */
    public native void gotoAndPlay(String label)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndPlay(label);
    }-*/;

    /**
     * Skips to a particular time, frame, or label and plays the timeline
     * forwards from there (unpausing it)
     */
    public native void gotoAndPlay(String label, boolean supressEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndPlay(label, supressEvent);
    }-*/;

    /**
     * Skips to a particular time, frame, or label and plays the timeline
     * forwards from there (unpausing it)
     */
    public native void gotoAndPlay(double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndPlay(time);
    }-*/;

    /**
     * Skips to a particular time, frame, or label and plays the timeline
     * forwards from there (unpausing it)
     */
    public native void gotoAndPlay(double time, boolean supressEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndPlay(time, supressEvent);
    }-*/;

    /**
     * Skips to a particular time, frame, or label and stops the timeline
     * forwards from there (unpausing it)
     */
    public native void gotoAndStop(String label)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndStop(label);
    }-*/;

    /**
     * Skips to a particular time, frame, or label and plays the timeline
     * forwards from there (unpausing it)
     */
    public native void gotoAndStop(String label, boolean supressEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndStop(label, supressEvent);
    }-*/;

    /**
     * Skips to a particular time, frame, or label and Stops the timeline
     * forwards from there (unpausing it)
     */
    public native void gotoAndStop(double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndStop(time);
    }-*/;

    /**
     * Skips to a particular time, frame, or label and Stops the timeline
     * forwards from there (unpausing it)
     */
    public native void gotoAndStop(double time, boolean supressEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndStop(time, supressEvent);
    }-*/;

    /**
     * Appends multiple tweens/timelines at the end of the timeline at once,
     * optionally offsetting the insertion point by a certain amount, aligning
     * them (as a sequence for example), and/or staggering their relative
     * timing.
     * 
     * @param tweens
     */
    public void insertMultime(List<TweenCore> tweens) {
        As3Array array = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            array.push(tween.getJsObj());
        }
        _insertMultiple(array.getJsObj());
    }

    private native void _insertMultiple(JavaScriptObject tweens)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.insertMultiple(tweens);
    }-*/;

    /**
     * inserts multiple tweens/timelines at the end of the timeline at once,
     * optionally offsetting the insertion point by a certain amount, aligning
     * them (as a sequence for example), and/or staggering their relative
     * timing.
     * 
     * @param tweens
     */
    public void insertMultime(List<TweenCore> tweens, double offset) {
        As3Array array = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            array.push(tween.getJsObj());
        }
        _insertMultiple(array.getJsObj(), offset);
    }

    private native void _insertMultiple(JavaScriptObject tweens, double offset)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.insertMultiple(tweens, offset);
    }-*/;

    /**
     * Appends multiple tweens/timelines at the end of the timeline at once,
     * optionally offsetting the insertion point by a certain amount, aligning
     * them (as a sequence for example), and/or staggering their relative
     * timing.
     * 
     * @param tweens
     */
    public void insertMultime(List<TweenCore> tweens, double offset, TweenAlign align) {
        As3Array array = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            array.push(tween.getJsObj());
        }
        _insertMultiple(array.getJsObj(), offset, align.getValue());
    }

    private native void _insertMultiple(JavaScriptObject tweens, double offset, String align)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.insertMultiple(tweens, offset, align);
    }-*/;

    /**
     * Appends multiple tweens/timelines at the end of the timeline at once,
     * optionally offsetting the insertion point by a certain amount, aligning
     * them (as a sequence for example), and/or staggering their relative
     * timing.
     * 
     * @param tweens
     */
    public void insertMultime(List<TweenCore> tweens, double offset, TweenAlign align, double stagger) {
        As3Array array = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            array.push(tween.getJsObj());
        }
        _insertMultiple(array.getJsObj(), offset, align.getValue(), stagger);
    }

    /**
     * Inserts a TweenLite, TweenMax, TimelineLite, or TimelineMax instance at
     * the beginning of the timeline, pushing all existing tweens back in time
     * to make room for the newly inserted one.
     * 
     */
    public native void prepend(TweenCore tween)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.prepend(tween.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    // TODO prependMultiple
    /**
     * Inserts a TweenLite, TweenMax, TimelineLite, or TimelineMax instance at
     * the beginning of the timeline, pushing all existing tweens back in time
     * to make room for the newly inserted one.
     */
    public native void prepend(TweenCore tween, boolean adjustLabels)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.prepend(
						tween.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						adjustLabels);
    }-*/;

    /**
     * Removes a TweenLite, TweenMax, TimelineLite, or TimelineMax instance from
     * the timeline.
     * 
     */
    public native void remove(TweenCore tween)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.remove(tween.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Removes a TweenLite, TweenMax, TimelineLite, or TimelineMax instance from
     * the timeline.
     * 
     */
    public native void remove(TweenCore tween, boolean skipDisable)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.remove(
						tween.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						skipDisable);
    }-*/;

    /**
     * Removes a TweenLite, TweenMax, TimelineLite, or TimelineMax instance from
     * the timeline.
     * 
     */
    public native void removeLabel(String label)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeLabel(label);
    }-*/;

    /**
     * Shifts the startTime of the timeline's children by a certain amount and
     * optionally adjusts labels too.
     * 
     */
    public native void shiftChildren(double amount)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.shiftChildren(amount);
    }-*/;

    /**
     * Shifts the startTime of the timeline's children by a certain amount and
     * optionally adjusts labels too.
     * 
     */
    public native void shiftChildren(double amount, boolean adjustLabels)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.shiftChildren(amount, adjustLabels);
    }-*/;

    /**
     * Shifts the startTime of the timeline's children by a certain amount and
     * optionally adjusts labels too.
     * 
     */
    public native void shiftChildren(double amount, boolean adjustLabels, double ignoreBeforeTime)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.shiftChildren(amount, adjustLabels, ignoreBeforeTime);
    }-*/;

    /**
     * Pauses the timeline (same as pause() - added stop() for consistency with
     * Flash's MovieClip.stop() functionality)
     * 
     */
    public native void stop(double amount)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.shiftChildren(amount);
    }-*/;

    private native void _clear(JavaScriptObject tweens)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.clear(tweens);
    }-*/;

    private native void _appendMultiple(JavaScriptObject tweens, double offset, String align, double stagger)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.appendMultiple(tweens, offset, align, stagger);
    }-*/;

    private native void _insertMultiple(JavaScriptObject tweens, double offset, String align, double stagger)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.insertMultiple(tweens, offset, align, stagger);
    }-*/;

}
