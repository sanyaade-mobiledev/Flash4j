/************************************************************************
  ChartItemEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.events.MouseEvent;
import com.emitrom.flash4j.flex.client.mx.charts.HitData;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ChartItemEvent.
 */
public class ChartItemEvent extends MouseEvent {

    /** The Constant CHANGE. */
    public static final String CHANGE = "change";

    /** The Constant ITEM_CLICK. */
    public static final String ITEM_CLICK = "itemClick";

    /** The Constant ITEM_DOUBLE_CLICK. */
    public static final String ITEM_DOUBLE_CLICK = "itemDoubleClick";

    /** The Constant ITEM_MOUSE_DOWN. */
    public static final String ITEM_MOUSE_DOWN = "itemMouseDown";

    /** The Constant ITEM_MOUSE_MOVE. */
    public static final String ITEM_MOUSE_MOVE = "itemMouseMove";

    /** The Constant ITEM_MOUSE_UP. */
    public static final String ITEM_MOUSE_UP = "itemMouseUp";

    /** The Constant ITEM_ROLL_OUT. */
    public static final String ITEM_ROLL_OUT = "itemRollOut";

    /** The Constant ITEM_ROLL_OVER. */
    public static final String ITEM_ROLL_OVER = "itemRollOver";

    /**
     * Instantiates a new chart item event.
     */
    protected ChartItemEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the hit data.
     * 
     * @return the hit data
     */
    public final native HitData getHitData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gethitData();
		return @com.emitrom.flash4j.flex.client.mx.charts.HitData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static ChartItemEvent cast(Event event) {
        return new ChartItemEvent(event.getJsObj());
    }
}
