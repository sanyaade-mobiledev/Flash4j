/************************************************************************
  StageQuality.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum StageQuality {

    BEST("BEST"), HIGH("HIGH"), LOW("LOW"), MEDIUM("MEDIUM");

    public final String value;

    private StageQuality(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.display.StageQuality[reference];
    }-*/;

    public static native StageQuality fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.display.StageQuality.BEST:
			return @com.emitrom.air4j.core.client.display.StageQuality::BEST;

		case $wnd.runtime.flash.display.StageQuality.HIGH:
			return @com.emitrom.air4j.core.client.display.StageQuality::HIGH;

		case $wnd.runtime.flash.display.StageQuality.LOW:
			return @com.emitrom.air4j.core.client.display.StageQuality::LOW;

		case $wnd.runtime.flash.display.StageQuality.MEDIUM:
			return @com.emitrom.air4j.core.client.display.StageQuality::MEDIUM;
		}
    }-*/;
}
