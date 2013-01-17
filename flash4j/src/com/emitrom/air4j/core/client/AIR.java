/************************************************************************
  AIR.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client;

import com.emitrom.air4j.core.client.net.URLRequest;
import com.google.gwt.user.client.Window;

public class AIR {

    private static final String AdobeAIR = "adobeair";

    public static String getNavigator() {
        return Window.Navigator.getUserAgent().toLowerCase();
    }

    public static boolean isCurrentRuntime() {
        return (getNavigator().indexOf(AdobeAIR) >= 0);
    }

    public static native void trace(Object... args) /*-{
		$wnd.runtime.trace.apply(null, args);
    }-*/;

    public static native void navigateToURL(URLRequest request) /*-{
		$wnd.runtime.flash.net
				.navigateToURL(request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public static native void navigateToURL(URLRequest request, String window) /*-{
		$wnd.runtime.flash.net
				.navigateToURL(
						request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						window);
    }-*/;

    public static native void sendToURL(URLRequest request) /*-{
		$wnd.runtime.flash.net
				.sendToURL(request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public static native <T> T getClassByAlias(String aliasname) /*-{
		return $wnd.runtime.flash.net.getClassByAlias(aliasname);
    }-*/;

    public static native void registerClassAlias(String aliasname, Object classObject) /*-{
		return $wnd.runtime.flash.net
				.registerClassAlias(aliasname, classObject);
    }-*/;

    public static native void registerClassAlias(String aliasname, String classFullPath) /*-{
		return $wnd.runtime.flash.net.registerClassAlias(aliasname,
				classFullPath);
    }-*/;

    public static native void scanHardware() /*-{
		$wnd.runtime.flash.media.scanHardware();
    }-*/;

    public static native <T> T getClass(Object o)/*-{
		return $wnd.runtime.Class($wnd.runtime.flash.utils
				.getDefinitionByName($wnd.runtime.flash.utils
						.getQualifiedClassName(o)));
    }-*/;

    private AIR() {

    }

}
