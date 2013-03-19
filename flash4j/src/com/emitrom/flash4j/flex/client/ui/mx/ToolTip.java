/************************************************************************
  ToolTip.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ToolTip.
 */
public class ToolTip extends UIComponent {

    private static final ToolTip INSTANCE = new ToolTip();

    /**
     * Instantiates a new tool tip.
     */
    protected ToolTip(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the tool tip
     */
    public ToolTip() {
        jsObj = Bridge.createObject("mx.controls.ToolTip");
    }

    public ToolTip(String text) {
        this();
        setText(text);
    }

    /**
     * Sets the text.
     * 
     * @param value the new text
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public native String getText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettext();
    }-*/;

    /**
     * Gets the tool tip max width.
     * 
     * @return the tool tip max width
     */
    public static double getToolTipMaxWidth() {
        return INSTANCE._getToolTipMaxWidth();
    }

    /**
     * _get tool tip max width.
     * 
     * @return the double
     */
    private native double _getToolTipMaxWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxWidth();
    }-*/;

    /**
     * Sets the too tip max width.
     * 
     * @param value the new too tip max width
     */
    public static void setTooTipMaxWidth(double value) {
        INSTANCE._setToolTipMaxWidth(value);
    }

    /**
     * _set tool tip max width.
     * 
     * @param value the value
     */
    private native void _setToolTipMaxWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxWidth(value);
    }-*/;

}
