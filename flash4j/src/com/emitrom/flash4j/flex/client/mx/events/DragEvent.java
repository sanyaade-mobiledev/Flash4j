/************************************************************************
  DragEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.events.MouseEvent;
import com.emitrom.flash4j.flex.client.mx.core.DragSource;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DragEvent.
 */
public class DragEvent extends MouseEvent {

    /** The Constant DRAG_COMPLTE. */
    public final static String DRAG_COMPLTE = "dragComplete";

    /** The Constant DRAG_DROP. */
    public final static String DRAG_DROP = "dragDrop";

    /** The Constant DRAG_ENTER. */
    public final static String DRAG_ENTER = "dragEnter";

    /** The Constant DRAG_EXIT. */
    public final static String DRAG_EXIT = "dragExit";

    /** The Constant DRAG_OVER. */
    public final static String DRAG_OVER = "dragOver";

    /** The Constant DRAG_START. */
    public final static String DRAG_START = "dragStart";

    /**
     * Instantiates a new drag event.
     */
    protected DragEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the action.
     * 
     * @return the action
     */
    public final native String getAction()/*-{
		return peer.getaction();
    }-*/;

    /**
     * Gets the dragged item.
     * 
     * @param <T> the generic type
     * @return the dragged item
     */
    public final native <T> T getDraggedItem()/*-{
		return peer.getdraggedItem();
    }-*/;

    /**
     * Gets the drag initiator.
     * 
     * @return the drag initiator
     */
    public final native UIComponent getDragInitiator()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdragInitiator();
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the drag source.
     * 
     * @return the drag source
     */
    public final native DragSource getDragSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdragSource();
		return @com.emitrom.flash4j.flex.client.mx.core.DragSource::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static DragEvent cast(Event event) {
        return new DragEvent(event.getJsObj());
    }

}
