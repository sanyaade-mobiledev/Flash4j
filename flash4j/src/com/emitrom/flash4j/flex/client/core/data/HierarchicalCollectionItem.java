/************************************************************************
 * HierarchicalCollectionItem.java is part of Flash4j 3.0.0 Copyright 2012
 * Emitrom LLC
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
package com.emitrom.flash4j.flex.client.core.data;

import java.util.Arrays;
import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class HierarchicalCollectionItem.
 */
public class HierarchicalCollectionItem extends ProxyObject {

    /**
     * Instantiates a new hierarchical collection item.
     */
    protected HierarchicalCollectionItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the hierarchical collection item
     */
    protected HierarchicalCollectionItem() {
        jsObj = Bridge.createObject("com.ekambi.data.HierarchicalCollectionItem");
    }

    /**
     * New instance.
     * 
     * @param label
     *            the label
     * @return the hierarchical collection item
     */
    public HierarchicalCollectionItem(String label) {
        this();
        setLabel(label);
    }

    /**
     * Sets the label.
     * 
     * @param value
     *            the new label
     */
    public native void setLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		if (peer.setlabel) {
			peer.setlabel(value);
		} else {
			peer.label = value;
		}
    }-*/;

    /**
     * Adds the children.
     * 
     * @param children
     *            the children
     */
    public void addChildren(List<? extends HierarchicalCollectionItem> children) {
        this.addChildren(DataConverter.fromList(children));
    }

    public void addChildren(HierarchicalCollectionItem... children) {
        this.addChildren(DataConverter.fromList(Arrays.asList(children)));
    }

    /**
     * Adds the children.
     * 
     * @param children
     *            the children
     */
    private void addChildren(ArrayCollection children) {
        this._addChild(children.toArray().getJsObj());
    }

    /**
     * Adds the child.
     * 
     * @param child
     *            the child
     */
    public void addChild(HierarchicalCollectionItem child) {
        this._addChild(child.getJsObj());
    }

    /**
     * _add child.
     * 
     * @param child
     *            the child
     */
    private native void _addChild(JavaScriptObject child)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setchildren(child);
    }-*/;

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public native String getLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		if (peer.getlabel) {
			return peer.getlabel();
		}
		return peer.label;
    }-*/;

}
