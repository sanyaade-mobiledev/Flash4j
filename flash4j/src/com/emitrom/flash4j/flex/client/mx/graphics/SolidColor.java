/************************************************************************
  SolidColor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SolidColor.
 */
public class SolidColor extends EventDispatcher implements IFill {

    /**
     * Instantiates a new solid color.
     */
    protected SolidColor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the solid color
     */
    public SolidColor() {
        jsObj = Bridge.createObject("mx.graphics.SolidColor");
        setColor(0x000000);
        setAlpha(1.0);
    }

    /**
     * New instance.
     * 
     * @param color the color
     * @return the solid color
     */
    public SolidColor(int color) {
        this();
        setColor(color);
    }

    /**
     * New instance.
     * 
     * @param color the color
     * @param alpha the alpha
     * @return the solid color
     */
    public SolidColor(int color, double alpha) {
        this(color);
        setAlpha(alpha);
    }

    /**
     * Sets the alpha.
     * 
     * @param value the new alpha
     */
    public native void setAlpha(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalpha(value);
    }-*/;

    /**
     * Gets the alpha.
     * 
     * @return the alpha
     */
    public native double getAlpha()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalpha();
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
     * Gets the color.
     * 
     * @return the color
     */
    public native int getColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    /**
     * Begin.
     * 
     * @param target the target
     * @param targetBounds the target bounds
     * @param origin the origin
     */
    public native void begin(Graphics target, Rectangle targetBounds, Point origin)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.begin(
						target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						targetBounds.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						origin.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
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

    @Override
    public JavaScriptObject asIFill() {
        return jsObj.cast();
    }

}
