/************************************************************************
  AdvancedDataGridBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls.advancedDataGridClasses;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.controls.listClasses.AdvancedListBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AdvancedDataGridBase.
 */
public class AdvancedDataGridBase extends AdvancedListBase {

    /**
     * Instantiates a new advanced data grid base.
     */
    AdvancedDataGridBase(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the advanced data grid base
     */
    public AdvancedDataGridBase() {
        jsObj = Bridge.createObject("mx.controls.advancedDataGridClasses.AdvancedDataGridBase");
    }

    /**
     * Gets the header height.
     * 
     * @return the header height
     */
    public native double getHeaderHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheaderHeight();
    }-*/;

    /**
     * Sets the header height.
     * 
     * @param value the new header height
     */
    public native void setHeaderHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheaderHeight(value);
    }-*/;

    /**
     * Header word wrap.
     * 
     * @return true, if successful
     */
    public native boolean headerWordWrap()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheaderWordWrap();
    }-*/;

    /**
     * Sets the header word wrap.
     * 
     * @param value the new header word wrap
     */
    public native void setHeaderWordWrap(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheaderWordWrap(value);
    }-*/;

    /**
     * Gets the selection mode.
     * 
     * @return the selection mode
     */
    public native String getSelectionMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectionMode();
    }-*/;

    /**
     * Sets the selection mode.
     * 
     * @param value the new selection mode
     */
    public native void setSelectionMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectionMode(value);
    }-*/;

    /**
     * Show headers.
     * 
     * @return true, if successful
     */
    public native boolean showHeaders()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowHeaders();
    }-*/;

    /**
     * Sets the show headers.
     * 
     * @param value the new show headers
     */
    public native void setShowHeaders(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowHeaders(value);
    }-*/;

}
