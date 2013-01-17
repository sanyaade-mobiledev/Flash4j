/************************************************************************
  StarlingEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Event objects are passed as parameters to event listeners when an event
 * occurs. This is Starling's version of the FlashDetect Event class. EventDispatchers
 * create instances of this class and send them to registered listeners. An
 * event object contains information that characterizes an event, most
 * importantly the event type and if the event bubbles. The target of an event
 * is the object that dispatched it.
 * 
 * For some event types, this information is sufficient; other events may need
 * additional information to be carried to the listener. In that case, you can
 * subclass "Event" and add properties with all the information you require. The
 * "EnterFrameEvent" is an example for this practice; it adds a property about
 * the time that has passed since the last frame.
 * 
 * Furthermore, the event class contains methods that can stop the event from
 * being processed by other listeners - either completely or at the next bubble
 * stage.
 * 
 * @author Ekambi
 * 
 */
public class StarlingEvent extends ProxyObject {

    public static final String ADDED = "added";
    public static final String ADDED_TO_STAGE = "addedToStage";
    public static final String COMPLETE = "complete";
    public static final String CONTEXT3D_CREATE = "context3DCreate";
    public static final String ENTER_FRAME = "enterFrame";
    public static final String FLATTEN = "flatten";
    public static final String REMOVED = "removed";
    public static final String REMOVED_FROM_STAGE = "removedFromStage";
    public static final String REMOVED_FROM_JUGGLER = "removedFromJuggler";
    public static final String RESIZE = "resize";
    public static final String TRIGGERED = "triggered";

    public StarlingEvent(String type) {
        jsObj = StarlingObjectFactory.INSTANCE.createStarlingEvent(type);
    }

    public StarlingEvent(String type, boolean bubbles) {
        jsObj = StarlingObjectFactory.INSTANCE.createStarlingEvent(type, bubbles);
    }

    protected StarlingEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Indicates if event will bubble.
     * 
     * @return
     */

    public native boolean bubbles()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbubbles();
    }-*/;

    /**
     * The object the event is currently bubbling at.
     * 
     * @return
     */
    public native EventDispatcher getCurrentTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcurrentTarget();
		return @com.emitrom.flash4j.starling.client.events.EventDispatcher::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The object that dispatched the event.
     * 
     * @return
     */
    public native EventDispatcher getTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getarget();
		return @com.emitrom.flash4j.starling.client.events.EventDispatcher::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * A string that identifies the event.
     * 
     * @return
     */
    public native String getType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettype();
    }-*/;

    /**
     * Prevents any other listeners from receiving the event.
     * 
     * @return
     */
    public native void stopImmediatePropagation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stopImmediatePropagation();
    }-*/;

    /**
     * Prevents listeners at the next bubble stage from receiving the event.
     * 
     * @return
     */
    public native void stopPropagation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stopPropagation();
    }-*/;

    /**
     * Returns a description of the event, containing type and bubble
     * information.
     * 
     * @return
     */
    public native String getStringRepresentation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.toString();
    }-*/;
}
