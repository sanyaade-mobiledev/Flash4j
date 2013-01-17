/************************************************************************
  HTMLUncaughtScriptExeptionEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.events;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class HTMLUncaughtScriptExeptionEvent extends Event {

    public static final String UNCAUGHT_SCRIPT_EXCEPTION = getConstant("UNCAUGHT_SCRIPT_EXCEPTION");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.HTMLUncaughtScriptExeptionEvent;
    }-*/;

    protected HTMLUncaughtScriptExeptionEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.HTMLUncaughtScriptExeptionEvent[name];
    }-*/;

    public final native <T> T getExceptionValue() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.exceptionValue;
    }-*/;

    public final native JsArray<?> getStackTrace() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stackTrace;
    }-*/;

    public static HTMLUncaughtScriptExeptionEvent cast(Event e) {
        return new HTMLUncaughtScriptExeptionEvent(e.getJsObj());
    }

}
