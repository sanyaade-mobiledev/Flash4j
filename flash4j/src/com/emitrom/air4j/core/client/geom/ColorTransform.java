/************************************************************************
  ColorTransform.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class ColorTransform extends ProxyObject {

    protected ColorTransform(JavaScriptObject obj) {
        jsObj = obj;
    }

    public ColorTransform() {
        jsObj = createPeer();
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.geom.ColorTransform;
    }-*/;

    public native double getAlphaMultiplier() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.alphaMultiplier;
    }-*/;

    public native void setAlphaMultiplier(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.alphaMultiplier = value;
    }-*/;

    public native double getAlphaOffset() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.alphaOffset;
    }-*/;

    public native void setAlphaOffset(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.alphaOffset = value;
    }-*/;

    public native double getBlueMultiplier() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.blueMultiplier;
    }-*/;

    public native void setBlueMultiplier(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.blueMultiplier = value;
    }-*/;

    public native double getBlueOffset() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.blueOffset;
    }-*/;

    public native void setBlueOffset(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.blueOffset = value;
    }-*/;

    public native double getColor() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.color;
    }-*/;

    public native void setColor(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.color = value;
    }-*/;

    public native double getGreenMultiplier() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.greenMultiplier;
    }-*/;

    public native void setGreenMultiplier(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.greenMultiplier = value;
    }-*/;

    public native double getGreenOffset() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.greenOffset;
    }-*/;

    public native void setGreenOffset(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.greenOffset = value;
    }-*/;

    public native double getRedMultiplier() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.redMultiplier;
    }-*/;

    public native void setRedMultiplier(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.redMultiplier = value;
    }-*/;

    public native double getRedOffset() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.redOffset;
    }-*/;

    public native void setRedOffset(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.redOffset = value;
    }-*/;

    private static native JavaScriptObject createPeer() /*-{
		return new $wnd.runtime.flash.geom.ColorTransform();
    }-*/;

    public native void concat(ColorTransform second) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.concat(second.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;
}
