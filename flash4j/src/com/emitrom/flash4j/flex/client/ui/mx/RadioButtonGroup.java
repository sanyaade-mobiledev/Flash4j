/************************************************************************
  RadioButtonGroup.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class RadioButtonGroup.
 */
public class RadioButtonGroup extends EventDispatcher {

    /**
     * Instantiates a new radio button group.
     */
    protected RadioButtonGroup(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the radio button group
     */
    public RadioButtonGroup() {
        jsObj = Bridge.createObject("mx.controls.RadioButtonGroup");
    }

    /**
     * Checks if is enabled.
     * 
     * @return true, if is enabled
     */
    public native boolean isEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getenabled();
    }-*/;

    /**
     * Sets the enabled.
     * 
     * @param value the new enabled
     */
    public native void setEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setenabled(value);
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
     * @param placement the new label placement
     */
    public void setLabelPlacement(ButtonLabelPlacement placement) {
        _setLabelPlacement(placement.value);
    }

    /**
     * _set label placement.
     * 
     * @param value the value
     */
    private native void _setLabelPlacement(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelPlacement(value);
    }-*/;

    /**
     * Gets the num radio buttons.
     * 
     * @return the num radio buttons
     */
    public native int getNumRadioButtons()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumRadioButtons();
    }-*/;

    /**
     * Gets the selected value.
     * 
     * @param <T> the generic type
     * @return the selected value
     */
    public native <T> T getSelectedValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedValue();
    }-*/;

    /**
     * Sets the selected value.
     * 
     * @param value the new selected value
     */
    public native void setSelectedValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedValue(value);
    }-*/;

    /**
     * Gets the selection.
     * 
     * @return the selection
     */
    public native RadioButton getSelection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselection();
		return @com.emitrom.flash4j.flex.client.ui.mx.RadioButton::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the selection.
     * 
     * @param value the new selection
     */
    public native void setSelection(RadioButton value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setselection(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the radio button at.
     * 
     * @param index the index
     * @return the radio button at
     */
    public native RadioButton getRadioButtonAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getRadioButtonAt(index);
		return @com.emitrom.flash4j.flex.client.ui.mx.RadioButton::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;
}
