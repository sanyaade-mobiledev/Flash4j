/************************************************************************
  TextRange.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TextRange.
 */
public class TextRange extends ProxyObject {

    /**
     * Instantiates a new text range.
     */
    protected TextRange(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the begin index.
     * 
     * @return the begin index
     */
    public final native int getBeginIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbeginIndex();
    }-*/;

    /**
     * Sets the begind index.
     * 
     * @param value the new begind index
     */
    public final native void setBegindIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbegindIndex(value);
    }-*/;

    /**
     * Checks if is bullet.
     * 
     * @return true, if is bullet
     */
    public final native boolean isBullet()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbullet();
    }-*/;

    /**
     * Sets the bullet.
     * 
     * @param value the new bullet
     */
    public final native void setBullet(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbullet(value);
    }-*/;

    /**
     * Gets the end index.
     * 
     * @return the end index
     */
    public final native int getEndIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getendIndex();
    }-*/;

    /**
     * Sets the end index.
     * 
     * @param value the new end index
     */
    public final native void setEndIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setendIndex(value);
    }-*/;

    /**
     * Gets the font family.
     * 
     * @return the font family
     */
    public final native String getFontFamily()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontFamily();
    }-*/;

    /**
     * Sets the font family.
     * 
     * @param value the new font family
     */
    public final native void setFontFamily(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontFamily(value);
    }-*/;

    /**
     * Gets the font size.
     * 
     * @return the font size
     */
    public final native int getFontSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontSize();
    }-*/;

    /**
     * Sets the font size.
     * 
     * @param value the new font size
     */
    public final native void setFontSize(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontSize(value);
    }-*/;

    /**
     * Gets the font weight.
     * 
     * @return the font weight
     */
    public final native String getFontWeight()/*-{
		return peer.getfontWeight();
    }-*/;

    /**
     * Sets the font weight.
     * 
     * @param value the new font weight
     */
    public final native void setFontWeight(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontWeight(value);
    }-*/;

    /**
     * Gets the html text.
     * 
     * @return the html text
     */
    public final native String getHtmlText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethtmlText();
    }-*/;

    /**
     * Sets the html text.
     * 
     * @param value the new html text
     */
    public final native void setHtmlText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethtmlText(value);
    }-*/;

    /**
     * Checks if is kerning.
     * 
     * @return true, if is kerning
     */
    public final native boolean isKerning()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getkerning();
    }-*/;

    /**
     * Sets the kerning.
     * 
     * @param value the new kerning
     */
    public final native void setKerning(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setkerning(value);
    }-*/;

    /**
     * Gets the letter spacing.
     * 
     * @return the letter spacing
     */
    public final native double getLetterSpacing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getletterSpacing();
    }-*/;

    /**
     * Sets the letter spacing.
     * 
     * @param value the new letter spacing
     */
    public final native void setLetterSpacing(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setletterSpacing(value);
    }-*/;

    /**
     * Modifies selection.
     * 
     * @return true, if successful
     */
    public final native boolean modifiesSelection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodifiesSelection();
    }-*/;

    /**
     * Gets the owner.
     * 
     * @return the owner
     */
    public final native UIComponent getOwner()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getowner();
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the owner.
     * 
     * @param value the new owner
     */
    public final native void setOwner(UIComponent value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setowner(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public final native String getText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettext();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param value the new text
     */
    public final native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

    /**
     * Gets the text align.
     * 
     * @return the text align
     */
    public final native String getTextAlign()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettextAlign();
    }-*/;

    /**
     * Sets the text align.
     * 
     * @param value the new text align
     */
    public final native void setTextAlign(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settextAlign(value);
    }-*/;

    /**
     * Gets the text decoration.
     * 
     * @return the text decoration
     */
    public final native String getTextDecoration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettextDecoration();
    }-*/;

    /**
     * Sets the text decoration.
     * 
     * @param value the new text decoration
     */
    public final native void setTextDecoration(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settextDecoration(value);
    }-*/;

    /**
     * Gets the url.
     * 
     * @return the url
     */
    public final native String getUrl()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geturl();
    }-*/;

    /**
     * Sets the url.
     * 
     * @param value the new url
     */
    public final native void setUrl(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seturl(value);
    }-*/;

}
