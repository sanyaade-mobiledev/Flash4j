/************************************************************************
  DividedBox.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.containers.diviedBoxClasses.BoxDivider;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DividedBox.
 */
public class DividedBox extends Box {

    /**
     * Instantiates a new divided box.
     */
    protected DividedBox(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the divided box
     */
    public DividedBox() {
        jsObj = Bridge.createObject("mx.containers.DividedBox");
    }

    public DividedBox(BoxDirection direction) {
        this();
        setDirection(direction);
    }

    /**
     * Checks if is live dragging.
     * 
     * @return true, if is live dragging
     */
    public native boolean isLiveDragging()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getliveDragging();
    }-*/;

    /**
     * Sets the live dragging.
     * 
     * @param value
     *            the new live dragging
     */
    public native void setLiveDragging(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setliveDragging(value);
    }-*/;

    /**
     * Gets the num dividers.
     * 
     * @return the num dividers
     */
    public native int getNumDividers()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumDividers();
    }-*/;

    /**
     * Resize to content.
     * 
     * @return true, if successful
     */
    public native boolean resizeToContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getresizeToContent();
    }-*/;

    /**
     * Sets the resize to content.
     * 
     * @param value
     *            the new resize to content
     */
    public native void setResizeToContent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setresizeToContent(value);
    }-*/;

    /**
     * Gets the divider at.
     * 
     * @param index
     *            the index
     * @return the divider at
     */
    public native BoxDivider getDividerAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getDividerAt(index);
		return @com.emitrom.flash4j.flex.client.mx.containers.diviedBoxClasses.BoxDivider::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Move divider.
     * 
     * @param index
     *            the index
     * @param amt
     *            the amt
     */
    public native void moveDivider(int index, double amt)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.moveDivider(index, amt);
    }-*/;
}
