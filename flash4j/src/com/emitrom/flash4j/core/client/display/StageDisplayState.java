/************************************************************************
  StageDisplayState.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum StageDisplayState.
 */
public enum StageDisplayState {

    /** The FUL l_ screen. */
    FULL_SCREEN("fullScreen"),

    FULL_SCREEN_INTERACTIVE("fullScreenInteractice"),

    /** The NORMAL. */
    NORMAL("normal");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new stage display state.
     * 
     * @param reference the reference
     */
    private StageDisplayState(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the stage display state
     */
    public static native StageDisplayState fromValue(String value) /*-{
		switch (value) {
		case 'fullScreen':
			return @com.emitrom.flash4j.core.client.display.StageDisplayState::FULL_SCREEN;

		case 'fullScreenIntercative':
			return @com.emitrom.flash4j.core.client.display.StageDisplayState::FULL_SCREEN_INTERACTIVE;

		case 'normal':
			return @com.emitrom.flash4j.core.client.display.StageDisplayState::NORMAL;

		}
    }-*/;
}
