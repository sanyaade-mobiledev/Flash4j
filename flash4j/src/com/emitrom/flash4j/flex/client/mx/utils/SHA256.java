/************************************************************************
  SHA256.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class SHA256.
 */
public class SHA256 extends ProxyObject {

    private final static SHA256 INSTANCE = new SHA256(Bridge.createObject("mx.utils.SHA256"));

    /** The Constant TYPE_ID. */
    public static final String TYPE_ID = "SHA-256";

    /**
     * Instantiates a new sH a256.
     */
    protected SHA256(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the sH a256
     */
    private static SHA256 get() {
        return INSTANCE;
    }

    /**
     * Compute digest.
     * 
     * @param byteArray the byte array
     * @return the string
     */
    public static String computeDigest(ByteArray byteArray) {
        return get()._computeDigest(byteArray);
    }

    /**
     * _compute digest.
     * 
     * @param byteArray the byte array
     * @return the string
     */
    private final native String _computeDigest(ByteArray byteArray)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.computeDigest(byteArray.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
