/************************************************************************
  IndexChangeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class IndexChangeEvent.
 */
public class IndexChangeEvent extends Event {

    /** The Constant CHANGE. */
    public static final String CHANGE = "change";

    /** The Constant CHILD_INDEX_CHANGE. */
    public static final String CHILD_INDEX_CHANGE = "childIndexChange";

    /** The Constant HEADER_SHIFT. */
    public static final String HEADER_SHIFT = "headerShift";

    protected IndexChangeEvent() {

    }

    /**
     * Instantiates a new index change event.
     */
    protected IndexChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the new index.
     * 
     * @return the new index
     */
    public final native int getNewIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnewIndex();
    }-*/;

    /**
     * Gets the old index.
     * 
     * @return the old index
     */
    public final native int getOldIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoldIndex();
    }-*/;

    /**
     * Gets the related object.
     * 
     * @return the related object
     */
    public final native DisplayObject getRelatedObject()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getrelatedObject();
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
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

    public static IndexChangeEvent cast(Event event) {
        return new IndexChangeEvent(event.getJsObj());
    }

}
