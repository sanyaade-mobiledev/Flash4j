/************************************************************************
  TweenLiteBridge.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.tween.client.TweenLite;
import com.emitrom.flash4j.tween.client.config.TimelineConfig;
import com.emitrom.flash4j.tween.client.config.TweenConfig;
import com.google.gwt.core.client.JavaScriptObject;

public class TweenLiteBridge extends ProxyObject {

    private static TweenLiteBridge INSTANCE = new TweenLiteBridge(
                    Bridge.createObject("com.emitrom.flash4j.bridges.tweener.TweenLiteBridge"));

    TweenLiteBridge(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static TweenLiteBridge get() {
        return INSTANCE;
    }

    public final native JavaScriptObject createTweenLite(Object target, double duration, ProxyObject config)/*-{
		var configPeer = config.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = {};
		for ( var p in configPeer) {
			if (p.indexOf('__gwt_ObjectId') < 0) {
				obj[p] = configPeer[p];
			}
		}
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTweenLite(target, duration, obj);
    }-*/;

    public final native JavaScriptObject createTweenLiteVars()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTweenLiteVars();
    }-*/;

    public final TweenLite applyTo(ProxyObject target, double duration, TweenConfig config) {
        return _applyTo(target.getJsObj(), duration, config);
    }

    public final TweenLite applyTo(As3Array targets, double duration, TweenConfig config) {
        return _applyTo(targets.getJsObj(), duration, config);
    }

    public final TweenLite applyFrom(ProxyObject target, double duration, TweenConfig config) {
        return _applyFrom(target.getJsObj(), duration, config);
    }

    public final TweenLite applyFrom(As3Array targets, double duration, TweenConfig config) {
        return _applyFrom(targets.getJsObj(), duration, config);
    }

    public final TweenLite applyFromTo(ProxyObject target, double duration, TweenConfig from, TweenConfig to) {
        return _applyFromTo(target.getJsObj(), duration, from, to);
    }

    public final TweenLite applyFromTo(As3Array targets, double duration, TweenConfig from, TweenConfig to) {
        return _applyFromTo(targets.getJsObj(), duration, from, to);
    }

    public final native JavaScriptObject createTimeline()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTimeline();
    }-*/;

    public final native JavaScriptObject createTimeline(TimelineConfig config)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createTimeline(config.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private final native TweenLite _applyTo(Object target, double duration, TweenConfig config)/*-{
		var configPeer = config.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();

		var obj = {};
		for ( var p in configPeer) {
			if (p.indexOf('__gwt_ObjectId') < 0) {
				//console.log(configPeer[p]);
				obj[p] = configPeer[p];
			}
		}

		var me = peer.applyTo(target, duration, obj);
		console.log(me);
		return @com.emitrom.flash4j.tween.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(me);
    }-*/;

    private final native TweenLite _applyFrom(Object target, double duration, TweenConfig config)/*-{
		var configPeer = config.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = {};
		for ( var p in configPeer) {
			if (p.indexOf('__gwt_ObjectId') < 0) {
				obj[p] = configPeer[p];
			}
		}
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var me = peer.applyFrom(target, duration, obj);
		return @com.emitrom.flash4j.tween.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(me);
    }-*/;

    private final native TweenLite _applyFromTo(Object target, double duration, TweenConfig from, TweenConfig to)/*-{
		var fromPeer = from.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var toPeer = to.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj1 = {};
		for ( var p in fromPeer) {
			if (p.indexOf('gwt_ObjectId') < 0) {
				obj1[p] = fromPeer[p];
			}
		}

		var obj2 = {};
		for ( var p2 in toPeer) {
			if (p2.indexOf('gwt_ObjectId') < 0) {
				obj2[2] = toPeer[p2];
			}
		}
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.applyFromTo(target, duration, fromPeer, toPeer);
		return @com.emitrom.flash4j.tween.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
