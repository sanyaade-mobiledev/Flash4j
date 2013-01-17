/************************************************************************
  SuperPanel.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers;

import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.events.handlers.EventHandler;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.containers.Panel;
import com.emitrom.flash4j.flex.client.mx.effects.Resize;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SuperPanel.
 */
public class SuperPanel extends Panel {

    /**
     * Instantiates a new super panel.
     */
    protected SuperPanel(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the super panel
     */
    public SuperPanel() {
        jsObj = Bridge.createObject("net.brandonmeyer.containers.SuperPanel");
        setWidth(600);
        setHeight(500);
    }

    /**
     * New instance.
     * 
     * @param title the title
     * @return the super panel
     */
    public SuperPanel(String title) {
        this();
        setTitle(title);
    }

    /**
     * Checks if is closable.
     * 
     * @return true, if is closable
     */
    public native boolean isClosable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowClose();
    }-*/;

    /**
     * Sets the closable.
     * 
     * @param value the new closable
     */
    public native void setClosable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowClose(value);
    }-*/;

    /**
     * Checks if is draggable.
     * 
     * @return true, if is draggable
     */
    public native boolean isDraggable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowDrag();
    }-*/;

    /**
     * Sets the draggable.
     * 
     * @param value the new draggable
     */
    public native void setDraggable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowDrag(value);
    }-*/;

    /**
     * Checks if is maximizable.
     * 
     * @return true, if is maximizable
     */
    public native boolean isMaximizable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowMaximize();
    }-*/;

    /**
     * Sets the maximizable.
     * 
     * @param value the new maximizable
     */
    public native void setMaximizable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowMaximize(value);
    }-*/;

    /**
     * Checks if is minimizable.
     * 
     * @return true, if is minimizable
     */
    public native boolean isMinimizable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowMinimize();
    }-*/;

    /**
     * Sets the minimizable.
     * 
     * @param value the new minimizable
     */
    public native void setMinimizable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowMinimize(value);
    }-*/;

    /**
     * Checks if is resizable.
     * 
     * @return true, if is resizable
     */
    public native boolean isResizable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowResize();
    }-*/;

    /**
     * Sets the resizable.
     * 
     * @param value the new resizable
     */
    public native void setResizable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowResize(value);
    }-*/;

    /**
     * Gets the size ratio.
     * 
     * @return the size ratio
     */
    public native String getSizeRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsizeRatio();
    }-*/;

    /**
     * Sets the size ratio.
     * 
     * @param value the new size ratio
     */
    public native void setSizeRatio(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsizeRatio(value);
    }-*/;

    /**
     * Adds the close handler.
     * 
     * @param listener the listener
     */
    public void addCloseHandler(EventHandler listener) {
        this.addEventHandler(Event.CLOSE, listener);
    }

    /**
     * Sets the animata resize.
     * 
     * @param value the new animata resize
     */
    public void setAnimataResize(boolean value) {
        if (value == true) {
            this.setStyle("resizeEffect", new Resize());
        } else {
            this.setStyle("resizeEffect", "");
        }
    }

}
