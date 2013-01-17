/************************************************************************
  Sound.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.media;

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.net.URLRequest;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class Sound extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.media.Sound;
    }-*/;

    protected Sound(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Sound() {
        jsObj = newInstance();
    }

    public Sound(URLRequest urlRequest) {
        jsObj = newInstance(urlRequest);
    }

    public Sound(URLRequest urlRequest, SoundLoaderContext context) {
        jsObj = newInstance(urlRequest, context);
    }

    public native double getBytesLoaded() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesLoaded;
    }-*/;

    public native double getBytesTotal() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesTotal;
    }-*/;

    public native ID3Info getID3() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.id3;
		return @com.emitrom.air4j.core.client.media.ID3Info::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean isBuffering() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isBuffering;
    }-*/;

    public native double getLength() /*-{
		return peer.length;
    }-*/;

    public native String getURL() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.url;
    }-*/;

    public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
    }-*/;

    public native int extract(ByteArray target, int length) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.extract(
						target.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						length);
    }-*/;

    public native int extract(ByteArray target, int length, int startPosition) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.extract(
						target.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						length, startPosition);
    }-*/;

    public native void load(URLRequest stream) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.load(stream.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void load(URLRequest stream, SoundLoaderContext context) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.load(
						stream.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						context.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native SoundChannel play() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.play();
		return @com.emitrom.air4j.core.client.media.SoundChannel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native SoundChannel play(double startTime) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.play(startTime);
    }-*/;

    public native SoundChannel play(double startTime, int loops) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.play(startTime, loops);
    }-*/;

    public native SoundChannel play(double startTime, int loops, SoundTransform sndTransform) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.play(
						startTime,
						loops,
						sndTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.media.Sound();
    }-*/;

    private static native JavaScriptObject newInstance(URLRequest stream) /*-{
		return new $wnd.runtime.flash.media.Sound(stream);
    }-*/;

    private static native JavaScriptObject newInstance(URLRequest stream, SoundLoaderContext context) /*-{
		return new $wnd.runtime.flash.media.Sound(stream, context);
    }-*/;

}
