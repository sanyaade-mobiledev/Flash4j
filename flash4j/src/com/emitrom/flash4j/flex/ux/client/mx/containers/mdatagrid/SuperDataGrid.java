/************************************************************************
 * SuperDataGrid.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.controls.DataGrid;
import com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.core.ISearchable;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class MDataGrid.
 */
public class SuperDataGrid extends DataGrid implements ISearchable {

    /**
     * Instantiates a new m data grid.
     */
    protected SuperDataGrid(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the m data grid
     */
    public SuperDataGrid() {
        jsObj = Bridge.createObject("com.iwobanas.controls.MDataGrid");
    }

    /**
     * Gets the found.
     * 
     * @return the found
     */
    public native boolean getFound()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfound();
    }-*/;

    /**
     * Find.
     * 
     * @param wildCard
     *            the wild card
     * @return true, if successful
     */
    public native boolean find(String wildCard)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.find(wildCard);
    }-*/;

    /**
     * Find.
     * 
     * @param wildCard
     *            the wild card
     * @param caseInSensitive
     *            the case in sensitive
     * @return true, if successful
     */
    public native boolean find(String wildCard, boolean caseInSensitive)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.find(wildCard, caseInSensitive);
    }-*/;

    /**
     * Find next.
     * 
     * @return true, if successful
     */
    public native boolean findNext()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.findNext();
    }-*/;

    /**
     * Find previous.
     * 
     * @return true, if successful
     */
    public native boolean findPrevious()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.findPrevious();
    }-*/;

    /**
     * Copy data provider.
     * 
     * @return true, if successful
     */
    public native boolean copyDataProvider()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcopyDataProvider();
    }-*/;

    /**
     * Sets the copy data provider.
     * 
     * @param value
     *            the new copy data provider
     */
    public native void setCopyDataProvider(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcopyDataProvider(value);
    }-*/;

    /**
     * As i searchable.
     * 
     * @return the i searchable
     */
    public JavaScriptObject asISearchable() {
        return jsObj;
    }

}
