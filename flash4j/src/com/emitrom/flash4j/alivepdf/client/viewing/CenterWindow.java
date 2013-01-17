/************************************************************************
  CenterWindow.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.viewing;

/**
 * The Enum CenterWindow.
 */
public enum CenterWindow {

    /** The CENTERED. */
    CENTERED("true"),
    /** The DEFAULT. */
    DEFAULT("false");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new center window.
     * 
     * @param reference the reference
     */
    private CenterWindow(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the center window
     */
    public static native CenterWindow fromValue(String value) /*-{
		switch (value) {
		case 'true':
			return @com.emitrom.flash4j.alivepdf.client.viewing.CenterWindow::CENTERED;
		case 'false':
			return @com.emitrom.flash4j.alivepdf.client.viewing.CenterWindow::DEFAULT;
		}
    }-*/;

}
