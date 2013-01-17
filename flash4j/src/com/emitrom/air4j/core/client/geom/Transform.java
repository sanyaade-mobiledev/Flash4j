/************************************************************************
  Transform.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.air4j.core.client.display.DisplayObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Transform extends ProxyObject {

    protected Transform(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.geom.Transform;
    }-*/;

    public final native ColorTransform getColorTransform() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.colorTransform;
		return @com.emitrom.air4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setColorTransform(ColorTransform value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.colorTransform = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public final native ColorTransform getConcatenatedColorTransform() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.concatenatedColorTransform;
		return @com.emitrom.air4j.core.client.geom.ColorTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Matrix getConcatenatedMatrix() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.concatenatedMatrix;
		return @com.emitrom.air4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Matrix getMatrix() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.matrix;
		return @com.emitrom.air4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setMatrix(Matrix value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.matrix = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public final native Matrix3D getMatrix3D() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.matrix3D;
		return @com.emitrom.air4j.core.client.geom.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setMatrix3D(Matrix3D value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.matrix3D = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public final native PerspectiveProjection getPerpectiveProjection() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.perspectiveProjection;
		return @com.emitrom.air4j.core.client.geom.PerspectiveProjection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setPerpectiveProjection(PerspectiveProjection value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.perspectiveProjection = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public final native Rectangle getPixelBounds() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.pixelBounds;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Matrix3D getRelativeMatrix3D(DisplayObject relativeTo) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getRelativeMatrix3D(relativeTo.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.geom.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
