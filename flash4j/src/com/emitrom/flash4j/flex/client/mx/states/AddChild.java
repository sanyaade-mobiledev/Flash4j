/************************************************************************
  AddChild.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AddChild.
 */
public class AddChild extends OverrideBase {

    /**
     * Instantiates a new adds the child.
     */
    protected AddChild(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the adds the child
     */
    public AddChild() {
        jsObj = Bridge.createObject("mx.states.AddChild");
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
		peer.setposition(value);
    }-*/;

    /**
     * Sets the relative to.
     * 
     * @param value the new relative to
     */
    public native void setRelativeTo(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrelativeTo(value);
    }-*/;

    /**
     * Gets the target.
     * 
     * @return the target
     */
    public native DisplayObject getTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettarget();
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the target.
     * 
     * @param target the new target
     */
    public native void setTarget(DisplayObject target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settarget(target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Creates the instance.
     */
    public native void createInstance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.createInstance();
    }-*/;

}
