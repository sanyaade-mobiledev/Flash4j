/************************************************************************
  TextureSmoothing.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.textures;

import com.emitrom.flash4j.starling.client.core.factories.StarlingStaticBridge;

/**
 * A class that provides constant values for the possible smoothing algorithms
 * of a texture.
 * 
 * @author Ekambi
 * 
 */
public enum TextureSmoothing {

    BILINEAR("bilinear"), NONE("none"), TRILINEAR("trilinear");

    private String value;

    private TextureSmoothing(String smoothing) {
        this.value = smoothing;
    }

    public String getValue() {
        return this.value;
    }

    public static boolean isValid(String smoothing) {
        return StarlingStaticBridge.INSTANCE.isTextureValid(smoothing);
    }

    public static TextureSmoothing fromValue(String value) {
        if (value.equalsIgnoreCase(TextureSmoothing.BILINEAR.value)) {
            return TextureSmoothing.BILINEAR;
        } else if (value.equalsIgnoreCase(TextureSmoothing.NONE.value)) {
            return TextureSmoothing.NONE;
        } else if (value.equalsIgnoreCase(TextureSmoothing.TRILINEAR.value)) {
            return TextureSmoothing.TRILINEAR;
        }
        return null;
    }
}
