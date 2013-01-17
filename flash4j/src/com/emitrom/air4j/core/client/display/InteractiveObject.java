/************************************************************************
  InteractiveObject.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.google.gwt.core.client.JavaScriptObject;

public class InteractiveObject extends DisplayObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.IntercativeObject;
    }-*/;

    protected InteractiveObject() {

    }

    protected InteractiveObject(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native NativeMenu getContextMenu() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.contextMenu;
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setContextMenu(NativeMenu menu) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.contextMenu = menu.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean isDoubleClickEnabled() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.doubleClickEnabled;
    }-*/;

    public native void doubleClickEnabled(boolean enable) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.doubleClickEnabled = enable;
    }-*/;

    public native <T> T getFocusRect() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.focusRect;
    }-*/;

    public native void setFocusRect(Object focus) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.focusRect = focus;
    }-*/;

    public native boolean isMouseEnabled() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.mouseEnabled;
    }-*/;

    public native void mouseEnabled(boolean enable) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.mouseEnabled = enable;
    }-*/;

    public native boolean hasTabEnabled() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tabEnabled;
    }-*/;

    public native void tabEnabled(boolean enable) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.tabnabled = enable;
    }-*/;

    public native int getTabIndex() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tabIndex;
    }-*/;

    public native void setTabIndex(int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.tabIndex = index;
    }-*/;

}
