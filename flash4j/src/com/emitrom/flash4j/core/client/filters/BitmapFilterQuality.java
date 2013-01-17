/************************************************************************
  BitmapFilterQuality.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.filters;

/**
 * The Enum BitmapFilterQuality.
 */
public enum BitmapFilterQuality {

    /** The HIGH. */
    HIGH(3),
    /** The LOW. */
    LOW(1),
    /** The MEDIUM. */
    MEDIUM(2);

    /** The value. */
    public int value;

    /**
     * Instantiates a new bitmap filter quality.
     * 
     * @param quality the quality
     */
    private BitmapFilterQuality(int quality) {
        this.value = quality;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the bitmap filter quality
     */
    public static native BitmapFilterQuality fromValue(int value) /*-{
		switch (value) {
		case 3:
			return @com.emitrom.flash4j.core.client.filters.BitmapFilterQuality::HIGH;

		case 1:
			return @com.emitrom.flash4j.core.client.filters.BitmapFilterQuality::LOW;

		case 2:
			return @com.emitrom.flash4j.core.client.filters.BitmapFilterQuality::MEDIUM;

		}
    }-*/;

}
