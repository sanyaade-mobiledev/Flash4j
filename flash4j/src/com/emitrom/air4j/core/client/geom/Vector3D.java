/************************************************************************
  Vector3D.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class Vector3D extends ProxyObject {

    public static final Vector3D X_AXIS = getConstant("X_AXIS");
    public static final Vector3D Y_AXIS = getConstant("Y_AXIS");
    public static final Vector3D Z_AXIS = getConstant("Z_AXIS");

    protected Vector3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Vector3D(double x, double y, double z, double w) {
        jsObj = newInstance(x, y, z, w);
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.geom.Vector3D;
    }-*/;

    public final native double getLength() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.length;
    }-*/;

    public final native double getLengthSquared() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.lengthSquared;
    }-*/;

    public final native double getW() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.w;
    }-*/;

    public final native void setW(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.w = value;
    }-*/;

    public final native double getX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.x;
    }-*/;

    public final native void setX(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.x = value;
    }-*/;

    public final native double getY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.y;
    }-*/;

    public final native void setY(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.y = value;
    }-*/;

    public final native double getZ() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.z;
    }-*/;

    public final native void setZ(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.z = value;
    }-*/;

    public final native Vector3D add(Vector3D value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.add(value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Vector3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native double getAngleBetween(Vector3D a, Vector3D b) /*-{
		return $wnd.runtime.flash.geom.Vector3D.angleBetween(
				a.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				b.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native Vector3D clone() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.air4j.core.client.geom.Vector3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Vector3D crossProduct(Vector3D a, Vector3D d) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.crossProduct(
				a.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				b.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Vector3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void decrementBy(Vector3D a) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.decrementBy(a.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());

    }-*/;

    public static native double distance(Vector3D a, Vector3D b) /*-{
		return $wnd.runtime.flash.geom.Vector3D.distance(
				a.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				b.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native double dotProduct(Vector3D a) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.dotProduct(a.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native boolean equals(Vector3D toCompare) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.equals(toCompare.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native boolean equals(Vector3D toCompare, boolean allFour) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.equals(
						toCompare.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						allFour);
    }-*/;

    public final native void incrementBy(Vector3D a) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.incrementBy(a.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native boolean nearEquals(Vector3D toCompare, double tolerance) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.nearEquals(
						toCompare.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						tolerance);
    }-*/;

    public final native boolean nearEquals(Vector3D toCompare, double tolerance, boolean allFour) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.nearEquals(
						toCompare.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						tolerance, allFour);
    }-*/;

    public final native void negate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.negate();
    }-*/;

    public final native double normalize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.normalize();
    }-*/;

    public final native void project() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.project();
    }-*/;

    public final native void scaleBy(double s) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scaleBy(s);
    }-*/;

    public final native Vector3D substract(Vector3D a) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.substract(a.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Vector3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native Vector3D getConstant(String name) /*-{
		return $wnd.runtime.flash.geom.Vector3D[name];
    }-*/;

    private static native JavaScriptObject newInstance(double x, double y, double z, double w) /*-{
		return new $wnd.runtime.flash.geom.Vector3D(x, y, z, w);
    }-*/;

}
