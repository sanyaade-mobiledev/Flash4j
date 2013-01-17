/************************************************************************
  Animate.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.effects.Effect;
import com.emitrom.flash4j.flex.client.spark.effects.animation.RepeatBehavior;
import com.emitrom.flash4j.flex.client.spark.effects.easing.IEaser;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Animate.
 */
public class Animate extends Effect {

    /**
     * Instantiates a new animate.
     */
    protected Animate(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the animate
     */
    public Animate() {
        jsObj = Bridge.createObject("spark.effects.Animate");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the animate
     */
    public Animate(Object target) {
        this();
        setTarget(target);
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the animate
     */
    public Animate(ProxyObject target) {
        this();
        setTarget(target.getJsObj());
    }

    /**
     * Disable layout.
     * 
     * @return true, if successful
     */
    public native boolean disableLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdisableLayout();
    }-*/;

    /**
     * Sets the disable layout.
     * 
     * @param value the new disable layout
     */
    public native void setDisableLayout(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdisableLayout(value);
    }-*/;

    /**
     * Sets the easer.
     * 
     * @param value the new easer
     */
    public native void setEaser(IEaser value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.seteaser(value.@com.emitrom.flash4j.flex.client.spark.effects.easing.IEaser::asIEaser()());
    }-*/;

    /**
     * Gets the repeat behavior.
     * 
     * @return the repeat behavior
     */
    public RepeatBehavior getRepeatBehavior() {
        return RepeatBehavior.fromValue(_getRepeatBehavior());
    }

    /**
     * _get repeat behavior.
     * 
     * @return the string
     */
    private native String _getRepeatBehavior()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrepeatBehavior();
    }-*/;

    /**
     * Sets the repeat behavior.
     * 
     * @param behavior the new repeat behavior
     */
    public void setRepeatBehavior(RepeatBehavior behavior) {
        _setRepeatBehavior(behavior.value);
    }

    /**
     * _set repeat behavior.
     * 
     * @param value the value
     */
    private native void _setRepeatBehavior(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrepeatBehavior(value);
    }-*/;

}
