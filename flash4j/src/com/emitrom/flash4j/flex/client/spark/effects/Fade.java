/************************************************************************
  Fade.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Fade.
 */
public class Fade extends Animate {

    /**
     * Instantiates a new fade.
     */
    protected Fade(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the fade
     */
    public Fade() {
        jsObj = Bridge.createObject("spark.effects.Fade");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the fade
     */
    public Fade(ProxyObject target) {
        super(target);
    }

    public Fade(ProxyObject target, double alphaFrom, double alphaTo) {
        this(target);
        setAlphaFrom(alphaFrom);
        setAlphaTo(alphaTo);
    }

    /**
     * Gets the alpha from.
     * 
     * @return the alpha from
     */
    public native double getAlphaFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalphaFrom();
    }-*/;

    /**
     * Sets the alpha from.
     * 
     * @param value the new alpha from
     */
    public native void setAlphaFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalphaFrom(value);
    }-*/;

    /**
     * Gets the alpha to.
     * 
     * @return the alpha to
     */
    public native double getAlphaTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalphaTo();
    }-*/;

    /**
     * Sets the alpha to.
     * 
     * @param value the new alpha to
     */
    public native void setAlphaTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalphaTo(value);
    }-*/;

}
