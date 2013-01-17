/************************************************************************
  BlendMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum BlendMode {

    ADD("ADD"), ALPHA("ALPHA"), DARKEN("DARKEN"), DIFFERENCE("DIFFERENCE"), ERASE("ERASE"), HARDLIGHT("HARDLIGHT"), INVERT(
                    "INVERT"), LAYER("LAYER"), LIGHTEN("LIGHTEN"), MULTIPLY("MULTIPLY"), NORMAL("NORMAL"), OVERLAY(
                    "OVERLAY"), SCREEN("SCREEN"), SHADER("SHADER"), SUBTRACT("SUBTRACT");

    public String value;

    private BlendMode(String mode) {
        this.value = createPeer(mode);
    }

    private static native String createPeer(String mode) /*-{
		return $wnd.runtime.flash.display.BlendMode[mode];
    }-*/;

    public static native BlendMode fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.display.BlendMode.ADD:
			return @com.emitrom.air4j.core.client.display.BlendMode::ADD;

		case $wnd.runtime.flash.display.BlendMode.ALPHA:
			return @com.emitrom.air4j.core.client.display.BlendMode::ALPHA;

		case $wnd.runtime.flash.display.BlendMode.DARKEN:
			return @com.emitrom.air4j.core.client.display.BlendMode::DARKEN;

		case $wnd.runtime.flash.display.BlendMode.DIFFERENCE:
			return @com.emitrom.air4j.core.client.display.BlendMode::DIFFERENCE;

		case $wnd.runtime.flash.display.BlendMode.ERASE:
			return @com.emitrom.air4j.core.client.display.BlendMode::ERASE;

		case $wnd.runtime.flash.display.BlendMode.HARDLIGHT:
			return @com.emitrom.air4j.core.client.display.BlendMode::HARDLIGHT;

		case $wnd.runtime.flash.display.BlendMode.INVERT:
			return @com.emitrom.air4j.core.client.display.BlendMode::INVERT;

		case $wnd.runtime.flash.display.BlendMode.LAYER:
			return @com.emitrom.air4j.core.client.display.BlendMode::LAYER;

		case $wnd.runtime.flash.display.BlendMode.LIGHTEN:
			return @com.emitrom.air4j.core.client.display.BlendMode::LIGHTEN;

		case $wnd.runtime.flash.display.BlendMode.MULTIPLY:
			return @com.emitrom.air4j.core.client.display.BlendMode::MULTIPLY;

		case $wnd.runtime.flash.display.BlendMode.NORMAL:
			return @com.emitrom.air4j.core.client.display.BlendMode::NORMAL;

		case $wnd.runtime.flash.display.BlendMode.OVERLAY:
			return @com.emitrom.air4j.core.client.display.BlendMode::OVERLAY;

		case $wnd.runtime.flash.display.BlendMode.SCREEN:
			return @com.emitrom.air4j.core.client.display.BlendMode::SCREEN

		case $wnd.runtime.flash.display.BlendMode.SHADER:
			return @com.emitrom.air4j.core.client.display.BlendMode::SHADER;

		case $wnd.runtime.flash.display.BlendMode.SUBSTRACT:
			return @com.emitrom.air4j.core.client.display.BlendMode::SUBTRACT;

		}
    }-*/;

}
