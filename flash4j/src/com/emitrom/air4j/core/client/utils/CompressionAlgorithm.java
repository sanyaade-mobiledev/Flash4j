/************************************************************************
  CompressionAlgorithm.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum CompressionAlgorithm {

    DEFLATE("DEFLATE"), ZLIB("ZLIB");

    public final String value;

    private CompressionAlgorithm(String value) {
        this.value = createPeer(value);
    }

    private static native String createPeer(String value) /*-{
		return $wnd.runtime.flash.utils.CompressionAlgorithm[value];
    }-*/;

    public static native CompressionAlgorithm fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.utils.CompressionAlgorithm.DEFLATE:
			return @com.emitrom.air4j.core.client.utils.CompressionAlgorithm::DEFLATE;

		case $wnd.runtime.flash.utils.CompressionAlgorithm.ZLIB:
			return @com.emitrom.air4j.core.client.utils.CompressionAlgorithm::ZLIB;
		}
    }-*/;
}
