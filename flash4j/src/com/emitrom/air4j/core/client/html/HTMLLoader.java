/************************************************************************
  HTMLLoader.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.display.NativeWindowInitOptions;
import com.emitrom.air4j.core.client.display.Sprite;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.emitrom.air4j.core.client.net.URLRequest;
import com.emitrom.air4j.core.client.system.ApplicationDomain;
import com.google.gwt.core.client.JavaScriptObject;

public class HTMLLoader extends Sprite {

    private static HTMLLoader INSTANCE = new HTMLLoader(getInstance());

    public static HTMLLoader getDefault() {
        return INSTANCE;
    }

    public HTMLLoader() {
        jsObj = newInstance();
    }

    protected HTMLLoader(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.html.HTMLLoader;
    }-*/;

    public static HTMLPDFCapability getPDFCapability() {
        return HTMLPDFCapability.fromValue(getPDFCapability0());
    }

    private static native int getPDFCapability0() /*-{
		return $wnd.runtime.flash.html.HTMLLoader.pdfCapability;
    }-*/;

    public static native HTMLLoader createRootWindow() /*-{
		var obj = $wnd.runtime.flash.html.HTMLLoader.createRootWindow();
		return @com.emitrom.air4j.core.client.html.HTMLLoader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native HTMLLoader createRootWindow(boolean visible) /*-{
		var obj = $wnd.runtime.flash.html.HTMLLoader.createRootWindow(visible);
		return @com.emitrom.air4j.core.client.html.HTMLLoader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native HTMLLoader createRootWindow(boolean visible, NativeWindowInitOptions windowInitOptions) /*-{
		var obj = $wnd.runtime.flash.html.HTMLLoader
				.createRootWindow(
						visible,
						windowInitOptions.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.html.HTMLLoader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native HTMLLoader createRootWindow(boolean visible, NativeWindowInitOptions windowInitOptions,
                    boolean scrollBarsVisible) /*-{
		var obj = $wnd.runtime.flash.html.HTMLLoader
				.createRootWindow(
						visible,
						windowInitOptions.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						scrollBarsVisible);
		return @com.emitrom.air4j.core.client.html.HTMLLoader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native HTMLLoader createRootWindow(boolean visible, NativeWindowInitOptions windowInitOptions,
                    boolean scrollBarsVisible, Rectangle bounds) /*-{
		var obj = $wnd.runtime.flash.html.HTMLLoader
				.createRootWindow(
						visible,
						windowInitOptions.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						scrollBarsVisible,
						bounds.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.html.HTMLLoader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean getAuthenticate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.authenticate;
    }-*/;

    public native void setAuthenticate(boolean authenticate) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.authenticate = authenticate;
    }-*/;

    public native boolean getCacheResponse() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.cacheResponse;
    }-*/;

    public native void setCacheResponse(boolean cacheResponse) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.cacheResponse = cacheResponse;
    }-*/;

    public native int getContentHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.contentHeight;
    }-*/;

    public native int getContentWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.contentWidth;
    }-*/;

    public native boolean hasFocusableContent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.hasFocusableContent;
    }-*/;

    public native void setHeight(int height) /*-{
		peer.height = height;
    }-*/;

    public native int getHistoryLength() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.historyLength;
    }-*/;

    public native int getHistoryPosition() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.historyPosition;
    }-*/;

    public native void setHistoryPosition(int historyPosition) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.historyPosition = historyPosition;
    }-*/;

    public native HTMLHost getHTMLHost() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.htmlHost;
		return @com.emitrom.air4j.core.client.html.HTMLHost::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setHTMLHost(HTMLHost htmlHost) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.htmlHost = htmlHost.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean isSupported() /*-{
		return $wnd.runtime.flash.html.HTMLLoader.isSupported;
    }-*/;

    public native boolean isLoaded() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.loaded;
    }-*/;

    public native String getLocation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.location;
    }-*/;

    public native boolean getManageCookies() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.manageCookies;
    }-*/;

    public native void setManageCookies(boolean manageCookies) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.manageCookies = manageCookies;
    }-*/;

    public native boolean getNavigateInSystemBrowser() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.navigateInSystemBrowser;
    }-*/;

    public native void setNavigateInSystemBrowser(boolean navigateInSystemBrowser) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.navigateInSystemBrowser = navigateInSystemBrowser;
    }-*/;

    public native boolean getPaintsDefaultBackground() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.paintsDefaultBackground;
    }-*/;

    public native void setPaintsDefaultBackground(boolean paintsDefaultBackground) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.paintsDefaultBackground = paintsDefaultBackground;
    }-*/;

    public native boolean getPlaceLoadStringContentInApplicationSandbox() /*-{
		if ("placeLoadStringContentInApplicationSandbox" in peer) {
			return peer.placeLoadStringContentInApplicationSandbox;
		} else {
			// pre-1.5
			return true;
		}
    }-*/;

    public native void setPlaceLoadStringContentInApplicationSandbox(boolean placeLoadStringContentInApplicationSandbox) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		if ("placeLoadStringContentInApplicationSandbox" in peer) {
			peer.placeLoadStringContentInApplicationSandbox = placeLoadStringContentInApplicationSandbox;
		}
    }-*/;

    public native ApplicationDomain getRuntimeApplication() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.runtimeApplication;
		return @com.emitrom.air4j.core.client.system.ApplicationDomain::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setRuntimeApplication(ApplicationDomain value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.runtimeApplication = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native int getScrollH() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scrollH;
    }-*/;

    public native void setScrollH(int scrollH) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scrollH = scrollH;
    }-*/;

    public native int getScrollV() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scrollV;
    }-*/;

    public native void setScrollV(int scrollV) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scrollV = scrollV;
    }-*/;

    public native String getTextEncodingFallback() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.textEncodingFallback;
    }-*/;

    public native void setTextEncodingFallback(String textEncodingFallback) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.textEncodingFallback = textEncodingFallback;
    }-*/;

    public native String getTextEncodingOverride() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.textEncodingOverride;
    }-*/;

    public native void setTextEncodingOverride(String textEncodingOverride) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.textEncodingOverride = textEncodingOverride;
    }-*/;

    public native boolean getUseCache() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.useCache;
    }-*/;

    public native void setUseCache(boolean useCache) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.useCache = useCache;
    }-*/;

    public native String getUserAgent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.userAgent;
    }-*/;

    public native void setUserAgent(String userAgent) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.userAgent = userAgent;
    }-*/;

    public native void setWidth(int width) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.width = width;
    }-*/;

    public native JavaScriptObject getWindow() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.window;
    }-*/;

    public native void cancelLoad() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.cancelLoad();
    }-*/;

    public native HTMLHistoryItem getHistoryAt(int position) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getHistoryAt(position);
		return @com.emitrom.air4j.core.client.html.HTMLHistoryItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void historyBack() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.historyBack();
    }-*/;

    public native void historyForward() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.historyForward();
    }-*/;

    public native void historyGo(int steps) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.historyGo(steps);
    }-*/;

    public native void load(URLRequest urlRequestToLoad) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.load(urlRequestToLoad.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void loadString(String htmlContent) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.loadString(htmlContent);
    }-*/;

    public native void reload() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.reload();
    }-*/;

    private static native JavaScriptObject getInstance() /*-{
		return $wnd.htmlLoader;
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.html.HTMLLoader();
    }-*/;
}
