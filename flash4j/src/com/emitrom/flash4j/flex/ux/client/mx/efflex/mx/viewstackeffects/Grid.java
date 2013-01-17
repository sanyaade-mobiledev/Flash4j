/************************************************************************
  Grid.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class Grid.
 */
public class Grid extends ViewStackTweenEffect {

    /** The Constant DEFAULT_NUM_COLUMNS. */
    public static int DEFAULT_NUM_COLUMNS = 3;

    /** The Constant BASE_DISTANCE_ON_WIDTH. */
    public static String BASE_DISTANCE_ON_WIDTH = "width";

    /** The Constant BASE_DISTANCE_ON_HEIGHT. */
    public static String BASE_DISTANCE_ON_HEIGHT = "height";

    /**
     * Instantiates a new grid.
     */
    protected Grid(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the grid
     */
    public Grid() {
        jsObj = Bridge.createObject("org.efflex.mx.viewStackEffects.Grid");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the grid
     */
    public Grid(UIComponent target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the base distance on.
     * 
     * @return the base distance on
     */
    public native String getBaseDistanceOn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbaseDistanceOn();
    }-*/;

    /**
     * Sets the base distance on.
     * 
     * @param value
     *            the new base distance on
     */
    public native void setBaseDistanceOn(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbaseDistanceOn(value);
    }-*/;

    /**
     * Base duration on distance.
     * 
     * @return true, if successful
     */
    public native boolean baseDurationOnDistance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbaseDurationOnDistance();
    }-*/;

    /**
     * Sets the base duration on distance.
     * 
     * @param value
     *            the new base duration on distance
     */
    public native void setBaseDurationOnDistance(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbaseDurationOnDistance(value);
    }-*/;

    /**
     * Gets the num columns.
     * 
     * @return the num columns
     */
    public native int getNumColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumColumns();
    }-*/;

    /**
     * Sets the num column.
     * 
     * @param value
     *            the new num column
     */
    public native void setNumColumn(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnumColumn(value);
    }-*/;

}
