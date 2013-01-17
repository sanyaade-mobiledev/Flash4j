/************************************************************************
  InvokeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.desktop.InvokeEventReason;
import com.emitrom.air4j.core.client.filesystem.File;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class InvokeEvent extends Event {

    public static final String INVOKE = getConstant("INVOKE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.InvokeEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.InvokeEvent[name];
    }-*/;

    protected InvokeEvent() {
    }

    private InvokeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native JsArrayString getArguments() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.arguments;
    }-*/;

    public final native File getCurrentDirectory() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.currentDirectory;
		var toReturn = @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public final InvokeEventReason getReason() {
        return InvokeEventReason.fromValue(_getReason());
    }

    public static InvokeEvent cast(Event e) {
        return new InvokeEvent(e.getJsObj());
    }

    private native String _getReason() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.reason;
    }-*/;
}
