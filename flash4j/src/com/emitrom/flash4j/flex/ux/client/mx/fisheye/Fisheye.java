/************************************************************************
  Fisheye.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.fisheye;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.ux.client.mx.fisheye.fisheyeclasses.FisheyeBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Fisheye.
 */
public class Fisheye extends FisheyeBase {

    /**
     * Instantiates a new fisheye.
     */
    protected Fisheye(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the fisheye
     */
    public Fisheye() {
        jsObj = Bridge.createObject("qs.controls.Fisheye");
    }

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public native String getDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdirection();
    }-*/;

    /**
     * Sets the direction.
     * 
     * @param value
     *            the new direction
     */
    public native void setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

}
