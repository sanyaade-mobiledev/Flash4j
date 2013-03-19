/************************************************************************
 * AdvancedDataGridEvent.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom
 * LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.flex.client.mx.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.flex.client.ui.mx.AdvancedDataGridColumn;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AdvancedDataGridEvent.
 */
public class AdvancedDataGridEvent extends Event {

    /** The Constant COLUMN_STRECH. */
    public static final String COLUMN_STRECH = "columnStrech";

    /** The Constant HEADER_DRAG_OUTSIDE. */
    public static final String HEADER_DRAG_OUTSIDE = "headerDragOutSide";

    /** The Constant HEADER_DROP_OUTSIDE. */
    public static final String HEADER_DROP_OUTSIDE = "headerDropOutSide";

    /** The Constant HEADER_RELEASE. */
    public static final String HEADER_RELEASE = "headerRelease";

    /** The Constant ITEM_CLOSE. */
    public static final String ITEM_CLOSE = "itemClose";

    /** The Constant ITEM_EDIT_BEGIN. */
    public static final String ITEM_EDIT_BEGIN = "itemEditBegin";

    /** The Constant ITEM_EDIT_BEGINNING. */
    public static final String ITEM_EDIT_BEGINNING = "itemEditBeginning";

    /** The Constant ITEM_EDIT_END. */
    public static final String ITEM_EDIT_END = "itemEditEnd";

    /** The Constant ITEM_FOCUS_IN. */
    public static final String ITEM_FOCUS_IN = "itemFocusIn";

    /** The Constant ITEM_FOCUS_OUT. */
    public static final String ITEM_FOCUS_OUT = "itemFocusOut";

    /** The Constant ITEM_OPEN. */
    public static final String ITEM_OPEN = "itemOpen";

    /** The Constant ITEM_OPENING. */
    public static final String ITEM_OPENING = "itemOpening";

    /** The Constant SORT. */
    public static final String SORT = "sort";

    /**
     * Instantiates a new advanced data grid event.
     */
    protected AdvancedDataGridEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Checks if is anamitate.
     * 
     * @return the int
     */
    public final native int isAnamitate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getanimate();
    }-*/;

    /**
     * Gets the column.
     * 
     * @return the column
     */
    public final native AdvancedDataGridColumn getColumn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcolumn();
		return @com.emitrom.flash4j.flex.client.ui.mx.AdvancedDataGridColumn::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

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
     * Gets the label field.
     * 
     * @return the label field
     */
    public final native String getLabelField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelField();
    }-*/;

    /**
     * Dispatch event.
     * 
     * @return true, if successful
     */
    public final native boolean dispatchEvent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdispatchEvent();
    }-*/;

    /**
     * Gets the header part.
     * 
     * @return the header part
     */
    public final native String getHeaderPart()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheaderPart();
    }-*/;

    /**
     * Gets the item.
     * 
     * @param <T>
     *            the generic type
     * @return the item
     */
    public final native <T> T getItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getitem();
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
     * Checks if is multi count sort.
     * 
     * @return true, if is multi count sort
     */
    public final native boolean isMultiCountSort()/*-{
		return peer.getmultiCountSort();
    }-*/;

    /**
     * Checks if is opening.
     * 
     * @return true, if is opening
     */
    public final native boolean isOpening()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getopening();
    }-*/;

    /**
     * Gets the reason.
     * 
     * @return the reason
     */
    public final AdvancedDataGridEventReason getReason() {
        return AdvancedDataGridEventReason.fromValue(_getReason());
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
     * Removes the column from sort.
     * 
     * @return true, if successful
     */
    public final native boolean removeColumnFromSort()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getremoveColumnFromSort();
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

    /**
     * Gets the trigger event.
     * 
     * @return the trigger event
     */
    public final native Event getTriggerEvent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettriggerEvent();
		return @com.emitrom.flash4j.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static AdvancedDataGridEvent cast(Event event) {
        return new AdvancedDataGridEvent(event.getJsObj());
    }

}
