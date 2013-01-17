/************************************************************************
  Matrix.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.geom;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Matrix extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.geom.Matrix;
    }-*/;

    public Matrix() {
        jsObj = newInstance();
    }

    public Matrix(double a, double b, double c, double d) {
        jsObj = newInstance(a, b, c, d);
    }

    protected Matrix(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native double getA() /*-{
		return peer.a;
    }-*/;

    public final native void setA(double a) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.a = a;
    }-*/;

    public final native double getB() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.b;
    }-*/;

    public final native void setB(double b) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.b = b;
    }-*/;

    public final native double getC() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.c;
    }-*/;

    public final native void setC(double c) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.c = c;
    }-*/;

    public final native double getD() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.d;
    }-*/;

    public final native void setD(double d) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.d = d;
    }-*/;

    public final native double getTx() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tx;
    }-*/;

    public final native void setTx(double tx) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.tx = tx;
    }-*/;

    public final native double getTy() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.ty;
    }-*/;

    public final native void setTy(double ty) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.ty = ty;
    }-*/;

    public final native Matrix clone() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.air4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void concat(Matrix m) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.concat(m.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void createBox(double scaleX, double scaleY) /*-{
		peer.createBox(scaleX, scaleY);
    }-*/;

    public final native void createBox(double scaleX, double scaleY, double rotation) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.createBox(scaleX, scaleY, rotation);
    }-*/;

    public final native void createBox(double scaleX, double scaleY, double rotation, double tx, double ty) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.createBox(scaleX, scaleY, rotation, tx, ty);
    }-*/;

    public final native void createGradientBox(double width, double height) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.createGradientBox(width, height);
    }-*/;

    public final native void createGradientBox(double width, double height, double rotation) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.createGradientBox(width, height, rotation);
    }-*/;

    public final native void createGradientBox(double width, double height, double rotation, double tx, double ty) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.createGradientBox(width, height, rotation, tx, ty);
    }-*/;

    public final native Point deltaTransformPoint(Point point) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.deltaTransformPoint(point.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void identity() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.identity();
    }-*/;

    public final native void invert() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.invert();
    }-*/;

    public final native void rotate(double angle) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.rotate(angle);
    }-*/;

    public final native void scale(double sx, double sy) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scale(sx, sy);
    }-*/;

    public final native Point transformPoint(Point point) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.transformPoint(point.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void translate(double dx, double dy) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.translate(dx, dy);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.geom.Matrix();
    }-*/;

    private static native JavaScriptObject newInstance(double a, double b, double c, double d) /*-{
		return new $wnd.runtime.flash.geom.Matrix(a, b, c, d);
    }-*/;

    private static native Matrix newInstance(double a, double b, double c, double d, double tx, double ty) /*-{
		return new $wnd.runtime.flash.geom.Matrix(a, b, c, d, tx, ty);
    }-*/;
}
