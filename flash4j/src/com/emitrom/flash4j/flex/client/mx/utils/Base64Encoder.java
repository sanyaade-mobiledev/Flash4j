/************************************************************************
  Base64Encoder.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.utils;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Base64Encoder.
 */
public class Base64Encoder extends ProxyObject {

    /**
     * Instantiates a new base64 encoder.
     */
    protected Base64Encoder(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the base64 encoder
     */
    public Base64Encoder() {
        jsObj = Bridge.createObject("mx.utils.Base64Encoder");
    }

    /**
     * Encode.
     * 
     * @param value the value
     */
    public final native void encode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.encode(value);
    }-*/;

    /**
     * Encode.
     * 
     * @param value the value
     * @param offset the offset
     */
    public final native void encode(String value, int offset)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.encode(value, offset);
    }-*/;

    /**
     * Encode.
     * 
     * @param value the value
     * @param offset the offset
     * @param length the length
     */
    public final native void encode(String value, int offset, int length)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.encode(value, offset, length);
    }-*/;

    /**
     * Encode bytes.
     * 
     * @param data the data
     */
    public final native void encodeBytes(ByteArray data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.encodeBytes(data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Encode bytes.
     * 
     * @param data the data
     * @param offset the offset
     */
    public final native void encodeBytes(ByteArray data, int offset)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.encodeBytes(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						offset);
    }-*/;

    /**
     * Encode bytes.
     * 
     * @param data the data
     * @param offset the offset
     * @param length the length
     */
    public final native void encodeBytes(ByteArray data, int offset, int length)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.encodeBytes(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						offset, length);
    }-*/;

    /**
     * Encode utf bytes.
     * 
     * @param data the data
     */
    public final native void encodeUTFBytes(String data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.encodeUTFBytes(data);
    }-*/;

    /**
     * Reset.
     */
    public final native void reset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.reset();
    }-*/;

    /**
     * To string value.
     * 
     * @return the string
     */
    public final native String toStringValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.toString();
    }-*/;
}
