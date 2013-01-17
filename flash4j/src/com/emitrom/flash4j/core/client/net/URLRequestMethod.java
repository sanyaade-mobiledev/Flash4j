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

package com.emitrom.flash4j.core.client.net;

/**
 * The Enum URLRequestMethod.
 */
public enum URLRequestMethod {

    /** The DELETE. */
    DELETE("delete"),

    /** The GET. */
    GET("get"),

    /** The HEAD. */
    HEAD("head"),

    /** The OPTIONS. */
    OPTIONS("options"),

    /** The POST. */
    POST("post"),

    /** The PUT. */
    PUT("put");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new uRL request method.
     * 
     * @param reference the reference
     */
    private URLRequestMethod(String reference) {
        value = reference;
    }

    /**
     * Creates the peer.
     * 
     * @param reference the reference
     * @return the string
     */
    private native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.net.URLRequestMethod[reference];
    }-*/;

    /**
     * From value.
     * 
     * @param value the value
     * @return the uRL request method
     */
    public static native URLRequestMethod fromValue(String value) /*-{
		switch (value) {
		case 'delete':
			return @com.emitrom.flash4j.core.client.net.URLRequestMethod::DELETE;

		case 'get':
			return @com.emitrom.flash4j.core.client.net.URLRequestMethod::GET;

		case 'head':
			return @com.emitrom.flash4j.core.client.net.URLRequestMethod::HEAD;

		case 'options':
			return @com.emitrom.flash4j.core.client.net.URLRequestMethod::OPTIONS;

		case 'post':
			return @com.emitrom.flash4j.core.client.net.URLRequestMethod::POST;

		case 'put':
			return @com.emitrom.flash4j.core.client.net.URLRequestMethod::PUT;

		}
    }-*/;
}
