/************************************************************************
  ChildExistenceEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class ChildExistenceEvent.
 */
public class ChildExistenceEvent extends Event {

    /** The Constant CHILD_ADD. */
    public final static String CHILD_ADD = "childAdd";

    /** The Constant CHILD_REMOVE. */
    public final static String CHILD_REMOVE = "childRemove";

    /** The Constant OVERLAY_CREATED. */
    public final static String OVERLAY_CREATED = "overlayCreated";

    /**
     * Instantiates a new child existence event.
     */
    protected ChildExistenceEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

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

    public static ChildExistenceEvent cast(Event event) {
        return new ChildExistenceEvent(event.getJsObj());
    }

}
