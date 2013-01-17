/************************************************************************
  AirEntryPoint.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.toplevel;

import com.google.gwt.core.client.EntryPoint;

/**
 * Base class for bootstrapping a simple Adobe AIR application. It is
 * recommended to extend and implement the {@link #onLoad()} method.
 * 
 */
public abstract class AirEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        onLoad();
    }

    public abstract void onLoad();
}
