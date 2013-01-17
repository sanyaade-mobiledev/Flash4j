/************************************************************************
  AdvancedDataGrid.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.controls.advancedDataGridClasses.AdvancedDataGridColumn;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * The Class AdvancedDataGrid.
 */
public class AdvancedDataGrid extends AdvancedDataGridBaseEx {

    /**
     * Instantiates a new advanced data grid.
     */
    protected AdvancedDataGrid(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the advanced data grid
     */
    public AdvancedDataGrid() {
        jsObj = Bridge.createObject("mx.controls.AdvancedDataGrid");
    }

    /**
     * Display disclosure icon.
     * 
     * @return true, if successful
     */
    public native boolean displayDisclosureIcon()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisplayDisclosureIcon();
    }-*/;

    /**
     * Sets the display disclosure icon.
     * 
     * @param value the new display disclosure icon
     */
    public native void setDisplayDisclosureIcon(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisplayDisclosureIcon(value);
    }-*/;

    /**
     * Display items expanded.
     * 
     * @return true, if successful
     */
    public native boolean displayItemsExpanded()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisplayItemsExpanded();
    }-*/;

    /**
     * Sets the display items expanded.
     * 
     * @param value the new display items expanded
     */
    public native void setDisplayItemsExpanded(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisplayItemsExpanded(value);
    }-*/;

    /**
     * Gets the first visible object.
     * 
     * @param <T> the generic type
     * @return the first visible object
     */
    public native <T> T getFirstVisibleObject()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfirstVisibleObject();
    }-*/;

    /**
     * Sets the firstvisible object.
     * 
     * @param value the new firstvisible object
     */
    public native void setFirstvisibleObject(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfirstvisibleObject(value);
    }-*/;

    /**
     * Gets the grouped columns.
     * 
     * @return the grouped columns
     */

    public List<AdvancedDataGridColumn> getGroupedColumns() {
        List<AdvancedDataGridColumn> columns = new ArrayList<AdvancedDataGridColumn>();
        JavaScriptObject peers = _getGroupedColumns();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            columns.add(new AdvancedDataGridColumn(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return columns;
    }

    private native JavaScriptObject _getGroupedColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getgroupedColumns();
    }-*/;

    /**
     * Sets the grouped columns.
     * 
     * @param colums the new grouped columns
     */
    public void setGroupedColumns(List<AdvancedDataGridColumn> colums) {
        setGroupedColumns(DataConverter.fromList(colums));
    }

    /**
     * Sets the grouped columns.
     * 
     * @param cols the new grouped columns
     */
    private void setGroupedColumns(ArrayCollection cols) {
        _setGroupedColumns(cols.toArray().getJsObj());
    }

    /**
     * Sets the grouped columns.
     * 
     * @param value the new grouped columns
     */
    private native void _setGroupedColumns(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setgroupedColumns(value);
    }-*/;

    /**
     * Gets the group row height.
     * 
     * @return the group row height
     */
    public native double getGroupRowHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getgroupRowHeight();
    }-*/;

    /**
     * Sets the group row height.
     * 
     * @param value the new group row height
     */
    public native void setGroupRowHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setgroupRowHeight(value);
    }-*/;

    /**
     * Gets the item icons.
     * 
     * @param <T> the generic type
     * @return the item icons
     */
    public native <T> T getItemIcons()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getitemIcons();
    }-*/;

    /**
     * Sets the item icons.
     * 
     * @param value the new item icons
     */
    public native void setItemIcons(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setitemIcons(value);
    }-*/;

    /**
     * Gets the selected cells.
     * 
     * @return the selected cells
     */
    public native JsArrayNumber getSelectedCells()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedCells();
    }-*/;

    /**
     * Sets the selected cells.
     * 
     * @param values the new selected cells
     */
    public native void setSelectedCells(JsArrayNumber values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedCells(values);
    }-*/;

    /**
     * Gets the tree column.
     * 
     * @return the tree column
     */
    public native AdvancedDataGridColumn getTreeColumn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettreeColumn();
		return @com.emitrom.flash4j.flex.client.mx.controls.advancedDataGridClasses.AdvancedDataGridColumn::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the tree column.
     * 
     * @param value the new tree column
     */
    public native void setTreeColumn(AdvancedDataGridColumn value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settreeColumn(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Collapse all.
     */
    public native void collapseAll()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.collapseAll();
    }-*/;

    /**
     * Expand children of.
     * 
     * @param item the item
     * @param open the open
     */
    public native void expandChildrenOf(Object item, boolean open)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.expandChildrenOf(item, open);
    }-*/;

    /**
     * Expand item.
     * 
     * @param item the item
     * @param open the open
     */
    public native void expandItem(Object item, boolean open)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.expandItem(item, open);
    }-*/;

    /**
     * Expand item.
     * 
     * @param item the item
     * @param open the open
     * @param animate the animate
     */
    public native void expandItem(Object item, boolean open, boolean animate)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.expandItem(item, open, animate);
    }-*/;

    /**
     * Expand item.
     * 
     * @param item the item
     * @param open the open
     * @param animate the animate
     * @param dispatchEvent the dispatch event
     */
    public native void expandItem(Object item, boolean open, boolean animate, boolean dispatchEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.expandItem(item, open, animate, dispatchEvent);
    }-*/;

    /**
     * Expand item.
     * 
     * @param item the item
     * @param open the open
     * @param animate the animate
     * @param dispatchEvent the dispatch event
     * @param cause the cause
     */
    public native void expandItem(Object item, boolean open, boolean animate, boolean dispatchEvent, Event cause)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.expandItem(
						item,
						open,
						animate,
						dispatchEvent,
						cause.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the parent item.
     * 
     * @param <T> the generic type
     * @return the parent item
     */
    public native <T> T getParentItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getParentItem();
    }-*/;

    /**
     * Checks if is item open.
     * 
     * @param value the value
     * @return true, if is item open
     */
    public native boolean isItemOpen(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isItemOpen(value);
    }-*/;

    /**
     * Sets the item icon.
     * 
     * @param item the item
     * @param iconID the icon id
     * @param iconID2 the icon i d2
     */
    public native void setItemIcon(Object item, Object iconID, Object iconID2)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setItemIcon(item, iconID, iconID2);
    }-*/;

}
