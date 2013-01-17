/************************************************************************
  SummaryRow.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.collections;

import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SummaryRow.
 */
public class SummaryRow extends ProxyObject {

    /**
     * Instantiates a new summary row.
     */
    SummaryRow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the summary row
     */
    public SummaryRow() {
        jsObj = Bridge.createObject("mx.collections.SummaryRow");
    }

    /**
     * Sets the fields.
     * 
     * @param fields the new fields
     */
    public final void setFields(List<SummaryField2> fields) {
        _setFields(DataConverter.fromList(fields));
    }

    /**
     * Sets the fields.
     * 
     * @param collectionOfSummaries the new fields
     */
    private final void _setFields(ArrayCollection collectionOfSummaries) {
        _setFields(collectionOfSummaries.toArray().getJsObj());
    }

    /**
     * Sets the fields.
     * 
     * @param value the new fields
     */
    private final native void _setFields(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfields(value);
    }-*/;

    /**
     * Gets the summary placement.
     * 
     * @return the summary placement
     */
    public final native String getSummaryPlacement()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsummaryPlacement();
    }-*/;

    /**
     * Sets the summary placement.
     * 
     * @param value the new summary placement
     */
    public final native void setSummaryPlacement(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsummaryPlacement(value);
    }-*/;

}
