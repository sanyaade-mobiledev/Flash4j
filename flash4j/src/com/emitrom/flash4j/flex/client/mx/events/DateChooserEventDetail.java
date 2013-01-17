/************************************************************************
  DateChooserEventDetail.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum DateChooserEventDetail.
 */
public enum DateChooserEventDetail {

    /** The NEX t_ month. */
    NEXT_MONTH("nextMonth"),
    /** The NEX t_ year. */
    NEXT_YEAR("nextYear"),
    /** The PREVIOU s_ month. */
    PREVIOUS_MONTH("previousMonth"),
    /** The PREVIOU s_ year. */
    PREVIOUS_YEAR("previousYear");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new date chooser event detail.
     * 
     * @param reason the reason
     */
    private DateChooserEventDetail(String reason) {
        value = reason;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the date chooser event detail
     */
    public static native DateChooserEventDetail fromValue(String value) /*-{
		switch (value) {
		case 'nextMonth':
			return @com.emitrom.flash4j.flex.client.mx.events.DateChooserEventDetail::NEXT_MONTH;
		case 'previousYear':
			return @com.emitrom.flash4j.flex.client.mx.events.DateChooserEventDetail::PREVIOUS_YEAR;
		case 'nextYear':
			return @com.emitrom.flash4j.flex.client.mx.events.DateChooserEventDetail::NEXT_YEAR;
		case 'previousMonth':
			return @com.emitrom.flash4j.flex.client.mx.events.DateChooserEventDetail::PREVIOUS_MONTH;
		}
    }-*/;
}
