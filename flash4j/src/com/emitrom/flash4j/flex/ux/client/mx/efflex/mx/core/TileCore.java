/************************************************************************
  TileCore.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.efflex.mx.core;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;

/**
 * The Class TileCore.
 */
public class TileCore extends ProxyObject {

    /** The Constant RANDOM. */
    public static final String RANDOM = "random";

    /** The Constant TOP_RIGHT_TO_BOTTOM_LEFT. */
    public static final String TOP_RIGHT_TO_BOTTOM_LEFT = "topRightToBottomLeft";

    /** The Constant TOP_LEFT_TO_BOTTOM_RIGHT. */
    public static final String TOP_LEFT_TO_BOTTOM_RIGHT = "topLeftToBottomRight";

    /** The Constant BOTTOM_RIGHT_TO_TOP_LEFT. */
    public static final String BOTTOM_RIGHT_TO_TOP_LEFT = "bottomRightToTopLeft";

    /** The Constant BOTTOM_LEFT_TO_TOP_RIGHT. */
    public static final String BOTTOM_LEFT_TO_TOP_RIGHT = "bottomLeftToTopRight";

    /**
     * Instantiates a new tile core.
     */
    protected TileCore() {
        jsObj = JsoHelper.createObject();
    }
}
