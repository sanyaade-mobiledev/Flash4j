/************************************************************************
  NativeDragEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.desktop.Clipboard;
import com.emitrom.air4j.core.client.desktop.NativeDragActions;
import com.emitrom.air4j.core.client.desktop.NativeDragOptions;
import com.google.gwt.core.client.JavaScriptObject;

public class NativeDragEvent extends MouseEvent {

    public static final String NATIVE_DRAG_COMPLETE = getConstant("NATIVE_DRAG_COMPLETE");
    public static final String NATIVE_DRAG_DROP = getConstant("NATIVE_DRAG_DROP");
    public static final String NATIVE_DRAG_ENTER = getConstant("NATIVE_DRAG_ENTER");
    public static final String NATIVE_DRAG_EXIT = getConstant("NATIVE_DRAG_EXIT");
    public static final String NATIVE_DRAG_OVER = getConstant("NATIVE_DRAG_OVER");
    public static final String NATIVE_DRAG_START = getConstant("NATIVE_DRAG_START");
    public static final String NATIVE_DRAG_UPDATE = getConstant("NATIVE_DRAG_UPDATE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.NativeDragEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.NativeDragEvent[name];
    }-*/;

    protected NativeDragEvent(JavaScriptObject obj) {
        super(obj);
    }

    public final native NativeDragOptions getAllowedActions() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.allowedActions;
		return @com.emitrom.air4j.core.client.desktop.NativeDragOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Clipboard getClipboard() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clipboard;
		return @com.emitrom.air4j.core.client.desktop.Clipboard::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final NativeDragActions getDropAction() {
        return NativeDragActions.fromValue(_getDropAction());
    }

    private native String _getDropAction() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.dropAction;
    }-*/;

}
