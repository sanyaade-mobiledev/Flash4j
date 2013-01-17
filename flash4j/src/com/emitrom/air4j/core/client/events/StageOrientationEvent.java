/************************************************************************
  StageOrientationEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class StageOrientationEvent extends Event {

    public static final String ORIENTATION_CHANGE = getConstant("ORIENTATION_CHANGE");
    public static final String ORIENTATION_CHANGING = getConstant("ORIENTATION_CHANGING");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.StageOrientationEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.StageOrientationEvent[name];
    }-*/;

    protected StageOrientationEvent(JavaScriptObject obj) {
        super(obj);
    }

    public final native String getAfterOrientation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.afterOrientation;
    }-*/;

    public final native String getBeforeOrientation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.beforeOrientation;
    }-*/;

    public static StageOrientationEvent cast(Event e) {
        return new StageOrientationEvent(e.getJsObj());
    }

}
