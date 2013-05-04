/************************************************************************
  AdvancedDataGridEventReason.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

/**
 * The Enum AdvancedDataGridEventReason.
 */
public enum AdvancedDataGridEventReason {

    /** The CANCELLED. */
    CANCELLED("cancelled"),
    /** The NE w_ column. */
    NEW_COLUMN("newColumn"),
    /** The NE w_ row. */
    NEW_ROW("newRow"),
    /** The OTHER. */
    OTHER("other");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new advanced data grid event reason.
     * 
     * @param reason the reason
     */
    private AdvancedDataGridEventReason(String reason) {
        value = reason;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the advanced data grid event reason
     */
    public static native AdvancedDataGridEventReason fromValue(String value) /*-{
		switch (value) {
		case 'cancelled':
			return @com.emitrom.flash4j.flex.client.mx.events.AdvancedDataGridEventReason::CANCELLED;
		case 'other':
			return @com.emitrom.flash4j.flex.client.mx.events.AdvancedDataGridEventReason::OTHER;
		case 'newColumn':
			return @com.emitrom.flash4j.flex.client.mx.events.AdvancedDataGridEventReason::NEW_COLUMN;
		case 'newRow':
			return @com.emitrom.flash4j.flex.client.mx.events.AdvancedDataGridEventReason::NEW_ROW;
		}
    }-*/;

}