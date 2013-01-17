/************************************************************************
  SuperTab.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls.tabBarClasses;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SuperTab.
 */
public class SuperTab extends ProxyObject {

    /** The Constant CLOSE_ALWAYS. */
    public static final String CLOSE_ALWAYS = "close_always";

    /** The Constant CLOSE_NEVER. */
    public static final String CLOSE_NEVER = "close_never";

    /** The Constant CLOSE_ROLLOVER. */
    public static final String CLOSE_ROLLOVER = "close_rollOver";

    /** The Constant CLOSE_SELECTED. */
    public static final String CLOSE_SELECTED = "close_selected";

    /** The Constant CLOSE_TAB_EVENT. */
    public static final String CLOSE_TAB_EVENT = "closeTab";

    /**
     * Instantiates a new super tab.
     */
    protected SuperTab(JavaScriptObject obj) {
        jsObj = obj;
    }
}
