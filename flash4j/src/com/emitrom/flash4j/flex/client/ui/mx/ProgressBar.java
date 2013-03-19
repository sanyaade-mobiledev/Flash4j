/************************************************************************
  ProgressBar.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ProgressBar.
 */
public class ProgressBar extends UIComponent {

    /**
     * Instantiates a new progress bar.
     */
    protected ProgressBar(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the progress bar
     */
    public ProgressBar() {
        jsObj = Bridge.createObject("mx.controls.ProgressBar");
    }

    /**
     * Gets the conversion.
     * 
     * @return the conversion
     */
    public native double getConversion()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getconversion();
    }-*/;

    /**
     * Sets the conversion.
     * 
     * @param value the new conversion
     */
    public native void setConversion(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setconversion(value);
    }-*/;

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public ProgressBarDirection getDirection() {
        return ProgressBarDirection.fromValue(_getDirection());
    }

    /**
     * _get direction.
     * 
     * @return the string
     */
    private native String _getDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdirection();
    }-*/;

    /**
     * Sets the direction.
     * 
     * @param direction the new direction
     */
    public void setDirection(ProgressBarDirection direction) {
        _setDirection(direction.value);
    }

    /**
     * _set direction.
     * 
     * @param value the value
     */
    private native void _setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

    /**
     * Checks if is indeterminate.
     * 
     * @return true, if is indeterminate
     */
    public native boolean isIndeterminate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getindeterminate();
    }-*/;

    /**
     * Sets the indeterninate.
     * 
     * @param value the new indeterninate
     */
    public native void setIndeterninate(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setindeterninate(value);
    }-*/;

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public native String getLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabel();
    }-*/;

    /**
     * Sets the label.
     * 
     * @param value the new label
     */
    public native void setLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabel(value);
    }-*/;

    /**
     * Gets the label placement.
     * 
     * @return the label placement
     */
    public ProgressBarLabelPlacement getLabelPlacement() {
        return ProgressBarLabelPlacement.fromValue(_getLabelPlacement());
    }

    /**
     * _get label placement.
     * 
     * @return the string
     */
    private native String _getLabelPlacement()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelPlacement();
    }-*/;

    /**
     * Sets the label placement.
     * 
     * @param placement the new label placement
     */
    public void setLabelPlacement(ProgressBarLabelPlacement placement) {
        _setLabelPlacement(placement.value);
    }

    /**
     * _set label placement.
     * 
     * @param value the value
     */
    private native void _setLabelPlacement(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelPlacement(value);
    }-*/;

    /**
     * Gets the mimimum.
     * 
     * @return the mimimum
     */
    public native double getMimimum()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmimimum();
    }-*/;

    /**
     * Sets the minimum.
     * 
     * @param value the new minimum
     */
    public native void setMinimum(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminimum(value);
    }-*/;

    /**
     * Gets the maximum.
     * 
     * @return the maximum
     */
    public native double getMaximum()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaximum();
    }-*/;

    /**
     * Sets the maximum.
     * 
     * @param value the new maximum
     */
    public native void setMaximum(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaximum(value);
    }-*/;

    /**
     * Gets the mode.
     * 
     * @return the mode
     */
    public ProgressBarMode getMode() {
        return ProgressBarMode.fromValue(_getMode());
    }

    /**
     * _get mode.
     * 
     * @return the string
     */
    private native String _getMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmode();
    }-*/;

    /**
     * Sets the mode.
     * 
     * @param mode the new mode
     */
    public void setMode(ProgressBarMode mode) {
        _setMode(mode.value);
    }

    /**
     * _set mode.
     * 
     * @param value the value
     */
    private native void _setMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmode(value);
    }-*/;

    /**
     * Gets the percent complete.
     * 
     * @return the percent complete
     */
    public native double getPercentComplete()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpercentComplete();
    }-*/;

    /**
     * Gets the source.
     * 
     * @param <T> the generic type
     * @return the source
     */
    public native <T> T getSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsource();
    }-*/;

    /**
     * Sets the source.
     * 
     * @param value the new source
     */
    public native void setsource(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsource(value);
    }-*/;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public native double getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

    /**
     * Sets the progress.
     * 
     * @param value the value
     * @param total the total
     */
    public native void setProgress(double value, double total)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setProgress(value, total);
    }-*/;
}
