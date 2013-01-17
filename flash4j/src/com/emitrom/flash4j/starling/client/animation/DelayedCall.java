/************************************************************************
  DelayedCall.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.starling.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A DelayedCall allows you to execute a method after a certain time has passed.
 * Since it implements the IAnimatable interface, it can be added to a juggler.
 * In most cases, you do not have to use peer class directly; the juggler class
 * contains a method to delay calls directly.
 * 
 * 
 */
public class DelayedCall extends EventDispatcher implements IAnimatable {

    DelayedCall() {

    }

    DelayedCall(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * [read-only] Indicates if the animation is finished.
     * 
     * @return
     */
    public native double getCurrentTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentTime();
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
     * The number of times the call will be repeated.
     * 
     * @return
     */
    public native int getRepeatCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrepeatCount();
    }-*/;

    public native void setRepeatCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrepeatCount(value);
    }-*/;

    /**
     * [read-only] The time for which calls will be delayed (in seconds).
     * 
     * @return
     */
    public native int getTotalTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getTotalTime();
    }-*/;

    /**
     * Advanced all objects by a certain time (in seconds).
     * 
     * @param time
     */
    public native void advanceTime(double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.advanceTime(time);
    }-*/;

    @Override
    public JavaScriptObject asIAnimatable() {
        return getJsObj().cast();
    }

}
