/************************************************************************
  KeyboardModifier.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum KeyboardModifier {
    ALTERNATE("ALTERNATE"), COMMAND("COMMAND"), CONTROL("CONTROL");

    public final int value;

    private KeyboardModifier(String value) {
        this.value = createPeer(value);
    }

    private static native int createPeer(String value) /*-{
		return $wnd.runtime.flash.ui.Keyboard[value];
    }-*/;

    public static native KeyboardModifier fromValue(int value) /*-{
		switch (value) {
		case $wnd.runtime.flash.ui.Keyboad.ALTERNATE:
			return @com.emitrom.air4j.core.client.ui.KeyboardModifier::ALTERNATE;

		case $wnd.runtime.flash.ui.Keyboad.COMMAND:
			return @com.emitrom.air4j.core.client.ui.KeyboardModifier::COMMAND;

		case $wnd.runtime.flash.ui.Keyboad.CONTROL:
			return @com.emitrom.air4j.core.client.ui.KeyboardModifier::CONTROL;

		}
    }-*/;
}
