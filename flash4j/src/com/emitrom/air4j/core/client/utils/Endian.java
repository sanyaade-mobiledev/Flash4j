/************************************************************************
  Endian.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.utils;

public enum Endian {

    BIG_ENDIAN("BIG_ENDIAN"), LITTLE_ENDIAN("LITTLE_ENDIAN");

    public final String value;

    private Endian(String value) {
        this.value = createPeer(value);
    }

    private static native String createPeer(String value) /*-{
		return $wnd.runtime.flash.utils.Endian[value];
    }-*/;

    public static native Endian fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.utils.Endian.BIG_ENDIAN:
			return @com.emitrom.air4j.core.client.utils.Endian::BIG_ENDIAN;

		case $wnd.runtime.flash.utils.Endian.LITTLE_ENDIAN:
			return @com.emitrom.air4j.core.client.utils.Endian::LITTLE_ENDIAN;
		}
    }-*/;
}
