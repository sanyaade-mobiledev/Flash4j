/************************************************************************
 * AutoComplete.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.controls.autocomplete;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.framework.ClassUtil;
import com.emitrom.flash4j.flex.client.core.factories.ClassFactory;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.ui.mx.BaseListData;
import com.emitrom.flash4j.flex.client.ui.mx.Button;
import com.emitrom.flash4j.flex.client.ui.mx.Grid;
import com.emitrom.flash4j.flex.client.ui.mx.List;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AutoComplete.
 */
public class AutoComplete extends Grid {

    /** The Constant BACKSPACE_FOCUS. */
    public static String BACKSPACE_FOCUS = "focus";

    /** The Constant BACKSPACE_REMOVE. */
    public static String BACKSPACE_REMOVE = "remove";

    /** The Constant LAYOUT_HORIZONTAL. */
    public static String LAYOUT_HORIZONTAL = "horizontal";

    /** The Constant LAYOUT_VERTICAL. */
    public static String LAYOUT_VERTICAL = "vertical";

    /** The Constant MATCH_ANY_PART. */
    public static String MATCH_ANY_PART = "anyPart";

    /** The Constant MATCH_BEGINNING. */
    public static String MATCH_BEGINNING = "beginning";

    /** The Constant MATCH_WORD. */
    public static String MATCH_WORD = "word";

    /** The Constant SEARCH_CHANGE. */
    public static String SEARCH_CHANGE = "searchChange";

    /** The Constant STYLE_FACEBOOK. */
    public static String STYLE_FACEBOOK = "facebook";

    /** The Constant STYLE_MAC_MAIL. */
    public static String STYLE_MAC_MAIL = "macMail";

    /** The Constant STYLE_UNDERLINE. */
    public static String STYLE_UNDERLINE = "underline";

    /**
     * Instantiates a new auto complete.
     */
    protected AutoComplete(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the auto complete
     */
    public AutoComplete() {
        jsObj = Bridge.createObject("com.hillelcoren.components.AutoComplete");
    }

    /**
     * Sets the allow duplicates.
     * 
     * @param value
     *            the new allow duplicates
     */
    public native void setAllowDuplicates(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowDuplicates(value);
    }-*/;

    /**
     * Sets the allow editing new values.
     * 
     * @param value
     *            the new allow editing new values
     */
    public native void setAllowEditingNewValues(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowEditingNewValues(value);
    }-*/;

    /**
     * Sets the allow multiple selection.
     * 
     * @param value
     *            the new allow multiple selection
     */
    public native void setAllowMultipleSelection(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowMultipleSelection(value);
    }-*/;

    /**
     * Sets the allow new values.
     * 
     * @param value
     *            the new allow new values
     */
    public native void setAllowNewValues(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowNewValues(value);
    }-*/;

    /**
     * Sets the auto select enabled.
     * 
     * @param value
     *            the new auto select enabled
     */
    public native void setAutoSelectEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoSelectEnabled(value);
    }-*/;

