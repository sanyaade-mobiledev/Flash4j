/************************************************************************
  Dissolve.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.geom.RoundedRectangle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Dissolve.
 */
public class Dissolve extends TweenEffect {

    /**
     * Instantiates a new dissolve.
     */
    protected Dissolve(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the dissolve
     */
    public Dissolve() {
        jsObj = Bridge.createObject("mx.effects.Dissolve");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the dissolve
     */
    public Dissolve(ProxyObject target) {
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
     * @param value the new alpha from
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
     * @param value the new alpha to
     */
    public native void setAlphaTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalphaTo(value);
    }-*/;

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public native int getColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getColor();
    }-*/;

    /**
     * Sets the color.
     * 
     * @param value the new color
     */
    public native void setColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolor(value);
    }-*/;

    /**
     * Gets the target area.
     * 
     * @return the target area
     */
    public native RoundedRectangle getTargetArea()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettargetArea();
		return @com.emitrom.flash4j.flex.client.mx.geom.RoundedRectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the target area.
     * 
     * @param value the new target area
     */
    public native void setTargetArea(RoundedRectangle value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settargetArea(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
