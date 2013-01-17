/************************************************************************
  ContextMenuClipboardItems.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.ui;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class ContextMenuClipboardItems extends ProxyObject {

    public ContextMenuClipboardItems() {
        jsObj = newInstance();
    }

    protected ContextMenuClipboardItems(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.ui.ContextMenuClipboardItems;
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.ui.ContextMenuClipboardItems();
    }-*/;

    public native boolean clear()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.clear;
    }-*/;

    public native void setClear(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clear = value;
    }-*/;

    public native boolean copy()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.copy;
    }-*/;

    public native void setCopy(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.copy = value;
    }-*/;

    public native boolean cut()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.cut;
    }-*/;

    public native void setCut(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.cut = value;
    }-*/;

    public native boolean paste()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.paste;
    }-*/;

    public native void setPaste(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.paste = value;
    }-*/;

    public native boolean selectAll()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.selectAll;
    }-*/;

    public native void setSelectAll(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.selectAll = value;
    }-*/;

}
