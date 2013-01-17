/************************************************************************
  TriangleCulling.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum TriangleCulling {

    NEGATIVE("NEGATIVE"), NONE("NONE"), POSITIVE("POSITIVE");

    public final String value;

    private TriangleCulling(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.display.TriangleCulling[reference];
    }-*/;

    public static native TriangleCulling fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.display.TriangleCulling.NEGATIVE:
			return @com.emitrom.air4j.core.client.display.TriangleCulling::NEGATIVE;

		case $wnd.runtime.flash.display.TriangleCulling.NONE:
			return @com.emitrom.air4j.core.client.display.TriangleCulling::NONE;

		case $wnd.runtime.flash.display.TriangleCulling.POSITIVE:
			return @com.emitrom.air4j.core.client.display.TriangleCulling::POSITIVE;

		}
    }-*/;

}
