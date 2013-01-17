/************************************************************************
  Rectangle.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class Rectangle extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.geom.Rectangle;
    }-*/;

    protected Rectangle(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Rectangle() {
        jsObj = newInstance();
    }

    public Rectangle(double width, double height) {
        jsObj = newInstance(0, 0, width, height);
    }

    public Rectangle(double x, double y, double width, double height) {
        jsObj = newInstance(x, y, width, height);
    }

    public native double getBottom() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bottom;
    }-*/;

    public native void setBottom(double bottom) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bottom = bottom;
    }-*/;

    public native Point getBottomRight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.bottomRight;
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setBottomRight(Point bottomRight) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bottomRight = bottomRight.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native double getHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.height;
    }-*/;

    public native void setHeight(double height) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.height = height;
    }-*/;

    public native double getLeft() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.left;
    }-*/;

    public native void setLeft(double left) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.left = left;
    }-*/;

    public native double getRight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.right;
    }-*/;

    public native void setRight(double right) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.right = right;
    }-*/;

    public native Point getSize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.size;
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setSize(Point size) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.size = size.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native double getTop() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.top;
    }-*/;

    public native void setTop(double top) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.top = top;
    }-*/;

    public native Point getTopLeft() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.topLeft;
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setTopLeft(Point topLeft) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.topLeft = topLeft.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native double getWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.width;
    }-*/;

    public native void setWidth(double width) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.width = width;
    }-*/;

    public native double getX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.x;
    }-*/;

    public native void setX(double x) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.x = x;
    }-*/;

    public native double getY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.y;
    }-*/;

    public native void setY(double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.y = y;
    }-*/;

    public native Rectangle clone() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean contains(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.contains(x, y);
    }-*/;

    public native boolean containsPoint(Point point) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.containsPoint(point.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean containsRectangle(Rectangle rect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.containsRectangle(rect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean equals(Rectangle toCompare) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.equals(toCompare.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void inflate(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.inflate(x, y);
    }-*/;

    public native void inflatePoint(Point point) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.inflatePoint(point.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native Rectangle intersection(Rectangle toIntersect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.intersection(toIntersect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean intersects(Rectangle toIntersect) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.intersects(toIntersect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean isEmpty() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isEmpty();
    }-*/;

    public native boolean offset(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.offset(x, y);
    }-*/;

    public native boolean offsetPoint(Point point) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.offsetPoint(point.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void setEmpty() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setEmpty();
    }-*/;

    public native Rectangle union(Rectangle toUnion) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.union(toUnion.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.geom.Rectangle();
    }-*/;

    private static native JavaScriptObject newInstance(double x, double y, double width, double height) /*-{
		return new $wnd.runtime.flash.geom.Rectangle(x, y, width, height);
    }-*/;
}
