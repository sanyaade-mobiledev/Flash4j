/************************************************************************
  CursorManager.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.ImageLoader;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The CursorManager class controls a prioritized list of cursors, where the
 * cursor with the highest priority is currently visible. If the cursor list
 * contains more than one cursor with the same priority, the Cursor Manager
 * displays the most recently created cursor. For example, if your application
 * performs processing that requires the user to wait until the processing
 * completes, you can change the cursor so that it reflects the waiting period.
 * In this case, you can change the cursor to an hourglass or other image.
 * <p>
 * You also might want to change the cursor to provide feedback to the user to
 * indicate the actions that the user can perform. For example, you can use one
 * cursor image to indicate that user input is enabled, and another to indicate
 * that input is disabled. You can use a JPEG, GIF, PNG, or SVG image, a Sprite
 * object, or a SWF file as the cursor image.
 * <p>
 * All methods and properties of the CursorManager are static, so you do not
 * need to create an instance of it.
 * <p>
 * In AIR, each mx.core.Window instance uses its own instance of the
 * CursorManager class. Instead of directly referencing the static methods and
 * properties of the CursorManager class, use the Window.cursorManager property
 * to reference the CursorManager instance for the Window instance.
 */
public class CursorManager extends ProxyObject {

    private static final CursorManager INSTANCE = new CursorManager(Bridge.createObject("mx.managers.CursorManager"));

    /**
     * Instantiates a new cursor manager.
     */
    protected CursorManager(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the cursor manager
     */
    private static CursorManager create() {
        return INSTANCE;
    }

    /**
     * Sets the busy cursor.
     */
    public static void setBusyCursor() {
        create()._setBusyCursor();
    }

    /**
     * Sets the cursor.
     * 
     * @param imagePath the new cursor
     */
    public static void setCursor(String imagePath) {
        setCursor0(ImageLoader.loadIcon(imagePath));
    }

    /**
     * Sets the cursor0.
     * 
     * @param value the new cursor0
     */
    public static void setCursor0(Object value) {
        create()._setCursor(value);
    }

    /**
     * _set busy cursor.
     */
    private final native void _setBusyCursor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setBusyCursor();
    }-*/;

    /**
     * Removes the busy cursor.
     */
    public static void removeBusyCursor() {
        create()._removeBusyCursor();
    }

    /**
     * _remove busy cursor.
     */
    private final native void _removeBusyCursor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeBusyCursor();
    }-*/;

    /**
     * Show cursor.
     */
    public static void showCursor() {
        create()._showCursor();
    }

    /**
     * _show cursor.
     */
    private final native void _showCursor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.showCursor();
    }-*/;

    /**
     * _set cursor.
     * 
     * @param value the value
     */
    private final native void _setCursor(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setCursor(value);
    }-*/;

}
