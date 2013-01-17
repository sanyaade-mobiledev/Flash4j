/************************************************************************
  Tween.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.animation;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.events.EventDispatcher;

/**
 * A Tween animates numeric properties of objects. It uses different transition
 * functions to give the animations various styles. The primary use of peer
 * class is to do standard animations like movement, fading, rotation, etc. But
 * there are no limits on what to animate; as long as the property you want to
 * animate is numeric (int, uint, Number), the tween can handle it. For a list
 * of available Transition types, look at the "Transitions" class.
 * 
 * <p>
 * Here is an example of a tween that moves an object to the right, rotates it,
 * and fades it out:<br/>
 * <br/>
 * <code>
 * Tween tween =  Tween.newInstance(object, 2.0, Transitions.EASE_IN_OUT);<br/>
 * tween.animate("x", object.get() + 50); <br/>
 * tween.animate("rotation", Starling.deg2Rad(45));<br/>
 * tween.fadeTo(0); // equivalent to 'animate("alpha", 0)'<br/>
 * Starling.getJuggler.add(tween);
 * </code>
 * <p>
 * Note that the object is added to a juggler at the end. A tween will only be
 * executed if its "advanceTime" method is executed regularly - the juggler will
 * do that for you, and will release the tween when it is finished.
 * 
 * 
 * 
 */
public class Tween extends EventDispatcher {

    public Tween(ProxyObject target, double time) {
        jsObj = StarlingObjectFactory.INSTANCE.createTween(target.getJsObj(), time);
    }

    public Tween(ProxyObject target, double time, Transitions transiton) {
        jsObj = StarlingObjectFactory.INSTANCE.createTween(target, time, transiton.getValue());
    }

    /**
     * [read-only] The time that has passed since the tween was created.
     * 
     * @return
     */
    public native double getCurrentTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentTime();
    }-*/;

    /**
     * The delay before the tween is started.
     * 
     * @return
     */
    public native double getdelay()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdelay();
    }-*/;

    public native void setDelay(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdelay(value);
    }-*/;

    /**
     * [read-only] Indicates if the animation is finished.
     * 
     * @return
     */
    public native boolean isComplete()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisComplete();
    }-*/;

    /**
     * A function that will be called when the tween is complete.
     * 
     * @param callBack
     */
    public native void setOnComplete(TweenOnCompleteHandler callBack)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setonComplete(function(args) {
					var array = @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(args);
					callBack.@com.emitrom.flash4j.starling.client.animation.TweenOnCompleteHandler::onComplete(Lcom/emitrom/flash4j/core/client/toplevel/As3Array;)(array);
				});
    }-*/;

    public native As3Array getOnCompleteArgs()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getonCompleteArgs();
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The arguments that will be passed to the 'onComplete' function.
     * 
     * @param value
     */
    public native void setOnCompleteArgs(As3Array value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setonCompleteArgs(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * A function that will be called when the tween starts (after a possible
     * delay).
     * 
     * @param callBack
     */
    public native void setOnStart(TweenOnCompleteHandler callBack)/*-{
		peer
				.setonComplete(function(args) {
					var array = @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(args);
					callBack.@com.emitrom.flash4j.starling.client.animation.TweenOnCompleteHandler::onComplete(Lcom/emitrom/flash4j/core/client/toplevel/As3Array;)(array);
				});
    }-*/;

    /**
     * The arguments that will be passed to the 'onStart' function.
     * 
     * @param value
     */
    public native void setOnStartArgs(As3Array value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setonStartArgs(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * A function that will be called when the tween starts (after a possible
     * delay).
     * 
     * @param callBack
     */
    public native void setOnUpdate(TweenOnUpdateHandler callBack)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setonComplete(function(args) {
					var array = @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(args);
					callBack.@com.emitrom.flash4j.starling.client.animation.TweenOnUpdateHandler::onUpdate(Lcom/emitrom/flash4j/core/client/toplevel/As3Array;)(array);
				});
    }-*/;

    /**
     * The arguments that will be passed to the 'onStart' function.
     * 
     * @param value
     */
    public native void setOnUpdateArgs(As3Array value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setonUpdateArgs(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Indicates if the numeric values should be cast to Integers.
     * 
     * @return
     */
    public native boolean getRoundToInt()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getroundToInt();
    }-*/;

    public native void setRoundToInt(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setroundToInt(value);
    }-*/;

    /**
     * [read-only] The target object that is animated.
     * 
     * @param <T>
     * @return
     */
    public native ProxyObject getTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettarget();
		return @com.emitrom.flash4j.core.client.ProxyObject::create(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * [read-only] The total time the tween will take (in seconds).
     * 
     * @return
     */
    public native double getTotalTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettotalTime();
    }-*/;

    /**
     * [read-only] The transition method used for the animation.
     * 
     * @return
     */

    public Transitions getTransition() {
        return Transitions.fromValue(_getTransition());
    }

    private native String _getTransition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettransition();
    }-*/;

    /**
     * Advance the time by a number of seconds.
     * 
     * @param value
     */
    public native void advanceTime(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.advanceTime(value);
    }-*/;

    /**
     * Animates the property of an object to a target value.
     * 
     * @param property
     * @param targetValue
     */
    public native void animate(String property, double targetValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.animate(property, targetValue);
    }-*/;

    /**
     * Animates the 'alpha' property of an object to a certain target value.
     * 
     * @param value
     */
    public native void fadeTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.fadeTo(value);
    }-*/;

    /**
     * Animates the 'x' and 'y' properties of an object simultaneously.
     * 
     * @param x
     * @param y
     */
    public native void moveTo(double x, double y)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.moveTo(x, y);
    }-*/;

    /**
     * 
     * 
     * @param value
     */
    public native void scaleTo(double factor)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.scaleTo(factor);
    }-*/;

}
