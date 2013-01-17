/************************************************************************
  LineScaleMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.display;

/**
 * The Enum LineScaleMode.
 */
public enum LineScaleMode {

    /** The HORINZONTAL. */
    HORINZONTAL("horizontal"),

    /** The COLORSPACE_4_2_0. */
    NONE("none"),

    /** The VERTICAL. */
    VERTICAL("vertical"),

    /** The NORMAL. */
    NORMAL("normal");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new line scale mode.
     * 
     * @param reference the reference
     */
    private LineScaleMode(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the line scale mode
     */
    public static native LineScaleMode fromValue(String value) /*-{
		switch (value) {

		case 'horizontal':
			return @com.emitrom.flash4j.core.client.display.LineScaleMode::HORINZONTAL;

		case 'none':
			return @com.emitrom.flash4j.core.client.display.LineScaleMode::NONE;

		case 'normal':
			return @com.emitrom.flash4j.core.client.display.LineScaleMode::NORMAL;

		case 'vertical':
			return @com.emitrom.flash4j.core.client.display.LineScaleMode::VERTICAL;

		}
    }-*/;

}
