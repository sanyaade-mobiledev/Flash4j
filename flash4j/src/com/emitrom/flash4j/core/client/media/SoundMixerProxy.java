/************************************************************************
  SoundMixerProxy.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.media;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

class SoundMixerProxy extends ProxyObject {
    public static final SoundMixerProxy INSTANCE = new SoundMixerProxy();

    private SoundMixerProxy() {
        jsObj = createNativePeer();
    }

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.emitrom.flash4j.proxies.media.SoundMixerProxy");
    }

    native int getBufferTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getBufferTime();
    }-*/;

    native void setBufferTime(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setBufferTime(value);
    }-*/;

    native SoundTransform getSoundTransform()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getSoundTransform();
		return @com.emitrom.flash4j.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    native void setSoundTransform(SoundTransform value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setSoundTransform(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    native boolean isAreaSoundsInaccessible()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isAreaSoundsInaccessible();
    }-*/;

    native boolean stopAll()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.stopAll();
    }-*/;

    native void computeSpectrum(ByteArray output)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.computeSpectrum(output);
    }-*/;

    native void computeSpectrum(ByteArray output, boolean FFTMode)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.computeSpectrum(output, FFTMode);
    }-*/;

    native void computeSpectrum(ByteArray output, boolean FFTMode, int strechFactor)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.computeSpectrum(
						output.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						FFTMode, strechFactor);
    }-*/;

}
