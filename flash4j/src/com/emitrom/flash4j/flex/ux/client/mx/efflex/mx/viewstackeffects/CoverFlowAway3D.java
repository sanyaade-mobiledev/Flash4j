/************************************************************************
  CoverFlowAway3D.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.efflex.mx.viewstackeffects;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CoverFlowAway3D.
 */
public class CoverFlowAway3D extends Away3DEffect {

    /** The Constant VERTICAL. */
    public static String VERTICAL = "vertical";

    /** The Constant HORIZONTAL. */
    public static String HORIZONTAL = "horizontal";

    /**
     * Instantiates a new cover flow away3 d.
     */
    protected CoverFlowAway3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the cover flow away3 d
     */
    public CoverFlowAway3D() {
        jsObj = Bridge.createObject("org.efflex.mx.viewStackEffects.CoverFlowAway3D");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the cover flow away3 d
     */
    public CoverFlowAway3D(UIComponent target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the angle.
     * 
     * @return the angle
     */
    public native double getAngle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getangle();
    }-*/;

    /**
     * Sets the angle.
     * 
     * @param value
     *            the new angle
     */
    public native void setAngle(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setangle(value);
    }-*/;

    /**
     * Gets the z offset.
     * 
     * @return the z offset
     */
    public native double getZOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getzOffset();
    }-*/;

    /**
     * Sets the z offset.
     * 
     * @param value
     *            the new z offset
     */
    public native void setZOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setzOffset(value);
    }-*/;

    /**
     * Gets the offset.
     * 
     * @return the offset
     */
    public native double getOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoffset();
    }-*/;

    /**
     * Sets the offset.
     * 
     * @param value
     *            the new offset
     */
    public native void setOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setOffset(value);
    }-*/;

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public native String getDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdirection();
    }-*/;

    /**
     * Sets the direction.
     * 
     * @param value
     *            the new direction
     */
    public native void setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

    /**
     * Gets the num segments width.
     * 
     * @return the num segments width
     */
    public native int getNumSegmentsWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumSegmentsWidth();
    }-*/;

    /**
     * Sets the num segments width.
     * 
     * @param value
     *            the new num segments width
     */
    public native void setNumSegmentsWidth(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnumSegmentsWidth(value);
    }-*/;

    /**
     * Gets the num segments height.
     * 
     * @return the num segments height
     */
    public native int getNumSegmentsHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumSegmentsHeight();
    }-*/;

    /**
     * Sets the num segments height.
     * 
     * @param value
     *            the new num segments height
     */
    public native void setNumSegmentsHeight(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnumSegmentsHeight(value);
    }-*/;

}
