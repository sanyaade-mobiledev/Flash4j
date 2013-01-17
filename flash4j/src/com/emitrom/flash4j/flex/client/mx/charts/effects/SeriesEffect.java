/************************************************************************
  SeriesEffect.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.effects.TweenEffect;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SeriesEffect.
 */
public class SeriesEffect extends TweenEffect {

    /**
     * Instantiates a new series effect.
     */
    protected SeriesEffect(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the series effect
     */
    public SeriesEffect() {
        jsObj = Bridge.createObject("mx.charts.effects.SeriesEffect");
        setTarget(null);
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the series effect
     */
    public SeriesEffect(ProxyObject target) {
        this();
        setTarget(target.getJsObj());
    }

    /**
     * Gets the element offset.
     * 
     * @return the element offset
     */
    public native double getElementOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getelementOffset();
    }-*/;

    /**
     * Sets the element offset.
     * 
     * @param value the new element offset
     */
    public native void setElementOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setelementOffset(value);
    }-*/;

    /**
     * Gets the minimum element duration.
     * 
     * @return the minimum element duration
     */
    public native double getMinimumElementDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminimumElementDuration();
    }-*/;

    /**
     * Sets the minimal element duration.
     * 
     * @param value the new minimal element duration
     */
    public native void setMinimalElementDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminimalElementDuration(value);
    }-*/;

    /**
     * Gets the offset.
     * 
     * @return the offset
     */
    public native double getOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoffset();
    }-*/;

    /**
     * Sets the offset.
     * 
     * @param value the new offset
     */
    public native void setOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setoffset(value);
    }-*/;

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public native String getType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettype();
    }-*/;

    /**
     * Sets the type.
     * 
     * @param value the new type
     */
    public native void setType(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settype(value);
    }-*/;

}
