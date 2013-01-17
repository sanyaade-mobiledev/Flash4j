/************************************************************************
  Rotate3D.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class Rotate3D.
 */
public class Rotate3D extends AnimateTransform3D {

    /**
     * Instantiates a new rotate3 d.
     */
    protected Rotate3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the rotate3 d
     */
    public Rotate3D() {
        jsObj = Bridge.createObject("spark.effects.Rotate3D");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the rotate3 d
     */
    public Rotate3D(ProxyObject target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the angle x from.
     * 
     * @return the angle x from
     */
    public native double getAngleXFrom()/*-{
		return peer.getangleXFrom();
    }-*/;

    /**
     * Sets the angle x from.
     * 
     * @param value the new angle x from
     */
    public native void setAngleXFrom(double value)/*-{
		peer.setangleXFrom(value);
    }-*/;

    /**
     * Gets the angle x to.
     * 
     * @return the angle x to
     */
    public native double getAngleXTo()/*-{
		return peer.getangleXTo();
    }-*/;

    /**
     * Sets the angle x to.
     * 
     * @param value the new angle x to
     */
    public native void setAngleXTo(double value)/*-{
		peer.setangleXTo(value);
    }-*/;

    /**
     * Gets the angle y from.
     * 
     * @return the angle y from
     */
    public native double getAngleYFrom()/*-{
		return peer.getangleYFrom();
    }-*/;

    /**
     * Sets the angle y from.
     * 
     * @param value the new angle y from
     */
    public native void setAngleYFrom(double value)/*-{
		peer.setangleYFrom(value);
    }-*/;

    /**
     * Gets the angle y to.
     * 
     * @return the angle y to
     */
    public native double getAngleYTo()/*-{
		return peer.getangleYTo();
    }-*/;

    /**
     * Sets the angle y to.
     * 
     * @param value the new angle y to
     */
    public native void setAngleYTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setangleYTo(value);
    }-*/;

    /**
     * Gets the angle z from.
     * 
     * @return the angle z from
     */
    public native double getAngleZFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getangleZFrom();
    }-*/;

    /**
     * Sets the angle z from.
     * 
     * @param value the new angle z from
     */
    public native void setAngleZFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setangleZFrom(value);
    }-*/;

    /**
     * Gets the angle z to.
     * 
     * @return the angle z to
     */
    public native double getAngleZTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getangleZTo();
    }-*/;

    /**
     * Sets the angle z to.
     * 
     * @param value the new angle z to
     */
    public native void setAngleZTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setangleZTo(value);
    }-*/;

}
