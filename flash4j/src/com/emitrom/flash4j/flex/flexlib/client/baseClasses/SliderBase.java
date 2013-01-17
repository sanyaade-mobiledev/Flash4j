/************************************************************************
  SliderBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.baseClasses;

import com.emitrom.flash4j.flex.client.mx.controls.sliderClasses.Slider;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SliderBase.
 */
public class SliderBase extends Slider {

    /**
     * Instantiates a new slider base.
     */
    protected SliderBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected SliderBase() {
        super();
    }
}
