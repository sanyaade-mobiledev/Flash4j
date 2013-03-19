/************************************************************************
 * TreeItem.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.ui.mx;

import java.util.List;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.data.HierarchicalCollectionItem;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.core.utils.ImageLoader;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TreeItem.
 */
public class TreeItem extends ListItem {

    /**
     * Instantiates a new tree item.
     */
    protected TreeItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the tree item
     */
    public TreeItem() {
        jsObj = Bridge.createObject("com.ekambi.data.TreeItem");
    }

    /**
     * New instance.
     * 
     * @param label
     *            the label
     * @return the tree item
     */
    public TreeItem(String label) {
        this();
        setLabel(label);
        setData("");
    }

    /**
     * New instance.
     * 
     * @param label
     *            the label
     * @param data
     *            the data
     * @return the tree item
     */
    public TreeItem(String label, String data) {
        this(label);
        setData(data);
    }

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public native String getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value
     *            the new data
     */
    public native void setData(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    // public void setIsBranch(boolean value) {
    // this._setIsBranch(Boolean.toString(value));
    // }

    /**
     * _set is branch.
     * 
     * @param value
     *            the value
     */
    public native void setIsBranch(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.isBranch = value;
    }-*/;

    /**
     * Sets the icon.
     * 
     * @param iconPath
     *            the new icon
     */
    public void setIcon(String iconPath) {
        this._setIcon(ImageLoader.loadIcon(iconPath));
    }

    /**
     * _set icon.
     * 
     * @param value
     *            the value
     */
    private native void _setIcon(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seticon(value);
    }-*/;

    /**
     * Sets the label.
     * 
     * @param value
     *            the new label
     */
    public native void setLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabel(value);
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
		return peer.getlabel();
    }-*/;

}
