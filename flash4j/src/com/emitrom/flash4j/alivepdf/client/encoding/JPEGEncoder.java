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

package com.emitrom.flash4j.alivepdf.client.encoding;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.BitmapData;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class JPEGEncoder.
 */
public class JPEGEncoder extends ProxyObject {

    /**
     * Instantiates a new jPEG encoder.
     */
    JPEGEncoder(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the jPEG encoder
     */
    public JPEGEncoder() {
        jsObj = Bridge.createObject("org.alivepdf.encoding.JPEGEncoder");
    }

    /**
     * Encode.
     * 
     * @param image the image
     * @return the byte array
     */
    public final native ByteArray encode(BitmapData image) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.encode(image.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
