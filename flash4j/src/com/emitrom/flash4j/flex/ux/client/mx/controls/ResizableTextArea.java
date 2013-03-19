/************************************************************************
 * ResizableTextArea.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.flex.ux.client.mx.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.ui.mx.TextArea;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ResizableTextArea.
 */
public class ResizableTextArea extends TextArea {

    /**
     * Instantiates a new resizable text area.
     */
    protected ResizableTextArea(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the resizable text area
     */
    public ResizableTextArea() {
        jsObj = Bridge.createObject("flex.utils.ui.resize.ResizableTextArea");
    }

    /**
     * Checks if is resizable.
     * 
     * @return true, if is resizable
     */
    public native boolean isResizable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getresizable();
    }-*/;

    /**
     * Sets the resizable.
     * 
     * @param value
     *            the new resizable
     */
    public native void setResizable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setresizable(value);
    }-*/;

    /**
     * Bring to front on resize.
     * 
     * @return true, if successful
     */
    public native boolean bringToFrontOnResize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbringToFrontOnResize();
    }-*/;

    /**
     * Sets the bring to front on resize.
     * 
     * @param value
     *            the new bring to front on resize
     */
    public native void setBringToFrontOnResize(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbringToFrontOnResize(value);
    }-*/;

    /**
     * Keep aspect ratio.
     * 
     * @return true, if successful
     */
    public native boolean keepAspectRatio() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getkeepAspectRatio();
    }-*/;

    /**
     * Sets the keep aspect ratio.
     * 
     * @param value
     *            the new keep aspect ratio
     */
    public native void setKeepAspectRatio(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setkeepAspectRatio(value);
    }-*/;
}
