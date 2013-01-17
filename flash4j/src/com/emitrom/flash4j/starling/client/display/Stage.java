/************************************************************************
 * Stage.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.starling.client.display;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Stage represents the root of the display tree. Only objects that are direct
 * or indirect children of the stage will be rendered. This class represents the
 * Starling version of the stage. Don't confuse it with its FlashDetect
 * equivalent: while the latter contains objects of the type
 * flash.display.DisplayObject, the Starling stage contains only objects of the
 * type starling.display.DisplayObject. Those classes are not compatible, and
 * you cannot exchange one type with the other.
 * <p>
 * A stage object is created automatically by the Starling class. Don't create a
 * Stage instance manually.
 * <p>
 * <b>Keyboard Events</b>
 * <p>
 * In Starling, keyboard events are only dispatched at the stage. Add an event
 * listener directly to the stage to be notified of keyboard events.
 * <p>
 * <b>Resize Events</b> When the FlashDetect player is resized, the stage
 * dispatches a ResizeEvent. The event contains properties containing the
 * updated width and height of the FlashDetect player.
 * 
 * 
 */
public class Stage extends DisplayObjectContainer {

    protected Stage() {

    }

    Stage(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The background color of the stage.
     * 
     * @param value
     */
    public native void setColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolor(value);
    }-*/;

    /**
     * The background color of the stage.
     * 
     * @return
     */
    public native int getColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    /**
     * The height of the stage coordinate system.
     * 
     * @param value
     */
    public native void setStageHeight(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstageHeight(value);
    }-*/;

    /**
     * The height of the stage coordinate system.
     * 
     * @return
     */
    public native int getStageHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstageHeight();
    }-*/;

    /**
     * The width of the stage coordinate system.
     * 
     * @param value
     */
    public native void setStageWidth(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstageWidth(value);
    }-*/;

    /**
     * The width of the stage coordinate system.
     * 
     * @return
     */
    public native int getStageWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstageWidth();
    }-*/;

    public native void advanceTime(double passedTime)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.advanceTime(passedTime);
    }-*/;

}
