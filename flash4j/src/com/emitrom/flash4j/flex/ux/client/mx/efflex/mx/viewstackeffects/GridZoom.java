/************************************************************************
  GridZoom.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class GridZoom.
 */
public class GridZoom extends ViewStackTweenEffect {

    /** The Constant DEFAULT_NUM_COLUMNS. */
    public static final int DEFAULT_NUM_COLUMNS = 3;

    /**
     * Instantiates a new grid zoom.
     */
    protected GridZoom(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the grid zoom
     */
    public GridZoom() {
        jsObj = Bridge.createObject("org.efflex.mx.viewStackEffects.GridZoom");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the grid zoom
     */
    public GridZoom(UIComponent target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the num columns.
     * 
     * @return the num columns
     */
    public final native int getNumColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumColumns();
    }-*/;

    /**
     * Sets the num columns.
     * 
     * @param value
     *            the new num columns
     */
    public final native void setNumColumns(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnumColumns(value);
    }-*/;

}
