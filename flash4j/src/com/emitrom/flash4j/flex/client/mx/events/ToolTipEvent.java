/************************************************************************
  ToolTipEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.controls.ToolTip;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ToolTipEvent.
 */
public class ToolTipEvent extends Event {

    /** The Constant TOOL_TIP_CREATE. */
    public static final String TOOL_TIP_CREATE = "toolTipCreate";

    /** The Constant TOOL_TIP_END. */
    public static final String TOOL_TIP_END = "toolTipEnd";

    /** The Constant TOOL_TIP_HIDE. */
    public static final String TOOL_TIP_HIDE = "toolTipHide";

    /** The Constant TOOL_TIP_SHOW. */
    public static final String TOOL_TIP_SHOW = "tooTipShow";

    /** The Constant TOOL_TIP_SHOWN. */
    public static final String TOOL_TIP_SHOWN = "toolTipShown";

    /** The Constant TOOL_TIP_START. */
    public static final String TOOL_TIP_START = "toolTipStart";

    /**
     * Instantiates a new tool tip event.
     */
    protected ToolTipEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the tool tip.
     * 
     * @return the tool tip
     */
    public final native ToolTip getToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettoolTip();
		return @com.emitrom.flash4j.flex.client.mx.controls.ToolTip::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;
}
