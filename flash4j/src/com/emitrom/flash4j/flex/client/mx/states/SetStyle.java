/************************************************************************
  SetStyle.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SetStyle.
 */
public class SetStyle extends OverrideBase {

    /**
     * Instantiates a new sets the style.
     */
    protected SetStyle(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the sets the style
     */
    public SetStyle() {
        jsObj = Bridge.createObject("mx.states.SetStyle");
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public native String getName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getname();
    }-*/;

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public native void setName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setname(value);
    }-*/;

    /**
     * Sets the target.
     * 
     * @param value the new target
     */

    public void setTarget(ProxyObject target) {
        setTarget(target.getJsObj());
    }

    /**
     * Sets the target.
     * 
     * @param value the new target
     */
    public native void setTarget(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settarget(value);
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
     * @param v the new value
     */
    public native void setValue(Object v)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalue(v);
    }-*/;
}
