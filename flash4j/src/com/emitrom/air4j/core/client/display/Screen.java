/************************************************************************
  Screen.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.display;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

public class Screen extends EventDispatcher {

    private static final Screen MAIN_SCREEN = new Screen(_getMainScreen());

    public static Screen getMainScreen() {
        return MAIN_SCREEN;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.Screen;
    }-*/;

    protected Screen(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static List<Screen> getScreens() {
        List<Screen> toReturn = new ArrayList<Screen>();
        JavaScriptObject peers = _getScreens();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new Screen(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    public static List<Screen> getScreensForRectangle(Rectangle rect) {
        List<Screen> toReturn = new ArrayList<Screen>();
        JavaScriptObject peers = _getScreensForRectangle(rect);
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new Screen(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    public native Rectangle getBounds() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.bounds;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getColorDepth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.colorDepth;
    }-*/;

    public native Rectangle getVisibleBounds() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.visibleBounds;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native JavaScriptObject _getMainScreen() /*-{
		return $wnd.runtime.flash.display.Screen.mainScreen;
    }-*/;

    private static native JavaScriptObject _getScreens() /*-{
		return $wnd.runtime.flash.display.Screen.screens;
    }-*/;

    private static native JavaScriptObject _getScreensForRectangle(Rectangle rect) /*-{
		return $wnd.runtime.flash.display.Screen
				.getScreensForRectangle(rect.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;
}
