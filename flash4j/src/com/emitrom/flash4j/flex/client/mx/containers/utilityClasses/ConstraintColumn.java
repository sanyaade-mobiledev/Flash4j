/************************************************************************
  ConstraintColumn.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.containers.utilityClasses;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ConstraintColumn.
 */
public class ConstraintColumn extends EventDispatcher {

    /**
     * Instantiates a new constraint column.
     */
    public ConstraintColumn(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the constraint column
     */
    public ConstraintColumn() {
        jsObj = Bridge.createObject("mx.containers.utilityClasses.ConstraintColumn");
    }

    /**
     * Gets the explicit width.
     * 
     * @return the explicit width
     */
    public final native double getExplicitWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitWidth();
    }-*/;

    /**
     * Sets the explicit width.
     * 
     * @param value the new explicit width
     */
    public final native void setExplicitWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexplicitWidth(value);
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
     * Gets the max width.
     * 
     * @return the max width
     */
    public final native double getMaxWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxWidth();
    }-*/;

    /**
     * Sets the max width.
     * 
     * @param value the new max width
     */
    public final native void setMaxWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxWidth(value);
    }-*/;

    /**
     * Gets the min width.
     * 
     * @return the min width
     */
    public final native double getMinWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminWidth();
    }-*/;

    /**
     * Sets the min width.
     * 
     * @param value the new min width
     */
    public final native void setMinWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminWidth(value);
    }-*/;

    /**
     * Gets the percent width.
     * 
     * @return the percent width
     */
    public final native double getPercentWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpercentWidth();
    }-*/;

    /**
     * Sets the percent width.
     * 
     * @param value the new percent width
     */
    public final native void setPercentWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpercentWidth(value);
    }-*/;

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public final native double getWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Sets the width.
     * 
     * @param value the new width
     */
    public final native void setWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwidth(value);
    }-*/;

    /**
     * Sets the actual width.
     * 
     * @param value the new actual width
     */
    public final native void setActualWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setActualWidth(value);
    }-*/;

}
