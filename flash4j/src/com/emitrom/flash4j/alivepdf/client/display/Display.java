/************************************************************************
  Display.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.display;

/**
 * The Enum Display.
 */
public enum Display {

    /** The FUL l_ page. */
    FULL_PAGE("FullPage"),
    /** The FUL l_ width. */
    FULL_WIDTH("FullWidth"),
    /** The REAL. */
    REAL("Real"),
    /** The DEFAULT. */
    DEFAULT("Default");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new display.
     * 
     * @param reference the reference
     */
    private Display(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the display
     */
    public static native Display fromValue(String value) /*-{
		switch (value) {
		case 'FullPage':
			return @com.emitrom.flash4j.alivepdf.client.display.Display::FULL_PAGE;
		case 'FullWidth':
			return @com.emitrom.flash4j.alivepdf.client.display.Display::FULL_WIDTH;
		case 'Real':
			return @com.emitrom.flash4j.alivepdf.client.display.Display::REAL;
		case 'Default':
			return @com.emitrom.flash4j.alivepdf.client.display.Display::DEFAULT;
		}
    }-*/;
}