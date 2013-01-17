/************************************************************************
  AnimateColor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class AnimateColor.
 */
public class AnimateColor extends Animate {

    /**
     * Instantiates a new animate color.
     */
    protected AnimateColor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the animate color
     */
    public AnimateColor() {
        jsObj = Bridge.createObject("spark.effects.AnimateColor");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the animate color
     */
    public AnimateColor(Object target) {
        this();
        setTarget(target);
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the animate color
     */
    public AnimateColor(ProxyObject target) {
        this();
        setTarget(target.getJsObj());
    }

    /**
     * Gets the color from.
     * 
     * @return the color from
     */
    public native int getColorFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolorFrom();
    }-*/;

    /**
     * Sets the color from.
     * 
     * @param value the new color from
     */
    public native void setColorFrom(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolorFrom(value);
    }-*/;

    /**
     * Gets the color property name.
     * 
     * @return the color property name
     */
    public native String getColorPropertyName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolorPropertyName();
    }-*/;

    /**
     * Sets the color property name.
     * 
     * @param value the new color property name
     */
    public native void setColorPropertyName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolorPropertyName(value);
    }-*/;

    /**
     * Gets the color to.
     * 
     * @return the color to
     */
    public native int getColorTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolorTo();
    }-*/;

    /**
     * Sets the color to.
     * 
     * @param value the new color to
     */
    public native void setColorTo(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolorTo(value);
    }-*/;

}
