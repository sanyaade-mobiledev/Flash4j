/************************************************************************
 * RadioButton.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class RadioButton.
 */
public class RadioButton extends Button {

    /**
     * Instantiates a new radio button.
     */
    protected RadioButton(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the radio button
     */
    public RadioButton() {
        jsObj = Bridge.createObject("mx.controls.RadioButton");
    }

    /**
     * New instance.
     * 
     * @param label
     *            the label
     * @return the radio button
     */
    public RadioButton(String label) {
        this();
        setLabel(label);
    }

    /**
     * Gets the group.
     * 
     * @return the group
     */
    public native RadioButtonGroup getGroup()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getgroup();
		return @com.emitrom.flash4j.flex.client.ui.mx.RadioButtonGroup::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the group.
     * 
     * @param value
     *            the new group
     */
    public native void setGroup(RadioButtonGroup value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setgroup(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the group name.
     * 
     * @return the group name
     */
    public native String getGroupName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getgroupName();
    }-*/;

    /**
     * Sets the group name.
     * 
     * @param value
     *            the new group name
     */
    public native void setGroupName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setgroupName(value);
    }-*/;

    /**
     * Gets the value.
     * 
     * @param <T>
     *            the generic type
     * @return the value
     */
    public native <T> T getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

    /**
     * Sets the value.
     * 
     * @param newValue
     *            the new value
     */
    public native void setValue(Object newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalue(newValue);
    }-*/;

}
