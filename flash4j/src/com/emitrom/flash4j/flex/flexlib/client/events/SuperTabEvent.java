/************************************************************************
  SuperTabEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SuperTabEvent.
 */
public class SuperTabEvent extends Event {

    /** The Constant TAB_CLOSE. */
    public static final String TAB_CLOSE = "tabClose";

    /** The Constant TAB_UPDATED. */
    public static final String TAB_UPDATED = "tabUpdated";

    /**
     * Instantiates a new super tab event.
     */
    protected SuperTabEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the tab index.
     * 
     * @return the tab index
     */
    public final native int getTabIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettabIndex();
    }-*/;

    public static SuperTabEvent cast(Event event) {
        return new SuperTabEvent(event.getJsObj());
    }

}
