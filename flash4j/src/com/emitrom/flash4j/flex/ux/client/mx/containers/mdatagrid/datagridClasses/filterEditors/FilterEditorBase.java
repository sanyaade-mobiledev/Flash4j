/************************************************************************
  FilterEditorBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.datagridClasses.filterEditors;

import com.emitrom.flash4j.flex.client.ui.mx.Box;
import com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.datagridClasses.SuperDataGridColumn;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FilterEditorBase.
 */
public class FilterEditorBase extends Box implements IColumnFilterEditor {

    /**
     * Instantiates a new filter editor base.
     */
    protected FilterEditorBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Instantiates a new filter editor base.
     */
    protected FilterEditorBase() {

    }

    /**
     * Gets the column.
     * 
     * @return the column
     */
    public native SuperDataGridColumn getColumn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcolumn();
		return @com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.datagridClasses.SuperDataGridColumn::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the column.
     * 
     * @param value
     *            the new column
     */
    public native void setColumn(SuperDataGridColumn value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setcolumn(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Start edit.
     * 
     * @param column
     *            the column
     */
    public native void startEdit(SuperDataGridColumn column)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.startEdit(colum.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * End edit.
     */
    public native void endEdit()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.endEdit();
    }-*/;

    @Override
    public JavaScriptObject asIColumnFilterEditor() {
        return jsObj.cast();
    }

}
