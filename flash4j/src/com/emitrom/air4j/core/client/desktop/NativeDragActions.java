/************************************************************************
  NativeDragActions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum NativeDragActions {
    COPY("COPY"),

    LINK("LINK"), MOVE("MOVE"), NONE("NONE");

    public final String value;

    private NativeDragActions(String action) {
        value = createPeer(action);
    }

    private static native String createPeer(String action) /*-{
		return $wnd.runtime.flash.desktop.NativeDragActions[action];
    }-*/;

    public static native NativeDragActions fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.desktop.NativeDragActions.COPY:
			return @com.emitrom.air4j.core.client.desktop.NativeDragActions::COPY;

		case $wnd.runtime.flash.desktop.NativeDragActions.LINK:
			return @com.emitrom.air4j.core.client.desktop.NativeDragActions::LINK;

		case $wnd.runtime.flash.desktop.NativeDragActions.MOVE:
			return @com.emitrom.air4j.core.client.desktop.NativeDragActions::MOVE;

		case $wnd.runtime.flash.desktop.NativeDragActions.NONE:
			return @com.emitrom.air4j.core.client.desktop.NativeDragActions::NONE;
		}
    }-*/;
}
