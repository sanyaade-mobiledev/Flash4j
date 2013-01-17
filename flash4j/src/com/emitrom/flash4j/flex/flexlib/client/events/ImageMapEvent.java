/************************************************************************
  ImageMapEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.flex.flexlib.client.controls.imageMapClasses.Area;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ImageMapEvent.
 */
public class ImageMapEvent extends Event {

    /** The Constant SHAPE_CLICK. */
    public static String SHAPE_CLICK = "shapeClick";

    /** The Constant SHAPE_DOUBLE_CLICK. */
    public static String SHAPE_DOUBLE_CLICK = "shapeDoubleClick";

    /** The Constant SHAPE_DOWN. */
    public static String SHAPE_DOWN = "shapeDown";

    /** The Constant SHAPE_OUT. */
    public static String SHAPE_OUT = "shapeOut";

    /** The Constant SHAPE_OVER. */
    public static String SHAPE_OVER = "shapeOver";

    /** The Constant SHAPE_UP. */
    public static String SHAPE_UP = "shapeUp";

    /**
     * Instantiates a new image map event.
     */
    protected ImageMapEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the href.
     * 
     * @return the href
     */
    public native String getHref()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethref();
    }-*/;

    /**
     * Gets the link target.
     * 
     * @return the link target
     */
    public native String getLinkTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlinkTarget();
    }-*/;

    /**
     * Gets the item.
     * 
     * @return the item
     */
    public native Area getItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getitem();
		return @com.emitrom.flash4j.flex.flexlib.client.controls.imageMapClasses.Area::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static ImageMapEvent cast(Event event) {
        return new ImageMapEvent(event.getJsObj());
    }

}
