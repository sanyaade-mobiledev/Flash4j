/************************************************************************
  FlexPrintJobScaleType.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.printing;

/**
 * The Enum FlexPrintJobScaleType.
 */
public enum FlexPrintJobScaleType {

    /** The FIL l_ page. */
    FILL_PAGE("fillPage"),
    /** The MATC h_ height. */
    MATCH_HEIGHT("matchHeight"),
    /** The MATC h_ width. */
    MATCH_WIDTH("matchWidth"),
    /** The NONE. */
    NONE("none"),
    /** The SHO w_ all. */
    SHOW_ALL("showAll");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new flex print job scale type.
     * 
     * @param mode the mode
     */
    private FlexPrintJobScaleType(String mode) {
        value = mode;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the flex print job scale type
     */
    public static native FlexPrintJobScaleType fromValue(String value) /*-{
		switch (value) {
		case 'fillPage':
			return @com.emitrom.flash4j.flex.client.mx.printing.FlexPrintJobScaleType::FILL_PAGE;
		case 'matchHeight':
			return @com.emitrom.flash4j.flex.client.mx.printing.FlexPrintJobScaleType::MATCH_HEIGHT;
		case 'matchWidth':
			return @com.emitrom.flash4j.flex.client.mx.printing.FlexPrintJobScaleType::MATCH_WIDTH;
		case 'none':
			return @com.emitrom.flash4j.flex.client.mx.printing.FlexPrintJobScaleType::NONE;
		case 'showAll':
			return @com.emitrom.flash4j.flex.client.mx.printing.FlexPrintJobScaleType::SHOW_ALL;
		}
    }-*/;
}
