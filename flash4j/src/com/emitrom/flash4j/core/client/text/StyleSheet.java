/************************************************************************
 * StyleSheet.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

package com.emitrom.flash4j.core.client.text;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class StyleSheet.
 */
public class StyleSheet extends EventDispatcher {

    StyleSheet(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the style sheet
     */
    public StyleSheet() {
        jsObj = Bridge.createObject("flash.text.StyleSheet");
    }

    /**
     * Clear.
     */
    public native void clear() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * Gets the style.
     * 
     * @param <T>
     *            the generic type
     * @return the style
     */
    public native <T> T getStyle() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.getStyle();
    }-*/;

    /**
     * Sets the style.
     * 
     * @param styleName
     *            the style name
     * @param styleObject
     *            the style object
     */
    public native void setStyle(String styleName, Object styleObject) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.getStyle(styleName, styleObject);
    }-*/;

    /**
     * Parce css.
     */
    public native void parceCSS() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.parseCSS();
    }-*/;

    /**
     * Transform.
     * 
     * @param formatObject
     *            the format object
     * @return the text format
     */
    public native TextFormat transform(Object formatObject) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.transform(formatObject);
		return @com.emitrom.flash4j.core.client.text.TextFormat::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
