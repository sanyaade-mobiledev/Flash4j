/************************************************************************
  DNSResolverEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class DNSResolverEvent extends Event {

    public static final String LOOKUP = getConstant("LOOKUP");

    protected DNSResolverEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.DNSResolverEvent[name];
    }-*/;

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.DNSResolverEvent;
    }-*/;

    public final native String getHost() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.host;
    }-*/;

    public final native JsArray<JavaScriptObject> getResourceRecords() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.resourceRecords;
    }-*/;

    public static DNSResolverEvent cast(Event e) {
        return new DNSResolverEvent(e.getJsObj());
    }

}
