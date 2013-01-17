/************************************************************************
  Glow.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class Glow.
 */
public class Glow extends TweenEffect {

    /**
     * Instantiates a new glow.
     */
    protected Glow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the glow
     */
    public Glow() {
        jsObj = Bridge.createObject("mx.effects.Glow");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the glow
     */
    public Glow(ProxyObject target) {
        this();
        setTarget(target);
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

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public native int getColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    /**
     * Sets the color.
     * 
     * @param value the new color
     */
    public native void setColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolor(value);
    }-*/;

    /**
     * Checks if is inner.
     * 
     * @return true, if is inner
     */
    public native boolean isInner()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinner();
    }-*/;

    /**
     * Sets the inner.
     * 
     * @param value the new inner
     */
    public native void setInner(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinner(value);
    }-*/;

    /**
     * Checks for knockout.
     * 
     * @return true, if successful
     */
    public native boolean hasKnockout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getknockout();
    }-*/;

    /**
     * Sets the knockout.
     * 
     * @param value the new knockout
     */
    public native void setKnockout(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setknockout(value);
    }-*/;

    /**
     * Gets the strength.
     * 
     * @return the strength
     */
    public native double getStrength()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstrength();
    }-*/;

    /**
     * Sets the strength.
     * 
     * @param value the new strength
     */
    public native void setStrength(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstrength(value);
    }-*/;

}
