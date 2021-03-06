/************************************************************************
  FlipAway3DTile.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.efflex.mx.viewstackeffects;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FlipAway3DTile.
 */
public class FlipAway3DTile extends Away3DTileEffect {

    /** The Constant LEFT. */
    public static String LEFT = "left";

    /** The Constant RIGHT. */
    public static String RIGHT = "right";

    /** The Constant UP. */
    public static String UP = "up";

    /** The Constant DOWN. */
    public static String DOWN = "down";

    /** The Constant HORIZONTAL. */
    public static String HORIZONTAL = "horizontal";

    /** The Constant VERTICAL. */
    public static String VERTICAL = "vertical";

    /**
     * Instantiates a new flip away3 d tile.
     */
    protected FlipAway3DTile(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the flip away3 d tile
     */
    public FlipAway3DTile() {
        jsObj = Bridge.createObject("org.efflex.mx.viewStackEffects.FlipAway3DTile");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the flip away3 d tile
     */
    public FlipAway3DTile(UIComponent target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public native String getDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdirection();
    }-*/;

    /**
     * Sets the direction.
     * 
     * @param value
     *            the new direction
     */
    public native void setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

    /**
     * Gets the num segments width.
     * 
     * @return the num segments width
     */
    public native int getNumSegmentsWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumSegmentsWidth();
    }-*/;

    /**
     * Sets the num segments width.
     * 
     * @param value
     *            the new num segments width
     */
    public native void setNumSegmentsWidth(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnumSegmentsWidth(value);
    }-*/;

    /**
     * Gets the num segments height.
     * 
     * @return the num segments height
     */
    public native int getNumSegmentsHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumSegmentsHeight();
    }-*/;

    /**
     * Sets the num segments height.
     * 
     * @param value
     *            the new num segments height
     */
    public native void setNumSegmentsHeight(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnumSegmentsHeight(value);
    }-*/;

    /**
     * Scale direction by change.
     * 
     * @return true, if successful
     */
    public native boolean scaleDirectionByChange()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleDirectionByChange();
    }-*/;

    /**
     * Sets the scale direction by change.
     * 
     * @param value
     *            the new scale direction by change
     */
    public native void setScaleDirectionByChange(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleDirectionByChange(value);
    }-*/;
}
