/************************************************************************
  NetMonitorEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.net.NetStream;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class NetMonitorEvent.
 */
public class NetMonitorEvent extends Event {

    /** The Constant NET_STREM_CREATE. */
    public static final String NET_STREM_CREATE = "netScreamCreate";

    /**
     * Instantiates a new net monitor event.
     */
    protected NetMonitorEvent() {

    }

    NetMonitorEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the net stream.
     * 
     * @return the net stream
     */
    public native NetStream getNetStream()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getnetStream();
		return @com.emitrom.flash4j.core.client.net.NetStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static NetMonitorEvent cast(Event event) {
        return new NetMonitorEvent(event.getJsObj());
    }

}
