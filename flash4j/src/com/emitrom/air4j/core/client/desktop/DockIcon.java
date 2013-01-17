/************************************************************************
  DockIcon.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The DockIcon class represents the Mac OS style dock icon.
 * <p>
 * You can use the DockIcon class to change the appearance of the standard icon;
 * for example, to animate the icon or add informational graphics. You can also
 * add items to the dock icon menu. The menu items that you add are displayed
 * above the standard menu items.
 * <p>
 * An instance of the DockIcon class cannot be created. Get the object
 * representing the operating system dock icon from NativeApplication.getIcon().
 * <p>
 * Not all operating systems have dock icons. Check
 * NativeApplication.supportsDockIcon to determine whether dock icons are
 * supported on the current system. If dock icons are supported, the
 * NativeApplication.icon property is of type DockIcon. Otherwise, the type of
 * NativeApplication.icon is another subclass of InteractiveIcon, typically
 * SystemTrayIcon.
 * <p>
 * <b>Important:</b> Attempting to call a DockIcon class method on the
 * NativeApplication.icon object on an operating system for which AIR does not
 * support dock icons generates a run-time exception.
 */
public class DockIcon extends InteractiveIcon {

    private static DockIcon INSTANCE = null;

    public static DockIcon get() {
        assert NativeApplication.supportsDockIcon();
        if (INSTANCE == null) {
            JavaScriptObject o = NativeApplication.get().getIcon().getJsObj();
            INSTANCE = new DockIcon(o);
        }
        return INSTANCE;
    }

    protected DockIcon() {
    }

    private DockIcon(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Notifies the user that an event has occurred that may require attention.
     */
    public native void bounce() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bounce();
    }-*/;

    /**
     * Notifies the user that an event has occurred that may require attention.
     * with the given priority
     * 
     * @param priority
     */
    public void bounce(NotificationType priority) {
        _bounce(priority.value);
    }

    private native void _bounce(String priority) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bounce(priority);
    }-*/;
}
