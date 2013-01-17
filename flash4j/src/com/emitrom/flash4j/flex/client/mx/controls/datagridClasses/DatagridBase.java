/************************************************************************
  DatagridBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls.datagridClasses;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.flex.client.mx.controls.listClasses.ListBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DatagridBase.
 */
public class DatagridBase extends ListBase {

    /**
     * Instantiates a new datagrid base.
     */
    protected DatagridBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the datagrid base
     */
    public DatagridBase() {
        jsObj = JsoHelper.createObject();
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
     * @param value
     *            the new header height
     */
    public native void setHeaderHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheaderHeight(value);
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
     * @param value
     *            the new show headers
     */
    public native void setShowHeaders(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowHeaders(value);
    }-*/;

}
