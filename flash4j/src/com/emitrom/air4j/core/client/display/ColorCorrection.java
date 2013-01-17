/************************************************************************
  ColorCorrection.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum ColorCorrection {
    DEFAULT("DEFAULT"), OFF("OFF"), ON("ON");

    public final String value;

    private ColorCorrection(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.display.ColorCorrection[reference];
    }-*/;

    public static native ColorCorrection fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.display.ColorCorrection.DEFAULT:
			return @com.emitrom.air4j.core.client.display.ColorCorrection::DEFAULT;
		case $wnd.runtime.flash.display.ColorCorrection.OFF:
			return @com.emitrom.air4j.core.client.display.ColorCorrection::OFF;
		case $wnd.runtime.flash.display.ColorCorrection.ON:
			return @com.emitrom.air4j.core.client.display.ColorCorrection::ON;
		}
    }-*/;
}
