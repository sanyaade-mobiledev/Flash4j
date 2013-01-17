/************************************************************************
  Slider.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls.sliderClasses;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class Slider.
 */
public class Slider extends UIComponent {

    /**
     * Instantiates a new slider.
     */
    protected Slider(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the slider
     */
    public Slider() {
        jsObj = Bridge.createObject("mx.controls.sliderClasses.Slider");
    }

    /**
     * Allow thumb overlap.
     * 
     * @return true, if successful
     */
    public native boolean allowThumbOverlap()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalllowThumbOverlap();
    }-*/;

    /**
     * Sets the allow thumb overlap.
     * 
     * @param value the new allow thumb overlap
     */
    public native void setAllowThumbOverlap(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowThumbOverlap(value);
    }-*/;

    /**
     * Allow track click.
     * 
     * @return true, if successful
     */
    public native boolean allowTrackClick()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowTrackClick();
    }-*/;

    /**
     * Sets the allow track click.
     * 
     * @param value the new allow track click
     */
    public native void setAllowTrackClick(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowTrackClick(value);
    }-*/;

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public SliderDirection getDirection() {
        return SliderDirection.fromValue(_getDirection());
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
    public void setDirection(SliderDirection direction) {
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
     * Gets the labels.
     * 
     * @return the labels
     */
    public native JsArrayString getLabels()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabels();
    }-*/;

    /**
     * Sets the labels.
     * 
     * @param labels the new labels
     */
    public void setLabels(JsArrayString labels) {
        ArrayCollection c = new ArrayCollection();
        for (int i = 0; i < labels.length(); i++) {
            c.addItem(labels.get(i));
        }
        setLabels(c);
    }

    /**
     * Sets the labels.
     * 
     * @param c the new labels
     */
    private void setLabels(ArrayCollection c) {
        _setLabels(c.toArray().getJsObj());
    }

    /**
     * Sets the labels.
     * 
     * @param values the new labels
     */
    private native void _setLabels(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabels(values);
    }-*/;

    /**
     * Live dragging.
     * 
     * @return true, if successful
     */
    public native boolean isLiveDragging()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getliveDragging();
    }-*/;

    /**
     * Sets the live dragging.
     * 
     * @param value the new live dragging
     */
    public native void setLiveDragging(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setliveDragging(value);
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
     * Gets the minimum.
     * 
     * @return the minimum
     */
    public native double getMinimum()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminimum();
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
     * Show data tip.
     * 
     * @return true, if successful
     */
    public native boolean showDataTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowDataTip();
    }-*/;

    /**
     * Sets the show data tip.
     * 
     * @param value the new show data tip
     */
    public native void setShowDataTip(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowDataTip(value);
    }-*/;

    ;

    /**
     * Sets the slider data tip class.
     * 
     * @param value the new slider data tip class
     */
    public native void setSliderDataTipClass(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsliderDataTipClass(value);
    }-*/;

    /**
     * Sets the slider thumb class.
     * 
     * @param value the new slider thumb class
     */
    public native void setSliderThumbClass(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsliderThumbClass(value);
    }-*/;

    /**
     * Gets the snap interval.
     * 
     * @return the snap interval
     */
    public native double getSnapInterval()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsnapInterval();
    }-*/;

    /**
     * Sets the snap interval.
     * 
     * @param value the new snap interval
     */
    public native void setSnapInterval(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsnapInterval(value);
    }-*/;

    /**
     * Gets the thumb count.
     * 
     * @return the thumb count
     */
    public native int getThumbCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getthumbCount();
    }-*/;

    /**
     * Sets the thumb count.
     * 
     * @param value the new thumb count
     */
    public native void setThumbCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setthumbCount(value);
    }-*/;

    /**
     * Gets the tick interval.
     * 
     * @return the tick interval
     */
    public native double getTickInterval()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettickInterval();
    }-*/;

    /**
     * Sets the tick interval.
     * 
     * @param value the new tick interval
     */
    public native void setTickInterval(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settickInterval(value);
    }-*/;

    /**
     * Gets the tick values.
     * 
     * @return the tick values
     */
    public native JsArrayNumber getTickValues()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettickValues();
    }-*/;

    /**
     * Sets the tick values.
     * 
     * @param values the new tick values
     */
    public native void setTickValues(JsArrayNumber values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settickValues(values);
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
     * Sets the value.
     * 
     * @param v the new value
     */
    public native void setValue(double v)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalue(v);
    }-*/;

    /**
     * Gets the values.
     * 
     * @return the values
     */
    public native As3Array getValues() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getvalues();
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the values.
     * 
     * @param v the new values
     */
    public void setValues(JsArrayNumber v) {
        As3Array array = As3Array.createEmpty();
        for (int i = 0; i < v.length(); i++) {
            array.push(Double.toString(v.get(i)));
        }
        _setValues(array.getJsObj());
    }

    /**
     * _set values.
     * 
     * @param v the v
     */
    private native void _setValues(JavaScriptObject v)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalues(v);
    }-*/;

    /**
     * Sets the thumb value at.
     * 
     * @param index the index
     * @param value the value
     */
    public native void setThumbValueAt(int index, double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setThumbValueAt(index, value);
    }-*/;

    /**
     * Gets the thumb at.
     * 
     * @param index the index
     * @return the thumb at
     */
    public native SliderThumb getThumbAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getThumbAt(index);
		return @com.emitrom.flash4j.flex.client.mx.controls.sliderClasses.SliderThumb::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
