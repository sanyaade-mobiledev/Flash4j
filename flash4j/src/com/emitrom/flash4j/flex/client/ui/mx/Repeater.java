/************************************************************************
 * Repeater.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.IContainer;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Repeater class is the runtime object that corresponds to the
 * <mx:Repeater> tag. It creates multiple instances of its subcomponents based
 * on its dataProvider. The repeated components can be any standard or custom
 * controls or containers. You can use the Repeater anywhere a control or
 * container tag is allowed, with the exception of the
 * com.emitrom.flash4j.flex.client.spark.coreApplication container tag.
 * <p>
 * You cannot use the Repeater for objects that do not extend the UIComponent
 * class.
 */
public class Repeater extends UIComponent {

    /**
     * Instantiates a new repeater.
     */
    Repeater(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the repeater
     */
    public Repeater() {
        jsObj = Bridge.createObject("mx.core.Repeater");
    }

    /**
     * Gets the container.
     * 
     * @return the container
     */
    public native Container getContainer()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcontainer();
		return @com.emitrom.flash4j.flex.client.ui.mx.Container::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the count.
     * 
     * @return the count
     */
    public native int getCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcount();
    }-*/;

    /**
     * Sets the count.
     * 
     * @param value
     *            the new count
     */
    public native void setCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcount(value);
    }-*/;

    /**
     * Gets the current index.
     * 
     * @return the current index
     */
    public native int getCurrentIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentIndex();
    }-*/;

    /**
     * Gets the current item.
     * 
     * @param <T>
     *            the generic type
     * @return the current item
     */
    public native <T> T getCurrentItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentItem();
    }-*/;

    /**
     * Gets the data provider.
     * 
     * @param <T>
     *            the generic type
     * @return the data provider
     */
    public native <T> T getDataProvider()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataProvider();
    }-*/;

    /**
     * Sets the data provider.
     * 
     * @param value
     *            the new data provider
     */
    public native void setDataProvider(ProxyObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setdataProvider(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Recycle children.
     * 
     * @return true, if successful
     */
    public native boolean recycleChildren()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrecycleChildren();
    }-*/;

    /**
     * Recycle children.
     * 
     * @param value
     *            the value
     */
    public native void recycleChildren(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrecycleChildren(value);
    }-*/;

    /**
     * Gets the start index.
     * 
     * @return the start index
     */
    public native int getStartIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartIndex();
    }-*/;

    /**
     * Sets the start index.
     * 
     * @param value
     *            the new start index
     */
    public native void setStartIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartIndex(value);
    }-*/;

    /**
     * Execute child bindings.
     */
    public native void executeChildBindings()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.executeChildBindings();
    }-*/;

    /**
     * Initalize repeater.
     * 
     * @param container
     *            the container
     * @param recurse
     *            the recurse
     */
    public native void initalizeRepeater(IContainer container, boolean recurse)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.initalizeRepeater(
						container.@com.emitrom.flash4j.flex.client.mx.core.IContainer::asIContainer()(),
						recurse);
    }-*/;

}
