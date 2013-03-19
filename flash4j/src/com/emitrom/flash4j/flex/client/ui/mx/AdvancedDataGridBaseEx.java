/************************************************************************
 * AdvancedDataGridBaseEx.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom
 * LLC
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
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AdvancedDataGridBaseEx.
 */
public class AdvancedDataGridBaseEx extends AdvancedDataGridBase {

    /**
     * Instantiates a new advanced data grid base ex.
     */
    protected AdvancedDataGridBaseEx(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the advanced data grid base ex
     */
    public AdvancedDataGridBaseEx() {
        jsObj = Bridge.createObject("mx.controls.AdvancedDataGridBaseEx");
    }

    public List<AdvancedDataGridColumn> getColumns() {
        List<AdvancedDataGridColumn> columns = new ArrayList<AdvancedDataGridColumn>();
        JavaScriptObject peers = _getColumns();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            columns.add(new AdvancedDataGridColumn(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
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
     * Sets the columns.
     * 
     * @param columns
     *            the new columns
     */
    public void setColumns(List<? extends AdvancedDataGridColumn> columns) {
        _setColumns(DataConverter.fromList(columns));
    }

    /**
     * Sets the columns.
     * 
     * @param cols
     *            the new columns
     */
    private void _setColumns(ArrayCollection cols) {
        _setColumns(cols.toArray().getJsObj());
    }

    /**
     * Sets the columns.
     * 
     * @param value
     *            the new columns
     */
    private native void _setColumns(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolumns(value);
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
     * Gets the editable.
     * 
     * @return the editable
     */
    public native String isEditable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditable();
    }-*/;

    /**
     * Sets the editable.
     * 
     * @param value
     *            the new editable
     */
    public native void setEditable(String value)/*-{
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
     * Gets the look ahead duration.
     * 
     * @return the look ahead duration
     */
    public native double getLookAheadDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlookAheadDuration();
    }-*/;

    /**
     * Sets the look ahead duration.
     * 
     * @param value
     *            the new look ahead duration
     */
    public native void setLookAheadDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlookAheadDuration(value);
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
     * Checks if is sort expert mode.
     * 
     * @return true, if is sort expert mode
     */
    public native boolean isSortExpertMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsortExpertMode();
    }-*/;

    /**
     * Sets the sort expert mode.
     * 
     * @param value
     *            the new sort expert mode
     */
    public native void setSortExpertMode(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsortExpertMode(value);
    }-*/;

    /**
     * Creates the item editor.
     * 
     * @param colIndex
     *            the col index
     * @param rowIndex
     *            the row index
     */
    public native void createItemEditor(int colIndex, int rowIndex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.createItemEditor(colIndex, rowIndex);
    }-*/;

    /**
     * Destroy item editor.
     */
    public native void destroyItemEditor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.destroyItemEditor();
    }-*/;

    /**
     * Gets the field sort info.
     * 
     * @param column
     *            the column
     * @return the field sort info
     */
    public native SortInfo getFieldSortInfo(AdvancedDataGridColumn column)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getFieldSortInfo(column.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.flex.client.ui.mx.SortInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Move focus to header.
     */
    public native void moveFocusToHeader()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.moveFocusToHeader();
    }-*/;

    /**
     * Move focus to header.
     * 
     * @param columnIndex
     *            the column index
     */
    public native void moveFocusToHeader(int columnIndex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.moveFocusToHeader(columnIndex);
    }-*/;

}
