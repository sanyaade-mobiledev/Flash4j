/************************************************************************
 * RichTextEditor.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class RichTextEditor.
 */
public class RichTextEditor extends Panel {

    /**
     * Instantiates a new rich text editor.
     */
    protected RichTextEditor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the rich text editor
     */
    public RichTextEditor() {
        jsObj = Bridge.createObject("mx.controls.RichTextEditor");
    }

    /**
     * New instance.
     * 
     * @param title
     *            the title
     * @return the rich text editor
     */
    public RichTextEditor(String title) {
        setTitle(title);
    }

    /**
     * Gets the align tool tip.
     * 
     * @return the align tool tip
     */
    public native String getAlignToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalignToolTip();
    }-*/;

    /**
     * Sets the align tool tip.
     * 
     * @param value
     *            the new align tool tip
     */
    public native void setAlignToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalignToolTip(value);
    }-*/;

    /**
     * Gets the bold tooltip.
     * 
     * @return the bold tooltip
     */
    public native String getBoldTooltip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getboldTooltip();
    }-*/;

    /**
     * Sets the bold tool tip.
     * 
     * @param value
     *            the new bold tool tip
     */
    public native void setBoldToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setboldToolTip(value);
    }-*/;

    /**
     * Gets the bullet tool tip.
     * 
     * @return the bullet tool tip
     */
    public native String getBulletToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbulletToolTip();
    }-*/;

    /**
     * Sets the bullet tool tip.
     * 
     * @param value
     *            the new bullet tool tip
     */
    public native void setBulletToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbulletToolTip(value);
    }-*/;

    /**
     * Gets the color picker tool tip.
     * 
     * @return the color picker tool tip
     */
    public native String getColorPickerToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolorPickerToolTip();
    }-*/;

    /**
     * Sets the color tool tip.
     * 
     * @param value
     *            the new color tool tip
     */
    public native void setColorToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolorToolTip(value);
    }-*/;

    /**
     * Gets the default link protocol.
     * 
     * @return the default link protocol
     */
    public native String getDefaultLinkProtocol()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdefaultLinkProtocol();
    }-*/;

    /**
     * Sets the default link protocol.
     * 
     * @param value
     *            the new default link protocol
     */
    public native void setDefaultLinkProtocol(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdefaultLinkProtocol(value);
    }-*/;

    /**
     * Gets the font family tool tip.
     * 
     * @return the font family tool tip
     */
    public native String getFontFamilyToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontFamilyToolTip();
    }-*/;

    /**
     * Sets the font family tool tip.
     * 
     * @param value
     *            the new font family tool tip
     */
    public native void setFontFamilyToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontFamilyToolTip(value);
    }-*/;

    /**
     * Gets the font size tool tip.
     * 
     * @return the font size tool tip
     */
    public native String getFontSizeToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontSizeToolTip();
    }-*/;

    /**
     * Sets the font size tool tip.
     * 
     * @param value
     *            the new font size tool tip
     */
    public native void setFontSizeToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontSizeToolTip(value);
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
     * @param value
     *            the new html text
     */
    public native void setHtmlText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethtmlText(value);
    }-*/;

    /**
     * Gets the italic tool tip.
     * 
     * @return the italic tool tip
     */
    public native String getItalicToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getitalicToolTip();
    }-*/;

    /**
     * Sets the italic tool tip.
     * 
     * @param value
     *            the new italic tool tip
     */
    public native void setItalicToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setitalicToolTip(value);
    }-*/;

    /**
     * Gets the link tool tip.
     * 
     * @return the link tool tip
     */
    public native String getLinkToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlinkToolTip();
    }-*/;

    /**
     * Sets the link tool tip.
     * 
     * @param value
     *            the new link tool tip
     */
    public native void setLinkToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlinkToolTip(value);
    }-*/;

    /**
     * Gets the selection.
     * 
     * @return the selection
     */
    public native TextRange getSelection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselection();
		return @com.emitrom.flash4j.flex.client.ui.mx.TextRange::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Show control bar.
     * 
     * @return true, if successful
     */
    public native boolean showControlBar()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowControlBar();
    }-*/;

    /**
     * Sets the show control bar.
     * 
     * @param value
     *            the new show control bar
     */
    public native void setShowControlBar(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowControlBar(value);
    }-*/;

    /**
     * Show tool tips.
     * 
     * @return true, if successful
     */
    public native boolean showToolTips()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.showToolTips();
    }-*/;

    /**
     * Sets the show tool tips.
     * 
     * @param value
     *            the new show tool tips
     */
    public native void setShowToolTips(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowToolTips(value);
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
     * @param value
     *            the new text
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

    /**
     * Gets the under line tool tip.
     * 
     * @return the under line tool tip
     */
    public native String getUnderLineToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getunderLineToolTip();
    }-*/;

    /**
     * Sets the under line tool tip.
     * 
     * @param value
     *            the new under line tool tip
     */
    public native void setunderLineToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setUnderLineToolTip(value);
    }-*/;

}
