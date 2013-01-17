/************************************************************************
  GridColumnFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.alivepdf.client.core;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating GridColumn objects.
 */
public class GridColumnFactory extends ProxyObject {

    public static final GridColumnFactory INSTANCE = new GridColumnFactory();

    /**
     * Instantiates a new grid column factory.
     */
    private GridColumnFactory() {
        jsObj = Bridge.createObject("com.ekambi.gwt.flex.pdf.grid.GridColumnFactory");
    }

    /**
     * Creates the.
     * 
     * @param headerText the header text
     * @param dataField the data field
     * @return the grid column
     */
    public final native JavaScriptObject create(String headerText, String dataField) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createGridColumn(headerText, dataField);
    }-*/;

    /**
     * Creates the.
     * 
     * @param headerText the header text
     * @param dataField the data field
     * @param width the width
     * @return the grid column
     */
    public final native JavaScriptObject create(String headerText, String dataField, double width)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createGridColumn(headerText, dataField, width);
    }-*/;

    /**
     * Creates the.
     * 
     * @param headerText the header text
     * @param dataField the data field
     * @param width the width
     * @param headerAlign the header align
     * @return the grid column
     */
    public final native JavaScriptObject create(String headerText, String dataField, double width, String headerAlign)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createGridColumn(headerText, dataField, width, headerAlign);
    }-*/;

    /**
     * Creates the.
     * 
     * @param headerText the header text
     * @param dataField the data field
     * @param width the width
     * @param headerAlign the header align
     * @param cellAlign the cell align
     * @return the grid column
     */
    public final native JavaScriptObject create(String headerText, String dataField, double width, String headerAlign,
                    String cellAlign)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createGridColumn(headerText, dataField, width, headerAlign,
				cellAlign);
    }-*/;

}
