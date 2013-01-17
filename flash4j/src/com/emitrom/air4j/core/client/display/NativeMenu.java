/************************************************************************
  NativeMenu.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.display;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class NativeMenu extends EventDispatcher {

    protected NativeMenu(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected NativeMenu() {

    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.NativeMenu;
    }-*/;

    public static native boolean isSupported() /*-{
		return new $wnd.runtime.flash.display.NativeMenu.isSupported;
    }-*/;

    public List<NativeMenuItem> getItems() {
        List<NativeMenuItem> items = new ArrayList<NativeMenuItem>();
        JavaScriptObject nativePeers = _getItems();
        int size = JsoHelper.arrayLength(nativePeers);
        for (int i = 0; i < size; i++) {
            items.add(new NativeMenuItem(JsoHelper.getValueFromJavaScriptObjectArray(nativePeers, i)));
        }
        return items;
    }

    private native JavaScriptObject _getItems() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.items;
    }-*/;

    public native int getNumItems() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.numItems;
    }-*/;

    public native NativeMenu getParent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.parent;
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native NativeMenuItem addItem(NativeMenuItem item) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.addItem(item.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native NativeMenuItem addItemAt(NativeMenuItem item, int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.addItemAt(
				item.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				index);
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native NativeMenuItem addSubmenu(NativeMenu submenu, String label) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.addSubmenu(
						submenu.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						label);
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native NativeMenuItem addSubmenuAt(NativeMenu submenu, int index, String label) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.addSubmenuAt(
						submenu.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						index, label);
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native NativeMenu clone() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean containsItem(NativeMenuItem item) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.containsItem(item.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void display(Stage stage, int stageX, int stageY) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.display(
				stage.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				stageX, stageY);
    }-*/;

    public native NativeMenuItem getItemAt(int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getItemAt(index);
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native NativeMenuItem getItemByName(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getItemByName(name);
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getItemIndex(NativeMenuItem item) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getItemIndex(item.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native NativeMenuItem removeItem(NativeMenuItem item) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.removeItem(item.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native NativeMenuItem removeItemAt(int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.removeItemAt(index);
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void removeAllItems() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.removeAllItems();
    }-*/;

    public native void setItemIndex(NativeMenuItem item, int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setItemIndex(
				item.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				index);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.display.NativeMenu();
    }-*/;

}
