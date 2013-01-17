/************************************************************************
  Resize.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Resize.
 */
public class Resize extends TweenEffect {

    /**
     * Instantiates a new resize.
     */
    protected Resize(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the resize
     */
    public Resize() {
        jsObj = Bridge.createObject("mx.effects.Resize");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the resize
     */
    public Resize(Object target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the height by.
     * 
     * @return the height by
     */
    public native double getHeightBy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheightBy();
    }-*/;

    /**
     * Sets the height by.
     * 
     * @param value the new height by
     */
    public native void setHeightBy(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheightBy(value);
    }-*/;

    /**
     * Gets the height from.
     * 
     * @return the height from
     */
    public native double getHeightFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheightFrom();
    }-*/;

    /**
     * Sets the height from.
     * 
     * @param value the new height from
     */
    public native void setHeightFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheightFrom(value);
    }-*/;

    /**
     * Gets the height to.
     * 
     * @return the height to
     */
    public native double getHeightTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheightTo();
    }-*/;

    /**
     * Sets the height to.
     * 
     * @param value the new height to
     */
    public native void setHeightTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheightTo(value);
    }-*/;

    /**
     * Gets the width by.
     * 
     * @return the width by
     */
    public native double getWidthBy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidthBy();
    }-*/;

    /**
     * Sets the width by.
     * 
     * @param value the new width by
     */
    public native void setWidthBy(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwidthBy(value);
    }-*/;

    /**
     * Gets the width from.
     * 
     * @return the width from
     */
    public native double getWidthFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidthFrom();
    }-*/;

    /**
     * Sets the width from.
     * 
     * @param value the new width from
     */
    public native void setWidthFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwidthFrom(value);
    }-*/;

    /**
     * Gets the width to.
     * 
     * @return the width to
     */
    public native double getWidthTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidthTo();
    }-*/;

    /**
     * Sets the width to.
     * 
     * @param value the new width to
     */
    public native void setWidthTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwidthTo(value);
    }-*/;

}
