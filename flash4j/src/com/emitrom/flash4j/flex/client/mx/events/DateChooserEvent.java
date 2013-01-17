/************************************************************************
  DateChooserEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class DateChooserEvent.
 */
public class DateChooserEvent extends Event {

    /** The Constant SCROLL. */
    public static final String SCROLL = "scroll";

    /**
     * Instantiates a new date chooser event.
     */
    protected DateChooserEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the detail.
     * 
     * @return the detail
     */
    public final DateChooserEventDetail getDetail() {
        return DateChooserEventDetail.fromValue(_getDetail());
    }

    /**
     * _get detail.
     * 
     * @return the string
     */
    private final native String _getDetail()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdetail();
    }-*/;

    public static DateChooserEvent cast(Event event) {
        return new DateChooserEvent(event.getJsObj());
    }

}
