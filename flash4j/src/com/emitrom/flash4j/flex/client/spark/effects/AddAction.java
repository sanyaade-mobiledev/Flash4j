/************************************************************************
  AddAction.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.display.DisplayObjectContainer;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.effects.Effect;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AddAction.
 */
public class AddAction extends Effect {

    /** The Constant AFTER. */
    public static final String AFTER = "after";

    /** The Constant BEFORE. */
    public static final String BEFORE = "before";

    /** The Constant FIST_CHILD. */
    public static final String FIST_CHILD = "firstChild";

    /** The Constant INDEX. */
    public static final String INDEX = "index";

    /** The Constant LAST_CHILD. */
    public static final String LAST_CHILD = "lastChild";

    /**
     * Instantiates a new adds the action.
     */
    protected AddAction(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the adds the action
     */
    public AddAction() {
        jsObj = Bridge.createObject("spark.effects.AddAction");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the adds the action
     */
    public AddAction(Object target) {
        this();
        setTarget(target);
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the adds the action
     */
    public AddAction(ProxyObject target) {
        this();
        setTarget(target.getJsObj());
    }

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public final native int getIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getindex();
    }-*/;

    /**
     * Sets the index.
     * 
     * @param value the new index
     */
    public final native void setIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setindex(value);
    }-*/;

    /**
     * Gets the position.
     * 
     * @return the position
     */
    public final native String getPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getposition();
    }-*/;

    /**
     * Sets the position.
     * 
     * @param value the new position
     */
    public final native void setPosition(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setposition(value);
    }-*/;

    /**
     * Sets the relative to.
     * 
     * @param value the new relative to
     */
    public final native void setRelativeTo(DisplayObjectContainer value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setrelativeTo(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
