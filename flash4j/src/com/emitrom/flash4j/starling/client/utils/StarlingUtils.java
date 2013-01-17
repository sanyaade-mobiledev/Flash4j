/************************************************************************
  StarlingUtils.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.geom.Matrix;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.starling.client.core.factories.StarlingStaticBridge;

/**
 * Starling utiliy class
 * 
 */
public class StarlingUtils {

    private StarlingUtils() {

    }

    /**
     * Converts an angle from degrees into radians.
     * 
     * @param value
     * @return
     */
    public static double deg2Grad(double value) {
        return StarlingStaticBridge.INSTANCE.deg2Grad(value);
    }

    /**
     * Formats a String in .Net-style, with curly braces ("{0}").
     * 
     * @param format
     * @param values
     * @return
     */
    public static String formatString(String format, String... values) {
        return StarlingStaticBridge.INSTANCE.formatString(format, values);
    }

    /**
     * Returns the next power of two that is equal to or bigger than the
     * specified number.
     * 
     * @param value
     * @return
     */
    public static int getNextPowerOfTwo(int value) {
        return StarlingStaticBridge.INSTANCE.getNextPowerOfTwo(value);
    }

    /**
     * Converts an angle from radions into degrees.
     * 
     * @param value
     * @return
     */
    public static double rad2Deg(double value) {
        return StarlingStaticBridge.INSTANCE.rad2Deg(value);
    }

    /**
     * Uses a matrix to transform 2D coordinates into a different space.
     * 
     * @param matrix
     * @param x
     * @param y
     * @return
     */
    public static Point transformCoord(Matrix matrix, double x, double y) {
        return StarlingStaticBridge.INSTANCE.transformCoords(matrix, x, y);
    }

    /**
     * Uses a matrix to transform 2D coordinates into a different space.
     * 
     * @param matrix
     * @param x
     * @param y
     * @return
     */
    public static Point transformCoord(Matrix matrix, double x, double y, Point resultPoint) {
        return StarlingStaticBridge.INSTANCE.transformCoords(matrix, x, y, resultPoint);
    }
}
