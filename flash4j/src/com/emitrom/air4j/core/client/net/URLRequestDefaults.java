/************************************************************************
  URLRequestDefaults.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.net;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public final class URLRequestDefaults extends ProxyObject {

	private static final URLRequestDefaults INSTANCE = new URLRequestDefaults(
			_get());

	public static URLRequestDefaults get() {
		return INSTANCE;
	}

	protected URLRequestDefaults(JavaScriptObject obj) {
		jsObj = obj;
	}

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

	public native boolean getFollowRedirects() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.followRedirects;
	}-*/;

	public native void setFollowRedirects(boolean followRedirects) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.followRedirects = followRedirects;
	}-*/;

	public native boolean getManageCookies() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.manageCookies;
	}-*/;

	public native void setManageCookies(boolean manageCookies) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.manageCookies = manageCookies;
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

	public native void setLoginCredentialsForHost(String hostname, String user,
			String password) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setLoginCredentialsForHost(hostname, user, password);
	}-*/;

	private static native JavaScriptObject _get() /*-{
		return $wnd.runtime.flash.net.URLRequestDefaults;
	}-*/;
}
