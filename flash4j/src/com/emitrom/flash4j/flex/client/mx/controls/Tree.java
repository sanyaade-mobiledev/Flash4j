/************************************************************************
  Tree.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls;

import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.factories.ClassFactory;
import com.emitrom.flash4j.flex.client.core.factories.ClassUtil;
import com.emitrom.flash4j.flex.client.core.factories.TreeIconFactory;
import com.emitrom.flash4j.flex.client.mx.controls.treeClasses.TreeItem;
import com.emitrom.flash4j.flex.client.mx.controls.treeClasses.TreeItemLinesRenderer;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Tree.
 */
public class Tree extends List {

    /**
     * Instantiates a new tree.
     */
    protected Tree(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the tree
     */
    public Tree() {
        jsObj = Bridge.createObject("mx.controls.Tree");
        setItemRenderer(new TreeItemLinesRenderer());
        setStyle("lineStyle", "dotted");
        setStyle("disclosureClosedIcon", TreeIconFactory.getInstance().getPlusIcon());
        setStyle("disclosureOpenIcon", TreeIconFactory.getInstance().getMinusIcon());
        setStyle("paddingLeft", "0");
        setStyle("paddingBottom", "0");
        setStyle("lineThickness", "1");
    }

    /**
     * Gets the first visible item.
     * 
     * @param <T>
     *            the generic type
     * @return the first visible item
     */
    public native <T extends JavaScriptObject> T getFirstVisibleItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfirstVisibleItem();
    }-*/;

    /**
     * Sets the first visible item.
     * 
     * @param value
     *            the new first visible item
     */
    public native void setFirstVisibleItem(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfirstVisibleItem(value);
    }-*/;

    /**
     * Checks for root.
     * 
     * @return true, if successful
     */
    public native boolean hasRoot()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasRoot();
    }-*/;

    /**
     * Gets the item icons.
     * 
     * @param <T>
     *            the generic type
     * @return the item icons
     */
    public native <T> T getItemIcons()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getitemIcons();
    }-*/;

    /**
     * Sets the item icons.
     * 
     * @param value
     *            the new item icons
     */
    public native void setItemIcons(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setitemIcons(value);
    }-*/;

    /**
     * Gets the open items.
     * 
     * @param <T>
     *            the generic type
     * @return the open items
     */
    public native <T> T getOpenItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getopenItems();
    }-*/;

    /**
     * Sets the open items.
     * 
     * @param value
     *            the new open items
     */
    public native void setOpenItems(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setopenItems(value);
    }-*/;

    /**
     * Show root.
     * 
     * @return true, if successful
     */
    public native boolean showRoot()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowRoot();
    }-*/;

    /**
     * Sets the show root.
     * 
     * @param value
     *            the new show root
     */
    public native void setShowRoot(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowRoot(value);
    }-*/;

    /**
     * Expand children of.
     * 
     * @param item
     *            the item
     * @param open
     *            the open
     */
    public native void expandChildrenOf(JavaScriptObject item, boolean open)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.expandChildrenOf(item, open);
    }-*/;

    /**
     * Expand item.
     * 
     * @param item
     *            the item
     * @param open
     *            the open
     */
    public native void expandItem(JavaScriptObject item, boolean open)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.expandItem(item, open);
    }-*/;

    /**
     * Expand item.
     * 
     * @param item
     *            the item
     * @param open
     *            the open
     * @param animate
     *            the animate
     */
    public native void expandItem(JavaScriptObject item, boolean open, boolean animate)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.expandItem(item, open, animate);
    }-*/;

    /**
     * Expand item.
     * 
     * @param item
     *            the item
     * @param open
     *            the open
     * @param animate
     *            the animate
     * @param dispatchEvent
     *            the dispatch event
     */
    public native void expandItem(JavaScriptObject item, boolean open, boolean animate, boolean dispatchEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.expandItem(item, open, animate, dispatchEvent);
    }-*/;

    /**
     * Expand item.
     * 
     * @param item
     *            the item
     * @param open
     *            the open
     * @param animate
     *            the animate
     * @param dispatchEvent
     *            the dispatch event
     * @param cause
     *            the cause
     */
    public native void expandItem(JavaScriptObject item, boolean open, boolean animate, boolean dispatchEvent,
                    Event cause)/*-{
		peer
				.expandItem(
						item,
						open,
						animate,
						dispatchEvent,
						cause.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the parent item.
     * 
     * @param <T>
     *            the generic type
     * @param item
     *            the item
     * @return the parent item
     */
    public native <T extends JavaScriptObject> T getParentItem(Object item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getParentItem(item);
    }-*/;

    /**
     * Checks if is item open.
     * 
     * @param item
     *            the item
     * @return true, if is item open
     */
    public native boolean isItemOpen(JavaScriptObject item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isItemOpen(item);
    }-*/;

    /**
     * Sets the item icon.
     * 
     * @param item
     *            the item
     * @param iconID
     *            the icon id
     * @param iconID2
     *            the icon i d2
     */
    public native void setItemIcon(Object item, Object iconID, Object iconID2)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setItemIcon(item, iconID, iconID2);
    }-*/;

    /**
     * Gets the selected item.
     * 
     * @param <T>
     *            the generic type
     * @return the selected item
     */
    public native TreeItem getSelectedItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedItem();
		return @com.emitrom.flash4j.flex.client.mx.controls.treeClasses.TreeItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the item renderer.
     * 
     * @param component
     *            the new item renderer
     */
    public void setItemRenderer(UIComponent component) {
        JavaScriptObject obj = ClassUtil.getInstance().getClass(component.getJsObj());
        ClassFactory f = ClassFactory.create(obj);
        _setItemRenderer(f.asIFactory());
    }

    /**
     * _set item renderer.
     * 
     * @param value
     *            the value
     */
    private native void _setItemRenderer(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setitemRenderer(value);
    }-*/;

}
