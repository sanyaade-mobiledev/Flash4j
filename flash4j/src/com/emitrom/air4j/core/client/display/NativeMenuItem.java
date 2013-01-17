/************************************************************************
  NativeMenuItem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.EnumSet;

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.ui.KeyboardModifier;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;

public class NativeMenuItem extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.NativeMenuItem;
    }-*/;

    protected NativeMenuItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    public NativeMenuItem() {
        jsObj = newInstance();
    }

    public NativeMenuItem(String label) {
        jsObj = newInstance(label);
    }

    public NativeMenuItem(String label, boolean isSeparator) {
        jsObj = newInstance(label, isSeparator);
    }

    public static NativeMenuItem createSeparator() {
        return new NativeMenuItem("", true);
    }

    public native boolean isChecked() /*-{
		return peer.checked;
    }-*/;

    public native void setChecked(boolean checked) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.checked = checked;
    }-*/;

    public native <T> T getData() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.data;
    }-*/;

    public native boolean isEnabled() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.enabled;
    }-*/;

    public native void setEnabled(boolean enabled) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.enabled = enabled;
    }-*/;

    public native boolean isSeparator() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isSeparator;
    }-*/;

    public native String getKeyEquivalent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.keyEquivalent;
    }-*/;

    public native void setKeyEquivalent(String keyEquivalent) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.keyEquivalent = keyEquivalent;
    }-*/;

    public EnumSet<KeyboardModifier> getKeyEquivalentModifiers() {
        EnumSet<KeyboardModifier> ret = EnumSet.noneOf(KeyboardModifier.class);
        for (int i = 0; i < _getKeyEquivalentModifiers().length(); i++) {
            ret.add(KeyboardModifier.fromValue(i));
        }
        return ret;
    }

    private native JsArrayInteger _getKeyEquivalentModifiers() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.keyEquivalentModifiers;
    }-*/;

    public void setKeyEquivalentModifiers(KeyboardModifier... modifiers) {
        JsArrayInteger codes = JavaScriptObject.createArray().cast();
        for (int i = 0, length = modifiers.length; i < length; i++) {
            codes.set(i, modifiers[i].value);
        }
        _setKeyEquivalentModifiers(codes);
    }

    public void setKeyEquivalentModifiers(EnumSet<KeyboardModifier> modifiers) {
        JsArrayInteger codes = JavaScriptObject.createArray().cast();
        int i = 0;
        for (KeyboardModifier modifier : modifiers) {
            codes.set(i++, modifier.value);
        }
        _setKeyEquivalentModifiers(codes);
    }

    private native void _setKeyEquivalentModifiers(JsArrayInteger modifiers) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.keyEquivalentModifiers = modifiers;
    }-*/;

    public native String getLabel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.label;
    }-*/;

    public native void setLabel(String label) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.label = label;
    }-*/;

    public native NativeMenu getMenu() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.menu;
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getMnemonicIndex() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.mnemonicIndex;
    }-*/;

    public native void setMnemonicIndex(int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.mnemonicIndex = index;
    }-*/;

    public native String getName() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.name;
    }-*/;

    public native void setName(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.name = name;
    }-*/;

    public native NativeMenu getSubmenu() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.submenu;
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setSubmenu(NativeMenu submenu) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.submenu = submenu.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native NativeMenuItem clone() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.clone();
		return @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.display.NativeMenuItem();
    }-*/;

    private static native JavaScriptObject newInstance(String label) /*-{
		return new $wnd.runtime.flash.display.NativeMenuItem(label);
    }-*/;

    private static native JavaScriptObject newInstance(String label, boolean isSeparator) /*-{
		return new $wnd.runtime.flash.display.NativeMenuItem(label, isSeparator);
    }-*/;

}
