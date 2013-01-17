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
package com.emitrom.air4j.core.client.display;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.geom.Matrix;
import com.google.gwt.core.client.JavaScriptObject;

public class GraphicsBitmapFill extends ProxyObject implements IGraphicsData {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.GraphicsBitmapFill;
    }-*/;

    public GraphicsBitmapFill() {
        jsObj = newInstance();
    }

    public GraphicsBitmapFill(BitmapData bitmapData) {
        jsObj = newInstance(bitmapData);
    }

    public GraphicsBitmapFill(BitmapData bitmapData, Matrix matrix) {
        jsObj = newInstance(bitmapData, matrix);
    }

    public GraphicsBitmapFill(BitmapData bitmapData, Matrix matrix, boolean repeat) {
        jsObj = newInstance(bitmapData, matrix, repeat);
    }

    public GraphicsBitmapFill(BitmapData bitmapData, Matrix matrix, boolean repeat, boolean smooth) {
        jsObj = newInstance(bitmapData, matrix, repeat, smooth);
    }

    protected GraphicsBitmapFill(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native BitmapData getBimapData() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.bitmapData;
		return @com.emitrom.air4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setBimapData(BitmapData value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bitmapData = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native Matrix getMatrix() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.matrix;
		return @com.emitrom.air4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setMatrix(Matrix value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.matrix = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean isRepeat() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.repeat;
    }-*/;

    public native void repeat(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.repeat = value;
    }-*/;

    public native boolean isSmooth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.smooth;
    }-*/;

    public native void smooth(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.smooth = value;
    }-*/;

    @Override
    public JavaScriptObject asIGraphicsData() {
        return this.jsObj.cast();
    }

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.display.GraphicsBitmapFill();
    }-*/;

    private static native JavaScriptObject newInstance(BitmapData bitmapData) /*-{
		return new $wnd.runtime.flash.display.GraphicsBitmapFill(
				bitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newInstance(BitmapData bitmapData, Matrix matrix) /*-{
		return new $wnd.runtime.flash.display.GraphicsBitmapFill(
				bitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newInstance(BitmapData bitmapData, Matrix matrix, boolean repeat) /*-{
		return new $wnd.runtime.flash.display.GraphicsBitmapFill(
				bitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				repeat);
    }-*/;

    private static native JavaScriptObject newInstance(BitmapData bitmapData, Matrix matrix, boolean repeat,
                    boolean smooth) /*-{
		return new $wnd.runtime.flash.display.GraphicsBitmapFill(
				bitmapData.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				repeat, smooth);
    }-*/;
}
