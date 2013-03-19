/************************************************************************
  SkinnableComponent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.spark;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SkinnableComponent.
 */
public class SkinnableComponent extends UIComponent {

    /**
     * Instantiates a new skinnable component.
     */
    SkinnableComponent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the skinnable component
     */
    public SkinnableComponent() {
        jsObj = Bridge.createObject("spark.components.supportClasses.SkinnableComponent");
    }

    /**
     * Gets the skin.
     * 
     * @return the skin
     */
    public native UIComponent getSkin()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getskin();
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Invalidate skin state.
     */
    public native void invalidateSkinState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidateSkinState();
    }-*/;

}
