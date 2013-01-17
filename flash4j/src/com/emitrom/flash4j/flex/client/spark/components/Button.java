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
package com.emitrom.flash4j.flex.client.spark.components;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.spark.components.supportClasses.ButtonBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Button component is a commonly used rectangular button. The Button
 * component looks like it can be pressed. The default skin has a text label.
 * Define a custom skin class to add an image to the control.
 * <p>
 * Buttons typically use event listeners to perform an action when the user
 * selects the control. When a user clicks the mouse on a Button control, and
 * the Button control is enabled, it dispatches a click event and a buttonDown
 * event. A button always dispatches events such as the mouseMove, mouseOver,
 * mouseOut, rollOver, rollOut, mouseDown, and mouseUp events whether enabled or
 * disabled.
 */
public class Button extends ButtonBase {

    /**
     * Instantiates a new button.
     */
    Button(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the button
     */
    public Button() {
        jsObj = Bridge.createObject("spark.components.Button");
        setLabel("Button");
    }

    /**
     * New instance.
     * 
     * @param label the label
     * @return the button
     */
    public Button(String label) {
        this();
        setLabel(label);
    }

    /**
     * Emphasized.
     * 
     * @return true, if successful
     */
    public native boolean isEmphasized()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemphasized();
    }-*/;

    /**
     * Sets the emphasized.
     * 
     * @param value the new emphasized
     */
    public native void setEmphasized(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemphasized(value);
    }-*/;

}
