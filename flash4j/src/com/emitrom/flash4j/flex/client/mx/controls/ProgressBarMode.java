/************************************************************************
  ProgressBarMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls;

/**
 * The Enum ProgressBarMode.
 */
public enum ProgressBarMode {

    /** The EVENT. */
    EVENT("event"),
    /** The MANUAL. */
    MANUAL("manual"),
    /** The POLLED. */
    POLLED("polled");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new progress bar mode.
     * 
     * @param direction the direction
     */
    private ProgressBarMode(String direction) {
        value = direction;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the progress bar mode
     */
    public static native ProgressBarMode fromValue(String value) /*-{
		switch (value) {
		case 'event':
			return @com.emitrom.flash4j.flex.client.mx.controls.ProgressBarMode::EVENT;
		case 'manual':
			return @com.emitrom.flash4j.flex.client.mx.controls.ProgressBarMode::MANUAL;
		case 'polled':
		}
    }-*/;
}
