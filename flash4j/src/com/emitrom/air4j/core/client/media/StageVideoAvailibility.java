/************************************************************************
  StageVideoAvailibility.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.media;

public enum StageVideoAvailibility {

    AVAILABLE("AVAILABLE"), UNAVAILABLE("UNAVAILABLE");

    public String value;

    private StageVideoAvailibility(String openMode) {
        value = createPeer(openMode);
    }

    private static native String createPeer(String capStyle) /*-{
		return $wnd.runtime.flash.display.StageVideoAvailibility[capStyle];
    }-*/;

    public static native StageVideoAvailibility fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.media.StageVideoAvailibility.AVAILABLE:
			return @com.emitrom.air4j.core.client.media.StageVideoAvailibility::AVAILABLE;

		case $wnd.runtime.flash.media.StageVideoAvailibility.UNAVAILABLE:
			return @com.emitrom.air4j.core.client.media.StageVideoAvailibility::UNAVAILABLE;
		}
    }-*/;

}