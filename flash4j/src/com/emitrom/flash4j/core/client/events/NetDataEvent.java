/************************************************************************
  NetDataEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class NetDataEvent.
 */
public class NetDataEvent extends Event {

    /** The Constant MEDIA_TYPE_DATA. */
    public static String MEDIA_TYPE_DATA = "mediaTypeData";

    /**
     * Instantiates a new net data event.
     */
    protected NetDataEvent() {

    }

    NetDataEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the info.
     * 
     * @param <T> the generic type
     * @return the info
     */
    public native <T> T getInfo() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinfo();
    }-*/;

    /**
     * Gets the time stamp.
     * 
     * @return the time stamp
     */
    public native double getTimeStamp()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.gettimestamp();
    }-*/;

    public static NetDataEvent cast(Event event) {
        return new NetDataEvent(event.getJsObj());
    }

}
