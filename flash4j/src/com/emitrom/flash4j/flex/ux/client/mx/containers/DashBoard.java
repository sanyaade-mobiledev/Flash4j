/************************************************************************
  DashBoard.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.ui.mx.Canvas;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DashBoard.
 */
public class DashBoard extends Canvas {

    /**
     * Instantiates a new dash board.
     */
    protected DashBoard(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the dash board
     */
    public DashBoard() {
        jsObj = Bridge.createObject("com.ekambi.gwt.components.DashBoard");
    }

    /**
     * Adds the dashboard item.
     * 
     * @param item the item
     */
    public native void addDashboardItem(DashBoardItem item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addDashboardItem(item.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds the dashboard item.
     * 
     * @param item the item
     * @param maximized the maximized
     */
    public native void addDashboardItem(DashBoardItem item, boolean maximized)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addDashboardItem(
						item.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						maximized);
    }-*/;

}
