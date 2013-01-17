/************************************************************************
  CoreFont.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.fonts;

import com.emitrom.flash4j.alivepdf.client.core.FontFactory;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CoreFont.
 */
public class CoreFont extends ProxyObject implements IFont {

    /**
     * Instantiates a new core font.
     */
    CoreFont(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param family the family
     * @return the core font
     */
    public CoreFont(FontFamily family) {
        jsObj = FontFactory.INSTANCE.createFont(family.value);
    }

    /**
     * New instance.
     * 
     * @return the core font
     */
    public CoreFont() {
        jsObj = FontFactory.INSTANCE.createFont();
    }

    @Override
    public JavaScriptObject asIFont() {
        return this.jsObj.cast();
    }
}
