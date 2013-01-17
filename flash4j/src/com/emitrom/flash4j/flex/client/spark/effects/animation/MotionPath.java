/************************************************************************
  MotionPath.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class MotionPath.
 */
public class MotionPath extends ProxyObject {

    /**
     * Instantiates a new motion path.
     */
    protected MotionPath(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the motion path
     */
    public MotionPath() {
        jsObj = Bridge.createObject("spark.effects.animation.MotionPath");
    }

    /**
     * Gets the property.
     * 
     * @return the property
     */
    public native String getProperty()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getproperty();
    }-*/;

    /**
     * Sets the property.
     * 
     * @param value the new property
     */
    public native void setProperty(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setproperty(value);
    }-*/;

}
