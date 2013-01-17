/************************************************************************
  ContextMenuEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.events;

import com.emitrom.air4j.core.client.display.InteractiveObject;
import com.google.gwt.core.client.JavaScriptObject;

public class ContextMenuEvent extends Event {

    public static final String MENU_ITEM_SELECT = getConstant("MENU_ITEM_SELECT");
    public static final String MENU_SELECT = getConstant("MENU_SELECT");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.ContextMenuEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.ContextMenuEvent[name];
    }-*/;

    protected ContextMenuEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native InteractiveObject getContextMenuOwner() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.contextMenuOwner;
		return @com.emitrom.air4j.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setContextMenuOwner(InteractiveObject value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.contextMenuOwner = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public final native boolean isMouseTargetInaccessible() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isMouseTargetInaccessible;
    }-*/;

    public final native void setisMouseTargetInaccessible(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.isMouseTargetInaccessible = value;
    }-*/;

    public final native InteractiveObject getMouseTarget() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.mouseTarget;
		return @com.emitrom.air4j.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setMouseTarget(InteractiveObject value) /*-{
		peer.mouseTarget = value;
    }-*/;

    public static ContextMenuEvent cast(Event e) {
        return new ContextMenuEvent(e.getJsObj());
    }

}
