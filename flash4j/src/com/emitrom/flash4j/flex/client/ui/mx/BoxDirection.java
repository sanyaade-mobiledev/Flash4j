/************************************************************************
 * BoxDirection.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.ui.mx;

/**
 * The Enum BoxDirection.
 */
public enum BoxDirection {

    /** The HORIZONTAL. */
    HORIZONTAL("horizontal"),
    /** The VERTICAL. */
    VERTICAL("vertical");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new box direction.
     * 
     * @param direction
     *            the direction
     */
    private BoxDirection(String direction) {
        value = direction;
    }

    /**
     * From value.
     * 
     * @param value
     *            the value
     * @return the box direction
     */
    public static native BoxDirection fromValue(String value) /*-{
		switch (value) {
		case 'horizontal':
			return @com.emitrom.flash4j.flex.client.ui.mx.BoxDirection::HORIZONTAL;
		case 'vertical':
			return @com.emitrom.flash4j.flex.client.ui.mx.BoxDirection::VERTICAL
		}
    }-*/;
}
