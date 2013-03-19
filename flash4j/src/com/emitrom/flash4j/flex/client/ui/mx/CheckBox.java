/************************************************************************
  CheckBox.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class CheckBox.
 */
public class CheckBox extends Button {

    /**
     * Instantiates a new check box.
     */
    protected CheckBox(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the check box
     */
    public CheckBox() {
        jsObj = Bridge.createObject("mx.controls.CheckBox");
        setLabel("");
    }

    /**
     * New instance.
     * 
     * @param label the label
     * @return the check box
     */
    public CheckBox(String label) {
        setLabel(label);
    }

}