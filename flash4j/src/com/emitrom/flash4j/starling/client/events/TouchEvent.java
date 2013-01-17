/************************************************************************
  TouchEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.starling.client.core.factories.StarlingStaticBridge;
import com.emitrom.flash4j.starling.client.display.DisplayObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A TouchEvent is triggered either by touch or mouse input.
 * <p>
 * In Starling, both touch events and mouse events are handled through the same
 * class: TouchEvent. To process user input from a touch screen or the mouse,
 * you have to register an event listener for events of the type
 * TouchEvent.TOUCH. peer is the only event type you need to handle; the long
 * list of mouse event types as they are used in conventional FlashDetect are
 * mapped to so-called "TouchPhases" instead.
 * 
 * <p>
 * 
 * The difference between mouse input and touch input is that <br/>
 * <ul>
 * <li>only one mouse cursor can be present at a given moment and</li>
 * <li>only the mouse can "hover" over an object without a pressed button.</li>
 * </ul>
 * <p>
 * <b>Which objects receive touch events?</b>
 * <p>
 * In Starling, any display object receives touch events, as long as the
 * touchable property of the object and its parents is enabled. There is no
 * "InteractiveObject" class in Starling.
 * <p>
 * <b>How to work with individual touches</b>
 * <p>
 * The event contains a list of all touches that are currently present. Each
 * individual touch is stored in an object of type "Touch". Since you are
 * normally only interested in the touches that occurred on top of certain
 * objects, you can query the event for touches with a specific target:
 * <p>
 * 
 * {@code List<Touch> touches = touchEvent.getTouches(target);} peer will return
 * all touches of "target" or one of its children. When you are not using
 * multitouch, you can also access the touch object directly, like peer:
 * 
 * <code>Touch touch = touchEvent.getTouch(target);</code>
 * 
 * 
 * 
 */
public class TouchEvent extends StarlingEvent {

    protected TouchEvent(JavaScriptObject obj) {
        super(obj);
    }

    public static final String TOUCH = "touch";
    public static final String TRIGGERED = "triggered";

    /**
     * Indicates if the ctrl key was pressed when the event occurred.
     * 
     * @return
     */
    public native boolean isCtrlKey()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getctrlKey();
    }-*/;

    /**
     * Indicates if the shift key was pressed when the event occurred.
     * 
     * @return
     */
    public native boolean isShiftKey()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshiftKey();
    }-*/;

    /**
     * The time the event occurred (in seconds since application launch).
     * 
     * @return
     */
    public native double getTimeStamp()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettimeStamp();
    }-*/;

    /**
     * All touches that are currently available.
     * 
     * @return
     */
    public List<Touch> getTouchesProperty() {
        List<Touch> touches = new ArrayList<Touch>();
        JavaScriptObject nativePeers = _getTouches();
        int size = JsoHelper.getJavaScriptObjectAs3ArraySize(nativePeers);
        for (int i = 0; i < size; i++) {
            touches.add(new Touch(JsoHelper.getValueFromJavaScriptObjectArray(nativePeers, i)));
        }
        return touches;
    }

    private native JavaScriptObject _getTouches()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettouches();
    }-*/;

    /**
     * Returns a touch that originated over a certain target.
     * 
     * @param target
     * @return
     */
    public native Touch getTouch(DisplayObject target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getTouch(target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.starling.client.events.Touch::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns a touch that originated over a certain target.
     * 
     * @param target
     * @param phase
     * @return
     */
    public Touch getTouch(DisplayObject target, TouchPhase phase) {
        return _getTouch(target, phase.getValue());
    }

    /**
     * Returns a list of touches that originated over a certain target.
     * 
     * @param target
     * @return
     */
    public List<Touch> getTouches(DisplayObject target) {
        List<Touch> touches = new ArrayList<Touch>();
        JavaScriptObject nativePeers = _getTouches(target);
        int size = JsoHelper.getJavaScriptObjectAs3ArraySize(nativePeers);
        for (int i = 0; i < size; i++) {
            touches.add(new Touch(JsoHelper.getValueFromJavaScriptObjectArray(nativePeers, i)));
        }
        return touches;
    }

    /**
     * Returns a list of touches that originated over a certain target.
     * 
     * @param target
     * @param phase
     * @return
     */
    public List<Touch> getTouches(DisplayObject target, TouchPhase phase) {
        List<Touch> touches = new ArrayList<Touch>();
        JavaScriptObject nativePeers = StarlingStaticBridge.INSTANCE.fromVectorOfTouches(_getTouches());
        int size = JsoHelper.getJavaScriptObjectAs3ArraySize(nativePeers);
        for (int i = 0; i < size; i++) {
            touches.add(new Touch(JsoHelper.getValueFromJavaScriptObjectArray(nativePeers, i)));
        }
        return touches;
    }

    /**
     * Indicates if a target is currently being touched or hovered over.
     * 
     * @param target
     * @return
     */
    public native boolean interactsWith(DisplayObject target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.interactsWith(target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());

    }-*/;

    private native JavaScriptObject _getTouches(DisplayObject target, String phase)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getTouches(
						target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						phase);
		return obj;
    }-*/;

    private native JavaScriptObject _getTouches(DisplayObject target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getTouches(target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return obj;
    }-*/;

    private native Touch _getTouch(DisplayObject target, String phase)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getTouch(
						target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						phase);
		return @com.emitrom.flash4j.starling.client.events.Touch::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static TouchEvent cast(StarlingEvent event) {
        return new TouchEvent(event.getJsObj());
    }

}
