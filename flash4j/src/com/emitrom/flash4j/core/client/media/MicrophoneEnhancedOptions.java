/************************************************************************
  MicrophoneEnhancedOptions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

class MicrophoneEnhancedOptions extends ProxyObject {
    public static final MicrophoneEnhancedOptions INSTANCE = new MicrophoneEnhancedOptions();

    private MicrophoneEnhancedOptions() {
        jsObj = createNativePeer();
    }

    MicrophoneEnhancedOptions(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Specifies the echo path (in milliseconds) used for acoustic echo
     * cancellation.
     * 
     * @return
     */
    public native int getEchoPath()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getecoPath();
    }-*/;

    /**
     * Specifies the echo path (in milliseconds) used for acoustic echo
     * cancellation.
     * 
     * @return
     */
    public native void setEchoPath(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setecoPath(value);
    }-*/;

    /**
     * Indicates whether the Microphone input detected a voice.
     * 
     * @return
     */
    public native int getIsVoiceDetected()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisVoiceDetected();
    }-*/;

    /**
     * Indicates whether the Microphone input detected a voice.
     * 
     * @return
     */
    public native void setIsVoiceDetected(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setisVoiceDetected(value);
    }-*/;

    /**
     * Controls enhanced microphone mode.
     * 
     * @return
     */
    public native String getMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmode();
    }-*/;

    /**
     * Controls enhanced microphone mode.
     * 
     * @return
     */
    public native void setMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setmode(value);
    }-*/;

    /**
     * check id non-linear processing is enabled.
     * 
     * @return
     */
    public native boolean isNonLinearProcessing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnonLinearProcessing();
    }-*/;

    /**
     * Enable non-linear processing.
     * 
     * @return
     */
    public native void setNonLinearProcessing(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setnonLinearProcessing(value);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.media.MicrophoneEnhancedOptions");
    }

}
