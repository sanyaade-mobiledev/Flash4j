/************************************************************************
  StageScaleMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum StageScaleMode.
 */
public enum StageScaleMode {

    /** The EXAC t_ fit. */
    EXACT_FIT("exactFit"),
    /** The N o_ border. */
    NO_BORDER("noBorder"),
    /** The N o_ scale. */
    NO_SCALE("noScale"),
    /** The SHO w_ all. */
    SHOW_ALL("showAll");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new stage scale mode.
     * 
     * @param reference the reference
     */
    private StageScaleMode(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the stage scale mode
     */
    public static native StageScaleMode fromValue(String value) /*-{
		switch (value) {

		case 'exactFit':
			return @com.emitrom.flash4j.core.client.display.StageScaleMode::EXACT_FIT;

		case 'noBorder':
			return @com.emitrom.flash4j.core.client.display.StageScaleMode::NO_BORDER;

		case 'noScale':
			return @com.emitrom.flash4j.core.client.display.StageScaleMode::NO_SCALE;

		case 'showAll':
			return @com.emitrom.flash4j.core.client.display.StageScaleMode::SHOW_ALL;

		}
    }-*/;

}
