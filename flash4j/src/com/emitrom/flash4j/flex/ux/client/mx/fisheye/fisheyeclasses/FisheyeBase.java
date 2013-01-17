/************************************************************************
  FisheyeBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.fisheye.fisheyeclasses;

import com.emitrom.flash4j.flex.client.core.factories.ClassFactory;
import com.emitrom.flash4j.flex.client.core.factories.ClassUtil;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FisheyeBase.
 */
public class FisheyeBase extends UIComponent {

    /**
     * Instantiates a new fisheye base.
     */
    protected FisheyeBase() {

    }

    /**
     * Sets the data provider.
     * 
     * @param dataProvider
     *            the new data provider
     */
    public void setDataProvider(ArrayCollection dataProvider) {
        this.setDataProvider(dataProvider.toArray().getJsObj());
    }

    /**
     * Sets the data provider.
     * 
     * @param value
     *            the new data provider
     */
    private native void setDataProvider(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Selection enabled.
     * 
     * @return true, if successful
     */
    public native boolean selectionEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectionEnabled();
    }-*/;

    /**
     * Sets the selection enabled.
     * 
     * @param value
     *            the new selection enabled
     */
    public native void setSelectionEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectionEnabled(value);
    }-*/;

    /**
     * Sets the selected item.
     * 
     * @param item
     *            the new selected item
     */
    public native void setSelectedItem(JavaScriptObject item)/*-{
		this.setselectedItem(item);
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
     * Sets the item renderer.
     * 
     * @param component
     *            the new item renderer
     */
    public void setItemRenderer(UIComponent component) {
        JavaScriptObject obj = ClassUtil.getInstance().getClass(component.getJsObj());
        ClassFactory f = ClassFactory.create(obj);
        this._setItemRenderer(f.asIFactory());
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

}
