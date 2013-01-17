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
package com.emitrom.flash4j.flex.client.mx.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class MaskEffect.
 */
public class MaskEffect extends Effect {

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
        jsObj = Bridge.createObject("mx.effects.MaskEffect");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the mask effect
     */
    public MaskEffect(ProxyObject target) {
        this();
        setTarget(target);
    }

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
     * @param value the new scale x from
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
     * @param value the new scale x to
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
     * @param value the new scale y from
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
     * @param value the new scale y to
     */
    public native void setScaleYTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleYTo(value);
    }-*/;

    /**
     * Show target.
     * 
     * @return true, if successful
     */
    public native boolean showTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsshowTarget();
    }-*/;

    /**
     * Sets the show target.
     * 
     * @param value the new show target
     */
    public native void setShowTarget(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowTarget(value);
    }-*/;

    /**
     * Gets the x from.
     * 
     * @return the x from
     */
    public native double getXFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxFrom();
    }-*/;

    /**
     * Sets the x from.
     * 
     * @param value the new x from
     */
    public native void setXFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxFrom(value);
    }-*/;

    /**
     * Gets the x to.
     * 
     * @return the x to
     */
    public native double getXTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxTo();
    }-*/;

    /**
     * Sets the x to.
     * 
     * @param value the new x to
     */
    public native void setXTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxTo(value);
    }-*/;

    /**
     * Gets the y from.
     * 
     * @return the y from
     */
    public native double getYFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyFrom();
    }-*/;

    /**
     * Sets the y from.
     * 
     * @param value the new y from
     */
    public native void setYFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyFrom(value);
    }-*/;

    /**
     * Gets the y to.
     * 
     * @return the y to
     */
    public native double getYTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyTo();
    }-*/;

    /**
     * Sets the y to.
     * 
     * @param value the new y to
     */
    public native void setYTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyTo(value);
    }-*/;

}
