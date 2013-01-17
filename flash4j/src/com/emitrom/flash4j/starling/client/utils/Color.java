/************************************************************************
  Color.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.utils;

import com.emitrom.flash4j.starling.client.core.factories.StarlingStaticBridge;

/**
 * A utility class containing predefined colors and methods converting between
 * different color representations.
 */
public class Color {

    public static final int AQUA = 0x00ffff;
    public static final int BLACK = 0x000000;
    public static final int BLUE = 0x0000ff;
    public static final int FUSHIA = 0x00ff00ff;
    public static final int GRAY = 0x808080;
    public static final int GREEN = 0x008000;
    public static final int LIME = 0x00ff00;
    public static final int MOROON = 0x800000;
    public static final int NAVY = 0x000080;
    public static final int PURPLE = 0x808000;
    public static final int RED = 0xff0000;
    public static final int SILVER = 0xc0c0c0;
    public static final int TEAL = 0x008080;
    public static final int WHITE = 0xffffff;
    public static final int YELLOW = 0xffff00;

    private Color() {

    }

    /**
     * Creates an ARGB color, stored in an unsigned integer.
     * 
     * @param alpha
     * @param red
     * @param green
     * @param blue
     * @return
     */
    public static int argb(int alpha, int red, int green, int blue) {
        return StarlingStaticBridge.INSTANCE.argb(alpha, red, green, blue);
    }

    /**
     * Returns the alpha part of an ARGB color (0 - 255).
     * 
     * @param color
     * @return
     */
    public static int getAlpha(int color) {
        return StarlingStaticBridge.INSTANCE.getAlpha(color);
    }

    /**
     * Returns the blue part of an ARGB color (0 - 255).
     * 
     * @param color
     * @return
     */
    public static int getBlue(int color) {
        return StarlingStaticBridge.INSTANCE.getBlue(color);
    }

    /**
     * Returns the green part of an ARGB color (0 - 255).
     * 
     * @param color
     * @return
     */
    public static int getGreen(int color) {
        return StarlingStaticBridge.INSTANCE.getGreen(color);
    }

    /**
     * Returns the red part of an ARGB color (0 - 255).
     * 
     * @param color
     * @return
     */
    public static int getRed(int color) {
        return StarlingStaticBridge.INSTANCE.getRed(color);
    }

    /**
     * Creates an RGB color, stored in an unsigned integer.
     * 
     * @param color
     * @return
     */
    public static int rgb(int red, int green, int blue) {
        return StarlingStaticBridge.INSTANCE.rgb(red, green, blue);
    }
}
