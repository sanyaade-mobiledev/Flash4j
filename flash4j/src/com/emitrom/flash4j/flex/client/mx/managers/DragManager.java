/************************************************************************
  DragManager.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.managers;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.events.MouseEvent;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.DragSource;
import com.emitrom.flash4j.flex.client.mx.core.IFlexDisplayObject;
import com.emitrom.flash4j.flex.client.mx.core.IUIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The DragManager class manages drag and drop operations, which let you move
 * data from one place to another in a Flex application. For example, you can
 * select an object, such as an item in a List control or a Flex control, such
 * as an Image control, and then drag it over another component to add it to
 * that component. All methods and properties of the DragManager are static, so
 * you do not need to create an instance of it.
 * <p>
 * All Flex components support drag and drop operations. Flex provides
 * additional support for drag and drop to the List, Tree, and DataGrid
 * controls.
 * <p>
 * When the user selects an item with the mouse, the selected component is
 * called the drag initiator. The image displayed during the drag operation is
 * called the drag proxy.
 * <p>
 * When the user moves the drag proxy over another component, the dragEnter
 * event is sent to that component. If the component accepts the drag, it
 * becomes the drop target and receives dragOver, dragExit, and dragDrop events.
 * <p>
 * When the drag is complete, a dragComplete event is sent to the drag
 * initiator.
 */
public class DragManager extends ProxyObject {

    private static final DragManager INSTANCE = new DragManager(Bridge.createObject("mx.manager.DragManager"));

    /** The Constant COPY. */
    public final static String COPY = "copy";

    /** The Constant LINK. */
    public final static String LINK = "link";

    /** The Constant MOVE. */
    public final static String MOVE = "move";

    /** The Constant NONE. */
    public final static String NONE = "none";

    /**
     * Instantiates a new drag manager.
     */
    protected DragManager(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the drag manager
     */
    private static DragManager create() {
        return INSTANCE;
    }

    /**
     * Checks if is dragging.
     * 
     * @return true, if is dragging
     */
    public static boolean isDragging() {
        return create()._isDragging();
    }

    /**
     * _is dragging.
     * 
     * @return true, if successful
     */
    private final native boolean _isDragging()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisDragging();
    }-*/;

    /**
     * Accept dra drop.
     * 
     * @param target the target
     */
    public static void acceptDraDrop(IUIComponent target) {
        create().acceptDragDrop(target.asIUIComponent());
    }

    /**
     * Accept drag drop.
     * 
     * @param target the target
     */
    private final native void acceptDragDrop(JavaScriptObject target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.acceptDragDrop(target);
    }-*/;

    /**
     * Gets the feed back.
     * 
     * @return the feed back
     */
    public static String getFeedBack() {
        return create()._getFeedBack();
    }

    /**
     * _get feed back.
     * 
     * @return the string
     */
    private final native String _getFeedBack()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfeedBack();
    }-*/;

    /**
     * Show feed back.
     * 
     * @param value the value
     */
    public static void showFeedBack(String value) {
        create()._showFeedBack(value);
    }

    /**
     * _show feed back.
     * 
     * @param value the value
     */
    private final native void _showFeedBack(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.showFeedBack(value);
    }-*/;

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     */
    public static void doDrag(IUIComponent dragInitiator, DragSource dragSource, MouseEvent mouseEvent) {
        create().doDrag(dragInitiator.asIUIComponent(), dragSource, mouseEvent);
    }

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     */
    private final native void doDrag(JavaScriptObject dragInitiator, DragSource dragSource, MouseEvent mouseEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator,
						dragSource,
						mouseEvent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     */
    public static void doDrag(IUIComponent dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    IFlexDisplayObject dragImage) {
        create().doDrag(dragInitiator.asIUIComponent(), dragSource, mouseEvent, dragImage.asIFlexDisplayObject());
    }

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     */
    private final native void doDrag(JavaScriptObject dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    JavaScriptObject dragImage)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator,
						dragSource,
						mouseEvent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						dragImage);
    }-*/;

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     * @param xOffset the x offset
     */
    public static void doDrag(IUIComponent dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    IFlexDisplayObject dragImage, double xOffset) {
        create().doDrag(dragInitiator.asIUIComponent(), dragSource, mouseEvent, dragImage.asIFlexDisplayObject(),
                        xOffset);
    }

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     * @param xOffset the x offset
     */
    private final native void doDrag(JavaScriptObject dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    JavaScriptObject dragImage, double xOffset)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator,
						dragSource,
						mouseEvent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						dragImage, xOffset);
    }-*/;

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     * @param xOffset the x offset
     * @param yOffset the y offset
     */
    public static void doDrag(IUIComponent dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    IFlexDisplayObject dragImage, double xOffset, double yOffset) {
        create().doDrag(dragInitiator.asIUIComponent(), dragSource, mouseEvent, dragImage.asIFlexDisplayObject(),
                        xOffset, yOffset);
    }

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     * @param xOffset the x offset
     * @param yOffset the y offset
     */
    private final native void doDrag(JavaScriptObject dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    JavaScriptObject dragImage, double xOffset, double yOffset)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator,
						dragSource,
						mouseEvent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						dragImage, xOffset, yOffset);
    }-*/;

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     * @param xOffset the x offset
     * @param yOffset the y offset
     * @param imageAlpha the image alpha
     */
    public static void doDrag(IUIComponent dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    IFlexDisplayObject dragImage, double xOffset, double yOffset, double imageAlpha) {
        create().doDrag(dragInitiator.asIUIComponent(), dragSource, mouseEvent, dragImage.asIFlexDisplayObject(),
                        xOffset, yOffset, imageAlpha);
    }

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     * @param xOffset the x offset
     * @param yOffset the y offset
     * @param imageAlpha the image alpha
     */
    private final native void doDrag(JavaScriptObject dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    JavaScriptObject dragImage, double xOffset, double yOffset, double imageAlpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator,
						dragSource,
						mouseEvent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						dragImage, xOffset, yOffset, imageAlpha);
    }-*/;

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     * @param xOffset the x offset
     * @param yOffset the y offset
     * @param imageAlpha the image alpha
     * @param allowMove the allow move
     */
    public static void doDrag(IUIComponent dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    IFlexDisplayObject dragImage, double xOffset, double yOffset, double imageAlpha, boolean allowMove) {
        create()._doDrag(dragInitiator.asIUIComponent(), dragSource, mouseEvent, dragImage.asIFlexDisplayObject(),
                        xOffset, yOffset, imageAlpha, allowMove);
    }

    /**
     * Do drag.
     * 
     * @param dragInitiator the drag initiator
     * @param dragSource the drag source
     * @param mouseEvent the mouse event
     * @param dragImage the drag image
     * @param xOffset the x offset
     * @param yOffset the y offset
     * @param imageAlpha the image alpha
     * @param allowMove the allow move
     */
    private final native void _doDrag(JavaScriptObject dragInitiator, DragSource dragSource, MouseEvent mouseEvent,
                    JavaScriptObject dragImage, double xOffset, double yOffset, double imageAlpha, boolean allowMove)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator,
						dragSource,
						mouseEvent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						dragImage, xOffset, yOffset, imageAlpha, allowMove);
    }-*/;

}
