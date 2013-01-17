/************************************************************************
  AddItems.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class AddItems.
 */
public class AddItems extends OverrideBase {

    /**
     * Instantiates a new adds the items.
     */
    protected AddItems(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the adds the items
     */
    public AddItems() {
        jsObj = Bridge.createObject("mx.states.AddItems");
    }

    /**
     * Gets the creation policy.
     * 
     * @return the creation policy
     */
    public native String getCreationPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcreationPolicy();
    }-*/;

    /**
     * Sets the creation policy.
     * 
     * @param value the new creation policy
     */
    public native void setCreationPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcreationPolicy(value);
    }-*/;

    /**
     * Sets the destination.
     * 
     * @param value the new destination
     */

    public void setDestination(ProxyObject target) {
        setDestination(target.getJsObj());
    }

    public native void setDestination(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdestination(value);
    }-*/;

    /**
     * Gets the destruction policy.
     * 
     * @return the destruction policy
     */
    public native String getDestructionPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdestructionPolicy();
    }-*/;

    /**
     * Sets the destruction policy.
     * 
     * @param value the new destruction policy
     */
    public native void setDestructionPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdestructionPolicy(value);
    }-*/;

    /**
     * Checks if is array.
     * 
     * @return true, if is array
     */
    public native boolean isArray()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisArray();
    }-*/;

    /**
     * Sets the checks if is array.
     * 
     * @param value the new checks if is array
     */
    public native void setIsArray(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setisArray(value);
    }-*/;

    /**
     * Sets the items.
     * 
     * @param values the new items
     */
    public native void setItems(Object values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setitems(values);
    }-*/;

    /**
     * Gets the position.
     * 
     * @return the position
     */
    public native String getPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getposition();
    }-*/;

    /**
     * Sets the position.
     * 
     * @param value the new position
     */
    public native void setPosition(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setposition(value);
    }-*/;

    /**
     * Gets the property name.
     * 
     * @return the property name
     */
    public native String getPropertyName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpropertyName();
    }-*/;

    /**
     * Sets the property name.
     * 
     * @param value the new property name
     */
    public native void setPropertyName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpropertyName(value);
    }-*/;

    /**
     * Sets the relative to.
     * 
     * @param value the new relative to
     */

    public void setRelativeTo(ProxyObject target) {
        setRelativeTo(target.getJsObj());
    }

    public native void setRelativeTo(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrelativeTo(value);
    }-*/;

    /**
     * Creates the instance.
     */
    public native void createInstance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.createInstance();
    }-*/;

}
