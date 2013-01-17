/************************************************************************
  DefaultListEffect.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class DefaultListEffect.
 */
public class DefaultListEffect extends Parallel {

    /**
     * Instantiates a new default list effect.
     */
    protected DefaultListEffect(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the default list effect
     */
    public DefaultListEffect() {
        jsObj = Bridge.createObject("mx.effects.DefaultListEffect");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the default list effect
     */
    public DefaultListEffect(ProxyObject target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public native double getColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    /**
     * Sets the color.
     * 
     * @param value the new color
     */
    public native void setColor(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolor(value);
    }-*/;

    /**
     * Gets the fade duration.
     * 
     * @return the fade duration
     */
    public native double getFadeDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfadeDuration();
    }-*/;

    /**
     * Sets the fade duration.
     * 
     * @param value the new fade duration
     */
    public native void setFadeDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfadeDuration(value);
    }-*/;

    /**
     * Gets the fade out duration.
     * 
     * @return the fade out duration
     */
    public native double getFadeOutDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfadeOutDuration();
    }-*/;

    /**
     * Sets the fade out duration.
     * 
     * @param value the new fade out duration
     */
    public native void setFadeOutDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfadeOutDuration(value);
    }-*/;

    /**
     * Gets the grow duration.
     * 
     * @return the grow duration
     */
    public native double getGrowDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getgrowDuration();
    }-*/;

    /**
     * Sets the grow duration.
     * 
     * @param value the new grow duration
     */
    public native void setGrowDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setgrowDuration(value);
    }-*/;

    /**
     * Gets the removed element offset.
     * 
     * @return the removed element offset
     */
    public native double getRemovedElementOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getremovedElementOffset();
    }-*/;

    /**
     * Sets the removed element offset.
     * 
     * @param value the new removed element offset
     */
    public native void setRemovedElementOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setremovedElementOffset(value);
    }-*/;

    /**
     * Gets the shrink duration.
     * 
     * @return the shrink duration
     */
    public native double getShrinkDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshrinkDuration();
    }-*/;

    /**
     * Sets the shrink duration.
     * 
     * @param value the new shrink duration
     */
    public native void setShrinkDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshrinkDuration(value);
    }-*/;

}
