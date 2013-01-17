/************************************************************************
  BouncingBurningTile.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.fisheye.fisheyeclasses;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class BouncingBurningTile.
 */
public class BouncingBurningTile extends UIComponent {

    /**
     * Instantiates a new bouncing burning tile.
     */
    protected BouncingBurningTile(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the bouncing burning tile
     */
    public BouncingBurningTile() {
        jsObj = Bridge.createObject("com.dougmccune.controls.BouncingBurningTile");
    }

    /**
     * Bounce image.
     * 
     * @param count
     *            the count
     * @param xTo
     *            the x to
     * @param yTo
     *            the y to
     */
    public native void bounceImage(int count, double xTo, double yTo)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.bounceImage(count, xTo, yTo);
    }-*/;

    /**
     * Bounce image.
     * 
     * @param count
     *            the count
     * @param xTo
     *            the x to
     * @param yTo
     *            the y to
     * @param minCount
     *            the min count
     */
    public native void bounceImage(int count, double xTo, double yTo, int minCount)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.bounceImage(count, xTo, yTo, minCount);
    }-*/;

    /**
     * Stop bouncing.
     */
    public native void stopBouncing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stopBouncing();
    }-*/;

    /**
     * Checks if is burning.
     * 
     * @return true, if is burning
     */
    public native boolean isBurning()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getburning();
    }-*/;

    /**
     * Sets the burning.
     * 
     * @param value
     *            the new burning
     */
    public native void setBurning(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setburning(value);
    }-*/;

}
