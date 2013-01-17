/************************************************************************
  ScrollableArrowMenu.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls;

import java.util.List;

import com.emitrom.flash4j.core.client.display.DisplayObjectContainer;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.data.HierarchicalCollectionItem;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.ScrollPolicy;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ScrollableArrowMenu.
 */
public class ScrollableArrowMenu extends ScrollableMenu {

    private static ScrollableArrowMenu INSTANCE = new ScrollableArrowMenu();

    /**
     * Instantiates a new scrollable arrow menu.
     */
    protected ScrollableArrowMenu(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the scrollable arrow menu
     */
    public ScrollableArrowMenu() {
        jsObj = Bridge.createObject("flexlib.controls.ScrollableArrowMenu");
    }

    /**
     * Gets the arrow scroll policy.
     * 
     * @return the arrow scroll policy
     */
    public ScrollPolicy getArrowScrollPolicy() {
        return ScrollPolicy.fromValue(_getArrowScrollPolicy());
    }

    /**
     * _get arrow scroll policy.
     * 
     * @return the string
     */
    private native String _getArrowScrollPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getarrowScrollPolicy();
    }-*/;

    /**
     * Sets the arrow scroll policy.
     * 
     * @param policy
     *            the new arrow scroll policy
     */
    public void setArrowScrollPolicy(ScrollPolicy policy) {
        _setArrowScrollPolicy(policy.value);
    }

    /**
     * _set arrow scroll policy.
     * 
     * @param value
     *            the value
     */
    private native void _setArrowScrollPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setarrowScrollPolicy(value);
    }-*/;

    /**
     * Gets the scroll jump.
     * 
     * @return the scroll jump
     */
    public native int getScrollJump()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscrollJump();
    }-*/;

    /**
     * Sets the scroll jump.
     * 
     * @param value
     *            the new scroll jump
     */
    public native void setScrollJump(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscrollJump(value);
    }-*/;

    /**
     * Gets the scroll speed.
     * 
     * @return the scroll speed
     */
    public native int getScrollSpeed()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscrollSpeed();
    }-*/;

    /**
     * Sets the scroll speed.
     * 
     * @param value
     *            the new scroll speed
     */
    public native void setScrollSpeed(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscrollSpeed(value);
    }-*/;

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param dataProvider
     *            the data provider
     * @return the scrollable arrow menu
     */
    public static ScrollableArrowMenu createMenu(DisplayObjectContainer parent,
                    List<HierarchicalCollectionItem> dataProvider) {
        return INSTANCE._createMenu(parent, DataConverter.fromList(dataProvider).toArray().getJsObj());
    }

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param collection
     *            the collection
     * @return the scrollable arrow menu
     */
    private static ScrollableArrowMenu createMenu(DisplayObjectContainer parent, ArrayCollection collection) {
        return INSTANCE._createMenu(parent, collection.toArray().getJsObj());
    }

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param dataProvider
     *            the data provider
     * @param showRoot
     *            the show root
     * @return the scrollable arrow menu
     */
    public static ScrollableArrowMenu createMenu(DisplayObjectContainer parent,
                    List<HierarchicalCollectionItem> dataProvider, boolean showRoot) {
        return INSTANCE._createMenu(parent, DataConverter.fromList(dataProvider).toArray().getJsObj(), showRoot);
    }

    /**
     * Creates the menu.
     * 
     * @param parent
     *            the parent
     * @param collection
     *            the collection
     * @param showRoot
     *            the show root
     * @return the scrollable arrow menu
     */
    private static ScrollableArrowMenu createMenu(DisplayObjectContainer parent, ArrayCollection collection,
                    boolean showRoot) {
        return INSTANCE._createMenu(parent, collection.toArray(), showRoot);
    }

    /**
     * _create menu.
     * 
     * @param parent
     *            the parent
     * @param mdp
     *            the mdp
     * @param showRoot
     *            the show root
     * @return the scrollable arrow menu
     */
    private native ScrollableArrowMenu _createMenu(DisplayObjectContainer parent, JavaScriptObject mdp, boolean showRoot)/*-{
		return peer.createMenu(parent, mdp, showRoot);
    }-*/;

    private native ScrollableArrowMenu _createMenu(DisplayObjectContainer parent, Object mdp)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.createMenu(
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						mdp);
		return this;
    }-*/;

    private native ScrollableArrowMenu _createMenu(DisplayObjectContainer parent, Object mdp, boolean showRoot)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.createMenu(
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						mdp, showRoot);
		return this;
    }-*/;

}
