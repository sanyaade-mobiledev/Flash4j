/************************************************************************
  CollectionEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CollectionEvent.
 */
public class CollectionEvent extends Event {

    /** The Constant COLLECTION_CHANGE. */
    public final static String COLLECTION_CHANGE = "collectionChange";

    /**
     * Instantiates a new collection event.
     */
    protected CollectionEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the detail.
     * 
     * @return the detail
     */
    public final native int getDetail()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getDetail();
    }-*/;

    /**
     * Gets the items.
     * 
     * @return the items
     */
    public final native As3Array getItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getitems();
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the kind.
     * 
     * @return the kind
     */
    public final CollectionEventKind getKind() {
        return CollectionEventKind.fromValue(_getKind());
    }

    /**
     * _get kind.
     * 
     * @return the string
     */
    private final native String _getKind()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getkind();
    }-*/;

    /**
     * Gets the location.
     * 
     * @return the location
     */
    public final native int getLocation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlocation();
    }-*/;

    /**
     * Gets the old location.
     * 
     * @return the old location
     */
    public final native int getOldLocation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoldLocation();
    }-*/;

    public static CollectionEvent cast(Event event) {
        return new CollectionEvent(event.getJsObj());
    }

}
