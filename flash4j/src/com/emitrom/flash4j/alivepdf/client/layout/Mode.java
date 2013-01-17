/************************************************************************
  Mode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.layout;

/**
 * The Enum Mode.
 */
public enum Mode {

    /** The NONE. */
    NONE("None"),
    /** The FI t_ t o_ page. */
    FIT_TO_PAGE("FitToPage"),
    /** The RESIZ e_ page. */
    RESIZE_PAGE("ResizePage");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new mode.
     * 
     * @param reference the reference
     */
    private Mode(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the mode
     */
    public static native Mode fromValue(String value) /*-{
		switch (value) {
		case 'None':
			return @com.emitrom.flash4j.alivepdf.client.layout.Mode::NONE;
		case 'FitToPage':
			return @com.emitrom.flash4j.alivepdf.client.layout.Mode::FIT_TO_PAGE;
		case 'ResizePage':
			return @com.emitrom.flash4j.alivepdf.client.layout.Mode::RESIZE_PAGE;
		}
    }-*/;

}
