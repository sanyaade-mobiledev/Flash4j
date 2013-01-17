/************************************************************************
  ChartBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.charts.ChartItem;
import com.emitrom.flash4j.flex.client.mx.charts.Legend;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.mx.events.DragEvent;
import com.emitrom.flash4j.flex.client.mx.events.DragStartEvent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The Class ChartBase.
 */
public class ChartBase extends UIComponent {

    private List<Series> series = new ArrayList<Series>();

    /**
     * Instantiates a new chart base.
     */
    protected ChartBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the chart base
     */
    public ChartBase() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.ChartBase");
    }

    /**
     * Sets the annotation elements.
     * 
     * @param values the new annotation elements
     */
    public void setAnnotationElements(List<ChartElement> values) {
        ArrayCollection collection = DataConverter.fromList(values);
        setAnntationElements(collection);
    }

    /**
     * Sets the anntation elements.
     * 
     * @param collection the new anntation elements
     */
    private void setAnntationElements(ArrayCollection collection) {
        _setAnnotationsElements(collection.toArray().getJsObj());
    }

    /**
     * Sets the annotations elements.
     * 
     * @param values the new annotations elements
     */
    private native void _setAnnotationsElements(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setannotationsElements(values);
    }-*/;

    /**
     * Sets the background elements.
     * 
     * @param values the new background elements
     */
    public void setBackgroundElements(List<ChartElement> values) {
        setBackgroundElements(DataConverter.fromList(values));
    }

    /**
     * Sets the background elements.
     * 
     * @param collection the new background elements
     */
    private void setBackgroundElements(ArrayCollection collection) {
        _setBackgroundElements(collection.toArray().getJsObj());
    }

    /**
     * Sets the background elements.
     * 
     * @param elements the new background elements
     */
    private native void _setBackgroundElements(JavaScriptObject elements)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbackgroundElements(elements);
    }-*/;

    /**
     * Gets the chart state.
     * 
     * @return the chart state
     */
    public native int getChartState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getchartState();
    }-*/;

    /**
     * Sets the clip content.
     * 
     * @param value the new clip content
     */
    public native void setClipContent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setclipContent(value);
    }-*/;

    /**
     * Clip content.
     * 
     * @return true, if successful
     */
    public native boolean clipContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getclipContent();
    }-*/;

    /**
     * Sets the data provider.
     * 
     * @param value the new data provider
     */

    public void setDataProvider(ArrayCollection value) {
        setDataProvider(value.toArray().getJsObj());
    }

    public native void setDataProvider(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Sets the data tip mode.
     * 
     * @param value the new data tip mode
     */
    public native void setDataTipMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataTipMode(value);
    }-*/;

    /**
     * Gets the data tip mode.
     * 
     * @return the data tip mode
     */
    public native String getDataTipMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataTipMode();
    }-*/;

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public native void setDescription(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdescription(value);
    }-*/;

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public native String getDescription()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdescription();
    }-*/;

    /**
     * Sets the drag enabled.
     * 
     * @param value the new drag enabled
     */
    public native void setDragEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdragEnabled(value);
    }-*/;

    /**
     * Checks if is drag enabled.
     * 
     * @return true, if is drag enabled
     */
    public native boolean isDragEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdragEnabled();
    }-*/;

    /**
     * Sets the drag move enabled.
     * 
     * @param value the new drag move enabled
     */
    public native void setDragMoveEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdragMoveEnabled(value);
    }-*/;

    /**
     * Checks if is drag move enabled.
     * 
     * @return true, if is drag move enabled
     */
    public native boolean isDragMoveEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdragMoveEnabled();
    }-*/;

    /**
     * Sets the drop enabled.
     * 
     * @param value the new drop enabled
     */
    public native void setDropEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdropEnabled(value);
    }-*/;

    /**
     * Checks if is drop enabled.
     * 
     * @return true, if is drop enabled
     */
    public native boolean isDropEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdropEnabled()
    }-*/;

    /**
     * Sets the legend data.
     * 
     * @param value the new legend data
     */
    public void setLegendData(List<Legend> value) {
        setLegendData(DataConverter.fromList(value));
    }

    /**
     * Sets the legend data.
     * 
     * @param collection the new legend data
     */
    private void setLegendData(ArrayCollection collection) {
        _setLegendData(collection.toArray().getJsObj());
    }

    /**
     * Sets the legend data.
     * 
     * @param data the new legend data
     */
    private native void _setLegendData(JavaScriptObject data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlegendData(data);
    }-*/;

    /**
     * Gets the legend data.
     * 
     * @return the legend data
     */
    public List<Legend> getLegendData() {
        List<Legend> toReturn = new ArrayList<Legend>();
        JavaScriptObject peers = _getLegendData();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(Legend.from(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getLegendData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlegendData();
    }-*/;

    /**
     * Sets the mouse sensititivity.
     * 
     * @param value the new mouse sensititivity
     */
    public native void setMouseSensititivity(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmouseSencitivity(value);
    }-*/;

    /**
     * Gets the mouse sinsitivity.
     * 
     * @return the mouse sinsitivity
     */
    public native int getMouseSinsitivity()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmouseSensitivitiy();
    }-*/;

    /**
     * Gets the selected chart item.
     * 
     * @return the selected chart item
     */
    public native ChartItem getSelectedChartItem()/*-{
		return peer.getselectedChartItem();
    }-*/;

    /**
     * Sets the selection mode.
     * 
     * @param value the new selection mode
     */
    public native void setSelectionMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectionMode(value);
    }-*/;

    /**
     * Gets the selection mode.
     * 
     * @return the selection mode
     */
    public native String getSelectionMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectionMode();
    }-*/;

    public List<Series> getSeriesElement() {
        return this.series;
    }

    public void addSeries(Series series) {
        this.series.add(series);
        this.setSeries(this.series);
    }

    public void setSeries(Series... series) {
        this.setSeries(Arrays.asList(series));
    }

    /**
     * Sets the series.
     * 
     * @param values the new series
     */
    public void setSeries(List<Series> values) {
        series = values;
        ArrayCollection collection = DataConverter.fromList(series);
        setSeries(collection);
    }

    /**
     * Sets the series.
     * 
     * @param collection the new series
     */
    public void setSeries(ArrayCollection collection) {
        _setSeries(collection.toArray().getJsObj());
    }

    /**
     * Sets the series.
     * 
     * @param value the new series
     */
    private native void _setSeries(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setseries(value);
    }-*/;

    /**
     * Gets the series.
     * 
     * @param <T> the generic type
     * @return the series
     */
    public List<Series> getSeries() {
        return this.series;
    }

    private native JavaScriptObject _getSeries()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getseries();
    }-*/;

    /**
     * Sets the series filters.
     * 
     * @param values the new series filters
     */
    public void setSeriesFilters(List<? extends ProxyObject> values) {
        setSeriesFilters(DataConverter.fromList(values));
    }

    /**
     * Sets the series filters.
     * 
     * @param collection the new series filters
     */
    private void setSeriesFilters(ArrayCollection collection) {
        _setSeriesFilters(collection.toArray().getJsObj());
    }

    /**
     * Sets the series filters.
     * 
     * @param value the new series filters
     */
    private native void _setSeriesFilters(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setseriesFilters(value);
    }-*/;

    /**
     * Gets the series filters.
     * 
     * @return the series filters
     */
    public native JsArray<JavaScriptObject> getSeriesFilters()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getseriesFilters();
    }-*/;

    /**
     * Sets the show all data tips.
     * 
     * @param value the new show all data tips
     */
    public native void setShowAllDataTips(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowAllDataTips(value);
    }-*/;

    /**
     * Show all data tips.
     * 
     * @return true, if successful
     */
    public native boolean showAllDataTips()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowAllDataTips();
    }-*/;

    /**
     * Sets the show data tips.
     * 
     * @param value the new show data tips
     */
    public native void setShowDataTips(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowDataTips(value);
    }-*/;

    /**
     * Show data tips.
     * 
     * @return true, if successful
     */
    public native boolean showDataTips()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowDataTips();
    }-*/;

    /**
     * Clear selection.
     */
    public native void clearSelection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.clearSelection();
    }-*/;

    /**
     * Drag strart handler.
     * 
     * @param event the event
     */
    public native void dragStrartHandler(DragStartEvent event)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.dragStartHandler(event.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the all data points.
     * 
     * @return the all data points
     */
    public native JavaScriptObject getAllDataPoints()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getAllDataPoints();
    }-*/;

    /**
     * Gets the first item.
     * 
     * @param direction the direction
     * @return the first item
     */
    public native ChartItem getFirstItem(String direction)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getFirstItem(direction);
		return @com.emitrom.flash4j.flex.client.mx.charts.ChartItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the items in region.
     * 
     * @param region the region
     * @return the items in region
     */
    public List<ChartItem> getItemsInRegion(Rectangle region) {
        List<ChartItem> toReturn = new ArrayList<ChartItem>();
        JavaScriptObject peers = _getItemsInRegion(region);
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(ChartItem.from(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getItemsInRegion(Rectangle region)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getItemsInRegion(region.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the last item.
     * 
     * @param direction the direction
     * @return the last item
     */
    public native ChartItem getLastItem(String direction)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getLastItem(direction);
		return @com.emitrom.flash4j.flex.client.mx.charts.ChartItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the next item.
     * 
     * @param direction the direction
     * @return the next item
     */
    public native ChartItem getNextItem(String direction)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getNextItem(direction);
		return @com.emitrom.flash4j.flex.client.mx.charts.ChartItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the previous item.
     * 
     * @param direction the direction
     * @return the previous item
     */
    public native ChartItem getPreviousItem(String direction)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getPreviousItem(direction);
		return @com.emitrom.flash4j.flex.client.mx.charts.ChartItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Hide date.
     */
    public native void hideDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.hideData();
    }-*/;

    /**
     * Hide drop feedback.
     * 
     * @param event the event
     */
    public native void hideDropFeedback(DragEvent event)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.hideDropFeedback(event.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Invalidate series styles.
     */
    public native void invalidateSeriesStyles()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidateSeriesStyles();
    }-*/;

    /**
     * Legend data changed.
     */
    public native void legendDataChanged()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.legendDataChanged();
    }-*/;

    /**
     * Show drop feedback.
     * 
     * @param event the event
     */
    public native void showDropFeedback(DragEvent event)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.showDropFeedback(event.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Updata all data tips.
     */
    public native void updataAllDataTips()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.updataAllDataTips();
    }-*/;

}
