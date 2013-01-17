/************************************************************************
  SuperPanelEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.events;

import com.emitrom.flash4j.core.client.events.Event;

/**
 * The Class SuperPanelEvent.
 */
public class SuperPanelEvent extends Event {

    /** The Constant MAXIMIZE. */
    public static final String MAXIMIZE = "maximize";

    /** The Constant MINIMIZE. */
    public static final String MINIMIZE = "minimize";

    /** The Constant RESTORE. */
    public static final String RESTORE = "restore";

    /** The Constant DRAG_START. */
    public static final String DRAG_START = "dragStart";

    /** The Constant DRAG. */
    public static final String DRAG = "drag";

    /** The Constant DRAG_END. */
    public static final String DRAG_END = "dragEnd";

    /** The Constant RESIZE_START. */
    public static final String RESIZE_START = "resizeStart";

    /** The Constant RESIZE_END. */
    public static final String RESIZE_END = "resizeEnd";

    /**
     * Instantiates a new super panel event.
     */
    protected SuperPanelEvent() {

    }

}
