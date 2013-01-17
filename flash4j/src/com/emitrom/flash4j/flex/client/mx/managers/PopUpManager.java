/************************************************************************
  PopUpManager.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.managers;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.IFlexDisplayObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The PopUpManager singleton class creates new top-level windows and places or
 * removes those windows from the layer on top of all other visible windows. See
 * the SystemManager for a description of the layering. It is used for popup
 * dialogs, menus, and dropdowns in the ComboBox control and in similar
 * components. The PopUpManager also provides modality, so that windows below
 * the popup cannot receive mouse events, and also provides an event if the user
 * clicks the mouse outside the window so the developer can choose to dismiss
 * the window or warn the user.
 */
public class PopUpManager extends ProxyObject {

    private static final PopUpManager INSTANCE = new PopUpManager(Bridge.createObject("mx.managers.PopUpManager"));

    /**
     * Instantiates a new pop up manager.
     */
    protected PopUpManager(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Adds the pop up.
     * 
     * @param window the window
     * @param parent the parent
     * @param modal the modal
     */
    public static void addPopUp(IFlexDisplayObject window, DisplayObject parent, boolean modal) {
        create()._addPopUp(window.asIFlexDisplayObject(), parent, modal);
    }

    /**
     * Center pop up.
     * 
     * @param window the window
     */
    public static void centerPopUp(IFlexDisplayObject window) {
        create()._centerPopUp(window.asIFlexDisplayObject());
    }

    /**
     * Removes the pop up.
     * 
     * @param window the window
     */
    public static void removePopUp(IFlexDisplayObject window) {
        create()._removePopUp(window.asIFlexDisplayObject());
    }

    /**
     * Creates the.
     * 
     * @return the pop up manager
     */
    private static PopUpManager create() {
        return INSTANCE;
    }

    /**
     * _add pop up.
     * 
     * @param window the window
     * @param parent the parent
     * @param modal the modal
     */
    private final native void _addPopUp(JavaScriptObject window, DisplayObject parent, boolean modal)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addPopUp(
						window,
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						modal);
    }-*/;

    /**
     * _remove pop up.
     * 
     * @param window the window
     */
    private final native void _removePopUp(JavaScriptObject window)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removePopUp(window);
    }-*/;

    /**
     * _center pop up.
     * 
     * @param window the window
     */
    private final native void _centerPopUp(JavaScriptObject window)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.centerPopUp(window);
    }-*/;

}
