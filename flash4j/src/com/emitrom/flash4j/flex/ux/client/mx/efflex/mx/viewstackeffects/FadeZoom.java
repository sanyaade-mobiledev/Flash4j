/************************************************************************
  FadeZoom.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class FadeZoom.
 */
public class FadeZoom extends ViewStackTweenEffect {

    /** The Constant PREV_CHILD. */
    public static String PREV_CHILD = "prevChild";

    /** The Constant NEXT_CHILD. */
    public static String NEXT_CHILD = "nextChild";

    /**
     * Instantiates a new fade zoom.
     */
    protected FadeZoom(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the fade zoom
     */
    public FadeZoom() {
        jsObj = Bridge.createObject("org.efflex.mx.viewStackEffects.FadeZoom");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the fade zoom
     */
    public FadeZoom(UIComponent target) {
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
     * Gets the scale x from.
     * 
     * @return the scale x from
     */
    public native double getScaleXFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleXFrom();
    }-*/;

    /**
     * Sets the scale x from.
     * 
     * @param value
     *            the new scale x from
     */
    public native void setScaleXFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleXFrom(value);
    }-*/;

    /**
     * Gets the scale x to.
     * 
     * @return the scale x to
     */
    public native double getScaleXTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleXTo();
    }-*/;

    /**
     * Sets the scale x to.
     * 
     * @param value
     *            the new scale x to
     */
    public native void setScaleXTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleXTo(value);
    }-*/;

    /**
     * Gets the scale y from.
     * 
     * @return the scale y from
     */
    public native double getScaleYFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleYFrom();
    }-*/;

    /**
     * Sets the scale y from.
     * 
     * @param value
     *            the new scale y from
     */
    public native void setScaleYFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleYFrom(value);
    }-*/;

    /**
     * Gets the scale y to.
     * 
     * @return the scale y to
     */
    public native double getScaleYTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleYTo();
    }-*/;

    /**
     * Sets the scale y to.
     * 
     * @param value
     *            the new scale y to
     */
    public native void setScaleYTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleYTo(value);
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
