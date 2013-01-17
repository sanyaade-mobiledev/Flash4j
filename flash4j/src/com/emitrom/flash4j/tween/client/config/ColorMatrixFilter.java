/************************************************************************
  ColorMatrixFilter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.tween.client.config;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class ColorMatrixFilter extends Filter {

    public ColorMatrixFilter() {
        jsObj = JavaScriptObject.createObject();
    }

    public static ColorMatrixFilter create() {
        return new ColorMatrixFilter();
    }

    /**
     * Sets the alpha
     * 
     * @param value
     * @return
     */
    public ColorMatrixFilter setColorize(int value) {
        JsoHelper.setAttribute(jsObj, "colorize", value);
        return this;
    }

    public ColorMatrixFilter setAmount(double value) {
        JsoHelper.setAttribute(jsObj, "amount", value);
        return this;
    }

    public ColorMatrixFilter setSaturation(int value) {
        JsoHelper.setAttribute(jsObj, "saturation", value);
        return this;
    }

    public ColorMatrixFilter setContrast(double value) {
        JsoHelper.setAttribute(jsObj, "contrast", value);
        return this;

    }

    public ColorMatrixFilter setBrightness(double value) {
        JsoHelper.setAttribute(jsObj, "brightness", value);
        return this;
    }

    public ColorMatrixFilter setHue(double value) {
        JsoHelper.setAttribute(jsObj, "hue", value);
        return this;
    }

    public ColorMatrixFilter setThreshold(double value) {
        JsoHelper.setAttribute(jsObj, "threshold", value);
        return this;
    }

}
