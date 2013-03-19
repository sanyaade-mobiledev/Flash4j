/************************************************************************
  Button.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.IconsUtil;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Button.
 */
public class Button extends UIComponent {

    /**
     * Instantiates a new button.
     */
    Button(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the button
     */
    public Button() {
        jsObj = Bridge.createObject("mx.controls.Button");
        setLabel("Button");
    }

    /**
     * New instance.
     * 
     * @param label
     *            the label
     * @return the button
     */
    public Button(String label) {
        this();
        setLabel(label);
    }

    public Button(String label, String icon) {
        this(label);
        setIcon(icon);
    }

    /**
     * Sets the label.
     * 
     * @param value
     *            the new label
     */
    public native void setLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabel(value);
    }-*/;

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public native String getLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabel();
    }-*/;

    /**
     * Auto repeat.
     * 
     * @return true, if successful
     */
    public native boolean autoRepeat()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoRepeat();
    }-*/;

    /**
     * Sets the auto repeat.
     * 
     * @param value
     *            the new auto repeat
     */
    public native void setAutoRepeat(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoRepeat(value);
    }-*/;

    /**
     * Gets the data.
     * 
     * @param <T>
     *            the generic type
     * @return the data
     */
    public native <T> T getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value
     *            the new data
     */
    public native void setData(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    /**
     * Gets the label placement.
     * 
     * @return the label placement
     */
    public ButtonLabelPlacement getLabelPlacement() {
        return ButtonLabelPlacement.fromValue(_getLabelPlacement());
    }

    /**
     * _get label placement.
     * 
     * @return the string
     */
    private native String _getLabelPlacement()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelPlacement();
    }-*/;

    /**
     * Sets the label placement.
     * 
     * @param placement
     *            the new label placement
     */
    public void setLabelPlacement(ButtonLabelPlacement placement) {
        _setLabelPlacement(placement.value);
    }

    /**
     * _set label placement.
     * 
     * @param value
     *            the value
     */
    private native void _setLabelPlacement(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelPlacement(value);
    }-*/;

    /**
     * Checks if is selected.
     * 
     * @return true, if is selected
     */
    public native boolean isSelected()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselected();
    }-*/;

    /**
     * Sets the selected.
     * 
     * @param value
     *            the new selected
     */
    public native void setSelected(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselected(value);
    }-*/;

    /**
     * Gets the selected field.
     * 
     * @return the selected field
     */
    public native String getSelectedField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedField();
    }-*/;

    /**
     * Sets the selected field.
     * 
     * @param value
     *            the new selected field
     */
    public native void setSelectedField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedField(value);
    }-*/;

    /**
     * Checks if is sticky highlighting.
     * 
     * @return true, if is sticky highlighting
     */
    public native boolean isStickyHighlighting()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstickyHighlighting();
    }-*/;

    /**
     * Sets the sticky highlighting.
     * 
     * @param value
     *            the new sticky highlighting
     */
    public native void setStickyHighlighting(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstickyHighlighting(value);
    }-*/;

    /**
     * Checks if is toggle.
     * 
     * @return true, if is toggle
     */
    public native boolean isToggle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettoggle();
    }-*/;

    /**
     * Sets the toggle.
     * 
     * @param value
     *            the new toggle
     */
    public native void setToggle(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settoggle(value);
    }-*/;

    /**
     * Sets the icon.
     * 
     * @param iconPath
     *            the new icon
     */
    public void setIcon(String iconPath) {
        setStyle("icon", IconsUtil.getClass(this, iconPath));
    }

    /**
     * Sets the icon.
     * 
     * @param iconPath
     *            the icon path
     * @param iconWidth
     *            the icon width
     * @param iconHeight
     *            the icon height
     */
    public void setIcon(String iconPath, double iconWidth, double iconHeight) {
        setStyle("icon", IconsUtil.getClass(this, iconPath, iconWidth, iconHeight));
    }

}
