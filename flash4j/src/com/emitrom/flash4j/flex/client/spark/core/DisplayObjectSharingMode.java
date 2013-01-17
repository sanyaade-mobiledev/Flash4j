/************************************************************************
  DisplayObjectSharingMode.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.core;

/**
 * The Enum DisplayObjectSharingMode.
 */
public enum DisplayObjectSharingMode {

    /** The OWN s_ share d_ object. */
    OWNS_SHARED_OBJECT("ownsSharedObject"),
    /** The OWN s_ unshare d_ object. */
    OWNS_UNSHARED_OBJECT("ownsUnsharedObject"),
    /** The USE s_ share d_ object. */
    USES_SHARED_OBJECT("usesSharedObject");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new display object sharing mode.
     * 
     * @param mode the mode
     */
    private DisplayObjectSharingMode(String mode) {
        value = mode;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the display object sharing mode
     */
    public static native DisplayObjectSharingMode fromValue(String value) /*-{
		switch (value) {
		case 'ownsSharedObject':
			return @com.emitrom.flash4j.flex.client.spark.core.DisplayObjectSharingMode::OWNS_SHARED_OBJECT;
		case 'ownsUnsharedObject':
			return @com.emitrom.flash4j.flex.client.spark.core.DisplayObjectSharingMode::OWNS_UNSHARED_OBJECT;
		case 'usesSharedObject':
			return @com.emitrom.flash4j.flex.client.spark.core.DisplayObjectSharingMode::USES_SHARED_OBJECT;
		}
    }-*/;
}
