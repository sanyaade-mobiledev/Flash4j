/************************************************************************
  SystemIdleMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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


/**
 * The SystemIdleMode class provides constant values for system idle behaviors.
 * These constants are used in the systemIdleMode property of the
 * NativeApplication class
 */
public enum SystemIdleMode {

    KEEP_AWAKE("KEEP_AWAKE"), NORMAL("NORMAL");

    public final String value;

    private SystemIdleMode(String state) {
        value = createPeer(state);
    }

    private native String createPeer(String state) /*-{
		return $wnd.runtime.flash.desktop.SystemIdleMode[state];
    }-*/;

    public static native SystemIdleMode fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.desktop.SystemIdleMode.KEEP_AWAKE:
			return @com.emitrom.air4j.core.client.desktop.SystemIdleMode::KEEP_AWAKE;

		case $wnd.runtime.flash.desktop.SystemIdleMode.NORMAL:
			return @com.emitrom.air4j.core.client.desktop.SystemIdleMode::NORMAL;
		}
    }-*/;

}
