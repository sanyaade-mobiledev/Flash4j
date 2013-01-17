/************************************************************************
  ColorTransform.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class ColorTransform extends ProxyObject {

    public ColorTransform() {
        jsObj = JavaScriptObject.createObject();
    }

    public static ColorTransform create() {
        return new ColorTransform();
    }

    /**
     * Sets the alpha
     * 
     * @param value
     * @return
     */
    public ColorTransform setTint(double value) {
        JsoHelper.setAttribute(jsObj, "tint", value);
        return this;
    }

    public ColorTransform setTintAmount(double value) {
        JsoHelper.setAttribute(jsObj, "tintAmount", value);
        return this;
    }

    public ColorTransform setExposure(double value) {
        JsoHelper.setAttribute(jsObj, "exposure", value);
        return this;
    }

    public ColorTransform setRedMultiplier(double value) {
        JsoHelper.setAttribute(jsObj, "redMultiplier", value);
        return this;

    }

    public ColorTransform setGreenMultiplier(double value) {
        JsoHelper.setAttribute(jsObj, "greenMultiplier", value);
        return this;
    }

    public ColorTransform seBlueMultiplier(double value) {
        JsoHelper.setAttribute(jsObj, "blueMultiplier", value);
        return this;
    }

    public ColorTransform setAlphaMultipler(double value) {
        JsoHelper.setAttribute(jsObj, "alphaMultiplier", value);
        return this;
    }

    public ColorTransform setRedOffset(double value) {
        JsoHelper.setAttribute(jsObj, "redOffset", value);
        return this;

    }

    public ColorTransform setGreenOffset(double value) {
        JsoHelper.setAttribute(jsObj, "greenOffset", value);
        return this;
    }

    public ColorTransform seBlueOffset(double value) {
        JsoHelper.setAttribute(jsObj, "blueOffset", value);
        return this;
    }

    public ColorTransform setAlphaOffset(double value) {
        JsoHelper.setAttribute(jsObj, "alphaOffset", value);
        return this;
    }

}
