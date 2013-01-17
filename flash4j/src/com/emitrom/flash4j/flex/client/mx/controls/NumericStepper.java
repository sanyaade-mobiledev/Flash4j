/************************************************************************
  NumericStepper.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.controls.listClasses.BaseListData;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class NumericStepper.
 */
public class NumericStepper extends UIComponent {

    /**
     * Instantiates a new numeric stepper.
     */
    protected NumericStepper(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the numeric stepper
     */
    public NumericStepper() {
        jsObj = Bridge.createObject("mx.controls.NumericStepper");
    }

    /**
     * Gets the data.
     * 
     * @param <T> the generic type
     * @return the data
     */
    public native <T> T getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value the new data
     */
    public native void setData(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    /**
     * Enable ime.
     * 
     * @return true, if successful
     */
    public native boolean enableIME()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getenableIME();
    }-*/;

    /**
     * Gets the ime mode.
     * 
     * @return the ime mode
     */
    public native String getImeMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getimeMode();
    }-*/;

    /**
     * Sets the ime mode.
     * 
     * @param value the new ime mode
     */
    public native void setImeMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setimeMode(value);
    }-*/;

    /**
     * Gets the list data.
     * 
     * @return the list data
     */
    public native BaseListData getListData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getlistData();
		return @com.emitrom.flash4j.flex.client.mx.controls.listClasses.BaseListData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the list data.
     * 
     * @param value the new list data
     */
    public native void setListData(BaseListData value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setlistData(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the max chars.
     * 
     * @return the max chars
     */
    public native int getMaxChars()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxChars();
    }-*/;

    /**
     * Sets the max chars.
     * 
     * @param value the new max chars
     */
    public native void setMaxChars(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxChars(value);
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
     * Gets the maximun.
     * 
     * @return the maximun
     */
    public native double getMaximun()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaximun();
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
     * Gets the next value.
     * 
     * @return the next value
     */
    public native double getNextValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnextValue();
    }-*/;

    /**
     * Gets the previous value.
     * 
     * @return the previous value
     */
    public native double getPreviousValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpreviousValue();
    }-*/;

    /**
     * Gets the step size.
     * 
     * @return the step size
     */
    public native double getStepSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstepSize();
    }-*/;

    /**
     * Sets the step size.
     * 
     * @param value the new step size
     */
    public native void setStepSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstepSize(value);
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

}
