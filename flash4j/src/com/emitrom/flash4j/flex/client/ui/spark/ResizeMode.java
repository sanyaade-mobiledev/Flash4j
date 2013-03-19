/************************************************************************
 * ResizeMode.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.flex.client.ui.spark;

/**
 * The Enum ResizeMode.
 */
public enum ResizeMode {

    /** The N o_ scale. */
    NO_SCALE("noScale"),
    /** The SCALE. */
    SCALE("SCALE");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new resize mode.
     * 
     * @param type
     *            the type
     */
    private ResizeMode(String type) {
        value = type;
    }

    /**
     * From value.
     * 
     * @param value
     *            the value
     * @return the resize mode
     */
    public static native ResizeMode fromValue(String value) /*-{
		switch (value) {
		case 'noScale':
			return @com.emitrom.flash4j.flex.client.ui.spark.ResizeMode::NO_SCALE;
		case 'scale':
			return @com.emitrom.flash4j.flex.client.ui.spark.ResizeMode::SCALE;
		}
    }-*/;
}
