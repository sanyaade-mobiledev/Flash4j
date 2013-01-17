/************************************************************************
  BitmapFillMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.graphics;

/**
 * The Enum BitmapFillMode.
 */
public enum BitmapFillMode {

    /** The CLIP. */
    CLIP("clip"),
    /** The REPEAT. */
    REPEAT("repeat"),
    /** The SCALE. */
    SCALE("scale");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new bitmap fill mode.
     * 
     * @param mode the mode
     */
    private BitmapFillMode(String mode) {
        value = mode;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the bitmap fill mode
     */
    public static native BitmapFillMode fromValue(String value) /*-{
		switch (value) {
		case 'clip':
			return @com.emitrom.flash4j.flex.client.mx.graphics.BitmapFillMode::CLIP;
		case 'repeat':
			return @com.emitrom.flash4j.flex.client.mx.graphics.BitmapFillMode::REPEAT;
		case 'scale':
			return @com.emitrom.flash4j.flex.client.mx.graphics.BitmapFillMode::SCALE;
		}
    }-*/;
}
