/************************************************************************
  AnimateTransformShader.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.BitmapData;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AnimateTransformShader.
 */
public class AnimateTransformShader extends Animate {

    /**
     * Instantiates a new animate transform shader.
     */
    protected AnimateTransformShader(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the animate transform shader
     */
    public AnimateTransformShader() {
        jsObj = Bridge.createObject("spark.effects.AnimateTransformShader");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the animate transform shader
     */
    public AnimateTransformShader(ProxyObject target) {
        this();
        setTarget(target.getJsObj());
    }

    /**
     * Sets the bitmap from.
     * 
     * @param value the new bitmap from
     */
    public native void setBitmapFrom(BitmapData value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setbitmapFrom(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the bitmap to.
     * 
     * @param value the new bitmap to
     */
    public native void setBitmapTo(BitmapData value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setbitmapTo(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the shader byte code.
     * 
     * @param <T> the generic type
     * @return the shader byte code
     */
    public native <T> T getShaderByteCode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshaderByteCode();
    }-*/;

    /**
     * Sets the shader byte code.
     * 
     * @param value the new shader byte code
     */
    public native void setShaderByteCode(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshaderByteCode(value);
    }-*/;

    /**
     * Gets the shader properties.
     * 
     * @param <T> the generic type
     * @return the shader properties
     */
    public native <T> T getShaderProperties()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshaderProperties();
    }-*/;

    /**
     * Sets the shader properties.
     * 
     * @param value the new shader properties
     */
    public native void setShaderProperties(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshaderProperties(value);
    }-*/;

}
