/************************************************************************
  TweenLite.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.tween.client.config.TweenConfig;
import com.emitrom.flash4j.tween.client.core.TweenCore;
import com.emitrom.flash4j.tween.client.core.TweenLiteBridge;
import com.emitrom.flash4j.tween.client.easing.Ease;
import com.emitrom.flash4j.tween.client.handler.TweenActivityHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * TweenLite is an extremely fast, lightweight, and flexible animation tool that
 * serves as the foundation of the GreenSock Animation Platform (GAP).
 * <p>
 * A TweenLite instance handles tweening one or more properties of any object
 * (or array of objects) over time. TweenLite can be used on its own to
 * accomplish most animation chores with minimal file size or it can be use in
 * conjuction with advanced sequencing tools like TimelineLite or TimelineMax to
 * make complex tasks much simpler.
 * 
 * 
 */
public class TweenLite extends TweenCore {

    protected TweenLite(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected TweenLite() {

    }

    public TweenLite(ProxyObject target, double duration, TweenConfig config) {
        jsObj = TweenLiteBridge.get().createTweenLite(target.getJsObj(), duration, config);
    }

    /**
     * Static method for creating a TweenLite instance that animates to the
     * specified destination values (from the current values).
     * 
     * @param target
     * @param duration
     * @param config
     * @return
     */
    public static TweenLite to(ProxyObject target, double duration, TweenConfig config) {
        return TweenLiteBridge.get().applyTo(target, duration, config);
    }

    public static TweenLite from(ProxyObject target, double duration, TweenConfig config) {
        return TweenLiteBridge.get().applyFrom(target, duration, config);
    }

    /**
     * Static method for creating a TweenLite instance that animates to the
     * specified destination values (from the current values).
     * 
     * @param targets
     * @param duration
     * @param config
     * @return
     */
    public static TweenLite to(List<? extends ProxyObject> targets, double duration, TweenConfig config) {
        As3Array array = As3Array.createEmpty();
        for (ProxyObject obj : targets) {
            array.push(obj.getJsObj());
        }
        return TweenLiteBridge.get().applyTo(array, duration, config);
    }

    /**
     * Static method for creating a TweenLite instance that animates to the
     * specified destination values (from the current values).
     * 
     * @param targets
     * @param duration
     * @param config
     * @return
     */
    public static TweenLite from(List<? extends ProxyObject> targets, double duration, TweenConfig config) {
        As3Array array = As3Array.createEmpty();
        for (ProxyObject obj : targets) {
            array.push(obj.getJsObj());
        }
        return TweenLiteBridge.get().applyFrom(array, duration, config);
    }

    /**
     * A handler that should be called when the tween has completed.
     * 
     * @param handler
     * @return
     */
    public native TweenLite delayTweenLiteCall(double delay, TweenActivityHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.delayCall(
						delay,
						function() {
							handler.@com.emitrom.flash4j.tween.client.handler.TweenActivityHandler::onActivityComplete()();
						});
		return this;
    }-*/;

    public native TweenLite setEase(Ease value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.set_ease(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return this;
    }-*/;

}
