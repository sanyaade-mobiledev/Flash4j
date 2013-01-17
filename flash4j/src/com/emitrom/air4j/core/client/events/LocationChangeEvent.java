/************************************************************************
  LocationChangeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class LocationChangeEvent extends Event {

    public static final String LOCATION_CHANGE = getConstant("LOCATION_CHANGE");
    public static final String LOCATION_CHANGING = getConstant("LOCATION_CHANGING");

    protected LocationChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.LocationChangeEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.LocationChangeEvent[name];
    }-*/;

    public final native String getLocation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.location;
    }-*/;

    public final native void setLocation(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.location = value;
    }-*/;

    public static LocationChangeEvent cast(Event e) {
        return new LocationChangeEvent(e.getJsObj());
    }
}
