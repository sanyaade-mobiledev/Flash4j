/************************************************************************
  ImageSnapshot.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.graphics;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.BitmapData;
import com.emitrom.flash4j.core.client.display.BlendMode;
import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.display.IBitmapDrawable;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.ColorTransform;
import com.emitrom.flash4j.core.client.geom.Matrix;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.emitrom.flash4j.flex.client.mx.graphics.codec.IImageEncoder;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A helper class used to capture a snapshot of any Flash component that
 * implements flash.display.IBitmapDrawable, including Flex UIComponents. An
 * instance of this class can be sent as a RemoteObject to Adobe's LiveCycle
 * Data Services to generate a PDF file of a client-side image. If you need to
 * specify additional properties of the image beyond its contentType, width, and
 * height properties, you should set name/value pairs on the properties object.
 * <p>
 * In earlier versions of Flex, you set these additional properties on the
 * ImageSnapshot instance itself. This class is still dynamic in order to allow
 * that, but in a future version of Flex it might no longer be dynamic.
 */
public class ImageSnapshot extends ProxyObject {

    private static final ImageSnapshot INSTANCE = new ImageSnapshot();

    /**
     * Instantiates a new image snapshot.
     */
    protected ImageSnapshot(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the image snapshot
     */
    private ImageSnapshot() {
        jsObj = Bridge.createObject("mx.graphics.ImageSnapshot");
    }

    /**
     * Capture bitmap data.
     * 
     * @param source the source
     * @return the bitmap data
     */
    public static BitmapData captureBitmapData(IBitmapDrawable source) {
        return INSTANCE._captureBitmapData(source.asIBitmapDrawable());
    }

    /**
     * _capture bitmap data.
     * 
     * @param source the source
     * @return the bitmap data
     */
    private final native BitmapData _captureBitmapData(JavaScriptObject source)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.captureBitmapData(source);
		return @com.emitrom.flash4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @return the bitmap data
     */
    public static BitmapData captureBitmapData(IBitmapDrawable source, Matrix matrix) {
        return _create()._captureBitmapData(source.asIBitmapDrawable(), matrix);
    }

    private static ImageSnapshot _create() {
        return INSTANCE;
    }

    /**
     * _capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @return the bitmap data
     */
    private final native BitmapData _captureBitmapData(JavaScriptObject source, Matrix matrix)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.captureBitmapData(
						source,
						matrix.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @param colorTransform the color transform
     * @return the bitmap data
     */
    public static BitmapData captureBitmapData(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform) {
        return _create()._captureBitmapData(source.asIBitmapDrawable(), matrix, colorTransform);
    }

    /**
     * _capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @param colorTransform the color transform
     * @return the bitmap data
     */
    private final native BitmapData _captureBitmapData(JavaScriptObject source, Matrix matrix,
                    ColorTransform colorTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.captureBitmapData(
						source,
						matrix.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @param colorTransform the color transform
     * @param blendMode the blend mode
     * @return the bitmap data
     */
    public static BitmapData captureBitmapData(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform,
                    BlendMode blendMode) {
        return _create()._captureBitmapData(source.asIBitmapDrawable(), matrix, colorTransform, blendMode.value);
    }

    /**
     * _capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @param colorTransform the color transform
     * @param blendMode the blend mode
     * @return the bitmap data
     */
    private final native BitmapData _captureBitmapData(JavaScriptObject source, Matrix matrix,
                    ColorTransform colorTransform, String blendMode)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.captureBitmapData(
						source,
						matrix.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						colorTransformvar.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						blendMode);
		return @com.emitrom.flash4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @param colorTransform the color transform
     * @param blendMode the blend mode
     * @param clipRect the clip rect
     * @return the bitmap data
     */
    public static BitmapData captureBitmapData(DisplayObject source, Matrix matrix, ColorTransform colorTransform,
                    BlendMode blendMode, Rectangle clipRect) {
        return ImageSnapshot.captureBitmapData(source.asIBitmapDrawable(), matrix, colorTransform, blendMode, clipRect);
    }

    /**
     * Capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @param colorTransform the color transform
     * @param blendMode the blend mode
     * @param clipRect the clip rect
     * @return the bitmap data
     */
    private static BitmapData captureBitmapData(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform,
                    BlendMode blendMode, Rectangle clipRect) {
        return _create()._captureBitmapData(source, matrix, colorTransform, blendMode.value, clipRect);
    }

    /**
     * _capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @param colorTransform the color transform
     * @param blendMode the blend mode
     * @param clipRect the clip rect
     * @return the bitmap data
     */
    private final native BitmapData _captureBitmapData(JavaScriptObject source, Matrix matrix,
                    ColorTransform colorTransform, String blendMode, Rectangle clipRect)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.captureBitmapData(
						source,
						matrix.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						blendMode,
						clipRect.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @param colorTransform the color transform
     * @param blendMode the blend mode
     * @param clipRect the clip rect
     * @param smoothing the smoothing
     * @return the bitmap data
     */
    public static BitmapData captureBitmapData(DisplayObject source, Matrix matrix, ColorTransform colorTransform,
                    BlendMode blendMode, Rectangle clipRect, boolean smoothing) {
        return _create()._captureBitmapData(source.asIBitmapDrawable(), matrix, colorTransform, blendMode.value,
                        clipRect, smoothing);
    }

    /**
     * _capture bitmap data.
     * 
     * @param source the source
     * @param matrix the matrix
     * @param colorTransform the color transform
     * @param blendMode the blend mode
     * @param clipRect the clip rect
     * @param smoothing the smoothing
     * @return the bitmap data
     */
    private final native BitmapData _captureBitmapData(JavaScriptObject source, Matrix matrix,
                    ColorTransform colorTransform, String blendMode, Rectangle clipRect, boolean smoothing)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.captureBitmapData(
						source,
						matrix.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						colorTransform.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						blendMode,
						clipRect.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						smoothing);
		return @com.emitrom.flash4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Capture image.
     * 
     * @param source the source
     * @return the image snapshot
     */
    public static ImageSnapshot captureImage(IBitmapDrawable source) {
        return _create()._captureImage(source.asIBitmapDrawable());
    }

    /**
     * _capture image.
     * 
     * @param source the source
     * @return the image snapshot
     */
    private final native ImageSnapshot _captureImage(JavaScriptObject source)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.captureImage(source);
		return @com.emitrom.flash4j.flex.client.mx.graphics.ImageSnapshot::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Capture image.
     * 
     * @param source the source
     * @param dpi the dpi
     * @return the image snapshot
     */
    public static ImageSnapshot captureImage(IBitmapDrawable source, double dpi) {
        return _create()._captureImage(source.asIBitmapDrawable(), dpi);
    }

    /**
     * _capture image.
     * 
     * @param source the source
     * @param dpi the dpi
     * @return the image snapshot
     */
    private final native ImageSnapshot _captureImage(JavaScriptObject source, double dpi)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.captureImage(source, dpi);
		return @com.emitrom.flash4j.flex.client.mx.graphics.ImageSnapshot::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Capture image.
     * 
     * @param source the source
     * @param dpi the dpi
     * @param encoder the encoder
     * @return the image snapshot
     */
    public static ImageSnapshot captureImage(IBitmapDrawable source, double dpi, IImageEncoder encoder) {
        return _create()._captureImage(source.asIBitmapDrawable(), dpi, encoder);
    }

    /**
     * _capture image.
     * 
     * @param source the source
     * @param dpi the dpi
     * @param encoder the encoder
     * @return the image snapshot
     */
    private final native ImageSnapshot _captureImage(JavaScriptObject source, double dpi, IImageEncoder encoder)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.captureImage(
						source,
						dpi,
						encoder.@com.emitrom.flash4j.flex.client.mx.graphics.codec.IImageEncoder::asIImageEncoder()());
		return @com.emitrom.flash4j.flex.client.mx.graphics.ImageSnapshot::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Capture image.
     * 
     * @param source the source
     * @param dpi the dpi
     * @param encoder the encoder
     * @param scaleLimted the scale limted
     * @return the image snapshot
     */
    public static ImageSnapshot captureImage(IBitmapDrawable source, double dpi, IImageEncoder encoder,
                    boolean scaleLimted) {
        return _create()._captureImage(source.asIBitmapDrawable(), dpi, encoder, scaleLimted);
    }

    /**
     * _capture image.
     * 
     * @param source the source
     * @param dpi the dpi
     * @param encoder the encoder
     * @param scaleLimited the scale limited
     * @return the image snapshot
     */
    private final native ImageSnapshot _captureImage(JavaScriptObject source, double dpi, IImageEncoder encoder,
                    boolean scaleLimited)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.captureImage(
						source,
						dpi,
						encoder.@com.emitrom.flash4j.flex.client.mx.graphics.codec.IImageEncoder::asIImageEncoder()(),
						scaleLimited);
		return @com.emitrom.flash4j.flex.client.mx.graphics.ImageSnapshot::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Encode image as base64.
     * 
     * @param snapShot the snap shot
     * @return the string
     */
    public static String encodeImageAsBase64(ImageSnapshot snapShot) {
        return _create()._encodeImageAsBase64(snapShot);
    }

    /**
     * _encode image as base64.
     * 
     * @param snapShot the snap shot
     * @return the string
     */
    private final native String _encodeImageAsBase64(ImageSnapshot snapShot)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.encodeImageAsBase64(snapShot.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the content type.
     * 
     * @return the content type
     */
    public final native String getContentType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontentType();
    }-*/;

    /**
     * Sets the content type.
     * 
     * @param value the new content type
     */
    public final native void setContentType(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcontentType(value);
    }-*/;

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public final native ByteArray getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdata();
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value the new data
     */
    public final native void setData(ByteArray value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setdata(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the height.
     * 
     * @return the height
     */
    public final native int getHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Sets the height.
     * 
     * @param value the new height
     */
    public final native void setHeight(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheight(value);
    }-*/;

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public final native int getWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Sets the width.
     * 
     * @param value the new width
     */
    public final native void setWidth(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwidth(value);
    }-*/;

}
