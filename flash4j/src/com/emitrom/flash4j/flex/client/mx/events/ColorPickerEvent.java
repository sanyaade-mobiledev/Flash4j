/************************************************************************
  ColorPickerEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ColorPickerEvent.
 */
public class ColorPickerEvent extends Event {

    /** The Constant CHANGE. */
    public static final String CHANGE = "change";

    /** The Constant ENTER. */
    public static final String ENTER = "enter";

    /** The Constant ITEM_ROLL_OUT. */
    public static final String ITEM_ROLL_OUT = "itemRollOut";

    /** The Constant ITEM_ROLL_OVER. */
    public static final String ITEM_ROLL_OVER = "itemRollOver";

    /**
     * Instantiates a new color picker event.
     */
    protected ColorPickerEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public final native int getColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    public String getColorAsHex() {
        return "#" + Integer.toHexString(getColor());
    }

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public final native int getIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getindex();
    }-*/;

    public static ColorPickerEvent cast(Event event) {
        return new ColorPickerEvent(event.getJsObj());
    }

}
