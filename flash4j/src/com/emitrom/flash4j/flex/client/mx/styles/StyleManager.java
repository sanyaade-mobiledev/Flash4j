/************************************************************************
  StyleManager.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.flex.client.core.factories.StyleManagerProxy;
import com.google.gwt.core.client.JavaScriptObject;

public class StyleManager extends EventDispatcher {

    private static final StyleManager INSTANCE = new StyleManager();

    public static StyleManager get() {
        return INSTANCE;
    }

    private StyleManager() {
        jsObj = StyleManagerProxy.getInstance().getStyleManager();
    }

    private StyleManager(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void clearStyleDeclaration(String selector, boolean update)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.clearStyleDeclaration(selector, update);
    }-*/;

    public native int getColorName(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getColorName(name);
    }-*/;

    public native CSSStyleDeclaration getStyleDeclaration(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getStyleDeclaration(name);
		return @com.emitrom.flash4j.flex.client.mx.styles.CSSStyleDeclaration::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setStyleDeclaration(String selector, CSSStyleDeclaration style, boolean update)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setStyleDeclaration(
						selector,
						style.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						update);
    }-*/;

    public native As3Array getSelectors()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectors();
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native CSSStyleDeclaration getMergedStyleDeclaration(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getMergedStyleDeclaration(name);
		return @com.emitrom.flash4j.flex.client.mx.styles.CSSStyleDeclaration::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public CSSStyleDeclaration getGlobalStyleDeclaration() {
        return get().getStyleDeclaration("global");
    }

}
