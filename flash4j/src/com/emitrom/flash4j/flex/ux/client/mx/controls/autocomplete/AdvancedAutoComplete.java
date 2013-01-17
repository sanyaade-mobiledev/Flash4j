/************************************************************************
  AdvancedAutoComplete.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.controls.autocomplete;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AdvancedAutoComplete.
 */
public class AdvancedAutoComplete extends AutoComplete {

    /**
     * Instantiates a new advanced auto complete.
     */
    protected AdvancedAutoComplete(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the advanced auto complete
     */
    public AdvancedAutoComplete() {
        jsObj = Bridge.createObject("com.hillelcoren.components.AdvancedAutoComplete");
    }

    /**
     * Sets the actions menu data provider.
     * 
     * @param dataProvider
     *            the new actions menu data provider
     */
    public void setActionsMenuDataProvider(ArrayCollection dataProvider) {
        setActionsMenuDataProvider(dataProvider.toArray().getJsObj());
    }

    /**
     * Sets the actions menu data provider.
     * 
     * @param value
     *            the new actions menu data provider
     */
    private native void setActionsMenuDataProvider(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setactionsMenuDataProvider(value);
    }-*/;

    /**
     * Sets the browse label.
     * 
     * @param value
     *            the new browse label
     */
    public native void setBrowseLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbrowseLabel(value);
    }-*/;

    /**
     * Sets the browser class.
     * 
     * @param value
     *            the new browser class
     */
    public native void setBrowserClass(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbrowserClass(value);
    }-*/;

    /**
     * Gets the browser class.
     * 
     * @param <T>
     *            the generic type
     * @return the browser class
     */
    public native <T extends JavaScriptObject> T getBrowserClass()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbrowserClass();
    }-*/;

    /**
     * Sets the browser fields.
     * 
     * @param values
     *            the new browser fields
     */
    public void setBrowserFields(String... values) {
        ArrayCollection collection = new ArrayCollection();
        for (String s : values) {
            collection.addItem(s);
        }
        setBrowserFields(collection);
    }

    /**
     * Sets the browser fields.
     * 
     * @param value
     *            the new browser fields
     */
    private void setBrowserFields(ArrayCollection value) {
        setBrowserFields(value.toArray().getJsObj());
    }

    /**
     * Sets the browser fields.
     * 
     * @param value
     *            the new browser fields
     */
    private native void setBrowserFields(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbrowserFields(value);
    }-*/;

    /**
     * Sets the removes the label.
     * 
     * @param value
     *            the new removes the label
     */
    public native void setRemoveLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setremoveLabel(value);
    }-*/;

    /**
     * Sets the selection layout.
     * 
     * @param value
     *            the new selection layout
     */
    public native void setSelectionLayout(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectionLayout(value);
    }-*/;

    /**
     * Sets the show browse button.
     * 
     * @param value
     *            the new show browse button
     */
    public native void setShowBrowseButton(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowBrowseButton(value);
    }-*/;

    /**
     * Sets the show order buttons.
     * 
     * @param value
     *            the new show order buttons
     */
    public native void setShowOrderButtons(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowOrderButtons(value);
    }-*/;

    /**
     * Sets the show remove button.
     * 
     * @param value
     *            the new show remove button
     */
    public native void setShowRemoveButton(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowRemoveButton(value);
    }-*/;

    /**
     * Sets the use list builder.
     * 
     * @param value
     *            the new use list builder
     */
    public native void setUseListBuilder(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setuseListBuilder(value);
    }-*/;

    /**
     * Gets the next item.
     * 
     * @param <T>
     *            the generic type
     * @return the next item
     */
    public native <T extends JavaScriptObject> T getNextItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getNextItem();
    }-*/;

    /**
     * Show browser.
     */
    public native void showBrowser()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.showBrowser();
    }-*/;

}
