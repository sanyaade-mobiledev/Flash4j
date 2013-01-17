/************************************************************************
  FormItem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.Container;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FormItem.
 */
public class FormItem extends Container {

    /**
     * Instantiates a new form item.
     */
    protected FormItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the form item
     */
    public FormItem() {
        jsObj = Bridge.createObject("mx.containers.FormItem");
    }

    /**
     * New instance.
     * 
     * @param label the label
     * @return the form item
     */
    public FormItem(String label) {
        this();
        setLabel(label);
    }

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public FormItemDirection getDirection() {
        return FormItemDirection.fromValue(_getDirection());
    }

    /**
     * _get direction.
     * 
     * @return the string
     */
    private native String _getDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdirection();
    }-*/;

    /**
     * Sets the direction.
     * 
     * @param direction the new direction
     */
    public void setDirection(FormItemDirection direction) {
        _setDirection(direction.value);
    }

    /**
     * _set direction.
     * 
     * @param value the value
     */
    private native void _setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

    /**
     * Gets the item label.
     * 
     * @return the item label
     */
    public native String getItemLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getitemLabel();
    }-*/;

    /**
     * Checks if is required.
     * 
     * @return true, if is required
     */
    public native boolean isRequired()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrequired();
    }-*/;

    /**
     * Sets the required.
     * 
     * @param value the new required
     */
    public native void setRequired(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrequired(value);
    }-*/;

}
