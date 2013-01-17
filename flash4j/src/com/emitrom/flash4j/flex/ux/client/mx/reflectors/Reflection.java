/************************************************************************
  Reflection.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.reflectors;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Reflection.
 */
public class Reflection extends UIComponent {

    /**
     * Instantiates a new reflection.
     */
    protected Reflection(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the reflection
     */
    public Reflection() {
        jsObj = Bridge.createObject("com.fusionx.ui.Reflection");
    }

    /**
     * New instance.
     * 
     * @param target
     *            the target
     * @return the reflection
     */
    public Reflection(UIComponent target) {
        this();
        setTarget(target);
    }

    /**
     * Sets the target.
     * 
     * @param target
     *            the new target
     */
    public native void setTarget(UIComponent target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settarget(target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the fade from.
     * 
     * @return the fade from
     */
    public final native double getFadeFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfadeFrom();
    }-*/;

    /**
     * Sets the fade from.
     * 
     * @param value
     *            the new fade from
     */
    public final native void setFadeFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfadeFrom(value);
    }-*/;

    /**
     * Gets the fade to.
     * 
     * @return the fade to
     */
    public final native double getFadeTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfadeTo();
    }-*/;

    /**
     * Sets the fade to.
     * 
     * @param value
     *            the new fade to
     */
    public final native void setFadeTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfadeTo(value);
    }-*/;

    /**
     * Gets the fade center.
     * 
     * @return the fade center
     */
    public final native double getFadeCenter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfadeCenter();
    }-*/;

    /**
     * Sets the fade center.
     * 
     * @param value
     *            the new fade center
     */
    public final native void setFadeCenter(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfadeCenter(value);
    }-*/;

    /**
     * Gets the skew x.
     * 
     * @return the skew x
     */
    public final native double getSkewX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getskewX();
    }-*/;

    /**
     * Sets the skew x.
     * 
     * @param value
     *            the new skew x
     */
    public final native void setSkewX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setskewX(value);
    }-*/;

    /**
     * Gets the scale.
     * 
     * @return the scale
     */
    public final native double getScale()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscale();
    }-*/;

    /**
     * Sets the scale.
     * 
     * @param value
     *            the new scale
     */
    public final native void setScale(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscale(value);
    }-*/;

    /**
     * Draw reflection.
     */
    public final native void drawReflection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		if (peer != null) {
			peer.drawReflection();
		}
    }-*/;

}