    /**
     * Sets the backspace action.
     * 
     * @param value
     *            the new backspace action
     */
    public native void setBackspaceAction(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbackspaceAction(value);
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value
     *            the new data
     */
    public native void setData(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    /**
     * Gets the data provider.
     * 
     * @return the data provider
     */
    public native ArrayCollection getDataProvider()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdataProvider();
		return @com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the data provider.
     * 
     * @param dataProvider
     *            the new data provider
     */
    public native void setDataProvider(ArrayCollection dataProvider)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setdataProvider(dataProvider.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the drop down.
     * 
     * @return the drop down
     */
    public native List getDropDown()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdropDown();
		return @com.emitrom.flash4j.flex.client.ui.mx.List::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the drop down item renderer.
     * 
     * @param component
     *            the new drop down item renderer
     */
    public void setDropDownItemRenderer(UIComponent component) {
        JavaScriptObject obj = ClassUtil.getInstance().getClass(component.getJsObj());
        ClassFactory f = ClassFactory.create(obj);
        _setDropDownItemRenderer(f.asIFactory());
    }

    /**
     * _set drop down item renderer.
     * 
     * @param value
     *            the value
     */
    private native void _setDropDownItemRenderer(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdropDownItemRenderer(value);
    }-*/;

    /**
     * Gets the drop down row count.
     * 
     * @return the drop down row count
     */
    public native int getDropDownRowCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdropDownRowCount();
    }-*/;

    /**
     * Gets the drop down width.
     * 
     * @return the drop down width
     */
    public native int getDropDownWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdropDownWidth();
    }-*/;

    /**
     * Sets the enable clear icon.
     * 
     * @param value
     *            the new enable clear icon
     */
    public native void setEnableClearIcon(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setenableClearIcon(value);
    }-*/;

    /**
     * Gets the inline button.
     * 
     * @return the inline button
     */
    public native Button getInlineButton()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getinlineButton();
		return @com.emitrom.flash4j.flex.client.ui.mx.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the inline button.
     * 
     * @param value
     *            the new inline button
     */
    public native void setInlineButton(Button value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setinlineButton(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the key field.
     * 
     * @param value
     *            the new key field
     */
    public native void setKeyField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setkeyField(value);
    }-*/;

    /**
     * Sets the label field.
     * 
     * @param value
     *            the new label field
     */
    public native void setLabelField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelField(value);
    }-*/;

    /**
     * Sets the list data.
     * 
     * @param value
     *            the new list data
     */
    public native void setListData(BaseListData value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setlistData(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the match type.
     * 
     * @return the match type
     */
    public native String getMatchType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMatchType();
    }-*/;

    /**
     * Sets the match type.
     * 
     * @param value
     *            the new match type
     */
    public native void setMatchType(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmatchType(value);
    }-*/;

    /**
     * Sets the prompt.
     * 
     * @param value
     *            the new prompt
     */
    public native void setPrompt(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprompt(value);
    }-*/;

    /**
     * Gets the search text.
     * 
     * @return the search text
     */
    public native String getSearchText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsearchText();
    }-*/;

    /**
     * Sets the search text.
     * 
     * @param value
     *            the new search text
     */
    public native void setSearchText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsearchText(value);
    }-*/;

    /**
     * Gets the selected item.
     * 
     * @param <T>
     *            the generic type
     * @return the selected item
     */
    public native <T extends JavaScriptObject> T getSelectedItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedItem();
    }-*/;

    /**
     * Sets the selected item.
     * 
     * @param value
     *            the new selected item
     */
    public native void setSelectedItem(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedItem(value);
    }-*/;

    /**
     * Sets the selected item id.
     * 
     * @param vaue
     *            the new selected item id
     */
    public native void setSelectedItemId(double vaue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedItemId(vaue);
    }-*/;

    /**
     * Gets the selected items.
     * 
     * @return the selected items
     */
    public native ArrayCollection getSelectedItems()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getselectedItems();
		return @com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the show remove icon.
     * 
     * @param value
     *            the new show remove icon
     */
    public native void setShowRemoveIcon(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowRemoveIcon(value);
    }-*/;

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public native String getText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettext();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param value
     *            the new text
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

    /**
     * Gets the text input.
     * 
     * @return the text input
     */
    public native PromptTextInput getTextInput()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettextInput();
		return @com.emitrom.flash4j.flex.ux.client.mx.controls.autocomplete.PromptTextInput::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Adds the item.
     * 
     * @param value
     *            the value
     */
    public native void addItem(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addItem(value);
    }-*/;

    /**
     * Adds the item.
     * 
     * @param value
     *            the value
     */
    public native void addItem(ProxyObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addItem(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Filter data.
     */
    public native void filterData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.filterData();
    }-*/;

    /**
     * Handle change.
     * 
     * @param event
     *            the event
     */
    public native void handleChange(Event event)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.handleChange(event.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Hide drop down.
     */
    public native void hideDropDown()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.hideDropDown();
    }-*/;

    /**
     * Checks if is item selected.
     * 
     * @param item
     *            the item
     * @return true, if is item selected
     */
    public native boolean isItemSelected(ProxyObject item)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.isItemSelected(item.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Checks if is setting value.
     * 
     * @return true, if is setting value
     */
    public native boolean isSettingValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isSettingValue();
    }-*/;

    /**
     * Position drop down.
     */
    public native void positionDropDown()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.positionDropDown();
    }-*/;

    /**
     * Removes the all.
     */
    public native void removeAll()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeAll();
    }-*/;

    /**
     * Search.
     */
    public native void search()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.search();
    }-*/;

    /**
     * Show drop down.
     */
    public native void showDropDown()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.showDropDown();
    }-*/;

}
