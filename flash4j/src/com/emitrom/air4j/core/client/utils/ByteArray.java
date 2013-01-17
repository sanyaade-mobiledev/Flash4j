/************************************************************************
  ByteArray.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.utils;

import com.emitrom.air4j.core.client.net.ObjectEncoding;
import com.google.gwt.core.client.JavaScriptObject;

public final class ByteArray extends IoClass {

    public ByteArray() {
        jsObj = createPeer();
    }

    protected ByteArray(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static native JavaScriptObject createPeer() /*-{
		return new $wnd.runtime.flash.utils.ByteArray();
    }-*/;

    public static ObjectEncoding getDefaultObjectEncoding() {
        return ObjectEncoding.fromValue(_getDefaultObjectEncoding());
    }

    private static native int _getDefaultObjectEncoding() /*-{
		return $wnd.runtime.flash.utils.ByteArray.defaultObjectEncoding;
    }-*/;

    public static void setDefaultObjectEncoding(ObjectEncoding objectEncoding) {
        _setDefaultObjectEncoding(objectEncoding.value);
    }

    private static native void _setDefaultObjectEncoding(int objectEncoding) /*-{
		$wnd.runtime.flash.utils.ByteArray.defaultObjectEncoding = objectEncoding;
    }-*/;

    /**
     * Gets the length.
     * 
     * @return the length
     */
    public native double getLength()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.length;
    }-*/;

    /**
     * Sets the length.
     * 
     * @param length
     *            the new length
     */
    public native void setLength(double length)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.length = length;
    }-*/;

    /**
     * Gets the position.
     * 
     * @return the position
     */
    public native double getPosition()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.position;
    }-*/;

    /**
     * Sets the position.
     * 
     * @param position
     *            the new position
     */
    public native void setPosition(double position)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.position = position;
    }-*/;

    /**
     * Clear.
     */
    public native void clear() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * Compress.
     * 
     * @param algorithm
     *            the algorithm
     */
    public void compress(CompressionAlgorithm algorithm) {
        _compress(algorithm.value);
    }

    private native void _compress(String algorithm) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.compress(algorithm);
    }-*/;

    /**
     * Deflate.
     */
    public native void deflate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.deflate();
    }-*/;

    /**
     * Inflate.
     */
    public native void inflate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.inflate();
    }-*/;

    /**
     * Uncompress.
     * 
     * @param algorithm
     *            the algorithm
     */
    public void uncompress(CompressionAlgorithm algorithm) {
        _uncompress(algorithm.value);
    }

    private native void _uncompress(String algorithm) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.uncompress(algorithm);
    }-*/;

}
