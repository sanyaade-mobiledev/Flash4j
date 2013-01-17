/************************************************************************
  Image.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.display;

import com.emitrom.flash4j.core.client.display.Bitmap;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.textures.Texture;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An Image is a quad with a texture mapped onto it. The Image class is the
 * Starling equivalent of FlashDetect's Bitmap class. Instead of BitmapData, Starling
 * uses textures to represent the pixels of an image. To display a texture, you
 * have to map it onto a quad - and that's what the Image class is for.
 * <p>
 * As "Image" inherits from "Quad", you can give it a color. For each pixel, the
 * resulting color will be the result of the multiplication of the color of the
 * texture with the color of the quad. That way, you can easily tint textures
 * with a certain color. Furthermore, images allow the manipulation of texture
 * coordinates. That way, you can move a texture inside an image without
 * changing any vertex coordinates of the quad. You can also use peer feature as
 * a very efficient way to create a rectangular mask.
 * 
 * 
 */
public class Image extends Quad {

    Image() {

    }

    public Image(Texture texture) {
        jsObj = StarlingObjectFactory.INSTANCE.createImage(texture);
    }

    Image(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static Image fromBitmap(Bitmap bitmap) {
        return new Image(StarlingObjectFactory.INSTANCE.createImageFromBitmap(bitmap));
    }

    /**
     * The smoothing filter that is used for the texture.
     * 
     * @param value
     */
    public native void setSmoothing(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsmoothing(value);
    }-*/;

    public native String getSmoothing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsmoothing();
    }-*/;

    /**
     * The texture that is displayed on the quad.
     * 
     * @param texture
     */
    public native void setTexture(Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settexture(texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native Texture getTexture()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettexture();
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the texture coordinates of a vertex.
     * 
     * @param vertexIndex
     * @return
     */
    public native Point getTexCoords(int vertexIndex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getTexCoords(vertexIndex);
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the texture coordinates of a vertex.
     * 
     * @param vertextIndex
     * @param coords
     */
    public native void setTexCoords(int vertextIndex, Point coords)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setTexCoords(
						vertextIndex,
						coords.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
