/************************************************************************
  ListBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.spark;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ListBase.
 */
public class ListBase extends SkinnableDataContainer {

    /**
     * Instantiates a new list base.
     */
    ListBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the list base
     */
    public ListBase() {
        jsObj = Bridge.createObject("spark.components.supportClasses.ListBase");
    }

    /**
     * Arrow keys wrap focus.
     * 
     * @return true, if successful
     */
    public native boolean arrowKeysWrapFocus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getarrowKeysWrapFocus();
    }-*/;

    /**
     * Sets the arrow keys wrap focus.
     * 
     * @param value the new arrow keys wrap focus
     */
    public native void setArrowKeysWrapFocus(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setarrowKeysWrapFocus(value);
    }-*/;

    /**
     * Gets the caret index.
     * 
     * @return the caret index
     */
    public native int getCaretIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcaretIndex();
    }-*/;

    /**
     * Gets the label field.
     * 
     * @return the label field
     */
    public native String getLabelField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelField();
    }-*/;

    /**
     * Sets the label field.
     * 
     * @param value the new label field
     */
    public native void setLabelField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelField(value);
    }-*/;

    /**
     * Require selection.
     * 
     * @return true, if successful
     */
    public native boolean requireSelection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrequireSelection();
    }-*/;

    /**
     * Sets the require selection.
     * 
     * @param value the new require selection
     */
    public native void setRequireSelection(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrequireSelection(value);
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
     * @param value the new selected index
     */
    public native void setSelectedIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedIndex(value);
    }-*/;

    /**
     * Gets the selected item.
     * 
     * @param <T> the generic type
     * @return the selected item
     */
    public native <T> T getSelectedItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedItem();
    }-*/;

    /**
     * Sets the selected item.
     * 
     * @param value the new selected item
     */
    public native void setSelectedItem(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedItem(value);
    }-*/;

    /**
     * Use virtual layout.
     * 
     * @return true, if successful
     */
    public native boolean useVirtualLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getuseVirtualLayout();
    }-*/;

    /**
     * Sets the use virtual layout.
     * 
     * @param value the new use virtual layout
     */
    public native void setUseVirtualLayout(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setuseVirtualLayout(value);
    }-*/;

}
