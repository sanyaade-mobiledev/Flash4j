/************************************************************************
  EaseBridge.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.tween.client.core;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

public class EaseBridge extends ProxyObject {

    private static EaseBridge INSTANCE = new EaseBridge(
                    Bridge.createObject("com.emitrom.flash4j.bridges.tweener.EaseBridge"));

    EaseBridge(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static EaseBridge get() {
        return INSTANCE;
    }

    public final native JavaScriptObject getBackEaseIn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getBackEaseIn();
    }-*/;

    public final native JavaScriptObject getBackEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getBackEaseOut();
    }-*/;

    public final native JavaScriptObject getBackInEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getBackEaseInOut();
    }-*/;

    public final native JavaScriptObject getBounceEaseIn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getBounceEaseIn();
    }-*/;

    public final native JavaScriptObject getBounceEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getBounceEaseOut();
    }-*/;

    public final native <T extends JavaScriptObject> T getBounceEaseInOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var p = peer.getBounceEaseInOut();
		return p;

    }-*/;

    public final native JavaScriptObject getCircEaseIn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getCircEaseIn();
    }-*/;

    public final native JavaScriptObject getCircEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getCircEaseOut();
    }-*/;

    public final native JavaScriptObject getCircInEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getCircEaseInOut();
    }-*/;

    public final native JavaScriptObject getElasticEaseIn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getElasticEaseIn();
    }-*/;

    public final native JavaScriptObject getElasticEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getElasticEaseOut();
    }-*/;

    public final native JavaScriptObject getElasticInEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getElasticEaseInOut();
    }-*/;

    public final native JavaScriptObject getExpoEaseIn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getExpoEaseIn();
    }-*/;

    public final native JavaScriptObject getExpoEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getExpoEaseOut();
    }-*/;

    public final native JavaScriptObject getExpoInEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getExpoEaseInOut();
    }-*/;

    public final native JavaScriptObject getLinearEaseIn()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getLinearEaseIn();
    }-*/;

    public final native JavaScriptObject getLinearEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getLinearEaseOut();
    }-*/;

    public final native JavaScriptObject getLinearInEaseOut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getLinearEaseInOut();
    }-*/;

    public final native JavaScriptObject getLinearInEasNone()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getLinearEaseNone();
    }-*/;
}
