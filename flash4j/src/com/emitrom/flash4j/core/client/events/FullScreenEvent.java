/************************************************************************
  FullScreenEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FullScreenEvent.
 */
public class FullScreenEvent extends ActivityEvent {

    /** The Constant FULL_SCREEN. */
    public static String FULL_SCREEN = "fullScreen";

    /**
     * Instantiates a new full screen event.
     */
    protected FullScreenEvent() {
    }

    FullScreenEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Checks if is full screen.
     * 
     * @return true, if is full screen
     */
    public native boolean isFullScreen() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return this.getfullScreen();
    }-*/;

    public static FullScreenEvent cast(Event event) {
        return new FullScreenEvent(event.getJsObj());
    }

}
