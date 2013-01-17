/************************************************************************
  MouseCursor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.ui;

public enum MouseCursor {

    ARROW("ARROW"), AUTO("AUTO"), BUTTON("BUTTON"), HAND("HAND"), IBEAM("IBEAM");

    public final String value;

    private MouseCursor(String codec) {
        value = createPeer(codec);
    }

    private static native String createPeer(String codec) /*-{
		return $wnd.runtime.flash.ui.MouseCursor[codec];
    }-*/;

    public static native MouseCursor fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.ui.MouseCursor.ARROW:
			return @com.emitrom.air4j.core.client.ui.MouseCursor::ARROW;
		case $wnd.runtime.flash.ui.MouseCursor.AUTO:
			return @com.emitrom.air4j.core.client.ui.MouseCursor::AUTO;
		case $wnd.runtime.flash.ui.MouseCursor.BUTTON:
			return @com.emitrom.air4j.core.client.ui.MouseCursor::BUTTON;
		case $wnd.runtime.flash.ui.MouseCursor.HAND:
			return @com.emitrom.air4j.core.client.ui.MouseCursor::HAND;
		case $wnd.runtime.flash.ui.MouseCursor.IBEAM:
			return @com.emitrom.air4j.core.client.ui.MouseCursor::IBEAM;
		}
    }-*/;
}
