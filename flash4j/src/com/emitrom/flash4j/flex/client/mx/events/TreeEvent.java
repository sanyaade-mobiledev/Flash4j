/************************************************************************
  TreeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class TreeEvent.
 */
public class TreeEvent extends Event {

    /** The Constant ITEM_CLOSE. */
    public static final String ITEM_CLOSE = "itemClose";

    /** The Constant ITEM_OPEN. */
    public static final String ITEM_OPEN = "itemOpen";

    /** The Constant ITEM_OPENING. */
    public static final String ITEM_OPENING = "itemOpening";

    /**
     * Instantiates a new tree event.
     */
    protected TreeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Checks if is animate.
     * 
     * @return true, if is animate
     */
    public final native boolean isAnimate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getAnimate();
    }-*/;

    /**
     * Dispatch event.
     * 
     * @return true, if successful
     */
    public final native boolean dispatchEvent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdispatchEvent();
    }-*/;

    /**
     * Gets the item.
     * 
     * @param <T> the generic type
     * @return the item
     */
    public final native <T> T getItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getitem();
    }-*/;

    /**
     * Checks if is opening.
     * 
     * @return true, if is opening
     */
    public final native boolean isOpening()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getopening();
    }-*/;

    /**
     * Gets the trigger event.
     * 
     * @return the trigger event
     */
    public final native Event getTriggerEvent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettriggerEvent();
		return @com.emitrom.flash4j.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static TreeEvent cast(Event event) {
        return new TreeEvent(event.getJsObj());
    }
}
