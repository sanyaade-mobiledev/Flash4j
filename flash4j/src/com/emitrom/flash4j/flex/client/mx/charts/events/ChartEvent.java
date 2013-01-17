/************************************************************************
  ChartEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ChartEvent.
 */
public class ChartEvent extends MouseEvent {

    /** The Constant CHART_CLICK. */
    public static final String CHART_CLICK = "chartClick";

    /** The Constant CHART_DOUBLE_CLICK. */
    public static final String CHART_DOUBLE_CLICK = "chartDoubleClick";

    /**
     * Instantiates a new chart event.
     */
    protected ChartEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static ChartEvent cast(Event event) {
        return new ChartEvent(event.getJsObj());
    }

}
