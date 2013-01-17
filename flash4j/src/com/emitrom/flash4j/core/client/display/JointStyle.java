/************************************************************************
  JointStyle.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum JointStyle.
 */
public enum JointStyle {

    /** The BEVEL. */
    BEVEL("bevel"),
    /** The MITTER. */
    MITTER("mitter"),
    /** The ROUND. */
    ROUND("round");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new joint style.
     * 
     * @param style the style
     */
    private JointStyle(String style) {
        value = style;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the joint style
     */
    public static native JointStyle fromValue(String value) /*-{
		switch (value) {

		case 'bevel':
			return @com.emitrom.flash4j.core.client.display.JointStyle::BEVEL;

		case 'mitter':
			return @com.emitrom.flash4j.core.client.display.JointStyle::MITTER;

		case 'round':
			return @com.emitrom.flash4j.core.client.display.JointStyle::ROUND;

		}
    }-*/;

}
