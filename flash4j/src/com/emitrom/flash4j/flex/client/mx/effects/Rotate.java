/************************************************************************
  Rotate.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class Rotate.
 */
public class Rotate extends TweenEffect {

    /**
     * Instantiates a new rotate.
     */
    protected Rotate(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the rotate
     */
    public Rotate() {
        jsObj = Bridge.createObject("mx.effects.Rotate");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the rotate
     */
    public Rotate(ProxyObject target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the angle from.
     * 
     * @return the angle from
     */
    public native double getAngleFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getAngleFrom();
    }-*/;

    /**
     * Sets the angle from.
     * 
     * @param value the new angle from
     */
    public native void setAngleFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setangleFrom(value);
    }-*/;

    /**
     * Gets the angle to.
     * 
     * @return the angle to
     */
    public native double getAngleTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getangleTo();
    }-*/;

    /**
     * Sets the angle to.
     * 
     * @param value the new angle to
     */
    public native void setAngleTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setangleTo(value);
    }-*/;

    /**
     * Gets the origin x.
     * 
     * @return the origin x
     */
    public native double getOriginX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoriginX();
    }-*/;

    /**
     * Sets the origin x.
     * 
     * @param value the new origin x
     */
    public native void setOriginX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setoriginX(value);
    }-*/;

    /**
     * Gets the origin y.
     * 
     * @return the origin y
     */
    public native double getOriginY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoriginY();
    }-*/;

    /**
     * Sets the origin y.
     * 
     * @param value the new origin y
     */
    public native void setOriginY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setoriginY(value);
    }-*/;

}
