/************************************************************************
  RoloTab.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.ui.mx.Canvas;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class RoloTab.
 */
public class RoloTab extends Canvas {

    /**
     * Instantiates a new rolo tab.
     */
    protected RoloTab(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the rolo tab
     */
    public RoloTab() {
        jsObj = Bridge.createObject("com.karn.rolotab.RoloTab");
    }

    /**
     * Sets the data provider.
     * 
     * @param dataProvider the new data provider
     */
    public void setDataProvider(ArrayCollection dataProvider) {
        _setDataProvider(dataProvider.toArray().getJsObj());
    }

    private native void _setDataProvider(JavaScriptObject dataProvider)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(dataProvider);
    }-*/;

    /**
     * Gets the data provider.
     * 
     * @return the data provider
     */
    public native ArrayCollection getDataProvider()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdataProvider();
		return @com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the value property name.
     * 
     * @param value the new value property name
     */
    public native void setValuePropertyName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvaluePropertyName(value);
    }-*/;

    /**
     * Gets the value property name.
     * 
     * @return the value property name
     */
    public native String getValuePropertyName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvaluePropertyName();
    }-*/;

    /**
     * Sets the selected tab.
     * 
     * @param value the new selected tab
     */
    public native void setSelectedTab(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setSelectedTab(value);
    }-*/;

    /**
     * Gets the selected tab.
     * 
     * @return the selected tab
     */
    public native String getSelectedTab()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedTab();
    }-*/;

}
