/************************************************************************
  TreeGrid.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.flex.client.ui.mx.DataGrid;
import com.emitrom.flash4j.flex.flexlib.client.core.FlexLibFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TreeGrid.
 */
public class TreeGrid extends DataGrid {

    /**
     * Instantiates a new tree grid.
     */
    protected TreeGrid(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the tree grid
     */
    public TreeGrid() {
        jsObj = FlexLibFactory.getInstance().createTreeGrid();
        setStyle("backgroundAlpha", "0.39");
        setStyle("backgroundColor", "#99CCFF");

    }

    /**
     * Show root.
     * 
     * @return true, if successful
     */
    public native boolean showRoot()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowRoot();
    }-*/;

    /**
     * Sets the show root.
     * 
     * @param value
     *            the new show root
     */
    public native void setShowRoot(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowRoot(value);
    }-*/;

    /**
     * Close all items.
     */
    public native void closeAllItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.closeAllItems();
    }-*/;

    /**
     * Close item at.
     * 
     * @param rowNumber
     *            the row number
     */
    public native void closeItemAt(int rowNumber)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.closeItemAt(rowNumber);
    }-*/;

    /**
     * Close item at.
     * 
     * @param rowNumber
     *            the row number
     * @param item
     *            the item
     */
    public native void closeItemAt(int rowNumber, JavaScriptObject item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.closeItemAt(
						rowNumber,
						item.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Close item at.
     * 
     * @param rowNumber
     *            the row number
     * @param item
     *            the item
     * @param closeItem
     *            the close item
     */
    public native void closeItemAt(int rowNumber, JavaScriptObject item, boolean closeItem)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.closeItemAt(
						rowNumber,
						item.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						closeItem);
    }-*/;

    /**
     * Checks if is branch.
     * 
     * @param item
     *            the item
     * @return true, if is branch
     */
    public native boolean isBranch(JavaScriptObject item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.isBranch(item.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Checks if is item open.
     * 
     * @param item
     *            the item
     * @return true, if is item open
     */
    public native boolean isItemOpen(ProxyObject item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.isItemOpen(item.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Open item at.
     * 
     * @param rowNumber
     *            the row number
     */
    public native void openItemAt(int rowNumber)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.openItemAt(rowNumber);
    }-*/;

    /**
     * Open item at.
     * 
     * @param rowNumber
     *            the row number
     * @param item
     *            the item
     */
    public native void openItemAt(int rowNumber, ProxyObject item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.openItemAt(
						rowNumber,
						item.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    // TODO
    // setItemICon

}
