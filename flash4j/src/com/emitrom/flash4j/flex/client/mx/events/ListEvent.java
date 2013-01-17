/************************************************************************
  ListEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class ListEvent.
 */
public class ListEvent extends Event {

    /** The Constant CHANGE. */
    public static final String CHANGE = "change";

    /** The Constant ITEM_CLICK. */
    public static final String ITEM_CLICK = "itemClick";

    /** The Constant ITEM_DOUBLE_CLICK. */
    public static final String ITEM_DOUBLE_CLICK = "itemDoubleClick";

    /** The Constant ITEM_EDIT_BEGIN. */
    public static final String ITEM_EDIT_BEGIN = "itemEditBegin";

    /** The Constant ITEM_EDIT_BEGINNING. */
    public static final String ITEM_EDIT_BEGINNING = "itemEditBeginning";

    /** The Constant ITEM_EDIT_END. */
    public static final String ITEM_EDIT_END = "editItemEnd";

    /** The Constant ITEM_FOCUS_IN. */
    public static final String ITEM_FOCUS_IN = "itemFocusIn";

    /** The Constant ITEM_FOCUS_OUT. */
    public static final String ITEM_FOCUS_OUT = "itemFocusOut";

    /** The Constant ITEM_ROLL_OUT. */
    public static final String ITEM_ROLL_OUT = "itemRollOut";

    /** The Constant ITEM_ROLL_OVER. */
    public static final String ITEM_ROLL_OVER = "itemRollOver";

    /**
     * Instantiates a new list event.
     */
    protected ListEvent(JavaScriptObject obj) {
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
     * Gets the reason.
     * 
     * @return the reason
     */
    public final ListEventReason getReason() {
        return ListEventReason.fromValue(_getReason());
    }

    /**
     * _get reason.
     * 
     * @return the string
     */
    private final native String _getReason()/*-{
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

    public static ListEvent cast(Event event) {
        return new ListEvent(event.getJsObj());
    }

}
