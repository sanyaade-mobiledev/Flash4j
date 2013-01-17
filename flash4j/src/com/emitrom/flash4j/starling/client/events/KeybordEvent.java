/************************************************************************
  KeybordEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.events;

import com.google.gwt.core.client.JavaScriptObject;

public class KeybordEvent extends StarlingEvent {

    protected KeybordEvent(JavaScriptObject obj) {
        super(obj);
    }

    public static KeybordEvent cast(StarlingEvent event) {
        return new KeybordEvent(event.getJsObj());
    }

    /**
     * Indicates whether the Alt key is active on Windows or Linux; indicates
     * whether the Option key is active on Mac OS.
     * 
     * @return
     */
    public native boolean isAltKey()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getaltKey();
    }-*/;

    /**
     * Contains the character code of the key.
     * 
     * @return
     */
    public native int getCharCode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcharCode();
    }-*/;

    /**
     * Indicates whether the Ctrl key is active on Windows or Linux; indicates
     * whether either the Ctrl or the Command key is active on Mac OS.
     * 
     * @return
     */
    public native boolean isCtrlKey()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getctrlKey();
    }-*/;

    /**
     * The key code of the key.
     * 
     * @return
     */
    public native int getKeyCode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getkeyCode();
    }-*/;

    /**
     * Indicates the location of the key on the keyboard.
     * 
     * @return
     */
    public native int getKeyLocation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getkeyLocation();
    }-*/;

    /**
     * Indicates whether the Shift key modifier is active (true) or inactive
     * (false).
     * 
     * @return
     */
    public native boolean isShiftKey()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshiftKey();
    }-*/;

}
