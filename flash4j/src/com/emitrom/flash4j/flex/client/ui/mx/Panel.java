/************************************************************************
 * Panel.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
import com.emitrom.flash4j.flex.client.mx.core.ContainerLayout;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Panel.
 */
public class Panel extends Container {

    /**
     * Instantiates a new panel.
     */
    protected Panel(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the panel
     */
    public Panel() {
        jsObj = Bridge.createObject("mx.containers.Panel");
        setLayout(ContainerLayout.ABSOLUTE);
    }

    /**
     * New instance.
     * 
     * @param title
     *            the title
     * @return the panel
     */
    public Panel(String title) {
        this();
        setTitle(title);
    }

    /**
     * Sets the title.
     * 
     * @param value
     *            the new title
     */
    public native void setTitle(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settitle(value)
    }-*/;

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public native String getTitle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettitle();
    }-*/;

    /**
     * Sets the status.
     * 
     * @param value
     *            the new status
     */
    public native void setStatus(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstatus(value);
    }-*/;

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public native String getStatus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstatus();
    }-*/;

    /**
     * Sets the constraint columns.
     * 
     * @param cols
     *            the new constraint columns
     */
    public void setConstraintColumns(List<ConstraintColumn> cols) {
        setConstraintColumns(DataConverter.fromList(cols));
    }

    /**
     * Sets the constraint columns.
     * 
     * @param collection
     *            the new constraint columns
     */
    private void setConstraintColumns(ArrayCollection collection) {
        setConstraintColumns(collection.toArray().getJsObj());
    }

    /**
     * Sets the constraint columns.
     * 
     * @param value
     *            the new constraint columns
     */
    private native void setConstraintColumns(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setconstraintColumns(value);
    }-*/;

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
     * Sets the constraint rows.
     * 
     * @param cols
     *            the new constraint rows
     */
    public void setConstraintRows(List<ConstraintRow> cols) {
        setConstraintRows(DataConverter.fromList(cols));
    }

    /**
     * Sets the constraint rows.
     * 
     * @param collection
     *            the new constraint rows
     */
    private void setConstraintRows(ArrayCollection collection) {
        setConstraintRows(collection.toArray().getJsObj());
    }

    /**
     * Sets the constraint rows.
     * 
     * @param value
     *            the new constraint rows
     */
    private native void setConstraintRows(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setconstraintRows(value);
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
     * Gets the layout.
     * 
     * @return the layout
     */
    public ContainerLayout getLayout() {
        return ContainerLayout.fromValue(_getLayout());
    }

    /**
     * _get layout.
     * 
     * @return the string
     */
    private native String _getLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlayout();
    }-*/;

    /**
     * Sets the layout.
     * 
     * @param layout
     *            the new layout
     */
    public void setLayout(ContainerLayout layout) {
        _setLayout(layout.value);
    }

    /**
     * _set layout.
     * 
     * @param value
     *            the value
     */
    private native void _setLayout(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlayout(value);
    }-*/;

    /**
     * Gets the title icon.
     * 
     * @param <T>
     *            the generic type
     * @return the title icon
     */
    public native <T> T getTitleIcon()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettitleIcon();
    }-*/;

    /**
     * _set title icon.
     * 
     * @param value
     *            the value
     */
    private native void _setTitleIcon(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settitleIcon(value);
    }-*/;

}
