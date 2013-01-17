/************************************************************************
  Blur.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class Blur.
 */
public class Blur extends TweenEffect {

    /**
     * Instantiates a new blur.
     */
    protected Blur(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the blur
     */
    public Blur() {
        jsObj = Bridge.createObject("mx.effects.Blur");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the blur
     */
    public Blur(ProxyObject target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the blur x from.
     * 
     * @return the blur x from
     */
    public native double getBlurXFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getblurXFrom();
    }-*/;

    /**
     * Sets the blur x from.
     * 
     * @param value the new blur x from
     */
    public native void setBlurXFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setblurXFrom(value);
    }-*/;

    /**
     * Gets the blur x to.
     * 
     * @return the blur x to
     */
    public native double getBlurXTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getblurXTo();
    }-*/;

    /**
     * Sets the blur x to.
     * 
     * @param value the new blur x to
     */
    public native void setBlurXTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setblurXTo(value);
    }-*/;

    /**
     * Gets the blur y from.
     * 
     * @return the blur y from
     */
    public native double getBlurYFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getblurYFrom();
    }-*/;

    /**
     * Sets the blur y from.
     * 
     * @param value the new blur y from
     */
    public native void setBlurYFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setblurYFrom(value);
    }-*/;

    /**
     * Gets the blur y to.
     * 
     * @return the blur y to
     */
    public native double getBlurYTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getblurYTo();
    }-*/;

    /**
     * Sets the blur y to.
     * 
     * @param value the new blur y to
     */
    public native void setBlurYTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setblurYTo(value);
    }-*/;

}
