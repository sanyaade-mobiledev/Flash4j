/************************************************************************
  SetEventHandler.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.states;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.events.EventListener;
import com.emitrom.flash4j.core.client.events.handlers.EventHandler;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SetEventHandler.
 */
public class SetEventHandler extends OverrideBase {

    /**
     * Instantiates a new sets the event handler.
     */
    protected SetEventHandler(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the sets the event handler
     */
    public SetEventHandler() {
        jsObj = Bridge.createObject("mx.states.SetEventHandler");
        setTarget(null);
        setName(null);
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the sets the event handler
     */
    public SetEventHandler(EventDispatcher target) {
        this();
        setTarget(target);
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @param name the name
     * @return the sets the event handler
     */
    public SetEventHandler(EventDispatcher target, String name) {
        this(target);
        setName(name);
    }

    /**
     * Sets the handler function.
     * 
     * @param function the new handler function
     */
    public void setHandlerFunction(EventListener<?> function) {
        setHandlerFunction(function.getJsoPeer());
    }

    public native void setHandlerFunction(EventHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.sethandlerFunction(function(e) {
					var eventObject = @com.emitrom.flash4j.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
					handler.@com.emitrom.flash4j.core.client.events.handlers.EventHandler::onEvent(Lcom/emitrom/flash4j/core/client/events/Event;)(eventObject);
				});
    }-*/;

    /**
     * Sets the handler function.
     * 
     * @param value the new handler function
     */
    private native void setHandlerFunction(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethandlerFunction(value);
    }-*/;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public native String getName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getname();
    }-*/;

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public native void setName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setname(value);
    }-*/;

    /**
     * Sets the target.
     * 
     * @param value the new target
     */
    public native void setTarget(EventDispatcher value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settarget(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
