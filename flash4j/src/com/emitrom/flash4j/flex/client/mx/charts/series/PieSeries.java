/************************************************************************
  PieSeries.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.series;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis;
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.Series;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * The Class PieSeries.
 */
public class PieSeries extends Series {

    /**
     * Instantiates a new pie series.
     */
    protected PieSeries(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the pie series
     */
    public PieSeries() {
        jsObj = Bridge.createObject("mx.charts.series.PieSeries");
    }

    /**
     * Sets the angular axis.
     * 
     * @param value the new angular axis
     */
    public native void setAngularAxis(IAxis value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setangularAxis(value.@com.emitrom.flash4j.flex.client.mx.charts.chartClasses.IAxis::asIAxis()());
    }-*/;

    /**
     * Gets the exploded radius.
     * 
     * @return the exploded radius
     */
    public native double getExplodedRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplodedRadius();
    }-*/;

    /**
     * Sets the exploded radius.
     * 
     * @param value the new exploded radius
     */
    public native void setExplodedRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexplodedRadius(value);
    }-*/;

    /**
     * Gets the field.
     * 
     * @return the field
     */
    public native String getField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfield();
    }-*/;

    /**
     * Sets the field.
     * 
     * @param value the new field
     */
    public native void setField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfield(value);
    }-*/;

    /**
     * Gets the label field.
     * 
     * @return the label field
     */
    public native String getLabelField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelField();
    }-*/;

    /**
     * Sets the label field.
     * 
     * @param value the new label field
     */
    public native void setLabelField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelField(value);
    }-*/;

    /**
     * Gets the max label radius.
     * 
     * @return the max label radius
     */
    public native double getMaxLabelRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxLabelRadius();
    }-*/;

    /**
     * Sets the max label radius.
     * 
     * @param value the new max label radius
     */
    public native void setMaxLabelRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxLabelRadius(value);
    }-*/;

    /**
     * Gets the name field.
     * 
     * @return the name field
     */
    public native String getNameField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnameField();
    }-*/;

    /**
     * Sets the name field.
     * 
     * @param value the new name field
     */
    public native void setNameField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnameField(value);
    }-*/;

    /**
     * Gets the outer radius.
     * 
     * @return the outer radius
     */
    public native double getOuterRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getouterRadius();
    }-*/;

    /**
     * Sets the outer radius.
     * 
     * @param value the new outer radius
     */
    public native void setOuterRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setouterRadius(value);
    }-*/;

    /**
     * Gets the per wedge explode radius.
     * 
     * @return the per wedge explode radius
     */
    public native JsArrayNumber getPerWedgeExplodeRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getperWedgeExplodeRadius();
    }-*/;

    /**
     * Sets the per wedge explode radius.
     * 
     * @param values the new per wedge explode radius
     */
    public native void setPerWedgeExplodeRadius(JsArrayNumber values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setperWedgeExplodeRadius(values);
    }-*/;

    /**
     * Gets the reserve explode radius.
     * 
     * @return the reserve explode radius
     */
    public native double getReserveExplodeRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getreserveExplodeRadius();
    }-*/;

    /**
     * Sets the reserve explode radius.
     * 
     * @param value the new reserve explode radius
     */
    public native void setReserveExplodeRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setreserveExplodeRadius(value);
    }-*/;

    /**
     * Gets the start angle.
     * 
     * @return the start angle
     */
    public native double getStartAngle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartAngle();
    }-*/;

    /**
     * Sets the start angle.
     * 
     * @param value the new start angle
     */
    public native void setStartAngle(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartAngle(value);
    }-*/;

}
