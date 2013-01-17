/************************************************************************
  NativeWindowBoundsEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

public class NativeWindowBoundsEvent extends Event {

    public static final String MOVING = getConstant("MOVING");
    public static final String MOVE = getConstant("MOVE");
    public static final String RESIZING = getConstant("RESIZING");
    public static final String RESIZE = getConstant("RESIZE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.NativeWindowBoundsEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.NativeWindowBoundsEvent[name];
    }-*/;

    protected NativeWindowBoundsEvent(JavaScriptObject obj) {
        super(obj);
    }

    public final native Rectangle getAfterBounds() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.afterBounds;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Rectangle getBeforeBounds() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.beforeBounds;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static NativeWindowBoundsEvent cast(Event e) {
        return new NativeWindowBoundsEvent(e.getJsObj());
    }
}
