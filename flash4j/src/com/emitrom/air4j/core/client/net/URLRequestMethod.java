/************************************************************************
  URLRequestMethod.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum URLRequestMethod {
	DELETE("DELETE"), GET("GET"), HEAD("HEAD"), OPTIONS("OPTIONS"), POST("POST"), PUT(
			"PUT");

	public final String value;

	private URLRequestMethod(String reference) {
		value = createPeer(reference);
	}

	private native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.net.URLRequestMethod[reference];
	}-*/;

	public static native URLRequestMethod fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.net.URLRequestMethod.DELETE:
			return @com.emitrom.air4j.core.client.net.URLRequestMethod::DELETE;
		case $wnd.runtime.flash.net.URLRequestMethod.GET:
			return @com.emitrom.air4j.core.client.net.URLRequestMethod::GET;
		case $wnd.runtime.flash.net.URLRequestMethod.HEAD:
			return @com.emitrom.air4j.core.client.net.URLRequestMethod::HEAD;
		case $wnd.runtime.flash.net.URLRequestMethod.OPTIONS:
			return @com.emitrom.air4j.core.client.net.URLRequestMethod::OPTIONS;
		case $wnd.runtime.flash.net.URLRequestMethod.POST:
			return @com.emitrom.air4j.core.client.net.URLRequestMethod::POST;
		case $wnd.runtime.flash.net.URLRequestMethod.PUT:
			return @com.emitrom.air4j.core.client.net.URLRequestMethod::PUT;
		}
	}-*/;
}
