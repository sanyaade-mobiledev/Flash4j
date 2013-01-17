/************************************************************************
  BitmapDataChannel.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum BitmapDataChannel.
 */
public enum BitmapDataChannel {

    /** The ALPHA. */
    ALPHA(8),
    /** The BLUE. */
    BLUE(4),
    /** The GREEN. */
    GREEN(2),
    /** The RED. */
    RED(1);

    /** The value. */
    public int value;

    /**
     * Instantiates a new bitmap data channel.
     * 
     * @param v the v
     */
    private BitmapDataChannel(int v) {
        value = v;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the bitmap data channel
     */
    public static native BitmapDataChannel fromValue(int value) /*-{
		switch (value) {
		case 8:
			return @com.emitrom.flash4j.core.client.display.BitmapDataChannel::ALPHA;

		case 4:
			return @com.emitrom.flash4j.core.client.display.BitmapDataChannel::BLUE;

		case 2:
			return @com.emitrom.flash4j.core.client.display.BitmapDataChannel::GREEN;

		case 1:
			return @com.emitrom.flash4j.core.client.display.BitmapDataChannel::RED;

		}
    }-*/;
}
