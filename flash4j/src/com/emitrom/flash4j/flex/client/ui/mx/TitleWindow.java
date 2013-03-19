/************************************************************************
  TitleWindow.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class TitleWindow.
 */
public class TitleWindow extends Panel {

    /**
     * Instantiates a new title window.
     */
    protected TitleWindow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the title window
     */
    public TitleWindow() {
        jsObj = Bridge.createObject("mx.containers.TitleWindow");
        setWidth(400);
        setHeight(400);
        setTitle("Title Window");
    }

    /**
     * New instance.
     * 
     * @param title the title
     * @return the title window
     */
    public TitleWindow(String title) {
        this();
        setTitle(title);
    }

    /**
     * Show close button.
     * 
     * @return true, if successful
     */
    public native boolean showCloseButton() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getShowCloseButton();
    }-*/;

    /**
     * Sets the show close button.
     * 
     * @param value the new show close button
     */
    public native void setShowCloseButton(boolean value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setShowCloseButton(value);
    }-*/;
}
