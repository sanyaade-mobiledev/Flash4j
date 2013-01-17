/************************************************************************
  VirtualKeyBoard.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.controls.keyboard;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.text.TextField;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class VirtualKeyBoard.
 */
public class VirtualKeyBoard extends ProxyObject {

    /**
     * Instantiates a new virtual key board.
     */
    protected VirtualKeyBoard(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Sets the target.
     * 
     * @param value
     *            the new target
     */
    public final native void setTarget(VirtualKeyBoardTarget value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settarget(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Show.
     */
    public final native void show()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.show();
    }-*/;

    /**
     * Gets the input field.
     * 
     * @return the input field
     */
    public final native TextField getInputField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getInputField();
		return @com.emitrom.flash4j.core.client.text.TextField::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
