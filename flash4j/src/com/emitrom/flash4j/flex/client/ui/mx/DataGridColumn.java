/************************************************************************
 * DataGridColumn.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.factories.ClassFactory;
import com.emitrom.flash4j.flex.client.core.factories.ClassUtil;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.mx.styles.CSSStyleDeclaration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DataGridColumn.
 */
public class DataGridColumn extends CSSStyleDeclaration {

    /**
     * Instantiates a new data grid column.
     */
    public DataGridColumn(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the data grid column
     */
    public DataGridColumn() {
        jsObj = Bridge.createObject("mx.controls.dataGridClasses.DataGridColumn");
    }

    public DataGridColumn(String headerText) {
        this();
        this.setHeaderText(headerText);
    }

    public DataGridColumn(String headerText, String dataField) {
        this(headerText);
        this.setDataField(dataField);
    }

    /**
     * Gets the data field.
     * 
     * @return the data field
     */
    public native String getDataField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataField();
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
     * Gets the data tip field.
     * 
     * @return the data tip field
     */
    public native String getDataTipField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataTipField();
    }-*/;

    /**
     * Sets the data tip field.
     * 
     * @param value
     *            the new data tip field
     */
    public native void setDataTipField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataTipField(value);
    }-*/;

    /**
     * Checks if is draggable.
     * 
     * @return true, if is draggable
     */
    public native boolean isDraggable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdraggable();
    }-*/;

    /**
     * Sets the draggable.
     * 
     * @param value
     *            the new draggable
     */
    public native void setDraggable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdraggable(value);
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
     * Sets the edidable.
     * 
     * @param value
     *            the new edidable
     */
    public native void setEdidable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setedidable(value);
    }-*/;

    /**
     * Gets the editor data field.
     * 
     * @return the editor data field
     */
    public native String getEditorDataField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditorDataField();
    }-*/;

    /**
     * Sets the editor data field.
     * 
     * @param value
     *            the new editor data field
     */
    public native void setEditorDataField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditorDataField(value);
    }-*/;

    /**
     * Gets the editor height offet.
     * 
     * @return the editor height offet
     */
    public native double getEditorHeightOffet()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditorHeightOffet();
    }-*/;

    /**
     * Sets the editor height offset.
     * 
     * @param value
     *            the new editor height offset
     */
    public native void setEditorHeightOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditorHeightOffset(value);
    }-*/;

    /**
     * Editor uses enter key.
     * 
     * @return true, if successful
     */
    public native boolean editorUsesEnterKey()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditorUsesEnterKey();
    }-*/;

    /**
     * Sets the editor uses enter key.
     * 
     * @param value
     *            the new editor uses enter key
     */
    public native void setEditorUsesEnterKey(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditorUsesEnterKey(value);
    }-*/;

    /**
     * Gets the editor width offset.
     * 
     * @return the editor width offset
     */
    public native double getEditorWidthOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditorWidthOffset();
    }-*/;

    /**
     * Sets the editor width offset.
     * 
     * @param value
     *            the new editor width offset
     */
    public native void setEditorWidthOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditorWidthOffset(value);
    }-*/;

    /**
     * Gets the editor x offset.
     * 
     * @return the editor x offset
     */
    public native double getEditorXOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditorXOffset();
    }-*/;

    /**
     * Sets the editor x offset.
     * 
     * @param value
     *            the new editor x offset
     */
    public native void setEditorXOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditorXOffset(value);
    }-*/;

    /**
     * Gets the editor y offset.
     * 
     * @return the editor y offset
     */
    public native double getEditorYOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditorYOffset();
    }-*/;

    /**
     * Sets the editor y offset.
     * 
     * @param value
     *            the new editor y offset
     */
    public native void setEditorYOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditorYOffset(value);
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
     * Gets the header text.
     * 
     * @return the header text
     */
    public native String getHeaderText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheaderText();
    }-*/;

    /**
     * Sets the header text.
     * 
     * @param value
     *            the new header text
     */
    public native void setHeaderText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheaderText(value);
    }-*/;

    /**
     * Header word wrap.
     * 
     * @return true, if successful
     */
    public native boolean headerWordWrap()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheaderWordWrap();
    }-*/;

    /**
     * Sets the header word wrap.
     * 
     * @param value
     *            the new header word wrap
     */
    public native void setHeaderWordWrap(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheaderWordWrap(value);
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
     * Gets the min width.
     * 
     * @return the min width
     */
    public native double getMinWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminWidth();
    }-*/;

    /**
     * Sets the min width.
     * 
     * @param value
     *            the new min width
     */
    public native void setMinWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminWidth(value);
    }-*/;

    /**
     * Renderer is editor.
     * 
     * @return true, if successful
     */
    public native boolean rendererIsEditor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrendererIsEditor();
    }-*/;

    /**
     * Sets the renderer is editor.
     * 
     * @param value
     *            the new renderer is editor
     */
    public native void setRendererIsEditor(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrendererIsEditor(value);
    }-*/;

    /**
     * Checks if is resizable.
     * 
     * @return true, if is resizable
     */
    public native boolean isResizable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getresizable();
    }-*/;

    /**
     * Sets the resizable.
     * 
     * @param value
     *            the new resizable
     */
    public native void setResizable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setresizable(value);
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
     * Checks if is sortable.
     * 
     * @return true, if is sortable
     */
    public native boolean isSortable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsortable();
    }-*/;

    /**
     * Sets the sortable.
     * 
     * @param value
     *            the new sortable
     */
    public native void setSortable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsortable(value);
    }-*/;

    /**
     * Sort descending.
     * 
     * @return true, if successful
     */
    public native boolean sortDescending()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsortDescending();
    }-*/;

    /**
     * Sets the sort descending.
     * 
     * @param value
     *            the new sort descending
     */
    public native void setSortDescending(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsortDescending(value);
    }-*/;

    /**
     * Checks if is visible.
     * 
     * @return true, if is visible
     */
    public native boolean isVisible()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvisible();
    }-*/;

    /**
     * Sets the visible.
     * 
     * @param value
     *            the new visible
     */
    public native void setVisible(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvisible(value);
    }-*/;

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public native double getWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Sets the width.
     * 
     * @param value
     *            the new width
     */
    public native void setWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwidth(value);
    }-*/;

    /**
     * Word wrap.
     * 
     * @return true, if successful
     */
    public native boolean wordWrap()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwordWrap();
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
     * Item to label.
     * 
     * @param value
     *            the value
     * @param withFormatting
     *            the with formatting
     * @return the string
     */
    public native String itemToLabel(Object value, boolean withFormatting)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.itemToLabel(value, withFormatting);
    }-*/;

    /**
     * Sets the item renderer.
     * 
     * @param component
     *            the new item renderer
     */
    public void setItemRenderer(UIComponent component) {
        JavaScriptObject obj = ClassUtil.getInstance().getClass(component.getJsObj());
        ClassFactory f = ClassFactory.create(obj);
        _setItemRenderer(f.asIFactory());
    }

    /**
     * _set item renderer.
     * 
     * @param value
     *            the value
     */
    public native void _setItemRenderer(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setitemRenderer(value);
    }-*/;

    /**
     * Sets the item editor.
     * 
     * @param component
     *            the new item editor
     */
    public void setItemEditor(UIComponent component) {
        JavaScriptObject obj = ClassUtil.getInstance().getClass(component.getJsObj());
        ClassFactory f = ClassFactory.create(obj);
        _setItemEditor(f.asIFactory());
    }

    /**
     * _set item editor.
     * 
     * @param value
     *            the value
     */
    private native void _setItemEditor(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setitemEditor(value);
    }-*/;

}
