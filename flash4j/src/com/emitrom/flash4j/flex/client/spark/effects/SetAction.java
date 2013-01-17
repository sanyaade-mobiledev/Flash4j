/************************************************************************
  SetAction.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SetAction.
 */
public class SetAction extends Effect {

    /**
     * Instantiates a new sets the action.
     */
    protected SetAction(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the sets the action
     */
    public SetAction() {
        jsObj = Bridge.createObject("spark.effects.SetAction");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the sets the action
     */
    public SetAction(ProxyObject target) {
        this();
        setTarget(target);
    }

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
     * Gets the value.
     * 
     * @param <T> the generic type
     * @return the value
     */
    public native <T> T getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public native void setValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalue(value);
    }-*/;

}
