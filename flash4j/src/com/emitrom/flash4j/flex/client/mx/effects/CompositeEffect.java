/************************************************************************
  CompositeEffect.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CompositeEffect.
 */
public class CompositeEffect extends Effect {

    /**
     * Instantiates a new composite effect.
     */
    protected CompositeEffect(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the composite effect
     */
    public CompositeEffect() {
        jsObj = Bridge.createObject("mx.effects.CompositeEffect");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the composite effect
     */
    public CompositeEffect(ProxyObject target) {
        this();
        setTarget(target);
    }

    /**
     * Sets the children.
     * 
     * @param effects the new children
     */
    private final void setChildren(List<Effect> effects) {
        ArrayCollection collection = new ArrayCollection();
        for (int i = 0; i < effects.size(); i++) {
            collection.addItem(effects.get(i).asIEffect());
        }
        this.setChildren(collection);
    }

    /**
     * Sets the children.
     * 
     * @param collection the new children
     */
    private final void setChildren(ArrayCollection collection) {
        this.setChildren(collection.toArray().getJsObj());
    }

    /**
     * Sets the children.
     * 
     * @param value the new children
     */
    private final native void setChildren(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setchildren(value);
    }-*/;

    /**
     * Gets the composite duration.
     * 
     * @return the composite duration
     */
    public final native double getCompositeDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcompositeDuration();
    }-*/;

    /**
     * Adds the child.
     * 
     * @param child the child
     */
    public final void addChild(Effect child) {
        this.addChild(child.asIEffect());
    }

    /**
     * Adds the child.
     * 
     * @param child the child
     */
    private final native void addChild(JavaScriptObject child)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addChild(child);
    }-*/;

}
