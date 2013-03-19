/************************************************************************
  TabNavigator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class TabNavigator.
 */
public class TabNavigator extends ViewStack {

    /**
     * Instantiates a new tab navigator.
     */
    protected TabNavigator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the tab navigator
     */
    public TabNavigator() {
        jsObj = Bridge.createObject("mx.containers.TabNavigator");
    }

    /**
     * Gets the tab at.
     * 
     * @param index the index
     * @return the tab at
     */
    public native Button getTabAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getTabAt(index);
		return @com.emitrom.flash4j.flex.client.ui.mx.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
