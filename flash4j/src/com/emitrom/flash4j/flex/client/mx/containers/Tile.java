/************************************************************************
  Tile.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.Container;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Tile.
 */
public class Tile extends Container {

    /**
     * Instantiates a new tile.
     */
    protected Tile(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the tile
     */
    public Tile() {
        jsObj = Bridge.createObject("mx.containers.Tile");
    }

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public TileDirection getDirection() {
        return TileDirection.fromValue(_getDirection());
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
    public void setDirection(TileDirection direction) {
        setDirection(direction.value);
    }

    /**
     * Sets the direction.
     * 
     * @param value the new direction
     */
    private native void setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

    /**
     * Gets the tile height.
     * 
     * @return the tile height
     */
    public native double getTileHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettileHeight();
    }-*/;

    /**
     * Sets the tile height.
     * 
     * @param value the new tile height
     */
    public native void setTileHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settileHeight(value);
    }-*/;

    /**
     * Gets the tile width.
     * 
     * @return the tile width
     */
    public native double getTileWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettileWidth();
    }-*/;

    /**
     * Sets the tile width.
     * 
     * @param value the new tile width
     */
    public native void setTileWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settileWidth(value);
    }-*/;

}
