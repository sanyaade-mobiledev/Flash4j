/************************************************************************
  ProgressBarLabelPlacement.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum ProgressBarLabelPlacement.
 */
public enum ProgressBarLabelPlacement {

    /** The BOTTOM. */
    BOTTOM("bottom"),
    /** The RIGHT. */
    RIGHT("right"),
    /** The TOP. */
    TOP("top"),
    /** The CENTER. */
    CENTER("center"),
    /** The LEFT. */
    LEFT("left");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new progress bar label placement.
     * 
     * @param direction the direction
     */
    private ProgressBarLabelPlacement(String direction) {
        value = direction;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the progress bar label placement
     */
    public static native ProgressBarLabelPlacement fromValue(String value) /*-{
		switch (value) {
		case 'bottom':
			return @com.emitrom.flash4j.flex.client.mx.controls.ProgressBarLabelPlacement::BOTTOM;
		case 'left':
			return @com.emitrom.flash4j.flex.client.mx.controls.ProgressBarLabelPlacement::LEFT;
		case 'right':
			return @com.emitrom.flash4j.flex.client.mx.controls.ProgressBarLabelPlacement::RIGHT;
		case 'top':
			return @com.emitrom.flash4j.flex.client.mx.controls.ProgressBarLabelPlacement::TOP;
		case 'center':
			return @com.emitrom.flash4j.flex.client.mx.controls.ProgressBarLabelPlacement::CENTER
		}
    }-*/;
}
