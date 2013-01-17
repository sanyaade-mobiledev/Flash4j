/************************************************************************
  BitmapChar.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.display.Image;
import com.emitrom.flash4j.starling.client.textures.Texture;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A BitmapChar contains the information about one char of a bitmap font. You
 * don't have to use this class directly in most cases. The TextField class
 * contains methods that handle bitmap fonts for you.
 */
public class BitmapChar extends ProxyObject {

    public BitmapChar(int id, Texture texture, double xOffset, double yOffset, double xAdvance) {
        jsObj = StarlingObjectFactory.INSTANCE.createBitmapChar(id, texture, xOffset, yOffset, xAdvance);
    }

    BitmapChar(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The unicode ID of the char.
     * 
     * @return
     */
    public native int getCharID()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcharID();
    }-*/;

    /**
     * The height of the character in points.
     * 
     * @return
     */
    public native double getHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheight()
    }-*/;

    /**
     * The texture of the character.
     * 
     * @return
     */
    public native Texture getTexture()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettexture()
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The width of the character in points.
     * 
     * @return
     */
    public native double getWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidth()
    }-*/;

    /**
     * The number of points the cursor has to be moved to the right for the next
     * char.
     * 
     * @return
     */
    public native double getXAdvance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxAdvance()
    }-*/;

    /**
     * The number of points to move the char in x direction on character
     * arrangement.
     * 
     * @return
     */
    public native double getXOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxOffset()
    }-*/;

    /**
     * The number of points to move the char in y direction on character
     * arrangement.
     * 
     * @return
     */
    public native double getYOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyOffset()
    }-*/;

    /**
     * 
     Adds kerning information relative to a specific other character ID.
     * 
     * @return
     */
    public native void addKerning(int charID, double amount)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.addKerning(charID, amount)
    }-*/;

    /**
     * Creates an image of the char.
     * 
     * @return
     */
    public native Image createImage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.createImage()
		return @com.emitrom.flash4j.starling.client.display.Image::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Retrieve kerning information relative to the given character ID.
     * 
     * @return
     */
    public native double getKerning()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getKerning()
    }-*/;
}
