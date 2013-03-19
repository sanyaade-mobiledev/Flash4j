/************************************************************************
  Label.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.text.StyleSheet;
import com.emitrom.flash4j.core.client.text.TextLineMetrics;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Label.
 */
public class Label extends UIComponent {

    /**
     * Instantiates a new label.
     */
    protected Label(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the label
     */
    public Label() {
        jsObj = Bridge.createObject("mx.controls.Label");
    }

    /**
     * New instance.
     * 
     * @param text the text
     * @return the label
     */
    public Label(String text) {
        this();
        setText(text);
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
     * Gets the html text.
     * 
     * @return the html text
     */
    public native String getHtmlText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethtmlText();
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
     * Sets the text.
     * 
     * @param value the new text
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
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
     * Truncate to fit.
     * 
     * @return true, if successful
     */
    public native boolean truncateToFit()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettruncateToFit();
    }-*/;

    /**
     * Sets the truncate to fit.
     * 
     * @param value the new truncate to fit
     */
    public native void setTruncateToFit(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settruncateToFit(value);
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

}
