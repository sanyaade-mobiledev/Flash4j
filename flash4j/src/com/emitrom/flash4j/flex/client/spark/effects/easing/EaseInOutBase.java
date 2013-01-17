/************************************************************************
  EaseInOutBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class EaseInOutBase.
 */
public class EaseInOutBase extends ProxyObject implements IEaser {

    /**
     * Instantiates a new ease in out base.
     */
    protected EaseInOutBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the ease in out base
     */
    public EaseInOutBase() {
        jsObj = Bridge.createObject("spark.effects.easing.EaseInOutBase");
    }

    /**
     * New instance.
     * 
     * @param easeInFraction the ease in fraction
     * @return the ease in out base
     */
    public EaseInOutBase(double easeInFraction) {
        this();
        setEaseInFraction(easeInFraction);

    }

    /**
     * Gets the ease fraction.
     * 
     * @return the ease fraction
     */
    public final EasingFraction getEaseFraction() {
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
     * Ease.
     * 
     * @param fraction the fraction
     */
    public final native void ease(double fraction)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.ease(fraction);
    }-*/;

    @Override
    public JavaScriptObject asIEaser() {
        return this.jsObj.cast();
    }

}
