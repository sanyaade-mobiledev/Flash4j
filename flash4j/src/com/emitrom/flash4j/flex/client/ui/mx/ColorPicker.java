/************************************************************************
  ColorPicker.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ColorPicker.
 */
public class ColorPicker extends ComboBase {

    /**
     * Instantiates a new color picker.
     */
    protected ColorPicker(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the color picker
     */
    public ColorPicker() {
        jsObj = Bridge.createObject("mx.controls.ColorPicker");
    }

    /**
     * Gets the color field.
     * 
     * @return the color field
     */
    public native String getColorField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolorField();
    }-*/;

    /**
     * Sets the color field.
     * 
     * @param value the new color field
     */
    public native void setColorField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolorField(value);
    }-*/;

    /**
     * Gets the label field.
     * 
     * @return the label field
     */
    public native String getLabelField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelField();
    }-*/;

    /**
     * Sets the label field.
     * 
     * @param value the new label field
     */
    public native void setLabelField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelField(value);
    }-*/;

    /**
     * Gets the selected color.
     * 
     * @return the selected color
     */
    public native int getSelectedColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedColor();
    }-*/;

    /**
     * Sets the selected color.
     * 
     * @param value the new selected color
     */
    public native void setSelectedColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedColor(value);
    }-*/;

    /**
     * Show text field.
     * 
     * @return true, if successful
     */
    public native boolean showTextField()/*-{
		return peer.getshowTextField();
    }-*/;

    /**
     * Sets the show text field.
     * 
     * @param value the new show text field
     */
    public native void setShowTextField(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowTextField(value);
    }-*/;

    /**
     * Close.
     */
    public native void close()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Close.
     * 
     * @param trigger the trigger
     */
    public native void close(Event trigger)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.close(trigger.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Open.
     */
    public native void open()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.open();
    }-*/;

}
