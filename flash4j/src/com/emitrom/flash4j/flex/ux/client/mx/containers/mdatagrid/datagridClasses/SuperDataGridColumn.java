/************************************************************************
  SuperDataGridColumn.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.datagridClasses;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.framework.ClassUtil;
import com.emitrom.flash4j.flex.client.core.factories.ClassFactory;
import com.emitrom.flash4j.flex.client.mx.controls.datagridClasses.DataGridColumn;
import com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.datagridClasses.filterEditors.FilterEditorBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class MDataGridColumn.
 */
public class SuperDataGridColumn extends DataGridColumn {

    /**
     * Instantiates a new m data grid column.
     */
    protected SuperDataGridColumn(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the m data grid column
     */
    public SuperDataGridColumn() {
        jsObj = Bridge.createObject("com.iwobanas.controls.dataGridClasses.MDataGridColumn");
    }

    /**
     * Gets the filter editor.
     * 
     * @return the filter editor
     */
    public native FilterEditorBase getFilterEditor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getfilterEditor();
		return @com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.datagridClasses.filterEditors.FilterEditorBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the filter editor.
     * 
     * @param component
     *            the new filter editor
     */
    public void setFilterEditor(FilterEditorBase component) {
        JavaScriptObject obj = ClassUtil.getInstance().getClass(component.getJsObj());
        ClassFactory f = ClassFactory.create(obj);
        _setFilterEditor(f.asIFactory());
    }

    /**
     * _set filter editor.
     * 
     * @param value
     *            the value
     */
    private native void _setFilterEditor(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfilterEditor(value);
    }-*/;

}
