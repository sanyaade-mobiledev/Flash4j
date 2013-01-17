/************************************************************************
  ProgressEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class ProgressEvent extends Event {

    public static String PROGRESS = getConstant("PROGRESS");
    public static String SOCKET_DATA = getConstant("SOCKET_DATA");
    public static String STANDARD_ERROR_DATA = getConstant("STANDARD_ERROR_DATA");
    public static String STANDARD_INPUT_PROGRESS = getConstant("STANDARD_INPUT_PROGRESS");
    public static String STANDARD_OUTPUT_DATA = getConstant("STANDARD_OUTPUT_DATA");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.ProgressEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.ProgressEvent[name];
    }-*/;

    protected ProgressEvent() {
    }

    private ProgressEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native double getBytesLoaded() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesLoaded;
    }-*/;

    public native int getBytesTotal() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesTotal;
    }-*/;

    public static ProgressEvent cast(Event e) {
        return new ProgressEvent(e.getJsObj());
    }

}
