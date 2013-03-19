/************************************************************************
  TitledBorderBox.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.core.ContainerLayout;
import com.emitrom.flash4j.flex.client.ui.mx.Container;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TitledBorderBox.
 */
public class TitledBorderBox extends Container {

    /**
     * Instantiates a new titled border box.
     */
    protected TitledBorderBox(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the titled border box
     */
    public TitledBorderBox() {
        jsObj = Bridge.createObject("flex.utils.ui.TitledBorderBox");
        setTitle("");
    }

    /**
     * New instance.
     * 
     * @param title
     *            the title
     * @return the titled border box
     */
    public TitledBorderBox(String title) {
        this();
        setTitle(title);
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public native String getTitle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettitle();
    }-*/;

    /**
     * Sets the title.
     * 
     * @param value
     *            the new title
     */
    public native void setTitle(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settitle(value);
    }-*/;

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
     * Gets the layout.
     * 
     * @return the layout
     */
    public ContainerLayout getLayout() {
        return ContainerLayout.fromValue(_getLayout());
    }

    /**
     * _get layout.
     * 
     * @return the string
     */
    private native String _getLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlayout();
    }-*/;

    /**
     * Sets the layout.
     * 
     * @param layout
     *            the new layout
     */
    public void setLayout(ContainerLayout layout) {
        _setLayout(layout.value);
    }

    /**
     * _set layout.
     * 
     * @param value
     *            the value
     */
    private native void _setLayout(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlayout(value);
    }-*/;

}
