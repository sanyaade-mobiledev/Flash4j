/************************************************************************
 * SearchBox.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.ui.mx.Button;
import com.emitrom.flash4j.flex.client.ui.mx.HBox;
import com.emitrom.flash4j.flex.client.ui.mx.Label;
import com.emitrom.flash4j.flex.client.ui.mx.TextInput;
import com.emitrom.flash4j.flex.ux.client.mx.containers.mdatagrid.core.ISearchable;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SearchBox.
 */
public class SearchBox extends HBox {

    /**
     * Instantiates a new search box.
     */
    protected SearchBox(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the search box
     */
    public SearchBox() {
        jsObj = Bridge.createObject("SearchBox");
    }

    public SearchBox(ISearchable target) {
        this();
        setTarget(target);
    }

    /**
     * Sets the target.
     * 
     * @param value
     *            the new target
     */
    public void setTarget(ISearchable value) {
        this.setTarget(value.asISearchable());
    }

    /**
     * Sets the target.
     * 
     * @param value
     *            the new target
     */
    private native void setTarget(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settarget(value);
    }-*/;

    /**
     * Gets the search label.
     * 
     * @return the search label
     */
    public native Label getSearchLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = this.getsearchLabel();
		return @com.emitrom.flash4j.flex.client.ui.mx.Label::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the search input.
     * 
     * @return the search input
     */
    public native TextInput getSearchInput()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getsearchInput();
		return @com.emitrom.flash4j.flex.client.ui.mx.TextInput::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the previous button.
     * 
     * @return the previous button
     */
    public final native Button getPreviousButton()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getpreviousButton();
		return @com.emitrom.flash4j.flex.client.ui.mx.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the next button.
     * 
     * @return the next button
     */
    public final native Button getNextButton()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getnextButton();
		return @com.emitrom.flash4j.flex.client.ui.mx.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
