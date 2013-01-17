/************************************************************************
  DisplayShelf.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DisplayShelf.
 */
public class DisplayShelf extends UIComponent {

    /**
     * Instantiates a new display shelf.
     */
    protected DisplayShelf(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the display shelf
     */
    public DisplayShelf() {
        jsObj = Bridge.createObject("DisplayShelf");
    }

    /**
     * Enable history.
     * 
     * @param value the value
     */
    public native void enableHistory(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setenableHistory(value);
    }-*/;

    /**
     * Checks if is history enabled.
     * 
     * @return true, if is history enabled
     */
    public native boolean isHistoryEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getenableHistory();
    }-*/;

    /**
     * Gets the popout.
     * 
     * @return the popout
     */
    public native double getPopout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpopout();
    }-*/;

    /**
     * Sets the popout.
     * 
     * @param value the new popout
     */
    public native void setPopout(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpopout(value);
    }-*/;

    /**
     * Gets the selected index.
     * 
     * @return the selected index
     */
    public native int getSelectedIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectedIndex();
    }-*/;

    /**
     * Sets the selected index.
     * 
     * @param value the new selected index
     */
    public native void setSelectedIndex(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectedIndex(value);
    }-*/;

    /**
     * Gets the current position.
     * 
     * @return the current position
     */
    public native double getCurrentPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentPosition();
    }-*/;

    /**
     * Sets the current position.
     * 
     * @param value the new current position
     */
    public native void setCurrentPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcurrentPosition(value);
    }-*/;

    /**
     * Sets the data provider.
     * 
     * @param dataProvider the new data provider
     */
    public void setDataProvider(ArrayCollection dataProvider) {
        _setDataProvider(dataProvider.toArray().getJsObj());
    }

    /**
     * Sets the data provider.
     * 
     * @param value the new data provider
     */
    private native void _setDataProvider(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Gets the data provider.
     * 
     * @param <T> the generic type
     * @return the data provider
     */
    public native ArrayCollection getDataProvider()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdataProvider();
		return @com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the angle.
     * 
     * @return the angle
     */
    public native double getAngle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getangle();
    }-*/;

    /**
     * Sets the angle.
     * 
     * @param value the new angle
     */
    public native void setAngle(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setangle(value);
    }-*/;

    /**
     * Select on click.
     * 
     * @return true, if successful
     */
    public native boolean selectOnClick()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectOnClick();
    }-*/;

    /**
     * Sets the select on click.
     * 
     * @param value the new select on click
     */
    public native void setSelectOnClick(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setselectOnClick(value);
    }-*/;

}
