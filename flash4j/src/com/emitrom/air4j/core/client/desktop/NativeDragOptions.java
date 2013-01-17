/************************************************************************
  NativeDragOptions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The NativeDragOptions class defines constants for the names of drag-and-drop
 * actions allowed in a drag-and-drop operation. Drag actions are part of a
 * feedback mechanism to allow the initiating and target objects to cooperate in
 * the drag-and-drop exchange. The actions are only a hint to the operating
 * system. It is up to the drag initiator and target objects involved in the
 * transaction to implement the proper behavior.
 * <p>
 * An initiating object should only allow the actions that it supports. For
 * example, an initiating object should allow the move action only if that
 * object's internal logic removes the source data when a target accepts a drop
 * with a move action.
 * <p>
 * A new NativeDragOptions object has all properties initialized to true (all
 * actions allowed)
 * 
 */
public class NativeDragOptions extends ProxyObject {

    public NativeDragOptions() {
        jsObj = createNativePeer();
    }

    private NativeDragOptions(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * A drop target is allowed to copy the dragged data.
     * 
     * @return
     */
    public native boolean allowCopy() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.allowCopy;
    }-*/;

    /**
     * A drop target is allowed to copy the dragged data.
     * 
     * @param allowCopy
     */
    public native void setAllowCopy(boolean allowCopy) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.allowCopy = allowCopy;
    }-*/;

    /**
     * A drop target is allowed to create a link to the dragged data.
     * 
     * @return
     */
    public native boolean allowLink() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.allowLink;
    }-*/;

    /**
     * A drop target is allowed to create a link to the dragged data.
     * 
     * @param allowLink
     */
    public native void setAllowLink(boolean allowLink) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.allowLink = allowLink;
    }-*/;

    /**
     * A drop target is allowed to move the dragged data.
     * 
     * @return
     */
    public native boolean allowMove() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.allowMove;
    }-*/;

    /**
     * A drop target is allowed to move the dragged data.
     * 
     * @param allowMove
     */
    public native void setAllowMove(boolean allowMove) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.allowMove = allowMove;
    }-*/;

    private native JavaScriptObject createNativePeer()/*-{
		return new $wnd.runtime.flash.desktop.NativeDragOptions();
    }-*/;

}
