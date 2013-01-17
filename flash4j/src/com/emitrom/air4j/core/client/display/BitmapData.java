/************************************************************************
  BitmapData.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.display;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.filters.BitmapFilter;
import com.emitrom.air4j.core.client.geom.ColorTransform;
import com.emitrom.air4j.core.client.geom.Matrix;
import com.emitrom.air4j.core.client.geom.Point;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.emitrom.air4j.core.client.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public final class BitmapData extends ProxyObject implements IBitmapDrawable {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.BitmapData;
    }-*/;

    protected BitmapData(JavaScriptObject obj) {
        jsObj = obj;
    }

    public BitmapData(double width, double height) {
        jsObj = newInstance(width, height);
    }

    public BitmapData(double width, double height, boolean transparent) {
        jsObj = newInstance(width, height, transparent);
    }

    public BitmapData(double width, double height, boolean transparent, double fillColor) {
        jsObj = newInstance(width, height, transparent, fillColor);
    }

    public final native double getHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.height;
    }-*/;

    public final native double getWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.width;
    }-*/;

    public final native Rectangle getRect() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.rect;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native boolean isTransparent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.transparent;
    }-*/;

    public final native void applyFilter(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    BitmapFilter filter) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.applyFilter(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						filter.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native BitmapData clone() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.air4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj)
    }-*/;

    public final native void colorTransform(Rectangle rect, ColorTransform colorTransform) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.colorTransform(
						rect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native <T extends JavaScriptObject> T compare(BitmapData otherBitmapData) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.compare(otherBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void copyChannel(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    double sourceChannel, double destChannel) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.copyChannel(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceChannel, destChannel);
    }-*/;

    public final native void copyPixels(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.copyPixels(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void copyPixels(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    BitmapData alphaBitmapData) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.copyPixels(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						alphaBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void copyPixels(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    BitmapData alphaBitmapData, Point alphaPoint) /*-{

		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.copyPixels(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						alphaBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						alphaPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void copyPixels(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    BitmapData alphaBitmapData, Point alphaPoint, boolean mergeAlpha) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.copyPixels(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						alphaBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						alphaPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						mergeAlpha);
    }-*/;

    public final native void dispose() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.dispose();
    }-*/;

    public final native void draw(IBitmapDrawable source) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.draw(source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void draw(IBitmapDrawable source, Matrix matrix) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.draw(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.draw(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform, String blendMode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.draw(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						blendMode);
    }-*/;

    public final native void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode, Rectangle clipRect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.draw(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						blendMode,
						clipRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode, Rectangle clipRect, boolean smoothing) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.draw(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						blendMode,
						clipRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						smoothing);
    }-*/;

    public final native void drawWithQuality(IBitmapDrawable source) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.drawWithQuality(source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void drawWithQuality(BitmapData source, Matrix matrix) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.drawWithQuality(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void drawWithQuality(BitmapData source, Matrix matrix, ColorTransform colorTransform) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.drawWithQuality(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void drawWithQuality(BitmapData source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.drawWithQuality(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						blendMode);
    }-*/;

    public final native void drawWithQuality(BitmapData source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode, Rectangle clipRect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.drawWithQuality(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						blendMode,
						clipRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void drawWithQuality(BitmapData source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode, Rectangle clipRect, boolean smoothing) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.drawWithQuality(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						blendMode,
						clipRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						smoothing);
    }-*/;

    public final native void drawWithQuality(BitmapData source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode, Rectangle clipRect, boolean smoothing, String quality) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.drawWithQuality(
						source.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						blendMode,
						clipRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						smoothing, quality);
    }-*/;

    public final native void fillRect(Rectangle rect, double color) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.fillRect(
				rect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				color);
    }-*/;

    public final native void floodFill(double x, double y, double color) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.floodFill(x, y, color);
    }-*/;

    public final native Rectangle generateFilterRect(Rectangle sourceRect, BitmapFilter filer) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.generateFilterRect(
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						filter.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Rectangle getColorBoundsRect(double mask, double color) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getColorBoundsRect(mask, color);
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Rectangle getColorBoundsRect(double mask, double color, boolean findColor) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getColorBoundsRect(mask, color, findColor);
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native double getPixel(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getPixel(x, y);
    }-*/;

    public final native ByteArray encode(Rectangle rectangle) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.encode(rectangle.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native ByteArray encode(Rectangle rectangle, BitmapEncoderOptions compressor) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.encode(
						rectangle.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						compressor.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native ByteArray encode(Rectangle rectangle, BitmapEncoderOptions compressor, ByteArray byteArray) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.encode(
						rectangle.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						compressor.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						byteArray.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native double getPixel32(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getPixel32(x, y);
    }-*/;

    public final native ByteArray getPixels(Rectangle rect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getPixels(rect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native JsArrayNumber getVector(Rectangle rect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getVector(rect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native <T> T histogram() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.histogram();
    }-*/;

    public final native <T> T histogram(Rectangle hRect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.histogram(hRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native boolean hitTest(ProxyObject firstPoint, double firstAlphaThreshold, ProxyObject secondObject)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.hitTest(
						firstPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						firstAlphaThreshold,
						secondObject.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native boolean hitTest(ProxyObject firstPoint, double firstAlphaThreshold, ProxyObject secondObject,
                    Point seconBitMapData) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.hitTest(
						firstPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						firstAlphaThreshold,
						secondObject.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						secondBitMapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native boolean hitTest(ProxyObject firstPoint, double firstAlphaThreshold, ProxyObject secondObject,
                    ProxyObject seconBitMapData, double secondAlphaThreshold) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.hitTest(
						firstPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						firstAlphaThreshold,
						secondObject.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						secondBitMapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						secondAlphaThreshold);
    }-*/;

    public final native void lock() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lock();
    }-*/;

    public final native void merge(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMultipler) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.merge(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						redMultiplier, greenMultiplier, blueMultiplier,
						alphaMultiplier);
    }-*/;

    public final native void noise(double randomSeed) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.noise(randomSeed);
    }-*/;

    public final native void noise(double randomSeed, double low, double high) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.noise(randomSeed, low, high);
    }-*/;

    public final native void noise(double randomSeed, double low, double high, double channelOptions) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.noise(randomSeed, low, high, channelOptions);
    }-*/;

    public final native void noise(double randomSeed, double low, double high, double channelOptions, boolean grayScale) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.noise(randomSeed, low, high, channelOptions, grayScale);
    }-*/;

    public final native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    double[] redArray) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						redArray);
    }-*/;

    public final native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    double[] redArray, double[] greenArray) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						redArray, greenArray);
    }-*/;

    public final native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    double[] redArray, double[] greenArray, double[] blueArray) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						redArray, greenArray, blueArray);
    }-*/;

    public final native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    double[] redArray, double[] greenArray, double[] blueArray, double[] alphaArray) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						redArray, greenArray, blueArray, alphaArray);
    }-*/;

    public final native void perlinNoise(double baseX, double baseY, double numOctaves, double randomSeed,
                    boolean stitch, boolean fractalNoise) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch,
				fractalNoise);
    }-*/;

    public final native void perlinNoise(double baseX, double baseY, double numOctaves, double randomSeed,
                    boolean stitch, boolean fractalNoise, double channelOptions) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch,
				fractalNoise, channelOptions);
    }-*/;

    public final native void perlinNoise(double baseX, double baseY, double numOctaves, double randomSeed,
                    boolean stitch, boolean fractalNoise, double channelOptions, boolean grayScale) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch,
				fractalNoise, channelOptions, grayScale);
    }-*/;

    public final void perlinNoise(double baseX, double baseY, double numOctaves, double randomSeed, boolean stitch,
                    boolean fractalNoise, double channelOptions, boolean grayScale, List<Point> offsets) {
        perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch, fractalNoise, channelOptions, grayScale,
                        DataConverter.fromList(offsets));
    }

    private final native void perlinNoise(double baseX, double baseY, double numOctaves, double randomSeed,
                    boolean stitch, boolean fractalNoise, double channelOptions, boolean grayScale,
                    JavaScriptObject offsets) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch,
				fractalNoise, channelOptions, grayScale, offsets);
    }-*/;

    public final native double pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.pixelDissolve(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native double pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    double randomSeed) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.pixelDissolve(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						randomSeed);
    }-*/;

    public final native double pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    double randomSeed, double numPixels) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.pixelDissolve(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						randomSeed, numPixels);
    }-*/;

    public final native double pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    double randomSeed, double numPixels, double fillColor) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.pixelDissolve(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						randomSeed, numPixels, fillColor);
    }-*/;

    public final native void scroll(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scroll(x, y);
    }-*/;

    public final native void setPixel(double x, double y, double color) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setPixel(x, y, color);
    }-*/;

    public final native void setPixel32(double x, double y, double color) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setPixel32(x, y, color);
    }-*/;

    public final void setVector(Rectangle rect, ArrayList<Integer> inputVector) {
        Object[] vectors = inputVector.toArray();
        _setVertor(rect, vectors);
    }

    private native void _setVertor(Rectangle rect, Object[] vectors)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setVector(rect, vectors);
    }-*/;

    public final native void setPixels(Rectangle rect, ByteArray inputByteArray) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.setPixels(
						rect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						inputByteArray.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native double threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    String operator, byte threshold) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.threshold(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						operator, threshold);
    }-*/;

    public final native double threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    String operator, byte threshold, double color) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.threshold(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						operator, threshold, color);
    }-*/;

    public final native double threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    String operator, byte threshold, double color, double mask) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.threshold(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						operator, threshold.color, mask);
    }-*/;

    public final native double threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    String operator, byte threshold, double color, double mask, boolean copySource) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.threshold(
						sourceBitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						sourceRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						destPoint.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						operator, threshold.color, mask, copySource);
    }-*/;

    public final native void unlock() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.unlock();
    }-*/;

    public final native void unlock(Rectangle changeRect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.unlock(changeRect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public static BitmapData cast(JavaScriptObject obj) {
        return new BitmapData(obj);
    }

    @Override
    public JavaScriptObject asIBitmapDrawable() {
        return this.jsObj.cast();
    }

    private static native JavaScriptObject newInstance(double width, double height) /*-{
		return new $wnd.runtime.flash.display.BitmapData(width, height);
    }-*/;

    private static native JavaScriptObject newInstance(double width, double height, boolean transparent) /*-{
		return new $wnd.runtime.flash.display.BitmapData(width, height,
				transparent);
    }-*/;

    private static native JavaScriptObject newInstance(double width, double height, boolean transparent,
                    double fillColor) /*-{
		return new $wnd.runtime.flash.display.BitmapData(width, height,
				transparent, fillColor);
    }-*/;
}
