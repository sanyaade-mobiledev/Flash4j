/************************************************************************
  IToolTip.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.core;

import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class IToolTip.
 */
public interface IToolTip {

    /**
     * Gets the screen.
     * 
     * @return the screen
     */
    public Rectangle getScreen();

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public String getText();

    /**
     * Sets the text.
     * 
     * @param value the new text
     */
    public void setText(String value);

    public JavaScriptObject asIToolTip();

}
