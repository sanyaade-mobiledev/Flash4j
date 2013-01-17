/************************************************************************
  VirtualKeyBoardTarget.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;

/**
 * The Class VirtualKeyBoardTarget.
 */
public class VirtualKeyBoardTarget extends ProxyObject {

    /**
     * Instantiates a new virtual key board target.
     */
    public VirtualKeyBoardTarget() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * New instance.
     * 
     * @param field
     *            the field
     * @param fieldName
     *            the field name
     * @return the virtual key board target
     */
    public VirtualKeyBoardTarget(Object field, String fieldName) {
        this();
        setField(field);
        setFieldName(fieldName);
    }

    /**
     * Sets the field.
     * 
     * @param value
     *            the new field
     */
    public final native void setField(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.field = value;
    }-*/;

    /**
     * Sets the field name.
     * 
     * @param value
     *            the new field name
     */
    public final native void setFieldName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.fieldName = value;
    }-*/;

}
