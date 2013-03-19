/************************************************************************
 * DataGrid.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.ui.mx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.data.BaseModel;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DataGrid.
 */
public class DataGrid extends DatagridBase {

    /**
     * Instantiates a new data grid.
     */
    protected DataGrid(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the data grid
     */
    public DataGrid() {
        jsObj = Bridge.createObject("mx.controls.DataGrid");
    }

    /**
     * Sets the columns.
     * 
     * @param cols
     *            the new columns
     */
    public void setColumns(List<? extends DataGridColumn> cols) {
        setColumns(DataConverter.fromList(cols));
    }

    /**
     * Sets the columns.
     * 
     * @param cols
     *            the new columns
     */
    public void setColumns(DataGridColumn... cols) {
        List<DataGridColumn> list = Arrays.asList(cols);
        setColumns(list);
    }

    /**
     * Sets the columns.
     * 
     * @param cols
     *            the new columns
     */
    private void setColumns(ArrayCollection cols) {
        _setColumns(cols.toArray().getJsObj());
    }

    /**
     * Sets the columns.
     * 
     * @param cols
     *            the new columns
     */
    private native void _setColumns(JavaScriptObject cols)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolumns(cols);
    }-*/;

    public List<DataGridColumn> getColumns() {
        List<DataGridColumn> columns = new ArrayList<DataGridColumn>();
        JavaScriptObject peers = _getColumns();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            columns.add(new DataGridColumn(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return columns;
    }

    /**
     * Gets the columns.
     * 
     * @return the columns
     */
    private native JavaScriptObject _getColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolumns();
    }-*/;

    /**
     * Checks for draggable columns.
     * 
     * @return true, if successful
     */
    public native boolean hasDraggableColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdraggableColumns();
    }-*/;

    /**
     * Sets the draggable columns.
     * 
     * @param value
     *            the new draggable columns
     */
    public native void setDraggableColumns(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdraggableColumns(value);
    }-*/;

    /**
     * Gets the selected item.
     * 
     * @param <T>
     *            the generic type
     * @return the selected item
     */
    public native BaseModel getSelection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedItem();
		return @com.emitrom.flash4j.core.client.data.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Checks if is editable.
     * 
     * @return true, if is editable
     */
    public native boolean isEditable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditable();
    }-*/;

    /**
     * Sets the editable.
     * 
     * @param value
     *            the new editable
     */
    public native void setEditable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditable(value);
    }-*/;

    /**
     * Gets the edited item position.
     * 
     * @param <T>
     *            the generic type
     * @return the edited item position
     */
    public native <T> T getEditedItemPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditedItemPosition();
    }-*/;

    /**
     * Sets the edited item position.
     * 
     * @param value
     *            the new edited item position
     */
    public native void setEditedItemPosition(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditedItemPosition(value);
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
     * @param value
     *            the new ime mode
     */
    public native void setImeMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setimeMode(value);
    }-*/;

    /**
     * Gets the min column width.
     * 
     * @return the min column width
     */
    public native double getMinColumnWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminColumnWidth();
    }-*/;

    /**
     * Sets the min column width.
     * 
     * @param value
     *            the new min column width
     */
    public native void setMinColumnWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminColumnWidth(value);
    }-*/;

    /**
     * Checks for resizable columns.
     * 
     * @return true, if successful
     */
    public native boolean hasResizableColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getresizableColumns();
    }-*/;

    /**
     * Sets the resizable columns.
     * 
     * @param value
     *            the new resizable columns
     */
    public native void setResizableColumns(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setresizableColumns(value);
    }-*/;

    /**
     * Checks for sortable columns.
     * 
     * @return true, if successful
     */
    public native boolean hasSortableColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsortableColumns();
    }-*/;

    /**
     * Sets the sortable columns.
     * 
     * @param value
     *            the new sortable columns
     */
    public native void setSortableColumns(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsortableColumns(value);
    }-*/;

    /**
     * Creates the item editor.
     * 
     * @param colorIndex
     *            the color index
     * @param rowIndex
     *            the row index
     */
    public native void createItemEditor(int colorIndex, int rowIndex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.createItemEditor(colorIndex, rowIndex);
    }-*/;

    /**
     * Destrop item editor.
     */
    public native void destropItemEditor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.destropItemEditor();
    }-*/;

    /**
     * Checks if is item editable.
     * 
     * @param data
     *            the data
     * @return true, if is item editable
     */
    public native boolean isItemEditable(Object data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isItemEditable(data);
    }-*/;

}
