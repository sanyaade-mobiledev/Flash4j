/************************************************************************
  Graphics.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

public final class Graphics extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.Graphics;
    }-*/;

    protected Graphics(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native void beginBitmapFill(BitmapData bitmap) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.beginBitmapFill(bitmap.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void beginBitmapFill(BitmapData bitmap, Matrix matrix) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.beginBitmapFill(
						bitmap.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void beginBitmapFill(BitmapData bitmap, Matrix matrix, boolean repeat) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.beginBitmapFill(
						bitmap.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						repeat);
    }-*/;

    public final native void beginBitmapFill(BitmapData bitmap, Matrix matrix, boolean repeat, boolean smooth) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.beginBitmapFill(
						bitmap.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						repeat, smooth);
    }-*/;

    public final native void beginFill(int color) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.beginFill(color);
    }-*/;

    public final native void beginFill(int color, double alpha) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.beginFill(color, alpha);
    }-*/;

    public final native void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.beginGradienFill(type, colors, alphas, ratios);
    }-*/;

    public final native void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.beginGradienFill(type, colors, alphas, ratios, matrix);
    }-*/;

    public final void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    Matrix matrix, SpreadMethod spreadMethod) {
        _beginGradienFill(type, colors, alphas, ratios, matrix, spreadMethod.value);
    }

    private final native void _beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix, String spreadMethod) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.beginGradienFill(type, colors, alphas, ratios, matrix);
    }-*/;

    public final void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    Matrix matrix, SpreadMethod spreadMethod, InterpolationMethod interpolationMethod) {
        _beginGradienFill(type, colors, alphas, ratios, matrix, spreadMethod.value, interpolationMethod.value);
    }

    private final native void _beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix, String spreadMethod, String interpolationMethod) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.beginGradienFill(type, colors, alphas, ratios, matrix,
				interpolationMethod);
    }-*/;

    public final void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    Matrix matrix, SpreadMethod spreadMethod, InterpolationMethod interpolationMethod,
                    double focalPointRatio) {
        _beginGradienFill(type, colors, alphas, ratios, matrix, spreadMethod.value, interpolationMethod.value,
                        focalPointRatio);
    }

    private final native void _beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix, String spreadMethod, String interpolationMethod,
                    double focalPointRatio) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.beginGradienFill(
						type,
						colors,
						alphas,
						ratios,
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						interpolationMethod, focalPointRatio);
    }-*/;

    public final native void beginShaderFill(Shader shader) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.beginShaderFill(shader.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void beginShaderFill(Shader shader, Matrix matrix) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.beginShaderFill(
						shader.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void clear() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clear();
    }-*/;

    public final native void copyFrom(Graphics sourceGraphics) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.copyFrom(sourceGraphics);
    }-*/;

    public final native void curveTo(double controlX, double controlY, double anchorX, double anchorY) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.curveTo(controlX, controlY, anchorX, anchorY);
    }-*/;

    public final native void drawCircle(double x, double y, double radius) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.drawCircle(x, y, radius);
    }-*/;

    public final native void drawEllipse(double x, double y, double width, double height) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.drawEllipse(x, y, width, height);
    }-*/;

    public final native void drawRect(double x, double y, double width, double height) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.drawRect(x, y, width, height);
    }-*/;

    public final native void drawRoundRect(double x, double y, double width, double height, double ellipseWidth) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.drawRect(x, y, width, height, ellipseWidth);
    }-*/;

    public final native void drawPath(JsArrayInteger commands, JsArrayNumber data) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.drawPath(commands, data);
    }-*/;

    public final native void drawPath(JsArrayInteger commands, JsArrayNumber data, String evenOdd) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.drawPath(commands, data, evenOdd);
    }-*/;

    public final native void drawRoundRect(double x, double y, double width, double height, double ellipseWidth,
                    double ellipseHeight) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.drawRoundRect(x, y, width, height, ellipseWidth, ellipseHeight);
    }-*/;

    public final native void drawRoundRectComplex(double x, double y, double width, double height,
                    double topLeftRadius, double topRightRadius, double bottomLeftRadius, double bottomRightRadius) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.drawRoundRectComplex(x, y, width, height, topLeftRadius,
				topRightRadius, bottomLeftRadius, bottomRightRadius);
    }-*/;

    public final native void drawTriangles(JsArrayNumber commands, JsArrayInteger data) /*-{
		peer.drawTriangles(commands, data);
    }-*/;

    public final native void drawTriangles(JsArrayNumber commands, JsArrayInteger data, JsArrayNumber uvtData) /*-{
		peer.drawTriangles(commands, data, uvtData);
    }-*/;

    public final native void drawTriangles(JsArrayNumber commands, JsArrayInteger data, JsArrayNumber uvtData,
                    String culling) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.drawTriangles(commands, data, uvtData, culling);
    }-*/;

    public final native void endFill() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.endFill();
    }-*/;

    public final native void lineBitmapStyle(BitmapData bitmap) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.lineBitmapStyle(bitmap.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void lineBitmapStyle(BitmapData bitmap, Matrix matrix) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.lineBitmapStyle(
						bitmap.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void lineBitmapStyle(BitmapData bitmap, Matrix matrix, boolean repeat) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineBitmapStyle(bitmap, matrix, repeat);
    }-*/;

    public final native void lineBitmapStyle(BitmapData bitmap, Matrix matrix, boolean repeat, boolean smooth) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineBitmapStyle(bitmap, matrix, repeat, smooth);
    }-*/;

    public final native void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineGradienStyle(type, colors, alphas, ratios);
    }-*/;

    public final native void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineGradienStyle(type, colors, alphas, ratios);
    }-*/;

    public final void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    SpreadMethod spreadMethod) {
        _lineGradienStyle(type, colors, alphas, ratios, spreadMethod.value);
    }

    private final native void _lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, String spreadMethod) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineGradienStyle(type, colors, alphas, ratios, spreadMethod);
    }-*/;

    public final void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    SpreadMethod spreadMethod, InterpolationMethod interpolationMethod) {
        _lineGradienStyle(type, colors, alphas, ratios, spreadMethod.value, interpolationMethod.value);
    }

    private final native void _lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, String spreadMethod, String interpolationMethod) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineGradienStyle(type, colors, alphas, ratios, spreadMethod,
				interpolationMethod);
    }-*/;

    public final void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    SpreadMethod spreadMethod, InterpolationMethod interpolationMethod, double focalPointRatio) {
        _lineGradienStyle(type, colors, alphas, ratios, spreadMethod.value, interpolationMethod.value, focalPointRatio);
    }

    private final native void _lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, String spreadMethod, String interpolationMethod, double focalPointRatio) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineGradienStyle(type, colors, alphas, ratios, spreadMethod,
				interpolationMethod, focalPointRatio);
    }-*/;

    public final native void lineShaderStyle(Shader shader) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineShaderStyle(shader);
    }-*/;

    public final native void lineShaderStyle(Shader shader, Matrix matrix) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.lineShaderStyle(
						shader.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						matrix.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void lineStyle() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineStyle();
    }-*/;

    public final native void lineStyle(double thickness) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineStyle(thickness);
    }-*/;

    public final native void lineStyle(double thickness, int color) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineStyle(thickness, color);
    }-*/;

    public final native void lineStyle(double thickness, int color, double alpha) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha);
    }-*/;

    native void lineStyle(double thickness, int color, double alpha, boolean pixelHinting) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting);
    }-*/;

    public final void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, LineScaleMode scaleMode) {
        lineStyle(thickness, color, alpha, pixelHinting, scaleMode.value);
    }

    native void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting, scaleMode);
    }-*/;

    public final void lineStyle(double thickness, int color, double alpha, boolean pixelHinting,
                    LineScaleMode scaleMode, CapsStyle caps) {
        lineStyle(thickness, color, alpha, pixelHinting, scaleMode.value, caps.value);
    }

    native void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode, String caps) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting, scaleMode, caps);
    }-*/;

    public final void lineStyle(double thickness, int color, double alpha, boolean pixelHinting,
                    LineScaleMode scaleMode, CapsStyle caps, JointStyle joints) {
        lineStyle(thickness, color, alpha, pixelHinting, scaleMode.value, caps.value, joints.value);
    }

    native void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode,
                    String caps, String joints) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting, scaleMode, caps,
				joints);
    }-*/;

    public final void lineStyle(double thickness, int color, double alpha, boolean pixelHinting,
                    LineScaleMode scaleMode, CapsStyle caps, JointStyle joints, double miterLimit) {
        lineStyle(thickness, color, alpha, pixelHinting, scaleMode.value, caps.value, joints.value, miterLimit);
    }

    native void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode,
                    String caps, String joints, double miterLimit) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting, scaleMode, caps,
				joints, miterLimit);
    }-*/;

    public final native void lineTo(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.lineTo(x, y);
    }-*/;

    public final native void moveTo(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.moveTo(x, y);
    }-*/;

}
