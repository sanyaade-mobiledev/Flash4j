/************************************************************************
  AnimateProperty.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AnimateProperty.
 */
public class AnimateProperty extends TweenEffect {

    /**
     * Instantiates a new animate property.
     */
    protected AnimateProperty(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the animate property
     */
    public AnimateProperty() {
        jsObj = Bridge.createObject("mx.effects.AnimateProperty");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the animate property
     */
    public AnimateProperty(ProxyObject target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the from value.
     * 
     * @return the from value
     */
    public native double getFromValue()/*-{
		var peer = peer.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfromValue();
    }-*/;

    /**
     * Sets the from value.
     * 
     * @param value the new from value
     */
    public native void setFromValue(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfromValue(value);
    }-*/;

    /**
     * Checks if is style.
     * 
     * @return true, if is style
     */
    public native boolean isStyle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisStyle();
    }-*/;

    /**
     * Sets the checks if is style.
     * 
     * @param value the new checks if is style
     */
    public native void setIsStyle(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setisStyle(value);
    }-*/;

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

    /**
     * Round value.
     * 
     * @return true, if successful
     */
    public native boolean roundValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getroundValue();
    }-*/;

    /**
     * Sets the round value.
     * 
     * @param value the new round value
     */
    public native void setRoundValue(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setroundValue(value);
    }-*/;

    /**
     * Gets the to value.
     * 
     * @return the to value
     */
    public native double getToValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettoValue();
    }-*/;

    /**
     * Sets the to value.
     * 
     * @param value the new to value
     */
    public native void setToValue(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settoValue(value);
    }-*/;

}
