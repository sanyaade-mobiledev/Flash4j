/************************************************************************
  EventDispatcher.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.events;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.events.handlers.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class EventDispatcher extends ProxyObject {

    protected EventDispatcher() {
    }

    public native void addEventListener(String type, JavaScriptObject listener, int priority) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addEventListener(type, listener, false, priority);
    }-*/;

    public native void addEventListener(String type, JavaScriptObject listener, int priority, boolean useWeakReference) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(type, listener, false, priority,
						useWeakReference);
    }-*/;

    public native boolean dispatchEvent(Event event) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.dispatchEvent(event.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean hasEventListener(String type) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.hasEventListener(type);
    }-*/;

    public native void removeEventListener(String type, JavaScriptObject listener) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.removeEventListener(type, listener);
    }-*/;

    public native boolean willTrigger(String type) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.willTrigger(type);
    }-*/;

    public native void addEventListener(String type, JavaScriptObject listener) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addEventListener(type, listener);
    }-*/;

    public native void addEventHandler(String event, EventHandler handler)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(
						event,
						$entry(function(e) {
							var eventObject = @com.emitrom.air4j.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.air4j.core.client.events.handlers.EventHandler::onEvent(Lcom/emitrom/air4j/core/client/events/Event;)(eventObject);
						}));
    }-*/;

    public native void removeEventHandler(String event, EventHandler handler)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.removeEventListener(
						event,
						$entry(function(e) {
							var eventObject = @com.emitrom.air4j.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.air4j.core.client.events.handlers.EventHandler::onEvent(Lcom/emitrom/air4j/core/client/events/Event;)(eventObject);
						}));
    }-*/;

}
