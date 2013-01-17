/************************************************************************
  StageScaleMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum StageScaleMode {

    EXACT_FIT("EXACT_FIT"), NO_BORDER("NO_BORDER"), NO_SCALE("NO_SCALE"), SHOW_ALL("SHOW_ALL");

    public final String value;

    private StageScaleMode(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.display.StageScaleMode[reference];
    }-*/;

    public static native StageScaleMode fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.display.StageScaleMode.EXACT_FIT:
			return @com.emitrom.air4j.core.client.display.StageScaleMode::EXACT_FIT;

		case $wnd.runtime.flash.display.StageScaleMode.NO_BORDER:
			return @com.emitrom.air4j.core.client.display.StageScaleMode::NO_BORDER;

		case $wnd.runtime.flash.display.StageScaleMode.NO_SCALE:
			return @com.emitrom.air4j.core.client.display.StageScaleMode::NO_SCALE;

		case $wnd.runtime.flash.display.StageScaleMode.SHAW_ALL:
			return @com.emitrom.air4j.core.client.display.StageScaleMode::SHOW_ALL;

		}
    }-*/;

}
