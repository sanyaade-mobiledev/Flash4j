/************************************************************************
  Texture.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.textures;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.Bitmap;
import com.emitrom.flash4j.core.client.display.BitmapData;
import com.emitrom.flash4j.core.client.display3D.textures.TextureBase;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.emitrom.flash4j.starling.client.core.factories.StarlingStaticBridge;
import com.emitrom.flash4j.starling.client.display.utils.VertextData;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A texture stores the information that represents an image. It cannot be added
 * to the display list directly; instead it has to be mapped onto a display
 * object. In Starling, that display object is the class "Image".
 * <p>
 * <b>Texture Formats</b>
 * <p>
 * Since textures can be created from a "BitmapData" object, Starling supports
 * any bitmap format that is supported by FlashDetect. And since you can render any
 * FlashDetect display object into a BitmapData object, you can use this to display
 * non-Starling content in Starling - e.g. Shape objects.
 * <p>
 * Starling also supports ATF textures (Adobe Texture Format), which is a
 * container for compressed texture formats that can be rendered very
 * efficiently by the GPU. Refer to the FlashDetect documentation for more information
 * about this format.
 * <p>
 * <b>Mip Mapping</b>
 * <p>
 * MipMaps are scaled down versions of a texture. When an image is displayed
 * smaller than its natural size, the GPU may display the mip maps instead of
 * the original texture. This reduces aliasing and accelerates rendering. It
 * does, however, also need additional memory; for that reason, you can choose
 * if you want to create them or not. *
 * <p>
 * <b>Texture Frame</b>
 * <p>
 * The frame property of a texture allows you let a texture appear inside the
 * bounds of an image, leaving a transparent space around the texture. The frame
 * rectangle is specified in the coordinate system of the texture (not the
 * image):<br/>
 * <code>Rectangle frame = new Rectangle(-10, -10, 30, 30);</code><br/>
 * <code>Texture texture  = Texture.fromTexture(anotherTexture, null, frame);</code>
 * <br/>
 * <code>Image image  = new Image(texture);</code>
 * <p>
 * This code would create an image with a size of 30x30, with the texture placed
 * at x=10, y=10 within that image (assuming that 'anotherTexture' has a width
 * and height of 10 pixels, it would appear in the middle of the image).
 * <p>
 * The texture atlas makes use of this feature, as it allows to crop transparent
 * edges of a texture and making up for the changed size by specifying the
 * original texture frame. Tools like TexturePacker use this to optimize the
 * atlas.
 * 
 * <p>
 * <b>Texture Frame</b>
 * <p>
 * If, on the other hand, you want to show only a part of the texture in an
 * image (i.e. to crop the the texture), you can either create a subtexture
 * (with the method 'Texture.fromTexture()' and specifying a rectangle for the
 * region), or you can manipulate the texture coordinates of the image object.
 * The method 'image.setTexCoords' allows you to do that.
 * 
 * 
 * @author Ekambi
 * 
 */
public class Texture extends ProxyObject {

    Texture() {

    }

    Texture(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The Stage3D texture object the texture is based on.
     * 
     * @return
     */
    public native TextureBase getBase()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbase();
		return @com.emitrom.flash4j.core.client.display3D.textures.TextureBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The texture frame (see class description).
     * 
     * @return
     */
    public native Rectangle getFrame()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getframe();
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The height of the texture in pixels.
     * 
     * @return
     */
    public native double getHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Indicates if the texture contains mip maps.
     * 
     * @return
     */
    public native boolean isMipMapping()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmipMapping();
    }-*/;

    /**
     * Indicates if the alpha values are premultiplied into the RGB values.
     * 
     * @return
     */
    public native boolean isPremultipliedAlpha()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpremultipliedAlpha();
    }-*/;

    /**
     * Indicates if the texture should repeat like a wallpaper or stretch the
     * outermost pixels.
     * 
     * @return
     */
    public native boolean isRepeat()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrepeat();
    }-*/;

    /**
     * Indicates if the texture should repeat like a wallpaper or stretch the
     * outermost pixels.
     * 
     * @return
     */
    public native void setRepeat(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrepeat(value);
    }-*/;

    /**
     * The width of the texture in pixels.
     * 
     * @return
     */
    public native double getWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Converts texture coordinates and vertex positions of raw vertex data into
     * the format required for rendering.
     * 
     * @param vertexData
     * @param vertexID
     * @param count
     */
    public native void adjustVertexData(VertextData vertexData, int vertexID, int count)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.adjustVertexData(
						vertexData.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						vertexID, count);
    }-*/;

    /**
     * Disposes the underlying texture data.
     */
    public native void dispose()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.dispose();
    }-*/;

    /**
     * The scale factor, which influences width and height properties.
     * 
     * @return
     */
    public native double getScale()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscale();
    }-*/;

    public static Texture empty() {
        return StarlingStaticBridge.INSTANCE.emptyTexture();
    }

    public static Texture empty(int width) {
        return StarlingStaticBridge.INSTANCE.emptyTexture(width);
    }

    public static Texture empty(int width, int height) {
        return StarlingStaticBridge.INSTANCE.emptyTexture(width, height);
    }

    public static Texture empty(int width, int height, int color) {
        return StarlingStaticBridge.INSTANCE.emptyTexture(width, height, color);
    }

    public static Texture empty(int width, int height, int color, boolean optomizeForRenderTexture) {
        return StarlingStaticBridge.INSTANCE.emptyTexture(width, height, color, optomizeForRenderTexture);
    }

    public static Texture fromAtfData(ByteArray data) {
        return StarlingStaticBridge.INSTANCE.textureFromAtfData(data);
    }

    public static Texture fromBitmap(Bitmap bitmap) {
        return StarlingStaticBridge.INSTANCE.textureFromBitmap(bitmap);
    }

    public static Texture fromBitmap(Bitmap bitmap, boolean generateMitmaps) {
        return StarlingStaticBridge.INSTANCE.textureFromBitmap(bitmap, generateMitmaps);
    }

    public static Texture fromBitmap(Bitmap bitmap, boolean generateMitmaps, boolean optimizeRenderTexture) {
        return StarlingStaticBridge.INSTANCE.textureFromBitmap(bitmap, generateMitmaps, optimizeRenderTexture);
    }

    public static Texture fromBitmapData(BitmapData bitmap) {
        return StarlingStaticBridge.INSTANCE.textureFromBitmapData(bitmap);
    }

    public static Texture fromBitmapData(BitmapData bitmap, boolean generateMitmaps) {
        return StarlingStaticBridge.INSTANCE.textureFromBitmapData(bitmap, generateMitmaps);
    }

    public static Texture fromBitmapData(BitmapData bitmap, boolean generateMitmaps, boolean optimizeRenderTexture) {
        return StarlingStaticBridge.INSTANCE.textureFromBitmapData(bitmap, generateMitmaps, optimizeRenderTexture);
    }

    public static Texture fromTexture(Texture texture) {
        return StarlingStaticBridge.INSTANCE.textureFromTexture(texture);
    }

    public static Texture fromTexture(Texture texture, Rectangle region) {
        return StarlingStaticBridge.INSTANCE.textureFromTexture(texture, region);
    }

    public static Texture fromTexture(Texture texture, Rectangle region, Rectangle frame) {
        return StarlingStaticBridge.INSTANCE.textureFromTexture(texture, region, frame);
    }

}
