/************************************************************************
  OverrideBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class OverrideBase.
 */
public class OverrideBase extends EventDispatcher {

    /**
     * Instantiates a new override base.
     */
    protected OverrideBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instace.
     * 
     * @return the override base
     */
    public OverrideBase() {
        jsObj = Bridge.createObject("mx.states.OverrideBase");
    }

    /**
     * Apply.
     * 
     * @param parent the parent
     */
    public final native void apply(UIComponent parent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.apply(parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Initialize.
     */
    public final native void initialize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.initialize();
    }-*/;

    /**
     * Removes the.
     * 
     * @param parent the parent
     */
    public final native void remove(UIComponent parent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.remove(parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
