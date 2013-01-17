/************************************************************************
  SpriteVisualElement.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.core;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.FlexSprite;
import com.emitrom.flash4j.flex.client.mx.core.IVisualElement;
import com.google.gwt.core.client.JavaScriptObject;

// TODO finish this class for 2.1
/**
 * The Class SpriteVisualElement.
 */
public class SpriteVisualElement extends FlexSprite implements IVisualElement {

    /**
     * Instantiates a new sprite visual element.
     */
    SpriteVisualElement(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the sprite visual element
     */
    public SpriteVisualElement() {
        jsObj = Bridge.createObject("spark.core.SpriteVisualElement");
    }

    @Override
    public JavaScriptObject asIVisualElement() {
        return this.jsObj.cast();
    }

}
