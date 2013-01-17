/************************************************************************
  GeolocationEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class GeolocationEvent extends Event {

    public static final String UPDATE = getConstant("UPDATE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.GeolocationEvent;
    }-*/;

    protected GeolocationEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.GeolocationEvent[name];
    }-*/;

    public final native double getAltitude() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.altitude;
    }-*/;

    public final native double getHeading() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.heading;
    }-*/;

    public final native double getHorizontalAccuracy() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.horizontalAccuracy;
    }-*/;

    public final native double getLatitude() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.latitude;
    }-*/;

    public final native double getLongitute() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.longitude;
    }-*/;

    public final native double getSpeed() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.speed;
    }-*/;

    public final native double getTimeStamp() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.timeStamp;
    }-*/;

    public final native double getVerticalAccuracy() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.verticalAccuracy;
    }-*/;

    public static GeolocationEvent cast(Event e) {
        return new GeolocationEvent(e.getJsObj());
    }

}
