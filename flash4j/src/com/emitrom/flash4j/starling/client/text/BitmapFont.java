/************************************************************************
  BitmapFont.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.toplevel.XML;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.display.QuadBatch;
import com.emitrom.flash4j.starling.client.textures.Texture;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The BitmapFont class parses bitmap font files and arranges the glyphs in the
 * form of a text. The class parses the XML format as it is used in the
 * AngelCode Bitmap Font Generator or the Glyph Designer.This is what the file
 * format looks like {@code
 * <font>
        <info face="BranchingMouse" size="40" />
        <common lineHeight="40" />
        <pages>  <!-- currently, only one page is supported -->
          <page id="0" file="texture.png" />
        </pages>
        <chars>
          <char id="32" x="60" y="29" width="1" height="1" xoffset="0" yoffset="27" xadvance="8" />
          <char id="33" x="155" y="144" width="9" height="21" xoffset="0" yoffset="6" xadvance="9" />
        </chars>
        <kernings> <!-- Kerning is optional -->
          <kerning first="83" second="83" amount="-4"/>
        </kernings>
      </font>
 * }
 * <p>
 * Pass an instance of this class to the method registerBitmapFont of the
 * TextField class. Then, set the fontName property of the text field to the
 * name value of the bitmap font. This will make the text field use the bitmap
 * font.
 */
public class BitmapFont extends ProxyObject {

    /**
     * The font name of the embedded minimal bitmap font.
     */
    public static final String MINI = "mini";

    /**
     * Use this constant for the fontSize property of the TextField class to
     * render the bitmap font in exactly the size it was created.
     */
    public static final int NATIVE_SIZE = -1;

    public BitmapFont() {
        jsObj = StarlingObjectFactory.INSTANCE.createBitmapFont();
    }

    public BitmapFont(Texture texture) {
        jsObj = StarlingObjectFactory.INSTANCE.createBitmapFont(texture);
    }

    public BitmapFont(Texture texture, XML fontXML) {
        jsObj = StarlingObjectFactory.INSTANCE.createBitmapFont(texture, fontXML);
    }

    BitmapFont(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The height of one line in pixels.
     * 
     * @return
     */
    public native double getLineHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlineHeight();
    }-*/;

    /**
     * The height of one line in pixels.
     * 
     * @return
     */
    public native void setLineHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlineHeight(value);
    }-*/;

    /**
     * The baseline of the font.
     * 
     * @return
     */
    public native double getBaseLine()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbaseLine()
    }-*/;

    /**
     * The name of the font as it was parsed from the font file.
     * 
     * @return
     */
    public native String getName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getname()
    }-*/;

    /**
     * The native size of the font.
     * 
     * @return
     */
    public native double getSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidth()
    }-*/;

    /**
     * The smoothing filter that is used for the texture.
     * 
     * @return
     */
    public native String getSmoothing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsmoothing()
    }-*/;

    /**
     * The smoothing filter that is used for the texture.
     * 
     * @return
     */
    public native void setSmoothing(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsmoothing(value)
    }-*/;

    /**
     * Adds a bitmap char with a certain character ID.
     * 
     * @return
     */
    public native void addChar(int charID, BitmapChar bitmapChar)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addChar(
						charID,
						bitmapChar.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Disposes the texture of the bitmap font!
     * 
     * @return
     */
    public native void dispose()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.dispose()
    }-*/;

    /**
     * 
     Adds kerning information relative to a specific other character ID.
     * 
     * @return
     */
    public native BitmapChar getChar(int charID)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChar(charID)
		return @com.emitrom.flash4j.starling.client.text.BitmapChar::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Draws text into a QuadBatch.
     * 
     * @return
     */
    public native void fillQuadBatch(QuadBatch quadBatch, double width, double height, String text)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.fillQuadBatch(
						quadBatch.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, text);
    }-*/;

    /**
     * Draws text into a QuadBatch.
     * 
     * @return
     */
    public native void fillQuadBatch(QuadBatch quadBatch, double width, double height, String text, double fontSize)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.fillQuadBatch(
						quadBatch.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, text, fontSize);
    }-*/;

    /**
     * Draws text into a QuadBatch.
     * 
     * @return
     */
    public native void fillQuadBatch(QuadBatch quadBatch, double width, double height, String text, double fontSize,
                    int color)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.fillQuadBatch(
						quadBatch.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, text, fontSize, color);
    }-*/;

    /**
     * Draws text into a QuadBatch.
     * 
     * @return
     */
    public native void fillQuadBatch(QuadBatch quadBatch, double width, double height, String text, double fontSize,
                    int color, String hAlign)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.fillQuadBatch(
						quadBatch.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, text, fontSize, color, hAlign);
    }-*/;

    /**
     * Draws text into a QuadBatch.
     * 
     * @return
     */
    public native void fillQuadBatch(QuadBatch quadBatch, double width, double height, String text, double fontSize,
                    int color, String hAlign, String vAlign)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.fillQuadBatch(
						quadBatch.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, text, fontSize, color, hAlign, vAlign);
    }-*/;

    /**
     * Draws text into a QuadBatch.
     * 
     * @return
     */
    public native void fillQuadBatch(QuadBatch quadBatch, double width, double height, String text, double fontSize,
                    int color, String hAlign, String vAlign, boolean autoScale)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.fillQuadBatch(
						quadBatch.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, text, fontSize, color, hAlign, vAlign,
						autoScale);
    }-*/;

    /**
     * Draws text into a QuadBatch.
     * 
     * @return
     */
    public native void fillQuadBatch(QuadBatch quadBatch, double width, double height, String text, double fontSize,
                    int color, String hAlign, String vAlign, boolean autoScale, boolean kerning)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.fillQuadBatch(
						quadBatch.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, text, fontSize, color, hAlign, vAlign,
						autoScale, kerning);
    }-*/;

}
