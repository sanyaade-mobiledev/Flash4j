/************************************************************************
  SolidColorStroke.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.display.CapsStyle;
import com.emitrom.flash4j.core.client.display.Graphics;
import com.emitrom.flash4j.core.client.display.GraphicsStroke;
import com.emitrom.flash4j.core.client.display.JointStyle;
import com.emitrom.flash4j.core.client.display.LineScaleMode;
import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SolidColorStroke.
 */
public class SolidColorStroke extends EventDispatcher implements IFill {

    /**
     * Instantiates a new solid color stroke.
     */
    protected SolidColorStroke(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the solid color stroke
     */
    public SolidColorStroke() {
        jsObj = Bridge.createObject("mx.graphics.SolidColorStroke");
        setColor(0x000000);
        setWeight(1);
        setAlpha(1);
        setPixelHinting(false);
        setScaleMode(LineScaleMode.NORMAL);
        setCaps(CapsStyle.ROUND);
        setMiterLimit(3);
    }

    public SolidColorStroke(int color) {
        this();
        setColor(color);
    }

    public SolidColorStroke(int color, int weigth) {
        this(color);
        setWeight(weigth);
    }

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
     * Sets the alpha.
     * 
     * @param value
     *            the new alpha
     */
    public native void setAlpha(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalpha(value);
    }-*/;

    /**
     * Sets the color.
     * 
     * @param value
     *            the new color
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
     * Gets the caps.
     * 
     * @return the caps
     */
    public CapsStyle getCaps() {
        return CapsStyle.fromValue(_getCaps());
    }

    /**
     * _get caps.
     * 
     * @return the string
     */
    private native String _getCaps()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcaps();
    }-*/;

    /**
     * Sets the caps.
     * 
     * @param caps
     *            the new caps
     */
    public void setCaps(CapsStyle caps) {
        _setCaps(caps.value);
    }

    /**
     * _set caps.
     * 
     * @param values
     *            the values
     */
    private native void _setCaps(String values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcaps(values);
    }-*/;

    /**
     * Gets the joints.
     * 
     * @return the joints
     */
    public JointStyle getJoints() {
        return JointStyle.fromValue(_getJoints());
    }

    /**
     * _get joints.
     * 
     * @return the string
     */
    private native String _getJoints()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getjoints();
    }-*/;

    /**
     * Sets the joints.
     * 
     * @param joints
     *            the new joints
     */
    public void setJoints(JointStyle joints) {
        _setJoints(joints.value);
    }

    /**
     * _set joints.
     * 
     * @param value
     *            the value
     */
    private native void _setJoints(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setjoints(value);
    }-*/;

    /**
     * Gets the miter limit.
     * 
     * @return the miter limit
     */
    public native double getMiterLimit()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmiterLimit();
    }-*/;

    /**
     * Sets the miter limit.
     * 
     * @param value
     *            the new miter limit
     */
    public native void setMiterLimit(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmiterLimit(value);
    }-*/;

    /**
     * Pixel hinting.
     * 
     * @return true, if successful
     */
    public native boolean pixelHinting()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpixelHinting();
    }-*/;

    /**
     * Sets the pixel hinting.
     * 
     * @param value
     *            the new pixel hinting
     */
    public native void setPixelHinting(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpixelHinting(value);
    }-*/;

    /**
     * Gets the scale mode.
     * 
     * @return the scale mode
     */
    public LineScaleMode getScaleMode() {
        return LineScaleMode.fromValue(_getScaleMode());
    }

    /**
     * _get scale mode.
     * 
     * @return the string
     */
    private native String _getScaleMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleMode();
    }-*/;

    /**
     * Sets the scale mode.
     * 
     * @param mode
     *            the new scale mode
     */
    public void setScaleMode(LineScaleMode mode) {
        _setScaleMode(mode.value);
    }

    /**
     * _set scale mode.
     * 
     * @param value
     *            the value
     */
    private native void _setScaleMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleMode(value);
    }-*/;

    /**
     * Sets the weight.
     * 
     * @param value
     *            the new weight
     */
    public native void setWeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setweight(value);
    }-*/;

    /**
     * Gets the weight.
     * 
     * @return the weight
     */
    public native double getWeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getweight();
    }-*/;

    /**
     * Apply.
     * 
     * @param graphics
     *            the graphics
     * @param targetBounds
     *            the target bounds
     * @param origin
     *            the origin
     */
    public native void apply(Graphics graphics, Rectangle targetBounds, Point origin)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.apply(
						graphics.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						targetBounds.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						originvar.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Creates the graphcis stroke.
     * 
     * @param targetBounds
     *            the target bounds
     * @param origin
     *            the origin
     * @return the graphics stroke
     */
    public native GraphicsStroke createGraphcisStroke(Rectangle targetBounds, Point origin)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.createGraphcisStroke(
						targetBounds.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						origin.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.display.GraphicsStroke::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    @Override
    public JavaScriptObject asIFill() {
        return jsObj.cast();
    }
}
