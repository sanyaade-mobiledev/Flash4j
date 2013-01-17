/************************************************************************
  IndicesChangeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class IndicesChangeEvent.
 */
public class IndicesChangeEvent extends Event {

    /** The Constant CHANGE. */
    public static final String CHANGE = "indicesChange";

    /**
     * Instantiates a new indices change event.
     */
    protected IndicesChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the new indices.
     * 
     * @param <T> the generic type
     * @return the new indices
     */
    public final native As3Array getNewIndices()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getnewIndices();
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the old indices.
     * 
     * @param <T> the generic type
     * @return the old indices
     */
    public final native As3Array getOldIndices()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getoldIndices();
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
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

    public static IndicesChangeEvent cast(Event event) {
        return new IndicesChangeEvent(event.getJsObj());
    }

}
