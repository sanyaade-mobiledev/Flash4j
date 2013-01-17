/************************************************************************
  GrayColor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.colors;

import com.emitrom.flash4j.alivepdf.client.core.AlivePdfFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class GrayColor.
 */
public class GrayColor extends BaseColor {

    /**
     * Instantiates a new gray color.
     */
    GrayColor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param gray the gray
     * @return the gray color
     */
    public GrayColor(double gray) {
        jsObj = AlivePdfFactory.INSTANCE.createGrayColor(gray);
    }

    /**
     * Gets the gray.
     * 
     * @return the gray
     */
    public final native double getGray()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getgray();
    }-*/;

    /**
     * Sets the gray.
     * 
     * @param newValue the new gray
     */
    public final native void setGray(double newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setgray(newValue);
    }-*/;

}
