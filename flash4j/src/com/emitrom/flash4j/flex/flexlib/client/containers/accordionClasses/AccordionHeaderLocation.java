/************************************************************************
  AccordionHeaderLocation.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.containers.accordionClasses;

/**
 * The Enum AccordionHeaderLocation.
 */
public enum AccordionHeaderLocation {

    /** The ABOVE. */
    ABOVE("above"),
    /** The BELOW. */
    BELOW("below"),
    /** The LEFT. */
    LEFT("left"),
    /** The RIGHT. */
    RIGHT("right");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new accordion header location.
     * 
     * @param location
     *            the location
     */
    private AccordionHeaderLocation(String location) {
        value = location;
    }

    /**
     * From value.
     * 
     * @param value
     *            the value
     * @return the accordion header location
     */
    public static native AccordionHeaderLocation fromValue(String value) /*-{
		switch (value) {
		case 'above':
			return @com.emitrom.flash4j.flex.flexlib.client.containers.accordionClasses.AccordionHeaderLocation::ABOVE;
		case 'below':
			return @com.emitrom.flash4j.flex.flexlib.client.containers.accordionClasses.AccordionHeaderLocation::BELOW;
		case 'left':
			return @com.emitrom.flash4j.flex.flexlib.client.containers.accordionClasses.AccordionHeaderLocation::LEFT;
		case 'right':

		}
    }-*/;

}
