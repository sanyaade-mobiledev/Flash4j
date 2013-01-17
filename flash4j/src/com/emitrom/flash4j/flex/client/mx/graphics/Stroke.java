/************************************************************************
  Stroke.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.display.CapsStyle;
import com.emitrom.flash4j.core.client.display.LineScaleMode;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Stroke.
 */
public class Stroke extends SolidColorStroke {

    /**
     * Instantiates a new stroke.
     */
    protected Stroke(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the stroke
     */
    public Stroke() {
        jsObj = Bridge.createObject("mx.graphics.Stroke");
        setColor(0x000000);
        setWeight(1);
        setAlpha(1);
        setPixelHinting(false);
        setScaleMode(LineScaleMode.NORMAL);
        setCaps(CapsStyle.ROUND);
        setMiterLimit(3);
    }

}
