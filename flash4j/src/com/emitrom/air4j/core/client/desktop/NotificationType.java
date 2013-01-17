/************************************************************************
  NotificationType.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

/**
 * The NotificationType class defines constants for use in the priority
 * parameter of the DockIcon bounce() method and the type parameter of the
 * NativeWindow notifyUser() method.
 */

public enum NotificationType {

    CRITICAL("CRITICAL"), INFORMATIONAL("INFORMATIONAL");

    public final String value;

    private NotificationType(String state) {
        value = createPeer(state);
    }

    private native String createPeer(String state) /*-{
		return $wnd.runtime.flash.desktop.NotificationType[state];
    }-*/;

    public static native NotificationType fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.desktop.NotificationType.CRITICAL:
			return @com.emitrom.air4j.core.client.desktop.NotificationType::CRITICAL;

		case $wnd.runtime.flash.desktop.NotificationType.INFORMATIONAL:
			return @com.emitrom.air4j.core.client.desktop.NotificationType::INFORMATIONAL;
		}
    }-*/;
}
