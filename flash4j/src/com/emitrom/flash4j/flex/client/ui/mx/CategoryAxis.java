/************************************************************************
  CategoryAxis.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.AxisBase;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CategoryAxis.
 */
public class CategoryAxis extends AxisBase {

    /**
     * Instantiates a new category axis.
     */
    protected CategoryAxis(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the category axis
     */
    public CategoryAxis() {
        jsObj = Bridge.createObject("mx.charts.CategoryAxis");
    }

    /**
     * New instance.
     * 
     * @return the category axis
     */
    public CategoryAxis(String categoryField) {
        this();
        setCategoryField(categoryField);
    }

    /**
     * Sets the category field.
     * 
     * @param name
     *            the new category field
     */
    public native void setCategoryField(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcategoryField(name);
    }-*/;

    /**
     * Gets the category field.
     * 
     * @return the category field
     */
    public native String getCategoryField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcategoryField();
    }-*/;

    public void setDataProvider(ArrayCollection provider) {
        setDataProvider(provider.getJsObj());
    }

    /**
     * Sets the data provider.
     * 
     * @param value
     *            the new data provider
     */
    public native void setDataProvider(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Gets the padding.
     * 
     * @return the padding
     */
    public native double getPadding()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpadding();
    }-*/;

    /**
     * Sets the padding.
     * 
     * @param value
     *            the new padding
     */
    public native void setPadding(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpadding(value);
    }-*/;

    /**
     * Checks for ticks between labels.
     * 
     * @return true, if successful
     */
    public native boolean hasTicksBetweenLabels()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getticksBetweenLabels();
    }-*/;

    /**
     * Sets the ticks between labels.
     * 
     * @param value
     *            the new ticks between labels
     */
    public native void setTicksBetweenLabels(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setticksBetweenLabels(value);
    }-*/;

    /**
     * Format for screen.
     * 
     * @param value
     *            the value
     * @return the string
     */
    public native String formatForScreen(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatForScreen(value);
    }-*/;

    /**
     * Invert transform.
     * 
     * @param <T>
     *            the generic type
     * @param value
     *            the value
     * @return the t
     */
    public native <T> T invertTransform(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.invertTransform(value);
    }-*/;

    /**
     * Prefer drop labels.
     * 
     * @return true, if successful
     */
    public native boolean preferDropLabels()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.preferDropLabels();
    }-*/;

    /**
     * Update.
     */
    public native void update()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.update();
    }-*/;
}
