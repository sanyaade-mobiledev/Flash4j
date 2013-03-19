/************************************************************************
 * List.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class List.
 */
public class List extends ListBase {

    /**
     * Instantiates a new list.
     */
    protected List(JavaScriptObject obj) {
        jsObj = obj;

    }

    /**
     * New instance.
     * 
     * @return the list
     */
    public List() {
        jsObj = Bridge.createObject("mx.controls.List");
    }

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
     * Gets the selected item.
     * 
     * @param <T>
     *            the generic type
     * @return the selected item
     */
    @SuppressWarnings("unchecked")
    public native ListItem getSelectedItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedItem();
		return @com.emitrom.flash4j.flex.client.ui.mx.ListItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
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
     * Gets the editor height offset.
     * 
     * @return the editor height offset
     */
    public native double getEditorHeightOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditorHeightOffset();
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
    public native void setEditorUsesEnterKey(boolean value)/*-{
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
    public native void setImeMode(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setimeMode(value);
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
     * Destroy item editor.
     */
    public native void destroyItemEditor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.destroyItemEditor();
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
