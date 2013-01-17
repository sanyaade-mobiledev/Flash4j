/************************************************************************
 * ListBase.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.mx.controls.listClasses;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.flex.client.core.data.HierarchicalCollectionItem;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.ScrollControlBase;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.event.dom.client.DragEvent;

/**
 * The Class ListBase.
 */
public class ListBase extends ScrollControlBase {

    /**
     * Instantiates a new list base.
     */
    ListBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the list base
     */
    public ListBase() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Allow drag selection.
     * 
     * @return true, if successful
     */
    public native boolean allowDragSelection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowDragSelection();
    }-*/;

    /**
     * Sets the allow drag selection.
     * 
     * @param value
     *            the new allow drag selection
     */
    public native void setAllowDragSelection(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowDragSelection(value);
    }-*/;

    /**
     * Gets the column count.
     * 
     * @return the column count
     */
    public native int getColumnCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolumnCount();
    }-*/;

    /**
     * Sets the column count.
     * 
     * @param value
     *            the new column count
     */
    public native void setColumnCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolumnCount(value);
    }-*/;

    /**
     * Gets the column width.
     * 
     * @return the column width
     */
    public native double getColumnWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolumnWidth();
    }-*/;

    /**
     * Sets the column width.
     * 
     * @param value
     *            the new column width
     */
    public native void setColumnWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolumnWidth(value);
    }-*/;

    /**
     * Gets the data.
     * 
     * @param <T>
     *            the generic type
     * @return the data
     */
    public native <T> T getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value
     *            the new data
     */
    public native void setData(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    /**
     * Sets the data provider.
     * 
     * @param collection
     *            the new data provider
     */
    public void setDataProvider(ArrayCollection collection) {
        _setDataProvider(collection.toArray().getJsObj());
    }

    /**
     * Sets the data provider.
     * 
     * @param value
     *            the new data provider
     */
    private native void _setDataProvider(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Gets the data provider.
     * 
     * @param <T>
     *            the generic type
     * @return the data provider
     */
    public native <T extends JavaScriptObject> T getDataProvider() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataProvider();
    }-*/;

    /**
     * Gets the data tip field.
     * 
     * @return the data tip field
     */
    public native String getDataTipField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataTipField();
    }-*/;

    /**
     * Sets the data field.
     * 
     * @param value
     *            the new data field
     */
    public native void setDataField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataField(value);
    }-*/;

    /**
     * Drag enabled.
     * 
     * @return true, if successful
     */
    public native boolean dragEnabled() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdragEnabled();
    }-*/;

    /**
     * Sets the drag enabled.
     * 
     * @param value
     *            the new drag enabled
     */
    public native void setDragEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdragEnabled(value);
    }-*/;

    /**
     * Drag moved enabled.
     * 
     * @return true, if successful
     */
    public native boolean dragMovedEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdragMovedEnabled();
    }-*/;

    /**
     * Sets the drag move enabled.
     * 
     * @param value
     *            the new drag move enabled
     */
    public native void setDragMoveEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdragMoveEnabled(value);
    }-*/;

    /**
     * Drop enabled.
     * 
     * @return true, if successful
     */
    public native boolean dropEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdropEnabled();
    }-*/;

    /**
     * Sets the drop enabled.
     * 
     * @param value
     *            the new drop enabled
     */
    public native void setDropEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdropEnabled(value);
    }-*/;

    /**
     * Gets the icon field.
     * 
     * @return the icon field
     */
    public native String getIconField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geticonField();
    }-*/;

    /**
     * Sets the icon field.
     * 
     * @param value
     *            the new icon field
     */
    public native void setIconField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seticonField(value);
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
     * @param value
     *            the new label field
     */
    public native void setLabelField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelField(value);
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
     * @param value
     *            the new list data
     */
    public native void setListData(BaseListData value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setlistData(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Checks for menu selection mode.
     * 
     * @return true, if successful
     */
    public native boolean hasMenuSelectionMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmenuSelectionMode();
    }-*/;

    /**
     * Sets the menu selection mode.
     * 
     * @param value
     *            the new menu selection mode
     */
    public native void setMenuSelectionMode(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmenuSelectionMode(value);
    }-*/;

    /**
     * Gets the offscreen extra rows or columns.
     * 
     * @return the offscreen extra rows or columns
     */
    public native int getOffscreenExtraRowsOrColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoffscreenExtraRowsOrColumns();
    }-*/;

    /**
     * Sets the offscreeb extra rows or columns.
     * 
     * @param value
     *            the new offscreeb extra rows or columns
     */
    public native void setOffscreebExtraRowsOrColumns(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setoffscreebExtraRowsOrColumns(value);
    }-*/;

    /**
     * Gets the row count.
     * 
     * @return the row count
     */
    public native int getRowCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrowCount();
    }-*/;

    /**
     * Sets the row count.
     * 
     * @param value
     *            the new row count
     */
    public native void setRowCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrowCount(value);
    }-*/;

    /**
     * Gets the row height.
     * 
     * @return the row height
     */
    public native double getRowHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrowHeight();
    }-*/;

    /**
     * Sets the row height.
     * 
     * @param value
     *            the new row height
     */
    public native void setRowHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrowHeight(value);
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
     * Gets the selected item.
     * 
     * @param <T>
     *            the generic type
     * @return the selected item
     */
    public native <T extends HierarchicalCollectionItem> T getSelectedItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedItem();
		return @com.emitrom.flash4j.flex.client.core.data.HierarchicalCollectionItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the selected item.
     * 
     * @param value
     *            the new selected item
     */
    public native void setSelectedItem(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedItem(value);
    }-*/;

    /**
     * Gets the selected items.
     * 
     * @return the selected items
     */
    public native JsArray<JavaScriptObject> getSelectedItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedItems();
    }-*/;

    /**
     * Sets the selected items.
     * 
     * @param values
     *            the new selected items
     */
    public native void setSelectedItems(JsArray<JavaScriptObject> values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedItems(values);
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
     * Sets the show data tips.
     * 
     * @param value
     *            the new show data tips
     */
    public native void setShowDataTips(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowDataTips(value);
    }-*/;

    /**
     * Gets the value.
     * 
     * @param <T>
     *            the generic type
     * @return the value
     */
    public native <T> T getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

    /**
     * Checks for variable row height.
     * 
     * @return true, if successful
     */
    public native boolean hasVariableRowHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvariableRowHeight();
    }-*/;

    /**
     * Sets the variable row height.
     * 
     * @param value
     *            the new variable row height
     */
    public native void setVariableRowHeight(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvariableRowHeight(value);
    }-*/;

    /**
     * Word wdrap.
     * 
     * @return true, if successful
     */
    public native boolean wordWdrap()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwordWdrap();
    }-*/;

    /**
     * Sets the word wrap.
     * 
     * @param value
     *            the new word wrap
     */
    public native void setWordWrap(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwordWrap(value);
    }-*/;

    /**
     * Adds the data effect item.
     * 
     * @param item
     *            the item
     */
    public native void addDataEffectItem(Object item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addDataEffectItem(item);
    }-*/;

    /**
     * Calculate drop index.
     * 
     * @return the int
     */
    public native int calculateDropIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.calculateDropIndex();
    }-*/;

    /**
     * Calculate drop index.
     * 
     * @param event
     *            the event
     * @return the int
     */
    public native int calculateDropIndex(DragEvent event)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.calculateDropIndex(event);
    }-*/;

    /**
     * Find string.
     * 
     * @param str
     *            the str
     * @return true, if successful
     */
    public native boolean findString(String str)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.findString(str);
    }-*/;

    /**
     * Hide drop feed back.
     * 
     * @param event
     *            the event
     */
    public native void hideDropFeedBack(DragEvent event)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.hideDropFeedBack(event);
    }-*/;

    /**
     * Indices to index.
     * 
     * @param rowIndex
     *            the row index
     * @param colIndex
     *            the col index
     */
    public native void indicesToIndex(int rowIndex, int colIndex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.indicesToIndex(rowIndex, colIndex);
    }-*/;

    /**
     * Invalidate list.
     */
    public native void invalidateList()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidateList();
    }-*/;

    /**
     * Checks if is item high lighted.
     * 
     * @param value
     *            the value
     * @return true, if is item high lighted
     */
    public native boolean isItemHighLighted(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isItemHighLighted(value);
    }-*/;

    /**
     * Checks if is item selectable.
     * 
     * @param value
     *            the value
     * @return true, if is item selectable
     */
    public native boolean isItemSelectable(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isItemSelectable(value);
    }-*/;

    /**
     * Checks if is item selected.
     * 
     * @param value
     *            the value
     * @return true, if is item selected
     */
    public native boolean isItemSelected(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isItemSelected(value);
    }-*/;

    /**
     * Checks if is item showing caret.
     * 
     * @param value
     *            the value
     * @return true, if is item showing caret
     */
    public native boolean isItemShowingCaret(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isItemShowingCaret(value);
    }-*/;

    /**
     * Checks if is item visible.
     * 
     * @param value
     *            the value
     * @return true, if is item visible
     */
    public native boolean isItemVisible(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isItemVisible(value);
    }-*/;

    /**
     * Item to data tip.
     * 
     * @param value
     *            the value
     * @return the string
     */
    public native String itemToDataTip(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.itemToDataTip(value);
    }-*/;

    /**
     * Item to icon.
     * 
     * @param <T>
     *            the generic type
     * @param value
     *            the value
     * @return the t
     */
    public native <T> T itemToIcon(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.itemToIcon(value);
    }-*/;

    /**
     * Item to label.
     * 
     * @param value
     *            the value
     * @return the string
     */
    public native String itemToLabel(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.itemToLabel(value);
    }-*/;

    /**
     * Measure height of items.
     * 
     * @return the double
     */
    public native double measureHeightOfItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.measureHeightOfItems();
    }-*/;

    /**
     * Measure height of items.
     * 
     * @param index
     *            the index
     * @return the double
     */
    public native double measureHeightOfItems(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.measureHeightOfItems(index);
    }-*/;

    /**
     * Measure height of items.
     * 
     * @param index
     *            the index
     * @param count
     *            the count
     * @return the double
     */
    public native double measureHeightOfItems(int index, int count)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.measureHeightOfItems(index, count);
    }-*/;

    /**
     * Measure width of items.
     * 
     * @return the double
     */
    public native double measureWidthOfItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.measureWidthOfItems();
    }-*/;

    /**
     * Measure width of items.
     * 
     * @param index
     *            the index
     * @return the double
     */
    public native double measureWidthOfItems(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.measureWidthOfItems(index);
    }-*/;

    /**
     * Measure width of items.
     * 
     * @param index
     *            the index
     * @param count
     *            the count
     * @return the double
     */
    public native double measureWidthOfItems(int index, int count)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.measureWidthOfItems(index, count);
    }-*/;

    /**
     * Removes the data effect item.
     * 
     * @param value
     *            the value
     */
    public native void removeDataEffectItem(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeDataEffectItem(value);
    }-*/;

    /**
     * Scroll to index.
     * 
     * @param value
     *            the value
     * @return true, if successful
     */
    public native boolean scrollToIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.scrollToIndex(value);
    }-*/;

    /**
     * Show drop feedback.
     * 
     * @param event
     *            the event
     */
    public native void showDropFeedback(DragEvent event)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.showDropFeedback(event);
    }-*/;

    /**
     * Unconstrain renderer.
     * 
     * @param value
     *            the value
     */
    public native void unconstrainRenderer(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.unconstrainRenderer(value);
    }-*/;

    /**
     * Gets the locked column count.
     * 
     * @return the locked column count
     */
    public native int getLockedColumnCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlockedColumnCount();
    }-*/;

    /**
     * Sets the locked column count.
     * 
     * @param value
     *            the new locked column count
     */
    public native void setLockedColumnCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlockedColumnCount(value);
    }-*/;

    /**
     * Gets the locked row count.
     * 
     * @return the locked row count
     */
    public native int getLockedRowCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlockedRowCount();
    }-*/;

    /**
     * Sets the locked row count.
     * 
     * @param value
     *            the new locked row count
     */
    public native void setLockedRowCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlockedRowCount(value);
    }-*/;

}
