/************************************************************************
  Panel.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.spark;

import java.util.List;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Panel.
 */
public class Panel extends SkinnableContainer {

    /**
     * Instantiates a new panel.
     */
    Panel(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the panel
     */
    public Panel() {
        jsObj = Bridge.createObject("spark.components.Panel");
    }

    /**
     * New instance.
     * 
     * @param title the title
     * @return the panel
     */
    public Panel(String title) {
        this();
        setTitle(title);
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public native void setTitle(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settitle(value);
    }-*/;

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public native String getTitle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettitle();
    }-*/;

    /**
     * Gets the control bar layout.
     * 
     * @return the control bar layout
     */
    public native LayoutBase getControlBarLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcontrolBarLayout();
		return @com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the control bar layout.
     * 
     * @param value the new control bar layout
     */
    public native void setControlBarLayout(LayoutBase value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setcontrolBarLayout(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the control bar content.
     * 
     * @param value the new control bar content
     */
    public void setControlBarContent(List<UIComponent> value) {
        setControlBarContent(DataConverter.fromList(value));
    }

    /**
     * Sets the control bar content.
     * 
     * @param collection the new control bar content
     */
    private void setControlBarContent(ArrayCollection collection) {
        _setControlBarContent(collection.toArray().getJsObj());
    }

    /**
     * Sets the control bar content.
     * 
     * @param value the new control bar content
     */
    private native void _setControlBarContent(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcontrolBarContent(value);
    }-*/;

    /**
     * Control bar visible.
     * 
     * @return true, if successful
     */
    public native boolean controlBarVisible()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontrolBarVisible();
    }-*/;

    /**
     * Sets the control bar visible.
     * 
     * @param value the new control bar visible
     */
    public native void setControlBarVisible(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcontrolBarVisible(value);
    }-*/;

}
