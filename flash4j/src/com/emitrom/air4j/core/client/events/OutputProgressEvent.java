/************************************************************************
  OutputProgressEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class OutputProgressEvent extends Event {

    public static final String OUTPUT_PROGRESS = getConstant("OUTPUT_PROGRESS");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.OutputProgressEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.OutputProgressEvent[name];
    }-*/;

    protected OutputProgressEvent(JavaScriptObject obj) {
        super(obj);
    }

    public final native int getBytesPending() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesPending;
    }-*/;

    public final native int getBytesTotal() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesTotal;
    }-*/;

    public static OutputProgressEvent cast(Event e) {
        return new OutputProgressEvent(e.getJsObj());
    }

}
