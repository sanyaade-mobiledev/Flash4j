/************************************************************************
  Juggler.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.Function;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Juggler takes objects that implement IAnimatable (like Tweens) and
 * executes them. A juggler is a simple object. It does no more than saving a
 * list of objects implementing "IAnimatable" and advancing their time if it is
 * told to do so (by calling its own "advanceTime"-method). When an animation is
 * completed, it throws it away.
 * <p>
 * There is a default juggler available at the Starling class: <br/>
 * 
 * <code>Juggler juggler = Starling.getJuggler();</code>
 * </p>
 * 
 * You can create juggler objects yourself, just as well. That way, you can
 * group your game into logical components that handle their animations
 * independently. All you have to do is call the "advanceTime" method on your
 * custom juggler once per frame.
 * <p>
 * Another handy feature of the juggler is the "delayCall"-method. Use it to
 * execute a function at a later time. Different to conventional approaches, the
 * method will only be called when the juggler is advanced, giving you perfect
 * control over the call.
 * 
 * 
 */
public class Juggler extends ProxyObject implements IAnimatable {

    protected Juggler() {

    }

    Juggler(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * [read-only] The total life time of the juggler.
     * 
     * @return
     */
    public native double getElapsedTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getelapsedTime();
    }-*/;

    /**
     * [read-only] Always returns 'false'.
     * 
     * @return
     */
    public native boolean isComplete()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisComplete();
    }-*/;

    /**
     * Advanced all objects by a certain time (in seconds).
     * 
     * @param time
     */
    public native void advanceTime(double time)/*-{
		peer.advanceTime(time);
    }-*/;

    /**
     * Delays the execution of a function until a certain time has passed.
     * 
     * @param callBack
     * @param delay
     * @param args
     * @return
     */
    public native DelayedCall delayedCall(Function callBack, double delay, Object... args)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.delayCall.apply(function() {
			callback.@com.emitrom.flash4j.core.client.Function::execute()()
		}, delay, args);
		return @com.emitrom.flash4j.starling.client.animation.DelayedCall::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Removes all objects at once.
     */
    public native void purge()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.purge();
    }-*/;

    /**
     * Removes an object from the juggler.
     * 
     * @param object
     */
    public void remove(IAnimatable animatable) {
        _remove(animatable.asIAnimatable());
    }

    private native void _remove(JavaScriptObject object)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.remove(object);
    }-*/;

    /**
     * Removes all tweens with a certain target.
     * 
     * @param value
     */
    public native void removeTweens(ProxyObject target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.removeTweens(target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public void add(IAnimatable animatable) {
        _add(animatable.asIAnimatable());
    }

    @Override
    public JavaScriptObject asIAnimatable() {
        return getJsObj().cast();
    }

    /**
     * Adds an object to the juggler.
     * 
     * @param animatable
     */
    private native void _add(JavaScriptObject animatable)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.add(animatable);
    }-*/;

}
