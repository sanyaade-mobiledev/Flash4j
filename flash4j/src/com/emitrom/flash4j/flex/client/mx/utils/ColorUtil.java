/************************************************************************
  ColorUtil.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ColorUtil.
 */
public class ColorUtil extends ProxyObject {

    private static final ColorUtil INSTANCE = new ColorUtil(Bridge.createObject("mx.utils.ColorUtil"));

    /**
     * Instantiates a new color util.
     */
    protected ColorUtil(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the color util
     */
    private static ColorUtil get() {
        return INSTANCE;
    }

    /**
     * Adjust brightness.
     * 
     * @param rgb the rgb
     * @param brite the brite
     * @return the int
     */
    public static int adjustBrightness(int rgb, int brite) {
        return get()._adjustBrigthness(rgb, brite);
    }

    /**
     * _adjust brigthness.
     * 
     * @param rgb the rgb
     * @param brite the brite
     * @return the int
     */
    private final native int _adjustBrigthness(int rgb, int brite)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.adjustBrigthness(rgb, brite);
    }-*/;

    /**
     * Adjust brightness2.
     * 
     * @param rgb the rgb
     * @param brite the brite
     * @return the int
     */
    public static int adjustBrightness2(int rgb, int brite) {
        return get()._adjustBrigthness2(rgb, brite);
    }

    /**
     * _adjust brigthness2.
     * 
     * @param rgb the rgb
     * @param brite the brite
     * @return the int
     */
    private final native int _adjustBrigthness2(int rgb, int brite)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.adjustBrigthness2(rgb, brite);
    }-*/;

    /**
     * Rgb multiply.
     * 
     * @param rgb1 the rgb1
     * @param rgb2 the rgb2
     * @return the int
     */
    public static int rgbMultiply(int rgb1, int rgb2) {
        return get()._rgbMultiply(rgb1, rgb2);
    }

    /**
     * _rgb multiply.
     * 
     * @param rgb1 the rgb1
     * @param rgb2 the rgb2
     * @return the int
     */
    private final native int _rgbMultiply(int rgb1, int rgb2)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.rgbMultiply(rgb1, rgb2);
    }-*/;

}
