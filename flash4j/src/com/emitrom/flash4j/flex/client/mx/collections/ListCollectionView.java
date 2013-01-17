/************************************************************************
 * ListCollectionView.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.mx.collections;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The ListCollectionView class adds the properties and methods of the
 * ICollectionView interface to an object that conforms to the IList interface.
 * As a result, you can pass an object of peer class to anything that requires
 * an IList or ICollectionView. peer class also lets you use [ ] array notation
 * to access the getItemAt() and setItemAt() methods. If you use code such as
 * myListCollectionView[index] Flex calls the myListCollectionView object's
 * getItemAt() or setItemAt() method.
 */
public class ListCollectionView extends EventDispatcher implements IList, ICollectionView {

    /**
     * Instantiates a new list collection view.
     */
    ListCollectionView(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the list collection view
     */
    protected ListCollectionView() {
        jsObj = Bridge.createObject("mx.collections.ListCollectionView");
    }

    /**
     * Gets the length.
     * 
     * @return the length
     */
    public final native int getLength()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * Gets the sort.
     * 
     * @return the sort
     */
    public final native Sort getSort()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsort();
		return @com.emitrom.flash4j.flex.client.mx.collections.Sort::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the sort.
     * 
     * @param value
     *            the new sort
     */
    public final native void setSort(Sort value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setsort(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds the all.
     * 
     * @param list
     *            the list
     */
    public final native void addAll(IList list)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addAll(list.@com.emitrom.flash4j.flex.client.mx.collections.IList::asIList()());
    }-*/;

    /**
     * Adds the all at.
     * 
     * @param list
     *            the list
     * @param index
     *            the index
     */
    public final native void addAllAt(IList list, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addAllAt(
						list.@com.emitrom.flash4j.flex.client.mx.collections.IList::asIList()(),
						index);
    }-*/;

    /**
     * Adds the item.
     * 
     * @param value
     *            the value
     */
    public final native ArrayCollection addItem(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		//		try {
		//			alert(value);
		peer.addItem(value);
		//		} catch (e) {
		//			alert("Message : " + e.message);
		//		}
		return this;
    }-*/;

    /**
     * Adds the item at.
     * 
     * @param value
     *            the value
     * @param index
     *            the index
     */
    public final native void addItemAt(Object value, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addItemAt(value, index);
    }-*/;

    /**
     * Contains.
     * 
     * @param value
     *            the value
     * @return true, if successful
     */
    public final native boolean contains(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.contains(value);
    }-*/;

    /**
     * Disable auto update.
     */
    public final native void disableAutoUpdate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.disableAutoUpdate();
    }-*/;

    /**
     * Gets the item at.
     * 
     * @param <T>
     *            the generic type
     * @param index
     *            the index
     * @return the item at
     */
    public final native <T> T getItemAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getItemAt(index);
    }-*/;

    /**
     * Gets the item at.
     * 
     * @param <T>
     *            the generic type
     * @param index
     *            the index
     * @param prefetch
     *            the prefetch
     * @return the item at
     */
    public final native <T> T getItemAt(int index, int prefetch)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getItemAt(index, prefetch);
    }-*/;

    /**
     * Gets the item index.
     * 
     * @param value
     *            the value
     * @return the item index
     */
    public final native int getItemIndex(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getItemIndex(value);
    }-*/;

    /**
     * Item updated.
     * 
     * @param item
     *            the item
     */
    public final native void itemUpdated(Object item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.itemUpdated(item);
    }-*/;

    /**
     * Item updated.
     * 
     * @param item
     *            the item
     * @param property
     *            the property
     */
    public final native void itemUpdated(Object item, Object property)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.itemUpdated(item, property);
    }-*/;

    /**
     * Item updated.
     * 
     * @param item
     *            the item
     * @param property
     *            the property
     * @param oldValue
     *            the old value
     */
    public final native void itemUpdated(Object item, Object property, Object oldValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.itemUpdated(item, property, oldValue);
    }-*/;

    /**
     * Item updated.
     * 
     * @param item
     *            the item
     * @param property
     *            the property
     * @param oldValue
     *            the old value
     * @param newValue
     *            the new value
     */
    public final native void itemUpdated(Object item, Object property, Object oldValue, Object newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.itemUpdated(item, property, oldValue, newValue);
    }-*/;

    /**
     * Refresh.
     * 
     * @return true, if successful
     */
    public final native boolean refresh()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.refresh();
    }-*/;

    /**
     * Removes the all.
     */
    public final native void removeAll()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeAll();
    }-*/;

    /**
     * Removes the item at.
     * 
     * @param <T>
     *            the generic type
     * @param index
     *            the index
     * @return the t
     */
    public final native <T> T removeItemAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.removeItemAt(index);
    }-*/;

    /**
     * Sets the item at.
     * 
     * @param <T>
     *            the generic type
     * @param item
     *            the item
     * @param index
     *            the index
     * @return the t
     */
    public final native <T> T setItemAt(Object item, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setItemAt(item, index);
    }-*/;

    /**
     * To array.
     * 
     * @return the as3 array
     */
    public final native As3Array toArray()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.toArray();
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * As i list.
     * 
     * @return the i list
     */
    public JavaScriptObject asIList() {
        return jsObj.cast();
    }

    /**
     * As i collection view.
     * 
     * @return the i collection view
     */
    public final JavaScriptObject asICollectionView() {
        return jsObj.cast();
    }

}
