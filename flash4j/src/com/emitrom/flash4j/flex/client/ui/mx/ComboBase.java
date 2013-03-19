/************************************************************************
 * ComboBase.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

import java.util.Arrays;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ComboBase.
 */
public class ComboBase extends UIComponent {

    /**
     * Instantiates a new combo base.
     */
    protected ComboBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the combo base
     */
    public ComboBase() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Sets the data provider.
     * 
     * @param collection
     *            the new data provider
     */
    public void setDataProvider(ArrayCollection collection) {
        _setDataProvider(collection.toArray().getJsObj());
    }

    public void addItems(ComboBoxEntry... entries) {
        setDataProvider(DataConverter.fromList(Arrays.asList(entries)));
    }

    /**
     * Sets the data provider.
     * 
     * @param value
     *            the new data provider
     */
    private native void _setDataProvider(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
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
     * Gets the ime mode.
     * 
     * @return the ime mode
     */
    public native String getImeMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getimeMode();
    }-*/;

    /**
     * Gets the restrict.
     * 
     * @return the restrict
     */
    public native String getRestrict()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrestrict();
    }-*/;

    /**
     * Sets the restrict.
     * 
     * @param value
     *            the new restrict
     */
    public native void setRestrict(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrestrict(value);
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
     * Gets the selected item.
     * 
     * @param <T>
     *            the generic type
     * @return the selected item
     */
    public native ComboBoxEntry getSelectedItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedItem();
		return @com.emitrom.flash4j.flex.client.ui.mx.ComboBoxEntry::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
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

    public void setSelectedItem(ComboBoxEntry item) {
        setSelectedItem(item.getJsObj());
    }

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public native String getText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getText();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param value
     *            the new text
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public native String getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

}
