/************************************************************************
  AddChildAction.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.display.DisplayObjectContainer;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AddChildAction.
 */
public class AddChildAction extends Effect {

    /**
     * Instantiates a new adds the child action.
     */
    protected AddChildAction(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the adds the child action
     */
    public AddChildAction() {
        jsObj = Bridge.createObject("mx.effects.AddChildAction");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the adds the child action
     */
    public AddChildAction(ProxyObject target) {
        this();
        setTarget(target);
    }

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public native int getIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getindex();
    }-*/;

    /**
     * Sets the index.
     * 
     * @param value the new index
     */
    public native void setIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setindex(value);
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
     * Relative to.
     * 
     * @return the display object container
     */
    public native DisplayObjectContainer relativeTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getrelativeTo();
		return @com.emitrom.flash4j.core.client.display.DisplayObjectContainer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the relative to.
     * 
     * @param value the new relative to
     */
    public native void setRelativeTo(DisplayObjectContainer value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrelativeTo(value);
    }-*/;

}
