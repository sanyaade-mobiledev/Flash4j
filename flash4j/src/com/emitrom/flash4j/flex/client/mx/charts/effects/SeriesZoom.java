/************************************************************************
  SeriesZoom.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SeriesZoom.
 */
public class SeriesZoom extends SeriesEffect {

    /**
     * Instantiates a new series zoom.
     */
    protected SeriesZoom(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the series zoom
     */
    public SeriesZoom() {
        jsObj = Bridge.createObject("mx.charts.effects.SeriesZoom");
        setTarget(null);
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the series zoom
     */
    public SeriesZoom(ProxyObject target) {
        super(target);
    }

    /**
     * Gets the horizontal focus.
     * 
     * @return the horizontal focus
     */
    public native String getHorizontalFocus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalFocus();
    }-*/;

    /**
     * Sets the horizontal focus.
     * 
     * @param value the new horizontal focus
     */
    public native void setHorizontalFocus(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalFocus(value);
    }-*/;

    /**
     * Gets the vertical focus.
     * 
     * @return the vertical focus
     */
    public native String getVerticalFocus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalFocus();
    }-*/;

    /**
     * Sets the vertical focus.
     * 
     * @param value the new vertical focus
     */
    public native void setVerticalFocus(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalFocus(value);
    }-*/;

    /**
     * Gets the relative to.
     * 
     * @return the relative to
     */
    public native String getRelativeTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrelativeTo();
    }-*/;

    /**
     * Sets the relative to.
     * 
     * @param value the new relative to
     */
    public native void setRelativeTo(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrelativeTo(value);
    }-*/;

}
