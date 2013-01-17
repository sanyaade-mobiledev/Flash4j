/************************************************************************
  UIComponentCachePolicy.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.flex.client.mx.core;

/**
 * The Enum UIComponentCachePolicy.
 */
public enum UIComponentCachePolicy {

    /** The AUTO. */
    AUTO("auto"),

    /** The ON. */
    ON("on"),

    /** The OFF. */
    OFF("off");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new uI component cache policy.
     * 
     * @param reference the reference
     */
    private UIComponentCachePolicy(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the uI component cache policy
     */
    public static native UIComponentCachePolicy fromValue(String value) /*-{
		switch (value) {
		case 'auto':
			return @com.emitrom.flash4j.flex.client.mx.core.UIComponentCachePolicy::AUTO;
		case 'on':
			return @com.emitrom.flash4j.flex.client.mx.core.UIComponentCachePolicy::ON;
		case 'off':
			return @com.emitrom.flash4j.flex.client.mx.core.UIComponentCachePolicy::OFF;
		}
    }-*/;
}
