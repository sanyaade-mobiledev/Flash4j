/************************************************************************
  FadeTile.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class FadeTile.
 */
public class FadeTile extends TileTweenEffect {

    /** The Constant PREV_CHILD. */
    public static String PREV_CHILD = "prevChild";

    /** The Constant NEXT_CHILD. */
    public static String NEXT_CHILD = "nextChild";

    /** The Constant TOP. */
    public static String TOP = "top";

    /** The Constant MIDDLE. */
    public static String MIDDLE = "middle";

    /** The Constant BOTTOM. */
    public static String BOTTOM = "bottom";

    /** The Constant LEFT. */
    public static String LEFT = "left";

    /** The Constant CENTER. */
    public static String CENTER = "center";

    /** The Constant RIGHT. */
    public static String RIGHT = "right";

    /**
     * Instantiates a new fade tile.
     */
    protected FadeTile(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the fade tile
     */
    public FadeTile() {
        jsObj = Bridge.createObject("org.efflex.mx.viewStackEffects.FadeTile");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the fade tile
     */
    public FadeTile(UIComponent target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the alpha from.
     * 
     * @return the alpha from
     */
    public native double getAlphaFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalphaFrom();
    }-*/;

    /**
     * Sets the alpha from.
     * 
     * @param value
     *            the new alpha from
     */
    public native void setAlphaFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalphaFrom(value);
    }-*/;

    /**
     * Gets the alpha to.
     * 
     * @return the alpha to
     */
    public native double getAlphaTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalphaTo();
    }-*/;

    /**
     * Sets the alpha to.
     * 
     * @param value
     *            the new alpha to
     */
    public native void setAlphaTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalphaTo(value);
    }-*/;

    /**
     * Gets the vertical align.
     * 
     * @return the vertical align
     */
    public native String getVerticalAlign()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalAlign();
    }-*/;

    /**
     * Sets the vertical align.
     * 
     * @param value
     *            the new vertical align
     */
    public native void setVerticalAlign(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalAlign(value);
    }-*/;

    /**
     * Gets the horizontal align.
     * 
     * @return the horizontal align
     */
    public native String getHorizontalAlign()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalAlign();
    }-*/;

    /**
     * Sets the horizontal align.
     * 
     * @param value
     *            the new horizontal align
     */
    public native void setHorizontalAlign(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalAlign(value);
    }-*/;

    /**
     * Gets the effect target.
     * 
     * @return the effect target
     */
    public native String getEffectTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteffectTarget();
    }-*/;

    /**
     * Sets the effect target.
     * 
     * @param value
     *            the new effect target
     */
    public native void setEffectTarget(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteffectTarget(value);
    }-*/;
}
