/************************************************************************
  ConstraintRow.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ConstraintRow.
 */
public class ConstraintRow extends EventDispatcher {

    /**
     * Instantiates a new constraint row.
     */
    public ConstraintRow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the constraint row
     */
    public ConstraintRow() {
        jsObj = Bridge.createObject("mx.containers.utilityClasses.ConstraintRow");
    }

    /**
     * Gets the explicit height.
     * 
     * @return the explicit height
     */
    public final native double getExplicitHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitHeight();
    }-*/;

    /**
     * Sets the explicit height.
     * 
     * @param value the new explicit height
     */
    public final native void setExplicitHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexplicitHeight(value);
    }-*/;

    /**
     * Gets the height.
     * 
     * @return the height
     */
    public final native double getHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Sets the height.
     * 
     * @param value the new height
     */
    public final native void setHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheight(value);
    }-*/;

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public final native String getId()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getid();
    }-*/;

    /**
     * Sets the id.
     * 
     * @param value the new id
     */
    public final native void setId(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setid(value);
    }-*/;

    /**
     * Gets the max height.
     * 
     * @return the max height
     */
    public final native double getMaxHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxHeight();
    }-*/;

    /**
     * Sets the max height.
     * 
     * @param value the new max height
     */
    public final native void setMaxHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxHeight(value);
    }-*/;

    /**
     * Gets the min height.
     * 
     * @return the min height
     */
    public final native double getMinHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminHeight();
    }-*/;

    /**
     * Sets the min height.
     * 
     * @param value the new min height
     */
    public final native void setMinHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminHeight(value);
    }-*/;

    /**
     * Gets the percent height.
     * 
     * @return the percent height
     */
    public final native double getPercentHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpercentHeight();
    }-*/;

    /**
     * Sets the percent height.
     * 
     * @param value the new percent height
     */
    public final native void setPercentHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpercentHeight(value);
    }-*/;

    /**
     * Sets the actual height.
     * 
     * @param value the new actual height
     */
    public final native void setActualHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setActualHeight(value);
    }-*/;

}
