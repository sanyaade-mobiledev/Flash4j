/************************************************************************
  GraphicsBitmapFill.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.display;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Matrix;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Defines a bitmap fill. The bitmap can be smoothed, repeated or tiled to fill
 * the area; or manipulated using a transformation matrix.
 * <p>
 * Use a GraphicsBitmapFill object with the Graphics.drawGraphicsData() method.
 * Drawing a GraphicsBitmapFill object is the equivalent of calling the
 * Graphics.beginBitmapFill() method.
 */
public class GraphicsBitmapFill extends ProxyObject implements IGraphicsData {

    /**
     * Instantiates a new graphics bitmap fill.
     */
    public GraphicsBitmapFill() {
        jsObj = createNativePeer();
    }

    /**
     * New instance.
     * 
     * @return the graphics bitmap fill
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.GraphicsBitmapFill");
    }

    /**
     * New instance.
     * 
     * @param bitmapData the bitmap data
     * @return the graphics bitmap fill
     */
    public GraphicsBitmapFill(BitmapData bitmapData) {
        this();
        setBimapData(bitmapData);
    }

    /**
     * New instance.
     * 
     * @param bitmapData the bitmap data
     * @param matrix the matrix
     * @return the graphics bitmap fill
     */
    public GraphicsBitmapFill(BitmapData bitmapData, Matrix matrix) {
        this(bitmapData);
        setMatrix(matrix);
    }

    /**
     * New instance.
     * 
     * @param bitmapData the bitmap data
     * @param matrix the matrix
     * @param repeat the repeat
     * @return the graphics bitmap fill
     */
    public GraphicsBitmapFill(BitmapData bitmapData, Matrix matrix, boolean repeat) {
        this(bitmapData, matrix);
        setRepeat(repeat);
    }

    /**
     * New instance.
     * 
     * @param bitmapData the bitmap data
     * @param matrix the matrix
     * @param repeat the repeat
     * @param smooth the smooth
     * @return the graphics bitmap fill
     */
    public GraphicsBitmapFill(BitmapData bitmapData, Matrix matrix, boolean repeat, boolean smooth) {
        this(bitmapData, matrix, repeat);
        setSmooth(smooth);
    }

    /**
     * Gets the bimap data.
     * 
     * @return the bimap data
     */
    public native BitmapData getBimapData() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbimapData();
		return @com.emitrom.flash4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the bimap data.
     * 
     * @param value the new bimap data
     */
    public native void setBimapData(BitmapData value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setbimapData(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the matrix.
     * 
     * @return the matrix
     */
    public native Matrix getMatrix() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getmatrix();
		return @com.emitrom.flash4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the matrix.
     * 
     * @param value the new matrix
     */
    public native void setMatrix(Matrix value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		this
				.setmatrix(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Checks if is repeat.
     * 
     * @return true, if is repeat
     */
    public native boolean isRepeat() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrepeat();
    }-*/;

    /**
     * Sets the repeat.
     * 
     * @param value the new repeat
     */
    public native void setRepeat(boolean value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrepeat(value);
    }-*/;

    /**
     * Checks if is smooth.
     * 
     * @return true, if is smooth
     */
    public native boolean isSmooth() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsmooth();
    }-*/;

    /**
     * Sets the smooth.
     * 
     * @param value the new smooth
     */
    public native void setSmooth(boolean value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsmooth(value);
    }-*/;

    @Override
    public JavaScriptObject asIGraphicsData() {
        return this.getJsObj().cast();
    }

}
