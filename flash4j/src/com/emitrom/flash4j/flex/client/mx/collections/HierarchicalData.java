/************************************************************************
  HierarchicalData.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.collections;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class HierarchicalData.
 */
public class HierarchicalData extends EventDispatcher implements IList {

    public HierarchicalData() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Instantiates a new hierarchical data.
     */
    protected HierarchicalData(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the children field.
     * 
     * @return the children field
     */
    public final native String getChildrenField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getchildrenField();
    }-*/;

    /**
     * Sets the children field.
     * 
     * @param value the new children field
     */
    public final native void setChildrenField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setchildrenField(value);
    }-*/;

    /**
     * Gets the source.
     * 
     * @param <T> the generic type
     * @return the source
     */
    public final native <T extends JavaScriptObject> T getSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsource();
    }-*/;

    /**
     * Sets the source.
     * 
     * @param collection the new source
     */
    public final void setSource(ArrayCollection collection) {
        _setSource(collection.toArray().getJsObj());
    }

    /**
     * Sets the source.
     * 
     * @param value the new source
     */
    private final native void _setSource(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsource(value);
    }-*/;

    /**
     * Can have children.
     * 
     * @param node the node
     * @return true, if successful
     */
    public final native boolean canHaveChildren(Object node)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.canHaveChildren(node);
    }-*/;

    /**
     * Gets the children.
     * 
     * @param <T> the generic type
     * @param value the value
     * @return the children
     */
    public final native <T> T getChildren(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getChildren(value);
    }-*/;

    /**
     * Gets the data.
     * 
     * @param <T> the generic type
     * @param node the node
     * @return the data
     */
    public final native <T> T getData(Object node)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getData(node);
    }-*/;

    /**
     * Gets the root.
     * 
     * @param <T> the generic type
     * @return the root
     */
    public final native <T extends JavaScriptObject> T getRoot()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getRoot();
    }-*/;

    /**
     * Checks for children.
     * 
     * @param node the node
     * @return true, if successful
     */
    public final native boolean hasChildren(Object node)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.hasChildren(node);
    }-*/;

    /**
     * As i list.
     * 
     * @return the i list
     */
    public final JavaScriptObject asIList() {
        return jsObj.cast();
    }

}
