/************************************************************************
  MaskEffect.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class MaskEffect.
 */
public class MaskEffect extends ViewStackTweenEffect {

    /** The Constant PREV_CHILD. */
    public static String PREV_CHILD = "prevChild";

    /** The Constant NEXT_CHILD. */
    public static String NEXT_CHILD = "nextChild";

    /**
     * Instantiates a new mask effect.
     */
    protected MaskEffect(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the mask effect
     */
    public MaskEffect() {
        jsObj = Bridge.createObject("org.efflex.mx.viewStackEffects.MaskEffect");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the mask effect
     */
    public MaskEffect(UIComponent target) {
        this();
        setTarget(target);
    }

    /**
     * Show mask in color.
     * 
     * @return true, if successful
     */
    public native boolean showMaskInColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowMaskInColor();
    }-*/;

    /**
     * Sets the show mask in color.
     * 
     * @param value
     *            the new show mask in color
     */
    public native void setShowMaskInColor(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowMaskInColor(value);
    }-*/;

    /**
     * Gets the mask x.
     * 
     * @return the mask x
     */
    public native double getMaskX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaskX();
    }-*/;

    /**
     * Sets the mask x.
     * 
     * @param value
     *            the new mask x
     */
    public native void setMaskX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaskX(value);
    }-*/;

    /**
     * Gets the mask y.
     * 
     * @return the mask y
     */
    public native double getMaskY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaskY();
    }-*/;

    /**
     * Sets the mask y.
     * 
     * @param value
     *            the new mask y
     */
    public native void setMaskY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaskY(value);
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
