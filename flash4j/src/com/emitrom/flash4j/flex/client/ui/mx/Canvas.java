/************************************************************************
  Canvas.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Canvas.
 */
public class Canvas extends Container {

    /**
     * Instantiates a new canvas.
     */
    protected Canvas(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the canvas
     */
    public Canvas() {
        jsObj = Bridge.createObject("mx.containers.Canvas");
    }

    public List<ConstraintColumn> getConstraintColumns() {
        List<ConstraintColumn> cols = new ArrayList<ConstraintColumn>();
        JavaScriptObject peer = _getcontraintColumns();
        int size = JsoHelper.getAs3ArrayLength(peer);
        for (int i = 0; i < size; i++) {
            cols.add(new ConstraintColumn(JsoHelper.getValueFromJavaScriptObjectArray(peer, i)));
        }
        return cols;
    }

    /**
     * Gets the contraint columns.
     * 
     * @return the contraint columns
     */
    private native JavaScriptObject _getcontraintColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontraintColumns();
    }-*/;

    /**
     * Sets the constraint columns.
     * 
     * @param cols the new constraint columns
     */
    public void setConstraintColumns(List<ConstraintColumn> cols) {
        setConstraintColumns(DataConverter.fromList(cols));
    }

    /**
     * Sets the constraint columns.
     * 
     * @param cols the new constraint columns
     */
    private void setConstraintColumns(ArrayCollection cols) {
        setConstraintColumns(cols.toArray().getJsObj());
    }

    /**
     * Sets the constraint columns.
     * 
     * @param cols the new constraint columns
     */
    private native void setConstraintColumns(JavaScriptObject cols)/*-{
		peer.setconstraintColumns(cols);
    }-*/;

    /**
     * Gets the contraint rows.
     * 
     * @return the contraint rows
     */
    public List<ConstraintRow> getConstraintRows() {
        List<ConstraintRow> rows = new ArrayList<ConstraintRow>();
        JavaScriptObject peer = _getcontraintRows();
        int size = JsoHelper.getAs3ArrayLength(peer);
        for (int i = 0; i < size; i++) {
            rows.add(new ConstraintRow(JsoHelper.getValueFromJavaScriptObjectArray(peer, i)));
        }
        return rows;
    }

    private native JavaScriptObject _getcontraintRows()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontraintRows();
    }-*/;

    /**
     * Sets the constraint rows.
     * 
     * @param cols the new constraint rows
     */
    public void setConstraintRows(List<ConstraintRow> cols) {
        setConstraintRows(DataConverter.fromList(cols));
    }

    /**
     * Sets the constraint rows.
     * 
     * @param cols the new constraint rows
     */
    private void setConstraintRows(ArrayCollection cols) {
        setConstraintRows(cols.toArray().getJsObj());
    }

    /**
     * Sets the constraint rows.
     * 
     * @param cols the new constraint rows
     */
    private native void setConstraintRows(JavaScriptObject cols)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setconstraintRows(cols);
    }-*/;

}
