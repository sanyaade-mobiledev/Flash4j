/************************************************************************
  ClipboardTransferMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum ClipboardTransferMode {

    CLONE_ONLY("CLONE_ONLY"), CLONE_PREFERRED("CLONE_PREFERRED"), ORIGINAL_ONLY("ORIGINAL_ONLY"), ORIGINAL_PREFERRED(
                    "ORIGINAL_PREFERRED");

    public final String value;

    private ClipboardTransferMode(String transferMode) {
        value = createPeer(transferMode);
    }

    private static native String createPeer(String transferMode) /*-{
		return $wnd.runtime.flash.desktop.ClipboardTransferMode[transferMode];
    }-*/;

    public static native ClipboardTransferMode fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.desktop.ClipboardTransferMode.CLONE_ONLY:
			return @com.emitrom.air4j.core.client.desktop.ClipboardTransferMode::CLONE_ONLY;

		case $wnd.runtime.flash.desktop.ClipboardTransferMode.CLONE_PREFERRED:
			return @com.emitrom.air4j.core.client.desktop.ClipboardTransferMode::CLONE_PREFERRED;

		case $wnd.runtime.flash.desktop.ClipboardTransferMode.ORIGINAL_ONLY:
			return @com.emitrom.air4j.core.client.desktop.ClipboardTransferMode::ORIGINAL_ONLY;

		case $wnd.runtime.flash.desktop.ClipboardTransferMode.ORIGINAL_PREFERRED:
			return @com.emitrom.air4j.core.client.desktop.ClipboardTransferMode::ORIGINAL_PREFERRED;
		}
    }-*/;
}
