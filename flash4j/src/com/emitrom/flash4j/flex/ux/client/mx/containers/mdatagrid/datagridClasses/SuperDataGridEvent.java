/************************************************************************
  SuperDataGridEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.datagridClasses;

import com.emitrom.flash4j.core.client.events.Event;

/**
 * The Class MDataGridEvent.
 */
public class SuperDataGridEvent extends Event {

    /** The Constant FILTER_CHANGE. */
    public static final String FILTER_CHANGE = "filterChange";

    /** The Constant FILTER_VALUE_CHANGE. */
    public static final String FILTER_VALUE_CHANGE = "filterValueChange";

    /** The Constant ORIGINAL_COLLECTION_CHANGE. */
    public static final String ORIGINAL_COLLECTION_CHANGE = "originalCollectionChange";

    /**
     * Instantiates a new m data grid event.
     */
    protected SuperDataGridEvent() {

    }
}
