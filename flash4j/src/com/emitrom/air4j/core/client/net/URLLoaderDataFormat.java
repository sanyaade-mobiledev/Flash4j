/************************************************************************
  URLLoaderDataFormat.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.net;

public enum URLLoaderDataFormat {
	BINARY("BINARY"), TEXT("TEXT"), VARIABLES("VARIABLES");

	public final String value;

	private URLLoaderDataFormat(String format) {
		value = createPeer(format);
	}

	private static native String createPeer(String format) /*-{
		return $wnd.runtime.flash.net.URLLoaderDataFormat[format];
	}-*/;

	public static native URLLoaderDataFormat fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.net.URLLoaderDataFormat.BINARY:
			return @com.emitrom.air4j.core.client.net.URLLoaderDataFormat::BINARY;
		case $wnd.runtime.flash.net.URLLoaderDataFormat.TEXT:
			return @com.emitrom.air4j.core.client.net.URLLoaderDataFormat::TEXT;
		case $wnd.runtime.flash.net.URLLoaderDataFormat.VARIABLES:
			return @com.emitrom.air4j.core.client.net.URLLoaderDataFormat::VARIABLES;
		}
	}-*/;
}
