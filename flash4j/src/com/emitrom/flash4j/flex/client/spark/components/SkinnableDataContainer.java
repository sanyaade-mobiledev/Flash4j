/************************************************************************
  SkinnableDataContainer.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.components;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.IVisualElement;
import com.emitrom.flash4j.flex.client.spark.components.supportClasses.SkinnableContainerBase;
import com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SkinnableDataContainer.
 */
public class SkinnableDataContainer extends SkinnableContainerBase {

    /**
     * Instantiates a new skinnable data container.
     */
    SkinnableDataContainer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the skinnable data container
     */
    public SkinnableDataContainer() {
        jsObj = Bridge.createObject("spark.components.SkinnableDataContainer");
    }

    /**
     * Auto layout.
     * 
     * @return true, if successful
     */
    public native boolean autoLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoLayout();
    }-*/;

    /**
     * Sets the auto layout.
     * 
     * @param value the new auto layout
     */
    public native void setAutoLayout(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoLayout(value);
    }-*/;

    /**
     * Sets the data provider.
     * 
     * @param collection the new data provider
     */
    public void setDataProvider(ArrayCollection collection) {
        _setDataProvider(collection.asIList());
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
     * Gets the layout.
     * 
     * @return the layout
     */
    public native LayoutBase getLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getlayout();
		return @com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the layout.
     * 
     * @param value the new layout
     */
    public native void setLayout(LayoutBase value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setlayout(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Item to label.
     * 
     * @param item the item
     * @return the string
     */
    public native String itemToLabel(Object item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.itemToLabel(item);
    }-*/;

    /**
     * Update renderer.
     * 
     * @param renderer the renderer
     * @param itemIndex the item index
     * @param data the data
     */
    public native void updateRenderer(IVisualElement renderer, int itemIndex, Object data)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.updateRenderer(
						renderer.@com.emitrom.flash4j.flex.client.mx.core.IVisualElement::asIVisualElement()(),
						itemIndex, data);
    }-*/;

}
