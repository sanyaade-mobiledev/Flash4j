/************************************************************************
  TweenEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TweenEvent.
 */
public class TweenEvent extends Event {

    /** The Constant TWEEN_END. */
    public static final String TWEEN_END = "tweenEnd";

    /** The Constant TWEEN_START. */
    public static final String TWEEN_START = "tweenStart";

    /** The Constant TWEEN_UPDATE. */
    public static final String TWEEN_UPDATE = "tweenUpdate";

    /**
     * Instantiates a new tween event.
     */
    protected TweenEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the value.
     * 
     * @param <T> the generic type
     * @return the value
     */
    public final native <T> T getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

    public final static TweenEvent cast(Event event) {
        return new TweenEvent(event.getJsObj());
    }
}
