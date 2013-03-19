/************************************************************************
  SuperAccordion.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.framework.ClassUtil;
import com.emitrom.flash4j.flex.client.core.factories.ClassFactory;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.ui.mx.Container;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;

/**
 * The Class SuperAccordion.
 */
public class SuperAccordion extends Container {

    /**
     * Instantiates a new super accordion.
     */
    protected SuperAccordion(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the super accordion
     */
    public SuperAccordion() {
        jsObj = Bridge.createObject("ws.tink.mx.containers.SuperAccordion");
    }

    /**
     * Sets the header renderer.
     * 
     * @param component the new header renderer
     */
    public void setHeaderRenderer(UIComponent component) {
        JavaScriptObject obj = ClassUtil.getInstance().getClass(component.getJsObj());
        ClassFactory f = ClassFactory.create(obj);
        _setHeaderRenderer(f.asIFactory());
    }

    /**
     * _set header renderer.
     * 
     * @param value the value
     */
    public native void _setHeaderRenderer(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheaderRenderer(value);
    }-*/;

    /**
     * Sets the history management enabled.
     * 
     * @param value the new history management enabled
     */
    public native void sepeertoryManagementEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sepeertoryManagementEnabled(value);
    }-*/;

    /**
     * Checks if is history managemenr enabled.
     * 
     * @return true, if is history managemenr enabled
     */
    public native boolean isHistoryManagemenrEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gepeertoryManagemenrEnabled();
    }-*/;

    /**
     * Sets the resize content.
     * 
     * @param value the new resize content
     */
    public native void setResizeContent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setresizeContent(value);
    }-*/;

    /**
     * Checks if is resize to content.
     * 
     * @return true, if is resize to content
     */
    public native boolean isResizeToContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getresizeToContent();
    }-*/;

    /**
     * Sets the selected indices.
     * 
     * @param indices the new selected indices
     */
    public void setSelectedIndices(JsArrayInteger indices) {
        ArrayCollection dataProvider = new ArrayCollection();
        for (int i = 0; i < indices.length(); i++) {
            dataProvider.addItem(indices.get(i));
        }
        _setSelectedIndices(dataProvider.toArray().getJsObj());
    }

    /**
     * Sets the selected indices.
     * 
     * @param value the new selected indices
     */
    private native void _setSelectedIndices(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedIndices(value);
    }-*/;

    /**
     * Gets the selected indices.
     * 
     * @param <T> the generic type
     * @return the selected indices
     */
    public native <T extends JavaScriptObject> T getSelectedIndices()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedIndices();
    }-*/;

    /**
     * Deselect child.
     * 
     * @param value the value
     */
    public native void deselectChild(Container value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.deselectChild(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Checks if is selected child.
     * 
     * @param value the value
     * @return true, if is selected child
     */
    public native boolean isSelectedChild(Container value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.isSelectedChild(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Checks if is selected index.
     * 
     * @param value the value
     * @return true, if is selected index
     */
    public native boolean isSelectedIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isSelectedIndex(value);
    }-*/;

    /**
     * Load state.
     * 
     * @param object the object
     */
    public native void loadState(JavaScriptObject object)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.loadState(object);
    }-*/;

    /**
     * Save state.
     */
    public native void saveState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.saveState();
    }-*/;

    /**
     * Select child.
     * 
     * @param value the value
     */
    public native void selectChild(Container value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.selectChild(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Select index.
     * 
     * @param value the value
     */
    public native void selectIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.selectIndex(value);
    }-*/;

}
