/************************************************************************
  Wipe.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Wipe.
 */
public class Wipe extends AnimateTransformShader {

    /**
     * Instantiates a new wipe.
     */
    protected Wipe(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the wipe
     */
    public Wipe() {
        jsObj = Bridge.createObject("spark.effects.Wipe");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the wipe
     */
    public Wipe(ProxyObject target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public WipeDirection getDirection() {
        return WipeDirection.fromValue(_getDirection());
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
    public void setDirection(WipeDirection direction) {
        this._setDirection(direction.value);
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

}
