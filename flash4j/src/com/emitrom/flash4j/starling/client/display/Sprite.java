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
package com.emitrom.flash4j.starling.client.display;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Sprite is the most lightweight, non-abstract container class. Use it as a
 * simple means of grouping objects together in one coordinate system, or as the
 * base class for custom display objects.
 * <p>
 * <b>Flattened Sprites</b>
 * <p>
 * The flatten-method allows you to optimize the rendering of static parts of
 * your display list.
 * <p>
 * It analyzes the tree of children attached to the sprite and optimizes the
 * rendering calls in a way that makes rendering extremely fast. The speed-up
 * comes at a price, though: you will no longer see any changes in the
 * properties of the children (position, rotation, alpha, etc.). To update the
 * object after changes have happened, simply call flatten again, or unflatten
 * the object.
 * 
 */
public class Sprite extends DisplayObjectContainer {

    public Sprite() {
        jsObj = Bridge.createObject("starling.display.Sprite");
    }

    Sprite(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Indicates if the sprite was flattened.
     * 
     * @return
     */
    public native boolean isFlattened()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisFlattened();
    }-*/;

    /**
     * Indicates if the mouse cursor should transform into a hand while it's
     * over the sprite.
     * 
     * @return
     */
    public native boolean useHandCursor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getuseHandCursor();
    }-*/;

    /**
     * Indicates if the mouse cursor should transform into a hand while it's
     * over the sprite.
     * 
     * @return
     */
    public native boolean setUseHandCursor(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setuseHandCursor(value);
    }-*/;

    /**
     * Optimizes the sprite for optimal rendering performance.
     */
    public native void flatten()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.flatten();
    }-*/;

    /**
     * Removes the rendering optimizations that were created when flattening the
     * sprite.
     */
    public native void unflatten()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.unflatten();
    }-*/;

    public final void setBackgroundColor(int value) {
        getStage().setColor(value);
    }

}
