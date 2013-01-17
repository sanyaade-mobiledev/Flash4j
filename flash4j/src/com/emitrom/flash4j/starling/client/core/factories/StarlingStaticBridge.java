/************************************************************************
  StarlingStaticBridge.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.core.factories;

import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.Bitmap;
import com.emitrom.flash4j.core.client.display.BitmapData;
import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Matrix;
import com.emitrom.flash4j.core.client.geom.Matrix3D;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.emitrom.flash4j.starling.client.display.DisplayObjectContainer;
import com.emitrom.flash4j.starling.client.display.QuadBatch;
import com.emitrom.flash4j.starling.client.text.BitmapFont;
import com.emitrom.flash4j.starling.client.textures.Texture;
import com.emitrom.flash4j.starling.client.textures.TextureAtlas;
import com.google.gwt.core.client.JavaScriptObject;

public class StarlingStaticBridge extends ProxyObject {

    public static final StarlingStaticBridge INSTANCE = new StarlingStaticBridge();

    private StarlingStaticBridge() {
        jsObj = Bridge.createObject("com.emitrom.gwt4.flash.factories.StaticBridge");
    }

    public final native void transformMatrixForObject(Matrix3D matrix, DisplayObject object)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.transformMatrixForObject(
						matrix.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						object.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject fromVectorOfTouches(JavaScriptObject touches)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.fromVectorOfTouches(touches);
		return obj;
    }-*/;

    public final native Texture emptyTexture()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.emptyTexture();
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture emptyTexture(int width)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.emptyTexture(width);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture emptyTexture(int width, int height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.emptyTexture(width, height);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture emptyTexture(int width, int height, int color)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.emptyTexture(width, height, color);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture emptyTexture(int width, int height, int color, boolean optimizeForRenderer)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.emptyTexture(width, height, color, optimizeForRenderer);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture textureFromAtfData(ByteArray data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromAtfData(data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);

    }-*/;

    public final native Texture textureFromBitmap(Bitmap data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromBitmap(data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture textureFromBitmap(Bitmap data, boolean generateMitmaps)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromBitmap(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						generateMitmaps);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture textureFromBitmap(Bitmap data, boolean generateMitmaps, boolean optimizeForRenderer)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromBitmap(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						generateMitmaps, optimizeRenderer);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture textureFromBitmapData(BitmapData data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromBitmapData(data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture textureFromBitmapData(BitmapData data, boolean generateMitmaps)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromBitmapData(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						generateMitmaps);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture textureFromBitmapData(BitmapData data, boolean generateMitmaps,
                    boolean optimizeForRenderer)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromBitmapData(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						generateMitmaps, optimizeRenderer);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture textureFromTexture(Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromTexture(texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture textureFromTexture(Texture texture, Rectangle region)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromTexture(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						region.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Texture textureFromTexture(Texture texture, Rectangle region, Rectangle frame)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.textureFromTexture(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						region.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						frame.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native boolean isTextureValid(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isTextureValid(name);
    }-*/;

    public final native JavaScriptObject getTexturesFrom(TextureAtlas atlas, String prefix)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getTexturesFrom(
						atlas.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						prefix);
    }-*/;

    public final void doQuaBatchCompile(DisplayObjectContainer container, List<QuadBatch> quabatches) {
        As3Array array = As3Array.createEmpty();
        for (QuadBatch q : quabatches) {
            array.push(q.getJsObj());
        }
        _doQuaBatchCompile(container, array);
    }

    private native void _doQuaBatchCompile(DisplayObjectContainer container, As3Array array)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.doQuaBatchCompile(
						container.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						array.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void doTextFieldRegisterFont(BitmapFont bitmapFont)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.doTextFieldRegisterFont(bitmapFont.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void doTextFieldUnRegisterFont(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.doTextFieldUnRegisterBitmapFont(name);
    }-*/;

    public final native void doTextFieldUnRegisterFont(String name, boolean dispose)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.doTextFieldUnRegisterBitmapFont(name, dispose);
    }-*/;

    public final native double deg2Grad(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.deg2Grad(value);
    }-*/;

    public final native String formatString(String format, String... values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formaString.apply(format, values);
    }-*/;

    public final native int getNextPowerOfTwo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getNextPowerOfTwo(value);
    }-*/;

    public final native double rad2Deg(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.rad2Deg(value);
    }-*/;

    public final native Point transformCoords(Matrix matrix, double x, double y)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.transformCoords(matrix, x, y);
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Point transformCoords(Matrix matrix, double x, double y, Point resultPoint)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.transformCoords(
						matrix,
						x,
						y,
						resultPoint.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native int argb(double alpha, double red, double green, double blue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.argb(alpha, red, green, blue);
    }-*/;

    public final native int getAlpha(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getAlpha(value);
    }-*/;

    public final native int getGreen(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getGreen(value);
    }-*/;

    public final native int getRed(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getRed(value);
    }-*/;

    public final native int getBlue(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getBlue(value);
    }-*/;

    public final native int rgb(int red, int green, int blue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.rgb(red, green, blue);
    }-*/;

}
