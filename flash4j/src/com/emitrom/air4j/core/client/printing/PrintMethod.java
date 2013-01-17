/************************************************************************
  PrintMethod.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum PrintMethod {

    AUTO("AUTO"), BITMAP("BITMAP"), VECTOR("VECTOR");

    public final String value;

    private PrintMethod(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.printing.PrintMethod[reference];
    }-*/;

    public static native PrintMethod fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.printing.PrintMethod.AUTO:
			return @com.emitrom.air4j.core.client.printing.PrintMethod::AUTO;

		case $wnd.runtime.flash.printing.PrintMethod.BITMAP:
			return @com.emitrom.air4j.core.client.printing.PrintMethod::BITMAP;

		case $wnd.runtime.flash.printing.PrintMethod.VECTOR:
			return @com.emitrom.air4j.core.client.printing.PrintMethod::VECTOR;

		}
    }-*/;

}
