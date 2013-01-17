/************************************************************************
  SimpleTimeLine.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * SimpleTimeline is the base class for the TimelineLite and TimelineMax
 * classes. It provides the most basic timeline functionality and is used for
 * the root timelines in TweenLite. It is meant to be very fast and lightweight.
 * 
 */
public class SimpleTimeLine extends TweenCore {

    protected SimpleTimeLine(JavaScriptObject obj) {
        jsObj = obj;
    }

    public SimpleTimeLine() {
        jsObj = Bridge.createObject("com.greensock.core.SimpleTimeline");
    }

    /**
     * Inserts a TweenLite, TweenMax, TimelineLite, or TimelineMax instance into
     * the timeline at a specific time.
     * 
     */
    public native void insert(TweenCore tween)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.insert(tween.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Inserts a TweenLite, TweenMax, TimelineLite, or TimelineMax instance into
     * the timeline at a specific time.
     * 
     */
    public native void insert(TweenCore tween, double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.insert(
						tween.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						time);
    }-*/;

}
