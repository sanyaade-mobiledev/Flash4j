/************************************************************************
  InteractiveObject.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.display;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class InteractiveObject.
 */
public class InteractiveObject extends DisplayObject {

    /**
     * Instantiates a new interactive object.
     */
    protected InteractiveObject() {

    }

    InteractiveObject(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Checks if is double click enabled.
     * 
     * @return true, if is double click enabled
     */
    public native boolean isDoubleClickEnabled() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdoubleClickEnabled();
    }-*/;

    /**
     * Sets the double click enabled.
     * 
     * @param value the new double click enabled
     */
    public native void setDoubleClickEnabled(boolean value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdoubleClickEnabled(enable);
    }-*/;

    /**
     * Gets the focus rect.
     * 
     * @param <T> the generic type
     * @return the focus rect
     */
    public native <T> T getFocusRect() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfocusRect();
    }-*/;

    /**
     * Sets the focus rect.
     * 
     * @param focus the new focus rect
     */
    public native void setFocusRect(Object focus) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfocusRect(focus);
    }-*/;

    /**
     * Checks if is mouse enabled.
     * 
     * @return true, if is mouse enabled
     */
    public native boolean isMouseEnabled() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmouseEnabled();
    }-*/;

    /**
     * Sets the mouse enabled.
     * 
     * @param enable the new mouse enabled
     */
    public native void setMouseEnabled(boolean enable) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmouseEnabled(enable);
    }-*/;

    /**
     * Checks for tab enabled.
     * 
     * @return true, if successful
     */
    public native boolean hasTabEnabled() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettabEnabled();
    }-*/;

    /**
     * Sets the tab enabled.
     * 
     * @param enable the new tab enabled
     */
    public native void setTabEnabled(boolean enable) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settabnabled(enable);
    }-*/;

    /**
     * Gets the tab index.
     * 
     * @return the tab index
     */
    public native int getTabIndex() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettabIndex();
    }-*/;

    /**
     * Sets the tab index.
     * 
     * @param index the new tab index
     */
    public native void setTabIndex(int index) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settabIndex(index);
    }-*/;

}
