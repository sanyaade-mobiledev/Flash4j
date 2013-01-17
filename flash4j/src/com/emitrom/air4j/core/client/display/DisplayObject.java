/************************************************************************
  DisplayObject.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import java.util.Arrays;
import java.util.List;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.filters.BitmapFilter;
import com.emitrom.air4j.core.client.geom.Matrix;
import com.emitrom.air4j.core.client.geom.Point;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.emitrom.air4j.core.client.geom.Transform;
import com.emitrom.air4j.core.client.geom.Vector3D;
import com.emitrom.air4j.core.client.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

public class DisplayObject extends EventDispatcher implements IBitmapDrawable {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.DisplayObject;
    }-*/;

    protected DisplayObject() {

    }

    protected DisplayObject(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native double getAlpha() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.alpha;
    }-*/;

    public native void setAlpha(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.alpha = value;
    }-*/;

    public native String getBlendMode() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.blendMode;
    }-*/;

    public native void setBlendMode(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.blendMode = value;
    }-*/;

    public native Shader setBlenShader(Shader value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.blendShader = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		;
    }-*/;

    public native boolean isCachedAsBitmap() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.cacheAsBitmap;
    }-*/;

    public native Matrix getCachedAsBitmapMatrix() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.cacheAsBitmapMatrix;
		return @com.emitrom.air4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setCachedAsBitmap(boolean cache) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.cacheAsBitmap = cache;
    }-*/;

    public List<BitmapFilter> getFilters() {
        List<? extends ProxyObject> peers = DataConverter.fromJsArray(_getFilters());
        List<BitmapFilter> toReturn = new ArrayList<BitmapFilter>();
        for (ProxyObject p : peers) {
            toReturn.add(BitmapFilter.from(p));
        }
        return toReturn;
    }

    private native JavaScriptObject _getFilters() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.filters;
    }-*/;

    public void setFilters(List<BitmapFilter> filters) {
        _setFilters(DataConverter.fromList(filters));
    }

    public void setFilters(BitmapFilter... filters) {
        _setFilters(DataConverter.fromList(Arrays.asList(filters)));
    }

    private native void _setFilters(JavaScriptObject values) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.filters = values;
    }-*/;

    public native double getHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.height;
    }-*/;

    public native void setHeight(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.height = value;
    }-*/;

    public native LoaderInfo getLoaderInfo() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.loaderInfo;
		return @com.emitrom.air4j.core.client.display.LoaderInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native DisplayObject getMask() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.mask;
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setMask(DisplayObject value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.mask = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		;
    }-*/;

    public native double getMouseX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.mouseX;
    }-*/;

    public native double getMouseY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.mouseY;
    }-*/;

    public native String getName() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.name;
    }-*/;

    public native void setName(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.name = name;
    }-*/;

    public native <T extends JavaScriptObject> T getOpaqueBackground() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.opaqueBackground;
    }-*/;

    public native void setOpaqueBackground(JavaScriptObject value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.opaqueBackground = value;
    }-*/;

    public native DisplayObjectContainer getParent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.parent;
		return @com.emitrom.air4j.core.client.display.DisplayObjectContainer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native DisplayObject getRoot() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.root;
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native double getRotation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rotation;
    }-*/;

    public native void setRotation(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.rotation = value;
    }-*/;

    public native double getRotationX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rotationX;
    }-*/;

    public native void setRotationX(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.rotationX = value;
    }-*/;

    public native double getRotationY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rotationY;
    }-*/;

    public native void setRotationY(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.rotationY = value;
    }-*/;

    public native double getRotationZ() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rotationZ;
    }-*/;

    public native void setRotationZ(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.rotationZ = value;
    }-*/;

    public native Rectangle getScale9Grid() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.scale9Grid;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setScale9Grid(Rectangle value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scale9Grid = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native double getScaleX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scaleX;
    }-*/;

    public native void setScaleX(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scaleX = value;
    }-*/;

    public native double getScaleY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scaleY;
    }-*/;

    public native void setScaleY(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scaleY = value;
    }-*/;

    public native double getScaleZ() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scaleZ;
    }-*/;

    public native void setScaleZ(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scaleZ = value;
    }-*/;

    public native Rectangle getScollRect() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scollRect;
    }-*/;

    public native void setScollRect(Rectangle value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scollRect = value;
    }-*/;

    public native Stage getStage() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.stage;
		return @com.emitrom.air4j.core.client.display.Stage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Transform getTransform() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.transform;
		return @com.emitrom.air4j.core.client.geom.Transform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setTransform(Transform value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.transform = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		;
    }-*/;

    public native boolean isVisible() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.visible;
    }-*/;

    public native void setVisible(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.visible = value;
    }-*/;

    public native double getWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.width;
    }-*/;

    public native void setWidth(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.width = value;
    }-*/;

    public native double getX() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.x;
    }-*/;

    public native void setX(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.x = value;
    }-*/;

    public native double getY() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.y;
    }-*/;

    public native void setY(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.y = value;
    }-*/;

    public native double getZ() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.z;
    }-*/;

    public native void setZ(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.z = value;
    }-*/;

    public native Rectangle getBounds(DisplayObject targetCoordinateSpace) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getBounds(targetCoordinateSpace.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Rectangle getRect(DisplayObject targetCoordinateSpace) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getRect(targetCoordinateSpace.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Point globalToLocal(Point p) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.globalToLocal(p.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Vector3D globalToLocal3D(Point p) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.globalToLocal3D(p.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Vector3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean hitTestObject(DisplayObject obj) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.hitTestObject(obj.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean hitTestPoint(int x, int y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.hitTestPoint(x, y);
    }-*/;

    public native boolean hitTestPoint(int x, int y, boolean shapeFlag) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.hitTestPoint(x, y, shapeFlag);
    }-*/;

    public native Point local3DToGlobal(Vector3D point3D) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.local3DToGlobal(point3D.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Point localToGlobal(Point point) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.local3DToGlobal(point.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    @Override
    public JavaScriptObject asIBitmapDrawable() {
        return this.jsObj.cast();
    }

}
