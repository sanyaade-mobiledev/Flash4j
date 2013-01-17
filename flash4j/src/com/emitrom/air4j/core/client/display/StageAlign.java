/************************************************************************
  StageAlign.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.display;

public enum StageAlign {

    BOTTOM("BOTTOM"), BOTTOM_LEFT("BOTTOM_LEFT"), BOTTOM_RIGHT("BOTTOM_RIGHT"), LEFT("LEFT"), RIGHT("RIGHT"), TOP("TOP"), TOP_LEFT(
                    "TOP_LEFT"), TOP_RIGHT("TOP_RIGHT");

    public final String value;

    private StageAlign(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.display.StageAlign[reference];
    }-*/;

    public static native StageAlign fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.display.StageAlign.BOTTOM:
			return @com.emitrom.air4j.core.client.display.StageAlign::BOTTOM;

		case $wnd.runtime.flash.display.StageAlign.BOTTOM_LEFT:
			return @com.emitrom.air4j.core.client.display.StageAlign::BOTTOM_LEFT;

		case $wnd.runtime.flash.display.StageAlign.BOTTOM_RIGHT:
			return @com.emitrom.air4j.core.client.display.StageAlign::BOTTOM_RIGHT;

		case $wnd.runtime.flash.display.StageAlign.LEFT:
			return @com.emitrom.air4j.core.client.display.StageAlign::LEFT;

		case $wnd.runtime.flash.display.StageAlign.RIGHT:
			return @com.emitrom.air4j.core.client.display.StageAlign::RIGHT;

		case $wnd.runtime.flash.display.NativeWindowResize.TOP:
			return @com.emitrom.air4j.core.client.display.NativeWindowResize::TOP;

		case $wnd.runtime.flash.display.StageAlign.TOP_LEFT:
			return @com.emitrom.air4j.core.client.display.StageAlign::TOP_LEFT;

		case $wnd.runtime.flash.display.StageAlign.TOP_RIGHT:
			return @com.emitrom.air4j.core.client.display.StageAlign::TOP_RIGHT;
		}
    }-*/;

}
