/************************************************************************
  TimelineConfig.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.tween.client.config;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.tween.client.core.TweenCore;
import com.emitrom.flash4j.tween.client.timeline.TimelineLite;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Config object for {@link TimelineLite}
 * 
 */
public class TimelineConfig extends ProxyObject {

    public TimelineConfig() {
        jsObj = JsoHelper.createObject();
    }

    public static TimelineConfig create() {
        return new TimelineConfig();
    }

    /**
     * Amount of delay in seconds (or frames for frames-based timelines) before
     * the timeline should begin.
     * 
     */
    public TimelineConfig setDelay(double value) {
        JsoHelper.setAttribute(jsObj, "delay", value);
        return this;
    }

    /**
     * Amount of delay in seconds (or frames for frames-based timelines) before
     * the timeline should begin.
     */
    public TimelineConfig setPaused(boolean value) {
        JsoHelper.setAttribute(jsObj, "delay", value);
        return this;
    }

    /**
     * If useFrames is set to true, the timeline's timing mode will be based on
     * frames. Otherwise, it will be based on seconds/time. NOTE: a
     * TimelineLite's timing mode is always determined by its parent timeline.
     */
    public TimelineConfig setUseFrames(boolean value) {
        JsoHelper.setAttribute(jsObj, "useFrames", value);
        return this;
    }

    /**
     * If true, the timeline will be reversed initially. This does NOT force it
     * to the very end and start playing backwards. It simply affects the
     * orientation of the timeline, so if reversed is set to true initially, it
     * will appear not to play because it is already at the beginning. To cause
     * it to play backwards from the end, set reversed to true and then set the
     * currentProgress property to 1 immediately after creating the timeline.
     */
    public TimelineConfig setReversed(boolean value) {
        JsoHelper.setAttribute(jsObj, "reversed", value);
        return this;
    }

    /**
     * To immediately insert several tweens into the timeline, use the tweens
     * special property to pass in an Array of
     * TweenLite/TweenMax/TimelineLite/TimelineMax instances. You can use this
     * in conjunction with the align and stagger special properties to set up
     * complex sequences with minimal code. These values simply get passed to
     * the insertMultiple() method.
     * 
     * @param tweens
     * @return
     */
    public TimelineConfig setTweens(TweenCore... tweens) {
        As3Array peers = As3Array.createEmpty();
        for (TweenCore tween : tweens) {
            peers.push(tween.getJsObj());
        }
        return _setTweens(peers.getJsObj());
    }

    /**
     * Only used in conjunction with the tweens special property when multiple
     * tweens are to be inserted immediately. The value simply gets passed to
     * the insertMultiple() method. The default is TweenAlign.NORMAL
     * 
     * The align special property does not force all child tweens/timelines to
     * maintain relative positioning, so for example, if you use
     * TweenAlign.SEQUENCE and then later change the duration of one of the
     * nested tweens, it does not force all subsequent timelines to change their
     * position on the timeline. The align special property only affects the
     * alignment of the tweens that are initially placed into the timeline
     * through the tweens special property of the vars object.
     */
    public TimelineConfig setAlign(TweenAlign align) {
        JsoHelper.setAttribute(jsObj, "align", align.getValue());
        return this;
    }

    /**
     * 
     Only used in conjunction with the tweens special property when multiple
     * tweens are to be inserted immediately. It staggers the tweens by a set
     * amount of time (in seconds) (or in frames if "useFrames" is true). For
     * example, if the stagger value is 0.5 and the "align" property is set to
     * TweenAlign.START, the second tween will start 0.5 seconds after the first
     * one starts, then 0.5 seconds later the third one will start, etc. If the
     * align property is TweenAlign.SEQUENCE, there would be 0.5 seconds added
     * between each tween. This value simply gets passed to the insertMultiple()
     * method. Default is 0.
     */
    public TimelineConfig setStagger(double value) {
        JsoHelper.setAttribute(jsObj, "stagger", value);
        return this;
    }

    /**
     * 
     Only used in conjunction with the tweens special property when multiple
     * tweens are to be inserted immediately. It staggers the tweens by a set
     * amount of time (in seconds) (or in frames if "useFrames" is true). For
     * example, if the stagger value is 0.5 and the "align" property is set to
     * TweenAlign.START, the second tween will start 0.5 seconds after the first
     * one starts, then 0.5 seconds later the third one will start, etc. If the
     * align property is TweenAlign.SEQUENCE, there would be 0.5 seconds added
     * between each tween. This value simply gets passed to the insertMultiple()
     * method. Default is 0.
     */
    public TimelineConfig setAutoRemoveChildren(boolean value) {
        JsoHelper.setAttribute(jsObj, "autoremoveChildren", value);
        return this;
    }

    private TimelineConfig _setTweens(JavaScriptObject values) {
        JsoHelper.setAttribute(jsObj, "tweens", values);
        return this;
    }

}
