/************************************************************************
  Zoom.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class Zoom.
 */
public class Zoom extends TweenEffect {

    /**
     * Instantiates a new zoom.
     */
    protected Zoom(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the zoom
     */
    public Zoom() {
        jsObj = Bridge.createObject("mx.effects.Zoom");
    }

    /**
     * New instance.
     * 
     * @param target the value
     * @return the zoom
     */
    public Zoom(Object target) {
        setTarget(target);
    }

    /**
     * Capture roll events.
     * 
     * @return true, if successful
     */
    public native boolean captureRollEvents()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcaptureRollEvents();
    }-*/;

    /**
     * Sets the capture roll events.
     * 
     * @param value the new capture roll events
     */
    public native void setCaptureRollEvents(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcaptureRollEvents(value);
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

    /**
     * Gets the zoom height from.
     * 
     * @return the zoom height from
     */
    public native double getZoomHeightFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getzoomHeightFrom();
    }-*/;

    /**
     * Sets the zoom height from.
     * 
     * @param value the new zoom height from
     */
    public native void setZoomHeightFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setzoomHeightFrom(value);
    }-*/;

    /**
     * Gets the zoom height to.
     * 
     * @return the zoom height to
     */
    public native double getZoomHeightTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getzoomHeightTo();
    }-*/;

    /**
     * Sets the zoom height to.
     * 
     * @param value the new zoom height to
     */
    public native void setZoomHeightTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setzoomHeightTo(value);
    }-*/;

    /**
     * Gets the zoom width from.
     * 
     * @return the zoom width from
     */
    public native double getZoomWidthFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getzoomWidthFrom();
    }-*/;

    /**
     * Sets the zoom width from.
     * 
     * @param value the new zoom width from
     */
    public native void setZoomWidthFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setzoomWidthFrom(value);
    }-*/;

    /**
     * Gets the zoom width to.
     * 
     * @return the zoom width to
     */
    public native double getZoomWidthTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getzoomWidthTo();
    }-*/;

    /**
     * Sets the zoom width to.
     * 
     * @param value the new zoom width to
     */
    public native void setZoomWidthTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setzoomWidthTo(value);
    }-*/;
}
