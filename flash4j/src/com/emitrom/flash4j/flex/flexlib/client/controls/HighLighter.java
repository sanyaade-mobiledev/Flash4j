/************************************************************************
  HighLighter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.Bitmap;
import com.emitrom.flash4j.core.client.text.TextField;
import com.emitrom.flash4j.flex.flexlib.client.core.HighlighterFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class HighLighter.
 */
public class HighLighter extends ProxyObject {

    /**
     * Instantiates a new high lighter.
     */
    protected HighLighter(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param textField
     *            the text field
     * @return the high lighter
     */
    public HighLighter(TextField textField) {
        jsObj = HighlighterFactory.getInstance().createHighLighter(textField);
    }

    /**
     * New instance.
     * 
     * @param textField
     *            the text field
     * @param color
     *            the color
     * @return the high lighter
     */
    public HighLighter(TextField textField, int color) {
        jsObj = HighlighterFactory.getInstance().createHighLighter(textField, color);
    }

    /**
     * New instance.
     * 
     * @param textField
     *            the text field
     * @param color
     *            the color
     * @param xOffset
     *            the x offset
     * @return the high lighter
     */
    public HighLighter(TextField textField, int color, double xOffset) {
        jsObj = HighlighterFactory.getInstance().createHighLighter(textField, color, xOffset);
    }

    /**
     * New instance.
     * 
     * @param textField
     *            the text field
     * @param color
     *            the color
     * @param xOffset
     *            the x offset
     * @param yOffset
     *            the y offset
     * @return the high lighter
     */
    public HighLighter(TextField textField, int color, double xOffset, double yOffset) {
        jsObj = HighlighterFactory.getInstance().createHighLighter(textField, color, xOffset, yOffset);
    }

    /**
     * Highlight next.
     * 
     * @param word
     *            the word
     */
    public native void highlightNext(String word)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.highlightNext(word);
    }-*/;

    /**
     * Highlight next.
     * 
     * @param word
     *            the word
     * @param caseSensitive
     *            the case sensitive
     */
    public native void highlightNext(String word, boolean caseSensitive)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.highlightNext(word, caseSensitive);
    }-*/;

    /**
     * Highlight previous.
     * 
     * @param word
     *            the word
     */
    public native void highlightPrevious(String word)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.highlightPrevious(word);
    }-*/;

    /**
     * Highlight previous.
     * 
     * @param word
     *            the word
     * @param caseSensitive
     *            the case sensitive
     */
    public native void highlightPrevious(String word, boolean caseSensitive)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.highlightPrevious(word, caseSensitive);
    }-*/;

    /**
     * Highlight word instances.
     * 
     * @param word
     *            the word
     */
    public native void highlightWordInstances(String word)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.highlightWordInstances(word);
    }-*/;

    /**
     * Highlight word instances.
     * 
     * @param word
     *            the word
     * @param caseSensitive
     *            the case sensitive
     */
    public native void highlightWordInstances(String word, boolean caseSensitive)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.highlightWordInstances(word, caseSensitive);
    }-*/;

    /**
     * Reset.
     */
    public native void reset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.reset();
    }-*/;

    /**
     * Gets the bitmap.
     * 
     * @return the bitmap
     */
    public native Bitmap getBitmap()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbitmap();
		return @com.emitrom.flash4j.core.client.display.Bitmap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the bitmap.
     * 
     * @param value
     *            the new bitmap
     */
    public native void setBitmap(Bitmap value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbitmap(value);
    }-*/;

    /**
     * Gets the field.
     * 
     * @return the field
     */
    public native TextField getField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfield();
    }-*/;

    /**
     * Sets the field.
     * 
     * @param value
     *            the new field
     */
    public native void setField(TextField value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfield(value);
    }-*/;

    /**
     * Gets the highlight color.
     * 
     * @return the highlight color
     */
    public native int getHighlightColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethighlightColor();
    }-*/;

    /**
     * Sets the highlight color.
     * 
     * @param value
     *            the new highlight color
     */
    public native void setHighlightColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethighlightColor(value);
    }-*/;

    /**
     * Gets the x offset.
     * 
     * @return the x offset
     */
    public native double getXOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxOffset();
    }-*/;

    /**
     * Sets the x offset.
     * 
     * @param value
     *            the new x offset
     */
    public native void setXOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxOffset(value);
    }-*/;

    /**
     * Gets the y offset.
     * 
     * @return the y offset
     */
    public native double getYOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyOffset();
    }-*/;

    /**
     * Sets the y offset.
     * 
     * @param value
     *            the new y offset
     */
    public native void setYOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyOffset(value);
    }-*/;

}
