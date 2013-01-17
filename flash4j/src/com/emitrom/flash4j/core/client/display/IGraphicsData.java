/************************************************************************
  IGraphicsData.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.display;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This interface is used to define objects that can be used as parameters in
 * the flash.display.Graphics methods, including fills, strokes, and paths. Use
 * the implementor classes of this interface to create and manage drawing
 * property data, and to reuse the same data for different instances. Then, use
 * the methods of the Graphics class to render the drawing objects
 */
public interface IGraphicsData {
    public JavaScriptObject asIGraphicsData();
}
