/************************************************************************
  WildcardFilterEditor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.datagridClasses.filterEditors;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.controls.Label;
import com.emitrom.flash4j.flex.client.mx.controls.TextInput;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class WildcardFilterEditor.
 */
public class WildcardFilterEditor extends DropDownFilterEditorBase {

    /**
     * Instantiates a new wildcard filter editor.
     */
    protected WildcardFilterEditor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the wildcard filter editor
     */
    public WildcardFilterEditor() {
        jsObj = Bridge.createObject("com.iwobanas.controls.dataGridClasses.filterEditors.WildcardFilterEditor");
    }

    /**
     * Gets the search label.
     * 
     * @return the search label
     */
    public native Label getSearchLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getsearchLabel();
		return @com.emitrom.flash4j.flex.client.mx.controls.Label::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the wildcard input.
     * 
     * @return the wildcard input
     */
    public native TextInput getWildcardInput()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getwildcardInput();
		return @com.emitrom.flash4j.flex.client.mx.controls.TextInput::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
