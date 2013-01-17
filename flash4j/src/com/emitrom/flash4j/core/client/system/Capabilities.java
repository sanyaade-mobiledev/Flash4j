/************************************************************************
  Capabilities.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.system;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;

/**
 * The Class Capabilities.
 */
public class Capabilities extends ProxyObject {

    private static Capabilities INSTANCE = new Capabilities();

    /**
     * Instantiates a new capabilities.
     */
    private Capabilities() {
        jsObj = Bridge.createObject("flash.system.Capabilities");
    }

    /**
     * Gets the.
     * 
     * @return the capabilities
     */
    public static Capabilities get() {
        return INSTANCE;
    }

    /**
     * Av hardware disable.
     * 
     * @return true, if successful
     */
    public native boolean getAvHardwareDisable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getavHardwareDisable();
    }-*/;

    /**
     * Gets the cPU architecture.
     * 
     * @return the cPU architecture
     */
    public native String getCPUArchitecture()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcPUArchitecture();
    }-*/;

    /**
     * Checks for accessibility.
     * 
     * @return true, if successful
     */
    public native boolean hasAccessibility() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasAccessibility();
    }-*/;

    /**
     * Checks for audio.
     * 
     * @return true, if successful
     */
    public native boolean hasAudio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasAudio();
    }-*/;

    /**
     * Checks for audio encoder.
     * 
     * @return true, if successful
     */
    public native boolean hasAudioEncoder()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasAudioEncoder();
    }-*/;

    /**
     * Checks for embedded video.
     * 
     * @return true, if successful
     */
    public native boolean hasEmbeddedVideo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasEmbeddedVideo();
    }-*/;

    /**
     * Checks for ime.
     * 
     * @return true, if successful
     */
    public native boolean hasIME()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasIME();
    }-*/;

    /**
     * Checks for m p3.
     * 
     * @return true, if successful
     */
    public native boolean hasMP3()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasMP3();
    }-*/;

    /**
     * Checks for printing.
     * 
     * @return true, if successful
     */
    public native boolean hasPrinting()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasPrinting();
    }-*/;

    /**
     * Checks for screen broadcast.
     * 
     * @return true, if successful
     */
    public native boolean hasScreenBroadcast()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethHasScreenBroadcast();
    }-*/;

    /**
     * Checks for screen playback.
     * 
     * @return true, if successful
     */
    public native boolean hasScreenPlayback()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasScreenPlayback();
    }-*/;

    /**
     * Checks for streaming audio.
     * 
     * @return true, if successful
     */
    public native boolean hasStreamingAudio() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasStreamingAudio();
    }-*/;

    /**
     * Checks for streaming video.
     * 
     * @return true, if successful
     */
    public native boolean hasStreamingVideo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasStreamingVideo();
    }-*/;

    /**
     * Checks for tls.
     * 
     * @return true, if successful
     */
    public native boolean hasTLS()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasTLS();
    }-*/;

    /**
     * Checks for video encoder.
     * 
     * @return true, if successful
     */
    public native boolean hasVideoEncoder()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasVideoEncoder();
    }-*/;

    /**
     * Checks if is debugger.
     * 
     * @return true, if is debugger
     */
    public native boolean isDebugger()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisDebugger();
    }-*/;

    /**
     * Language.
     * 
     * @return the string
     */
    public native String getLanguage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlanguage();
    }-*/;

    /**
     * Local file read disable.
     * 
     * @return true, if successful
     */
    public native boolean isLocalFileReadDisable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlocalFileReadDisable();
    }-*/;

    /**
     * Manufacturer.
     * 
     * @return the string
     */
    public native String getManufacturer()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmanufacturer();
    }-*/;

    /**
     * Gets the max level idc.
     * 
     * @return the max level idc
     */
    public native String getMaxLevelIDC()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxLevelIDC();
    }-*/;

    /**
     * Os.
     * 
     * @return the string
     */
    public native String getOs()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getos();
    }-*/;

    /**
     * Pixel aspect ratio.
     * 
     * @return the double
     */
    public native double getPixelAspectRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpixelAspectRatio();
    }-*/;

    /**
     * Player type.
     * 
     * @return the string
     */
    public native String getPlayerType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getplayerType();
    }-*/;

    /**
     * Screen color.
     * 
     * @return the string
     */
    public native String getScreenColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscreenColor();
    }-*/;

    /**
     * Screen dpi.
     * 
     * @return the int
     */
    public native int getScreenDPI()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscreenDPI();
    }-*/;

    /**
     * Screen resolution x.
     * 
     * @return the int
     */
    public native int getScreenResolutionX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscreenResolutionX();
    }-*/;

    /**
     * Screen resolution y.
     * 
     * @return the int
     */
    public native int getScreenResolutionY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscreenResolutionY();
    }-*/;

    /**
     * Version.
     * 
     * @return the string
     */
    public native String getVersion()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getversion();
    }-*/;

    /**
     * Server string.
     * 
     * @return the string
     */
    public native String getServerString()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getserverString();
    }-*/;

    /**
     * Supports32 bit processes.
     * 
     * @return true, if successful
     */
    public native boolean supports32BitProcesses()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsupports32BitProcesses();
    }-*/;

    /**
     * Supports64 bit processes.
     * 
     * @return true, if successful
     */
    public native boolean supports64BitProcesses()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsupports64BitProcesses();
    }-*/;

    /**
     * Touch screen type.
     * 
     * @return the string
     */
    public native String touchScreenType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettouchScreenType();
    }-*/;

}
