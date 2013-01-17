/************************************************************************
  TreeIconFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.core.factories;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating TreeIcon objects.
 */
public class TreeIconFactory extends ProxyObject {

    private static final TreeIconFactory INSTANCE = new TreeIconFactory(
                    Bridge.createObject("com.ekambi.gwt.flex.icons.TreeIconFactory"));

    /**
     * Instantiates a new tree icon factory.
     */
    TreeIconFactory(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the single instance of TreeIconFactory.
     * 
     * @return single instance of TreeIconFactory
     */
    public static TreeIconFactory getInstance() {
        return INSTANCE;
    }

    /**
     * Gets the minus icon.
     * 
     * @param <T>
     *            the generic type
     * @return the minus icon
     */
    public final native Object getMinusIcon()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMinusIcon();
    }-*/;

    /**
     * Gets the plus icon.
     * 
     * @param <T>
     *            the generic type
     * @return the plus icon
     */
    public final native Object getPlusIcon()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getPlusIcon();
    }-*/;

    /**
     * Gets the tree icon.
     * 
     * @param <T>
     *            the generic type
     * @return the tree icon
     */
    public final native Object getTreeIcon()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getTreeIcon();
    }-*/;

}
