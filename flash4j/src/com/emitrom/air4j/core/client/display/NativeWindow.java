/************************************************************************
  NativeWindow.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.desktop.NotificationType;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.geom.Point;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

public class NativeWindow extends EventDispatcher {

    private static final NativeWindow INSTANCE = new NativeWindow(_getInstance());

    public NativeWindow(JavaScriptObject obj) {
        jsObj = obj;
    }

    public NativeWindow() {
        jsObj = newInstance();
    }

    public static NativeWindow getMain() {
        return INSTANCE;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.NativeWindow;
    }-*/;

    public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.display.NativeWindow.isSupported;
    }-*/;

    public static native boolean supportsMenu() /*-{
		return $wnd.runtime.flash.display.NativeWindow.supportsMenu;
    }-*/;

    public static native boolean supportsNotification() /*-{
		return $wnd.runtime.flash.display.NativeWindow.supportsNotification;
    }-*/;

    public static native boolean supportsTransparency() /*-{
		return $wnd.runtime.flash.display.NativeWindow.supportsTransparency;
    }-*/;

    public static native Point getSystemMaxSize() /*-{
		return $wnd.runtime.flash.display.NativeWindow.systemMaxSize;
    }-*/;

    public static native Point getSystemMinSize() /*-{
		return $wnd.runtime.flash.display.NativeWindow.systemMaxSize;
    }-*/;

    public static native NativeWindow newInstance(NativeWindowInitOptions initOptions) /*-{
		return new $wnd.runtime.flash.display.NativeWindow(initOptions);
    }-*/;

    public native boolean isActive() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isActive;
    }-*/;

    public native boolean isAlwaysInFront() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.alwaysInFront;
    }-*/;

    public native void setAlwaysInFront(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.alwaysInFront = value;
    }-*/;

    public native Rectangle getBounds() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.bounds;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setBounds(Rectangle bounds) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bounds = bounds.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean isClosed() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.closed;
    }-*/;

    public NativeWindowDisplayState getDisplayState() {
        return NativeWindowDisplayState.fromValue(_getDisplayState());
    }

    private native String _getDisplayState() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.displayState;
    }-*/;

    public native double getHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.height;
    }-*/;

    public void setSize(double w, double h) {
        setWidth(w);
        setHeight(h);
    }

    public native void setHeight(double height) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.height = height;
    }-*/;

    public native boolean isMaximizable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.maximizable;
    }-*/;

    public native Point getMaxSize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.maxSize;
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setMaxSize(Point maxSize) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.maxSize = maxSize.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native NativeMenu getMenu() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.menu;
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setMenu(NativeMenu menu) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.menu = menu.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean isMinimizable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.minimizable;
    }-*/;

    public native Point getMinSize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.minSize;
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setMinSize(Point minSize) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.minSize = minSize.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean isResizable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.resizable;
    }-*/;

    public native Stage getStage() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.stage;
		return @com.emitrom.air4j.core.client.display.Stage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public NativeWindowSystemChrome getSystemChrome() {
        return NativeWindowSystemChrome.fromValue(_getSystemChrome());
    }

    private native String _getSystemChrome() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.systemChrome;
    }-*/;

    public native String getTitle() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.title;
    }-*/;

    public native void setTitle(String title) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.title = title;
    }-*/;

    public native boolean isTransparent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.transparent;
    }-*/;

    public NativeWindowType getType() {
        return NativeWindowType.fromValue(_getType());
    }

    private native String _getType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.type;
    }-*/;

    public native boolean isVisible() /*-{
		return peer.visible;
    }-*/;

    public native void setVisible(boolean visible) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.visible = visible;
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

    public native void activate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.activate();
    }-*/;

    public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
    }-*/;

    public native Point globalToString(Point globalPoint) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.globalToString(globalPoint);
		return @com.emitrom.air4j.core.client.display.Stage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void maximize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.maximize();
    }-*/;

    public native void minimize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.minimize();
    }-*/;

    public void notifyUser(NotificationType type) {
        _notifyUser(type.value);
    }

    private native void _notifyUser(String type) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.notifyUser(type);
    }-*/;

    public native boolean orderInBackOf(NativeWindow window) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.orderInBackOf(window.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean orderInFrontOf(NativeWindow window) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.orderInFrontOf(window.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean orderToBack() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.orderToBack();
    }-*/;

    public native boolean orderToFront() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.orderToFront();
    }-*/;

    public native void restore() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.restore();
    }-*/;

    public native boolean startMove() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.startMove();
    }-*/;

    public boolean startResize(NativeWindowResize edgeOrCorner) {
        return _startResize(edgeOrCorner.value);
    }

    private native boolean _startResize(String edgeOrCorner) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.startResize(edgeOrCorner);
    }-*/;

    private static native JavaScriptObject _getInstance() /*-{
		return $wnd.nativeWindow;
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.display.NativeWindow();
    }-*/;

}
