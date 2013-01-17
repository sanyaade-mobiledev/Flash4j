/************************************************************************
  Transition.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.states;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.effects.IEffect;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Transition.
 */
public class Transition extends ProxyObject {

    /**
     * Instantiates a new transition.
     */
    protected Transition(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the transition
     */
    public Transition() {
        jsObj = Bridge.createObject("mx.states.Transition");
    }

    /**
     * Auto reverse.
     * 
     * @return true, if successful
     */
    public native boolean autoReverse()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoReverse();
    }-*/;

    /**
     * Sets the auto reverse.
     * 
     * @param value the new auto reverse
     */
    public native void setAutoReverse(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoReverse(value);
    }-*/;

    /**
     * Sets the effect.
     * 
     * @param value the new effect
     */
    public void setEffect(IEffect value) {
        _setEffect(value.asIEffect());
    }

    /**
     * Sets the effect.
     * 
     * @param value the new effect
     */
    private native void _setEffect(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteffect(value);
    }-*/;

    /**
     * Gets the from state.
     * 
     * @return the from state
     */
    public native String getFromState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfromState();
    }-*/;

    /**
     * Sets the from state.
     * 
     * @param value the new from state
     */
    public native void setFromState(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfromState(value);
    }-*/;

    /**
     * Gets the to state.
     * 
     * @return the to state
     */
    public native String getToState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettoState();
    }-*/;

    /**
     * Sets the to state.
     * 
     * @param value the new to state
     */
    public native void setToState(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settoState(value);
    }-*/;

}
