/************************************************************************
  DatagramSocketDataEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class DatagramSocketDataEvent extends Event {

    public static final String DATA = getConstant("DATA");

    protected DatagramSocketDataEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.DatagramSocketDataEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.DatagramSocketEvent[name];
    }-*/;

    public final native ByteArray getData() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.data;
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setData(ByteArray value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.data = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public final native String getDstAdress() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.dstAdress;
    }-*/;

    public final native void setDstAdress(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.dstAdress = value;
    }-*/;

    public final native int getDstPort() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.dstPort;
    }-*/;

    public final native void setDstPort(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.dstPort = value;
    }-*/;

    public final native String getSrcAdress() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.srcAdress;
    }-*/;

    public final native void setSrcAdress(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.srcAdress = value;
    }-*/;

    public final native int getSrcPort() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.srcPort;
    }-*/;

    public final native void setSrcPort(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.SrcPort = value;
    }-*/;

    public static DatagramSocketDataEvent cast(Event e) {
        return new DatagramSocketDataEvent(e.getJsObj());
    }

}
