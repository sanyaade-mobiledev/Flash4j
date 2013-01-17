/************************************************************************
  AccordionBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.baseClasses;

import com.emitrom.flash4j.flex.client.mx.controls.Button;
import com.emitrom.flash4j.flex.client.mx.core.Container;
import com.emitrom.flash4j.flex.client.mx.core.INavigatorContent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AccordionBase.
 */
public class AccordionBase extends Container {

    /**
     * Instantiates a new accordion base.
     */
    protected AccordionBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected AccordionBase() {
        super();
    }

    /**
     * Checks if is history management enabled.
     * 
     * @return true, if is history management enabled
     */
    public native boolean isHistoryManagementEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getHistoryManagementEnabled();
    }-*/;

    /**
     * Sets the history management enabled.
     * 
     * @param value
     *            the new history management enabled
     */
    public native void sepeertoryManagementEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sepeertoryManagementEnabled(value);
    }-*/;

    /**
     * Resize to content.
     * 
     * @return true, if successful
     */
    public native boolean resizeToContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getresizeToContent();
    }-*/;

    /**
     * Sets the resize to content.
     * 
     * @param value
     *            the new resize to content
     */
    public native void setResizeToContent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setresizeToContent(value);
    }-*/;

    /**
     * Gets the selected child.
     * 
     * @return the selected child
     */
    public native Container getSelectedChild()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedChild();
		return @com.emitrom.flash4j.flex.client.mx.core.Container::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the selected child.
     * 
     * @param container
     *            the new selected child
     */
    public void setSelectedChild(INavigatorContent container) {
        _setSelectedChild(container.asINavigatorContent());
    }

    /**
     * Sets the selected child.
     * 
     * @param value
     *            the new selected child
     */
    private native void _setSelectedChild(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedChild(value);
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
     * Gets the header at.
     * 
     * @param index
     *            the index
     * @return the header at
     */
    public native Button getHeaderAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getHeaderAt(index);
		return @com.emitrom.flash4j.flex.client.mx.controls.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Load state.
     * 
     * @param state
     *            the state
     */
    public native void loadState(Object state)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.loadState(state);
    }-*/;

    /**
     * Save state.
     * 
     * @param <T>
     *            the generic type
     * @return the t
     */
    public native <T> T saveState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.saveState();
    }-*/;

}
