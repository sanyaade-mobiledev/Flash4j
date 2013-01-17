/************************************************************************
  NativeDragManager.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.desktop;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.display.BitmapData;
import com.emitrom.air4j.core.client.display.InteractiveObject;
import com.emitrom.air4j.core.client.geom.Point;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The NativeDragManager class coordinates drag-and-drop operations. With the
 * native drag-and-drop API, you can allow a user to drag data between an AIR
 * application and the native operating system, between two applications, or
 * between components within a single application.
 * 
 */
public class NativeDragManager extends ProxyObject {

    private static final NativeDragManager INSTANCE = new NativeDragManager();

    public static NativeDragManager get() {
        return INSTANCE;
    }

    private NativeDragManager() {
        jsObj = createNativePeer();
    }

    /**
     * The interactive object passed to the NativeDragManager.get().doDrag()
     * call that initiated the drag operation.
     * 
     * @return
     */
    public native InteractiveObject getDragInitiator() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.dragInitiator;
		var toReturn = @com.emitrom.air4j.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The drag action specified by the drop target.
     * 
     * @return
     */
    public NativeDragActions getDropAction() {
        return NativeDragActions.fromValue(_getDropAction());
    }

    private native String _getDropAction() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.dropAction;
    }-*/;

    /**
     * The drag action specified by the drop target.
     * 
     * @param dropAction
     */
    public void setDropAction(NativeDragActions dropAction) {
        _setDropAction(dropAction.value);
    }

    private native void _setDropAction(String dropAction) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.dropAction = dropAction;
    }-*/;

    /**
     * Reports whether a drag operation is currently in progress.
     * 
     * @return
     */
    public native boolean isDragging() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isDragging;
    }-*/;

    /**
     * The isSupported property is set to true if the NativeDragManager class is
     * supported on the current platform, otherwise it is set to false.
     * 
     * @return
     */
    public native static boolean isSupported() /*-{
		return $wnd.runtime.flash.desktop.NativeDragManager.isSupported;
    }-*/;

    /**
     * Informs the NativeDragManager object that the specified target
     * interactive object can accept a drop corresponding to the current drag
     * event.
     * 
     * @param target
     */
    public native void acceptDragDrop(InteractiveObject target) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.acceptDragDrop(target.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Starts a drag-and-drop operation.
     * 
     * @param dragInitiator
     * @param clipboard
     */
    public native static void doDrag(InteractiveObject dragInitiator, Clipboard clipboard) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator,
						clipboard.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Starts a drag-and-drop operation.
     * 
     * @param dragInitiator
     * @param clipboard
     * @param dragImage
     */
    public native static void doDrag(InteractiveObject dragInitiator, Clipboard clipboard, BitmapData dragImage) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						clipboard.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						dragImage.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Starts a drag-and-drop operation.
     */
    public native static void doDrag(InteractiveObject dragInitiator, Clipboard clipboard, BitmapData dragImage,
                    Point offset) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						clipboard.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						dragImage.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						offset.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Starts a drag-and-drop operation.
     * 
     * @param dragInitiator
     * @param clipboard
     * @param dragImage
     * @param offset
     * @param allowedOptions
     */
    public native static void doDrag(InteractiveObject dragInitiator, Clipboard clipboard, BitmapData dragImage,
                    Point offset, NativeDragOptions allowedOptions) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.doDrag(
						dragInitiator.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						clipboard.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						dragImage.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						offset.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						allowedOptions.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());

    }-*/;

    private native JavaScriptObject createNativePeer()/*-{
		return $wnd.runtime.flash.desktop.NativeDragManager;
    }-*/;

}
