/************************************************************************
  Box.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class Box.
 */
public class Box extends Container {

    /**
     * Instantiates a new box.
     */
    protected Box(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the box
     */
    public Box() {
        jsObj = Bridge.createObject("mx.containers.Box");
    }

    public Box(BoxDirection direction) {
        this();
        setDirection(direction);
    }

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public BoxDirection getDirection() {
        return BoxDirection.fromValue(_getDirection());
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
     * @param direction
     *            the new direction
     */
    public void setDirection(BoxDirection direction) {
        this.setDirection(direction.value);
    }

    /**
     * Sets the direction.
     * 
     * @param value
     *            the new direction
     */
    private native void setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

    /**
     * Pixels to percent.
     * 
     * @param value
     *            the value
     * @return the double
     */
    public native double pixelsToPercent(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.pixelsToPercent(value);
    }-*/;

}
