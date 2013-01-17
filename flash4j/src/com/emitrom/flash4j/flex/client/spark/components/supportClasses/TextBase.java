/************************************************************************
  TextBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.components.supportClasses;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TextBase.
 */
public class TextBase extends UIComponent {

    /**
     * Instantiates a new text base.
     */
    TextBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the text base
     */
    public TextBase() {
        jsObj = Bridge.createObject("spark.components.supportClasses.TextBase");
    }

    /**
     * Checks if is truncated.
     * 
     * @return true, if is truncated
     */
    public native boolean isTruncated()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisTruncated();
    }-*/;

    /**
     * Gets the max displayed lines.
     * 
     * @return the max displayed lines
     */
    public native int getMaxDisplayedLines()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxDisplayedLines();
    }-*/;

    /**
     * Sets the max displayed lines.
     * 
     * @param value the new max displayed lines
     */
    public native void setMaxDisplayedLines(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxDisplayedLines(value);
    }-*/;

    /**
     * Show truncation tip.
     * 
     * @return true, if successful
     */
    public native boolean showTruncationTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowTruncationTip();
    }-*/;

    /**
     * Sets the show truncation tip.
     * 
     * @param value the new show truncation tip
     */
    public native void setShowTruncationTip(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowTruncationTip(value);
    }-*/;

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public native String getText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettext();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param value the new text
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

}
