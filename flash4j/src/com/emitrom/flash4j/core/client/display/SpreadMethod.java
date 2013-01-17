/************************************************************************
  SpreadMethod.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.display;

/**
 * The Enum SpreadMethod.
 */
public enum SpreadMethod {

    /** The PAD. */
    PAD("pad"),
    /** The REFLECT. */
    REFLECT("reflect"),
    /** The REPEAT. */
    REPEAT("repeat");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new spread method.
     * 
     * @param reference the reference
     */
    private SpreadMethod(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the spread method
     */
    public static native SpreadMethod fromValue(String value) /*-{
		switch (value) {

		case 'pad':
			return @com.emitrom.flash4j.core.client.display.SpreadMethod::PAD;

		case 'reflect':
			return @com.emitrom.flash4j.core.client.display.SpreadMethod::REFLECT;

		case 'repeat':
			return @com.emitrom.flash4j.core.client.display.SpreadMethod::REPEAT;

		}
    }-*/;

}
