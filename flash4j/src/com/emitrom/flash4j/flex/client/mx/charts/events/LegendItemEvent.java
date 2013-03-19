/************************************************************************
 * LegendItemEvent.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.mx.charts.events;

import com.emitrom.flash4j.core.client.events.MouseEvent;
import com.emitrom.flash4j.flex.client.ui.mx.LegendItem;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class LegendItemEvent.
 */
public class LegendItemEvent extends MouseEvent {

    /** The Constant ITEM_CLICK. */
    public static final String ITEM_CLICK = "itemClick";

    /** The Constant ITEM_MOUSE_DOWN. */
    public static final String ITEM_MOUSE_DOWN = "itemMouseDown";

    /** The Constant ITEM_MOUSE_OUT. */
    public static final String ITEM_MOUSE_OUT = "itemMouseOut";

    /** The Constant ITEM_MOUSE_OVER. */
    public static final String ITEM_MOUSE_OVER = "itemMouseOver";

    /** The Constant ITEM_MOUSE_UP. */
    public static final String ITEM_MOUSE_UP = "itemMouseUp";

    /**
     * Instantiates a new legend item event.
     */
    protected LegendItemEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the item.
     * 
     * @return the item
     */
    public final native LegendItem getItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = this.getitem();
		return @com.emitrom.flash4j.flex.client.ui.mx.LegendItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
