/************************************************************************
  GridItem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class GridItem.
 */
public class GridItem extends HBox {

    /**
     * Instantiates a new grid item.
     */
    protected GridItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the grid item
     */
    public GridItem() {
        jsObj = Bridge.createObject("mx.containers.GridItem");
    }

    /**
     * Gets the col span.
     * 
     * @return the col span
     */
    public native int getColSpan()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolSpan();
    }-*/;

    /**
     * Sets the col span.
     * 
     * @param value the new col span
     */
    public native void setColSpan(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolSpan(value);
    }-*/;

    /**
     * Gets the row span.
     * 
     * @return the row span
     */
    public native int getRowSpan()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrowSpan();
    }-*/;

    /**
     * Sets the row span.
     * 
     * @param value the new row span
     */
    public native void setRowSpan(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrowSpan(value);
    }-*/;

}
