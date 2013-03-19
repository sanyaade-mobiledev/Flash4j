/************************************************************************
 * ShuffleStack.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.containers;

import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.ui.mx.Button;
import com.emitrom.flash4j.flex.client.ui.mx.Container;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ShuffleStack.
 */
public class ShuffleStack extends Container {

    /**
     * Instantiates a new shuffle stack.
     */
    protected ShuffleStack(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the shuffle stack
     */
    public ShuffleStack() {
        jsObj = Bridge.createObject("com.arc90.containers.ShuffleStack");
    }

    /**
     * Gets the selected child.
     * 
     * @return the selected child
     */
    public native Container getSelectedChild()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedChild();
		return @com.emitrom.flash4j.flex.client.ui.mx.Container::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the selected child.
     * 
     * @param value
     *            the new selected child
     */
    public native void setSelectedChild(Container value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setselectedChild(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the selected index.
     * 
     * @return the selected index
     */
    public native int getSelectedIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedIndex();
    }-*/;

    /**
     * Sets the selected index.
     * 
     * @param value
     *            the new selected index
     */
    public native void setSelectedIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedIndex(value);
    }-*/;

    /**
     * Gets the content index.
     * 
     * @param child
     *            the child
     * @return the content index
     */
    public native int getContentIndex(DisplayObject child)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getContentIndex(child);
    }-*/;

    /**
     * Gets the content at.
     * 
     * @param index
     *            the index
     * @return the content at
     */
    public native DisplayObject getContentAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getContentAt(index);
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the card header.
     * 
     * @param child
     *            the child
     * @return the card header
     */
    public native Button getCardHeader(DisplayObject child)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getCardHeader(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.flex.client.ui.mx.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the child visible.
     * 
     * @param child
     *            the child
     * @param visible
     *            the visible
     */
    public native void setChildVisible(DisplayObject child, boolean visible)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setChildVisible(
						child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						visible);
    }-*/;

    /**
     * Sets the child visible.
     * 
     * @param child
     *            the child
     * @param visible
     *            the visible
     * @param noEvent
     *            the no event
     */
    public native void setChildVisible(DisplayObject child, boolean visible, boolean noEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setChildVisible(
						child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						visible, noEvent);
    }-*/;

    /**
     * Sets the child padding bottom top.
     * 
     * @param value
     *            the new child padding bottom top
     */
    public void setChildPaddingBottomTop(double value) {
        this.setChildPaddingBottomTop(Double.toString(value));
    }

    /**
     * Sets the child padding bottom top.
     * 
     * @param value
     *            the new child padding bottom top
     */
    private void setChildPaddingBottomTop(Object value) {
        this.setStyle("childPaddingBottonTop", value);
    }

    /**
     * Sets the child padding left right.
     * 
     * @param value
     *            the new child padding left right
     */
    public void setChildPaddingLeftRight(double value) {
        this.setChildPaddingLeftRight(Double.toString(value));
    }

    /**
     * Sets the child padding left right.
     * 
     * @param value
     *            the new child padding left right
     */
    private void setChildPaddingLeftRight(Object value) {
        this.setStyle("childPaddingLeftRight", value);
    }

    /**
     * Sets the move duration.
     * 
     * @param value
     *            the new move duration
     */
    public void setMoveDuration(double value) {
        this.setMoveDuration(Double.toString(value));
    }

    /**
     * Sets the move duration.
     * 
     * @param value
     *            the new move duration
     */
    private void setMoveDuration(Object value) {
        this.setStyle("moveDuration", value);
    }

}
