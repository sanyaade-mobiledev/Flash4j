/************************************************************************
  PopUpButton.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.IUIComponent;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PopUpButton.
 */
public class PopUpButton extends Button {

    /**
     * Instantiates a new pop up button.
     */
    protected PopUpButton(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the pop up button
     */
    public PopUpButton() {
        jsObj = Bridge.createObject("mx.controls.PopUpButton");
    }

    /**
     * New instance.
     * 
     * @param label the label
     * @return the pop up button
     */
    public PopUpButton(String label) {
        setLabel(label);
    }

    /**
     * Close on activitiy.
     * 
     * @return true, if successful
     */
    public native boolean closeOnActivitiy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcloseOnActivitiy();
    }-*/;

    /**
     * Sets the close on activitiy.
     * 
     * @param value the new close on activitiy
     */
    public native void setCloseOnActivitiy(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcloseOnActivitiy(value);
    }-*/;

    /**
     * Open always.
     * 
     * @return true, if successful
     */
    public native boolean openAlways()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getopenAlways();
    }-*/;

    /**
     * Sets the open always.
     * 
     * @param value the new open always
     */
    public native void setOpenAlways(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setopenAlways(value);
    }-*/;

    /**
     * Gets the pop up.
     * 
     * @return the pop up
     */
    public native UIComponent getPopUp()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getpopUp();
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the pop up.
     * 
     * @param value the new pop up
     */
    private native void setPopUp(IUIComponent value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setpopUp(value
						.@com.emitrom.flash4j.flex.client.mx.core.IUIComponent::asIUIComponent());
    }-*/;

}
