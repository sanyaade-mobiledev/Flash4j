/************************************************************************
  Timer.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.utils;

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class Timer extends EventDispatcher {

    public Timer() {
        this(0);
    }

    public Timer(int delay) {
        jsObj = newInstance(delay);
    }

    public Timer(int delay, int repeatCount) {
        jsObj = newInstance(delay, repeatCount);
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.utils.Timer;
    }-*/;

    private static native JavaScriptObject newInstance(int delay) /*-{
		return new $wnd.runtime.flash.utils.Timer(delay);
    }-*/;

    private static native JavaScriptObject newInstance(int delay, int repeatCount) /*-{
		return new $wnd.runtime.flash.utils.Timer(delay, repeatCount);
    }-*/;

    protected Timer(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getCurrentCount() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.currentCount;
    }-*/;

    public native int getDelay() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.delay;
    }-*/;

    public native void setDelay(int delay) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.delay = delay;
    }-*/;

    public native int getRepeatCount() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.repeatCount;
    }-*/;

    public native void setRepeatCount(int repeatCount) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.repeatCount = repeatCount;
    }-*/;

    public native boolean isRunning() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.running;
    }-*/;

    public native void reset() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.reset();
    }-*/;

    public native void start() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.start();
    }-*/;

    public native void stop() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;

}
