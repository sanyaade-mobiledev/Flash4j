/************************************************************************
  MultipleChoiceFilterEditor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.controls.CheckBox;
import com.emitrom.flash4j.flex.client.mx.controls.List;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class MultipleChoiceFilterEditor.
 */
public class MultipleChoiceFilterEditor extends DropDownFilterEditorBase {

    /**
     * Instantiates a new multiple choice filter editor.
     */
    protected MultipleChoiceFilterEditor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the multiple choice filter editor
     */
    public MultipleChoiceFilterEditor() {
        jsObj = Bridge.createObject("com.iwobanas.controls.dataGridClasses.filterEditors.MultipleChoiceFilterEditor");
    }

    /**
     * Gets the all check box.
     * 
     * @return the all check box
     */
    public native CheckBox getAllCheckBox()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getallCheckBox();
		return @com.emitrom.flash4j.flex.client.mx.controls.CheckBox::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the label list.
     * 
     * @return the label list
     */
    public native List getLabelList()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getlabelList();
		return @com.emitrom.flash4j.flex.client.mx.controls.List::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
