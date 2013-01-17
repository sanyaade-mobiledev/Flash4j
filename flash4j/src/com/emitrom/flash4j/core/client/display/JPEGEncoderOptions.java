/************************************************************************
 * JPEGEncoderOptions.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.core.client.display;

import com.emitrom.flash4j.core.client.framework.Bridge;

/**
 * The JPEGEncoderOptions class defines a compression algorithm for the
 * flash.display.BitmapData.encode() method.
 * 
 * @author Ekambi
 * 
 */
public class JPEGEncoderOptions extends BitmapEncoderOptions {

    public JPEGEncoderOptions() {
        jsObj = Bridge.createObject("flash.display.JPEGEncoderOptions");
    }

    public JPEGEncoderOptions(int quality) {
        this();
        setQuality(quality);
    }

    /**
     * A value between 1 and 100, where 1 means the lowest quality and 100 means
     * the highest quality.
     * 
     * @return
     */
    public native int getQuality()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getquality();
    }-*/;

    /**
     * A value between 1 and 100, where 1 means the lowest quality and 100 means
     * the highest quality.
     * 
     * @param value
     */
    public native void setQuality(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setquality(value);
    }-*/;

}
