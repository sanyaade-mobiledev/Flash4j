/************************************************************************
  HTMLHost.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

public class HTMLHost extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.html.HTMLHist;
    }-*/;

    public HTMLHost() {
        jsObj = newInstance();
    }

    public HTMLHost(boolean defaultBehaviors) {
        jsObj = newInstance(defaultBehaviors);
    }

    protected HTMLHost(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native HTMLLoader getHTMLLoader() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.htmlLoader;
    }-*/;

    public native Rectangle getWindowRect() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.windowRect;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setWindowRect(Rectangle windowRect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.windowRect = windowRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native HTMLLoader createWindow(HTMLWindowCreateOptions windowCreateOptions) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createWindow(windowCreateOptions.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void updateLocation(String locationURL) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.updateLocation(locationURL);
    }-*/;

    public native void updateStatus(String status) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.updateStatus(status);
    }-*/;

    public native void updateTitle(String title) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.updateTitle(title);
    }-*/;

    public native void windowBlur() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.windowBlur();
    }-*/;

    public native void windowClose() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.windowClose();
    }-*/;

    public native void windowFocus() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.windowFocus();
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.html.HTMLHost();
    }-*/;

    private static native JavaScriptObject newInstance(boolean defaultBehaviors) /*-{
		return new $wnd.runtime.flash.html.HTMLHost(defaultBehaviors);
    }-*/;
}
