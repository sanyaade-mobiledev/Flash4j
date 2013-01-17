/************************************************************************
  State.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class State.
 */
public class State extends EventDispatcher {

    /**
     * Instantiates a new state.
     */
    protected State(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the state
     */
    public State() {
        jsObj = Bridge.createObject("mx.states.State");
    }

    /**
     * Gets the based on.
     * 
     * @return the based on
     */
    public native String getBasedOn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbasedOn();
    }-*/;

    /**
     * Sets the based on.
     * 
     * @param value the new based on
     */
    public native void setBasedOn(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbasedOn(value);
    }-*/;

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
     * Gets the state groups.
     * 
     * @return the state groups
     */
    public native JsArrayString getStateGroups()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstateGroups();
    }-*/;

    /**
     * Sets the states groups.
     * 
     * @param values the new states groups
     */
    public void setStatesGroups(JsArrayString values) {
        ArrayCollection c = new ArrayCollection();
        for (int i = 0; i < values.length(); i++) {
            c.addItem(values.get(i));
        }
        setStateGroups(c);
    }

    /**
     * Sets the state groups.
     * 
     * @param collection the new state groups
     */
    private void setStateGroups(ArrayCollection collection) {
        _setStateGroups(collection.toArray().getJsObj());
    }

    /**
     * Sets the state groups.
     * 
     * @param value the new state groups
     */
    private native void _setStateGroups(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstateGroups(value);
    }-*/;

    /**
     * Sets the overrides.
     * 
     * @param value the new overrides
     */
    public void setOverrides(List<? extends ProxyObject> values) {
        setOverrides(DataConverter.fromList(values));
    }

    /**
     * Sets the overrides.
     * 
     * @param col the new overrides
     */
    private void setOverrides(ArrayCollection col) {
        _setOverrides(col.toArray().getJsObj());
    }

    /**
     * Sets the overrides.
     * 
     * @param value the new overrides
     */
    private native void _setOverrides(JavaScriptObject value)/*-{
		peer.setoverrides(value);
    }-*/;

}
