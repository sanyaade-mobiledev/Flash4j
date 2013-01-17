/************************************************************************
  Point.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class Point extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.geom.Point;
    }-*/;

    protected Point(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Point() {
        jsObj = newInstance();
    }

    public Point(double x, double y) {
        jsObj = newInstance(x, y);
    }

    public static native double distance(Point pt1, Point pt2) /*-{
		var obj = $wnd.runtime.flash.geom.Point.distance(
				pt1.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				pt2.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native Point interpolate(Point pt1, Point pt2, double f) /*-{
		var obj = $wnd.runtime.flash.geom.Point
				.interpolate(
						pt1.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						pt2.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						f);
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native Point polar(double len, double angle) /*-{
		var obj = $wnd.runtime.flash.geom.Point.polar(len, angle);
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native double getX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.x;
    }-*/;

    public final native void setX(double x) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.x = x;
    }-*/;

    public final native double getY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.y;
    }-*/;

    public final native void setY(double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.y = y;
    }-*/;

    public final native double getLength() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.length;
    }-*/;

    public final native Point add(Point p) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.add(p.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Point clone() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native boolean equals(Point toCompare) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.equals(toCompare.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native void normalize(double thickness) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.normalize(thickness);
    }-*/;

    public final native void offset(double dx, double dy) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.offset(dx, dy);
    }-*/;

    public final native Point substract(Point p) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.substract(p.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.geom.Point();
    }-*/;

    private static native JavaScriptObject newInstance(double x, double y) /*-{
		return new $wnd.runtime.flash.geom.Point(x, y);
    }-*/;
}
