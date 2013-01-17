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
package com.emitrom.flash4j.starling.client.events;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The EventDispatcher class is the base class for all classes that dispatch
 * events. peer is the Starling version of the FlashDetect class with the same name.
 * <p>
 * The event mechanism is a key feature of Starling's architecture. Objects can
 * communicate with each other through events. Compared the the FlashDetect event
 * system, Starling's event system was simplified. The main difference is that
 * Starling events have no "Capture" phase. They are simply dispatched at the
 * target and may optionally bubble up. They cannot move in the opposite
 * direction.
 * <p>
 * As in the conventional FlashDetect classes, display objects inherit from
 * EventDispatcher and can thus dispatch events. Beware, though, that the
 * Starling event classes are not compatible with FlashDetect events: Starling display
 * objects dispatch Starling events, which will bubble along Starling display
 * objects - but they cannot dispatch FlashDetect events or bubble along FlashDetect display
 * objects.
 */
public class EventDispatcher extends ProxyObject {

    /**
     * Instantiates a new event dispatcher.
     */
    public EventDispatcher() {
        jsObj = Bridge.createObject("starling.events.EventDispatcher");
    }

    EventDispatcher(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Dispatch event.
     * 
     * @param event the event
     * @return true, if successful
     */
    public native void dispatchEvent(StarlingEvent event) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.dispatchEvent(event.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Checks for event listener.
     * 
     * @param type the type
     * @return true, if successful
     */
    public native boolean hasEventListener(String type) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.hasEventListener(type);
    }-*/;

    /**
     * Removes the event listener.
     * 
     * @param type the type
     * @param listener the listener
     */
    public native void removeEventListener(String type, JavaScriptObject listener) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeEventListener(type, listener);
    }-*/;

    /**
     * Removes the event listener.
     * 
     * @param type the type
     * @param listener the listener
     */
    public void removeEventListener(String type, StarlingEventListener listener) {
        removeEventListener(type, listener.jsoPeer);
    }

    /**
     * Adds the event listener.
     * 
     * @param type the type
     * @param listener the listener
     */
    private native void addEventListener(String type, JavaScriptObject listener) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addEventListener(type, listener);
    }-*/;

    /**
     * Adds the event listener.
     * 
     * @param type the type
     * @param listener the listener
     */
    public void addEventListener(String type, StarlingEventListener listener) {
        addEventListener(type, listener.jsoPeer);
    }

}
