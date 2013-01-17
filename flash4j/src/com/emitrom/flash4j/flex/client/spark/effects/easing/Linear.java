/************************************************************************
  Linear.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class Linear.
 */
public class Linear extends ProxyObject implements IEaser {

    /**
     * Instantiates a new linear.
     */
    protected Linear(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the linear
     */
    public Linear() {
        jsObj = Bridge.createObject("spark.effects.easing.Linear");
    }

    /**
     * New instance.
     * 
     * @param easeInFraction the ease in fraction
     * @return the linear
     */
    public Linear(double easeInFraction) {
        this();
        setEaseInFraction(easeInFraction);
    }

    /**
     * New instance.
     * 
     * @param easeInFraction the ease in fraction
     * @param easeOutFraction the ease out fraction
     * @return the linear
     */
    public Linear(double easeInFraction, double easeOutFraction) {
        this(easeInFraction);
        setEaseOutFraction(easeOutFraction);
    }

    /**
     * Gets the ease in fraction.
     * 
     * @return the ease in fraction
     */
    public final EasingFraction getEaseInFraction() {
        return EasingFraction.fromValue(_getEaseInFraction());
    }

    /**
     * _get ease in fraction.
     * 
     * @return the double
     */
    private final native double _getEaseInFraction()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteaseInFraction();
    }-*/;

    /**
     * Sets the ease in fraction.
     * 
     * @param fraction the new ease in fraction
     */
    public final void setEaseInFraction(EasingFraction fraction) {
        this.setEaseInFraction(fraction.value);
    }

    /**
     * Sets the ease in fraction.
     * 
     * @param value the new ease in fraction
     */
    private final native void setEaseInFraction(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteaseInFraction(value);
    }-*/;

    /**
     * Gets the ease out fraction.
     * 
     * @return the ease out fraction
     */
    public final EasingFraction getEaseOutFraction() {
        return EasingFraction.fromValue(_getEaseInFraction());
    }

    /**
     * _get ease out fraction.
     * 
     * @return the double
     */
    private final native double _getEaseOutFraction()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteaseOutFraction();
    }-*/;

    /**
     * Sets the ease out fraction.
     * 
     * @param fraction the new ease out fraction
     */
    public final void setEaseOutFraction(EasingFraction fraction) {
        this.setEaseOutFraction(fraction.value);
    }

    /**
     * Sets the ease out fraction.
     * 
     * @param value the new ease out fraction
     */
    private final native void setEaseOutFraction(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteaseOutFraction(value);
    }-*/;

    /**
     * Ease.
     * 
     * @param fraction the fraction
     */
    public final native void ease(double fraction)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.ease(fraction);
    }-*/;

    public JavaScriptObject asIEaser() {
        return this.jsObj.cast();
    }
}
