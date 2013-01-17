/************************************************************************
  Scale3D.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Scale3D.
 */
public class Scale3D extends AnimateTransform3D {

    /**
     * Instantiates a new scale3 d.
     */
    protected Scale3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the scale3 d
     */
    public Scale3D() {
        jsObj = Bridge.createObject("spark.effects.Scale3D");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the scale3 d
     */
    public Scale3D(ProxyObject target) {
        super(target);
    }

    /**
     * Gets the scale x by.
     * 
     * @return the scale x by
     */
    public native double getScaleXBy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleXBy();
    }-*/;

    /**
     * Sets the scale x by.
     * 
     * @param value the new scale x by
     */
    public native void setScaleXBy(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleXBy(value);
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
     * Gets the scale y by.
     * 
     * @return the scale y by
     */
    public native double getScaleYBy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleYBy();
    }-*/;

    /**
     * Sets the scale y by.
     * 
     * @param value the new scale y by
     */
    public native void setScaleYBy(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleYBy(value);
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
     * Gets the scale z by.
     * 
     * @return the scale z by
     */
    public native double getScaleZBy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleZBy();
    }-*/;

    /**
     * Sets the scale z by.
     * 
     * @param value the new scale z by
     */
    public native void setScaleZBy(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleZBy(value);
    }-*/;

    /**
     * Gets the scale z from.
     * 
     * @return the scale z from
     */
    public native double getScaleZFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleZFrom();
    }-*/;

    /**
     * Sets the scale z from.
     * 
     * @param value the new scale z from
     */
    public native void setScaleZFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleZFrom(value);
    }-*/;

    /**
     * Gets the scale z to.
     * 
     * @return the scale z to
     */
    public native double getScaleZTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleYTo();
    }-*/;

    /**
     * Sets the scale z to.
     * 
     * @param value the new scale z to
     */
    public native void setScaleZTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleZTo(value);
    }-*/;
}
