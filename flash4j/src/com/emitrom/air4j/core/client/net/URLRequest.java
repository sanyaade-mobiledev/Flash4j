/************************************************************************
  URLRequest.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.emitrom.air4j.core.client.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

public class URLRequest extends ProxyObject {

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.URLRequest;
	}-*/;

	protected URLRequest(JavaScriptObject obj) {
		jsObj = obj;
	}

	public URLRequest() {
		jsObj = newInstance();
	}

	public URLRequest(String url) {
		jsObj = newInstance(url);
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

	public native String getContentType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.contentType;
	}-*/;

	public native void setContentType(String contentType) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.contentType = contentType;
	}-*/;

	public native ByteArray getDataAsByteArray() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.data;
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native URLVariables getDataAsURLVariables() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.data;
		return @com.emitrom.air4j.core.client.net.URLVariables::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native String getDataAsString() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.data;
	}-*/;

	public native void setData(ByteArray data) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.data = data.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
	}-*/;

	public native void setData(URLVariables data) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.data = data.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
	}-*/;

	public native void setData(String data) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.data = data;
	}-*/;

	public native String getDigest() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.digest;
	}-*/;

	public native void setDigest(String digest) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.digest = digest;
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

	public URLRequestMethod getMethod() {
		return URLRequestMethod.fromValue(getMethod0());
	}

	private native String getMethod0() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.method;
	}-*/;

	public void setMethod(URLRequestMethod method) {
		setMethod(method.value);
	}

	private native void setMethod(String method) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.method = method;
	}-*/;

	public List<URLRequestHeader> getRequestHeaders() {
		List<URLRequestHeader> toReturn = new ArrayList<URLRequestHeader>();
		JavaScriptObject peers = _getRequestHeaders();
		int size = JsoHelper.arrayLength(peers);
		for (int i = 0; i < size; i++) {
			toReturn.add(new URLRequestHeader(JsoHelper
					.getValueFromJavaScriptObjectArray(peers, i)));
		}
		return toReturn;
	}

	public native JavaScriptObject _getRequestHeaders() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.requestHeaders;
	}-*/;

	public void setRequestHeaders(URLRequestHeader... requestHeaders) {
		_setRequestHeaders(DataConverter
				.fromList(Arrays.asList(requestHeaders)));
	}

	private native void _setRequestHeaders(JavaScriptObject requestHeaders) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.requestHeaders = requestHeaders;
	}-*/;

	public native String getURL() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.url;
	}-*/;

	public native void setURL(String url) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.url = url;
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

	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.URLRequest();
	}-*/;

	private static native JavaScriptObject newInstance(String url) /*-{
		return new $wnd.runtime.flash.net.URLRequest(url);
	}-*/;
}
