/************************************************************************
  InteractiveIcon.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The InteractiveIcon class is the base class for the operating system icons
 * associated with applications.
 * <p>
 * Use the icon property of the NativeApplication object to get an instance of
 * the application icon. The icon type will be one of the subclasses of
 * InteractiveIcon, either DockIcon on Mac OS X or SystemTrayIcon on Windows and
 * Linux.
 * <p>
 * You cannot instantiate the InteractiveIcon class directly. Calls to the new
 * InteractiveIcon() constructor will throw an ArgumentError exception.
 * 
 * 
 */
public class InteractiveIcon extends Icon {

    protected InteractiveIcon() {
    }

    protected InteractiveIcon(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.height;
    }-*/;

    public native int getWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.width;
    }-*/;
}
