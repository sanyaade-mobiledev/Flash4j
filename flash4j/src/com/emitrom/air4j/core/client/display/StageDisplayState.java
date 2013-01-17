/************************************************************************
  StageDisplayState.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum StageDisplayState {

    FULL_SCREEN("FULL_SCREEN"), FULL_SCREEN_INTERACTIVE("FULL_SCREEN_INTERACTIVE"), NORMAL("NORMAL");

    public final String value;

    private StageDisplayState(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.display.StageDisplayState[reference];
    }-*/;

    public static native StageDisplayState fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.display.StageDisplayState.FULL_SCREEN:
			return @com.emitrom.air4j.core.client.display.StageDisplayState::FULL_SCREEN;
		case $wnd.runtime.flash.display.StageDisplayState.FULL_SCREEN_INTERACTIVE:
			return @com.emitrom.air4j.core.client.display.StageDisplayState::FULL_SCREEN_INTERACTIVE;
		case $wnd.runtime.flash.display.StageDisplayState.NORMAL:
			return @com.emitrom.air4j.core.client.display.StageDisplayState::NORMAL;
		}
    }-*/;
}
