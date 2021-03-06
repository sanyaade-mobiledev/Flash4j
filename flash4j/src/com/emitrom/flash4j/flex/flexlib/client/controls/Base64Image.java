/************************************************************************
  Base64Image.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.ui.mx.Image;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Base64Image.
 */
public class Base64Image extends Image {

    /**
     * Instantiates a new base64 image.
     */
    protected Base64Image(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the base64 image
     */
    public Base64Image() {
        jsObj = Bridge.createObject("flexlib.controls.Base64Image");
    }

    public Base64Image(String value) {
        this();
        setValue(value);
    }

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public native String getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

    /**
     * Sets the value.
     * 
     * @param value
     *            the new value
     */
    public native void setValue(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalue(value);
    }-*/;

}
