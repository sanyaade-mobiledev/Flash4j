/************************************************************************
  GesturePhase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.events;

enum GesturePhase {

    ALL("ALL"), BEGIN("BEGIN"), END("END"), UPDATE("UPDATE");

    public final String value;

    private GesturePhase(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.events.GesturePhase[reference];
    }-*/;

    public static native GesturePhase fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.events.GesturePhase.ALL:
			return @com.emitrom.air4j.core.client.events.GesturePhase::ALL;

		case $wnd.runtime.flash.events.GesturePhase.BEGIN:
			return @com.emitrom.air4j.core.client.events.GesturePhase::BEGIN;

		case $wnd.runtime.flash.events.GesturePhase.END:
			return @com.emitrom.air4j.core.client.events.GesturePhase::END;

		case $wnd.runtime.flash.events.GesturePhase.UPDATE:
			return @com.emitrom.air4j.core.client.events.GesturePhase::UPDATE;

		}
    }-*/;

}
