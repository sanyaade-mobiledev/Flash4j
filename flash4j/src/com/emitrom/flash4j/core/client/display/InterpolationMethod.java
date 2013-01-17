/************************************************************************
  InterpolationMethod.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum InterpolationMethod.
 */
public enum InterpolationMethod {

    /** The LINEAR. */
    LINEAR("linear"),

    /** The RGB. */
    RGB("rgb");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new interpolation method.
     * 
     * @param openMode the open mode
     */
    private InterpolationMethod(String openMode) {
        value = openMode;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the interpolation method
     */
    public static native InterpolationMethod fromValue(String value) /*-{
		switch (value) {

		case 'linear':
			return @com.emitrom.flash4j.core.client.display.InterpolationMethod::LINEAR;

		case 'rgb':
			return @com.emitrom.flash4j.core.client.display.InterpolationMethod::RGB;

		}
    }-*/;

}
