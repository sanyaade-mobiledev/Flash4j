/************************************************************************
  PopUpMenuButton.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PopUpMenuButton.
 */
public class PopUpMenuButton extends PopUpButton {

    /**
     * Instantiates a new pop up menu button.
     */
    protected PopUpMenuButton(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the pop up menu button
     */
    public PopUpMenuButton() {
        jsObj = Bridge.createObject("mx.controls.PopUpMenuButton");
    }

    public void setDataProvider(ArrayCollection dataProvider) {
        setDataProvider(dataProvider.toArray().getJsObj());
    }

    /**
     * Sets the data provider.
     * 
     * @param value the new data provider
     */
    public native void setDataProvider(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Gets the icon field.
     * 
     * @return the icon field
     */
    public native String getIconField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geticonField();
    }-*/;

    /**
     * Sets the icon field.
     * 
     * @param value the new icon field
     */
    public native void setIconField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seticonField(value);
    }-*/;

    /**
     * Gets the label field.
     * 
     * @return the label field
     */
    public native String getLabelField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabelField();
    }-*/;

    /**
     * Sets the label field.
     * 
     * @param value the new label field
     */
    public native void setLabelField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabelField(value);
    }-*/;

    /**
     * Show root.
     * 
     * @return true, if successful
     */
    public native boolean showRoot()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowRoot();
    }-*/;

    /**
     * Sets the show root.
     * 
     * @param value the new show root
     */
    public native void setShowRoot(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowRoot(value);
    }-*/;

}
