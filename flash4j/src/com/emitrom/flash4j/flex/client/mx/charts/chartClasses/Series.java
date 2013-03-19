/************************************************************************
 * Series.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.flex.client.mx.charts.chartClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.ui.mx.ChartItem;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;

/**
 * The Class Series.
 */
public class Series extends ChartElement {

    /**
     * Instantiates a new series.
     */
    protected Series(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the series
     */
    public Series() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.Series");
    }

    /**
     * Gets the data tip items.
     * 
     * @return the data tip items
     */
    /**
     * Gets the items.
     * 
     * @return the items
     */
    public List<ChartItem> getDataTipItems() {
        List<ChartItem> toReturn = new ArrayList<ChartItem>();
        JavaScriptObject peers = _getDataTipItems();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(ChartItem.from(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getDataTipItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataTipItems();
    }-*/;

    /**
     * Sets the data tip items.
     * 
     * @param items
     *            the new data tip items
     */
    public void setDataTipItems(List<ChartItem> items) {
        setDataTipItems(DataConverter.fromList(items));
    }

    /**
     * Sets the data tip items.
     * 
     * @param collection
     *            the new data tip items
     */
    private void setDataTipItems(ArrayCollection collection) {
        _setDataTipItems(collection.toArray().getJsObj());
    }

    /**
     * Sets the data tip items.
     * 
     * @param items
     *            the new data tip items
     */
    private native void _setDataTipItems(JavaScriptObject items)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataTipItems(items);
    }-*/;

    /**
     * Gets the display name.
     * 
     * @return the display name
     */
    public native String getDisplayName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisplayName();
    }-*/;

    /**
     * Sets the display name.
     * 
     * @param value
     *            the new display name
     */
    public native void setDisplayName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisplayName(value);
    }-*/;

    /**
     * Filter data.
     * 
     * @return true, if successful
     */
    public native boolean filterData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfilterData();
    }-*/;

    /**
     * Sets the filter data.
     * 
     * @param value
     *            the new filter data
     */
    public native void setFilterData(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfilterData(value);
    }-*/;

    /**
     * Gets the filter data values.
     * 
     * @return the filter data values
     */
    public native String getFilterDataValues()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfilterDataValues();
    }-*/;

    /**
     * Sets the filter data values.
     * 
     * @param value
     *            the new filter data values
     */
    public native void setFilterDataValues(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfilterDataValues(value);
    }-*/;

    /**
     * Checks if is interactive.
     * 
     * @return true, if is interactive
     */
    public native boolean isInteractive()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinteractive();
    }-*/;

    /**
     * Sets the interactive.
     * 
     * @param value
     *            the new interactive
     */
    public native void setInteractive(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinteractive(value);
    }-*/;

    /**
     * Gets the items.
     * 
     * @return the items
     */
    public List<ChartItem> getItems() {
        List<ChartItem> toReturn = new ArrayList<ChartItem>();
        JavaScriptObject peers = _getItems();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(ChartItem.from(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getitems();
    }-*/;

    /**
     * Checks if is selectable.
     * 
     * @return true, if is selectable
     */
    public native boolean isSelectable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectable();
    }-*/;

    /**
     * Sets the selectable.
     * 
     * @param value
     *            the new selectable
     */
    public native void setSelectable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectable(value);
    }-*/;

    /**
     * Gets the selected index.
     * 
     * @return the selected index
     */
    public native int getSelectedIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedIndex();
    }-*/;

    /**
     * Sets the selected index.
     * 
     * @param value
     *            the new selected index
     */
    public native void setSelectedIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedIndex(value);
    }-*/;

    /**
     * Gets the selected indices.
     * 
     * @return the selected indices
     */
    public native JsArrayInteger getSelectedIndices()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedIndices();
    }-*/;

    /**
     * Sets the selected indices.
     * 
     * @param values
     *            the new selected indices
     */
    public native void setSelectedIndices(JsArrayInteger values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedIndices(values);
    }-*/;

    /**
     * Gets the selected items.
     * 
     * @return the selected items
     */

    public List<ChartItem> getSelectedItems() {
        List<ChartItem> toReturn = new ArrayList<ChartItem>();
        JavaScriptObject peers = _getSelectedItems();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(ChartItem.from(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getSelectedItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedItems();
    }-*/;

    /**
     * Sets the selected items.
     * 
     * @param items
     *            the new selected items
     */

    public void setSelectedItems(ChartItem... items) {
        setSelectedItems(Arrays.asList(items));
    }

    public void setSelectedItems(List<ChartItem> items) {
        _setSelectedItems(DataConverter.fromList(items).toArray().getJsObj());
    }

    private native void _setSelectedItems(JavaScriptObject items)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedItems(items);
    }-*/;

    /**
     * Gets the selected item.
     * 
     * @return the selected item
     */
    public native ChartItem getSelectedItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedItem();
		return @com.emitrom.flash4j.flex.client.ui.mx.ChartItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the selected item.
     * 
     * @param value
     *            the new selected item
     */
    public native void setSelectedItem(ChartItem value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setselectedItem(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the transition render data.
     * 
     * @param <T>
     *            the generic type
     * @return the transition render data
     */
    public native <T> T getTransitionRenderData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettransitionRenderData();
    }-*/;

    /**
     * Sets the transition render data.
     * 
     * @param value
     *            the new transition render data
     */
    public native void setTransitionRenderData(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settransitionRenderData(value);
    }-*/;

}
