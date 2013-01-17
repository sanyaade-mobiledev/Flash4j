/************************************************************************
  ArrayCollection.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ArrayCollection.
 */
public class ArrayCollection extends ListCollectionView {

    /**
     * Instantiates a new array collection.
     */
    ArrayCollection(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the array collection
     */
    public ArrayCollection() {
        jsObj = Bridge.createObject("mx.collections.ArrayCollection");
    }

    /**
     * Sets the source.
     * 
     * @param src
     *            the new source
     */
    public final native void setSource(As3Array src)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setsource(src.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds the item.
     * 
     * @param item
     *            the item
     */
    public final ArrayCollection addItem(ProxyObject item) {
        return this.addItem(item.getJsObj());
    }

    /**
     * Adds the item at.
     * 
     * @param item
     *            the item
     * @param index
     *            the index
     */
    public final void addItemAt(ProxyObject item, int index) {
        this.addItemAt(item.getJsObj(), index);
    }

}
