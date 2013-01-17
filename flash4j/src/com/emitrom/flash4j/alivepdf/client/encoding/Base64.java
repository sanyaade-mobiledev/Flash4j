/************************************************************************
  Base64.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.encoding;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Base64.
 */
public class Base64 extends ProxyObject {

    private static final Base64 INSTANCE = new Base64(Bridge.createObject("org.alivepdf.encoding.Base64"));

    /**
     * Instantiates a new base64.
     */
    Base64(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the base64
     */
    private static Base64 create() {
        return INSTANCE;
    }

    /**
     * Encode64 string.
     * 
     * @param value the value
     * @return the string
     */
    public static String encode64String(String value) {
        return create()._encode64String(value);
    }

    /**
     * _encode64 string.
     * 
     * @param value the value
     * @return the string
     */
    private final native String _encode64String(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.encode64String(value);
    }-*/;

    /**
     * Encode64.
     * 
     * @param value the value
     * @return the string
     */
    public static String encode64(ByteArray value) {
        return create()._encode64(value);
    }

    /**
     * _encode64.
     * 
     * @param value the value
     * @return the string
     */
    private final native String _encode64(ByteArray value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.encode64(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Encode64.
     * 
     * @param value the value
     * @param lineBreak the line break
     * @return the string
     */
    public static String encode64(ByteArray value, boolean lineBreak) {
        return create()._encode64(value, lineBreak);
    }

    /**
     * _encode64.
     * 
     * @param value the value
     * @param lineBreak the line break
     * @return the string
     */
    private final native String _encode64(ByteArray value, boolean lineBreak)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.encode64(
						value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						lineBreak);
    }-*/;

    /**
     * Decode64.
     * 
     * @param value the value
     * @return the byte array
     */
    public static ByteArray decode64(String value) {
        return create()._decode64(value);
    }

    /**
     * _decode64.
     * 
     * @param value the value
     * @return the byte array
     */
    private final native ByteArray _decode64(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.decode64(value);
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
