/************************************************************************
  TextField.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.text;

import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.core.factories.StarlingStaticBridge;
import com.emitrom.flash4j.starling.client.display.DisplayObjectContainer;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A TextField displays text, either using standard true type fonts or custom
 * bitmap fonts. You can set all properties you are used to, like the font name
 * and size, a color, the horizontal and vertical alignment, etc. The border
 * property is helpful during development, because it lets you see the bounds of
 * the textfield.
 * <p>
 * There are two types of fonts that can be displayed:
 * <p>
 * <ul>
 * <li>
 * Standard true type fonts. This renders the text just like a conventional
 * FlashDetect TextField. It is recommended to embed the font, since you cannot be
 * sure which fonts are available on the client system, and since this enhances
 * rendering quality. Simply pass the font name to the corresponding property.</li>
 * <li>
 * Bitmap fonts. If you need speed or fancy font effects, use a bitmap font
 * instead. That is a font that has its glyphs rendered to a texture atlas. To
 * use it, first register the font with the method registerBitmapFont, and then
 * pass the font name to the corresponding property of the text field.</li>
 * </ul>
 * <p>
 * For bitmap fonts, we recommend one of the following tools:
 * <p>
 * <ul>
 * <li>
 * Windows: Bitmap Font Generator from Angel Code (free). Export the font data
 * as an XML file and the texture as a png with white characters on a
 * transparent background (32 bit).</li>
 * <li>
 * Mac OS: Glyph Designer from 71squared or bmGlyph (both commercial). They
 * support Starling natively.</li>
 * </ul>
 */
public class TextField extends DisplayObjectContainer {

    public TextField(int width, int height, String text) {
        jsObj = StarlingObjectFactory.INSTANCE.createTextField(width, height, text);
    }

    public TextField(int width, int height, String text, String fontName) {
        jsObj = StarlingObjectFactory.INSTANCE.createTextField(width, height, text, fontName);
    }

    public TextField(int width, int height, String text, String fontName, double fontSize) {
        jsObj = StarlingObjectFactory.INSTANCE.createTextField(width, height, text, fontName, fontSize);
    }

    public TextField(int width, int height, String text, String fontName, double fontSize, int color) {
        jsObj = StarlingObjectFactory.INSTANCE.createTextField(width, height, text, fontName, fontSize, color);
    }

    public TextField(int width, int height, String text, String fontName, double fontSize, int color, boolean bold) {
        jsObj = StarlingObjectFactory.INSTANCE.createTextField(width, height, text, fontName, fontSize, color, bold);
    }

    TextField(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Indicates whether the font size is scaled down so that the complete text
     * fits into the text field.
     * 
     * @return
     */
    public native boolean autoScale()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoScale();
    }-*/;

    /**
     * Indicates whether the font size is scaled down so that the complete text
     * fits into the text field.
     */
    public native void setAutoScale(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoScale(value);
    }-*/;

    /**
     * Indicates whether the text is bold.
     * 
     * @return
     */
    public native boolean isBold()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbold();
    }-*/;

    /**
     * Indicates whether the text is bold.
     */
    public native void setBold(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbold(value);
    }-*/;

    /**
     * Draws a border around the edges of the text field.
     * 
     * @return
     */
    public native boolean hasBorder()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getborder();
    }-*/;

    /**
     * Draws a border around the edges of the text field.
     */
    public native void setBorder(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setborder(value);
    }-*/;

    /**
     * The color of the text.
     * 
     * @return
     */
    public native int getColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    /**
     * The color of the text.
     */
    public native void setColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolor(value);
    }-*/;

    /**
     * The name of the font (true type or bitmap font).
     * 
     * @return
     */
    public native String getFontName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontName();
    }-*/;

    /**
     * The name of the font (true type or bitmap font).
     */
    public native void setFontName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontName(value);
    }-*/;

    /**
     * The size of the font.
     * 
     * @return
     */
    public native double getFontSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontSize();
    }-*/;

    /**
     * The size of the font.
     */
    public native void setFonSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontSize(value);
    }-*/;

    /**
     * The horizontal alignment of the text.
     * 
     * @return
     */
    public native String getHAlign()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethAlign();
    }-*/;

    /**
     * The horizontal alignment of the text.
     */
    public native void setHAlign(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethAlign(value);
    }-*/;

    /**
     * Indicates whether the text is italicized.
     * 
     * @return
     */
    public native boolean isItalic()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getitalic();
    }-*/;

    /**
     * Indicates whether the text is italicized.
     */
    public native void setItalic(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setitalic(value);
    }-*/;

    /**
     * Indicates whether kerning is enabled.
     * 
     * @return
     */
    public native boolean isKerning()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getkerning();
    }-*/;

    /**
     * Indicates whether kerning is enabled.
     */
    public native void setKerning(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setkerning(value);
    }-*/;

    /**
     * The displayed text.
     * 
     * @return
     */
    public native String getText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettext();
    }-*/;

    /**
     * The displayed text.
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

    /**
     * Returns the bounds of the text within the text field.
     * 
     * @return
     */
    public native Rectangle getTextBounds()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettextBounds();
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Indicates whether the text is underlined.
     * 
     * @return
     */
    public native boolean isUnderline()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getunderline();
    }-*/;

    /**
     * Indicates whether the text is underlined.
     */
    public native void setUnderline(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setunderline(value);
    }-*/;

    /**
     * The vertical alignment of the text.
     * 
     * @return
     */
    public native String getVAlign()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvAlign();
    }-*/;

    /**
     * The vertical alignment of the text.
     */
    public native void setVAlign(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvAlign(value);
    }-*/;

    /**
     * Makes a bitmap font available at any text field.
     * 
     * @param bitmapFont
     */
    public static void registerBitmapFont(BitmapFont bitmapFont) {
        StarlingStaticBridge.INSTANCE.doTextFieldRegisterFont(bitmapFont);
    }

    /**
     * Unregisters the bitmap font and, optionally, disposes it.
     * 
     * @param fontName
     */
    public static void unregisterBitmapFont(String fontName) {
        StarlingStaticBridge.INSTANCE.doTextFieldUnRegisterFont(fontName);
    }

    /**
     * Unregisters the bitmap font and, optionally, disposes it.
     * 
     * @param fontName
     * @param dispose
     */
    public static void unregisterBitmapFont(String fontName, boolean dispose) {
        StarlingStaticBridge.INSTANCE.doTextFieldUnRegisterFont(fontName, dispose);
    }

}
