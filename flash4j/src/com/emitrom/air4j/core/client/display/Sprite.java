/************************************************************************
  Sprite.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.geom.Rectangle;
import com.emitrom.air4j.core.client.media.SoundTransform;
import com.google.gwt.core.client.JavaScriptObject;

public class Sprite extends DisplayObjectContainer {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.Sprite;
    }-*/;

    public Sprite() {
        jsObj = newInstance();
    }

    protected Sprite(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native boolean buttonMode() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.buttonMode;
    }-*/;

    public native void setButtonMode(boolean mode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.buttonMode = mode;
    }-*/;

    public native DisplayObject getDropTarget() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.dropTarget;
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Graphics getGraphcis() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.graphics;
		return @com.emitrom.air4j.core.client.display.Graphics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setHitArea(Sprite area) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.hitArea = area.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native Sprite getHitArea() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.hitArea;
		return @com.emitrom.air4j.core.client.display.Sprite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setSoundTransform(SoundTransform value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.soundTransform = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native SoundTransform getSoundTransform() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.soundTransform;
		return @com.emitrom.air4j.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean useHandcursor() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.useHandCursor;
    }-*/;

    public native void setUseHandCursor(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.useHandCursor = value;
    }-*/;

    public native void startDrag() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.startDrag();
    }-*/;

    public native void startDrag(boolean lockCenter) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.startDrag(lockCenter);
    }-*/;

    public native void startDrag(boolean lockCenter, Rectangle bounds) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.startDrag(lockCenter, bounds);
    }-*/;

    public native void startTouchDrag(int touchPointID) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.startTouchDrag(touchPointID);
    }-*/;

    public native void startTouchDrag(int touchPointID, boolean lockCenter) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.startTouchDrag(touchPointID, lockCenter);
    }-*/;

    public native void startTouchDrag(int touchPointID, boolean lockCenter, Rectangle bounds) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.startTouchDrag(
						touchPointID,
						lockCenter,
						bounds.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void stopDrag() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stopDrag();
    }-*/;

    public native void stopTouchDrag(int touchPointID) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stopTouchDrag(touchPointID);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.display.Sprite();
    }-*/;
}
