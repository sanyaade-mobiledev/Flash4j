/************************************************************************
  PopUpMenuButtonBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.baseClasses;

import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.ui.mx.PopUpButton;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PopUpMenuButtonBase.
 */
public class PopUpMenuButtonBase extends PopUpButton {

    /**
     * Instantiates a new pop up menu button base.
     */
    protected PopUpMenuButtonBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected PopUpMenuButtonBase() {
        super();
    }

    /**
     * Sets the data provider.
     * 
     * @param value
     *            the new data provider
     */
    public void setDataProvider(ArrayCollection value) {
        _setDataProvider(value.toArray().getJsObj());
    }

    private native void _setDataProvider(Object value)/*-{
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
     * @param value
     *            the new icon field
     */
    public native void setIconField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seticonField(value);
    }-*/;

    // TODO
    // iconFunction
    // labelFunction

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
     * @param value
     *            the new show root
     */
    public native void setShowRoot(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowRoot(value);
    }-*/;

}
