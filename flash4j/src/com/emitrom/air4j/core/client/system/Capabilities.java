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

package com.emitrom.air4j.core.client.system;

import com.google.gwt.core.client.JsArrayString;

public final class Capabilities {

    private Capabilities() {
    }

    public static native boolean avHardwareDisable() /*-{
		return $wnd.runtime.flash.system.Capabilities.avHardwareDisable;
    }-*/;

    public static native String getCPUArchitecture() /*-{
		return $wnd.runtime.flash.system.Capabilities.cpuArchitecture;
    }-*/;

    public static native boolean hasAccessibility() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasAccessibility;
    }-*/;

    public static native boolean hasAudio() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasAudio;
    }-*/;

    public static native boolean hasAudioEncoder() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasAudioEncoder;
    }-*/;

    public static native boolean hasEmbeddedVideo() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasEmbeddedVideo;
    }-*/;

    public static native boolean hasIME() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasIME;
    }-*/;

    public static native boolean hasMP3() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasMP3;
    }-*/;

    public static native boolean hasPrinting() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasPrinting;
    }-*/;

    public static native boolean hasScreenBroadcast() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasScreenBroadcast;
    }-*/;

    public static native boolean hasScreenPlayback() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasScreenPlayback;
    }-*/;

    public static native boolean hasStreamingAudio() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasStreamingAudio;
    }-*/;

    public static native boolean hasStreamingVideo() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasStreamingVideo;
    }-*/;

    public static native boolean hasTLS() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasTLS;
    }-*/;

    public static native boolean hasVideoEncoder() /*-{
		return $wnd.runtime.flash.system.Capabilities.hasVideoEncoder;
    }-*/;

    public static native boolean isDebugger() /*-{
		return $wnd.runtime.flash.system.Capabilities.isDebugger;
    }-*/;

    public static native String language() /*-{
		return $wnd.runtime.flash.system.Capabilities.language;
    }-*/;

    public static native JsArrayString languages() /*-{
		return $wnd.runtime.flash.system.Capabilities.languages;
    }-*/;

    public static native boolean localFileReadDisable() /*-{
		return $wnd.runtime.flash.system.Capabilities.localFileReadDisable;
    }-*/;

    public static native String manufacturer() /*-{
		return $wnd.runtime.flash.system.Capabilities.manufacturer;
    }-*/;

    public static native String getMaxLevelIDC() /*-{
		return $wnd.runtime.flash.system.Capabilities.maxLevelIDC;
    }-*/;

    public static native String os() /*-{
		return $wnd.runtime.flash.system.Capabilities.os;
    }-*/;

    public static native double pixelAspectRatio() /*-{
		return $wnd.runtime.flash.system.Capabilities.pixelAspectRatio;
    }-*/;

    public static native String playerType() /*-{
		return $wnd.runtime.flash.system.Capabilities.playerType;
    }-*/;

    public static native String screenColor() /*-{
		return $wnd.runtime.flash.system.Capabilities.screenColor;
    }-*/;

    public static native int screenDPI() /*-{
		return $wnd.runtime.flash.system.Capabilities.screenDPI;
    }-*/;

    public static native int screenResolutionX() /*-{
		return $wnd.runtime.flash.system.Capabilities.screenResolutionX;
    }-*/;

    public static native int screenResolutionY() /*-{
		return $wnd.runtime.flash.system.Capabilities.screenResolutionY;
    }-*/;

    public static native String version() /*-{
		return $wnd.runtime.flash.system.Capabilities.version;
    }-*/;

    public static native String serverString() /*-{
		return $wnd.runtime.flash.system.Capabilities.serverString;
    }-*/;

    public static native boolean supports32BitProcesses() /*-{
		return $wnd.runtime.flash.system.Capabilities.supports32BitProcesses;
    }-*/;

    public static native boolean supports64BitProcesses() /*-{
		return $wnd.runtime.flash.system.Capabilities.supports64BitProcesses;
    }-*/;

    public static native String touchScreenType() /*-{
		return $wnd.runtime.flash.system.Capabilities.touchscreenType;
    }-*/;
}
