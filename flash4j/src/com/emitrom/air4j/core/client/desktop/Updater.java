/************************************************************************
  Updater.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.filesystem.File;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>
 * The Updater class is used to update the currently running application with a
 * different version. To use it, instantiate an Updater object and then call its
 * update() method.
 * <p>
 * The Updater class is only supported in the desktop profile. It is not
 * supported for extended desktop applications (applications installed with a
 * native installer), and it is not supported on the AIR mobile profile or AIR
 * for TV profiles. Check the Updater.isSupported property.
 * <p>
 * Extended desktop application (applications installed with a native installer)
 * can download a new version of the native installer and launch it using the
 * File.openWithDefaultApplication() method. *
 */
public final class Updater extends ProxyObject {

    public Updater() {
        jsObj = createNativePeer();
    }

    private native JavaScriptObject createNativePeer() /*-{
		return new $wnd.runtime.flash.desktop.Updater();
    }-*/;

    /**
     * Updates the currently running application with the version of the
     * application contained in the specified AIR file.
     * 
     * @param file
     * @param version
     */
    public final native void update(File file, String version) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.update(
				file.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				version);
    }-*/;

    /**
     * The isSupported property is set to true if the Updater class is available
     * on the current platform, otherwise it is set to false.
     * 
     * @return
     */
    public static native boolean isSupported() /*-{
		$wnd.runtime.flash.desktop.Updater.isSupported;
    }-*/;
}
