/************************************************************************
  PrintJobOrientation.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.printing;

public enum PrintJobOrientation {

    LANDSCAPE("LANDSCAPE"), PORTRAIT("PORTRAIT");

    public final String value;

    private PrintJobOrientation(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.printing.PrintJobOrientation[reference];
    }-*/;

    public static native PrintJobOrientation fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.filesystem.printing.PrintJobOrientation.LANDSCAPE:
			return @com.emitrom.air4j.core.client.printing.PrintJobOrientation::LANDSCAPE;

		case $wnd.runtime.flash.filesystem.printing.PrintJobOrientation.PORTRAIT:
			return @com.emitrom.air4j.core.client.printing.PrintJobOrientation::PORTRAIT;

		}
    }-*/;

}
