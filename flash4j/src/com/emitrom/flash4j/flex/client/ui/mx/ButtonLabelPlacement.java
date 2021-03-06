/************************************************************************
  ButtonLabelPlacement.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.mx;

/**
 * The Enum ButtonLabelPlacement.
 */
public enum ButtonLabelPlacement {

    /** The BOTTOM. */
    BOTTOM("bottom"),
    /** The RIGHT. */
    RIGHT("right"),
    /** The TOP. */
    TOP("top"),
    /** The LEFT. */
    LEFT("left");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new button label placement.
     * 
     * @param direction the direction
     */
    private ButtonLabelPlacement(String direction) {
        value = direction;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the button label placement
     */
    public static native ButtonLabelPlacement fromValue(String value) /*-{
		switch (value) {
		case 'bottom':
			return @com.emitrom.flash4j.flex.client.ui.mx.ButtonLabelPlacement::BOTTOM;
		case 'left':
			return @com.emitrom.flash4j.flex.client.ui.mx.ButtonLabelPlacement::LEFT;
		case 'right':
			return @com.emitrom.flash4j.flex.client.ui.mx.ButtonLabelPlacement::RIGHT;
		case 'top':
			return @com.emitrom.flash4j.flex.client.ui.mx.ButtonLabelPlacement::TOP;
		}
    }-*/;
}
