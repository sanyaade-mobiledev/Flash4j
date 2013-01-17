/************************************************************************
  IME.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public final class IME extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.system.IME;
    }-*/;

    public static IMEConversionMode getConversionMode() {
        return IMEConversionMode.fromValue(_getConversionMode());
    }

    private static native String _getConversionMode() /*-{
		return $wnd.runtime.flash.system.IME.conversionMode;
    }-*/;

    public static void setConversionMode(IMEConversionMode conversionMode) {
        _setConversionMode(conversionMode.value);
    }

    private static native void _setConversionMode(String conversionMode) /*-{
		$wnd.runtime.flash.system.IME.conversionMode = conversionMode;
    }-*/;

    public static native boolean isEnabled() /*-{
		return $wnd.runtime.flash.system.IME.enabled;
    }-*/;

    public static native void setEnabled(boolean enabled) /*-{
		$wnd.runtime.flash.system.IME.enabled = enabled;
    }-*/;

    public static native void doConversion() /*-{
		$wnd.runtime.flash.system.IME.doConversion();
    }-*/;

    public static native void setCompositionString(String composition) /*-{
		$wnd.runtime.flash.system.IME.setCompositionString(composition);
    }-*/;

    private IME() {
    }

    private IME(JavaScriptObject obj) {
        jsObj = obj;
    }
}
