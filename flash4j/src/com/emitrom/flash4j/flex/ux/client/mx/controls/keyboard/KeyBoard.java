/************************************************************************
 * KeyBoard.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.controls.keyboard;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.text.TextField;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.ui.spark.Application;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class KeyBoard.
 */
public class KeyBoard extends UIComponent {

    /**
     * Instantiates a new key board.
     */
    protected KeyBoard(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the key board
     */
    private KeyBoard() {
        jsObj = Bridge.createObject("com.ekambi.gwt.components.KeyBoard");
        this.strech();
        Application.get().addElement(this);
    }

    /**
     * Gets the virtual key board.
     * 
     * @return the virtual key board
     */
    public final native VirtualKeyBoard getVirtualKeyBoard()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getVirtualKeyBoard();
    }-*/;

    /**
     * Show.
     */
    public final void show() {
        this.getVirtualKeyBoard().show();
    }

    /**
     * Gets the input field.
     * 
     * @return the input field
     */
    public final TextField getInputField() {
        return this.getVirtualKeyBoard().getInputField();
    }

}
