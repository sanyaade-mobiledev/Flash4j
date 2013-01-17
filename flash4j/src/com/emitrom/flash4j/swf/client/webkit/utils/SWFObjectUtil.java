/************************************************************************
  SWFObjectUtil.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.swf.client.webkit.utils;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SWFObjectUtil.
 */
public class SWFObjectUtil {

    /**
     * _get player version.
     * 
     * @return the java script object
     */
    private static native JavaScriptObject _getPlayerVersion() /*-{
		return $wnd.deconcept.SWFObjectUtil.getPlayerVersion();
    }-*/;

    /** The player version. */
    private static PlayerVersion playerVersion = null;

    /**
     * Gets the player version.
     * 
     * @return the player version
     */
    public static PlayerVersion getPlayerVersion() {
        if (playerVersion == null) {
            JavaScriptObject o = _getPlayerVersion();
            playerVersion = new PlayerVersion();
            playerVersion.deserialize(o);
        }
        return playerVersion;
    }

    /**
     * Checks if is version is valid.
     * 
     * @param neededVersion the needed version
     * @return true, if is version is valid
     */
    public static boolean isVersionIsValid(PlayerVersion neededVersion) {
        return getPlayerVersion().versionIsValid(neededVersion);
    }

    /**
     * Checks if is flash player installed.
     * 
     * @return true, if is flash player installed
     */
    public static boolean isFlashPlayerInstalled() {
        return !SWFObjectUtil.getPlayerVersion().toString().equals("0.0.0");
    }

}
