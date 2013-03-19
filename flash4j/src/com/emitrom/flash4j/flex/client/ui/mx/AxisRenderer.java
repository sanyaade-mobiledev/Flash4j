/************************************************************************
  AxisRenderer.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * The Class AxisRenderer.
 */
public class AxisRenderer extends ProxyObject {

    /**
     * Instantiates a new axis renderer.
     */
    protected AxisRenderer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Sets the axis.
     * 
     * @param value the new axis
     */
    public native void setAxis(IAxis value)/*-{
		var peer = peer.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setaxis(value.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

    /**
     * Gets the gutters.
     * 
     * @return the gutters
     */
    public native Rectangle getGutters()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getgutters();
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the gutters.
     * 
     * @param value the new gutters
     */
    public native void setGutters(Rectangle value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setgutters(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the highlight limit.
     * 
     * @return the highlight limit
     */
    public native double getHighlightLimit()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethighlightLimit();
    }-*/;

    /**
     * Sets the highligh limit.
     * 
     * @param value the new highligh limit
     */
    public native void setHighlighLimit(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethighlighLimit(value);
    }-*/;

    /**
     * Highlight elements.
     * 
     * @return true, if successful
     */
    public native boolean highlightElements()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethighlightElements();
    }-*/;

    /**
     * Sets the highlight elements.
     * 
     * @param value the new highlight elements
     */
    public native void setHighlightElements(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethighlightElements(value);
    }-*/;

    /**
     * Checks if is horiziontal.
     * 
     * @return true, if is horiziontal
     */
    public native boolean isHoriziontal()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethoriziontal();
    }-*/;

    /**
     * Sets the horizontal.
     * 
     * @param value the new horizontal
     */
    public native void setHorizontal(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontal(value);
    }-*/;

    /**
     * Gets the length.
     * 
     * @return the length
     */
    public native double getLength()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * Gets the minor ticks.
     * 
     * @return the minor ticks
     */
    public native JsArrayNumber getMinorTicks()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminorTicks();
    }-*/;

    /**
     * Gets the placement.
     * 
     * @return the placement
     */
    public native String getPlacement()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getplacement();
    }-*/;

    /**
     * Sets the placement.
     * 
     * @param value the new placement
     */
    public native void setPlacement(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setplacement(value);
    }-*/;

    /**
     * Gets the ticks.
     * 
     * @return the ticks
     */
    public native JsArrayNumber getTicks()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getticks();
    }-*/;

}
