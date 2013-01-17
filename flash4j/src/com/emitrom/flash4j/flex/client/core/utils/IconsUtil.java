/************************************************************************
  IconsUtil.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class IconsUtil.
 */
public class IconsUtil extends ProxyObject {

    public static final IconsUtil INSTANCE = new IconsUtil(Bridge.createObject("com.benstucki.utilities.IconUtility"));

    /**
     * Instantiates a new icons util.
     */
    IconsUtil(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the icons util
     */
    private static IconsUtil create() {
        return INSTANCE;
    }

    /**
     * Gets the class.
     * 
     * @param <T> the generic type
     * @param comp the comp
     * @param src the src
     * @return the class
     */
    public static <T> T getClass(UIComponent comp, String src) {
        return IconsUtil.create()._getClass(comp, src);
    }

    /**
     * _get class.
     * 
     * @param <T> the generic type
     * @param comp the comp
     * @param src the src
     * @return the t
     */
    private final native <T> T _getClass(UIComponent comp, String src) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getClass(
						comp.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						src);
    }-*/;

    /**
     * Gets the class.
     * 
     * @param <T> the generic type
     * @param comp the comp
     * @param src the src
     * @param width the width
     * @param height the height
     * @return the class
     */
    public static <T> T getClass(UIComponent comp, String src, double width, double height) {
        return IconsUtil.create()._getClass(comp, src, width, height);
    }

    /**
     * _get class.
     * 
     * @param <T> the generic type
     * @param comp the comp
     * @param src the src
     * @param width the width
     * @param height the height
     * @return the t
     */
    private final native <T> T _getClass(UIComponent comp, String src, double width, double height) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getClass(
						comp.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						src, width, height);
    }-*/;
}
