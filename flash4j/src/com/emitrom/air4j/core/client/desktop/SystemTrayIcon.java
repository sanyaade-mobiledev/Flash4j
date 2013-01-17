/************************************************************************
  SystemTrayIcon.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.desktop;

import com.emitrom.air4j.core.client.display.NativeMenu;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The SystemTrayIcon class represents the Windows taskbar notification area
 * (system tray)-style icon. AIR profile support: peer feature is supported on
 * desktop operating systems, but it is not supported on mobile devices or AIR
 * for TV devices. See AIR Profile Support for more information regarding API
 * support across multiple profiles.
 * <p>
 * Not all desktop operating systems have system tray icons. Check
 * NativeApplication.supportsSystemTrayIcon to determine whether system tray
 * icons are supported on the current system.
 * <p>
 * An instance of the SystemTrayIcon class cannot be created. Get the object
 * representing the system tray icon from the icon property of the "global"
 * NativeApplication object.
 * <p>
 * When system tray icons are supported, the icon will be of type
 * SystemTrayIcon. Otherwise, the type of icon will be another subclass of
 * InteractiveIcon, typically DockIcon.
 * <p>
 * <b>Important:</b> Attempting to call a SystemTrayIcon class method on the
 * NativeApplication.icon object on an operating system for which AIR does not
 * support system tray icons will generate a run-time exception.
 */
public class SystemTrayIcon extends InteractiveIcon {

    public static int MAX_TIP_LENGTH = getConstantInt("MAX_TIP_LENGTH");
    private static SystemTrayIcon INSTANCE = null;

    public static SystemTrayIcon get() {
        assert NativeApplication.supportsSystemTrayIcon();
        if (INSTANCE == null) {
            INSTANCE = new SystemTrayIcon(NativeApplication.get().getIcon().getJsObj());
        }
        return INSTANCE;
    }

    private SystemTrayIcon(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected SystemTrayIcon() {
    }

    /**
     * The system tray icon menu.
     * 
     * @return
     */
    public native NativeMenu getMenu() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.menu;
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);

    }-*/;

    /**
     * The system tray icon menu.
     * 
     * @param menu
     */
    public native void setMenu(NativeMenu menu) /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.menu = menu.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * The tooltip that pops up for the system tray icon.
     * 
     * @return
     */
    public native String getTooltip() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tooltip;
    }-*/;

    /**
     * The tooltip that pops up for the system tray icon.
     * 
     * @param tooltip
     */
    public native void setTooltip(String tooltip) /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.tooltip = tooltip;
    }-*/;

    private static native int getConstantInt(String name) /*-{
		return $wnd.runtime.flash.desktop.SystemTrayIcon[name];
    }-*/;

}
