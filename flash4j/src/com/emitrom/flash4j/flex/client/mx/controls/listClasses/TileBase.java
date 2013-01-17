/************************************************************************
  TileBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls.listClasses;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TileBase.
 */
public class TileBase extends ListBase {

    /**
     * Instantiates a new tile base.
     */
    TileBase(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the tile base
     */
    public TileBase() {
        jsObj = Bridge.createObject("mx.controls.listClasses.TileBase");
    }

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public TileBaseDirection getDirection() {
        return TileBaseDirection.fromValue(_getDirection());
    }

    /**
     * _get direction.
     * 
     * @return the string
     */
    private native String _getDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdirection();
    }-*/;

    /**
     * Sets the direction.
     * 
     * @param direction the new direction
     */
    public void setDirection(TileBaseDirection direction) {
        _setDirection(direction.value);
    }

    /**
     * _set direction.
     * 
     * @param value the value
     */
    private native void _setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

    /**
     * Gets the max columns.
     * 
     * @return the max columns
     */
    public native int getMaxColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxColumns();
    }-*/;

    /**
     * Sets the max columns.
     * 
     * @param value the new max columns
     */
    public native void setMaxColumns(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxColumns(value);
    }-*/;

    /**
     * Gets the max rows.
     * 
     * @return the max rows
     */
    public native int getMaxRows()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxRows();
    }-*/;

    /**
     * Sets the max rows.
     * 
     * @param value the new max rows
     */
    public native void setMaxRows(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxRows(value);
    }-*/;

}
