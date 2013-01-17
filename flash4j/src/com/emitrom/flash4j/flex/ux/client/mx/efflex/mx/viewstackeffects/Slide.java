/************************************************************************
  Slide.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class Slide.
 */
public class Slide extends ViewStackTweenEffect {

    /** The Constant HORIZONTAL. */
    public static String HORIZONTAL = "horizontal";

    /** The Constant VERTICAL. */
    public static String VERTICAL = "vertical";

    /** The Constant DOWN. */
    public static String DOWN = "down";

    /** The Constant UP. */
    public static String UP = "up";

    /** The Constant LEFT. */
    public static String LEFT = "left";

    /** The Constant RIGHT. */
    public static String RIGHT = "right";

    /** The Constant IN. */
    public static String IN = "in";

    /** The Constant OUT. */
    public static String OUT = "out";

    /** The Constant TOGETHER. */
    public static String TOGETHER = "together";

    /**
     * Instantiates a new slide.
     */
    protected Slide(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the slide
     */
    public Slide() {
        jsObj = Bridge.createObject("org.efflex.mx.viewStackEffects.Slide");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the slide
     */
    public Slide(UIComponent target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the slide type.
     * 
     * @return the slide type
     */
    public native String getSlideType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getslideType();
    }-*/;

    /**
     * Sets the slide type.
     * 
     * @param value
     *            the new slide type
     */
    public native void setSlideType(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setslideType(value);
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
