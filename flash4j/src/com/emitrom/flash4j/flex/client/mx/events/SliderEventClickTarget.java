/************************************************************************
  SliderEventClickTarget.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.events;

/**
 * The Enum SliderEventClickTarget.
 */
public enum SliderEventClickTarget {

    /** The THUMB. */
    THUMB("thumb"),
    /** The TRACK. */
    TRACK("track");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new slider event click target.
     * 
     * @param target the target
     */
    private SliderEventClickTarget(String target) {
        value = target;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the slider event click target
     */
    public static native SliderEventClickTarget fromValue(String value) /*-{
		switch (value) {
		case 'thumb':
			return @com.emitrom.flash4j.flex.client.mx.events.SliderEventClickTarget::THUMB;
		case 'track':
			return @com.emitrom.flash4j.flex.client.mx.events.SliderEventClickTarget::TRACK;
		}
    }-*/;
}
