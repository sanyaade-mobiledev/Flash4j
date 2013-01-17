/************************************************************************
  TweenMax.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.tween.client;

import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.events.handlers.EventHandler;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.tween.client.config.TweenMaxConfig;
import com.emitrom.flash4j.tween.client.core.TweenMaxBridge;
import com.emitrom.flash4j.tween.client.handler.TweenActivityHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * weenMax extends the extremely lightweight, fast TweenLite engine, adding many
 * useful features like timeScale, event dispatching, updateTo(), yoyo, repeat,
 * repeatDelay, rounding, and more. It also activates many extra plugins by
 * default, making it extremely full-featured. Since TweenMax extends TweenLite,
 * it can do ANYTHING TweenLite can do plus much more.
 * 
 */
public class TweenMax extends TweenLite {

    protected TweenMax(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected TweenMax() {

    }

    /**
     * Static method for creating a TweenMax instance that animates to the
     * specified destination values (from the current values).
     * 
     * @param target
     * @param duration
     * @param config
     * @return
     */
    public static TweenMax to(ProxyObject target, double duration, TweenMaxConfig config) {
        return TweenMaxBridge.get().applyTo(target, duration, config);
    }

    public static TweenMax from(ProxyObject target, double duration, TweenMaxConfig config) {
        return TweenMaxBridge.get().applyFrom(target, duration, config);
    }

    /**
     * Static method for creating a TweenMax instance that animates to the
     * specified destination values (from the current values).
     * 
     * @param targets
     * @param duration
     * @param config
     * @return
     */
    public static TweenMax to(List<? extends ProxyObject> targets, double duration, TweenMaxConfig config) {
        As3Array array = As3Array.createEmpty();
        for (ProxyObject obj : targets) {
            array.push(obj.getJsObj());
        }
        return TweenMaxBridge.get().applyTo(array, duration, config);
    }

    /**
     * Static method for creating a TweenMax instance that animates to the
     * specified destination values (from the current values).
     * 
     * @param targets
     * @param duration
     * @param config
     * @return
     */
    public static TweenMax from(List<? extends ProxyObject> targets, double duration, TweenMaxConfig config) {
        As3Array array = As3Array.createEmpty();
        for (ProxyObject obj : targets) {
            array.push(obj.getJsObj());
        }
        return TweenMaxBridge.get().applyFrom(array, duration, config);
    }

    /**
     * A handler that should be called when the tween has completed.
     * 
     * @param handler
     * @return
     */
    public native TweenMax delayTweenMaxCall(double delay, TweenActivityHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.delayCall(
						delay,
						function() {
							handler.@com.emitrom.flash4j.tween.client.handler.TweenActivityHandler::onActivityComplete()();
						});
		return this;
    }-*/;

    public native TweenMax addEventHandler(String event, EventHandler handler)/*-{
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
