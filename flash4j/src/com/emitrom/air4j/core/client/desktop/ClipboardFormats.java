/************************************************************************
  ClipboardFormats.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.desktop;

public enum ClipboardFormats {

    BITMAP("BITMAP_FORMAT"), FILE_LIST("FILE_LIST_FORMAT"), HTML("HTML_FORMAT"), TEXT("TEXT_FORMAT"), RICH_TEXT(
                    "RICH_TEXT_FORMAT"), URL("URL_FORMAT");

    public final String value;

    private ClipboardFormats(String format) {
        value = createPeer(format);
    }

    private static native String createPeer(String format) /*-{
		return $wnd.runtime.flash.desktop.ClipboardFormats[format];
    }-*/;

    public static native ClipboardFormats fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.desktop.ClipboardFormats.BITMAP_FORMAT:
			return @com.emitrom.air4j.core.client.desktop.ClipboardFormats::BITMAP;
		case $wnd.runtime.flash.desktop.ClipboardFormats.FILE_LIST_FORMAT:
			return @com.emitrom.air4j.core.client.desktop.ClipboardFormats::FILE_LIST;
		case $wnd.runtime.flash.desktop.ClipboardFormats.HTML_FORMAT:
			return @com.emitrom.air4j.core.client.desktop.ClipboardFormats::HTML;
		case $wnd.runtime.flash.desktop.ClipboardFormats.TEXT_FORMAT:
			return @com.emitrom.air4j.core.client.desktop.ClipboardFormats::TEXT;
		case $wnd.runtime.flash.desktop.ClipboardFormats.URL_FORMAT:
			return @com.emitrom.air4j.core.client.desktop.ClipboardFormats::URL;
		}
    }-*/;
}
