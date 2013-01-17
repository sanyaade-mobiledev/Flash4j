/************************************************************************
  SimpleMotionPath.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.effects.animation;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SimpleMotionPath.
 */
public class SimpleMotionPath extends MotionPath {

    /**
     * Instantiates a new simple motion path.
     */
    protected SimpleMotionPath(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the simple motion path
     */
    public SimpleMotionPath() {
        jsObj = Bridge.createObject("spark.effects.animation.SimpleMotionPath");
    }

    /**
     * Gets the value by.
     * 
     * @param <T> the generic type
     * @return the value by
     */
    public native <T> T getValueBy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalueBy();
    }-*/;

    /**
     * Sets the value by.
     * 
     * @param value the new value by
     */
    public native void setValueBy(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalueBy(value);
    }-*/;

    /**
     * Gets the value from.
     * 
     * @param <T> the generic type
     * @return the value from
     */
    public native <T> T getValueFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalueFrom();
    }-*/;

    /**
     * Sets the value from.
     * 
     * @param value the new value from
     */
    public native void setValueFrom(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalueFrom(value);
    }-*/;

    /**
     * Gets the value to.
     * 
     * @param <T> the generic type
     * @return the value to
     */
    public native <T> T getValueTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalueTo();
    }-*/;

    /**
     * Sets the value to.
     * 
     * @param value the new value to
     */
    public native void setValueTo(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalueTo(value);
    }-*/;

}
