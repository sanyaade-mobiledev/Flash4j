/************************************************************************
  FormMenuItem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FormMenuItem.
 */
public class FormMenuItem extends MenuItem {

    /**
     * Instantiates a new form menu item.
     */
    protected FormMenuItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the form menu item
     */
    public FormMenuItem() {
        jsObj = Bridge.createObject("com.ekambi.data.MenuItem");
    }

    /**
     * New instance.
     * 
     * @param label
     *            the label
     * @return the form menu item
     */
    public FormMenuItem(String label) {
        this();
        setLabel(label);
    }

    /**
     * Sets the toggled.
     * 
     * @param value
     *            the new toggled
     */
    public void setToggled(boolean value) {
        _setToggled(Boolean.toString(value));
    }

    /**
     * _set toggled.
     * 
     * @param value
     *            the value
     */
    private final native void _setToggled(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.toggled = value;
    }-*/;

    /**
     * Gets the toggled.
     * 
     * @return the toggled
     */
    public boolean isToggled() {
        return Boolean.parseBoolean(_getToggled());
    }

    /**
     * _get toggled.
     * 
     * @return the string
     */
    private final native String _getToggled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.toggled;
    }-*/;

    /**
     * Creates the check menu item.
     * 
     * @param label
     *            the label
     * @return the form menu item
     */
    public static FormMenuItem createCheckMenuItem(String label) {
        FormMenuItem item = new FormMenuItem(label);
        item.setType("check");
        return item;
    }

    /**
     * Creates the radio menu item.
     * 
     * @param label
     *            the label
     * @return the radio menu item
     */
    public static FormMenuItem createRadioMenuItem(String label) {
        FormMenuItem item = new FormMenuItem(label);
        item.setType("radio");
        return item;
    }

    /**
     * Gets the group name.
     * 
     * @return the group name
     */
    public native String getGroupName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.groupName;
    }-*/;

    /**
     * Sets the group name.
     * 
     * @param value
     *            the new group name
     */
    public native void setGroupName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.groupName = value;
    }-*/;

}
