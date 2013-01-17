/************************************************************************
  Area.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls.imageMapClasses;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Area.
 */
public class Area extends ProxyObject {

    /**
     * Instantiates a new area.
     */
    protected Area(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the area
     */
    public Area() {
        jsObj = Bridge.createObject("flexlib.controls.area");
    }

    /**
     * Gets the alt.
     * 
     * @return the alt
     */
    public native String getAlt()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalt();
    }-*/;

    /**
     * Sets the alt.
     * 
     * @param value
     *            the new alt
     */
    public native void setAlt(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalt(value);
    }-*/;

    /**
     * Gets the shape.
     * 
     * @return the shape
     */
    public native String getShape()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshape();
    }-*/;

    /**
     * Sets the shape.
     * 
     * @param value
     *            the new shape
     */
    public native void setShape(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshape(value);
    }-*/;

    /**
     * Gets the coords.
     * 
     * @return the coords
     */
    public native String getCoords()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcoords();
    }-*/;

    /**
     * Sets the coords.
     * 
     * @param value
     *            the new coords
     */
    public native void setCoords(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcoords(value);
    }-*/;

    /**
     * Gets the href.
     * 
     * @return the href
     */
    public native String getHref()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethref();
    }-*/;

    /**
     * Sets the href.
     * 
     * @param value
     *            the new href
     */
    public native void setHref(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethref(value);
    }-*/;

    /**
     * Gets the target.
     * 
     * @return the target
     */
    public native String getTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettarget();
    }-*/;

    /**
     * Sets the target.
     * 
     * @param value
     *            the new target
     */
    public native void setTarget(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settarget(value);
    }-*/;

}
