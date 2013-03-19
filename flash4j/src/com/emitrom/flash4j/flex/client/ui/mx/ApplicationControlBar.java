/************************************************************************
  ApplicationControlBar.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ApplicationControlBar.
 */
public class ApplicationControlBar extends ControlBar {

    /**
     * Instantiates a new application control bar.
     */
    protected ApplicationControlBar(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the application control bar
     */
    public ApplicationControlBar() {
        jsObj = Bridge.createObject("mx.containers.ApplicationControlBar");
    }

    /**
     * Checks if is dock.
     * 
     * @return true, if is dock
     */
    public final native boolean isDock()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdock();
    }-*/;

    /**
     * Sets the dock.
     * 
     * @param value the new dock
     */
    public final native void setDock(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdock(value);
    }-*/;

}
