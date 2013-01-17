/************************************************************************
  PerspectiveProjection.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class PerspectiveProjection extends ProxyObject {

    public PerspectiveProjection() {
        jsObj = newInstance();
    }

    protected PerspectiveProjection(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.geom.PerpectiveProjection;
    }-*/;

    public final native double getFieldOfView() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.fieldOfView;
    }-*/;

    public final native void setFieldOfView(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.fieldOfView = value;
    }-*/;

    public final native double getFocalLength() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.focalLength;
    }-*/;

    public final native void setFocalLength(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.focalLength = value;
    }-*/;

    public final native Point getProjectionCenter() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.projectionCenter;
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setProjectionCenter(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.projectionCenter = value;
    }-*/;

    public final native Matrix3D toMatrix3D() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.toMatrix3D();
		return @com.emitrom.air4j.core.client.geom.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.geom.PerpectiveProjection();
    }-*/;

}
