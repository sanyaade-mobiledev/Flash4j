/************************************************************************
  WipeDirection.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.effects;

/**
 * The Enum WipeDirection.
 */
public enum WipeDirection {

    /** The DOWN. */
    DOWN("down"),
    /** The LEFT. */
    LEFT("left"),
    /** The RIGHT. */
    RIGHT("right"),
    /** The UP. */
    UP("up");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new wipe direction.
     * 
     * @param direction the direction
     */
    private WipeDirection(String direction) {
        value = direction;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the wipe direction
     */
    public static native WipeDirection fromValue(String value) /*-{
		switch (value) {
		case 'down':
			return @com.emitrom.flash4j.flex.client.spark.effects.WipeDirection::DOWN;
		case 'left':
			return @com.emitrom.flash4j.flex.client.spark.effects.WipeDirection::LEFT;
		case 'right':
			return @com.emitrom.flash4j.flex.client.spark.effects.WipeDirection::RIGHT;
		case 'up':
			return @com.emitrom.flash4j.flex.client.spark.effects.WipeDirection::UP;
		}
    }-*/;
}
