/************************************************************************
  ImageLoader.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.core.utils;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ImageLoader.
 */
public class ImageLoader extends ProxyObject {

    public static final ImageLoader INSTANCE = new ImageLoader(
                    (Bridge.createObject("com.ekambi.utils.ImageToClassUtil")));

    /**
     * Instantiates a new image loader.
     */
    ImageLoader(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the image loader
     */
    private static ImageLoader create() {
        return INSTANCE;
    }

    /**
     * Load icon.
     * 
     * @param <T> the generic type
     * @param imageUrl the image url
     * @return the t
     */
    public static <T extends JavaScriptObject> T loadIcon(String imageUrl) {
        return create()._loadIcon(imageUrl);
    }

    /**
     * Load icon.
     * 
     * @param <T> the generic type
     * @param imageUrl the image url
     * @param width the width
     * @param height the height
     * @return the t
     */
    public static <T extends JavaScriptObject> T loadIcon(String imageUrl, double width, double height) {
        return create()._loadIcon(imageUrl, width, height);
    }

    /**
     * Load icon2.
     * 
     * @param <T> the generic type
     * @param imageUrl the image url
     * @return the t
     */
    public static <T extends JavaScriptObject> T loadIcon2(String imageUrl) {
        return create()._loadIcon2(imageUrl);
    }

    /**
     * Load icon2.
     * 
     * @param <T> the generic type
     * @param imageUrl the image url
     * @param width the width
     * @param height the height
     * @return the t
     */
    public static <T extends JavaScriptObject> T loadIcon2(String imageUrl, double width, double height) {
        return create()._loadIcon2(imageUrl, width, height);
    }

    /**
     * _load icon.
     * 
     * @param <T> the generic type
     * @param imageUrl the image url
     * @return the t
     */
    private final native <T extends JavaScriptObject> T _loadIcon(String imageUrl)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.loadIcon(imageUrl);
    }-*/;

    /**
     * _load icon2.
     * 
     * @param <T> the generic type
     * @param imageUrl the image url
     * @return the t
     */
    private final native <T extends JavaScriptObject> T _loadIcon2(String imageUrl)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.loadIcon2(imageUrl);
    }-*/;

    /**
     * _load icon.
     * 
     * @param <T> the generic type
     * @param imageUrl the image url
     * @param width the width
     * @param height the height
     * @return the t
     */
    private final native <T> T _loadIcon(String imageUrl, double width, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.loadIcon(imageUrl, width, height);
    }-*/;

    /**
     * _load icon2.
     * 
     * @param <T> the generic type
     * @param imageUrl the image url
     * @param width the width
     * @param height the height
     * @return the t
     */
    private final native <T> T _loadIcon2(String imageUrl, double width, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.loadIcon2(imageUrl, width, height);
    }-*/;
}
