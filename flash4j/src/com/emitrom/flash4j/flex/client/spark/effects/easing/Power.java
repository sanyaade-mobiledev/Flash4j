/************************************************************************
  Power.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Power.
 */
public class Power extends EaseInOutBase {

    /**
     * Instantiates a new power.
     */
    protected Power(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the power
     */
    public Power() {
        jsObj = Bridge.createObject("spark.effects.easing.Power");
    }

    /**
     * New instance.
     * 
     * @param easeInFraction the ease in fraction
     * @return the power
     */
    public Power(EasingFraction easeInFraction) {
        this();
        setEaseInFraction(easeInFraction);
    }

    /**
     * New instance.
     * 
     * @param easeInFraction the ease in fraction
     * @param exponent the exponent
     * @return the power
     */
    public Power(EasingFraction easeInFraction, double exponent) {
        this(easeInFraction);
        setExponent(exponent);
    }

    /**
     * Gets the exponent.
     * 
     * @return the exponent
     */
    public final native double getExponent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getExponent();
    }-*/;

    /**
     * Sets the exponent.
     * 
     * @param exponent the new exponent
     */
    public final void setExponent(EasingFraction exponent) {
        this.setExponent(exponent.value);
    }

    /**
     * Sets the exponent.
     * 
     * @param value the new exponent
     */
    public final native void setExponent(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setExponent(value);
    }-*/;

}
