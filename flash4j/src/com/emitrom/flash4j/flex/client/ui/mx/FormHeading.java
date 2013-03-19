/************************************************************************
  FormHeading.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FormHeading.
 */
public class FormHeading extends UIComponent {

    /**
     * Instantiates a new form heading.
     */
    protected FormHeading(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the form heading
     */
    public FormHeading() {
        jsObj = Bridge.createObject("mx.containers.FormHeading");
    }

    public FormHeading(String label) {
        this();
        setLabel(label);
    }

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
     * Sets the label.
     * 
     * @param value the new label
     */
    public native void setLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabel(value);
    }-*/;

}
