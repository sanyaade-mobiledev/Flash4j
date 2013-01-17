/************************************************************************
  TextArea.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.text.StyleSheet;
import com.emitrom.flash4j.core.client.text.TextLineMetrics;
import com.emitrom.flash4j.flex.client.mx.controls.listClasses.BaseListData;
import com.emitrom.flash4j.flex.client.mx.core.ScrollControlBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TextArea.
 */
public class TextArea extends ScrollControlBase {

    /**
     * Instantiates a new text area.
     */
    protected TextArea(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the text area
     */
    public TextArea() {
        jsObj = Bridge.createObject("mx.controls.TextArea");
    }

    /**
     * Condense white.
     * 
     * @return true, if successful
     */
    public native boolean condenseWhite()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcondenseWhite();
    }-*/;

    /**
     * Sets the condense white.
     * 
     * @param value the new condense white
     */
    public native void setCondenseWhite(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcondenseWhite(value);
    }-*/;

    /**
     * Gets the data.
     * 
     * @param <T> the generic type
     * @return the data
     */
    public native <T> T getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value the new data
     */
    public native void setData(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    /**
     * Checks if is editable.
     * 
     * @return true, if is editable
     */
    public native boolean isEditable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditable();
    }-*/;

    /**
     * Sets the editable.
     * 
     * @param value the new editable
     */
    public native void setEditable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditable(value);
    }-*/;

    /**
     * Enable ime.
     * 
     * @return true, if successful
     */
    public native boolean enableIME()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getenableIME();
    }-*/;

    /**
     * Gets the html text.
     * 
     * @return the html text
     */
    public native String getHtmlText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getHtmlText();
    }-*/;

    /**
     * Sets the html text.
     * 
     * @param value the new html text
     */
    public native void setHtmlText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethtmlText(value);
    }-*/;

    /**
     * Gets the ime mode.
     * 
     * @return the ime mode
     */
    public native String getImeMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getimeMode();
    }-*/;

    /**
     * Sets the ime mode.
     * 
     * @param value the new ime mode
     */
    public native void setImeMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setimeMode(value);
    }-*/;

    /**
     * Gets the length.
     * 
     * @return the length
     */
    public native int getLength()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * Gets the list data.
     * 
     * @return the list data
     */
    public native BaseListData getListData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getlistData();
		return @com.emitrom.flash4j.flex.client.mx.controls.listClasses.BaseListData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);

    }-*/;

    /**
     * Sets the list data.
     * 
     * @param value the new list data
     */
    public native void setListData(BaseListData value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setlistData(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the max chars.
     * 
     * @return the max chars
     */
    public native int getMaxChars()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxChars();
    }-*/;

    /**
     * Sets the max chars.
     * 
     * @param value the new max chars
     */
    public native void setMaxChars(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxChars(value);
    }-*/;

    /**
     * Gets the restrict.
     * 
     * @return the restrict
     */
    public native String getRestrict()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrestrict();
    }-*/;

    /**
     * Sets the restrict.
     * 
     * @param value the new restrict
     */
    public native void setRestrict(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrestrict(value);
    }-*/;

    /**
     * Checks if is selectable.
     * 
     * @return true, if is selectable
     */
    public native boolean isSelectable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectable();
    }-*/;

    /**
     * Sets the selectable.
     * 
     * @param value the new selectable
     */
    public native void setSelectable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectable(value);
    }-*/;

    /**
     * Gets the selection begin index.
     * 
     * @return the selection begin index
     */
    public native int getSelectionBeginIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectionBeginIndex();
    }-*/;

    /**
     * Sets the selection begin index.
     * 
     * @param value the new selection begin index
     */
    public native void setSelectionBeginIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectionBeginIndex(value);
    }-*/;

    /**
     * Gets the selection end index.
     * 
     * @return the selection end index
     */
    public native int getSelectionEndIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectionEndIndex();
    }-*/;

    /**
     * Sets the selection end index.
     * 
     * @param value the new selection end index
     */
    public native void setSelectionEndIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectionEndIndex(value);
    }-*/;

    /**
     * Gets the style sheet.
     * 
     * @return the style sheet
     */
    public native StyleSheet getStyleSheet()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getstyleSheet();
		return @com.emitrom.flash4j.core.client.text.StyleSheet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the style sheet.
     * 
     * @param value the new style sheet
     */
    public native void setStyleSheet(StyleSheet value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setstyleSheet(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
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

    /**
     * Gets the text height.
     * 
     * @return the text height
     */
    public native double getTextHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettextHeight();
    }-*/;

    /**
     * Gets the text width.
     * 
     * @return the text width
     */
    public native double getTextWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettextWidth();
    }-*/;

    /**
     * Word wrap.
     * 
     * @return true, if successful
     */
    public native boolean wordWrap()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwordWrap();
    }-*/;

    /**
     * Sets the word wrap.
     * 
     * @param value the new word wrap
     */
    public native void setWordWrap(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwordWrap(value);
    }-*/;

    /**
     * Gets the line metrics.
     * 
     * @param lineIndex the line index
     * @return the line metrics
     */
    public native TextLineMetrics getLineMetrics(int lineIndex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getLineMetrics(lineIndex);
		return @com.emitrom.flash4j.core.client.text.TextLineMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the selection.
     * 
     * @param beginEndex the begin endex
     * @param endIndex the end index
     */
    public native void setSelection(int beginEndex, int endIndex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setSelection(beginEndex, endIndex);
    }-*/;

    /**
     * Load.
     */
    public native void load()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.load();
    }-*/;

    /**
     * Load.
     * 
     * @param url the url
     */
    public native void load(Object url)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.load(url);
    }-*/;

}
