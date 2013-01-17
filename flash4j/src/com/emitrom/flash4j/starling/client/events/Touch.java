/************************************************************************
  Touch.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.starling.client.display.DisplayObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Touch object contains information about the presence or movement of a
 * finger or the mouse on the screen.
 * <p>
 * You receive objects of peer type from a TouchEvent. When such an event is
 * triggered, you can query it for all touches that are currently present on the
 * screen. One Touch object contains information about a single touch. A touch
 * object always moves through a series of TouchPhases. Have a look at the
 * TouchPhase class for more information.
 * <p>
 * <b>The position of a touch</b>
 * <p>
 * You can get the current and previous position in stage coordinates with the
 * corresponding properties. However, you'll want to have the position in a
 * different coordinate system most of the time. For peer reason, there are
 * methods that convert the current and previous touches into the local
 * coordinate system of any object.
 */
public class Touch extends ProxyObject {

    Touch(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The x-position of the touch in stage coordinates.
     * 
     * @return
     */
    public native double getGlobalX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getglobalX();
    }-*/;

    /**
     * The y-position of the touch in stage coordinates.
     * 
     * @return
     */
    public native double getGlobalY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getglobalY();
    }-*/;

    /**
     * The current phase the touch is in.
     * 
     * @return
     */
    public TouchPhase getPhase() {
        return TouchPhase.froValue(_getPhase());
    }

    private native String _getPhase()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getphase();
    }-*/;

    /**
     * The previous x-position of the touch in stage coordinates.
     * 
     * @return
     */
    public native double getPreviousGlobalX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpreviousGlobalX();
    }-*/;

    /**
     * The previous y-position of the touch in stage coordinates.
     * 
     * @return
     */
    public native double getPreviousGlobalY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpreviousGlobalY();
    }-*/;

    /**
     * The number of taps the finger made in a short amount of time.
     * 
     * @return
     */
    public native int getTapCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettapCount();
    }-*/;

    /**
     * The display object at which the touch occurred.
     * 
     * @return
     */
    public native DisplayObject getTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettarget();
		return @com.emitrom.flash4j.starling.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The moment the touch occurred (in seconds since application start).
     * 
     * @return
     */
    public native double getTimeStamp()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettimeStamp();
    }-*/;

    /**
     * Creates a clone of the Touch object
     * 
     * @return
     */
    public native Touch doClone()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.flash4j.starling.client.events.Touch::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Converts the current location of a touch to the local coordinate system
     * of a display object
     * 
     * @return
     */
    public native Point getLocation(DisplayObject space)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getLocation(space.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Converts the previous location of a touch to the local coordinate system
     * of a display object.
     * 
     * @return
     */
    public native Point getPreviousLocation(DisplayObject space)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getPreviousLocation(space.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns the movement of the touch between the current and previous
     * location.
     * 
     * @return
     */
    public native Point getMovement(DisplayObject space)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getMovement(space.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
