/************************************************************************
  SoundMixer.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public final class SoundMixer extends ProxyObject {

    public static SoundMixer get() {
        return INSTANCE;
    }

    private static final SoundMixer INSTANCE = new SoundMixer(_get());

    private static native JavaScriptObject _get() /*-{
		return $wnd.runtime.flash.media.SoundMixer;
    }-*/;

    protected SoundMixer(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getBufferTime() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bufferTime;
    }-*/;

    public native void setBufferTime(int bufferTime) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bufferTime = bufferTime;
    }-*/;

    public native SoundTransform getSoundTransform() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.soundTransform;
		return @com.emitrom.air4j.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setSoundTransform(SoundTransform soundTransform) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.soundTransform = soundTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean areSoundsInaccessible() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.areSoundsInaccessible();
    }-*/;

    public native void computeSpectrum(ByteArray outputArray) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.computeSpectrum(outputArray.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void computeSpectrum(ByteArray outputArray, boolean FFTMode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.computeSpectrum(
						outputArray.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						FFTMode);
    }-*/;

    public native void computeSpectrum(ByteArray outputArray, boolean FFTMode, int stretchFactor) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.computeSpectrum(
						outputArray.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						FFTMode, stretchFactor);
    }-*/;

    public native void stopAll() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stopAll();
    }-*/;
}
