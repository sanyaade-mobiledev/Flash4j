/************************************************************************
  Resize.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.layout;

import com.emitrom.flash4j.alivepdf.client.core.SizeFactory;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Resize.
 */
public class Resize extends ProxyObject {

    /**
     * Instantiates a new resize.
     */
    Resize(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param mode the mode
     * @param position the position
     * @return the resize
     */
    public Resize(Mode mode, Position position) {
        jsObj = SizeFactory.INSTANCE.createResize(mode.value, position.value);
    }

    /**
     * Gets the position.
     * 
     * @return the position
     */
    public final Position getPosition() {
        return Position.fromValue(_getPosition());
    }

    /**
     * _get position.
     * 
     * @return the string
     */
    private final native String _getPosition() /*-{
		var peer = peer.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getPosition();
    }-*/;

    /**
     * Sets the position.
     * 
     * @param position the new position
     */
    public final void setPosition(Position position) {
        _setPosition(position.value);
    }

    /**
     * _set position.
     * 
     * @param value the value
     */
    private final native void _setPosition(String value) /*-{
		var peer = peer.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setPosition(value);
    }-*/;

    /**
     * Gets the mode.
     * 
     * @return the mode
     */
    public final Mode getMode() {
        return Mode.fromValue(_getMode());
    }

    /**
     * _get mode.
     * 
     * @return the string
     */
    private final native String _getMode() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMode();
    }-*/;

    /**
     * Sets the mode.
     * 
     * @param mode the new mode
     */
    public final void setMode(Mode mode) {
        _setMode(mode.value);
    }

    /**
     * _set mode.
     * 
     * @param value the value
     */
    private final native void _setMode(String value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setMode(value);
    }-*/;
}
