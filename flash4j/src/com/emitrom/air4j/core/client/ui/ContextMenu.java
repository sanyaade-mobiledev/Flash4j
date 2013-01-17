/************************************************************************
  ContextMenu.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.display.NativeMenu;
import com.emitrom.air4j.core.client.net.URLRequest;
import com.emitrom.air4j.core.client.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

public class ContextMenu extends NativeMenu {

    protected ContextMenu(JavaScriptObject obj) {
        super(obj);
    }

    public ContextMenu() {
        jsObj = newInstance();
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.ui.ContextMenu;
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.ui.ContextMenu();
    }-*/;

    public native ContextMenuBuiltInItems getBuiltInItems()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.builtInItems;
		return @com.emitrom.air4j.core.client.ui.ContextMenuBuiltInItems::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setBuiltInItems(ContextMenuBuiltInItems value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.builtInItems = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native ContextMenuClipboardItems getClipboardItems()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clipboardItems;
		return @com.emitrom.air4j.core.client.ui.ContextMenuClipboardItems::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setClipboardItems(ContextMenuClipboardItems value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clipboardItems = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean clipboardMenu()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.clipboardMenu;
    }-*/;

    public native void setClipboardMenu(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clipboardMenu = value;
    }-*/;

    public List<ContextMenuItem> getCustomItems() {
        List<ContextMenuItem> toReturn = new ArrayList<ContextMenuItem>();
        JavaScriptObject peers = _getCustomItems();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ContextMenuItem(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getCustomItems()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.customItems;
    }-*/;

    public void setCustomItems(ContextMenuItem... items) {
        _setCustomItems(DataConverter.fromList(Arrays.asList(items)));
    }

    private native void _setCustomItems(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.customItems = values;
    }-*/;

    public static native boolean isSupported()/*-{
		return $wnd.runtime.flash.ui.ContextMenu.isSupported;
    }-*/;

    public native URLRequest getLink()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.link;
		return @com.emitrom.air4j.core.client.net.URLRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setLink(URLRequest value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.link = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void hideBuiltInItems()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.hideBuiltInItems();
    }-*/;

}
