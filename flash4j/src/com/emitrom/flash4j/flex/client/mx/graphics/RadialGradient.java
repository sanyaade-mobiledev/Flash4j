/************************************************************************
  RadialGradient.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.graphics;

import com.emitrom.flash4j.core.client.display.Graphics;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class RadialGradient.
 */
public class RadialGradient extends GradientBase implements IFill {

    /**
     * Instantiates a new radial gradient.
     */
    protected RadialGradient(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the radial gradient
     */
    public RadialGradient() {
        jsObj = Bridge.createObject("mx.graphics.RadialGradient");
    }

    /**
     * Gets the focal point ratio.
     * 
     * @return the focal point ratio
     */
    public native double getFocalPointRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfocalPointRatio();
    }-*/;

    /**
     * Sets the focal point ratio.
     * 
     * @param value the new focal point ratio
     */
    public native void setFocalPointRatio(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfocalPointRatio(value);
    }-*/;

    /**
     * Gets the scale x.
     * 
     * @return the scale x
     */
    public native double getScaleX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleX();
    }-*/;

    /**
     * Sets the scale x.
     * 
     * @param value the new scale x
     */
    public native void setScaleX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleX(value);
    }-*/;

    /**
     * Gets the scale y.
     * 
     * @return the scale y
     */
    public native double getScaleY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleY();
    }-*/;

    /**
     * Sets the scale y.
     * 
     * @param value the new scale y
     */
    public native void setScaleY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleY(value);
    }-*/;

    /**
     * Begin.
     * 
     * @param target the target
     * @param targetBounds the target bounds
     * @param targetOrigin the target origin
     */
    public native void begin(Graphics target, Rectangle targetBounds, Point targetOrigin)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.begin(target, targetBounds, targetOrigin);
    }-*/;

    /**
     * End.
     * 
     * @param target the target
     */
    public native void end(Graphics target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.end(target);
    }-*/;

    /**
     * As i fill.
     * 
     * @return the i fill
     */
    public JavaScriptObject asIFill() {
        return jsObj.cast();
    }

}
