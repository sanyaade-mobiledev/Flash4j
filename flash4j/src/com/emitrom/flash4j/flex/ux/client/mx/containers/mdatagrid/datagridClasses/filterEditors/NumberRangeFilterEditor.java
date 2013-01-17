/************************************************************************
  NumberRangeFilterEditor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class NumberRangeFilterEditor.
 */
public class NumberRangeFilterEditor extends DropDownFilterEditorBase {

    /**
     * Instantiates a new number range filter editor.
     */
    protected NumberRangeFilterEditor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the number range filter editor
     */
    public NumberRangeFilterEditor() {
        jsObj = Bridge.createObject("com.iwobanas.controls.dataGridClasses.filterEditors.NumberRangeFilterEditor");
    }

    /**
     * Gets the text from label.
     * 
     * @return the text from label
     */
    public native Label getTextFromLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettextFromLabel();
		return @com.emitrom.flash4j.flex.client.mx.controls.Label::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the text to label.
     * 
     * @return the text to label
     */
    public native Label getTextToLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettextToLabel();
		return @com.emitrom.flash4j.flex.client.mx.controls.Label::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
