/************************************************************************
  HTMLWindowCreateOptions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.html;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class HTMLWindowCreateOptions extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.html.HTMLWindowCreateOptions;
    }-*/;

    protected HTMLWindowCreateOptions(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native boolean isFullscreen() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.fullscreen;
    }-*/;

    public native void setFullscreen(boolean fullscreen) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.fullscreen = fullscreen;
    }-*/;

    public native double getHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.height;
    }-*/;

    public native void setHeight(double height) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.height = height;
    }-*/;

    public native boolean isLocationBarVisible() /*-{
		return peer.locationBarVisible;
    }-*/;

    public native void setLocationBarVisible(boolean locationBarVisible) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.locationBarVisible = locationBarVisible;
    }-*/;

    public native boolean isMenuBarVisible() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.menuBarVisible;
    }-*/;

    public native void setMenuBarVisible(boolean menuBarVisible) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.menuBarVisible = menuBarVisible;
    }-*/;

    public native boolean isResizable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.resizable;
    }-*/;

    public native void setResizable(boolean resizable) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.resizable = resizable;
    }-*/;

    public native boolean getScrollBarsVisible() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scrollBarsVisible;
    }-*/;

    public native void setScrollBarsVisible(boolean scrollBarsVisible) /*-{
		peer.scrollBarsVisible = scrollBarsVisible;
    }-*/;

    public native boolean isStatusBarVisible() /*-{
		return peer.statusBarVisible;
    }-*/;

    public native void setStatusBarVisible(boolean statusBarVisible) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.statusBarVisible = statusBarVisible;
    }-*/;

    public native boolean isToolBarVisible() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.toolBarVisible;
    }-*/;

    public native void setToolBarVisible(boolean toolBarVisible) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.toolBarVisible = toolBarVisible;
    }-*/;

    public native double getWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.width;
    }-*/;

    public native void setWidth(double width) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.width = width;
    }-*/;

    public native double getX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.x;
    }-*/;

    public native void setX(double x) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.x = x;
    }-*/;

    public native double getY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.y;
    }-*/;

    public native void setY(double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.y = y;
    }-*/;
}
