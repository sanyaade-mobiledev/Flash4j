/************************************************************************
  TitledBorderWindow.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers.fieldset;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.ui.mx.Button;
import com.emitrom.flash4j.flex.client.ui.mx.TitleWindow;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TitledBorderWindow.
 */
public class TitledBorderWindow extends TitleWindow {

    /**
     * Instantiates a new titled border window.
     */
    protected TitledBorderWindow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the titled border window
     */
    public TitledBorderWindow() {
        jsObj = Bridge.createObject("flex.utils.ui.TitledBorderWindow");
        setTitle("");
    }

    /**
     * New instance.
     * 
     * @param title
     *            the title
     * @return the titled border window
     */
    public TitledBorderWindow(String title) {
        this();
        setTitle(title);
    }

    /**
     * Border drop shadow.
     * 
     * @return true, if successful
     */
    public native boolean borderDropShadow()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getborderDropShadow();
    }-*/;

    /**
     * Sets the border drop shadow.
     * 
     * @param value
     *            the new border drop shadow
     */
    public native void setBorderDropShadow(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setborderDropShadow(value);
    }-*/;

    /**
     * Adds the title bar button.
     * 
     * @param btn
     *            the btn
     */
    public void addTitleBarButton(Button btn) {
        btn.setWidth(20);
        btn.setHeight(20);
        _addTitleBarButton(btn);
    }

    /**
     * _add title bar button.
     * 
     * @param btn
     *            the btn
     */
    private native void _addTitleBarButton(UIComponent btn)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addTitleBarButton(btn.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Removes the title bar button.
     * 
     * @param btn
     *            the btn
     * @return true, if successful
     */
    public native boolean removeTitleBarButton(Button btn)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.removeTitleBarButton(btn.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
