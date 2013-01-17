/************************************************************************
  Sheet.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.excel.client;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public class Sheet extends ProxyObject {

    public Sheet() {
        jsObj = newInstance();
    }

    protected Sheet(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.com.as3xls.xls.Sheet;

    }-*/;

    /** Creates an ExcelSheet object. */

    /**
     * Resizes the given sheet creating blank Cells in any new rows or columns
     * created. This has no effect if the given dimensions are smaller than the
     * current dimensions.
     * 
     * @param rows
     *            The new number of rows
     * @param cols
     *            The new number of columns
     * 
     */
    public native void resize(int rows, int cols) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.resize(rows, cols);
    }-*/;

    /**
     * Gets the cell object at the given location
     * 
     * @param row
     * @param col
     * @return The Cell at the given location
     * 
     */
    public native Cell getCell(int row, int col) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getCell(row, col);
		return @com.emitrom.air4j.excel.client.Cell::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the value of the given cell. If a formula is assigned then the
     * Cell's formula property is updated.
     * 
     * @param row
     * @param col
     * @param value
     * 
     */
    public native void setCell(int row, int col, Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setCell(row, col, value);
    }-*/;

    public native JsArray<JavaScriptObject> getValues() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.values;
    }-*/;

    public native JsArrayString getFormats() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.formats;
    }-*/;

    public native void setFormats(JsArrayString formats) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.formats = formats;
    }-*/;

    public native JsArrayString getXFormats() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.xformats;
    }-*/;

    public native void setXFormats(JsArrayString formats) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.xformats = formats;
    }-*/;

    public native int getRows() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rows;
    }-*/;

    public native int getCols() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.cols;
    }-*/;

    public native String getHeader() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.header;
    }-*/;

    public native void setHeader(String newValue) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.header = newValue;
    }-*/;

    public native String getFooter() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.footer;
    }-*/;

    public native void setFooter(String newValue) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.footer = newValue;
    }-*/;

    public native int getDateMode() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.dateMode;
    }-*/;

    public native void setDateMode(int newValue) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.dateMode = newValue;
    }-*/;

    public native String getName() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.name;
    }-*/;

    public native void setName(String newValue) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.name = newValue;
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.com.as3xls.xls.Sheet();
    }-*/;

}
