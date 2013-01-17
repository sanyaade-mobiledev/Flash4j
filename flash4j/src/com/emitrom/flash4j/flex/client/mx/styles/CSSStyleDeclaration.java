/************************************************************************
  CSSStyleDeclaration.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.styles;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.factories.StyleManagerProxy;
import com.google.gwt.core.client.JavaScriptObject;

public class CSSStyleDeclaration extends EventDispatcher {

    public CSSStyleDeclaration() {
        jsObj = Bridge.createObject("mx.styles.CSSStyleDeclaration");
    }

    public CSSStyleDeclaration(String selector) {
        jsObj = StyleManagerProxy.getInstance().createCSSStyleDeclation(selector);
    }

    protected CSSStyleDeclaration(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the value for a specified style property, as determined solely by
     * this CSSStyleDeclaration.
     * 
     * @param property
     * @return
     */
    public native String getStyle(String property)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getStyle(property);
    }-*/;

    /**
     * Clears a style property on this CSSStyleDeclaration.
     * 
     * @param property
     */
    public native void clearStyle(String property)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.clearStyle(property);
    }-*/;

    /**
     * Sets a style property on this CSSStyleDeclaration.
     * 
     * @param property
     * @param value
     */
    public native void setStyle(String property, Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setStyle(property, value);
    }-*/;
}
