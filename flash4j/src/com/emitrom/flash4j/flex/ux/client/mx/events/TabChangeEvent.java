/************************************************************************
  TabChangeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TabChangeEvent.
 */
public class TabChangeEvent extends Event {

    /** The Constant TAB_CHANGE_EVENT. */
    public static final String TAB_CHANGE_EVENT = "tabChangeEvent";

    /**
     * Instantiates a new tab change event.
     */
    protected TabChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the tab title.
     * 
     * @return the tab title
     */
    public final native String getTabTitle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettabTitle();
    }-*/;

    public static TabChangeEvent cast(Event event) {
        return new TabChangeEvent(event.getJsObj());
    }

}
