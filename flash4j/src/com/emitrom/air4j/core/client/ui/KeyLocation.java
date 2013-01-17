/************************************************************************
  KeyLocation.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum KeyLocation {

    STANDARD("STANDARD"), LEFT("LEFT"), RIGHT("RIGHT"), D_PAD("D_PAD"), NUM_PAD("NUM_PAD");

    public final int value;

    private KeyLocation(String value) {
        this.value = createPeer(value);
    }

    private static native int createPeer(String value) /*-{
		return $wnd.runtime.flash.ui.KeyLocation[value];
    }-*/;

    public static native KeyLocation fromValue(int value) /*-{
		switch (value) {
		case $wnd.runtime.flash.ui.KeyLocation.STANDARD:
			return @com.emitrom.air4j.core.client.ui.KeyLocation::STANDARD;
		case $wnd.runtime.flash.ui.KeyLocation.LEFT:
			return @com.emitrom.air4j.core.client.ui.KeyLocation::LEFT;
		case $wnd.runtime.flash.ui.KeyLocation.RIGHT:
			return @com.emitrom.air4j.core.client.ui.KeyLocation::RIGHT;
		case $wnd.runtime.flash.ui.KeyLocation.NUM_PAD:
			return @com.emitrom.air4j.core.client.ui.KeyLocation::NUM_PAD;
		case $wnd.runtime.flash.ui.KeyLocation.D_PAD:
			return @com.emitrom.air4j.core.client.ui.KeyLocation::D_PAD;
		}
    }-*/;
}
