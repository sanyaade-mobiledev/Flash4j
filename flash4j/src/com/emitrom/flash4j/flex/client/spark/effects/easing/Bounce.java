/************************************************************************
  Bounce.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.effects.easing;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Bounce.
 */
public class Bounce extends ProxyObject implements IEaser {

    /**
     * Instantiates a new bounce.
     */
    protected Bounce(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the bounce
     */
    public Bounce() {
        jsObj = Bridge.createObject("spark.effects.easing.Bounce");
    }

    public Bounce(EasingFraction fraction) {
        this();
        ease(fraction);
    }

    /**
     * Ease.
     * 
     * @param fraction the fraction
     * @return the double
     */
    public final double ease(EasingFraction fraction) {
        return this.ease(fraction.value);
    }

    /**
     * Ease.
     * 
     * @param fraction the fraction
     * @return the double
     */
    public final native double ease(double fraction)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.ease(fraction);
    }-*/;

    @Override
    public JavaScriptObject asIEaser() {
        return this.jsObj.cast();
    }

}
