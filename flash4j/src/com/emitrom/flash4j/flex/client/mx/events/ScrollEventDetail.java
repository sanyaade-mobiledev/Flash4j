/************************************************************************
  ScrollEventDetail.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum ScrollEventDetail.
 */
public enum ScrollEventDetail {

    /** The A t_ bottom. */
    AT_BOTTOM("atBottom"),
    /** The A t_ top. */
    AT_TOP("atTop"),
    /** The A t_ left. */
    AT_LEFT("atLeft"),
    /** The A t_ right. */
    AT_RIGHT("atRight"),
    /** The LIN e_ down. */
    LINE_DOWN("lineDown"),
    /** The LIN e_ left. */
    LINE_LEFT("lineLeft"),
    /** The LIN e_ right. */
    LINE_RIGHT("lineRight"),
    /** The LIN e_ up. */
    LINE_UP("lineUp"),
    /** The PAG e_ down. */
    PAGE_DOWN("pageDown"),
    /** The PAG e_ left. */
    PAGE_LEFT("page_left"),

    /** The PAG e_ right. */
    PAGE_RIGHT("pageRight"),

    /** The PAG e_ up. */
    PAGE_UP("pageUp"),

    /** The THUM b_ position. */
    THUMB_POSITION("thumbPosition"),

    /** The THUM b_ track. */
    THUMB_TRACK("thumbTrack");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new scroll event detail.
     * 
     * @param detail the detail
     */
    private ScrollEventDetail(String detail) {
        value = detail;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the scroll event detail
     */
    public static native ScrollEventDetail fromValue(String value) /*-{
		switch (value) {
		case 'atBottom':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::AT_BOTTOM;
		case 'atLeft':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::AT_LEFT;
		case 'atTop':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::AT_TOP;
		case 'atRight':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::AT_RIGHT;
		case 'lineDown':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::LINE_DOWN;
		case 'lineLeft':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::LINE_LEFT;
		case 'lineRight':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::LINE_RIGHT;
		case 'lineUp':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::LINE_UP;
		case 'pageDown':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::PAGE_DOWN;
		case 'pageLeft':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::PAGE_LEFT;
		case 'pageRight':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::PAGE_RIGHT;
		case 'pageDown':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::PAGE_DOWN;
		case 'thumbPosition':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::THUMB_POSITION;
		case 'thumbTrack':
			return @com.emitrom.flash4j.flex.client.mx.events.ScrollEventDetail::THUMB_TRACK;
		}
    }-*/;
}
