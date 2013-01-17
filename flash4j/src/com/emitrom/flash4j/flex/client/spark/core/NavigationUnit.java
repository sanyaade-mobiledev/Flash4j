/************************************************************************
  NavigationUnit.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.core;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;

/**
 * The Class NavigationUnit.
 */
public class NavigationUnit extends ProxyObject {

    private static final NavigationUnit INSTANCE = new NavigationUnit();
    /** The Constant DOWN. */
    public static final int DOWN = 40;

    /** The Constant END. */
    public static final int END = 35;

    /** The Constant HOME. */
    public static final int HOME = 36;

    /** The Constant LEFT. */
    public static final int LEFT = 37;

    /** The Constant PAGE_DOWN. */
    public static final int PAGE_DOWN = 34;

    /** The Constant PAGE_RIGHT. */
    public static final int PAGE_RIGHT = 0x2397;

    /** The Constant PAGE_UP. */
    public static final int PAGE_UP = 33;

    /** The Constant RIGHT. */
    public static final int RIGHT = 39;

    /** The Constant UP. */
    public static final int UP = 38;

    /**
     * Creates the.
     * 
     * @return the navigation unit
     */
    private NavigationUnit() {
        jsObj = Bridge.createObject("spark.core.NavigationUnit");
    }

    /**
     * Checks if is validation unit.
     * 
     * @param keyCode the key code
     * @return true, if is validation unit
     */
    public static boolean isValidationUnit(int keyCode) {
        return INSTANCE._isValidationUnit(keyCode);
    }

    /**
     * _is validation unit.
     * 
     * @param keyCode the key code
     * @return true, if successful
     */
    public final native boolean _isValidationUnit(int keyCode)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isValidationUnit(keyCode);
    }-*/;

}
