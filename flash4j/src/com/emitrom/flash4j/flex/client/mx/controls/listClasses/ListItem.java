/************************************************************************
 * ListItem.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.mx.controls.listClasses;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.flex.client.core.data.HierarchicalCollectionItem;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SimpleListItem.
 */
public class ListItem extends HierarchicalCollectionItem {

    public ListItem() {
        jsObj = JsoHelper.createObject();
    }

    protected ListItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    public ListItem(String label, String data) {
        this();
        setLabel(label);
        setData(data);
    }

    public ListItem(String label) {
        this();
        setLabel(label);
        setData("");
    }

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public String getData() {
        return JsoHelper.getAttribute(jsObj, "data");
    }

    /**
     * Sets the data.
     * 
     * @param value
     *            the new data
     */
    public void setData(String value) {
        JsoHelper.setAttribute(jsObj, "data", value);

    }

}
