/************************************************************************
  PrintDataGrid.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.printing;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.ui.mx.DataGrid;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PrintDataGrid.
 */
public class PrintDataGrid extends DataGrid {

    /**
     * Instantiates a new prints the data grid.
     */
    protected PrintDataGrid(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the prints the data grid
     */
    public PrintDataGrid() {
        jsObj = Bridge.createObject("mx.printing.PrintDataGrid");
    }

    /**
     * Gets the current page height.
     * 
     * @return the current page height
     */
    public final native double getCurrentPageHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentPageHeight();
    }-*/;

    /**
     * Gets the original height.
     * 
     * @return the original height
     */
    public final native double getOriginalHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoriginalHeight();
    }-*/;

    /**
     * Size to page.
     * 
     * @return true, if successful
     */
    public final native boolean sizeToPage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsizeToPage();
    }-*/;

    /**
     * Sets the size to page.
     * 
     * @param value the new size to page
     */
    public final native void setSizeToPage(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsizeToPage(value);
    }-*/;

    /**
     * Checks for valid index page.
     * 
     * @return true, if successful
     */
    public final native boolean hasValidIndexPage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalidNextPage();
    }-*/;

    /**
     * Next page.
     */
    public final native void nextPage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.nextPage();
    }-*/;

}
