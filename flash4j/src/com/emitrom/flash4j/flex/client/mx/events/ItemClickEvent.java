/************************************************************************
  ItemClickEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.display.InteractiveObject;
import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ItemClickEvent.
 */
public class ItemClickEvent extends Event {

    /** The Constant ITEM_CLICK. */
    public static final String ITEM_CLICK = "itemClick";

    /**
     * Instantiates a new item click event.
     */
    protected ItemClickEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public final native int getIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getIndex();
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
     * Gets the label.
     * 
     * @return the label
     */
    public final native String getLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabel();
    }-*/;

    /**
     * Gets the related object.
     * 
     * @return the related object
     */
    public final native InteractiveObject getRelatedObject()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getrelatedObject();
		return @com.emitrom.flash4j.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static ItemClickEvent cast(Event event) {
        return new ItemClickEvent(event.getJsObj());
    }

}
