/************************************************************************
  MenuEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.flex.client.mx.controls.Menu;
import com.emitrom.flash4j.flex.client.mx.controls.MenuBar;
import com.emitrom.flash4j.flex.client.mx.controls.menuClasses.MenuItem;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class MenuEvent.
 */
public class MenuEvent extends ListEvent {

    /** The Constant CHANGE. */
    public static final String CHANGE = "change";

    /** The Constant ITEM_CLICK. */
    public static final String ITEM_CLICK = "itemClick";

    /** The Constant ITEM_ROLL_OUT. */
    public static final String ITEM_ROLL_OUT = "itemRollOut";

    /** The Constant ITEM_ROLL_OVER. */
    public static final String ITEM_ROLL_OVER = "itemRollOver";

    /** The Constant MENU_HIDE. */
    public static final String MENU_HIDE = "menuHide";

    /** The Constant MENU_SHOW. */
    public static final String MENU_SHOW = "menuShow";

    /**
     * Instantiates a new menu event.
     */
    protected MenuEvent(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public final native int getIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getIndex();
    }-*/;

    /**
     * Gets the item.
     * 
     * @param <T>
     *            the generic type
     * @return the item
     */
    public final native MenuItem getItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getitem();
		return @com.emitrom.flash4j.flex.client.mx.controls.menuClasses.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public final native String getLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabel();
    }-*/;

    /**
     * Gets the menu.
     * 
     * @return the menu
     */
    public final native Menu getMenu()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getmenu();
		return @com.emitrom.flash4j.flex.client.mx.controls.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the menu bar.
     * 
     * @return the menu bar
     */
    public final native MenuBar getMenuBar()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getmenuBar();
		return @com.emitrom.flash4j.flex.client.mx.controls.MenuBar::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static MenuEvent cast(Event event) {
        return new MenuEvent(event.getJsObj());
    }

}
