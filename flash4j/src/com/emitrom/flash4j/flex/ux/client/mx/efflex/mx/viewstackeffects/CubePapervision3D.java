/************************************************************************
  CubePapervision3D.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.efflex.mx.viewstackeffects;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CubePapervision3D.
 */
public class CubePapervision3D extends PaperVision3DEffect {

    /** The Constant LEFT. */
    public static String LEFT = "left";

    /** The Constant RIGHT. */
    public static String RIGHT = "right";

    /** The Constant UP. */
    public static String UP = "up";

    /** The Constant DOWN. */
    public static String DOWN = "down";

    /**
     * Instantiates a new cube papervision3 d.
     */
    protected CubePapervision3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the cube papervision3 d
     */
    public CubePapervision3D() {
        jsObj = Bridge.createObject("org.efflex.mx.viewStackEffects.CubePapervision3D");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the cube papervision3 d
     */
    public CubePapervision3D(UIComponent target) {
        this();
        setTarget(target);
    }

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
     * Scale direction by change.
     * 
     * @return true, if successful
     */
    public native boolean scaleDirectionByChange()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleDirectionByChange();
    }-*/;

    /**
     * Sets the scale direction by change.
     * 
     * @param value
     *            the new scale direction by change
     */
    public native void setScaleDirectionByChange(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleDirectionByChange(value);
    }-*/;

}
