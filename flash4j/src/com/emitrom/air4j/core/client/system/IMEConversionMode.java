/************************************************************************
  IMEConversionMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.system;

public enum IMEConversionMode {
    ALPHANUMERIC_FULL("ALPHANUMERIC_FULL"), ALPHANUMERIC_HALF("ALPHANUMERIC_HALF"), CHINESE("CHINESE"), JAPANESE_HIRAGANA(
                    "JAPANESE_HIRAGANA"), JAPANESE_KATAKANA_FULL("JAPANESE_KATAKANA_FULL"), JAPANESE_KATAKANA_HALF(
                    "JAPANESE_KATAKANA_HALF"), KOREAN("KOREAN"), UNKNOWN("UNKNOWN");

    public final String value;

    private IMEConversionMode(String conversionMode) {
        value = createPeer(conversionMode);
    }

    private static native String createPeer(String conversionMode) /*-{
		return $wnd.runtime.flash.system.IMEConversionMode[conversionMode];
    }-*/;

    public static native IMEConversionMode fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.system.IMEConversionMode.ALPHANUMERIC_FULL:
			return @com.emitrom.air4j.core.client.system.IMEConversionMode::ALPHANUMERIC_FULL;

		case $wnd.runtime.flash.system.IMEConversionMode.ALPHANUMERIC_HALF:
			return @com.emitrom.air4j.core.client.system.IMEConversionMode::ALPHANUMERIC_HALF;

		case $wnd.runtime.flash.system.IMEConversionMode.CHINESE:
			return @com.emitrom.air4j.core.client.system.IMEConversionMode::CHINESE;

		case $wnd.runtime.flash.system.IMEConversionMode.JAPANESE_HIRAGANA:
			return @com.emitrom.air4j.core.client.system.IMEConversionMode::JAPANESE_HIRAGANA;

		case $wnd.runtime.flash.system.IMEConversionMode.JAPANESE_KATAKANA_FULL:
			return @com.emitrom.air4j.core.client.system.IMEConversionMode::JAPANESE_KATAKANA_FULL;

		case $wnd.runtime.flash.system.IMEConversionMode.JAPANESE_KATAKANA_HALF:
			return @com.emitrom.air4j.core.client.system.IMEConversionMode::JAPANESE_KATAKANA_HALF;

		case $wnd.runtime.flash.system.IMEConversionMode.KOREAN:
			return @com.emitrom.air4j.core.client.system.IMEConversionMode::KOREAN;

		case $wnd.runtime.flash.system.IMEConversionMode.UNKNOWN:
			return @com.emitrom.air4j.core.client.system.IMEConversionMode::UNKNOWN;
		}
    }-*/;
}
