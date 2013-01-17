/************************************************************************
  StageWebView.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.media;

import com.emitrom.air4j.core.client.display.FocusDirection;
import com.emitrom.air4j.core.client.display.Stage;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

public class StageWebView extends EventDispatcher {

    protected StageWebView(JavaScriptObject obj) {
        jsObj = obj;
    }

    public StageWebView() {
        jsObj = newInstance();
    }

    public native boolean isHistoryBackEnabled() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isHistoryBackEnabled;
    }-*/;

    public native boolean isHistoryForwardEnabled() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isHistoryForwardEnabled;
    }-*/;

    public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.media.StageWebView.isSupported;
    }-*/;

    public native String getLocation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.location;
    }-*/;

    public native Stage getStage() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.stage;
		return @com.emitrom.air4j.core.client.display.Stage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setStage(Stage value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stage = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native String getTitle() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.title;
    }-*/;

    public native Rectangle getViewPort()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.viewPort;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setViewPort(Rectangle value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.viewPort = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void assignFocus()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.assignFocus();
    }-*/;

    public void assignFocus(FocusDirection direction) {
        _assignFocus(direction.value);
    }

    private native void _assignFocus(String value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.assignFocus(value);
    }-*/;

    private native void dispose()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.dispose();
    }-*/;

    private native void historyBack()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.historyBack();
    }-*/;

    private native void historyForward()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.historyForward();
    }-*/;

    private native void loadString(String value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.loadString(value);
    }-*/;

    private native void loadString(String value, String mimeType)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.loadString(value, mimeType);
    }-*/;

    private native void loadURL(String value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.loadURL(value);
    }-*/;

    private native void reload()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.reload();
    }-*/;

    private native void strop()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.media.StageWebView();
    }-*/;

}
