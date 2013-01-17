/************************************************************************
  DataGridEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DataGridEvent.
 */
public class DataGridEvent extends Event {

    /** The Constant COLUMN_STRECH. */
    public static final String COLUMN_STRECH = "columnStrech";

    /** The Constant HEADER_RELEASE. */
    public static final String HEADER_RELEASE = "headerRelease";

    /** The Constant ITEM_EDIT_BEGIN. */
    public static final String ITEM_EDIT_BEGIN = "itemEditBegin";

    /** The Constant ITEM_EDIT_BEGINNING. */
    public static final String ITEM_EDIT_BEGINNING = "itemEditBeginning";

    /** The Constant ITEM_EDIT_END. */
    public static final String ITEM_EDIT_END = "itemEditEnd";

    /** The Constant ITEM_EDITOR_CREATE. */
    public static final String ITEM_EDITOR_CREATE = "itemEditorCreated";

    /** The Constant ITEM_FOCUS_IN. */
    public static final String ITEM_FOCUS_IN = "itemFocusIn";

    /** The Constant ITEM_FOCUS_OUT. */
    public static final String ITEM_FOCUS_OUT = "itemFocusOut";

    /**
     * Instantiates a new data grid event.
     */
    protected DataGridEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the column index.
     * 
     * @return the column index
     */
    public final native int getColumnIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolumnIndex();
    }-*/;

    /**
     * Gets the data field.
     * 
     * @return the data field
     */
    public final native String getDataField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataField();
    }-*/;

    /**
     * Gets the local x.
     * 
     * @return the local x
     */
    public final native double getLocalX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlocalX();
    }-*/;

    /**
     * Gets the reason.
     * 
     * @return the reason
     */
    public final DataGridEventReason getReason() {
        return DataGridEventReason.fromValue(_getReason());
    }

    /**
     * _get reason.
     * 
     * @return the string
     */
    private native String _getReason()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getreason();
    }-*/;

    /**
     * Gets the row index.
     * 
     * @return the row index
     */
    public final native int getRowIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrowIndex();
    }-*/;

    public static DataGridEvent cast(Event event) {
        return new DataGridEvent(event.getJsObj());
    }

}
