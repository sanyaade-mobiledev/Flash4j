/************************************************************************
  JPEGEncoder.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.graphics.codec;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.BitmapData;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class JPEGEncoder.
 */
public class JPEGEncoder extends ProxyObject implements IImageEncoder {

    /**
     * Instantiates a new jPEG encoder.
     */
    protected JPEGEncoder(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the jPEG encoder
     */
    public JPEGEncoder() {
        jsObj = Bridge.createObject("mx.graphics.codec.JPEGEncoder");
    }

    /**
     * Gets the content type.
     * 
     * @return the content type
     */
    public final native String getContentType()/*-{
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return peer.getcontentType();
    }-*/;

    /**
     * Encode.
     * 
     * @param bitmapData the bitmap data
     * @return the byte array
     */
    public final native ByteArray encode(BitmapData bitmapData)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.encode(bitmapData.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Encode byte array.
     * 
     * @param byteArray the byte array
     * @param width the width
     * @param height the height
     * @return the byte array
     */
    public final native ByteArray encodeByteArray(ByteArray byteArray, int width, int height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.encodeByteArray(
						byteArray.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height);
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Encode byte array.
     * 
     * @param byteArray the byte array
     * @param width the width
     * @param height the height
     * @param transparent the transparent
     * @return the byte array
     */
    public final native ByteArray encodeByteArray(ByteArray byteArray, int width, int height, boolean transparent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.encodeByteArray(
						byteArray.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, transparent);
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    @Override
    public JavaScriptObject asIImageEncoder() {
        return this.jsObj.cast();
    }

}
