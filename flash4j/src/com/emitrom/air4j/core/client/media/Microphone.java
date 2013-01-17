/************************************************************************
  Microphone.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public final class Microphone extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.media.Microphone;
    }-*/;

    Microphone(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static Microphone getDefault() {
        return new Microphone(_get(-1));
    }

    public static Microphone get() {
        return new Microphone(_get());
    }

    public static Microphone get(int index) {
        return new Microphone(_get(index));
    }

    public static native JsArrayString getNames() /*-{
		return $wnd.runtime.flash.media.Microphone.names;
    }-*/;

    public native double getActivityLevel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.activityLevel;
    }-*/;

    public SoundCodec getCodec() {
        return SoundCodec.fromValue(_getCodec());
    }

    private native String _getCodec() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.codec;
    }-*/;

    public void setCodec(SoundCodec codec) {
        _setCodec(codec.value);
    }

    private native void _setCodec(String codec) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.codec = codec;
    }-*/;

    public native byte getEncodeQuality() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.encodeQuality;
    }-*/;

    public native void setEncodeQuality(byte encodeQuality) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.encodeQuality = encodeQuality;
    }-*/;

    public native int getFramesPerPacket() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.framesPerPacket;
    }-*/;

    public native void setFramesPerPacket(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.framesPerPacket = value;
    }-*/;

    public native double getGain() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.gain;
    }-*/;

    public native void setGain(double gain) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.gain = gain;
    }-*/;

    public native int getIndex() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.index;
    }-*/;

    public native boolean isMuted() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.muted;
    }-*/;

    public native String getName() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.name;
    }-*/;

    public native int getRate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rate;
    }-*/;

    public native void setRate(int rate) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.rate = rate;
    }-*/;

    public native double getSilenceLevel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.silenceLevel;
    }-*/;

    public native int getSilenceTimeout() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.silenceTimeout;
    }-*/;

    public native SoundTransform getSoundTransform() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.soundTransform;
		return @com.emitrom.air4j.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setSoundtransform(SoundTransform soundTransform) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.soundTransform = soundTransform.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean getUseEchoSuppression() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.useEchoSuppression;
    }-*/;

    public native void setLoopBack() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setLoopBack();
    }-*/;

    public native void setLoopBack(boolean state) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setLoopBack(state);
    }-*/;

    public native void setSilenceLevel(double silenceLevel) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setSilenceLevel(silenceLevel);
    }-*/;

    public native void setSilenceLevel(double silenceLevel, int timeout) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setSilenceLevel(silenceLevel, timeout);
    }-*/;

    public native void setUseEchoSuppression(boolean useEchoSuppression) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setUseEchoSuppression(useEchoSuppression);
    }-*/;

    private static native JavaScriptObject _get() /*-{
		return $wnd.runtime.flash.media.Microphone.getMicrophone();
    }-*/;

    private static native JavaScriptObject _get(int index) /*-{
		return $wnd.runtime.flash.media.Microphone.getMicrophone(index);
    }-*/;

}
