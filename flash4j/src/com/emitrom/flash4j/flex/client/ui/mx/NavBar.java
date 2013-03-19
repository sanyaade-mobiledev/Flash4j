/************************************************************************
  NavBar.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class NavBar.
 */
public class NavBar extends Box {

    /**
     * Instantiates a new nav bar.
     */
    protected NavBar(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the nav bar
     */
    public NavBar() {
        jsObj = Bridge.createObject("mx.controls.NavBar");
    }

    /**
     * Sets the data provider.
     * 
     * @param value the new data provider
     */
    public native void setDataProvider(UIComponent value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setdataProvider(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the data provider.
     * 
     * @param values the new data provider
     */
    public void setDataProvider(ArrayCollection values) {
        _setDataProvider(values.toArray().getJsObj());
    }

    /**
     * Sets the data provider.
     * 
     * @param value the new data provider
     */
    private native void _setDataProvider(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Gets the icon field.
     * 
     * @return the icon field
     */
    public native String getIconField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geticonField();
    }-*/;

    /**
     * Sets the icon field.
     * 
     * @param value the new icon field
     */
    public native void setIconField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seticonField(value);
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
     * Gets the selected index.
     * 
     * @return the selected index
     */
    public native int getSelectedIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedIndex();
    }-*/;

    /**
     * Sets the selectedted index.
     * 
     * @param value the new selectedted index
     */
    public native void setSelectedtedIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedtedIndex(value);
    }-*/;

    /**
     * Gets the tooltip field.
     * 
     * @return the tooltip field
     */
    public native String getTooltipField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettooltipField();
    }-*/;

    /**
     * Sets the tool tip field.
     * 
     * @param value the new tool tip field
     */
    public native void setToolTipField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settoolTipField(value);
    }-*/;

    /**
     * Item to label.
     * 
     * @param data the data
     * @return the string
     */
    public native String itemToLabel(Object data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.itemToLabel(data);
    }-*/;
}
