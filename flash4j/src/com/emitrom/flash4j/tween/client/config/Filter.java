/************************************************************************
  Filter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class Filter extends ProxyObject {

    public Filter() {
        jsObj = JavaScriptObject.createObject();
    }

    public static Filter create() {
        return new Filter();
    }

    /**
     * Sets the alpha
     * 
     * @param value
     * @return
     */
    public Filter setDistance(double value) {
        JsoHelper.setAttribute(jsObj, "distance", value);
        return this;
    }

    public Filter setAngle(double value) {
        JsoHelper.setAttribute(jsObj, "angle", value);
        return this;
    }

    public Filter setHighlightColor(int value) {
        JsoHelper.setAttribute(jsObj, "highlightColor", value);
        return this;
    }

    public Filter setHighlightAlpha(double value) {
        JsoHelper.setAttribute(jsObj, "highlightAlpha", value);
        return this;

    }

    public Filter setShadowColor(double value) {
        JsoHelper.setAttribute(jsObj, "shadowColor", value);
        return this;
    }

    public Filter setBlurX(double value) {
        JsoHelper.setAttribute(jsObj, "blurX", value);
        return this;
    }

    public Filter setBlurY(double value) {
        JsoHelper.setAttribute(jsObj, "blurY", value);
        return this;
    }

    public Filter setStrength(double value) {
        JsoHelper.setAttribute(jsObj, "strength", value);
        return this;
    }

    public Filter setShadowAlpha(double value) {
        JsoHelper.setAttribute(jsObj, "shadowAlpha", value);
        return this;
    }

    public Filter setQuality(int value) {
        JsoHelper.setAttribute(jsObj, "quality", value);
        return this;
    }

    public Filter setRemove(boolean value) {
        JsoHelper.setAttribute(jsObj, "remove", value);
        return this;
    }

    public Filter setAddFilter(boolean value) {
        JsoHelper.setAttribute(jsObj, "addFilter", value);
        return this;
    }

    public Filter setIndex(int value) {
        JsoHelper.setAttribute(jsObj, "index", value);
        return this;
    }

}
