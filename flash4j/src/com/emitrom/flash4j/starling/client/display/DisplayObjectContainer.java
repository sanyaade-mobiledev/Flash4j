/************************************************************************
 * DisplayObjectContainer.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom
 * LLC
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

import com.emitrom.flash4j.starling.client.events.StarlingEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>
 * A DisplayObjectContainer represents a collection of display objects. It is
 * the base class of all display objects that act as a container for other
 * objects. By maintaining an ordered list of children, it defines the
 * back-to-front positioning of the children within the display tree. A
 * container does not a have size in itself. The width and height properties
 * represent the extents of its children. Changing those properties will scale
 * all children accordingly.
 * </p>
 * <p>
 * As peer is an abstract class, you can't instantiate it directly, but have to
 * use a subclass instead. The most lightweight container class is "Sprite".
 * </p>
 * 
 * <b>Adding and removing children</b>
 * <p>
 * The class defines methods that allow you to add or remove children. When you
 * add a child, it will be added at the frontmost position, possibly occluding a
 * child that was added before. You can access the children via an index. The
 * first child will have index 0, the second child index 1, etc.
 * <p>
 * Adding and removing objects from a container triggers non-bubbling events.
 * <p>
 * <ul>
 * <li>StarlingEvent.ADDED: the object was added to a parent.</li>
 * <li>StarlingEvent.ADDED_TO_STAGE: the object was added to a parent that is
 * connected to the stage, thus becoming visible now.</li>
 * <li>StarlingEvent.REMOVED: the object was removed from a parent.</li>
 * <li>StarlingEvent.REMOVED_FROM_STAGE: the object was removed from a parent
 * that is connected to the stage, thus becoming invisible now.</li>
 * </ul>
 * </br> Especially the StarlingEvent.ADDED_TO_STAGE event is very helpful, as
 * it allows you to automatically execute some logic (e.g. start an animation)
 * when an object is rendered the first time.
 * 
 * 
 */
public class DisplayObjectContainer extends DisplayObject {

    protected DisplayObjectContainer() {

    }

    DisplayObjectContainer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * [read-only] The number of children of peer container.
     * 
     * @return
     */
    public native int getNumChild()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumChild();
    }-*/;

    /**
     * Adds a child to the container.
     * 
     * @param child
     */
    public native void addChild(DisplayObject child)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addChild(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds a child to the container at a certain index.
     * 
     * @param child
     * @param index
     */
    public native void addChildAt(DisplayObject child, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addChildAt(
						child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						index);
    }-*/;

    /**
     * Dispatches an event on all children (recursively).
     * 
     * @param event
     */
    public native void broadcastEvent(StarlingEvent event)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.broadcastEvent(event.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Determines if a certain object is a child of the container (recursively).
     * 
     * @param child
     * @return
     */
    public native boolean contains(DisplayObject child)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.contains(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Returns a child object at a certain index.
     * 
     * @param index
     * @return
     */
    public native DisplayObject getChildAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildAt(index);
		return @com.emitrom.flash4j.starling.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns a child object with a certain name (non-recursively).
     * 
     * @param name
     * @return
     */
    public native DisplayObject getChildByName(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildByName(name);
		return @com.emitrom.flash4j.starling.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns a child object with a certain name (non-recursively).
     * 
     * @param child
     * @return
     */
    public native int getChildIndex(DisplayObject child)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getChildIndex(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Removes a child from the container.
     * 
     * @param child
     */
    public native void removeChild(DisplayObject child)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.removeChild(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Removes a child from the container.
     * 
     * @param child
     */
    public native void removeChild(DisplayObject child, boolean dispose)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.removeChild(
						child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						dispose);
    }-*/;

    /**
     * Removes a child at a certain index.
     * 
     * @param child
     */
    public native void removeChildAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeChildAt(index);
    }-*/;

    /**
     * Removes a child at a certain index.
     * 
     * @param child
     */
    public native void removeChildAt(int index, boolean dispose)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeChildAt(index, dispose);
    }-*/;

    /**
     * Removes a range of children from the container (endIndex included).
     * 
     * @param beginnIndex
     */
    public native void removeChildren(int beginnIndex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeChildren(beginnIndex);
    }-*/;

    /**
     * Removes a range of children from the container (endIndex included).
     * 
     * @param beginnIndex
     * @param endIndex
     */
    public native void removeChildren(int beginnIndex, int endIndex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeChildren(beginnIndex, endIndex);
    }-*/;

    /**
     * Removes a range of children from the container (endIndex included).
     * 
     * @param beginnIndex
     * @param endIndex
     * @param dispose
     */
    public native void removeChildren(int beginnIndex, int endIndex, boolean dispose)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeChildren(beginnIndex, endIndex, dispose);
    }-*/;

    /**
     * Moves a child to a certain index.
     * 
     * @param child
     * @param index
     */
    public native void setChildIndex(DisplayObject child, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setChildIndex(
						child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						index);
    }-*/;

    /**
     * Swaps the indexes of two children.
     * 
     * @param child1
     * @param child2
     */
    public native void swapChildren(DisplayObject child1, DisplayObject child2)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.swapChildren(
						child1.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						child2.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Swaps the indexes of two children.
     * 
     * @param index1
     * @param index2
     */
    public native void swapChildrenAt(int index1, int index2)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.swapChildrenAt(index1, index2);
    }-*/;

}
