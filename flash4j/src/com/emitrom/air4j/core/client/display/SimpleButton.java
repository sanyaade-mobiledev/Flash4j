/************************************************************************
  SimpleButton.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.media.SoundTransform;
import com.google.gwt.core.client.JavaScriptObject;

public class SimpleButton extends InteractiveObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.SimpleButton;
    }-*/;

    protected SimpleButton(JavaScriptObject obj) {
        jsObj = obj;
    }

    public SimpleButton() {
        jsObj = newIstance();
    }

    public SimpleButton(DisplayObject upState) {
        jsObj = newIstance(upState);
    }

    public SimpleButton(DisplayObject upState, DisplayObject overState) {
        jsObj = newIstance(upState, overState);
    }

    public SimpleButton(DisplayObject upState, DisplayObject overState, DisplayObject downState) {
        jsObj = newIstance(upState, overState, downState);
    }

    public SimpleButton(DisplayObject upState, DisplayObject overState, DisplayObject downState,
                    DisplayObject hitTestState) {
        jsObj = newIstance(upState, overState, downState, hitTestState);
    }

    public native DisplayObject getDownState() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.downState;
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setDownState(DisplayObject value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.downState = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean isEnabled() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.enabled;
    }-*/;

    public native void setEnabled(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.enabled = value;
    }-*/;

    public native DisplayObject getHitTestState() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.hitTestState;
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setHitTestState(DisplayObject value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.hitTestState = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native DisplayObject getOverState() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.overState;
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setOverState(DisplayObject value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.overState = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native SoundTransform getSoundTransfor() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.soundTransform;
		return @com.emitrom.air4j.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setSoundTransform(SoundTransform value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.soundTransform = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean isTrackAsMenu() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.trackAsMenu;
    }-*/;

    public native void trackAsMenu(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.trackAsMenu = value;
    }-*/;

    public native DisplayObject getUpState() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.upState;
		return @com.emitrom.air4j.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setUpState(DisplayObject value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.upState = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native boolean useHandCursor() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.useHandCursor;
    }-*/;

    public native void setUseHandCursor(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.useHandCursor = value;
    }-*/;

    private static native JavaScriptObject newIstance() /*-{
		return new $wnd.runtime.flash.display.SimpleButton();
    }-*/;

    private static native JavaScriptObject newIstance(DisplayObject upState) /*-{
		return new $wnd.runtime.flash.display.SimpleButton(
				upState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newIstance(DisplayObject upState, DisplayObject overState) /*-{
		return new $wnd.runtime.flash.display.SimpleButton(
				upState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				overState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newIstance(DisplayObject upState, DisplayObject overState,
                    DisplayObject downState) /*-{
		return new $wnd.runtime.flash.display.SimpleButton(
				upState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				overState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				downState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newIstance(DisplayObject upState, DisplayObject overState,
                    DisplayObject downState, DisplayObject hitTestState) /*-{
		return new $wnd.runtime.flash.display.SimpleButton(
				upState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				overState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				downState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				hitTestState.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;
}
