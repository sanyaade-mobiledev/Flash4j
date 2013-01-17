/************************************************************************
  LinearGradient.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class LinearGradient.
 */
public class LinearGradient extends GradientBase implements IFill {

    /**
     * Instantiates a new linear gradient.
     */
    protected LinearGradient(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the linear gradient
     */
    public LinearGradient() {
        jsObj = Bridge.createObject("mx.graphics.LinearGradient");
    }

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
     * Begin.
     * 
     * @param target the target
     * @param targetBounds the target bounds
     * @param targetOrigin the target origin
     */
    public native void begin(Graphics target, Rectangle targetBounds, Point targetOrigin)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.begin(
						target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						targetBounds.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						targetOrigin.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * End.
     * 
     * @param target the target
     */
    public native void end(Graphics target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.end(target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * As i fill.
     * 
     * @return the i fill
     */
    public JavaScriptObject asIFill() {
        return this.jsObj.cast();
    }
}
