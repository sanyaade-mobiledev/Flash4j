/************************************************************************
  BoundedValue.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.chartClasses;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class BoundedValue.
 */
public class BoundedValue extends ProxyObject {

    /**
     * Instantiates a new bounded value.
     */
    protected BoundedValue(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the bounded value
     */
    public BoundedValue() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.BoundedValue");
        setLowerMargin(0);
        setUpperMargin(0);
        setValue(0);
    }

    /**
     * Gets the lower margin.
     * 
     * @return the lower margin
     */
    public final native double getLowerMargin()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlowerMargin();
    }-*/;

    /**
     * Sets the lower margin.
     * 
     * @param value the new lower margin
     */
    public final native void setLowerMargin(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlowerMargin(value);
    }-*/;

    /**
     * Gets the upper margin.
     * 
     * @return the upper margin
     */
    public final native double getUpperMargin()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getupperMargin();
    }-*/;

    /**
     * Sets the upper margin.
     * 
     * @param value the new upper margin
     */
    public final native void setUpperMargin(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setupperMargin(value);
    }-*/;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public final native double getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

    /**
     * Sets the value.
     * 
     * @param newValue the new value
     */
    public final native void setValue(double newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalue(newVvalue);
    }-*/;

}
