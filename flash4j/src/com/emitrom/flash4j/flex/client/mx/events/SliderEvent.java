/************************************************************************
  SliderEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SliderEvent.
 */
public class SliderEvent extends Event {

    /** The Constant CHANGE. */
    public static final String CHANGE = "change";

    /** The Constant THUMB_DRAG. */
    public static final String THUMB_DRAG = "thumbDrag";

    /** The Constant THUMB_PRESS. */
    public static final String THUMB_PRESS = "thumbPress";

    /** The Constant THUMB_RELEASE. */
    public static final String THUMB_RELEASE = "thumbRelease";

    /**
     * Instantiates a new slider event.
     */
    protected SliderEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the click target.
     * 
     * @return the click target
     */
    public final SliderEventClickTarget getClickTarget() {
        return SliderEventClickTarget.fromValue(_getClickTarget());
    }

    /**
     * _get click target.
     * 
     * @return the string
     */
    private final native String _getClickTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getclickTarget();
    }-*/;

    /**
     * Gets the key code.
     * 
     * @return the key code
     */
    public final native int getKeyCode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getkeyCode();
    }-*/;

    /**
     * Gets the thumb index.
     * 
     * @return the thumb index
     */
    public final native int getThumbIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getthumbIndex();
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

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public final native double getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

    public static SliderEvent cast(Event event) {
        return new SliderEvent(event.getJsObj());
    }

}
